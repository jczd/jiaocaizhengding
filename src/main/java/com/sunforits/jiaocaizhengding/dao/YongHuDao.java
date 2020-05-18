package com.sunforits.jiaocaizhengding.dao;

import com.sunforits.jiaocaizhengding.domain.YongHu;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @date 2020/5/11-11:21
 */

@Repository
public interface YongHuDao {

    @Select("select * from yonghu where name = #{name}")
    public YongHu DengLu(String name);

    @Insert("insert into yonghu (name,password,number,shenfen,xueyuan) values (#{name},#{password},#{number},#{shenfen},#{xueyuan})")
    public void saveYongHu(YongHu yongHu);

    @Delete("delete from yonghu where id = #{id} ")
    int deleteUser(Integer id);

    @Select("select name,password from yonghu where name=#{name} and password=#{password}")
    public YongHu findByNP(YongHu yongHu);

    @Select("select * from yonghu")
    public List<YongHu> findAll();
}
