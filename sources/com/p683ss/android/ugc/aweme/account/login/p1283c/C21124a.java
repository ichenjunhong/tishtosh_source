package com.p683ss.android.ugc.aweme.account.login.p1283c;

import android.content.Context;
import com.bytedance.sdk.account.p844a.C13011d;
import com.bytedance.sdk.account.p859d.C13081d;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13139p;
import com.p683ss.android.mobilelib.view.InputCodePasswordView;
import com.p683ss.android.ugc.aweme.account.C22165u;

/* renamed from: com.ss.android.ugc.aweme.account.login.c.a */
public final class C21124a extends C21126c {

    /* renamed from: a */
    public C13011d f57396a;

    public final void onCompleteCaptcha(String str, int i) {
    }

    public C21124a(Context context, InputCodePasswordView inputCodePasswordView) {
        super(context, inputCodePasswordView);
        this.f57396a = C13081d.m26312a(context);
    }

    /* renamed from: a */
    public final void mo45237a(String str, String str2, C13139p pVar) {
        if (isValid()) {
            this.f57396a.mo24614a(str, (String) null, C22165u.f59781u, pVar);
        }
    }

    /* renamed from: b */
    public final void mo45238b(String str, String str2, C13139p pVar) {
        if (isValid()) {
            this.f57396a.mo24642b(str, (String) null, C22165u.f59781u, pVar);
        }
    }
}
