package com.facebook.common.p917a;

/* renamed from: com.facebook.common.a.c */
public final class C13659c implements C13658b {

    /* renamed from: a */
    private static C13659c f35641a;

    private C13659c() {
    }

    /* renamed from: a */
    public static synchronized C13659c m27611a() {
        C13659c cVar;
        synchronized (C13659c.class) {
            if (f35641a == null) {
                f35641a = new C13659c();
            }
            cVar = f35641a;
        }
        return cVar;
    }
}
