package com.p683ss.android.ugc.aweme.profile.presenter;

import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.api.Api;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.x */
final /* synthetic */ class C39991x implements Runnable {

    /* renamed from: a */
    private final C39990w f101930a;

    /* renamed from: b */
    private final String f101931b;

    C39991x(C39990w wVar, String str) {
        this.f101930a = wVar;
        this.f101931b = str;
    }

    public final void run() {
        C39990w wVar = this.f101930a;
        String str = this.f101931b;
        StringBuilder sb = new StringBuilder();
        sb.append(Api.f61283c);
        sb.append("?uid=");
        sb.append(C20902b.m53242a().getCurUserId());
        C20902b.m53242a().uploadCover(wVar.f101926a, sb.toString(), 4194304, str);
    }
}
