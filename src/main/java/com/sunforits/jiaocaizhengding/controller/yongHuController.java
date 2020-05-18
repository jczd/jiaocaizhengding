package com.sunforits.jiaocaizhengding.controller;

import com.sunforits.jiaocaizhengding.dao.TeacherDao;
import com.sunforits.jiaocaizhengding.domain.Teacher;
import com.sunforits.jiaocaizhengding.domain.YongHu;
import com.sunforits.jiaocaizhengding.service.TeacherService;
import com.sunforits.jiaocaizhengding.service.YongHuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

/**
 * 用户注册登录管理
 */
@Controller
@RequestMapping("/yongHu")
public class yongHuController {

    @Autowired
    private YongHuService yongHuService;

    @Autowired
    private TeacherService teacherService;
    /**
     * 登录案例
     *
     * @return
     */
    @RequestMapping("/denglu")
    public String denglu(YongHu yongHu, Model model) {

        String s=yongHu.getName();
        YongHu p = yongHuService.DengLu(s);

        if (p.getPassword() .equals(yongHu.getPassword())) {

            model.addAttribute("shenfen",yongHu.getShenfen());
            return "userInfo";

        } else {

            return "error";
        }


    }

    /*
    * 注册案例,如果是老师，把老师表注册了
    * */
    @RequestMapping("/saveYonghur")
    public String saveTeacher(YongHu yongHu) {

        if(yongHu.getShenfen()=="teacher")
        {
            Teacher teacher = new Teacher();
            teacher.setName(yongHu.getName());
            teacher.setXueyuan(yongHu.getXueyuan());
            teacherService.saveTeacher(teacher);
        }

        yongHuService.saveYongHu(yongHu);
        return "userInfo";
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
