package com.navercafe.project1.service;

import com.navercafe.project1.dao.testDAO;
import com.navercafe.project1.vo.testVO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class testService {

    testDAO dao;

    public void print(){
        System.out.println("Hello");
    }
    public List<testVO> getDao(){
        return dao.getTest();
    }

}
