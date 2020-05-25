package com.bytedance.ies.p675g.p678c;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.g.c.f */
public final class C10833f {

    /* renamed from: a */
    public static final C10833f f29097a = new C10833f();

    /* renamed from: b */
    private static C10840i f29098b = new C10834a();

    /* renamed from: com.bytedance.ies.g.c.f$a */
    public static final class C10834a implements C10840i {
        C10834a() {
        }

        /* renamed from: a */
        public final void mo19618a(int i, String str) {
            C52711k.m112240b(str, "message");
        }

        /* renamed from: a */
        public final void mo19619a(int i, String str, Throwable th) {
            C52711k.m112240b(str, "message");
            C52711k.m112240b(th, "throwable");
        }
    }

    private C10833f() {
    }

    /* renamed from: a */
    public static void m21989a(C10840i iVar) {
        C52711k.m112240b(iVar, "<set-?>");
        f29098b = iVar;
    }

    /* renamed from: a */
    public static void m21990a(String str) {
        C52711k.m112240b(str, "message");
        if (C10863s.m22029a()) {
            f29098b.mo19618a(1, str);
        }
    }

    /* renamed from: b */
    public static void m21993b(String str, Throwable th) {
        C52711k.m112240b(str, "message");
        if (th == null) {
            f29098b.mo19618a(3, str);
        } else {
            f29098b.mo19619a(3, str, th);
        }
    }

    /* renamed from: a */
    public static void m21991a(String str, Throwable th) {
        C52711k.m112240b(str, "message");
        if (th == null) {
            f29098b.mo19618a(2, str);
        } else {
            f29098b.mo19619a(2, str, th);
        }
    }
}
