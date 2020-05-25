package com.p683ss.android.ugc.aweme.account.login.p1282b;

import android.text.TextUtils;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p861f.p862a.C13118q;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13137n;

/* renamed from: com.ss.android.ugc.aweme.account.login.b.u */
public abstract class C21116u extends C13137n {

    /* renamed from: a */
    private C21108m f57382a;

    /* renamed from: a */
    public abstract void mo45166a(int i, String str);

    /* renamed from: a */
    public void mo45167a(String str) {
    }

    public C21116u(C21108m mVar) {
        this.f57382a = mVar;
    }

    public void onError(C12993e<C13118q> eVar, int i) {
        if (i == 1202 || i != 1011) {
            mo45166a(i, eVar.f34001d);
        } else {
            mo45167a("");
        }
    }

    public /* synthetic */ void onNeedCaptcha(C12990b bVar, String str) {
        C12993e eVar = (C12993e) bVar;
        if (!TextUtils.isEmpty(str)) {
            this.f57382a.mo45158a(str, eVar.f34001d, ((C13118q) eVar.f34007h).f34285r, new C21117v(this.f57382a, (C13118q) eVar.f34007h, this));
            return;
        }
        onError(eVar, eVar.f34000c);
    }
}
