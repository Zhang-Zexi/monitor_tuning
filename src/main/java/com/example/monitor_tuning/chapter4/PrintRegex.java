package com.example.monitor_tuning.chapter4;

import com.sun.btrace.BTraceUtils;
import com.sun.btrace.annotations.BTrace;
import com.sun.btrace.annotations.OnMethod;
import com.sun.btrace.annotations.ProbeClassName;
import com.sun.btrace.annotations.ProbeMethodName;
/**
 * @ClassName PrintRegex
 * @Description 拦截正则表达式
 * @Author zhangzx
 * @Date 2019/12/2 20:40
 * Version 1.0
 **/
@BTrace
public class PrintRegex {

    @OnMethod(
            clazz="com.imooc.monitor_tuning.chapter4.Ch4Controller",
            method="/.*/"
    )
    public static void anyRead(@ProbeClassName String pcn, @ProbeMethodName String pmn) {
        BTraceUtils.println(pcn+","+pmn);
        BTraceUtils.println();
    }
}
