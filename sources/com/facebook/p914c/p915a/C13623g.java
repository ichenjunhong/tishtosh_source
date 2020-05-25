package com.facebook.p914c.p915a;

/* renamed from: com.facebook.c.a.g */
public final class C13623g implements C13617b {

    /* renamed from: a */
    private static C13623g f35536a;

    private C13623g() {
    }

    /* renamed from: a */
    public static synchronized C13623g m27499a() {
        C13623g gVar;
        synchronized (C13623g.class) {
            if (f35536a == null) {
                f35536a = new C13623g();
            }
            gVar = f35536a;
        }
        return gVar;
    }
}
