package com.p683ss.android.ugc.aweme.account.login.p1280a;

import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p861f.p862a.C13116o;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.login.p1282b.C21108m;
import com.p683ss.android.ugc.aweme.account.login.p1282b.C21112q;

/* renamed from: com.ss.android.ugc.aweme.account.login.a.g */
public abstract class C21051g extends C21112q {
    /* renamed from: a */
    public abstract void mo45096a(int i, String str);

    /* renamed from: b */
    public abstract void mo45098b(int i, String str);

    /* renamed from: b */
    public abstract void mo45099b(C12993e<C13116o> eVar);

    public C21051g(C21108m mVar) {
        super(mVar);
    }

    public void onSuccess(C12993e<C13116o> eVar) {
        super.onSuccess(eVar);
        mo45099b(eVar);
    }

    /* renamed from: a */
    public final void mo45097a(C12993e<C13116o> eVar) {
        C23826bi.m58451a(1, 3, (Object) eVar.f34001d);
        if (eVar.f34000c == 1202) {
            mo45096a(eVar.f34000c, eVar.f34001d);
            return;
        }
        if (eVar.f34000c != 1011) {
            mo45098b(eVar.f34000c, eVar.f34001d);
        }
    }
}
