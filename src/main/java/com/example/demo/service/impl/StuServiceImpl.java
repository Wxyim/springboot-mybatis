package com.example.demo.service.impl;

import com.example.demo.dao.StuDao;
import com.example.demo.entity.Stu;
import com.example.demo.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("stuInfo")
public class StuServiceImpl implements StuService {

    @Autowired
    private StuDao stuDao;

    @Override
    public Stu getStuByID(int id) {
        return stuDao.getStuByID(id);
    }
}
