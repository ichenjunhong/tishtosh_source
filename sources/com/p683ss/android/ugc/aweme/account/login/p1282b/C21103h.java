package com.p683ss.android.ugc.aweme.account.login.p1282b;

import android.text.TextUtils;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p861f.p862a.C13104c;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13126c;

/* renamed from: com.ss.android.ugc.aweme.account.login.b.h */
public abstract class C21103h extends C13126c {

    /* renamed from: a */
    private C21108m f57360a;

    /* renamed from: a */
    public abstract void mo45156a(C12993e<C13104c> eVar);

    public abstract void onSuccess(C12993e<C13104c> eVar);

    public C21103h(C21108m mVar) {
        this.f57360a = mVar;
    }

    public void onError(C12993e<C13104c> eVar, int i) {
        mo45156a(eVar);
    }

    public /* synthetic */ void onNeedCaptcha(C12990b bVar, String str) {
        C12993e eVar = (C12993e) bVar;
        if (!TextUtils.isEmpty(str)) {
            this.f57360a.mo45158a(str, eVar.f34001d, ((C13104c) eVar.f34007h).f34285r, new C21104i(this.f57360a, this, (C13104c) eVar.f34007h));
            return;
        }
        mo45156a(eVar);
    }
}
