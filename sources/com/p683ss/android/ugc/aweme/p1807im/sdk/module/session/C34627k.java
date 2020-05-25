package com.p683ss.android.ugc.aweme.p1807im.sdk.module.session;

import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.k */
final /* synthetic */ class C34627k implements C1710e {

    /* renamed from: a */
    private final C34624i f89206a;

    C34627k(C34624i iVar) {
        this.f89206a = iVar;
    }

    public final void accept(Object obj) {
        C34624i iVar = this.f89206a;
        Integer num = (Integer) obj;
        StringBuilder sb = new StringBuilder("SessionListAdapter need update -> position:");
        sb.append(num);
        C32458a.m75141a(4, "DmHelper", sb.toString());
        iVar.notifyItemChanged(num.intValue() + iVar.mo72676g());
    }
}
