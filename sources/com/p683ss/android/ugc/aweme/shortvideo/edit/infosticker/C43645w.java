package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.arch.lifecycle.C0199s;
import dmt.p2652av.video.C53030y;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.w */
final /* synthetic */ class C43645w implements C0199s {

    /* renamed from: a */
    private final C43535i f110543a;

    C43645w(C43535i iVar) {
        this.f110543a = iVar;
    }

    public final void onChanged(Object obj) {
        C43535i iVar = this.f110543a;
        Long l = (Long) obj;
        if (iVar.f110135D && l != null) {
            iVar.f110168k.mo88489a().setValue(C53030y.m112773a((long) iVar.f110167j.mo43088s(l.intValue())));
        }
    }
}
