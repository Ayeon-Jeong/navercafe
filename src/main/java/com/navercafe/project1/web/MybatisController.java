package com.navercafe.project1.web;


import com.navercafe.project1.dao.testDAO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@RequiredArgsConstructor
public class MybatisController {

    testDAO testDAO;

}
