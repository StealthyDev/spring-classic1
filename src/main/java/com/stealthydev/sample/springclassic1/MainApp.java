package com.stealthydev.sample.springclassic1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Bean bean = (Bean) context.getBean("bean");

        System.out.println(bean.getAttribute());
    }
}
