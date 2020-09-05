/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.escuelaing.sparkd.SparkD.micro;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mjbc_
 */
public class MicroS {
    
    private Map<String, Method> beans = new HashMap<>();
    
    public void start(String[] args) throws Exception {
        int mapped = 0;
        for (Method m : Class.forName(args[0]).getMethods()) {
            System.out.println("Revisando: " + m.getName());
            if (m.isAnnotationPresent(RequestMapping.class)) {
                System.out.println("Si está anotado con @RequestMapping");
                try {
                    RequestMapping r = m.getAnnotation(RequestMapping.class);
                    beans.put(r.value(), m);
                    mapped++;
                } catch (Throwable ex) {
                    System.out.printf("Test %s failed: %s %n", m, ex.getCause());
                }
            }
        }
    }

    public String invoke(String path) {
        try {
            return beans.get(path).invoke(null).toString();
        } catch (InvocationTargetException ex) {
            Logger.getLogger(MicroS.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(MicroS.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(MicroS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Error ";
    }
}