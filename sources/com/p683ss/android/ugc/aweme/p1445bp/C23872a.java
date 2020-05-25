package com.p683ss.android.ugc.aweme.p1445bp;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.keva.Keva;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bp.a */
public final class C23872a {

    /* renamed from: a */
    public static final C23872a f63544a = new C23872a();

    private C23872a() {
    }

    /* renamed from: a */
    public static Keva m58583a() {
        Keva repoFromSp = Keva.getRepoFromSp(C11010c.m22280a(), "AVStoragePreferences", 0);
        C52711k.m112236a((Object) repoFromSp, "Keva.getRepoFromSp(AppCo…ants.MODE_SINGLE_PROCESS)");
        return repoFromSp;
    }

    /* renamed from: a */
    public static final void m58584a(boolean z) {
        m58583a().storeBoolean("key_is_effect_storage_cleaning", z);
    }
}
