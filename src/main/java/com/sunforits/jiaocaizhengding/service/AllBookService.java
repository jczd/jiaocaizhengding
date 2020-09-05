package com.sunforits.jiaocaizhengding.service;

import com.sunforits.jiaocaizhengding.entity.AllBook;

import java.util.List;

/**
 * @date 2020/5/17-17:13
 */
public interface AllBookService {

    public List<AllBook> allFindOne(String name);

    public List<AllBook> allFindAll();


    public void allSaveBook(AllBook allBook);

    public void allDeleteBook(String name);

    public void teacherDeleteBook(String book,String teacher);
}
