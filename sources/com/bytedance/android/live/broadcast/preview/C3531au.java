package com.bytedance.android.live.broadcast.preview;

import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.live.broadcast.preview.au */
final /* synthetic */ class C3531au implements C1710e {

    /* renamed from: a */
    private final C3514al f10088a;

    C3531au(C3514al alVar) {
        this.f10088a = alVar;
    }

    public final void accept(Object obj) {
        C3514al alVar = this.f10088a;
        Boolean bool = (Boolean) obj;
        alVar.f10049d.setChecked(bool.booleanValue());
        if (bool.booleanValue() && !alVar.f10063r) {
            alVar.f10063r = true;
            alVar.f10049d.postDelayed(new C3536az(alVar), 300);
        }
    }
}
