package com.kaoqin.controller;
import com.kaoqin.mapper.StudentMapper;
import com.kaoqin.mapper.TeacherMapper;
import com.kaoqin.pojo.Student;
import com.kaoqin.pojo.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpSession;
import java.util.HashMap;


@Controller
public class LoginController {
    @Autowired
    StudentMapper studentMapper;
    @Autowired
    TeacherMapper teacherMapper;
    @ResponseBody
    @PostMapping("/logins")
    public HashMap<String, String> Test(@RequestBody HashMap<String, String> user, HttpSession session) {
        HashMap<String, String> mp = new HashMap<String, String>();
        System.out.println("执行登陆控制！");
        String username = user.get("username");
        String password = user.get("password");
        Student student=studentMapper.qurryByusername(username);
        if(student!=null)
        {
            System.out.println(student.getPassword());
            System.out.println(password);
            if(student.getPassword().equals(password))
            {
                mp.put("code","1");
                mp.put("role","student");
                mp.put("msg","登陆成功！");
                session.setAttribute("id",student.getId());
            }else {
                mp.put("code","0");
                mp.put("role","student");
                mp.put("msg","密码错误！");
            }
        }
        else {
            Teacher teacher=teacherMapper.qurryTeacherByUsername(username);
            if(teacher==null){
                mp.put("code","3");
                mp.put("role",null);
                mp.put("msg","用户不存在！");
            }
            else if(teacher.getPassword()==password){
                mp.put("code","1");
                mp.put("role","teacher");
                mp.put("msg","登陆成功！");
                session.setAttribute("id",teacher.getId());
            }
            else {
                mp.put("code","0");
                mp.put("role","teacher");
                mp.put("msg","密码错误！");
            }
        }

        return mp;

    }
}
