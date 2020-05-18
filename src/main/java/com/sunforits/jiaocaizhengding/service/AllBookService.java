package com.sunforits.jiaocaizhengding.service;

import com.sunforits.jiaocaizhengding.domain.allBook;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @date 2020/5/17-17:13
 */
public interface AllBookService {

    public List<allBook> allFindOne(String name);

    public List<allBook> allFindAll();


    public void allSaveBook(allBook allBook);

    public void allDeleteBook(String name);

    public void teacherDeleteBook(String book,String teacher);
}
