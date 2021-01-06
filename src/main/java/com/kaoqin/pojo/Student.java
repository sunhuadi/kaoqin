package com.kaoqin.pojo;

import lombok.Data;

@Data
public class Student {
    int id;
    String stuNo;
    String stuName;
    String stuClass;
    String sex;
    String password;
    String lateTimes;
    String leaveTimes;
    String missTimes;
}
