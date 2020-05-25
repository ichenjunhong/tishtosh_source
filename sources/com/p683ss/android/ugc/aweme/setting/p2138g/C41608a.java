package com.p683ss.android.ugc.aweme.setting.p2138g;

import com.p683ss.android.ugc.aweme.setting.serverpush.C41683a;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2145a.C41685b;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2145a.C41686c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.setting.g.a */
public final class C41608a implements C41683a {

    /* renamed from: a */
    public static final C41608a f105333a = new C41608a();

    /* renamed from: b */
    private static C41685b f105334b;

    private C41608a() {
    }

    /* renamed from: b */
    public static C41685b m91466b() {
        return f105334b;
    }

    /* renamed from: a */
    public final boolean mo47084a() {
        return false;
    }

    /* renamed from: a */
    public final void mo47082a(C41686c cVar) {
        C52711k.m112240b(cVar, "settings");
        f105334b = cVar.f105483Z;
    }

    /* renamed from: a */
    public final void mo47083a(Exception exc) {
        C52711k.m112240b(exc, "e");
        f105334b = null;
    }
}
