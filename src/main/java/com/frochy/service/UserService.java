package com.frochy.service;


import com.frochy.entity.User;
import com.frochy.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User selectById(Integer id){
        return userMapper.selectById(id);
    }

    public int deleteById(Integer id){
        return userMapper.deleteById(id);
    }
}
