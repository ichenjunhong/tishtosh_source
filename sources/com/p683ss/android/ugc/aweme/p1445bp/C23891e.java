package com.p683ss.android.ugc.aweme.p1445bp;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.keva.Keva;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bp.e */
public final class C23891e {

    /* renamed from: a */
    public static final C23891e f63559a = new C23891e();

    private C23891e() {
    }

    /* renamed from: a */
    public static Keva m58604a() {
        Keva repoFromSp = Keva.getRepoFromSp(C11010c.m22280a(), "DiskManager", 0);
        C52711k.m112236a((Object) repoFromSp, "Keva.getRepoFromSp(AppCo…ants.MODE_SINGLE_PROCESS)");
        return repoFromSp;
    }

    /* renamed from: a */
    public final boolean mo49497a(boolean z) {
        return m58604a().getBoolean("has_show_disk_manager_dot", false);
    }
}
