package kr.ac.osan.springbootstudy.service;

import kr.ac.osan.springbootstudy.domain.Member;
import kr.ac.osan.springbootstudy.repository.MemberRepository;
import kr.ac.osan.springbootstudy.repository.MemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;


@SpringBootTest
@Transactional
class MemberServiceintegrationTest {

    @Autowired MemberService memberService;
    @Autowired MemberRepository memberRepository;


    @Test
     void join() {
        //given
        Member member = new Member();

        member.setName("hello");

        //when
        Long saveId = memberService.join(member);
        //then

        Member findeMember = memberService.findOne(saveId).get();
        Assertions.assertThat(member.getName()).isEqualTo(findeMember.getName());

    }
    @Test
    public void 증복_회원_예외(){
        Member member1 = new Member();
        member1.setName("Spring");

        Member member2 = new Member();
        member2.setName("Spring");

        memberService.join(member2);

        IllegalStateException e = assertThrows(IllegalStateException.class,
                () -> memberService.join(member2));

        assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");

    }


}