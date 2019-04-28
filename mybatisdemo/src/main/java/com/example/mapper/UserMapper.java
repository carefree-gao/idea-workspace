package com.example.mapper;

import com.example.model.User;
import java.math.BigDecimal;
import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> findList();
}