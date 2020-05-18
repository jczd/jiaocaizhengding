package com.sunforits.jiaocaizhengding.controller;


import com.sunforits.jiaocaizhengding.domain.*;
import com.sunforits.jiaocaizhengding.service.BookService;
import com.sunforits.jiaocaizhengding.service.TeacherService;
import com.sunforits.jiaocaizhengding.service.YongHuService;
import com.sunforits.jiaocaizhengding.service.schoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

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
@Controller
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

    /*
     * 查看书店发布的表book
     * */
    @RequestMapping("/store")
    public List<Book> findstore() {
        List<Book> all = bookService.findAll();
        for (Book a : all) {
            System.out.println(a);
        }
        return all;
    }

    //查看所有用户
    @RequestMapping("/yonghufindall")
    public List<YongHu> yonghufindall() {
        List<YongHu> all = yongHuService.findAll();
        for (YongHu a : all) {
            System.out.println(a);
        }
        return all;
    }

    //删除用户
    @RequestMapping("/yonghudelete")
    public void yonghudelete(int id) {
        yongHuService.deleteUser(id);

        //return all;
    }

    //增加用户
    @RequestMapping("/yonghusave")
    public void yonghusave(YongHu yongHu) {

        if (yongHu.getShenfen() == "teacher") {
            Teacher teacher = new Teacher();
            teacher.setName(yongHu.getName());
            teacher.setXueyuan(yongHu.getXueyuan());
            teacherService.saveTeacher(teacher);
        }

        yongHuService.saveYongHu(yongHu);
    }


    //学校根据老师名字，书籍名字，查看总表
    @RequestMapping("/teacherfind")
    public void teacherfind() {
        List<TeacherChaXun> teacherChaXuns = schoolService.teacherFind();
        for (TeacherChaXun a:teacherChaXuns){
            System.out.println(a);
        }
    }

    @RequestMapping("/bookfind")
    public void bookfind() {
        List<BookChaXun> bookChaXuns = schoolService.bookFind();
        for (BookChaXun a:bookChaXuns){
            System.out.println(a);
        }


    }

}
