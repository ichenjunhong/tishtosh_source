package com.p683ss.android.ugc.aweme.account.login.p1282b;

import android.text.TextUtils;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p861f.p862a.C13102a;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13124a;

/* renamed from: com.ss.android.ugc.aweme.account.login.b.c */
public abstract class C21098c extends C13124a {

    /* renamed from: a */
    private C21108m f57351a;

    /* renamed from: a */
    public abstract void mo45152a(C12993e<C13102a> eVar);

    public abstract void onSuccess(C12993e<C13102a> eVar);

    public C21098c(C21108m mVar) {
        this.f57351a = mVar;
    }

    public void onError(C12993e<C13102a> eVar, int i) {
        mo45152a(eVar);
    }

    public /* synthetic */ void onNeedCaptcha(C12990b bVar, String str) {
        C12993e eVar = (C12993e) bVar;
        if (!TextUtils.isEmpty(str)) {
            this.f57351a.mo45158a(str, eVar.f34001d, ((C13102a) eVar.f34007h).f34285r, new C21099d(this.f57351a, this, (C13102a) eVar.f34007h));
            return;
        }
        mo45152a(eVar);
    }
}
