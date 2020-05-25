package com.p683ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.p043v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.themechange.base.AVDmtImageView */
public final class AVDmtImageView extends AppCompatImageView {

    /* renamed from: a */
    public boolean f118188a;

    /* renamed from: b */
    private boolean f118189b;

    /* renamed from: c */
    private int f118190c;

    public AVDmtImageView(Context context) {
        this(context, null, 0, 6, null);
    }

    public AVDmtImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void setChangeColor(boolean z) {
        this.f118188a = z;
    }

    public final void setImageDrawable(Drawable drawable) {
        if (this.f118188a) {
            drawable = C46788b.m101632a(drawable, this.f118190c);
        }
        super.setImageDrawable(drawable);
    }

    public final void setSelected(boolean z) {
        int i;
        super.setSelected(z);
        if (z) {
            i = C46788b.m101630a(this.f118189b);
        } else {
            i = C46788b.f118235d.mo94011b(this.f118189b);
        }
        this.f118190c = i;
        setImageDrawable(getDrawable());
    }

    public AVDmtImageView(Context context, AttributeSet attributeSet, int i) {
        int i2;
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f118188a = true;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ce, R.attr.abh, R.attr.f5, R.attr.k9, R.attr.lt, R.attr.ml, R.attr.ow, R.attr.ox, R.attr.oy, R.attr.acm, R.attr.p2, R.attr.p3, R.attr.p4, R.attr.aco, R.attr.p5, R.attr.p6, R.attr.p7, R.attr.p8, R.attr.pl, R.attr.pm, R.attr.pn, R.attr.pp, R.attr.q4, R.attr.sk, R.attr.t7, R.attr.uk, R.attr.up, R.attr.uy, R.attr.v3, R.attr.vl, R.attr.ad9, R.attr.a04, R.attr.a1b, R.attr.a1d, R.attr.a1x, R.attr.a1y, R.attr.a3t, R.attr.a6c, R.attr.adn, R.attr.a6k, R.attr.a6o, R.attr.a72, R.attr.a_4, R.attr.adp, R.attr.a__});
            this.f118189b = obtainStyledAttributes.getBoolean(27, false);
            this.f118188a = obtainStyledAttributes.getBoolean(6, true);
            if (obtainStyledAttributes.getBoolean(11, true)) {
                i2 = C46788b.m101630a(this.f118189b);
            } else {
                i2 = C46788b.f118235d.mo94011b(this.f118189b);
            }
            this.f118190c = i2;
        }
        if (this.f118188a) {
            setImageDrawable(C46788b.m101632a(getDrawable(), this.f118190c));
        }
    }

    public /* synthetic */ AVDmtImageView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
