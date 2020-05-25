package com.p683ss.android.ugc.aweme.account.login.p1282b;

import android.text.TextUtils;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p861f.p862a.C13120s;

/* renamed from: com.ss.android.ugc.aweme.account.login.b.y */
public abstract class C21120y extends C21107l {

    /* renamed from: a */
    private C21108m f57390a;

    /* renamed from: b */
    public abstract void mo45170b(C12993e<C13120s> eVar);

    /* renamed from: c */
    public void onNeedSecureCaptcha(C12993e<C13120s> eVar) {
        mo45170b(eVar);
    }

    public void onSuccess(C12993e<C13120s> eVar) {
        super.onSuccess(eVar);
    }

    public C21120y(C21108m mVar) {
        this.f57390a = mVar;
    }

    public void onError(C12993e<C13120s> eVar, int i) {
        super.onError(eVar, i);
        mo45170b(eVar);
    }

    /* renamed from: a */
    public void onNeedCaptcha(C12993e<C13120s> eVar, String str) {
        if (eVar == null || TextUtils.isEmpty(str)) {
            mo45170b(eVar);
            return;
        }
        this.f57390a.mo45158a(str, eVar.f34001d, ((C13120s) eVar.f34007h).f34285r, new C21121z(this.f57390a, this, (C13120s) eVar.f34007h));
    }
}
