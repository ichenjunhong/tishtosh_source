package com.facebook.p914c.p915a;

/* renamed from: com.facebook.c.a.f */
public final class C13622f implements C13616a {

    /* renamed from: a */
    private static C13622f f35535a;

    private C13622f() {
    }

    /* renamed from: a */
    public static synchronized C13622f m27498a() {
        C13622f fVar;
        synchronized (C13622f.class) {
            if (f35535a == null) {
                f35535a = new C13622f();
            }
            fVar = f35535a;
        }
        return fVar;
    }
}
