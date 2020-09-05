package com.sunforits.jiaocaizhengding.service.impl;

import com.sunforits.jiaocaizhengding.dao.SchoolDao;
import com.sunforits.jiaocaizhengding.entity.Book;
import com.sunforits.jiaocaizhengding.entity.YongHu;
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
    public List<Book> bookFind() {
        List<Book> bookfind = schoolDao.bookfind();
        return bookfind;
    }

    @Override
    public List<YongHu> teacherFind() {
        List<YongHu> teacherfind = schoolDao.teacherfind();
        return teacherfind;
    }
}
