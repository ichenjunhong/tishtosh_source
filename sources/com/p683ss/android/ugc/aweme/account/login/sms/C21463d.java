package com.p683ss.android.ugc.aweme.account.login.sms;

import android.text.TextUtils;

/* renamed from: com.ss.android.ugc.aweme.account.login.sms.d */
final /* synthetic */ class C21463d implements Runnable {

    /* renamed from: a */
    private final C21460a f58228a;

    /* renamed from: b */
    private final String f58229b;

    C21463d(C21460a aVar, String str) {
        this.f58228a = aVar;
        this.f58229b = str;
    }

    public final void run() {
        C21460a aVar = this.f58228a;
        String str = this.f58229b;
        aVar.f58217a.setText(str);
        if (!TextUtils.isEmpty(str)) {
            aVar.f58217a.setSelection(str.length());
        }
    }
}
