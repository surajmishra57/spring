package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        System.out.println(applicationContext);
    }
}