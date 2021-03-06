package com.sunforits.jiaocaizhengding.service.impl;

        import com.sunforits.jiaocaizhengding.dao.SchoolDao;
        import com.sunforits.jiaocaizhengding.entity.dingdan;
        import com.sunforits.jiaocaizhengding.service.schoolService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

        import java.util.List;

/**
 * @date 2020/5/18-12:48
 */

@Service("schoolservice")
public class schoolServiceImpl implements schoolService {

    @Autowired
    private SchoolDao schoolDao;

    @Override
    public List<dingdan> bookFind(String bid) {
        List<dingdan> bookfind = schoolDao.bookfind(bid);
        return bookfind;
    }

    @Override
    public List<dingdan> teacherFind(String uid) {
        List<dingdan> teacherfind = schoolDao.teacherfind(uid);
        return teacherfind;
    }

    @Override
    public List<dingdan> allfind() {
        List<dingdan> teacherfind = schoolDao.allfind();
        return teacherfind;
    }
}
