package com.p683ss.ttm.utils;

/* renamed from: com.ss.ttm.utils.AVLogger */
public class AVLogger {
    public static int LogTurnOn = 112;

    /* renamed from: d */
    public static final void m110625d(String str, String str2) {
    }

    /* renamed from: e */
    public static void m110626e(String str, String str2) {
    }

    /* renamed from: i */
    public static final void m110627i(String str, String str2) {
    }

    /* renamed from: k */
    public static final void m110628k(String str, String str2) {
    }

    /* renamed from: t */
    public static final void m110629t(String str, String str2) {
    }

    /* renamed from: w */
    public static final void m110630w(String str, String str2) {
    }

    public static final void turnOn(int i, int i2) {
        int i3 = ((1 << i) ^ -1) & LogTurnOn;
        LogTurnOn = i3;
        LogTurnOn = (i2 << i) | i3;
    }
}
