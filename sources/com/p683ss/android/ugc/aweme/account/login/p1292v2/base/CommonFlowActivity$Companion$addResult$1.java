package com.p683ss.android.ugc.aweme.account.login.p1292v2.base;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity$Companion$addResult$1 */
public final class CommonFlowActivity$Companion$addResult$1 implements C0183j {

    /* renamed from: a */
    final /* synthetic */ int f59103a;

    /* renamed from: b */
    final /* synthetic */ C0184k f59104b;

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void onDestroy() {
        CommonFlowActivity.f59095e.remove(this.f59103a);
        this.f59104b.getLifecycle().mo325b(this);
    }

    CommonFlowActivity$Companion$addResult$1(int i, C0184k kVar) {
        this.f59103a = i;
        this.f59104b = kVar;
    }
}
