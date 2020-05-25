package com.p683ss.android.ugc.aweme.account.login.p1282b;

import android.text.TextUtils;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p861f.p862a.C13119r;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13138o;

/* renamed from: com.ss.android.ugc.aweme.account.login.b.w */
public abstract class C21118w extends C13138o {

    /* renamed from: a */
    private C21108m f57386a;

    /* renamed from: a */
    public abstract void mo45168a(C12993e<C13119r> eVar);

    public abstract void onSuccess(C12993e<C13119r> eVar);

    public C21118w(C21108m mVar) {
        this.f57386a = mVar;
    }

    public void onError(C12993e<C13119r> eVar, int i) {
        mo45168a(eVar);
    }

    public /* synthetic */ void onNeedCaptcha(C12990b bVar, String str) {
        C12993e eVar = (C12993e) bVar;
        if (eVar == null || TextUtils.isEmpty(str)) {
            mo45168a(eVar);
            return;
        }
        this.f57386a.mo45158a(str, eVar.f34001d, ((C13119r) eVar.f34007h).f34285r, new C21119x(this.f57386a, this, (C13119r) eVar.f34007h));
    }
}
