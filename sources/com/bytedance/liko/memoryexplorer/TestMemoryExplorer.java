package com.bytedance.liko.memoryexplorer;

import java.io.File;

public class TestMemoryExplorer {
    public static void main(String[] strArr) {
        if (strArr != null) {
            try {
                if (strArr.length >= 3) {
                    new AnalyzerEngine().start(new File(strArr[0]), new File(strArr[1]), new File(strArr[2]));
                    return;
                }
            } catch (Exception unused) {
                System.out.println("TestMemoryExplorer main exception");
            }
        }
        new AnalyzerEngine().start(new File("/Users/zhangxiang/scripts/memory/99999/22/dump.hprof"), new File("/Users/zhangxiang/Desktop/MemoryExplorer/memory-config.json"), new File("/Users/zhangxiang/Desktop/MemoryExplorer/test"));
    }
}
