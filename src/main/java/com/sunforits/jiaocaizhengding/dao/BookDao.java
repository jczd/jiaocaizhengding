package com.sunforits.jiaocaizhengding.dao;

import com.sunforits.jiaocaizhengding.domain.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @date 2020/5/11-12:08
 */
@Repository
public interface BookDao  {

    @Insert("insert into book (name,chubanshe,money) values (#{name},#{chubanshe},#{money})")
    public void saveBook(Book book);

    @Delete("delete from book where name = #{name} ")
    int deleteBook(String name);

    @Select("select * from book where name = #{name}")
    public Book findOne(String name);

    @Select("select * from book")
    public List<Book> findAll();
}
