package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.internal.ads.C16299uq;
import com.google.android.gms.internal.ads.abv;

@C16299uq
/* renamed from: com.google.android.gms.ads.internal.overlay.r */
public final class C15021r extends C15006c {
    public C15021r(Activity activity) {
        super(activity);
    }

    /* renamed from: a */
    public final void mo27672a(Bundle bundle) {
        abv.m32494a("AdOverlayParcel is null or does not contain valid overlay type.");
        this.f38789d = 3;
        this.f38786a.finish();
    }
}
