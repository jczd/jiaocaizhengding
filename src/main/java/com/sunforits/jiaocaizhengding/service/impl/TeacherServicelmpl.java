package com.sunforits.jiaocaizhengding.service.impl;

import com.sunforits.jiaocaizhengding.dao.TeacherDao;
import com.sunforits.jiaocaizhengding.domain.Teacher;
import com.sunforits.jiaocaizhengding.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * @date 2020/5/10-16:08
 */
@Service("teacherService")
public class TeacherServicelmpl implements TeacherService {

    @Autowired
    TeacherDao teacherDao;

    @Override
    public Teacher tDengLu(String teacher) {

        Teacher a=teacherDao.tDengLu(teacher);
        return a;
    }

    @Override
    public List<Teacher> findAll() {
        return teacherDao.findAll();
    }


    @Override
    public void saveTeacher(Teacher teacher) {
        teacherDao.saveTeacher(teacher);
    }

    @Override
    public void deleteTeacher(Integer i) {
        teacherDao.deleteUser(i);
    }

    @Override
    public Teacher findByNP(Teacher teacher) {
       Teacher t=teacherDao.findByNP(teacher);
        return t;
    }
}
