package com.sunforits.jiaocaizhengding.controller;

import com.sunforits.jiaocaizhengding.domain.Book;
import com.sunforits.jiaocaizhengding.domain.allBook;
import com.sunforits.jiaocaizhengding.service.AllBookService;
import com.sunforits.jiaocaizhengding.service.BookService;
import com.sunforits.jiaocaizhengding.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

/**
 * 关于老师身份的操作，老师能看到书店发下来的表单book，然后自己增删改查要订购的书单allbook中用where name=teacher的name
 */
@Controller
@RequestMapping("/teacher")
public class teacherController {

   @Autowired
    private BookService bookService;

   @Autowired
    private AllBookService allBookService;

    /*
    * 查看书店发出的书单
    *
    * */
    @RequestMapping("/book/findall")
    public String findAll(){
        List<Book> all = bookService.findAll();
        for (Book b:all){
            System.out.println(b);
        }
        return "success";
    }

    /*
    * 在allbook书单里添加书籍
    * */
    @RequestMapping("/allbook/savebook")
    public String saveBook(allBook allBook){
        allBookService.allSaveBook(allBook);
        return "success";
    }

    /*
    * 查看自己添加的书籍
    * */
    @RequestMapping("/allbook/teacherfindall")
    public String teacherfindall(String teachername){
        List<allBook> allBooks = allBookService.allFindOne(teachername);
        for (allBook a:allBooks){
            System.out.println(a);
        }
        return "allBooks";
    }

    /*
    * 删除书籍
    * */
    @RequestMapping("/allbook/teacherdeletebook")
    public void teacherdeletebook(allBook allBook){
        String teacher = allBook.getTeacher();
        String book = allBook.getBook();
        allBookService.teacherDeleteBook(book,teacher);
    }


}
