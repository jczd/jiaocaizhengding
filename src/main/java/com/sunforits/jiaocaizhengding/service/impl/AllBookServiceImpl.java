package com.sunforits.jiaocaizhengding.service.impl;

import com.sunforits.jiaocaizhengding.dao.AllBookDao;
import com.sunforits.jiaocaizhengding.entity.AllBook;
import com.sunforits.jiaocaizhengding.service.AllBookService;
import com.sunforits.jiaocaizhengding.utils.DateTime.StringTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @date 2020/5/17-17:16
 */

@Service("allbookservice")
public class AllBookServiceImpl implements AllBookService {

    @Autowired
    AllBookDao allBookDao;

    @Override
    public List<AllBook> allFindOne(String name) {
        List<AllBook> allBook = allBookDao.allFindOne(name);
        return allBook;
    }

    @Override
    public List<AllBook> allFindAll() {
        List<AllBook> AllBooks = allBookDao.allFindAll();
        return AllBooks;
    }

    @Override
    public void allSaveBook(AllBook allBook) {
        if (allBook.getStart() == null || allBook.getStart().equals("")) {   // 设置订单创建时间
            allBook.setStart(StringTime.getStringTime());

        }

        allBookDao.allSaveBook(allBook);
    }

    @Override
    public void allDeleteBook(String name) {
        allBookDao.allDeleteBook(name);

    }


    @Override
    public void teacherDeleteBook(String book, String teacher) {
        allBookDao.teacherDeleteBook(book, teacher);
    }
}
