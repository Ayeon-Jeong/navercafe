package com.navercafe.project1.domain.login;

import com.navercafe.project1.domain.member.Member;
import com.navercafe.project1.domain.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final MemberRepository memberRepository;

    /**
     *
     * @return null 이면 로그인 실패
     */
    public Member login(String loginId, String password){
        return memberRepository.findByLoginId(loginId)
                .filter(member1 -> member1.getPassword().equals(password))
                .orElse(null);
    }
}
