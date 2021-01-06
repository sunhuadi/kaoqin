package com.kaoqin.mapper;

import com.kaoqin.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface StudentMapper {
    Student qurryByusername(String username);
}
