package com.bytedance.ies.p675g.p678c;

import com.bytedance.ies.p675g.p677b.C10805r;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.g.c.s */
public final class C10863s {

    /* renamed from: a */
    public static C10836h f29163a;

    /* renamed from: b */
    public static final C10863s f29164b = new C10863s();

    /* renamed from: c */
    private static boolean f29165c;

    /* renamed from: d */
    private static boolean f29166d;

    private C10863s() {
    }

    /* renamed from: a */
    public static boolean m22029a() {
        return f29166d;
    }

    /* renamed from: b */
    public static C10827b m22030b() {
        f29165c = true;
        return new C10827b();
    }

    /* renamed from: a */
    public static void m22028a(boolean z) {
        f29166d = z;
    }

    /* renamed from: a */
    public static void m22026a(C10836h hVar) {
        C52711k.m112240b(hVar, "<set-?>");
        f29163a = hVar;
    }

    /* renamed from: a */
    public static void m22025a(C10805r rVar) {
        C52711k.m112240b(rVar, "bridge");
        C10836h hVar = f29163a;
        if (hVar == null) {
            C52711k.m112237a("handler");
        }
        hVar.mo19620a(rVar);
    }

    /* renamed from: a */
    public final void mo19637a(String str) {
        C52711k.m112240b(str, "pageUrl");
        m22027a(str, null);
    }

    /* renamed from: a */
    private static void m22027a(String str, C10805r rVar) {
        C52711k.m112240b(str, "pageUrl");
        C10836h hVar = f29163a;
        if (hVar == null) {
            C52711k.m112237a("handler");
        }
        hVar.mo19622a(str, null);
    }
}
