package com.sunforits.jiaocaizhengding.service;

import com.sunforits.jiaocaizhengding.entity.YongHu;

import java.util.List;

/**
 * @date 2020/5/11-11:18
 */
public interface YongHuService {

    YongHu DengLu(String number);

    void saveYongHu(YongHu yongHu);

    void deleteUser(String id);

    YongHu findByNP(YongHu yongHu);

    List<YongHu> findAll();

    void updateUser(YongHu yongHu);

}
