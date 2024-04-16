package com.spring.test;

//import com.spring.ClassPathXmlApplicationContext;

import com.spring.beans.BeanException;
import com.spring.context.ClassPathXmlApplicationContext;

public class Test1 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        AService aservice = null;
        try {
            aservice = (AService)ctx.getBean("aservice");
        } catch (BeanException e) {
            throw new RuntimeException(e);
        }
        aservice.sayHello();
    }
}
