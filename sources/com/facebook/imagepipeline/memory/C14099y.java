package com.facebook.imagepipeline.memory;

/* renamed from: com.facebook.imagepipeline.memory.y */
public final class C14099y implements C14069ae {

    /* renamed from: a */
    private static C14099y f36825a;

    private C14099y() {
    }

    /* renamed from: a */
    public static synchronized C14099y m28869a() {
        C14099y yVar;
        synchronized (C14099y.class) {
            if (f36825a == null) {
                f36825a = new C14099y();
            }
            yVar = f36825a;
        }
        return yVar;
    }
}
