package com.p683ss.android.ugc.aweme.profile;

import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.setting.serverpush.C41683a;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2145a.C41686c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.ab */
public final class C39716ab implements C41683a {

    /* renamed from: a */
    public static final C39716ab f101353a = new C39716ab();

    /* renamed from: b */
    private static C41686c f101354b;

    private C39716ab() {
    }

    /* renamed from: a */
    public final void mo47083a(Exception exc) {
        C52711k.m112240b(exc, "e");
    }

    /* renamed from: a */
    public final boolean mo47084a() {
        return true;
    }

    /* renamed from: a */
    public final void mo47082a(C41686c cVar) {
        C52711k.m112240b(cVar, "settings");
        f101354b = cVar;
        Keva repo = Keva.getRepo("keva_repo_profile_component");
        if (cVar.f105473P > repo.getInt(C39877j.f101725a.mo80976g(), 0)) {
            repo.storeInt(C39877j.f101725a.mo80976g(), cVar.f105473P);
        }
    }
}
