package com.sunforits.jiaocaizhengding.service.impl;

import com.sunforits.jiaocaizhengding.dao.YongHuDao;
import com.sunforits.jiaocaizhengding.entity.YongHu;
import com.sunforits.jiaocaizhengding.service.YongHuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.UUID;

/**
 * @date 2020/5/11-11:18
 */
@Service
public class YongHuServiceImpl implements YongHuService {

    @Autowired
    YongHuDao yongHuDao;

    @Override
    public YongHu DengLu(String number) {
        System.out.println("登录");
        System.out.println(number);
        return yongHuDao.DengLu(number);
    }

    @Override
    public void saveYongHu(YongHu yongHu) {
        if (yongHu.getUid() == null || yongHu.getUid().equals("")) {    // 设置UUID
            yongHu.setUid(UUID.randomUUID().toString());
            System.out.println(yongHu.getUid());
        }
        if(yongHu.getPassword()==null|| yongHu.getPassword().equals("")){   // 设置初始密码
            yongHu.setPassword("666666");
        }
        System.out.println(yongHu);

        yongHuDao.saveYongHu(yongHu);
    }

    @Override
    public void deleteUser(Integer uid) {
        yongHuDao.deleteUser(uid);
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

    @Override
    public void updateUser(YongHu yongHu) {
        yongHuDao.updateOne(yongHu);
    }


}
