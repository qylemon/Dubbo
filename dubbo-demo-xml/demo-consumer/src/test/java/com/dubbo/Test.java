package com.dubbo;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * @Author: Qy
 * @Date: 2019-04-01 18:29
 */
public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "classpath:springmvc.xml" });

        context.start();
        DemoService demo = (DemoService)context.getBean("demoService");

        System.out.println(demo.sayHello("aaa"));
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
