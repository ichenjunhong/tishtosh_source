package com.p683ss.android.ugc.aweme.p1308ad.button;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.p030v4.content.C0726c;
import android.util.AttributeSet;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.ad.button.FeedAdButtonView */
public final class FeedAdButtonView extends BaseFeedAdButtonView {
    public FeedAdButtonView(Context context) {
        this(context, null, 0, 6, null);
    }

    public FeedAdButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final int getLayoutId$ad_impl_tiktokI18nRelease() {
        return R.layout.bi6;
    }

    public final void setLabelVisibility$ad_impl_tiktokI18nRelease(int i) {
        setVisibility(i);
    }

    /* renamed from: a */
    public final void mo46467a(int i, int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius((float) getResources().getDimensionPixelOffset(R.dimen.zd));
        gradientDrawable.setColor(i);
        setBackground(gradientDrawable);
    }

    public FeedAdButtonView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        setDefaultBackgroundColor$ad_impl_tiktokI18nRelease(C0726c.m2098c(context, R.color.a3f));
    }

    public /* synthetic */ FeedAdButtonView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
