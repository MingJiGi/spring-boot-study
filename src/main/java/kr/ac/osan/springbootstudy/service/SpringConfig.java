package kr.ac.osan.springbootstudy.service;

import kr.ac.osan.springbootstudy.repository.MemberRepository;
import kr.ac.osan.springbootstudy.repository.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {


    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }


    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }



}
