package com.navercafe.project1.service;

import com.navercafe.project1.dao.testDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class testService {

    final testDAO dao;

    public List<testDAO> getDao(){
        return dao.getTest();
    }

}
