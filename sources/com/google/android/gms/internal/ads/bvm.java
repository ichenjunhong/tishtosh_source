package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C14963ax;

final class bvm implements agq<C16090mx> {

    /* renamed from: a */
    private final /* synthetic */ bvi f44055a;

    bvm(bvi bvi) {
        this.f44055a = bvi;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo28832a(Object obj) {
        C16090mx mxVar = (C16090mx) obj;
        bvi bvi = this.f44055a;
        mxVar.mo31167b("/visibilityChanged", bvi.f44048f);
        mxVar.mo31167b("/untrackActiveViewUnit", bvi.f44047e);
        mxVar.mo31167b("/updateActiveView", bvi.f44046d);
        if (C14963ax.m30849s().mo28557a(bvi.f44043a)) {
            mxVar.mo31167b("/logScionEvent", bvi.f44049g);
        }
    }
}
