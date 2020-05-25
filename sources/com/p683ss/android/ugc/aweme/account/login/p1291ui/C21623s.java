package com.p683ss.android.ugc.aweme.account.login.p1291ui;

import android.text.TextUtils;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.s */
final /* synthetic */ class C21623s implements Runnable {

    /* renamed from: a */
    private final C21615r f58623a;

    C21623s(C21615r rVar) {
        this.f58623a = rVar;
    }

    public final void run() {
        C21615r rVar = this.f58623a;
        if (TextUtils.isEmpty(rVar.f58513o.getText().toString())) {
            C21615r.m54325c(rVar.f58513o);
        } else {
            C21615r.m54325c(rVar.f58610s);
        }
    }
}
