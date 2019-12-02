package com.example.monitor_tuning.chapter4;

import com.sun.btrace.AnyType;
import com.sun.btrace.BTraceUtils;
import com.sun.btrace.annotations.BTrace;
import com.sun.btrace.annotations.Kind;
import com.sun.btrace.annotations.Location;
import com.sun.btrace.annotations.OnMethod;
import com.sun.btrace.annotations.ProbeClassName;
import com.sun.btrace.annotations.ProbeMethodName;

/**
 * @ClassName PrintSame
 * @Description 监控参数信息
 * @Author zhangzx
 * @Date 2019/12/2 20:14
 * Version 1.0
 **/
@BTrace
public class PrintArgSimple {

    @OnMethod(
            clazz="com.imooc.monitor_tuning.chapter4.Ch4Controller",
            method="arg1",
            location=@Location(Kind.ENTRY)
    )
    public static void anyRead(@ProbeClassName String pcn, @ProbeMethodName String pmn, AnyType[] args) {
        BTraceUtils.printArray(args);
        BTraceUtils.println(pcn+","+pmn);
        BTraceUtils.println();
    }
}

