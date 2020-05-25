package com.p683ss.android.ugc.aweme.account.agegate.model;

import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47957v;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.account.agegate.model.d */
final /* synthetic */ class C20890d implements C0011g {

    /* renamed from: a */
    private final C20887a f56864a;

    C20890d(C20887a aVar) {
        this.f56864a = aVar;
    }

    public final Object then(C0013i iVar) {
        C20887a aVar = this.f56864a;
        if (!C47957v.m103770a(iVar)) {
            return null;
        }
        C23826bi.m58457a((User) iVar.mo34e());
        return (AgeGateResponse) aVar.getData();
    }
}
