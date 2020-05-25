package com.p683ss.android.ugc.aweme.account.login.authorize;

import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.authorize.b */
final /* synthetic */ class C21077b implements Runnable {

    /* renamed from: a */
    private final AuthorizeActivity f57312a;

    C21077b(AuthorizeActivity authorizeActivity) {
        this.f57312a = authorizeActivity;
    }

    public final void run() {
        AuthorizeActivity authorizeActivity = this.f57312a;
        C10691a.m21542b(authorizeActivity.getApplicationContext(), (int) R.string.c2j).mo19066a();
        authorizeActivity.finish();
        C23826bi.m58472m();
    }
}
