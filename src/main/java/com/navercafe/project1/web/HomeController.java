package com.navercafe.project1.web;

import com.navercafe.project1.domain.member.Member;
import com.navercafe.project1.domain.member.MemberRepository;
import com.navercafe.project1.session.SessionConst;
import com.navercafe.project1.vo.HelloData;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
@Slf4j
@RequestMapping("/")
@RequiredArgsConstructor
public class HomeController {

    private final MemberRepository memberRepository;
    public String loginHome(@CookieValue(name="memberId", required = false) Long memberId, Model model ){

        if(memberId == null){
            return "home";
        }
        Member loginMember = memberRepository.findById(memberId);
        if(loginMember == null){
            return "home";
        }

        model.addAttribute("member", loginMember);
        return "loginHome";

    }
//    @GetMapping
    public String loginHomeV3(HttpServletRequest request, Model model ){

        HttpSession session = request.getSession(false);
        if(session == null){
            return "home";
        }

        Member loginMember = (Member)session.getAttribute(SessionConst.LOGIN_MEMBER);


        if(loginMember == null){
            return "home";
        }

        if(loginMember == null){
            return "home";
        }

        model.addAttribute("member", loginMember);
        return "loginHome";

    }

    @GetMapping
    public String loginV4(@SessionAttribute(name = SessionConst.LOGIN_MEMBER, required = false) Member loginMember, Model model){
        if(loginMember == null){
            return "home";
        }

        model.addAttribute("member", loginMember);
        return "loginHome";
    }

    @ResponseBody
    @GetMapping("request-param-v4")
    public String requestParamV4(@RequestParam String memberName,
                                 @RequestParam int memberAge){
        log.info("username = {}, age = {}", memberName, memberAge);
        return "ok";

    }

    @ResponseBody
    @GetMapping("request-param-v5")
    public String requestParamV5(@RequestParam(required = true, defaultValue = "guest") String memberName,
                                 @RequestParam(required = false, defaultValue = "-1") Integer memberAge){
        log.info("username = {}, age = {}", memberName, memberAge);
        return "ok";

    }

    @ResponseBody
    @GetMapping("request-param-map")
    public String requestParamMap(@RequestParam Map<String, Object> paramMap){
        log.info("username = {}, age = {}", paramMap.get("username"), paramMap.get("age"));
        return "ok";

    }

    @ResponseBody
    @GetMapping("model-attribute-v1")
    public String modelAttributeV1(HelloData helloData){
        log.info("HelloData = {}", helloData);

        return "ok";
    }

}
