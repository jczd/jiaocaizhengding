package com.sunforits.jiaocaizhengding.service;

import com.sunforits.jiaocaizhengding.entity.Book;

import java.util.List;

/**
 * @date 2020/5/11-12:27
 */
public interface BookService {

    public Book findOne(String name);

    public List<Book> findAll();

    public void saveBook(Book book);

    public void deleteBook(Integer bid);
}
