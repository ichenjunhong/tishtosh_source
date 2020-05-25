package com.p683ss.android.ugc.p2416c;

/* renamed from: com.ss.android.ugc.c.f */
public final class C48514f {

    /* renamed from: a */
    public static C48514f f121957a;

    /* renamed from: b */
    private final Object f121958b;

    /* renamed from: c */
    private final C48518c f121959c;

    /* renamed from: com.ss.android.ugc.c.f$a */
    public static class C48516a implements C48518c {
        /* renamed from: a */
        public final <T> T mo96007a(Object obj, Class<T> cls) {
            return obj;
        }
    }

    /* renamed from: com.ss.android.ugc.c.f$b */
    public static class C48517b {

        /* renamed from: a */
        public Object f121960a;

        /* renamed from: b */
        public C48518c f121961b;
    }

    /* renamed from: com.ss.android.ugc.c.f$c */
    public interface C48518c {
        /* renamed from: a */
        <T> T mo96007a(Object obj, Class<T> cls);
    }

    /* renamed from: a */
    public static <T> T m104950a(Class<T> cls) {
        if (f121957a != null) {
            return f121957a.f121959c.mo96007a(f121957a.f121958b, cls);
        }
        throw new RuntimeException("Graph not init");
    }

    private C48514f(Object obj, C48518c cVar) {
        this.f121958b = obj;
        if (cVar == null) {
            cVar = new C48516a();
        }
        this.f121959c = cVar;
    }
}
