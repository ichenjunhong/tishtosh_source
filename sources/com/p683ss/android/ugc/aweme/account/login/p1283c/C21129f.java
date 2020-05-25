package com.p683ss.android.ugc.aweme.account.login.p1283c;

import android.content.Context;
import com.bytedance.sdk.account.p844a.C13011d;
import com.bytedance.sdk.account.p859d.C13081d;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13138o;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13139p;
import com.p683ss.android.mobilelib.view.CommonView;
import com.p683ss.android.ugc.aweme.account.C22165u;
import com.p683ss.android.ugc.aweme.account.login.p1282b.C21118w;

/* renamed from: com.ss.android.ugc.aweme.account.login.c.f */
public final class C21129f extends C21126c {

    /* renamed from: a */
    private C13011d f57400a;

    public final void onCompleteCaptcha(String str, int i) {
    }

    public C21129f(Context context, CommonView commonView) {
        super(context, commonView);
        this.f57400a = C13081d.m26312a(context);
    }

    /* renamed from: a */
    public final void mo45237a(String str, String str2, C13139p pVar) {
        if (isValid()) {
            this.f57400a.mo24614a(str, (String) null, C22165u.f59764d, pVar);
        }
    }

    /* renamed from: b */
    public final void mo45238b(String str, String str2, C13139p pVar) {
        if (isValid()) {
            this.f57400a.mo24642b(str, (String) null, C22165u.f59764d, pVar);
        }
    }

    /* renamed from: a */
    public final void mo45243a(String str, String str2, String str3, String str4, C21118w wVar) {
        if (isValid()) {
            beforeHandleRequest();
            this.f57400a.mo24636a(str, str2, str3, str4, (C13138o) wVar);
        }
    }
}
