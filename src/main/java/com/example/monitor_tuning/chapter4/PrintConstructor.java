package com.example.monitor_tuning.chapter4;

import com.sun.btrace.AnyType;
import com.sun.btrace.BTraceUtils;
import com.sun.btrace.annotations.BTrace;
import com.sun.btrace.annotations.OnMethod;
import com.sun.btrace.annotations.ProbeClassName;
import com.sun.btrace.annotations.ProbeMethodName;

/**
 * @ClassName PrintSame
 * @Description 监控构造函数
 * @Author zhangzx
 * @Date 2019/12/2 20:14
 * Version 1.0
 **/
@BTrace
public class PrintConstructor {

    @OnMethod(
            clazz="com.imooc.monitor_tuning.chapter2.User",
            method="<init>"
    )
    public static void anyRead(@ProbeClassName String pcn, @ProbeMethodName String pmn, AnyType[] args) {
        BTraceUtils.println(pcn+","+pmn);
        BTraceUtils.printArray(args);
        BTraceUtils.println();
    }
}
