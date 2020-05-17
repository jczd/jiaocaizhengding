package com.sunforits.jiaocaizhengding.service.impl;

import com.sunforits.jiaocaizhengding.dao.BookTwoDao;
import com.sunforits.jiaocaizhengding.domain.BookTwo;
import com.sunforits.jiaocaizhengding.service.BookTwoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * @date 2020/5/11-16:09
 */
@Service("bookTwo")
public class BookTwoServiceImpl implements BookTwoService {

    @Autowired
    BookTwoDao bookTwoDao;
    @Override
    public BookTwo findOneT(String name) {
        BookTwo oneT = bookTwoDao.findOneT(name);
        return oneT;
    }

    @Override
    public List<BookTwo> findAll() {
        List<BookTwo> all = bookTwoDao.findAll();
        return all;
    }

    @Override
    public void saveBookTwo(BookTwo book) {
        bookTwoDao.saveBookTwo(book);

    }

    @Override
    public void deleteBookTwo(String name) {
        bookTwoDao.deleteBookTwo(name);
    }
}
