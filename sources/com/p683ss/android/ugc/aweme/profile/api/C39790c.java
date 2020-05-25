package com.p683ss.android.ugc.aweme.profile.api;

import android.arch.lifecycle.C0198r;
import com.p683ss.android.ugc.aweme.p1488ca.C24481a;
import com.p683ss.android.ugc.aweme.p1488ca.C24481a.C24482a;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.profile.api.c */
final /* synthetic */ class C39790c implements C0011g {

    /* renamed from: a */
    private final C0198r f101563a;

    C39790c(C0198r rVar) {
        this.f101563a = rVar;
    }

    public final Object then(C0013i iVar) {
        C0198r rVar = this.f101563a;
        if (iVar.mo33d()) {
            rVar.setValue(new C24481a(C24482a.ERROR, null, iVar.mo35f()));
        } else {
            rVar.setValue(new C24481a(C24482a.SUCCESS, iVar.mo34e(), null));
        }
        return null;
    }
}
