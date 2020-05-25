package com.bytedance.android.livesdk.browser.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.core.widget.HSImageView;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.drawee.p930a.p931a.C13773e;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.browser.view.a */
public final class C4956a extends FrameLayout {

    /* renamed from: a */
    private HSImageView f13288a;

    /* renamed from: b */
    private HSImageView f13289b;

    public C4956a(Context context) {
        super(context);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.ar3, this, true);
        this.f13288a = (HSImageView) inflate.findViewById(R.id.fg);
        this.f13289b = (HSImageView) inflate.findViewById(R.id.fi);
        this.f13288a.setController(((C13773e) C13771c.m27870a().mo25723a("asset://com.ss.android.ies.live.sdk/ttlive_ic_loading_center.webp").mo25762c(true)).mo25763d());
        this.f13289b.setController(((C13773e) C13771c.m27870a().mo25723a("asset://com.ss.android.ies.live.sdk/ttlive_ic_loading_point.webp").mo25762c(true)).mo25763d());
    }
}
