package com.sunforits.jiaocaizhengding.controller;

import com.sunforits.jiaocaizhengding.entity.Teacher;
import com.sunforits.jiaocaizhengding.entity.YongHu;
import com.sunforits.jiaocaizhengding.service.TeacherService;
import com.sunforits.jiaocaizhengding.service.YongHuService;
import org.springframework.beans.factory.annotation.Autowired;
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

        YongHu p = yongHuService.DengLu(yongHu.getName());

        if (p.getPassword().equals(yongHu.getPassword())) {
            map.put("user", p);
            map.put("code", 1);
        } else {
            map.put("code", 2);
        }
        System.out.println(map);
        return map;
    }

    /*
     * 注册案例,如果是老师，把老师表注册了
     * */
    @RequestMapping("/saveYonghur")
    public Map<String, Object> saveTeacher( YongHu yongHu) {
        map.clear();
        System.out.println(yongHu);

        try {
            if (yongHu.getShenfen().equals("老师")) {
                Teacher teacher = new Teacher();
                teacher.setName(yongHu.getName());
                teacher.setXueyuan(yongHu.getXueyuan());
                teacherService.saveTeacher(teacher);
            }
            yongHuService.saveYongHu(yongHu);
            map.put("code", 1);
        } catch (Exception e) {
            map.put("code", 2);
        }
        return map;
    }

    @RequestMapping("/findAll")
    public Map<String, Object> findAll() {
        map.clear();

        List<YongHu> list = yongHuService.findAll();
        System.out.println(list);

        map.put("list", list);
        System.out.println(map);
        return map;
    }

    @RequestMapping("/findByNP")
    public Map<String, Object> findByNP(YongHu yongHu) {
        System.out.println(yongHu);

        YongHu byNP = null;
        try {
            byNP = yongHuService.findByNP(yongHu);
            map.put("code", 1);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("code", 2);
        }

        System.out.println(byNP);
        return map;
    }


}
