package com.bytedance.android.live.broadcast.preview;

import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.live.broadcast.preview.y */
final /* synthetic */ class C3615y implements C1710e {

    /* renamed from: a */
    private final C3589i f10294a;

    C3615y(C3589i iVar) {
        this.f10294a = iVar;
    }

    public final void accept(Object obj) {
        C3589i iVar = this.f10294a;
        Boolean bool = (Boolean) obj;
        iVar.f10251i.setChecked(bool.booleanValue());
        if (bool.booleanValue() && !iVar.f10187A) {
            iVar.f10187A = true;
            iVar.f10251i.postDelayed(new C3503aa(iVar), 300);
        }
    }
}
