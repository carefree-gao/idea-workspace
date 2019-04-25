package com.example.batis;


public class User  {
    private  int ID;

    private  int age;

    private  String name;

    private  int sex;

    public User(int id, int age, String name, int sex) {
        ID = id;
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public int getID() {
        return ID;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getSex() {
        return sex;
    }


    public void setID(int ID) {
        this.ID = ID;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

}
