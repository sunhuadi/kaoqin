package com.kaoqin.mapper;

import com.kaoqin.pojo.Course;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CourseMapper {
    List<Course> qurryCourse(int id);
}
