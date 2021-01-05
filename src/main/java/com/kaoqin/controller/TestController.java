package com.kaoqin.controller;

import com.kaoqin.mapper.TeacherMapper;
import com.kaoqin.mapper.TestMapper;
import com.kaoqin.pojo.Teacher;
import com.kaoqin.pojo.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TestController {

    @Autowired
    TestMapper testMapper;


    @GetMapping("/test")
    @ResponseBody
    public List<Test> test()
    {
        testMapper.testqurry();
        return testMapper.testqurry();
    }
    @Autowired
    TeacherMapper teacherMapper;

    @GetMapping("/testT")
    @ResponseBody
    public List<Teacher> ttt(){
        return teacherMapper.qurryTea();
    }
    @GetMapping("/")
    public String index()
    {
        return "index";
    }


}
