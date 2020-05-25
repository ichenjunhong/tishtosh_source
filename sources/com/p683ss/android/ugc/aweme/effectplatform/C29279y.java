package com.p683ss.android.ugc.aweme.effectplatform;

import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.y */
public final class C29279y {

    /* renamed from: a */
    public static final C29279y f76659a = new C29279y();

    /* renamed from: b */
    private static List<String> f76660b = new ArrayList();

    private C29279y() {
    }

    /* renamed from: a */
    public static final void m69003a(List<String> list) {
        C52711k.m112240b(list, "requirement");
        f76660b.addAll(list);
    }

    /* renamed from: a */
    public static final boolean m69004a(String str) {
        C52711k.m112240b(str, "requirement");
        return f76660b.contains(str);
    }
}
