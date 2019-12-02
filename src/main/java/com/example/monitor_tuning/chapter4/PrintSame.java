package com.example.monitor_tuning.chapter4;

import com.sun.btrace.BTraceUtils;
import com.sun.btrace.annotations.BTrace;
import com.sun.btrace.annotations.OnMethod;
import com.sun.btrace.annotations.ProbeClassName;
import com.sun.btrace.annotations.ProbeMethodName;
/**
 * @ClassName PrintSame
 * @Description 监控同名的方法
 * @Author zhangzx
 * @Date 2019/12/2 20:14
 * Version 1.0
 **/
@BTrace
public class PrintSame {

    @OnMethod(
            clazz="com.imooc.monitor_tuning.chapter4.Ch4Controller",
            method="same"
    )
    public static void anyRead(@ProbeClassName String pcn, @ProbeMethodName String pmn, String name) {
        BTraceUtils.println(pcn+","+pmn + "," + name);
        BTraceUtils.println();
    }
}
