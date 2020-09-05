package com.sunforits.jiaocaizhengding.controller;

import com.sunforits.jiaocaizhengding.entity.Book;
import com.sunforits.jiaocaizhengding.entity.allBook;
import com.sunforits.jiaocaizhengding.service.AllBookService;
import com.sunforits.jiaocaizhengding.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 关于老师身份的操作，老师能看到书店发下来的表单book，然后自己增删改查要订购的书单allbook中用where name=teacher的name
 */
@RestController
@RequestMapping("/teacher")
public class teacherController {

    @Autowired
    private BookService bookService;

    @Autowired
    private AllBookService allBookService;

    Map<String, Object> map = new HashMap<>();

    /*
     * 查看书店发出的书单
     *
     * */
    @RequestMapping("/book/findall")
    public Map<String, Object> findAll() {
        map.clear();

        List<Book> all = bookService.findAll();
        System.out.println(all);

        map.put("list", all);
        map.put("code", 1);

        System.out.println(map);
        return map;
    }

    /*
     * 在allbook书单里添加书籍
     * */
    @RequestMapping("/allbook/savebook")
    public Map<String, Object> saveBook(allBook allBook) {
        map.clear();
        System.out.println(allBook);

        try {
            allBookService.allSaveBook(allBook);
            map.put("code", 1);
        } catch (Exception e) {

            map.put("code", 2);
        }

        return map;
    }

    /*
     * 查看自己添加的书籍
     * */
    @RequestMapping("/allbook/teacherfindall")
    public Map<String, Object> teacherfindall(String teachername) {
        map.clear();
        System.out.println(teachername);

        List<allBook> allBooks = null;
        try {
            allBooks = allBookService.allFindOne(teachername);
            map.put("code", 1);
        } catch (Exception e) {
            map.put("code", 2);
        }

        System.out.println(allBooks);
        System.out.println(map);
        return map;
    }

//    /*
//     * 删除书籍
//     * */
//    @RequestMapping("/allbook/teacherdeletebook")
//    public Map<String, Object> teacherdeletebook(allBook allBook) {
//        map.clear();
//        System.out.println(allBook);
//
//        try {
//            allBookService.teacherDeleteBook(allBook.getBook(), allBook.getTeacher());
//            map.put("code", 1);
//        } catch (Exception e) {
//            map.put("code", 2);
//        }
//        return map;
//    }


}
