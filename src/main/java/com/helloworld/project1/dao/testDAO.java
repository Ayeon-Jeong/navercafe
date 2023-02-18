package com.helloworld.project1.dao;

import com.helloworld.project1.vo.testVO;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
public interface testDAO {
    public List<testVO> getTest();
}
