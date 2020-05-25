package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.C15563abr;
import com.google.android.gms.internal.ads.C16299uq;
import com.google.android.gms.internal.ads.acd;

@C16299uq
/* renamed from: com.google.android.gms.ads.internal.q */
final class C15030q extends C15563abr {

    /* renamed from: a */
    final /* synthetic */ C15002n f38837a;

    /* renamed from: b */
    private final int f38838b;

    public C15030q(C15002n nVar, int i) {
        this.f38837a = nVar;
        this.f38838b = i;
    }

    /* renamed from: x_ */
    public final void mo27697x_() {
    }

    /* renamed from: a */
    public final void mo27696a() {
        zzar zzar = new zzar(this.f38837a.f38501e.f38619M, acd.m32615m(this.f38837a.f38501e.f38629c), this.f38837a.f38757j, this.f38837a.f38758k, this.f38837a.f38501e.f38619M ? this.f38838b : -1, this.f38837a.f38759l, this.f38837a.f38501e.f38636j.f40093L, this.f38837a.f38501e.f38636j.f40096O);
        int requestedOrientation = this.f38837a.f38501e.f38636j.f40104b.getRequestedOrientation();
        if (requestedOrientation == -1) {
            requestedOrientation = this.f38837a.f38501e.f38636j.f40110h;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(this.f38837a, this.f38837a, this.f38837a, this.f38837a.f38501e.f38636j.f40104b, requestedOrientation, this.f38837a.f38501e.f38631e, this.f38837a.f38501e.f38636j.f40082A, zzar);
        acd.f40245a.post(new C15031r(this, adOverlayInfoParcel));
    }
}
