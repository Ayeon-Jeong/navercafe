package com.helloworld.project1.service;

import com.helloworld.project1.dao.testDAO;
import com.helloworld.project1.vo.testVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class testService {

    private final testDAO dao;
    public List<testVO> getDao(){
        return dao.getTest();
    }


}
