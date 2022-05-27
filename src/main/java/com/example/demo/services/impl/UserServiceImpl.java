package com.example.demo.services.impl;

import com.example.demo.common.Result;
import com.example.demo.common.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.services.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public Result getAgeById(int id){
        Integer age =userMapper.getAgeById(id);
        Result a=new Result();
        if (age==null){
            a.setCode(1);
            a.setMessage("age not found with your id");
            return  a;
        }
        a.setData(age);
        return getUserByAge(age);
    }

    public Result getUserByAge(int age) {
        List<User> user =userMapper.getUserByAge(age);
        Result r=new Result();
        if (user==null){
            r.setCode(1);
            r.setMessage("user not found");
            return  r;
        }
        r.setData(user);
        return r;
    }
}
