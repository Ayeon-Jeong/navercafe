package com.helloworld.project1;

import com.helloworld.project1.domain.member.Member;
import com.helloworld.project1.domain.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class TestDataInit {

    private final MemberRepository memberRepository;

    @PostConstruct
    public void init(){
        Member member = new Member();
        member.setName("hello");
        member.setLoginId("1234");
        member.setPassword("password");

        memberRepository.save(member);

    }
}
