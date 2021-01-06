package com.kaoqin.pojo;

import lombok.Data;

@Data
public class Course {
    int id;
    String courseName;
    String teacher;
    Data time;//时间类有问题
    String stuClass;
    String room;
}
