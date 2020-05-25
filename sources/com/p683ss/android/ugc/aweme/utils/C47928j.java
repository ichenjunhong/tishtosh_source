package com.p683ss.android.ugc.aweme.utils;

import android.app.Activity;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.utils.j */
public final class C47928j {

    /* renamed from: a */
    public static final C47928j f120522a = new C47928j();

    private C47928j() {
    }

    /* renamed from: a */
    public static final String m103702a() {
        StringBuilder sb = new StringBuilder();
        Activity[] activityStack = ActivityStack.getActivityStack();
        int min = Math.min(activityStack.length, 10);
        for (int i = 0; i < min; i++) {
            if (i > 0) {
                sb.append("\n");
            }
            sb.append(activityStack[i].getClass().getCanonicalName());
        }
        String sb2 = sb.toString();
        C52711k.m112236a((Object) sb2, "sb.toString()");
        return sb2;
    }

    /* renamed from: a */
    public static final String m103703a(String[] strArr) {
        StackTraceElement[] stackTrace;
        C52711k.m112240b(strArr, "packageWhiteList");
        StringBuilder sb = new StringBuilder();
        Thread currentThread = Thread.currentThread();
        C52711k.m112236a((Object) currentThread, "Thread.currentThread()");
        for (StackTraceElement stackTraceElement : currentThread.getStackTrace()) {
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                String str = strArr[i];
                C52711k.m112236a((Object) stackTraceElement, "element");
                String className = stackTraceElement.getClassName();
                C52711k.m112236a((Object) className, "element.className");
                if (C52830p.m112411b(className, str, false, 2, null)) {
                    if (!C52830p.m112402a(sb)) {
                        sb.append("\n");
                    }
                    sb.append(stackTraceElement.getClassName());
                    sb.append("(");
                    sb.append(stackTraceElement.getMethodName());
                    sb.append(":");
                    sb.append(stackTraceElement.getLineNumber());
                    sb.append(")");
                } else {
                    i++;
                }
            }
        }
        String sb2 = sb.toString();
        C52711k.m112236a((Object) sb2, "sb.toString()");
        return sb2;
    }
}
