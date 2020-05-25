package com.bytedance.android.livesdk.gift.effect.entry.view;

import android.graphics.Bitmap;
import android.support.p030v4.graphics.drawable.C0810b;
import android.support.p030v4.graphics.drawable.C0812d;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.gift.effect.entry.view.d */
final /* synthetic */ class C7411d implements C1710e {

    /* renamed from: a */
    private final LandscapeNobleEnterTrayView f20294a;

    C7411d(LandscapeNobleEnterTrayView landscapeNobleEnterTrayView) {
        this.f20294a = landscapeNobleEnterTrayView;
    }

    public final void accept(Object obj) {
        LandscapeNobleEnterTrayView landscapeNobleEnterTrayView = this.f20294a;
        C0810b a = C0812d.m2344a(landscapeNobleEnterTrayView.getResources(), (Bitmap) obj);
        a.mo2609a((float) LandscapeNobleEnterTrayView.f20230h);
        a.setAlpha(178);
        landscapeNobleEnterTrayView.setBackgroundDrawable(a);
    }
}
