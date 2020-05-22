package com.sunforits.jiaocaizhengding.controller;

import com.sunforits.jiaocaizhengding.entity.Teacher;
import com.sunforits.jiaocaizhengding.entity.YongHu;
import com.sunforits.jiaocaizhengding.service.TeacherService;
import com.sunforits.jiaocaizhengding.service.YongHuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用户注册登录管理
 */
@RestController
@RequestMapping("/yongHu")
public class yongHuController {

    @Autowired
    private YongHuService yongHuService;

    @Autowired
    private TeacherService teacherService;

    Map<String, Object> map = new HashMap<>();

    /**
     * 登录案例
     *
     * @return
     */
    @RequestMapping("/denglu")
    public Map<String, Object> denglu(YongHu yongHu) {
        map.clear();
        System.out.println(yongHu);

        String s = yongHu.getName();
        YongHu p = yongHuService.DengLu(s);

        System.out.println(p);

        if (p.getPassword().equals(yongHu.getPassword())) {
            map.put("user", p);
            map.put("code", 1);
        } else {
            map.put("code", 2);
        }
        return map;
    }

    /*
     * 注册案例,如果是老师，把老师表注册了
     * */
    @RequestMapping("/saveYonghur")
    public Map<String, Object> saveTeacher(@RequestBody YongHu yongHu) {
        map.clear();
        System.out.println(yongHu);

        if (yongHu.getShenfen() == "teacher") {
            Teacher teacher = new Teacher();
            teacher.setName(yongHu.getName());
            teacher.setXueyuan(yongHu.getXueyuan());
            teacherService.saveTeacher(teacher);
        }

        yongHuService.saveYongHu(yongHu);
        return map;
    }

    @RequestMapping("/findAll")
    public String findAll() {
        List<YongHu> list = yongHuService.findAll();
        for (YongHu a : list) {
            System.out.println(a);
        }
        return "userInfo";
    }

    @RequestMapping("/findByNP")
    public String findByNP(YongHu yongHu) {

        yongHuService.findByNP(yongHu);
        System.out.println(yongHu);
        return "userInfo";
    }


}
