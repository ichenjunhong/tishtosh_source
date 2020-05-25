package com.p683ss.ugc.aweme.performance.core.monitor.p2592f;

import com.taobao.android.dexposed.ClassUtils;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.ugc.aweme.performance.core.monitor.f.b */
public final class C51548b {

    /* renamed from: a */
    public static final C51548b f128764a = new C51548b();

    private C51548b() {
    }

    /* renamed from: b */
    public final StackTraceElement[] mo103729b(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null) {
            return null;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i = 0;
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (C51547a.m110674a(stackTraceElement)) {
                stackTraceElementArr2[i] = stackTraceElement;
                i++;
            }
        }
        return stackTraceElementArr2;
    }

    /* renamed from: a */
    public static String m110675a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (stackTraceElement != null) {
                C52711k.m112240b(stackTraceElement, "element");
                C52711k.m112240b(sb, "buffer");
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
        String sb2 = sb.toString();
        C52711k.m112236a((Object) sb2, "sb.toString()");
        return sb2;
    }
}
