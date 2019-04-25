package com.example.batis;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("SELECT * from user_cs")
    List<User> getList();



    @Insert("insert into user_cs (ID,name,age) values (#{id},#{name},#{age})")
    int insert(@Param("id") String id, @Param("name") String name, @Param("age") String age);

}
