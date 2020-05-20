package com.sunforits.jiaocaizhengding.dao;

import com.sunforits.jiaocaizhengding.entity.Teacher;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @date 2020/5/10-15:54
 */
@Mapper
public interface TeacherDao {

    @Select("select * from teacher where name = #{name}")
    public Teacher tDengLu(String name);


    @Select("select * from teacher")
    public List<Teacher> findAll();

    @Insert("insert into teacher(name,password) values (#{name},#{password})")
    public void saveTeacher(Teacher teacher);

    @Delete("delete from teacher where id = #{id} ")
    int deleteUser(Integer id);

    @Select("select name,password from teacher where name=#{name} and password=#{password}")
    public Teacher findByNP(Teacher teacher);


}
