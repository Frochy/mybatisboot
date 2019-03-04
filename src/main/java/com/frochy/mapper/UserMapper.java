package com.frochy.mapper;


import com.frochy.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    User selectById(Integer id);

    int deleteById(Integer id);
}
