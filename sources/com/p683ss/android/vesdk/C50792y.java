package com.p683ss.android.vesdk;

import com.p683ss.android.ttve.nativePort.TELogcat;

/* renamed from: com.ss.android.vesdk.y */
public final class C50792y {

    /* renamed from: a */
    public static String f127603a = "VESDK-";

    /* renamed from: b */
    public static byte f127604b = 7;

    /* renamed from: b */
    public static int m109910b() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace == null || stackTrace.length < 3) {
            return -1;
        }
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    /* renamed from: a */
    public static String m109908a() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace == null || stackTrace.length < 3) {
            return "unknown file";
        }
        return Thread.currentThread().getStackTrace()[2].getFileName();
    }

    /* renamed from: c */
    public static String m109912c() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace == null || stackTrace.length < 3) {
            return "unknown function";
        }
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    /* renamed from: a */
    public static void m109909a(String str, String str2) {
        if ((f127604b & 4) != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(f127603a);
            sb.append(str);
            TELogcat.Log(4, sb.toString(), str2);
        }
    }

    /* renamed from: c */
    public static void m109913c(String str, String str2) {
        if ((f127604b & 2) != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(f127603a);
            sb.append(str);
            TELogcat.Log(2, sb.toString(), str2);
        }
    }

    /* renamed from: d */
    public static void m109914d(String str, String str2) {
        if ((f127604b & 1) != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(f127603a);
            sb.append(str);
            TELogcat.Log(1, sb.toString(), str2);
        }
    }

    /* renamed from: e */
    public static void m109915e(String str, String str2) {
        if ((f127604b & 16) != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(f127603a);
            sb.append(str);
            TELogcat.Log(16, sb.toString(), str2);
        }
    }

    /* renamed from: b */
    public static void m109911b(String str, String str2) {
        if ((f127604b & 8) != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(f127603a);
            sb.append(str);
            TELogcat.Log(8, sb.toString(), str2);
        }
    }
}
