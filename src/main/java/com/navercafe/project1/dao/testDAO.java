package com.navercafe.project1.dao;

import com.navercafe.project1.vo.testVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface testDAO {
    List<testVO> getTest();
}
