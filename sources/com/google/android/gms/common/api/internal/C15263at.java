package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.at */
final class C15263at extends C15279bh {

    /* renamed from: a */
    private WeakReference<C15256am> f39409a;

    C15263at(C15256am amVar) {
        this.f39409a = new WeakReference<>(amVar);
    }

    /* renamed from: a */
    public final void mo28181a() {
        C15256am amVar = (C15256am) this.f39409a.get();
        if (amVar != null) {
            C15256am.m31590a(amVar);
        }
    }
}
