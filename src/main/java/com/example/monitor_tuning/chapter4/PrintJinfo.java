package com.example.monitor_tuning.chapter4;

import com.sun.btrace.BTraceUtils;
import com.sun.btrace.annotations.BTrace;
/**
 * @ClassName PrintJinfo
 * @Description 其他
 * @Author zhangzx
 * @Date 2019/12/2 20:44
 * Version 1.0
 **/
@BTrace
public class PrintJinfo {
    static {
        BTraceUtils.println("System Properties:");
        BTraceUtils.printProperties();
        BTraceUtils.println("VM Flags:");
        BTraceUtils.printVmArguments();
        BTraceUtils.println("OS Enviroment:");
        BTraceUtils.printEnv();
        BTraceUtils.exit(0);
    }
}
