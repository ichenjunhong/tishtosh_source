package com.p683ss.android.ugc.aweme.utils;

/* renamed from: com.ss.android.ugc.aweme.utils.ge */
public final class C47913ge {
    /* renamed from: a */
    public static String m103638a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null || stackTraceElementArr.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement append : stackTraceElementArr) {
            sb.append(append);
            sb.append("\n");
        }
        return sb.toString();
    }
}
