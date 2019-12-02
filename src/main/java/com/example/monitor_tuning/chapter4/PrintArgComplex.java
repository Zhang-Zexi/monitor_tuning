package com.example.monitor_tuning.chapter4;

import java.lang.reflect.Field;
import com.example.monitor_tuning.chapter2.User;
import com.sun.btrace.BTraceUtils;
import com.sun.btrace.annotations.BTrace;
import com.sun.btrace.annotations.Kind;
import com.sun.btrace.annotations.Location;
import com.sun.btrace.annotations.OnMethod;
import com.sun.btrace.annotations.ProbeClassName;
import com.sun.btrace.annotations.ProbeMethodName;
/**
 * @ClassName PrintArgComplex
 * @Description 拦截复杂参数
 * @Author zhangzx
 * @Date 2019/12/2 20:36
 * Version 1.0
 **/
@BTrace
public class PrintArgComplex {


    @OnMethod(
            clazz="com.imooc.monitor_tuning.chapter4.Ch4Controller",
            method="arg2",
            location=@Location(Kind.ENTRY)
    )
    public static void anyRead(@ProbeClassName String pcn, @ProbeMethodName String pmn, User user) {
        //print all fields
        BTraceUtils.printFields(user);
        //print one field
        Field filed2 = BTraceUtils.field("com.imooc.monitor_tuning.chapter2.User", "name");
        BTraceUtils.println(BTraceUtils.get(filed2, user));
        BTraceUtils.println(pcn+","+pmn);
        BTraceUtils.println();
    }
}