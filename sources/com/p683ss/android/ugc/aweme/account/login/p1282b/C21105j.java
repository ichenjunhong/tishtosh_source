package com.p683ss.android.ugc.aweme.account.login.p1282b;

import android.text.TextUtils;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p861f.p862a.C13105d;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13127d;
import com.p683ss.android.ugc.aweme.account.C22165u;

/* renamed from: com.ss.android.ugc.aweme.account.login.b.j */
public abstract class C21105j extends C13127d {

    /* renamed from: a */
    private C21108m f57365a;

    /* renamed from: a */
    public abstract void mo45157a(C12993e<C13105d> eVar);

    public abstract void onSuccess(C12993e<C13105d> eVar);

    public C21105j(C21108m mVar) {
        this.f57365a = mVar;
    }

    public void onError(C12993e<C13105d> eVar, int i) {
        mo45157a(eVar);
    }

    public /* synthetic */ void onNeedCaptcha(C12990b bVar, String str) {
        C12993e eVar = (C12993e) bVar;
        if (!TextUtils.isEmpty(str)) {
            this.f57365a.mo45158a(str, eVar.f34001d, C22165u.f59773m, new C21106k(this.f57365a, this, (C13105d) eVar.f34007h));
            return;
        }
        mo45157a(eVar);
    }
}
