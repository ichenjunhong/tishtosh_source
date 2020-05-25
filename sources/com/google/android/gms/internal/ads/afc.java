package com.google.android.gms.internal.ads;

import android.util.Log;

@C16299uq
public class afc {
    /* renamed from: b */
    public static void m32792b(String str) {
        m32791a(3);
    }

    /* renamed from: a */
    public static void m32790a(String str, Throwable th) {
        m32791a(3);
    }

    /* renamed from: c */
    public static void m32794c(String str) {
        m32791a(6);
    }

    /* renamed from: b */
    public static void m32793b(String str, Throwable th) {
        m32791a(6);
    }

    /* renamed from: d */
    public static void m32796d(String str) {
        m32791a(4);
    }

    /* renamed from: e */
    public static void m32798e(String str) {
        m32791a(5);
    }

    /* renamed from: c */
    public static void m32795c(String str, Throwable th) {
        m32791a(5);
    }

    /* renamed from: a */
    private static String m32789a(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        int lineNumber = stackTrace[3].getLineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
        sb.append(str);
        sb.append(" @");
        sb.append(lineNumber);
        return sb.toString();
    }

    /* renamed from: d */
    public static void m32797d(String str, Throwable th) {
        if (m32791a(5)) {
            if (th != null) {
                m32795c(m32789a(str), th);
                return;
            }
            m32798e(m32789a(str));
        }
    }

    /* renamed from: a */
    public static boolean m32791a(int i) {
        return i >= 5 || Log.isLoggable("Ads", i);
    }
}
