package com.bytedance.ies.uikit.p699c;

import com.taobao.android.dexposed.ClassUtils;

/* renamed from: com.bytedance.ies.uikit.c.c */
public final class C11090c {
    /* renamed from: a */
    public static String m22441a(StackTraceElement[] stackTraceElementArr, int i) {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement a : stackTraceElementArr) {
            m22442a(a, sb);
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static void m22442a(StackTraceElement stackTraceElement, StringBuilder sb) {
        String className = stackTraceElement.getClassName();
        sb.append("  at ");
        sb.append(className);
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        sb.append(stackTraceElement.getMethodName());
        sb.append("(");
        sb.append(stackTraceElement.getFileName());
        sb.append(":");
        sb.append(stackTraceElement.getLineNumber());
        sb.append(")\n");
    }
}
