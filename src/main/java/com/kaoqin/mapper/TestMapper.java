package com.kaoqin.mapper;

import com.kaoqin.pojo.Student;
import com.kaoqin.pojo.Test;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TestMapper {

    List<Test> testqurry();
}
