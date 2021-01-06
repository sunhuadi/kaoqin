package com.kaoqin.mapper;

import com.kaoqin.pojo.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TeacherMapper {

    //List<Teacher> qurryTea();
    Teacher qurryTeacherByUsername(String username);
}
