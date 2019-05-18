package com.hy.v1.servlet;

import com.hy.framework.annotation.HYAutoWired;
import com.hy.framework.annotation.HYController;
import com.hy.framework.annotation.HYRequestMapping;
import com.hy.framework.annotation.HYService;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.*;

/**
 * Created by Administrator on 2019/4/22.
 */
public class HYDispatchServlet extends HttpServlet {
    private Map<String, Object> iocMap = new HashMap<>();
    private Map<String, Object> handlerMap = new HashMap<>();
    private List<String> classNames = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String requestURI = req.getRequestURI();
        String contentPath = req.getContextPath();
        String url = requestURI.replace(contentPath, "").replace("/+", "/");

        if (!handlerMap.containsKey(url)) {
            resp.getWriter().write("404 error");
            return;
        }
        Method method = (Method) handlerMap.get(url);
        Map<String, String[]> param = req.getParameterMap();
        try {
            method.invoke(iocMap.get(method.getDeclaringClass().getName()),new Object[]{req, resp, param.get("name")[0]});
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        InputStream is;
        Properties properties = new Properties();
        try {
            //load
            is = this.getClass().getClassLoader().getResourceAsStream(config.getInitParameter("contextConfigLocation"));
            properties.load(is);
            String scanPath = properties.getProperty("scanpath");
            //scan
            doScan(scanPath);
            //register
            doRegister();
            //doDependence
            doDependence();
            //doInitMapping
            doInitMapping();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void doDependence() {
        try {
            for(Object o : iocMap.values()) {
                Class clz = o.getClass();
                if (clz.isAnnotationPresent(HYController.class)) {
                    Field[] fields = clz.getDeclaredFields();
                    for (Field field : fields) {
                        if (field.isAnnotationPresent(HYAutoWired.class)) {
                            String beanName = field.getAnnotation(HYAutoWired.class).value();
                            if (beanName.equals("")) {
                                beanName = field.getName();
                            }
                            field.set(o, iocMap.get(beanName));
                        }
                    }
                }
            }
        }catch ( Exception e) {
            e.printStackTrace();
        }
    }


    private void doInitMapping() {
        for (Object o : iocMap.values()) {
            Class clazz = o.getClass();
            if (clazz.isAnnotationPresent(HYController.class)) {
                String baseUrl = "";
                if (clazz.isAnnotationPresent(HYRequestMapping.class)) {
                    HYRequestMapping hyRequestMapping = (HYRequestMapping) clazz.getAnnotation(HYRequestMapping.class);
                    baseUrl = hyRequestMapping.value();
                }

                Method[] methods = clazz.getMethods();
                for (Method method : methods) {
                    if (method.isAnnotationPresent(HYRequestMapping.class)) {
                        HYRequestMapping annotation = method.getAnnotation(HYRequestMapping.class);
                        String url = (baseUrl + "/" + annotation.value()).replace("/+", "/");
                        handlerMap.put(url, method);
                    }
                }
            }
        }

    }

    private void doRegister() {
        if (classNames.isEmpty()) {return;}
        try {
            for (String className : classNames) {
                Class clazz = Class.forName(className);
                Object instance = clazz.newInstance();
                if (clazz.isAnnotationPresent(HYController.class)) {
                    iocMap.put(className, instance);
                }else if (clazz.isAnnotationPresent(HYService.class)) {
                    HYService hyservice = (HYService) clazz.getAnnotation(HYService.class);
                    String beanName = hyservice.value();
                    if (beanName.equals("")) {
                        beanName = clazz.getName();
                    }
                    iocMap.put(className, instance);
                    if (clazz.isInterface()) {
                        Class[] interfaces = clazz.getInterfaces();
                        for (Class type : interfaces) {
                            iocMap.put(type.getName(), instance);
                        }
                    }
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void doScan(String packagePath) {
        URL url = this.getClass().getClassLoader().getResource("/" + packagePath.replace("\\.", "/"));
        System.out.println();
        File file = new File(url.getFile());
        for (File f : file.listFiles()) {
            if (f.isDirectory()) {
                doScan(packagePath + "." + f.getName());
            }else {
                String className = packagePath + "." + file.getName().replace(".class", "");
                if (!classNames.contains(className)) {
                    classNames.add(className);
                }
            }
        }
    }
}
