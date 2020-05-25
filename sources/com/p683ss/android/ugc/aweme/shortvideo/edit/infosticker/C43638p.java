package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.arch.lifecycle.C0199s;
import dmt.p2652av.video.C53030y;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.p */
final /* synthetic */ class C43638p implements C0199s {

    /* renamed from: a */
    private final C43535i f110536a;

    C43638p(C43535i iVar) {
        this.f110536a = iVar;
    }

    public final void onChanged(Object obj) {
        C43535i iVar = this.f110536a;
        Void voidR = (Void) obj;
        if (iVar.f110135D) {
            iVar.mo88658g();
            iVar.mo88620a(0, iVar.f110167j.mo42966A());
            iVar.f110168k.mo88489a().setValue(C53030y.m112773a((long) iVar.f110167j.mo43088s(((Long) iVar.f110163f.getPlayBoundary().f2712b).intValue())));
        }
    }
}
