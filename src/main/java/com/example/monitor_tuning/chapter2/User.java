package com.example.monitor_tuning.chapter2;

/**
 * @ClassName User
 * @Description
 * @Author zhangzx
 * @Date 2019/12/2 14:27
 * Version 1.0
 **/
public class User {

    private int id;

    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
