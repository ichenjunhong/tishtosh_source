package com.p683ss.android.ugc.aweme.p1807im.sdk.module.session;

import android.arch.lifecycle.C0199s;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.j */
final /* synthetic */ class C34626j implements C0199s {

    /* renamed from: a */
    private final C34624i f89205a;

    C34626j(C34624i iVar) {
        this.f89205a = iVar;
    }

    public final void onChanged(Object obj) {
        C34624i iVar = this.f89205a;
        String str = (String) obj;
        StringBuilder sb = new StringBuilder("SessionListAdapter rev:");
        sb.append(str);
        C32458a.m75141a(4, "DmHelper", sb.toString());
        iVar.mo72675a(str, (C1710e<Integer>) new C34627k<Integer>(iVar));
    }
}
