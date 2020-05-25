package com.p683ss.android.ugc.aweme.account.login;

import android.os.Bundle;
import com.p683ss.android.ugc.aweme.C23826bi;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.account.login.ab */
final /* synthetic */ class C21054ab implements C0011g {

    /* renamed from: a */
    private final MusLoginActivity f57259a;

    C21054ab(MusLoginActivity musLoginActivity) {
        this.f57259a = musLoginActivity;
    }

    public final Object then(C0013i iVar) {
        MusLoginActivity musLoginActivity = this.f57259a;
        musLoginActivity.finish();
        if (C23826bi.m58466g()) {
            C23826bi.m58451a(1, 1, (Object) "");
        }
        musLoginActivity.mo45036d();
        C23826bi.m58461b(C23826bi.m58468i());
        return (Bundle) iVar.mo34e();
    }
}
