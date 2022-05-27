package com.example.demo.mapper;

import com.example.demo.common.User;

import org.apache.ibatis.annotations.Select;


import java.util.List;

//Mybatis根据注解写对应实现类
public interface UserMapper {
    @Select("select age from student-info where id = #{id}")
    Integer getAgeById(int id);

    @Select("select * from student-info where age = #{age}")
    List<User> getUserByAge(int age);
}
