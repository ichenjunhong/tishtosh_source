package com.bytedance.android.p140a.p151b.p153b;

import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.a.b.b.d */
public final class C2822d {

    /* renamed from: a */
    public int f8415a = -1;

    /* renamed from: b */
    public String f8416b;

    /* renamed from: c */
    public Map<String, List<String>> f8417c;

    /* renamed from: d */
    public final long f8418d;

    /* renamed from: e */
    public final C2820c f8419e;

    /* renamed from: f */
    public Throwable f8420f;

    /* renamed from: a */
    public static C2822d m8022a(Throwable th) {
        return m8023a(th, null);
    }

    /* renamed from: a */
    public static C2822d m8023a(Throwable th, C2820c cVar) {
        C2822d dVar = new C2822d(-1, th.getMessage(), null, cVar, th);
        return dVar;
    }

    public C2822d(int i, String str, Map<String, List<String>> map, C2820c cVar, Throwable th) {
        this.f8415a = i;
        this.f8416b = str;
        this.f8417c = map;
        this.f8419e = cVar;
        this.f8420f = th;
        this.f8418d = System.currentTimeMillis();
    }
}
