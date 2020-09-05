package com.sunforits.jiaocaizhengding.dao;

import com.sunforits.jiaocaizhengding.entity.AllBook;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 订单的增删改查
 *
 * @date 2020/5/17-17:10
 */
@Mapper
public interface AllBookDao {

    //添加书籍
    @Insert("insert into allbook (uid,bid,shuliang,state,start) values ('#{uid}','#{bid}','#{shuliang}','${state}','#{start}')")
    public void allSaveBook(AllBook allBook);

    //删除书籍
    @Delete("delete from allbook where book = #{book} ")
    int allDeleteBook(String name);

    //查看所有
    @Select("select * from allbook")
    public List<AllBook> allFindAll();

    //老师查看自己未完成的订单
    @Select("select * from allbook where uid = #{uid} and state='未完成';")
    public List<AllBook> allFindOne(String uid);

    //删除书籍
    @Delete("delete from allbook where uid = '#{uid}' and bid='#{bid}' and state='未完成';")
    int deleteOne(AllBook allBook);

    @Update("update allbook set shuliang=${shuliang} where uid='${uid}' and bid='${bid}' and state='未完成';")
    void allUpdateOne(AllBook allBook);
}
