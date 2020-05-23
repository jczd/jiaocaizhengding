package com.sunforits.jiaocaizhengding.controller;


import com.sunforits.jiaocaizhengding.entity.*;
import com.sunforits.jiaocaizhengding.service.BookService;
import com.sunforits.jiaocaizhengding.service.TeacherService;
import com.sunforits.jiaocaizhengding.service.YongHuService;
import com.sunforits.jiaocaizhengding.service.schoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @date 2020/5/18-11:05
 */
/*
 * 学校兼管理员，可查看书店发布的表(book)，
 *              可增删改查用户表(yonghu)，
 *              以及根据老师名字查看所有书表(teacher 左外连接allbook)，
 *              根据书名查看所有书表(book左外连接allbook)
 *
 * */
@RestController
@RequestMapping("/school")
public class schoolController {

    @Autowired
    private BookService bookService;
    @Autowired
    private YongHuService yongHuService;
    @Autowired
    private TeacherService teacherService;
    @Autowired
    private schoolService schoolService;

    Map<String, Object> map = new HashMap<>();

    /*
     * 查看书店发布的表book
     * */
    @RequestMapping("/store")
    public Map<String, Object> findstore() {
        map.clear();

        List<Book> all = null;
        try {
            all = bookService.findAll();
            map.put("code", 1);
            map.put("storelist", all);
        } catch (Exception e) {
            map.put("code", 2);
        }
        System.out.println(map);
        return map;
    }

    //查看所有用户
    @RequestMapping("/yonghufindall")
    public Map<String, Object> yonghufindall() {
        map.clear();

        List<YongHu> all = null;
        try {
            all = yongHuService.findAll();
            map.put("code", 1);
            map.put("yonghulist", all);

        } catch (Exception e) {
            map.put("code", 2);
        }
        System.out.println(map);
        return map;
    }

    //删除用户
    @RequestMapping("/yonghudelete")
    public Map<String, Object> yonghudelete(int id) {
        map.clear();
        System.out.println(id);

        try {
            yongHuService.deleteUser(id);
            map.put("code", 1);
        } catch (Exception e) {
            map.put("code", 2);
        }

        //return all;
        return map;
    }

    //增加用户
    @RequestMapping("/yonghusave")
    public Map<String, Object> yonghusave(YongHu yongHu) {
        map.clear();
        System.out.println(yongHu);

        try {
            if (yongHu.getShenfen() == "teacher") {
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


    //学校根据老师名字，书籍名字，查看总表
    @RequestMapping("/teacherfind")
    public Map<String, Object> teacherfind() {
        map.clear();

        List<TeacherChaXun> teacherChaXuns = null;
        try {
            teacherChaXuns = schoolService.teacherFind();
            map.put("code", 1);
            map.put("find", teacherChaXuns);
        } catch (Exception e) {
            map.put("code", 2);
        }
        System.out.println(map);
        return map;
    }

    @RequestMapping("/bookfind")
    public Map<String, Object> bookfind() {
        map.clear();

        List<BookChaXun> bookChaXuns = null;
        try {
            bookChaXuns = schoolService.bookFind();
            map.put("code", 1);
            map.put("booklist", bookChaXuns);
        } catch (Exception e) {
            map.put("code", 2);
        }
        System.out.println(map);

        return map;
    }

}
