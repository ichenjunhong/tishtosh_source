package com.p683ss.android.ugc.aweme.account.login.p1280a;

import android.text.TextUtils;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p861f.p862a.C13121t;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13141r;
import com.p683ss.android.ugc.aweme.account.login.p1282b.C21108m;

/* renamed from: com.ss.android.ugc.aweme.account.login.a.c */
public abstract class C21047c extends C13141r {

    /* renamed from: a */
    private C21108m f57253a;

    /* renamed from: a */
    public abstract void mo45082a(int i);

    /* renamed from: a */
    public abstract void mo45083a(C12993e<C13121t> eVar);

    /* renamed from: a */
    public abstract void mo45084a(C12993e<C13121t> eVar, String str);

    /* renamed from: b */
    public abstract void mo45085b(C12993e<C13121t> eVar);

    public void onSuccess(C12993e<C13121t> eVar) {
        mo45083a(eVar);
    }

    public C21047c(C21108m mVar) {
        this.f57253a = mVar;
    }

    public void onError(C12993e<C13121t> eVar, int i) {
        if (eVar.f34000c == 1009 || eVar.f34000c == 1033) {
            mo45084a(eVar, String.valueOf(eVar.f34000c));
        } else if (eVar.f34000c == 1039) {
            mo45082a(eVar.f34000c);
        } else {
            mo45085b(eVar);
        }
    }

    public /* synthetic */ void onNeedCaptcha(C12990b bVar, String str) {
        C12993e eVar = (C12993e) bVar;
        if (!TextUtils.isEmpty(str)) {
            this.f57253a.mo45158a(str, eVar.f34001d, ((C13121t) eVar.f34007h).f34285r, new C21048d(this.f57253a, this, (C13121t) eVar.f34007h));
            return;
        }
        mo45085b(eVar);
    }
}
