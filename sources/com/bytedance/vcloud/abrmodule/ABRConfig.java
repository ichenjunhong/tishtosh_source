package com.bytedance.vcloud.abrmodule;

public class ABRConfig {
    private static int sLogLevel = 3;

    public static int getLogLevel() {
        return sLogLevel;
    }

    public static void setLoglevel(int i) {
        sLogLevel = i;
    }
}
