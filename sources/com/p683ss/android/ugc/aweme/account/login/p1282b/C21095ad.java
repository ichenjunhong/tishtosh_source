package com.p683ss.android.ugc.aweme.account.login.p1282b;

import android.text.TextUtils;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p861f.p862a.C13120s;

/* renamed from: com.ss.android.ugc.aweme.account.login.b.ad */
public abstract class C21095ad extends C21107l {

    /* renamed from: a */
    private C21108m f57347a;

    /* renamed from: a */
    public abstract void mo45149a(C12993e<C13120s> eVar);

    public void onSuccess(C12993e<C13120s> eVar) {
        super.onSuccess(eVar);
    }

    public C21095ad(C21108m mVar) {
        this.f57347a = mVar;
    }

    public void onError(C12993e<C13120s> eVar, int i) {
        super.onError(eVar, i);
        mo45149a(eVar);
    }

    public /* synthetic */ void onNeedCaptcha(C12990b bVar, String str) {
        C12993e eVar = (C12993e) bVar;
        if (eVar == null || TextUtils.isEmpty(str)) {
            mo45149a(eVar);
            return;
        }
        this.f57347a.mo45158a(str, eVar.f34001d, ((C13120s) eVar.f34007h).f34285r, new C21094ac(this.f57347a, this, (C13120s) eVar.f34007h));
    }
}
