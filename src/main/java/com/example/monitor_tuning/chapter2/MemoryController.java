package com.example.monitor_tuning.chapter2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @ClassName MemoryController
 * @Description 内存溢出模拟
 * @Author zhangzx
 * @Date 2019/12/2 14:25
 * Version 1.0
 **/
@RestController
public class MemoryController {

    private List<User> userList = new ArrayList<User>();
    private List<Class<?>> classList = new ArrayList<Class<?>>();

    /**
     * -Xmx32M -Xms32M
     **/
    @GetMapping("/heap")
    public String heap() {
        int i = 0;
        while (true) {
            userList.add(new User(i ++, UUID.randomUUID().toString()));
        }
    }

    /**
     * -XX:MetaspaceSize=32M -XX:MaxMetaspaceSize=32M
     * @return
     */
    @GetMapping("/nonheap")
    public String nonheap() {
        int i = 0;
        while (true) {
            classList.addAll(Metaspace.createClasses());
        }
    }
}
