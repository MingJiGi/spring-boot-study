package com.example.springbootstudy.Section01;


import org.springframework.stereotype.Component;

@Component
public class PacMenGame implements GamingConsole{

    @Override
    public void up() {
        System.out.println("PacMen Up");
    }

    @Override
    public void down() {
        System.out.println("PacMen dwon");

    }

    @Override
    public void left() {
        System.out.println("PacMen left");

    }

    @Override
    public void right() {
        System.out.println("PacMen right");

    }
}
