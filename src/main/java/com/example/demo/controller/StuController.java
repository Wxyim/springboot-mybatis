package com.example.demo.controller;

import com.example.demo.entity.Stu;
import com.example.demo.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class StuController {

    @Resource(name = "stuInfo")
    private StuService stuService;

    @GetMapping("/getStuInfoByID/{id}")
    public Stu getStuInfo(@PathVariable("id") int id){
        return stuService.getStuByID(id);
    }

}
