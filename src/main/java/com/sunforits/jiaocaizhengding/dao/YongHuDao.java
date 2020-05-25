package com.sunforits.jiaocaizhengding.dao;

import com.sunforits.jiaocaizhengding.entity.YongHu;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @date 2020/5/11-11:21
 */

@Mapper
public interface YongHuDao {

    @Select("select * from yonghu where name = #{name}")
    public YongHu DengLu(String name);

    @Insert("insert into yonghu (name,password,number,shenfen,xueyuan) values (#{name},#{password},#{number},#{shenfen},#{xueyuan})")
    public void saveYongHu(YongHu yongHu);

    @Delete("delete from yonghu where id = #{id} ")
    int deleteUser(Integer id);

    @Select("select * from yonghu where name=#{name} and password=#{xueyuan}")
    public YongHu findByNP(YongHu yongHu);

    @Select("select * from yonghu")
    public List<YongHu> findAll();
}
