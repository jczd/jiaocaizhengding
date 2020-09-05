package com.sunforits.jiaocaizhengding.dao;

import com.sunforits.jiaocaizhengding.entity.Book;
import com.sunforits.jiaocaizhengding.entity.YongHu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 全局查询订单
 * @date 2020/5/18-12:26
 */

@Mapper
public interface SchoolDao {


    //根据书名查询
    @Select("SELECT book.`name`,book.`chubanshe`,book.`zuozhe`, allbook.`shuliang`,allbook.`teacher` FROM book LEFT OUTER JOIN allbook ON book.`name`= allbook.`book` ")
    public List<Book> bookfind();

    //根据老师查询
    @Select("SELECT teacher.`name`,teacher.`xueyuan`, allbook.`shuliang`,allbook.`book` FROM teacher LEFT OUTER JOIN allbook ON teacher.`name`=allbook.`teacher`  ")
    public List<YongHu> teacherfind();

}
