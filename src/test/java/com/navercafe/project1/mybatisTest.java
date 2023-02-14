package com.navercafe.project1;

import com.navercafe.project1.dao.testDAO;
import com.navercafe.project1.service.testService;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@RequiredArgsConstructor
@SpringBootTest
public class mybatisTest {

    testService service;

    @Test
    public void test(){
        System.out.println(service.getDao());
    }
}
