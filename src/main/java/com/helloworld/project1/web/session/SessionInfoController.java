package com.helloworld.project1.web.session;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

@Controller
@Slf4j
public class SessionInfoController {

//    @GetMapping("/session-info")
//    public String sessionInfo(HttpServletRequest request){
//        HttpSession session = request.getSession(false);
//        if(session == null){
//            return "세션이 없습니다";
//        }
//
//        // 세션 데이터 출력
//        session.getAttributeNames().asIterator()
//                .forEachRemaining(name -> log.info("name = {}, value = {}", name, session.getAttribute(name)));
//
//
//    }
}
