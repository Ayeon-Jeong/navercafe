package com.helloworld.project1.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class testServiceTest {

    @Autowired
    testService service;

    @Test
    public void testService() {
        System.out.println(service.getDao());
    }
}
