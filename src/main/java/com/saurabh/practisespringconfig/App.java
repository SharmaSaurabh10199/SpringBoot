package com.saurabh.practisespringconfig;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    @Autowired
    static Bike bike;

    public static void main(String[] args) {
        bike.run();
    }

}
