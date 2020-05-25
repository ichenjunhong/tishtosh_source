package com.p683ss.android.ugc.aweme.account.login.p1282b;

import android.text.TextUtils;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p861f.p862a.C13111j;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13132i;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.p1277j.C20994a;
import com.p683ss.android.ugc.aweme.account.p1277j.C20994a.C20995a;
import com.p683ss.android.ugc.aweme.account.p1277j.C20994a.C20996b;
import com.p683ss.android.ugc.aweme.account.util.C22282t;

/* renamed from: com.ss.android.ugc.aweme.account.login.b.p */
public abstract class C21111p extends C13132i {

    /* renamed from: a */
    private C21108m f57373a;

    /* renamed from: a */
    public void mo45162a(C12993e<C13111j> eVar) {
    }

    public C21111p(C21108m mVar) {
        this.f57373a = mVar;
    }

    public /* synthetic */ void onNeedSecureCaptcha(C12990b bVar) {
        C12993e eVar = (C12993e) bVar;
        super.onNeedSecureCaptcha(eVar);
        mo45162a(eVar);
    }

    public void onSuccess(C12993e<C13111j> eVar) {
        C23826bi.m58455a(((C13111j) eVar.f34007h).mo24646b());
        C22282t.m55144b(true);
    }

    public void onError(C12993e<C13111j> eVar, int i) {
        mo45162a(eVar);
    }

    public /* synthetic */ void onNeedCaptcha(C12990b bVar, String str) {
        C12993e eVar = (C12993e) bVar;
        if (eVar == null || TextUtils.isEmpty(str)) {
            mo45162a(eVar);
            return;
        }
        String valueOf = String.valueOf(eVar.f34000c);
        String str2 = eVar.f34001d;
        C20996b bVar2 = C20996b.LOGIN_BY_PASS;
        C20995a aVar = C20995a.PHONE_NUMBER_PASS;
        StringBuilder sb = new StringBuilder("on need captcha:");
        sb.append(str);
        C20994a.m53364a(valueOf, str2, bVar2, aVar, sb.toString());
        this.f57373a.mo45158a(str, eVar.f34001d, ((C13111j) eVar.f34007h).f34285r, new C21110o(this.f57373a, this, (C13111j) eVar.f34007h));
    }
}
