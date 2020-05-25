package com.facebook.imagepipeline.p976p;

/* renamed from: com.facebook.imagepipeline.p.b */
public class C14237b {

    /* renamed from: a */
    public static final C14239a f37145a = new C14240b();

    /* renamed from: b */
    private static volatile C14241c f37146b = null;

    /* renamed from: com.facebook.imagepipeline.p.b$a */
    public interface C14239a {
    }

    /* renamed from: com.facebook.imagepipeline.p.b$b */
    static final class C14240b implements C14239a {
        private C14240b() {
        }
    }

    /* renamed from: com.facebook.imagepipeline.p.b$c */
    public interface C14241c {
    }

    private C14237b() {
    }

    /* renamed from: a */
    public static void m29185a() {
        m29188c();
    }

    /* renamed from: b */
    public static boolean m29187b() {
        m29188c();
        return false;
    }

    /* renamed from: c */
    private static C14241c m29188c() {
        if (f37146b == null) {
            synchronized (C14237b.class) {
                if (f37146b == null) {
                    f37146b = new C14236a();
                }
            }
        }
        return f37146b;
    }

    /* renamed from: a */
    public static void m29186a(String str) {
        m29188c();
    }
}
