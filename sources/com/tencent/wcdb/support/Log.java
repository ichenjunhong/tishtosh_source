package com.tencent.wcdb.support;

import com.C2240a;

public class Log {

    /* renamed from: a */
    private static LogCallback f129186a;

    public interface LogCallback {
        void println(int i, String str, String str2);
    }

    private Log() {
    }

    private static native void nativePrintLn(int i, String str, String str2);

    private static native void nativeSetLogger(int i, LogCallback logCallback);

    /* renamed from: a */
    public static void m111073a(String str, String str2) {
        m111072a(6, str, str2);
    }

    /* renamed from: b */
    public static void m111075b(String str, String str2) {
        m111072a(5, str, str2);
    }

    /* renamed from: c */
    public static void m111077c(String str, String str2) {
        m111072a(4, str, str2);
    }

    /* renamed from: a */
    public static void m111072a(int i, String str, String str2) {
        if (f129186a != null) {
            f129186a.println(i, str, str2);
        } else {
            nativePrintLn(i, str, str2);
        }
    }

    /* renamed from: b */
    public static void m111076b(String str, String str2, Object... objArr) {
        m111072a(4, str, C2240a.m6772a(str2, objArr));
    }

    /* renamed from: a */
    public static void m111074a(String str, String str2, Object... objArr) {
        m111072a(6, str, C2240a.m6772a(str2, objArr));
    }
}
