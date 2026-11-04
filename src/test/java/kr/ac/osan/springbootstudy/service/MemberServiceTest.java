package kr.ac.osan.springbootstudy.service;

import kr.ac.osan.springbootstudy.domain.Member;
import kr.ac.osan.springbootstudy.repository.MemberRepository;
import kr.ac.osan.springbootstudy.repository.MemoryMemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {

    MemberService memberService;
    MemoryMemberRepository memberRepository = new MemoryMemberRepository();

    @BeforeEach
    public void beforeEach(){
        memberRepository = new MemoryMemberRepository();
        memberService = new MemberService();
    }

    @AfterAll
    public void afterEach(){
        memberRepository.clearStore();
    }

    @Test
     void join() {
        //given
        Member member = new Member();

        member.setName("hello");

        //when
        Long saveId = memberService.join(member);
        //then

        Member findeMember = memberService.findOne(saveId).get();
        Assertions.assertThat(member.getId()).isEqualTo(findeMember.getName());

    }
    @Test
    public void 증복_회원_예외(){
        Member member1 = new Member();
        member1.setName("Spring");

        Member member2 = new Member();
        member2.setName("Spring");

        memberService.join(member1);
        IllegalAccessError illegalAccessError = assertThrows(IllegalAccessError.class, () -> memberService.join(member2));

        assertThat(illegalAccessError.getMessage()).isEqualTo("이미 존재하는 회원입니다.");

    }

    @Test
    void findMembers() {
    }

    @Test
    void findOne() {
    }
}