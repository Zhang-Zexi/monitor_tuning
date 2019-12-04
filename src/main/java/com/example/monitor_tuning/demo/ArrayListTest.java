package com.example.monitor_tuning.demo;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @ClassName ArrayListTest
 * @Description ArrayList概念理解-源码查看
 * @Author zhangzx
 * @Date 2019/12/4 14:58
 * Version 1.0
 **/
public class ArrayListTest {

    private static ArrayList<String> list = new ArrayList<String>();


    private boolean add() {
        return list.add("1");
    }

    public static void main(String[] args) {
        System.out.println(new ArrayListTest().add()); // null
        System.out.println(list);
    }
}
