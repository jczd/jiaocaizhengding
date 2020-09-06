package com.sunforits.jiaocaizhengding.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import com.sunforits.jiaocaizhengding.entity.Book;
import com.sunforits.jiaocaizhengding.entity.AllBook;

import com.sunforits.jiaocaizhengding.service.AllBookService;
import com.sunforits.jiaocaizhengding.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.*;

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

        map.put("booklist", all);
        map.put("code", 1);

        System.out.println(map);
        return map;
    }

    /*
     * 在allbook书单里添加书籍
     * */
    @RequestMapping(value = "/allbook/savebook")
    public Map<String, Object> saveBook(@RequestParam Map<String, Object> str) {
        map.clear();
        System.out.println(str);

        List<AllBook> allBooks = mapToList(str, AllBook.class, "dingdan");
        System.out.println(allBooks);

        try {
            for (AllBook a : allBooks) {
                allBookService.allSaveBook(a);
            }
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
    public Map<String, Object> teacherfindall(String uid) {
        map.clear();
        System.out.println(uid);

        List<AllBook> AllBooks = null;
        try {
            AllBooks = allBookService.allFindOne(uid);
            map.put("code", 1);
        } catch (Exception e) {
            map.put("code", 2);
        }

        System.out.println(AllBooks);
        System.out.println(map);
        return map;
    }

    /*
     * 修改添加的订单信息
     * */
    @RequestMapping("/allbook/updateone")
    public Map<String, Object> updateAllbookOne(AllBook allBook) {
        map.clear();
        System.out.println(allBook);

        try {
            allBookService.allUpdateBook(allBook);
            map.put("code", 1);
        } catch (Exception e) {
            map.put("code", 2);
        }
        return map;
    }

    /*
     * 删除添加的书籍
     * */
    @RequestMapping("/allbook/teacherdeletebook")
    public Map<String, Object> teacherdeletebook(AllBook allBook) {
        map.clear();
        System.out.println(allBook);

        try {
            allBookService.allDeleteOne(allBook);
            map.put("code", 1);
        } catch (Exception e) {
            map.put("code", 2);
        }

        return map;
    }

    public static JSONObject mapToJson(Map<String, Object> map) {
        String data = JSON.toJSONString(map);
        return JSON.parseObject(data);
    }

    /**
     * map中取类对象
     *
     * @param map
     * @param clazz
     * @param key
     * @param <T>
     * @return
     */
    public static <T> T mapToObject(Map<String, Object> map, Class<T> clazz, String key) {
        T t = null;
        JSONObject jsonObject = mapToJson(map);
        JSONObject object = jsonObject.getJSONObject(key);
        t = object.toJavaObject(clazz);
        return t;
    }

    /**
     * map中取list
     *
     * @param map
     * @param clazz
     * @param key
     * @return
     */
    public List<AllBook> mapToList(Map<String, Object> map, Class<AllBook> clazz, String key) {
        List<AllBook> t = null;
        JSONObject jsonObject = mapToJson(map);
        JSONArray array = jsonObject.getJSONArray(key);
        t = array.toJavaList(clazz);
        return t;
    }

}
