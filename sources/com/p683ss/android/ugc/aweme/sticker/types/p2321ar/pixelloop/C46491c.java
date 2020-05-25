package com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop;

import android.app.Activity;
import android.content.Intent;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C44149m;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.pixelloop.c */
public final class C46491c implements C44149m {

    /* renamed from: a */
    private final Activity f117320a;

    /* renamed from: a */
    public final void mo78609a() {
    }

    public C46491c(Activity activity) {
        this.f117320a = activity;
    }

    /* renamed from: a */
    public final void mo78610a(int i, int i2, Intent intent) {
        C52711k.m112240b(intent, "data");
        if (this.f117320a != null) {
            this.f117320a.setResult(-1, intent);
            this.f117320a.finish();
            this.f117320a.overridePendingTransition(0, R.anim.r);
        }
    }
}
