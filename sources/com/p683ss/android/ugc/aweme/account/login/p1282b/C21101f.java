package com.p683ss.android.ugc.aweme.account.login.p1282b;

import android.text.TextUtils;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p861f.p862a.C13103b;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13125b;
import com.p683ss.android.ugc.aweme.account.C22165u;

/* renamed from: com.ss.android.ugc.aweme.account.login.b.f */
public abstract class C21101f extends C13125b {

    /* renamed from: a */
    private C21108m f57355a;

    /* renamed from: a */
    public abstract void mo45155a(C12993e<C13103b> eVar);

    public abstract void onSuccess(C12993e<C13103b> eVar);

    public C21101f(C21108m mVar) {
        this.f57355a = mVar;
    }

    public void onError(C12993e<C13103b> eVar, int i) {
        mo45155a(eVar);
    }

    public /* synthetic */ void onNeedCaptcha(C12990b bVar, String str) {
        C12993e eVar = (C12993e) bVar;
        if (!TextUtils.isEmpty(str)) {
            this.f57355a.mo45158a(str, eVar.f34001d, C22165u.f59769i, new C21102g(this.f57355a, this, (C13103b) eVar.f34007h));
            return;
        }
        mo45155a(eVar);
    }
}
