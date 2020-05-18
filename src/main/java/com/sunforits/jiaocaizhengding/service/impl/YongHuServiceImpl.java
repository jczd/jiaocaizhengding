package com.sunforits.jiaocaizhengding.service.impl;

import com.sunforits.jiaocaizhengding.dao.YongHuDao;
import com.sunforits.jiaocaizhengding.domain.YongHu;
import com.sunforits.jiaocaizhengding.service.YongHuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * @date 2020/5/11-11:18
 */
@Service("yongHuservice")
public class YongHuServiceImpl implements YongHuService {

    @Autowired
    YongHuDao yongHuDao;

    @Override
    public YongHu DengLu(String name) {
        return yongHuDao.DengLu(name);
    }

    @Override
    public void saveYongHu(YongHu yongHu) {


        yongHuDao.saveYongHu(yongHu);
    }

    @Override
    public void deleteUser(Integer id) {
        yongHuDao.deleteUser(id);
    }

    @Override
    public YongHu findByNP(YongHu yongHu) {
        YongHu byNP = yongHuDao.findByNP(yongHu);
        return byNP;
    }

    @Override
    public List<YongHu> findAll() {
        List<YongHu> all = yongHuDao.findAll();
        return all;
    }


}
