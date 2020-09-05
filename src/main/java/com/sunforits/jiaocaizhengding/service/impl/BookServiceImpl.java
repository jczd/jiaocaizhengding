package com.sunforits.jiaocaizhengding.service.impl;

import com.sunforits.jiaocaizhengding.dao.BookDao;
import com.sunforits.jiaocaizhengding.entity.Book;
import com.sunforits.jiaocaizhengding.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.UUID;

/**
 * @date 2020/5/11-12:31
 */
@Service("bookService")
public class BookServiceImpl implements BookService {

    @Autowired
    BookDao bookDao;

    @Override
    public Book findOne(String name) {
        return null;
    }

    @Override
    public List<Book> findAll() {
        List<Book> all = bookDao.findAll();
        return all;
    }

    @Override
    public void saveBook(Book book) {
        if (book.getBid() == null || book.getBid().equals("")) { // 设置bid
            book.setBid(UUID.randomUUID().toString());
        }
        bookDao.saveBook(book);
    }

    @Override
    public void deleteBook(Book bid) {
        bookDao.deleteBook(bid);
    }

    @Override
    public void updateBook(Book book) {
        bookDao.updateBook(book);
    }
}
