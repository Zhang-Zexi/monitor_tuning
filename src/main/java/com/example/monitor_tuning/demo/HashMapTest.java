package com.example.monitor_tuning.demo;

import java.util.HashMap;

/**
 * @ClassName HashMapTest
 * @Description HashMap概念理解-源码查看
 * @Author zhangzx
 * @Date 2019/12/4 14:34
 * Version 1.0
 **/
public class HashMapTest {

    // 初始化的时候没有非配空间
    private static HashMap<String, String> map = new HashMap<String, String>();


    private String put() {
        // put的时候判断空间节点为0，所以分配空间
        return map.put("1", "2"); // put返回值null
    }

    public static void main(String[] args) {
        System.out.println(new HashMapTest().put()); // null
        System.out.println(map.get("1"));
    }
}
