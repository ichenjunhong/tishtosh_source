package com.bytedance.p785o.p786a.p787a;

/* renamed from: com.bytedance.o.a.a.d */
public final class C12409d {

    /* renamed from: a */
    public static C12411a f32660a = C12411a.INFO;

    /* renamed from: b */
    public static boolean f32661b;

    /* renamed from: c */
    public static C12408c f32662c = new C12408c() {
    };

    /* renamed from: com.bytedance.o.a.a.d$a */
    public enum C12411a {
        DEBUG,
        INFO,
        WARNING,
        ERROR,
        NONE
    }

    /* renamed from: a */
    public static boolean m24991a() {
        return f32661b;
    }

    /* renamed from: a */
    public static void m24989a(String str, String str2) {
        m24990a(str, str2, C12411a.ERROR);
    }

    /* renamed from: b */
    public static void m24992b(String str, String str2) {
        m24990a(str, str2, C12411a.INFO);
    }

    /* renamed from: c */
    public static void m24993c(String str, String str2) {
        m24990a(str, str2, C12411a.DEBUG);
    }

    /* renamed from: a */
    private static void m24990a(String str, String str2, C12411a aVar) {
        aVar.ordinal();
        f32660a.ordinal();
    }
}
