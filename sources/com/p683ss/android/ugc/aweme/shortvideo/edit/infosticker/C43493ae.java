package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker;

import com.p683ss.android.ugc.aweme.base.p1412d.p1413a.C23522b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.ae */
final /* synthetic */ class C43493ae implements C23522b {

    /* renamed from: a */
    private final C43535i f109979a;

    C43493ae(C43535i iVar) {
        this.f109979a = iVar;
    }

    /* renamed from: a */
    public final void mo48682a(Object obj) {
        C43535i iVar = this.f109979a;
        C43501am amVar = (C43501am) obj;
        if ((iVar.mo88590a() || iVar.mo88591b()) && ((iVar.f110161d.f109936k == InfoStickerEditView.f109903l && !amVar.f110020x) || (iVar.f110161d.f109936k == InfoStickerEditView.f109904m && amVar.f110020x))) {
            if (iVar.mo88591b()) {
                iVar.mo88629a((C43509at) amVar, 1);
                return;
            }
            iVar.mo88628a((C43509at) amVar);
        }
    }
}
