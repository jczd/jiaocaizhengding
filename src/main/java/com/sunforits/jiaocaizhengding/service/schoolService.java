package com.sunforits.jiaocaizhengding.service;

import com.sunforits.jiaocaizhengding.entity.Book;
import com.sunforits.jiaocaizhengding.entity.YongHu;

import java.util.List;

/**
 * @date 2020/5/18-12:47
 */
public interface schoolService {

    public List<Book> bookFind();

    public List<YongHu> teacherFind();
}
