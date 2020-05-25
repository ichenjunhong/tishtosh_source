package com.p683ss.android.ugc.aweme.account.login.authorize;

import android.content.Intent;

/* renamed from: com.ss.android.ugc.aweme.account.login.authorize.e */
final /* synthetic */ class C21080e implements Runnable {

    /* renamed from: a */
    private final AuthorizeActivity f57315a;

    /* renamed from: b */
    private final int f57316b;

    /* renamed from: c */
    private final Intent f57317c;

    C21080e(AuthorizeActivity authorizeActivity, int i, Intent intent) {
        this.f57315a = authorizeActivity;
        this.f57316b = i;
        this.f57317c = intent;
    }

    public final void run() {
        AuthorizeActivity authorizeActivity = this.f57315a;
        authorizeActivity.setResult(this.f57316b, this.f57317c);
        authorizeActivity.finish();
    }
}
