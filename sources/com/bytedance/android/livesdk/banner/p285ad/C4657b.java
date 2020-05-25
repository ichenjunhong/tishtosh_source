package com.bytedance.android.livesdk.banner.p285ad;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.common.utility.C9432q;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.banner.ad.b */
final /* synthetic */ class C4657b implements C1710e {

    /* renamed from: a */
    private final BannerAdView f12720a;

    /* renamed from: b */
    private final HSImageView f12721b;

    C4657b(BannerAdView bannerAdView, HSImageView hSImageView) {
        this.f12720a = bannerAdView;
        this.f12721b = hSImageView;
    }

    public final void accept(Object obj) {
        BannerAdView bannerAdView = this.f12720a;
        HSImageView hSImageView = this.f12721b;
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            hSImageView.setImageDrawable(new BitmapDrawable(bitmap));
            C9432q.m18691b((View) bannerAdView, 0);
            C4495a.m10823a().mo10301a((Object) new C4656a(true));
        }
    }
}
