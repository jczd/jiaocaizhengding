package com.sunforits.jiaocaizhengding.dao;

import com.sunforits.jiaocaizhengding.domain.BookTwo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @date 2020/5/11-16:04
 */
@Repository
public interface BookTwoDao {
    @Insert("insert into book2 (name,number,chubanshe,tname) values (#{name},#{number},#{chubanshe}),#{tname}")
    public void saveBookTwo(BookTwo book);

    @Delete("delete from book2 where name = #{name} ")
    int deleteBookTwo(String name);

    @Select("select * from book2 where name = #{name}")
    public BookTwo findOneT(String name);

    @Select("select * from book2")
    public List<BookTwo> findAll();
}
