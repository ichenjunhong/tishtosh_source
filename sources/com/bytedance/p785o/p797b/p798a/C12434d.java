package com.bytedance.p785o.p797b.p798a;

import com.bytedance.p785o.p797b.C12444g;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: com.bytedance.o.b.a.d */
public final class C12434d {

    /* renamed from: a */
    public String f32705a;

    /* renamed from: b */
    public ThreadPoolExecutor f32706b;

    /* renamed from: c */
    public C12444g f32707c;

    /* renamed from: d */
    public ConcurrentHashMap<String, C12431b> f32708d = new ConcurrentHashMap<>();

    /* renamed from: a */
    public final int mo23484a() {
        return this.f32706b.getPoolSize();
    }

    public final int hashCode() {
        return this.f32706b.hashCode();
    }

    public final boolean equals(Object obj) {
        return this.f32706b.equals(obj);
    }

    public C12434d(ThreadPoolExecutor threadPoolExecutor, String str, C12444g gVar) {
        this.f32705a = str;
        this.f32706b = threadPoolExecutor;
        this.f32707c = gVar;
    }
}
