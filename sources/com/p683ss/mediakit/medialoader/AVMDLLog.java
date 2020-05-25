package com.p683ss.mediakit.medialoader;

/* renamed from: com.ss.mediakit.medialoader.AVMDLLog */
public class AVMDLLog {
    public static int LogTurnOn = 112;

    /* renamed from: d */
    public static final void m110472d(String str, String str2) {
    }

    /* renamed from: e */
    public static void m110473e(String str, String str2) {
    }

    /* renamed from: i */
    public static final void m110474i(String str, String str2) {
    }

    /* renamed from: k */
    public static final void m110475k(String str, String str2) {
    }

    /* renamed from: t */
    public static final void m110476t(String str, String str2) {
    }

    /* renamed from: w */
    public static final void m110477w(String str, String str2) {
    }

    public static final void turnOn(int i, int i2) {
        int i3 = ((1 << i) ^ -1) & LogTurnOn;
        LogTurnOn = i3;
        LogTurnOn = (i2 << i) | i3;
    }
}
