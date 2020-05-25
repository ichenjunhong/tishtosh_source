package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.util.C15524o;
import com.google.android.gms.internal.ads.C16299uq;
import com.google.android.gms.internal.ads.acd;

@C16299uq
/* renamed from: com.google.android.gms.ads.internal.overlay.l */
public final class C15015l {
    /* renamed from: a */
    public static void m31056a(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z) {
        if (adOverlayInfoParcel.f38779k == 4 && adOverlayInfoParcel.f38771c == null) {
            if (adOverlayInfoParcel.f38770b != null) {
                adOverlayInfoParcel.f38770b.mo27201e();
            }
            C15004a.m31022a(context, adOverlayInfoParcel.f38769a, adOverlayInfoParcel.f38777i);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.f38781m.f46240d);
        intent.putExtra("shouldCallOnOverlayOpened", z);
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
        if (!C15524o.m32299g()) {
            intent.addFlags(524288);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        acd.m32581a(context, intent);
    }
}
