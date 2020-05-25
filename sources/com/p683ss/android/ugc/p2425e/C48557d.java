package com.p683ss.android.ugc.p2425e;

import android.content.Context;

/* renamed from: com.ss.android.ugc.e.d */
public class C48557d {

    /* renamed from: e */
    public static int f122015e = 30000;

    /* renamed from: f */
    public static long f122016f = 10000;

    /* renamed from: g */
    private static C48557d f122017g;

    /* renamed from: a */
    public C48558a f122018a;

    /* renamed from: b */
    public C48558a f122019b;

    /* renamed from: c */
    public Context f122020c;

    /* renamed from: d */
    public boolean f122021d = true;

    /* renamed from: com.ss.android.ugc.e.d$a */
    public interface C48558a {
        /* renamed from: a */
        String mo74659a();
    }

    /* renamed from: b */
    public final String mo96062b() {
        return this.f122018a.mo74659a();
    }

    /* renamed from: c */
    public final String mo96063c() {
        return this.f122019b.mo74659a();
    }

    /* renamed from: a */
    public static C48557d m105031a() {
        if (f122017g == null) {
            synchronized (C48557d.class) {
                if (f122017g == null) {
                    f122017g = new C48557d();
                }
            }
        }
        return f122017g;
    }

    /* renamed from: a */
    public final String mo96061a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f122018a.mo74659a());
        sb.append(C48551b.m105020b(str));
        return sb.toString();
    }
}
