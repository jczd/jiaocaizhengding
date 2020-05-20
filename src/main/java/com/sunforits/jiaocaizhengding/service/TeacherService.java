package com.sunforits.jiaocaizhengding.service;



import com.sunforits.jiaocaizhengding.entity.Teacher;

import java.util.List;


public interface TeacherService {

    //登录
    public Teacher tDengLu(String teacher);

    public List<Teacher> findAll();

    public void saveTeacher(Teacher teacher);

    public void deleteTeacher(Integer i);

    public Teacher findByNP(Teacher teacher);
}
