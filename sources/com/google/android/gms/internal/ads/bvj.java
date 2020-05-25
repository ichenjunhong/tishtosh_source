package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C14963ax;

final class bvj implements agq<C16090mx> {

    /* renamed from: a */
    private final /* synthetic */ bvi f44052a;

    bvj(bvi bvi) {
        this.f44052a = bvi;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo28832a(Object obj) {
        C16090mx mxVar = (C16090mx) obj;
        this.f44052a.f44045c = true;
        bvi bvi = this.f44052a;
        mxVar.mo31166a("/updateActiveView", bvi.f44046d);
        mxVar.mo31166a("/untrackActiveViewUnit", bvi.f44047e);
        mxVar.mo31166a("/visibilityChanged", bvi.f44048f);
        if (C14963ax.m30849s().mo28557a(bvi.f44043a)) {
            mxVar.mo31166a("/logScionEvent", bvi.f44049g);
        }
    }
}
