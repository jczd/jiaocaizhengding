package com.sunforits.jiaocaizhengding.dao;

import com.sunforits.jiaocaizhengding.entity.Book;
import com.sunforits.jiaocaizhengding.entity.YongHu;
import com.sunforits.jiaocaizhengding.entity.AllBook;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 发布书籍
 *
 * @date 2020/5/11-12:08
 */
@Mapper
public interface BookDao {


    //增加数据
    @Insert("insert into book (name,money,chubanshe,zuozhe,uid,bid) values ('${name}',${money},'${chubanshe}'," +
            "'${zuozhe}','${uid}','${bid}');")
    public void saveBook(Book book);

    //根据bid删除
    @Delete("delete from book where bid = '${bid}' and uid='${uid}';")
    int deleteBook(Book book);

    //更新书籍
    @Update("update book set name='${name}',money='${money}',chubanshe='${chubanshe}',zuozhe='${zuozhe}'," +
            "uid='${uid}' where bid='${bid}';")
    public void updateBook(Book book);

    //根据名字查询
    @Select("select * from book where name = ${name}")
    public Book findOne(String name);

    //查询所有
    @Select("select * from book order by bid desc ")
    public List<Book> findAll();
}
