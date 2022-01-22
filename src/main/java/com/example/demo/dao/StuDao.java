package com.example.demo.dao;

import com.example.demo.entity.Stu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface StuDao {
//    @Select("select * from stu where id = #{id}")
    Stu getStuByID(int id);
}
