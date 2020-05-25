package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.C15015l;

/* renamed from: com.google.android.gms.ads.internal.r */
final class C15031r implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AdOverlayInfoParcel f38839a;

    /* renamed from: b */
    private final /* synthetic */ C15030q f38840b;

    C15031r(C15030q qVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f38840b = qVar;
        this.f38839a = adOverlayInfoParcel;
    }

    public final void run() {
        C15015l.m31056a(this.f38840b.f38837a.f38501e.f38629c, this.f38839a, true);
    }
}
