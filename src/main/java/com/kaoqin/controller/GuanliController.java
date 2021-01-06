package com.kaoqin.controller;

import com.kaoqin.mapper.GuanliMapper;
import com.kaoqin.mapper.CourseMapper;
import com.kaoqin.mapper.KaoqinMapper;
import com.kaoqin.mapper.TestMapper;
import com.kaoqin.pojo.Course;
import com.kaoqin.pojo.Teacher;
import com.kaoqin.pojo.Kaoqin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller

public class GuanliController {
    @Autowired
    GuanliMapper guanliMapper;

    @GetMapping("/guanli")
    @ResponseBody
    public List<Kaoqin> check(){
        return guanliMapper.qurryGuanli();
    }
}
