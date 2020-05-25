package com.p683ss.p2549c.p2550a.p2551a.p2552a;

import com.p683ss.p2549c.p2550a.p2551a.p2552a.C51172c.C51174a;

/* renamed from: com.ss.c.a.a.a.d */
public class C51176d {

    /* renamed from: d */
    private static volatile C51176d f127821d;

    /* renamed from: a */
    public final C51182f f127822a = new C51182f();

    /* renamed from: b */
    public C51169a f127823b;

    /* renamed from: c */
    public C51177e f127824c;

    /* renamed from: e */
    private C51172c f127825e;

    public C51176d() {
        mo101707a(new C51174a().mo101706a());
    }

    /* renamed from: a */
    public static C51176d m110086a() {
        if (f127821d == null) {
            synchronized (C51176d.class) {
                if (f127821d == null) {
                    f127821d = new C51176d();
                }
            }
        }
        return f127821d;
    }

    /* renamed from: a */
    public final void mo101707a(C51172c cVar) {
        if (cVar != null) {
            this.f127825e = cVar;
            this.f127823b = new C51169a(this.f127825e);
            this.f127824c = new C51177e(this.f127822a, this.f127823b);
        }
    }
}
