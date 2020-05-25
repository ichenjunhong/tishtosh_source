package com.bytedance.android.livesdk.gift.panel;

import android.arch.lifecycle.C0199s;

/* renamed from: com.bytedance.android.livesdk.gift.panel.e */
final /* synthetic */ class C7538e implements C0199s {

    /* renamed from: a */
    private final C7521a f20697a;

    C7538e(C7521a aVar) {
        this.f20697a = aVar;
    }

    public final void onChanged(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f20697a.dismiss();
    }
}
