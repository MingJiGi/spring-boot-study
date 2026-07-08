package com.example.springbootstudy.Section01;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


// 레코드는 JDK 16에서 추가된 새로운 기능
// 레코드를 만들면 게터와 세터를 만들필요가 없이 자동생서오딘다
record Person(String name, int age, Address address) {};
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
        return new Person("Ravi", 20,  new Address("Main Street", "Utrecht"));
    }

    @Bean(name = "address2")
    @Primary
    public Address address(){
        return new Address("경기도", "평택");
    }

    @Bean(name = "address3")
    @Qualifier("address3qualifier")
    public Address address3(){
        return new Address("경기도", "평택");
    }


    @Bean
    public Person person2MethodCall(){
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3Parmeters(String name, int age, Address address2){
        return new Person(name, age, address2);
    }

    @Bean
    @Primary
    public Person person4Parmeters(String name, int age, Address address){
        return new Person(name, age, address);
    }
    @Bean
    @Qualifier("person5qualifier")
    public Person person5qualifier(String name, int age, Address address) {
        return new Person(name, age, address);
    }


    }
