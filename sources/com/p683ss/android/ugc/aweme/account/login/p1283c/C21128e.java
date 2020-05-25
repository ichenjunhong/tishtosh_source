package com.p683ss.android.ugc.aweme.account.login.p1283c;

import android.content.Context;
import android.os.Message;
import com.bytedance.sdk.account.p844a.C13011d;
import com.bytedance.sdk.account.p859d.C13081d;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13132i;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13139p;
import com.p683ss.android.mobilelib.view.CommonView;
import com.p683ss.android.ugc.aweme.account.C22165u;

/* renamed from: com.ss.android.ugc.aweme.account.login.c.e */
public final class C21128e extends C21126c {

    /* renamed from: a */
    private C13011d f57399a;

    public final void onCompleteCaptcha(String str, int i) {
    }

    public final void handleMsg(Message message) {
        super.handleMsg(message);
    }

    public C21128e(Context context, CommonView commonView) {
        super(context, commonView);
        this.f57399a = C13081d.m26312a(context);
    }

    /* renamed from: a */
    public final void mo45237a(String str, String str2, C13139p pVar) {
        this.f57399a.mo24614a(str, (String) null, C22165u.f59781u, pVar);
    }

    /* renamed from: b */
    public final void mo45238b(String str, String str2, C13139p pVar) {
        this.f57399a.mo24642b(str, (String) null, C22165u.f59781u, pVar);
    }

    /* renamed from: a */
    public final void mo45242a(String str, String str2, String str3, C13132i iVar) {
        if (isValid()) {
            beforeHandleRequest();
            this.f57399a.mo24628a(str, str2, (String) null, iVar);
        }
    }
}
