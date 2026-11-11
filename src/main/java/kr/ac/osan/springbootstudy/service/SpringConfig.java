package kr.ac.osan.springbootstudy.service;

import kr.ac.osan.springbootstudy.repository.JdbcMemberRepository;
import kr.ac.osan.springbootstudy.repository.MemberRepository;
import kr.ac.osan.springbootstudy.repository.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import javax.xml.crypto.Data;

@Configuration
public class SpringConfig {

    private final DataSource dataSource;

    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }


    @Bean
    public MemberRepository memberRepository(){
//        return new MemoryMemberRepository();
        return new JdbcMemberRepository(dataSource);

    }



}
