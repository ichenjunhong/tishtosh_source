package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.bv */
final /* synthetic */ class C15738bv implements Callable {

    /* renamed from: a */
    private final C15737bu f44029a;

    C15738bv(C15737bu buVar) {
        this.f44029a = buVar;
    }

    public final Object call() {
        return this.f44029a.f43897e.getString("flag_configuration", "{}");
    }
}
