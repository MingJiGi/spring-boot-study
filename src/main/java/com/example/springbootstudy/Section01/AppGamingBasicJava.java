package com.example.springbootstudy.Section01;

public class AppGamingBasicJava {
    public static void main(String[] args) {

//        var game = new MarioGame();
//        var game = new SuperContraGame();

        var game = new PacMenGame();

        var gameRunner = new GameRunner(game);

        gameRunner.run();


    }
}
