package com.sunforits.jiaocaizhengding.service.impl;

import com.sunforits.jiaocaizhengding.dao.BookDao;
import com.sunforits.jiaocaizhengding.entity.Book;
import com.sunforits.jiaocaizhengding.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * @date 2020/5/11-12:31
 */
@Service("bookService")
public class BookServiceImpl implements BookService {

    @Autowired
    BookDao bookDao;

    @Override
    public List<Book> findAll() {
        List<Book> all = bookDao.findAll();
        return all;
    }

    @Override
    public void saveBook(Book book) {
        bookDao.saveBook(book);
    }

    @Override
    public void deleteBook(Integer bid) {
        bookDao.deleteBook(bid);
    }
}
