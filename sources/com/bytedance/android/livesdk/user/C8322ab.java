package com.bytedance.android.livesdk.user;

import com.bytedance.android.live.base.model.user.C3009i;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.user.ab */
final /* synthetic */ class C8322ab implements C1710e {

    /* renamed from: a */
    private final C8348m f22663a;

    C8322ab(C8348m mVar) {
        this.f22663a = mVar;
    }

    public final void accept(Object obj) {
        C8348m mVar = this.f22663a;
        C3009i iVar = (C3009i) obj;
        mVar.f22714d.onNext(iVar);
        mVar.f22711a = iVar;
    }
}
