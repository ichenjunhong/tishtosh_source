package com.p683ss.ttuploader;

/* renamed from: com.ss.ttuploader.TTUploadLog */
public class TTUploadLog {
    public static int LogTurnOn = 112;

    /* renamed from: d */
    public static final void m110631d(String str, String str2) {
    }

    /* renamed from: e */
    public static void m110632e(String str, String str2) {
    }

    /* renamed from: i */
    public static final void m110633i(String str, String str2) {
    }

    /* renamed from: k */
    public static final void m110634k(String str, String str2) {
    }

    /* renamed from: t */
    public static final void m110635t(String str, String str2) {
    }

    /* renamed from: w */
    public static final void m110636w(String str, String str2) {
    }

    public static final void turnOn(int i, int i2) {
        int i3 = ((1 << i) ^ -1) & LogTurnOn;
        LogTurnOn = i3;
        LogTurnOn = (i2 << i) | i3;
    }
}
