package com.example.springbootstudy.Section01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HellowWorldSpringJava {
    public static void main(String[] args) {


        // 스프링 컨텍스트로 실행
        var context =  new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        // Spring 이 관리하는 Bean 검색
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address"));



    }
}
