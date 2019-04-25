package com.example.batis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BatisApplicationTests {


    @Autowired
    UserMapper userMapper;


    @Test
    public void contextLoads() {

        userMapper.insert("5", "456", "152");
        List<User> user = userMapper.getList();
        System.out.print(user);

    }

}
