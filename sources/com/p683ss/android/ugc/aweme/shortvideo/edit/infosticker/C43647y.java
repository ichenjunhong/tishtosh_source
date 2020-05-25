package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.support.p030v4.p038f.C0781c;
import dmt.p2652av.video.C53030y;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.y */
final /* synthetic */ class C43647y implements C0781c {

    /* renamed from: a */
    private final C43535i f110547a;

    /* renamed from: b */
    private final boolean f110548b;

    C43647y(C43535i iVar, boolean z) {
        this.f110547a = iVar;
        this.f110548b = z;
    }

    public final void accept(Object obj) {
        C43535i iVar = this.f110547a;
        boolean z = this.f110548b;
        Void voidR = (Void) obj;
        boolean z2 = !z;
        iVar.f110161d.setVisibility(z2 ? 0 : 4);
        if (z2) {
            iVar.f110161d.mo88449e();
        }
        if (z) {
            iVar.f110161d.f109936k = InfoStickerEditView.f109903l;
            iVar.f110167j.mo43019a(true);
            return;
        }
        iVar.f110161d.f109936k = 0;
        iVar.f110168k.mo88489a().setValue(C53030y.m112775b(0));
        iVar.f110167j.mo43019a(true);
        iVar.f110168k.mo88489a().setValue(C53030y.m112772a());
    }
}
