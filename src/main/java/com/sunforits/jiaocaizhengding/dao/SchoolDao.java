package com.sunforits.jiaocaizhengding.dao;

import com.sunforits.jiaocaizhengding.entity.dingdan;
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
    @Select("SELECT book.`username`,book.`chubanshe`,book.`zuozhe` ,allbook.`shuliang`,yonghu.`name`,yonghu.`shenfen`,yonghu.`number`,yonghu.`bumen`,allbook.`bid`,allbook.`uid`  FROM allbook \n" +
            "LEFT OUTER JOIN book ON allbook.`bid`=book.`bid` \n" +
            "LEFT OUTER JOIN yonghu ON allbook.`uid`=yonghu.`uid` WHERE book.`bid`='#{bid}' ")
    public List<dingdan> bookfind(String bid);

    //根据老师查询
    @Select("SELECT yonghu.`username`,yonghu.`shenfen`,yonghu.`number`,yonghu.`bumen`,allbook.`bid`,allbook.`uid` ,book.`name`,book.`chubanshe`,book.`zuozhe` ,allbook.`shuliang` FROM allbook \n" +
            "LEFT OUTER JOIN yonghu ON allbook.`uid`=yonghu.`uid` \n" +
            "LEFT OUTER JOIN book ON allbook.`bid`=book.`bid` where yonghu.'uid'='#{uid}' ")
    public List<dingdan> teacherfind(String uid);

    //查询所有
    @Select("SELECT yonghu.`username`,yonghu.`shenfen`,yonghu.`number`,yonghu.`bumen`,allbook.`bid`,allbook.`uid` ,book.`name`,book.`chubanshe`,book.`zuozhe` ,allbook.`shuliang` FROM allbook \n" +
            "LEFT OUTER JOIN yonghu ON allbook.`uid`=yonghu.`uid` \n" +
            "LEFT OUTER JOIN book ON allbook.`bid`=book.`bid` ")
    public List<dingdan> allfind();

}
