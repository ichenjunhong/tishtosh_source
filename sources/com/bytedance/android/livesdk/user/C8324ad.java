package com.bytedance.android.livesdk.user;

import com.bytedance.android.live.base.model.user.C3009i;
import p064c.p065a.p071d.C1715j;

/* renamed from: com.bytedance.android.livesdk.user.ad */
final /* synthetic */ class C8324ad implements C1715j {

    /* renamed from: a */
    private final C8348m f22665a;

    C8324ad(C8348m mVar) {
        this.f22665a = mVar;
    }

    /* renamed from: a */
    public final boolean mo6207a(Object obj) {
        C8348m mVar = this.f22665a;
        C3009i iVar = (C3009i) obj;
        return (iVar == null || mVar.f22712b == null || iVar.getId() != mVar.f22712b.getCurUserId()) ? false : true;
    }
}
