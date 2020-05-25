package com.bytedance.liko.leakdetector.p774a;

import com.bytedance.liko.leakdetector.C12279a;

/* renamed from: com.bytedance.liko.leakdetector.a.b */
public final class C12281b {

    /* renamed from: a */
    public static final C12281b f32394a = new C12281b();

    private C12281b() {
    }

    /* renamed from: a */
    public static float m24763a() {
        long maxMemory = Runtime.getRuntime().maxMemory();
        long j = Runtime.getRuntime().totalMemory();
        long freeMemory = j - Runtime.getRuntime().freeMemory();
        float f = ((float) freeMemory) / ((float) maxMemory);
        StringBuilder sb = new StringBuilder("javaMax:");
        sb.append(maxMemory);
        sb.append(" javaTotal:");
        sb.append(j);
        sb.append(" javaUsed:");
        sb.append(freeMemory);
        sb.append(" proportion:");
        sb.append(f);
        C12279a.m24757a(sb.toString());
        return f;
    }
}
