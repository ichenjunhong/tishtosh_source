package com.p683ss.android.p1103ad.splash.p1123g;

import com.p683ss.android.p1103ad.splash.core.C18642g;

/* renamed from: com.ss.android.ad.splash.g.g */
public class C18741g {

    /* renamed from: a */
    public static int f51827a = 2;

    /* renamed from: a */
    private static String m45693a() {
        if (!C18642g.m45226d()) {
            return "";
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        int i = 1;
        while (i < stackTrace.length) {
            StackTraceElement stackTraceElement = stackTrace[i];
            String className = stackTraceElement.getClassName();
            if (className.equals(Thread.class.getCanonicalName()) || className.equals(C18741g.class.getCanonicalName())) {
                i++;
            } else {
                StringBuilder sb = new StringBuilder("(");
                sb.append(stackTraceElement.getFileName());
                sb.append(":");
                sb.append(stackTraceElement.getLineNumber());
                sb.append(")#");
                sb.append(stackTraceElement.getMethodName());
                sb.append(". ");
                return sb.toString();
            }
        }
        return "";
    }

    /* renamed from: a */
    public static void m45694a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(m45693a());
        sb.append(str);
    }
}
