package com.sunforits.jiaocaizhengding.dao;

import com.sunforits.jiaocaizhengding.domain.BookChaXun;

import com.sunforits.jiaocaizhengding.domain.TeacherChaXun;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @date 2020/5/18-12:26
 */

@Repository
public interface SchoolDao {

    @Select("SELECT book.`name`,book.`chubanshe`,book.`zuozhe`, allbook.`shuliang`,allbook.`teacher` FROM book LEFT OUTER JOIN allbook ON allbook.`book`=book.`name`  ")
    public List<BookChaXun> bookfind();

    @Select("SELECT teacher.`name`,teacher.`xueyuan`, allbook.`shuliang`,allbook.`book` FROM teacher LEFT OUTER JOIN allbook ON teacher.`name`=allbook.`teacher`  ")
    public List<TeacherChaXun> teacherfind();

}
