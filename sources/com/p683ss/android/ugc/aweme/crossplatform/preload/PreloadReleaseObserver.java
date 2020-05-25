package com.p683ss.android.ugc.aweme.crossplatform.preload;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.aweme.crossplatform.view.C27300c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.preload.PreloadReleaseObserver */
public final class PreloadReleaseObserver implements C0183j {

    /* renamed from: a */
    public final String f71957a;

    /* renamed from: b */
    public FragmentActivity f71958b;

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void onDestroy() {
        C27300c a = C27278a.m65729a(this.f71957a);
        C27278a.m65732b(this.f71957a);
        if (a != null) {
            a.mo55690g(this.f71958b);
        }
        this.f71958b = null;
    }

    public PreloadReleaseObserver(String str, FragmentActivity fragmentActivity) {
        C52711k.m112240b(str, "url");
        this.f71957a = str;
        this.f71958b = fragmentActivity;
    }
}
