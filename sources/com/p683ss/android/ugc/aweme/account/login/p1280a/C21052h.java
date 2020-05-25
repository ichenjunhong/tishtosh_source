package com.p683ss.android.ugc.aweme.account.login.p1280a;

import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p861f.p862a.C13120s;
import com.p683ss.android.ugc.aweme.account.login.p1282b.C21108m;
import com.p683ss.android.ugc.aweme.account.login.p1282b.C21120y;

/* renamed from: com.ss.android.ugc.aweme.account.login.a.h */
public abstract class C21052h extends C21120y {
    /* renamed from: a */
    public abstract void mo45100a();

    /* renamed from: a */
    public abstract void mo45101a(int i);

    /* renamed from: a */
    public void mo45102a(int i, String str) {
    }

    /* renamed from: a */
    public abstract void mo45103a(C12993e<C13120s> eVar);

    /* renamed from: a */
    public abstract void mo45104a(String str, String str2);

    /* renamed from: b */
    public void mo45105b(int i) {
    }

    public void onSuccess(C12993e<C13120s> eVar) {
    }

    public C21052h(C21108m mVar) {
        super(mVar);
    }

    public /* synthetic */ void onResponse(C12990b bVar) {
        C12993e eVar = (C12993e) bVar;
        if (eVar.f33998a) {
            mo45100a();
        } else if (needShowPicCaptcha(eVar)) {
            mo45104a(getCaptchaInfo(eVar), eVar.f34001d);
        } else if (eVar.f34000c == 1003 || eVar.f34000c == 1202) {
            mo45101a(eVar.f34000c);
        } else if (eVar.f34000c == 1001) {
            mo45102a(eVar.f34000c, eVar.f34001d);
        } else if (eVar.f34000c == 1105) {
            mo45105b(eVar.f34000c);
        } else {
            mo45103a(eVar);
        }
    }
}
