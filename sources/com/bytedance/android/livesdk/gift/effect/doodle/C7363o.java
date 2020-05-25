package com.bytedance.android.livesdk.gift.effect.doodle;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import com.bytedance.android.live.core.widget.HSImageView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.gift.effect.doodle.o */
public final class C7363o extends C1352v {

    /* renamed from: a */
    public HSImageView f20079a;

    /* renamed from: b */
    public C7365p f20080b;

    /* renamed from: c */
    private Context f20081c;

    /* renamed from: d */
    private View f20082d;

    public C7363o(View view) {
        super(view);
        this.f20082d = view;
        this.f20081c = view.getContext();
        this.f20079a = (HSImageView) view.findViewById(R.id.ezi);
    }

    /* renamed from: a */
    public final void mo13627a(boolean z) {
        float f;
        int i;
        if (this.f20082d != null && this.f20079a != null) {
            HSImageView hSImageView = this.f20079a;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.75f;
            }
            hSImageView.setAlpha(f);
            View view = this.f20082d;
            if (z) {
                i = R.drawable.dzp;
            } else {
                i = R.drawable.dzq;
            }
            view.setBackgroundResource(i);
        }
    }
}
