package com.p683ss.android.ugc.aweme.push.downgrade;

import com.p683ss.android.ugc.aweme.lego.C35857a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.push.downgrade.c */
final /* synthetic */ class C40894c implements C1710e {

    /* renamed from: a */
    static final C1710e f104074a = new C40894c();

    private C40894c() {
    }

    public final void accept(Object obj) {
        if (((Boolean) obj).booleanValue() && !C40893b.f104072a) {
            C40893b.f104072a = true;
            C35857a.m81001b().mo74526a(new OptimizePushAccount$1()).mo74527a();
        }
    }
}
