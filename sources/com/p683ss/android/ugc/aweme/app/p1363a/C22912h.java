package com.p683ss.android.ugc.aweme.app.p1363a;

import com.p683ss.android.ugc.aweme.C23189aq.C23190a;
import com.p683ss.android.ugc.aweme.C24477c;
import com.p683ss.android.ugc.aweme.account.C20854a;

/* renamed from: com.ss.android.ugc.aweme.app.a.h */
final /* synthetic */ class C22912h implements Runnable {

    /* renamed from: a */
    private final C24477c f61238a;

    C22912h(C24477c cVar) {
        this.f61238a = cVar;
    }

    public final void run() {
        C20854a.m53163c().saveSharedAccount(new C23190a(null, this.f61238a, null));
    }
}
