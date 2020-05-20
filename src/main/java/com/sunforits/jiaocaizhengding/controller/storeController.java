package com.sunforits.jiaocaizhengding.controller;

import com.sunforits.jiaocaizhengding.entity.Book;
import com.sunforits.jiaocaizhengding.entity.BookChaXun;
import com.sunforits.jiaocaizhengding.service.BookService;
import com.sunforits.jiaocaizhengding.service.schoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

/**
 * 书店的控制器，书店能够制作书单book，然后能够查看订购结果汇总的表单allbook
 */
@Controller
@RequestMapping("/store")
public class storeController {

    @Autowired
    private BookService bookService;

    @Autowired
    private schoolService schoolService;

    /*
    * 对发布的书单1进行增删改查。
    * */
    @RequestMapping("/book/savebook")
    public String saveBook1(Book book){

        bookService.saveBook(book);
        return "success";
    }

    @RequestMapping("/book/deletebook")
    public void deletebook1(Book book){
        String s=book.getName();
        bookService.deleteBook(s);
    }

    @RequestMapping("/book/findall")
    public String findAll(){
        List<Book> all = bookService.findAll();
        for (Book b:all){
            System.out.println(b);
        }
        return "success";
    }

    @RequestMapping("/book/findone")
    public String findOne(String name){
        Book one = bookService.findOne(name);
        System.out.println(one);
        return "success";
    }


    /*
    * 得到最后的总数单：
    *
    * */

    @RequestMapping("/bookfind")
    public void bookfind() {
        List<BookChaXun> bookChaXuns = schoolService.bookFind();
        for (BookChaXun a:bookChaXuns){
            System.out.println(a);
        }


    }

}




