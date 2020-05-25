package com.p683ss.android.ugc.aweme.commercialize.symphony;

import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.h */
public final class C26317h implements C26316g {

    /* renamed from: a */
    public static final C26317h f69457a = new C26317h();

    /* renamed from: b */
    private static WeakReference<C26316g> f69458b;

    private C26317h() {
    }

    /* renamed from: c */
    public static final C26316g m63700c() {
        WeakReference<C26316g> weakReference = f69458b;
        if (weakReference != null) {
            return (C26316g) weakReference.get();
        }
        return null;
    }

    /* renamed from: b */
    public final void mo53102b() {
        C26316g c = m63700c();
        if (c != null) {
            c.mo53102b();
        }
    }

    /* renamed from: a */
    public final void mo53101a() {
        C26316g c = m63700c();
        if (c != null) {
            c.mo53101a();
        }
    }

    /* renamed from: a */
    public static final void m63699a(C26316g gVar) {
        WeakReference<C26316g> weakReference;
        if (gVar == null) {
            weakReference = null;
        } else {
            weakReference = new WeakReference<>(gVar);
        }
        f69458b = weakReference;
    }
}
