package com.sunforits.jiaocaizhengding.dao;

import com.sunforits.jiaocaizhengding.entity.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 发布订单
 * @date 2020/5/11-12:08
 */
@Mapper
public interface BookDao  {

    @Insert("insert into book (name,chubanshe,money,zuozhe) values (#{name},#{chubanshe},#{money},#{zuozhe})")
    public void saveBook(Book book);

    @Delete("delete from book where bid = #{bid} ")
    int deleteBook(Integer bid);

    @Select("select * from book where name = #{name}")
    public Book findOne(String name);

    @Select("select * from book order by bid desc ")
    public List<Book> findAll();
}
