package com.facebook.imagepipeline.p964d;

/* renamed from: com.facebook.imagepipeline.d.t */
public final class C13991t implements C13984n {

    /* renamed from: a */
    private static C13991t f36471a;

    private C13991t() {
    }

    /* renamed from: a */
    public static synchronized C13991t m28520a() {
        C13991t tVar;
        synchronized (C13991t.class) {
            if (f36471a == null) {
                f36471a = new C13991t();
            }
            tVar = f36471a;
        }
        return tVar;
    }
}
