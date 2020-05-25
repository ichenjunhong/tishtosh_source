package com.p683ss.android.ugc.aweme.account.login.authorize;

import com.p683ss.android.ugc.aweme.account.login.C21390o;
import com.p683ss.android.ugc.aweme.utils.C47700ay;

/* renamed from: com.ss.android.ugc.aweme.account.login.authorize.d */
final /* synthetic */ class C21079d implements Runnable {

    /* renamed from: a */
    private final AuthorizeActivity f57314a;

    C21079d(AuthorizeActivity authorizeActivity) {
        this.f57314a = authorizeActivity;
    }

    public final void run() {
        AuthorizeActivity authorizeActivity = this.f57314a;
        if (authorizeActivity.f57282o == null) {
            authorizeActivity.f57282o = new C21390o(authorizeActivity);
            authorizeActivity.f57282o.f58047a = authorizeActivity;
        }
        C47700ay.m103235a(authorizeActivity.f57282o);
    }
}
