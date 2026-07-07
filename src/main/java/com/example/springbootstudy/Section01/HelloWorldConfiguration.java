package com.example.springbootstudy.Section01;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


// 레코드는 JDK 16에서 추가된 새로운 기능
// 레코드를 만들면 게터와 세터를 만들필요가 없이 자동생서오딘다
record Person(String name, int age) {};
record Address(String firstLine, String city){};

@Configuration // 설정클래스 정의
public class HelloWorldConfiguration {

    // Bean 호출
    @Bean
    public String name(){
        return "Ranga";
    }

    @Bean
    public int age(){
        return 15;
    }

    @Bean
    public Person person(){
        return new Person("Ravi", 20);
    }

    @Bean
    public Address address(){
        return new Address("경기도", "평택");
    }







}
