package com.bytedance.android.live.core.setting;

import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.live.core.setting.o */
final /* synthetic */ class C4096o implements C1710e {

    /* renamed from: a */
    private final C40911 f11266a;

    C4096o(C40911 r1) {
        this.f11266a = r1;
    }

    public final void accept(Object obj) {
        this.f11266a.notifyItemChanged(((Integer) obj).intValue());
    }
}
