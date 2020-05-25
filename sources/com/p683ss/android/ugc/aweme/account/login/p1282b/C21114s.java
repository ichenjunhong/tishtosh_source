package com.p683ss.android.ugc.aweme.account.login.p1282b;

import android.text.TextUtils;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p861f.p862a.C13115n;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13135l;

/* renamed from: com.ss.android.ugc.aweme.account.login.b.s */
public abstract class C21114s extends C13135l {

    /* renamed from: a */
    private C21108m f57378a;

    /* renamed from: a */
    public abstract void mo45164a(int i, String str);

    /* renamed from: a */
    public void mo45165a(String str) {
    }

    public C21114s(C21108m mVar) {
        this.f57378a = mVar;
    }

    public void onError(C12993e<C13115n> eVar, int i) {
        if (i == 1202 || i != 1011) {
            mo45164a(i, eVar.f34001d);
        } else {
            mo45165a(((C13115n) eVar.f34007h).f34296d);
        }
    }

    public /* synthetic */ void onNeedCaptcha(C12990b bVar, String str) {
        C12993e eVar = (C12993e) bVar;
        if (!TextUtils.isEmpty(str)) {
            this.f57378a.mo45158a(str, eVar.f34001d, ((C13115n) eVar.f34007h).f34285r, new C21115t(this.f57378a, (C13115n) eVar.f34007h, this));
            return;
        }
        onError(eVar, eVar.f34000c);
    }
}
