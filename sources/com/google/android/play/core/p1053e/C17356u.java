package com.google.android.play.core.p1053e;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.play.core.e.u */
public enum C17356u implements C17352q {
    INSTANCE;
    

    /* renamed from: b */
    private static final AtomicReference<C17344i> f48870b = null;

    static {
        INSTANCE = new C17356u("INSTANCE", 0);
        new C17356u[1][0] = INSTANCE;
        f48870b = new AtomicReference<>(null);
    }

    /* renamed from: a */
    public static void m42512a(C17344i iVar) {
        f48870b.compareAndSet(null, iVar);
    }

    /* renamed from: a */
    public final C17344i mo33649a() {
        return (C17344i) f48870b.get();
    }
}
