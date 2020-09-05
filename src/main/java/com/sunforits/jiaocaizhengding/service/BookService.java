package com.sunforits.jiaocaizhengding.service;

import com.sunforits.jiaocaizhengding.entity.Book;

import java.util.List;

/**
 * @date 2020/5/11-12:27
 */
public interface BookService {

    List<Book> findAll();

    void saveBook(Book book);

    void deleteBook(Integer bid);
}
