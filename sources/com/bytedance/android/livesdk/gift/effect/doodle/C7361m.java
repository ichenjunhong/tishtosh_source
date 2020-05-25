package com.bytedance.android.livesdk.gift.effect.doodle;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.p279af.C4577ap;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.gift.effect.doodle.m */
public final class C7361m extends C1352v {

    /* renamed from: a */
    public Context f20070a;

    /* renamed from: b */
    public View f20071b;

    /* renamed from: c */
    public HSImageView f20072c;

    /* renamed from: d */
    public TextView f20073d;

    /* renamed from: e */
    public TextView f20074e;

    /* renamed from: f */
    public C7365p f20075f;

    /* renamed from: g */
    private View f20076g;

    /* renamed from: a */
    public final void mo13625a(boolean z) {
        int i;
        if (this.f20076g != null) {
            View view = this.f20076g;
            if (z) {
                i = R.drawable.e05;
            } else {
                i = R.drawable.e06;
            }
            view.setBackgroundResource(i);
        }
    }

    public C7361m(View view) {
        super(view);
        this.f20070a = view.getContext();
        this.f20071b = view;
        this.f20076g = view.findViewById(R.id.edl);
        this.f20072c = (HSImageView) view.findViewById(R.id.a22);
        this.f20073d = (TextView) view.findViewById(R.id.bpp);
        this.f20074e = (TextView) view.findViewById(R.id.a5f);
        int a = C4577ap.m10991a(this.f20070a) / 4;
        LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = a;
        view.setLayoutParams(layoutParams);
    }
}
