package com.navercafe.project1;

import com.navercafe.project1.service.testService;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;


@RequiredArgsConstructor
@SpringBootTest
@WebAppConfiguration
public class mybatisTest {

    @Autowired
    private testService service;

    @Test
    public void test(){
        service.print();
        System.out.println(service.getDao());
    }
}
