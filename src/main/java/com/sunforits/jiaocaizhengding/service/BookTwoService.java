package com.sunforits.jiaocaizhengding.service;

import com.sunforits.jiaocaizhengding.domain.BookTwo;


import java.util.List;

/**
 * @date 2020/5/11-16:07
 */
public interface BookTwoService {

    public BookTwo findOneT(String name);

    public List<BookTwo> findAll();

    public void saveBookTwo(BookTwo book);

    public void deleteBookTwo(String name);
}
