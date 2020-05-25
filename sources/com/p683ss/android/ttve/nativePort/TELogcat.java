package com.p683ss.android.ttve.nativePort;

/* renamed from: com.ss.android.ttve.nativePort.TELogcat */
public class TELogcat {
    static {
        C20129b.m49686c();
    }

    private static native void nativeLog(byte b, String str, String str2);

    private static native void nativeSetLogLevel(byte b);

    public static void setLogLevel(byte b) {
        nativeSetLogLevel(b);
    }

    public static void Log(byte b, String str, String str2) {
        nativeLog(b, str, str2);
    }
}
