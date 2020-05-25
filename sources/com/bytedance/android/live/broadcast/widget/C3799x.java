package com.bytedance.android.live.broadcast.widget;

import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.live.broadcast.widget.x */
final /* synthetic */ class C3799x implements C1710e {

    /* renamed from: a */
    private final C3796v f10750a;

    C3799x(C3796v vVar) {
        this.f10750a = vVar;
    }

    public final void accept(Object obj) {
        C3796v vVar = this.f10750a;
        Boolean bool = (Boolean) obj;
        vVar.f10732d.setChecked(bool.booleanValue());
        if (bool.booleanValue() && !vVar.f10737i) {
            vVar.f10737i = true;
            vVar.f10732d.postDelayed(new C3801z(vVar), 300);
        }
    }
}
