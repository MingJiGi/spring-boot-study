package com.example.springbootstudy.Section01_1;

import com.example.springbootstudy.Section01.GameRunner;
import com.example.springbootstudy.Section01.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.springbootstudy.Section01.GameRunner;
import com.example.springbootstudy.Section01.GamingConsole;
import com.example.springbootstudy.Section01.PacMenGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration
@ComponentScan("com.example.springbootstudy.Section01")
public class App03GamingSpringBeans {


    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(App03GamingSpringBeans.class) ) {
            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();
        }

    }


}
