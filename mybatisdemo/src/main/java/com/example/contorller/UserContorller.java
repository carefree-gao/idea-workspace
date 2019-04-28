package com.example.contorller;


import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserContorller {

    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping(value = "/findBYlist", produces = {"application/json;charset=UTF-8"})
    public Object findlist(){
        return userService.fingList(1,6);

    }


}
