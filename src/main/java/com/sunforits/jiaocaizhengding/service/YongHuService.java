package com.sunforits.jiaocaizhengding.service;



import com.sunforits.jiaocaizhengding.domain.YongHu;

import java.util.List;

/**
 * @date 2020/5/11-11:18
 */


public interface YongHuService {

    public YongHu tDengLu(String name);

    public void saveYongHu(YongHu yongHu);

    public void deleteUser(Integer id);

    public YongHu findByNP(YongHu yongHu);

    public List<YongHu> findAll();
}
