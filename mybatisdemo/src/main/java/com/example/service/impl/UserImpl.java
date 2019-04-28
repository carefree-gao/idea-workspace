package com.example.service.impl;

import com.example.mapper.UserMapper;
import com.example.model.User;
import com.example.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service(value = "UserService")
public class UserImpl implements UserService {


    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> fingList(int pageNO, int pageSize) {

        PageHelper.startPage(pageNO,pageSize);
        List <User> list = userMapper.findList();
        PageInfo<User> pageInfo = new PageInfo<User>(list);
        return pageInfo.getList();
    }
}
