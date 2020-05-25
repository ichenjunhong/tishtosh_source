package com.p683ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.tools.C50179a.C50180a;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.themechange.base.AVDmtHorizontalImageTextLayout */
public final class AVDmtHorizontalImageTextLayout extends LinearLayout {

    /* renamed from: a */
    private AVDmtTextView f118142a;

    /* renamed from: b */
    private AVDmtImageView f118143b;

    /* renamed from: c */
    private String f118144c;

    /* renamed from: d */
    private Drawable f118145d;

    /* renamed from: e */
    private int f118146e;

    /* renamed from: f */
    private boolean f118147f;

    /* renamed from: g */
    private boolean f118148g;

    public AVDmtHorizontalImageTextLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public AVDmtHorizontalImageTextLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final void mo93958a() {
        AVDmtTextView aVDmtTextView = this.f118142a;
        if (aVDmtTextView == null) {
            C52711k.m112237a("avDmtTextView");
        }
        aVDmtTextView.mo93998b();
    }

    public final void setChangeColor(boolean z) {
        AVDmtImageView aVDmtImageView = this.f118143b;
        if (aVDmtImageView == null) {
            C52711k.m112237a("avDmtImageView");
        }
        aVDmtImageView.setChangeColor(z);
    }

    public final void setTextSize(int i) {
        AVDmtTextView aVDmtTextView = this.f118142a;
        if (aVDmtTextView == null) {
            C52711k.m112237a("avDmtTextView");
        }
        aVDmtTextView.setTextSize((float) i);
    }

    public final void setImageRes(int i) {
        AVDmtImageView aVDmtImageView = this.f118143b;
        if (aVDmtImageView == null) {
            C52711k.m112237a("avDmtImageView");
        }
        Context context = getContext();
        C52711k.m112236a((Object) context, "context");
        aVDmtImageView.setImageDrawable(context.getResources().getDrawable(i));
    }

    public final void setText(String str) {
        CharSequence charSequence = str;
        if (!TextUtils.isEmpty(charSequence)) {
            AVDmtTextView aVDmtTextView = this.f118142a;
            if (aVDmtTextView == null) {
                C52711k.m112237a("avDmtTextView");
            }
            aVDmtTextView.setText(charSequence);
        }
    }

    public AVDmtHorizontalImageTextLayout(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f118148g = true;
        Drawable a = C46788b.f118235d.mo94009a(context, attributeSet);
        if (a != null) {
            setBackground(a);
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ce, R.attr.abh, R.attr.f5, R.attr.k9, R.attr.lt, R.attr.ml, R.attr.ow, R.attr.ox, R.attr.oy, R.attr.acm, R.attr.p2, R.attr.p3, R.attr.p4, R.attr.aco, R.attr.p5, R.attr.p6, R.attr.p7, R.attr.p8, R.attr.pl, R.attr.pm, R.attr.pn, R.attr.pp, R.attr.q4, R.attr.sk, R.attr.t7, R.attr.uk, R.attr.up, R.attr.uy, R.attr.v3, R.attr.vl, R.attr.ad9, R.attr.a04, R.attr.a1b, R.attr.a1d, R.attr.a1x, R.attr.a1y, R.attr.a3t, R.attr.a6c, R.attr.adn, R.attr.a6k, R.attr.a6o, R.attr.a72, R.attr.a_4, R.attr.adp, R.attr.a__});
            this.f118144c = obtainStyledAttributes.getString(41);
            this.f118145d = obtainStyledAttributes.getDrawable(24);
            this.f118146e = (int) obtainStyledAttributes.getDimension(28, 0.0f);
            this.f118147f = obtainStyledAttributes.getBoolean(17, false);
            obtainStyledAttributes.recycle();
        }
        if (this.f118147f) {
            this.f118148g = C50180a.m108284a().f125721a;
        }
        AVDmtTextView aVDmtTextView = new AVDmtTextView(context, null, 0, 6, null);
        this.f118142a = aVDmtTextView;
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.leftMargin = (int) C9432q.m18687b(context, 4.0f);
        layoutParams.gravity = 16;
        AVDmtTextView aVDmtTextView2 = this.f118142a;
        if (aVDmtTextView2 == null) {
            C52711k.m112237a("avDmtTextView");
        }
        aVDmtTextView2.setLayoutParams(layoutParams);
        AVDmtImageView aVDmtImageView = new AVDmtImageView(context, null, 0, 6, null);
        this.f118143b = aVDmtImageView;
        LayoutParams layoutParams2 = new LayoutParams(-2, -2);
        layoutParams2.gravity = 16;
        if (!this.f118148g) {
            int b = (int) C9432q.m18687b(getContext(), 12.0f);
            layoutParams2.rightMargin = b;
            layoutParams2.leftMargin = b;
        }
        AVDmtImageView aVDmtImageView2 = this.f118143b;
        if (aVDmtImageView2 == null) {
            C52711k.m112237a("avDmtImageView");
        }
        aVDmtImageView2.setLayoutParams(layoutParams2);
        AVDmtImageView aVDmtImageView3 = this.f118143b;
        if (aVDmtImageView3 == null) {
            C52711k.m112237a("avDmtImageView");
        }
        addView(aVDmtImageView3);
        AVDmtTextView aVDmtTextView3 = this.f118142a;
        if (aVDmtTextView3 == null) {
            C52711k.m112237a("avDmtTextView");
        }
        addView(aVDmtTextView3);
        setPadding(this.f118146e, this.f118146e, this.f118146e, this.f118146e);
        setGravity(17);
        AVDmtTextView aVDmtTextView4 = this.f118142a;
        if (aVDmtTextView4 == null) {
            C52711k.m112237a("avDmtTextView");
        }
        aVDmtTextView4.setTextSize(13.0f);
        AVDmtTextView aVDmtTextView5 = this.f118142a;
        if (aVDmtTextView5 == null) {
            C52711k.m112237a("avDmtTextView");
        }
        aVDmtTextView5.setMaxLines(1);
        AVDmtTextView aVDmtTextView6 = this.f118142a;
        if (aVDmtTextView6 == null) {
            C52711k.m112237a("avDmtTextView");
        }
        aVDmtTextView6.setEllipsize(TruncateAt.END);
        AVDmtTextView aVDmtTextView7 = this.f118142a;
        if (aVDmtTextView7 == null) {
            C52711k.m112237a("avDmtTextView");
        }
        aVDmtTextView7.setVisibility(8);
        AVDmtImageView aVDmtImageView4 = this.f118143b;
        if (aVDmtImageView4 == null) {
            C52711k.m112237a("avDmtImageView");
        }
        aVDmtImageView4.setChangeColor(false);
        if (!TextUtils.isEmpty(this.f118144c)) {
            AVDmtTextView aVDmtTextView8 = this.f118142a;
            if (aVDmtTextView8 == null) {
                C52711k.m112237a("avDmtTextView");
            }
            aVDmtTextView8.setText(this.f118144c);
        }
        if (this.f118145d != null) {
            AVDmtImageView aVDmtImageView5 = this.f118143b;
            if (aVDmtImageView5 == null) {
                C52711k.m112237a("avDmtImageView");
            }
            aVDmtImageView5.setImageDrawable(this.f118145d);
        }
        if (this.f118148g) {
            AVDmtTextView aVDmtTextView9 = this.f118142a;
            if (aVDmtTextView9 == null) {
                C52711k.m112237a("avDmtTextView");
            }
            aVDmtTextView9.setVisibility(0);
        }
    }

    public /* synthetic */ AVDmtHorizontalImageTextLayout(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
