package com.sunforits.jiaocaizhengding.service;

import com.sunforits.jiaocaizhengding.entity.BookChaXun;
import com.sunforits.jiaocaizhengding.entity.TeacherChaXun;

import java.util.List;

/**
 * @date 2020/5/18-12:47
 */
public interface schoolService {

    public List<BookChaXun> bookFind();

    public List<TeacherChaXun> teacherFind();
}