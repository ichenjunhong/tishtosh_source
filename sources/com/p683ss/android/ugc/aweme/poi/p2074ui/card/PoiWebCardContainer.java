package com.p683ss.android.ugc.aweme.poi.p2074ui.card;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26429bn;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.card.PoiWebCardContainer */
public final class PoiWebCardContainer extends C26429bn implements C0183j {

    /* renamed from: g */
    public static final C39301a f100451g = new C39301a(null);

    /* renamed from: f */
    public final C0184k f100452f;

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.card.PoiWebCardContainer$a */
    public static final class C39301a {
        private C39301a() {
        }

        public /* synthetic */ C39301a(C52707g gVar) {
            this();
        }
    }

    @C0200t(mo345a = C0177a.ON_CREATE)
    public final void onCreate() {
        this.f69679b.mo55672a(this.f69678a);
    }

    @C0200t(mo345a = C0177a.ON_PAUSE)
    public final void onPause() {
        this.f69679b.mo55687d(this.f69678a);
    }

    @C0200t(mo345a = C0177a.ON_RESUME)
    public final void onResume() {
        this.f69679b.mo55685c(this.f69678a);
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void onDestroy() {
        this.f69679b.mo55690g(this.f69678a);
        this.f100452f.getLifecycle().mo325b(this);
    }
}
