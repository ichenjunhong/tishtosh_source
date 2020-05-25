package com.p683ss.android.ugc.aweme.account.login.p1282b;

import android.text.TextUtils;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p861f.p863b.C13162t.C13163a;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13140q;

/* renamed from: com.ss.android.ugc.aweme.account.login.b.aa */
public abstract class C21092aa extends C13140q {

    /* renamed from: a */
    private C21108m f57338a;

    /* renamed from: b */
    private String f57339b;

    /* renamed from: c */
    private int f57340c;

    /* renamed from: a */
    public abstract void mo45147a(C12993e<C13163a> eVar);

    /* renamed from: b */
    public abstract void mo45148b(C12993e<C13163a> eVar);

    public /* synthetic */ void onResponse(C12990b bVar) {
        C12993e eVar = (C12993e) bVar;
        if (eVar.f33998a) {
            mo45147a(eVar);
        } else if (!((C13163a) eVar.f34007h).mo24770c() || TextUtils.isEmpty(((C13163a) eVar.f34007h).f34277j)) {
            mo45148b(eVar);
        } else {
            this.f57338a.mo45158a(((C13163a) eVar.f34007h).f34277j, ((C13163a) eVar.f34007h).f34276i, this.f57340c, new C21093ab(this.f57338a, this.f57339b, this));
        }
    }

    public C21092aa(C21108m mVar, String str, int i) {
        this.f57338a = mVar;
        this.f57339b = str;
        this.f57340c = i;
    }
}
