package com.sunforits.jiaocaizhengding.service.impl;

import com.sunforits.jiaocaizhengding.dao.AllBookDao;
import com.sunforits.jiaocaizhengding.domain.allBook;
import com.sunforits.jiaocaizhengding.service.AllBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @date 2020/5/17-17:16
 */

@Service("allbookservice")
public class AllBookServiceImpl implements AllBookService {

    @Autowired
    AllBookDao allBookDao;

    @Override
    public List<allBook> allFindOne(String name) {
        List<allBook> allBook = allBookDao.allFindOne(name);
        return allBook;
    }

    @Override
    public List<allBook> allFindAll() {
        List<allBook> allBooks = allBookDao.allFindAll();
        return allBooks;
    }

    @Override
    public void allSaveBook(allBook allBook) {
        allBookDao.allSaveBook(allBook);
    }

    @Override
    public void allDeleteBook(String name) {
        allBookDao.allDeleteBook(name);

    }


    @Override
    public void teacherDeleteBook(String book,String teacher){
        allBookDao.teacherDeleteBook(book,teacher);
    }
}
