package com.sunforits.jiaocaizhengding.service;

import com.sunforits.jiaocaizhengding.entity.dingdan;

import java.util.List;

/**
 * @date 2020/5/18-12:47
 */
public interface schoolService {

    public List<dingdan> bookFind(String bid);

    public List<dingdan> teacherFind(String uid);

    public List<dingdan> allfind();
}
