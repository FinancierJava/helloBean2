package org.example.vebinarcrud;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloBean helloBean = context.getBean(HelloBean.class);

        System.out.println(helloBean.getMessage());

        context.close();
    }
}