package com.kaoqin.controller;

import com.kaoqin.mapper.TeacherMapper;
import com.kaoqin.mapper.CourseMapper;
import com.kaoqin.mapper.TestMapper;
import com.kaoqin.pojo.Teacher;
import com.kaoqin.pojo.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller
public class CourseController {
    @Autowired
    CourseMapper courseMapper;

    @GetMapping("/test1")
    @ResponseBody
    public List<Course> cou(){
        return courseMapper.qurryCourse(1);
    }
}
