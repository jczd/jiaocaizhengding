package com.sunforits.jiaocaizhengding.controller;

import com.sunforits.jiaocaizhengding.entity.Book;
import com.sunforits.jiaocaizhengding.service.BookService;
import com.sunforits.jiaocaizhengding.service.schoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 书店的控制器，书店能够制作书单book，然后能够查看订购结果汇总的表单allbook
 */
@RestController
@RequestMapping("/store")
public class storeController {

    @Autowired
    private BookService bookService;

    @Autowired
    private schoolService schoolService;

    Map<String, Object> map = new HashMap<>();

    /*
     * 对发布的书单1进行增删改查。
     * */
    @RequestMapping("/book/savebook")
    public Map<String, Object> saveBook1(Book book) {
        map.clear();
        System.out.println(book);

        try {
            bookService.saveBook(book);
            map.put("code", 1);
        } catch (Exception e) {
            map.put("code", 2);
        }
        return map;
    }

    @RequestMapping("/book/deletebook")
    public Map<String, Object> deletebook1(Book book) {
        map.clear();
        System.out.println(book);

        try {
            bookService.deleteBook(book.getName());
            map.put("code", 1);
        } catch (Exception e) {
            map.put("code", 2);
        }
        return map;
    }

    @RequestMapping("/book/findall")
    public Map<String, Object> findAll() {
        map.clear();

        List<Book> all = bookService.findAll();

        System.out.println(all);

        map.put("list", all);

        System.out.println(map);
        return map;
    }

    @RequestMapping("/book/findone")
    public Map<String, Object> findOne(String name) {
        map.clear();
        System.out.println(name);

        Book one = bookService.findOne(name);

        map.put("book", one);
        System.out.println(map);

        return map;
    }


    /*
     * 得到最后的总数单：
     * */
    @RequestMapping("/bookfind")
    public Map<String, Object> bookfind() {
        map.clear();


        List<BookChaXun> bookChaXuns = null;
        try {
            bookChaXuns = schoolService.bookFind();
            map.put("code", 1);
            map.put("list", bookChaXuns);
        } catch (Exception e) {
            map.put("code", 2);
        }

        System.out.println(map);

        return map;
    }

}




