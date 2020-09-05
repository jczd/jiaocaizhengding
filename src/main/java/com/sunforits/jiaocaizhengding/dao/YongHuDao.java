package com.sunforits.jiaocaizhengding.dao;

import com.sunforits.jiaocaizhengding.entity.YongHu;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 用户管理
 * @date 2020/5/11-11:21
 */

@Mapper
public interface YongHuDao {

    @Select("select * from yonghu where number = #{number}")
    public YongHu DengLu(String number);

    @Insert("insert into yonghu (name,password,number,shenfen,xueyuan) values (#{name},#{password},#{number},#{shenfen},#{xueyuan})")
    public void saveYongHu(YongHu yongHu);

    @Delete("delete from yonghu where uid = #{uid} ")
    int deleteUser(Integer uid);

    @Select("select * from yonghu where name=#{name} and password=#{password}")
    public YongHu findByNP(YongHu yongHu);

    @Select("select * from yonghu order by uid desc")
    public List<YongHu> findAll();

    @Update("update yonghu set name=${name},password=#{password},number=${number},shenfen=${shenfen},xueyuan=${xueyuan} where uid=${uid}")
    void updateOne(YongHu yongHu);
}
