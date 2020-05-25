package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.C15015l;

/* renamed from: com.google.android.gms.internal.ads.qz */
final class C16200qz implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AdOverlayInfoParcel f45452a;

    /* renamed from: b */
    private final /* synthetic */ zzasq f45453b;

    C16200qz(zzasq zzasq, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f45453b = zzasq;
        this.f45452a = adOverlayInfoParcel;
    }

    public final void run() {
        C15015l.m31056a(this.f45453b.f46094a, this.f45452a, true);
    }
}
