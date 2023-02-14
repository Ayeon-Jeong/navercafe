package com.navercafe.project1.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface testDAO {
    List<testDAO> getTest();
}
