package com.helloworld.project1;

import com.helloworld.project1.service.testService;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;


@RequiredArgsConstructor
@SpringBootTest
public class mybatisTest {

    testService service;

    @Test
    public void test(){
        System.out.println(service.getDao());
    }
}
