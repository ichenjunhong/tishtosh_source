package com.zego.p2623ve;

import com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.UnknownHostException;

/* renamed from: com.zego.ve.Log */
public class Log {
    public static native int native_println(String str);

    public static int println(String str) {
        try {
            native_println(str);
        } catch (Throwable unused) {
        }
        return 0;
    }

    public static String getStackTraceString(Throwable th) {
        if (th == null) {
            return "";
        }
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof UnknownHostException) {
                return "";
            }
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        C17840a.m43751a(th, printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    /* renamed from: d */
    public static int m111990d(String str, String str2) {
        StringBuilder sb = new StringBuilder("[DEBUG] ");
        sb.append(str);
        sb.append(" -- ");
        sb.append(str2);
        return println(sb.toString());
    }

    /* renamed from: e */
    public static int m111992e(String str, String str2) {
        StringBuilder sb = new StringBuilder("[ERROR] ");
        sb.append(str);
        sb.append(" -- ");
        sb.append(str2);
        return println(sb.toString());
    }

    /* renamed from: i */
    public static int m111994i(String str, String str2) {
        StringBuilder sb = new StringBuilder("[INFO] ");
        sb.append(str);
        sb.append(" -- ");
        sb.append(str2);
        return println(sb.toString());
    }

    /* renamed from: v */
    public static int m111996v(String str, String str2) {
        StringBuilder sb = new StringBuilder("[VERBOSE] ");
        sb.append(str);
        sb.append(" -- ");
        sb.append(str2);
        return println(sb.toString());
    }

    /* renamed from: w */
    public static int m111998w(String str, String str2) {
        StringBuilder sb = new StringBuilder("[WARNING] ");
        sb.append(str);
        sb.append(" -- ");
        sb.append(str2);
        return println(sb.toString());
    }

    /* renamed from: d */
    public static int m111991d(String str, String str2, Throwable th) {
        StringBuilder sb = new StringBuilder("[DEBUG] ");
        sb.append(str);
        sb.append(" -- ");
        sb.append(str2);
        sb.append(10);
        sb.append(getStackTraceString(th));
        return println(sb.toString());
    }

    /* renamed from: e */
    public static int m111993e(String str, String str2, Throwable th) {
        StringBuilder sb = new StringBuilder("[ERROR] ");
        sb.append(str);
        sb.append(" -- ");
        sb.append(str2);
        sb.append(10);
        sb.append(getStackTraceString(th));
        return println(sb.toString());
    }

    /* renamed from: i */
    public static int m111995i(String str, String str2, Throwable th) {
        StringBuilder sb = new StringBuilder("[INFO] ");
        sb.append(str);
        sb.append(" -- ");
        sb.append(str2);
        sb.append(10);
        sb.append(getStackTraceString(th));
        return println(sb.toString());
    }

    /* renamed from: v */
    public static int m111997v(String str, String str2, Throwable th) {
        StringBuilder sb = new StringBuilder("[VERBOSE] ");
        sb.append(str);
        sb.append(" -- ");
        sb.append(str2);
        sb.append(10);
        sb.append(getStackTraceString(th));
        return println(sb.toString());
    }

    /* renamed from: w */
    public static int m111999w(String str, String str2, Throwable th) {
        StringBuilder sb = new StringBuilder("[WARNING] ");
        sb.append(str);
        sb.append(" -- ");
        sb.append(str2);
        sb.append(10);
        sb.append(getStackTraceString(th));
        return println(sb.toString());
    }
}
