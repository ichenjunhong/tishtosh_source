package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* renamed from: com.google.android.gms.common.api.internal.cl */
final class C15313cl extends C15279bh {

    /* renamed from: a */
    private final /* synthetic */ Dialog f39511a;

    /* renamed from: b */
    private final /* synthetic */ C15312ck f39512b;

    C15313cl(C15312ck ckVar, Dialog dialog) {
        this.f39512b = ckVar;
        this.f39511a = dialog;
    }

    /* renamed from: a */
    public final void mo28181a() {
        this.f39512b.f39509a.mo28241f();
        if (this.f39511a.isShowing()) {
            this.f39511a.dismiss();
        }
    }
}
