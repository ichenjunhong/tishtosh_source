package com.p683ss.android.ugc.aweme.account.login.p1282b;

import android.text.TextUtils;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p861f.p862a.C13116o;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13133j;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.p1277j.C20994a;
import com.p683ss.android.ugc.aweme.account.util.C22282t;

/* renamed from: com.ss.android.ugc.aweme.account.login.b.q */
public abstract class C21112q extends C13133j {

    /* renamed from: a */
    protected C21108m f57374a;

    /* renamed from: a */
    public void mo45097a(C12993e<C13116o> eVar) {
    }

    public C21112q(C21108m mVar) {
        this.f57374a = mVar;
    }

    public void onSuccess(C12993e<C13116o> eVar) {
        if (eVar.f34007h != null && ((C13116o) eVar.f34007h).f34302e != null) {
            C23826bi.m58455a(((C13116o) eVar.f34007h).mo24646b());
            C22282t.m55144b(true);
        }
    }

    public void onError(C12993e<C13116o> eVar, int i) {
        mo45097a(eVar);
    }

    /* renamed from: a */
    public void onNeedCaptcha(C12993e<C13116o> eVar, String str) {
        if (TextUtils.isEmpty(str)) {
            mo45097a(eVar);
            return;
        }
        String valueOf = String.valueOf(eVar.f34000c);
        String str2 = eVar.f34001d;
        StringBuilder sb = new StringBuilder("on need captcha:");
        sb.append(str);
        C20994a.m53364a(valueOf, str2, null, null, sb.toString());
        this.f57374a.mo45158a(str, eVar.f34001d, ((C13116o) eVar.f34007h).f34285r, new C21113r(this.f57374a, this, (C13116o) eVar.f34007h));
    }
}
