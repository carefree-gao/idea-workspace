package com.example.batis;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {


    @Autowired
    UserMapper userMapper;


    @RequestMapping(value = "/findList", produces="application/json; charset=utf-8")
    public List<User> FindList() {

      List<User>  ii =  userMapper.getList();


      return ii;
    }
}
