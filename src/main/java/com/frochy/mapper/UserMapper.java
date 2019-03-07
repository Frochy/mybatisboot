package com.frochy.mapper;


import com.frochy.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    User selectById(Integer id);

    List<User> selectAll();

    int deleteById(Integer id);
}
