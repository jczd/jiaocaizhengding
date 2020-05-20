package com.sunforits.jiaocaizhengding.service.impl;

import com.sunforits.jiaocaizhengding.dao.SchoolDao;
import com.sunforits.jiaocaizhengding.entity.BookChaXun;
import com.sunforits.jiaocaizhengding.entity.TeacherChaXun;
import com.sunforits.jiaocaizhengding.service.schoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @date 2020/5/18-12:48
 */

@Service("schoolservice")
public class schoolServiceImpl implements schoolService {

    @Autowired
    private SchoolDao schoolDao;

    @Override
    public List<BookChaXun> bookFind() {
        List<BookChaXun> bookfind = schoolDao.bookfind();
        return bookfind;
    }

    @Override
    public List<TeacherChaXun> teacherFind() {
        List<TeacherChaXun> teacherfind = schoolDao.teacherfind();
        return teacherfind;
    }
}
