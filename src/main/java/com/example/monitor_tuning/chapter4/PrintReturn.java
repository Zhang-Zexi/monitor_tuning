package com.example.monitor_tuning.chapter4;

import com.sun.btrace.AnyType;
import com.sun.btrace.BTraceUtils;
import com.sun.btrace.annotations.BTrace;
import com.sun.btrace.annotations.Kind;
import com.sun.btrace.annotations.Location;
import com.sun.btrace.annotations.OnMethod;
import com.sun.btrace.annotations.ProbeClassName;
import com.sun.btrace.annotations.ProbeMethodName;
import com.sun.btrace.annotations.Return;
/**
 * @ClassName PrintReturn
 * @Description 拦截返回值
 * @Author zhangzx
 * @Date 2019/12/2 20:24
 * Version 1.0
 **/
@BTrace
public class PrintReturn {

    @OnMethod(
            clazz="com.imooc.monitor_tuning.chapter4.Ch4Controller",
            method="arg1",
            location=@Location(Kind.RETURN)
    )
    public static void anyRead(@ProbeClassName String pcn, @ProbeMethodName String pmn, @Return AnyType result) {
        BTraceUtils.println(pcn+","+pmn + "," + result);
        BTraceUtils.println();
    }
}
