package com.p683ss.android.ttve.common;

import com.p683ss.android.ttve.nativePort.C20129b;

/* renamed from: com.ss.android.ttve.common.TESpdLogInvoker */
public class TESpdLogInvoker {
    static {
        C20129b.m49685b();
    }

    public native void close();

    public native int error(String str);

    public native String getLogFiles(String str);

    public native int info(int i, String str);

    public native int initSpdLog(String str, int i, int i2);

    public native void setLevel(int i);

    public native int warn(String str);
}
