package com.p683ss.p2568f.p2569a.p2572c;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.f.a.c.b */
public class C51320b {

    /* renamed from: a */
    private static int f128255a = -1;

    /* renamed from: b */
    private static String f128256b;

    /* renamed from: c */
    private static C51320b f128257c;

    /* renamed from: d */
    private ConcurrentHashMap<String, C51321a> f128258d = new ConcurrentHashMap<>();

    /* renamed from: com.ss.f.a.c.b$a */
    static class C51321a {

        /* renamed from: a */
        public String f128259a;

        /* renamed from: b */
        public long f128260b;

        /* renamed from: c */
        public boolean f128261c;

        C51321a() {
        }
    }

    /* renamed from: c */
    public static int m110374c() {
        return f128255a;
    }

    /* renamed from: d */
    public static String m110376d() {
        return f128256b;
    }

    private C51320b() {
    }

    /* renamed from: b */
    public final void mo101873b() {
        if (this.f128258d != null) {
            this.f128258d.clear();
        }
    }

    /* renamed from: a */
    public static C51320b m110372a() {
        if (f128257c == null) {
            synchronized (C51320b.class) {
                if (f128257c == null) {
                    f128257c = new C51320b();
                }
            }
        }
        return f128257c;
    }

    /* renamed from: a */
    public static void m110373a(int i) {
        f128255a = i;
    }

    /* renamed from: c */
    public static void m110375c(String str) {
        f128256b = str;
    }

    /* renamed from: a */
    public final C51321a mo101871a(String str) {
        if (this.f128258d != null) {
            return (C51321a) this.f128258d.get(str);
        }
        return null;
    }

    /* renamed from: b */
    public final void mo101874b(String str) {
        if (str != null) {
            C51321a aVar = null;
            if (this.f128258d != null) {
                aVar = (C51321a) this.f128258d.get(str);
            }
            if (aVar != null) {
                aVar.f128261c = true;
            }
        }
    }

    /* renamed from: a */
    public final void mo101872a(String str, C51321a aVar) {
        if (this.f128258d != null) {
            this.f128258d.put(str, aVar);
        }
    }
}
