package com.sunforits.jiaocaizhengding.service;

import com.sunforits.jiaocaizhengding.entity.AllBook;

import java.util.List;

/**
 * @date 2020/5/17-17:13
 */
public interface AllBookService {

     List<AllBook> allFindOne(String uid);

     List<AllBook> allFindAll();


     void allSaveBook(AllBook allBook);

    void allUpdateBook(AllBook allBook);

     void allDeleteBook(String name);

     void allDeleteOne(AllBook allBook);
}
