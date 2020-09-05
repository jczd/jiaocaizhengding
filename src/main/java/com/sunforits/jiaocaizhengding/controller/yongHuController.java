package com.sunforits.jiaocaizhengding.controller;

import com.sunforits.jiaocaizhengding.entity.YongHu;
import com.sunforits.jiaocaizhengding.service.YongHuService;
import org.springframework.beans.factory.annotation.Autowired;

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

        YongHu p = yongHuService.DengLu(yongHu.getNumber());
        System.out.println(p);

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
    public Map<String, Object> saveTeacher(YongHu yongHu) {
        map.clear();
        System.out.println(yongHu);

        try {

            yongHuService.saveYongHu(yongHu);
            map.put("code", 1);
        } catch (Exception e) {
            map.put("code", 2);
        }

        return map;
    }

    // 查询出所有用户
    @RequestMapping("/findAll")
    public Map<String, Object> findAll() {
        map.clear();

        List<YongHu> list = null;
        try {
            list = yongHuService.findAll();
            map.put("code", 1);
            map.put("yonghulist", list);
        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println(map);
        return map;
    }

    // 修改用户信息
    @RequestMapping("/updateyonghu")
    public Map<String, Object> yonghuupdate(YongHu yongHu) {
        map.clear();
        System.out.println(yongHu);
        System.out.println(String.valueOf(yongHu.getUid()).length());

        try {
            yongHuService.updateUser(yongHu);
            map.put("code", 1);
        } catch (Exception e) {
            map.put("code", 2);
        }

        return map;
    }

    //删除用户
    @RequestMapping("/yonghudelete")
    public Map<String, Object> yonghudelete(int uid) {
        map.clear();
        System.out.println(uid);

        try {
            yongHuService.deleteUser(uid);
            map.put("code", 1);
        } catch (Exception e) {
            map.put("code", 2);
        }

        //return all;
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
