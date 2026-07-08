package com.example.springbootstudy.Section01;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@Configuration
public class GamingConfiguration {

    @Primary
    @Bean
    public GamingConsole game (){
        var game = new PacMenGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game){
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }




}
