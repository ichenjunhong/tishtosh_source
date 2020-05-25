package com.p683ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.design.widget.CheckableImageButton;
import android.util.AttributeSet;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.themechange.base.AVDmtCheckableImageButton */
public final class AVDmtCheckableImageButton extends CheckableImageButton {

    /* renamed from: a */
    private Drawable f118139a;

    /* renamed from: b */
    private Drawable f118140b;

    /* renamed from: c */
    private boolean f118141c;

    public final void toggle() {
        Drawable drawable;
        super.toggle();
        if (isChecked()) {
            drawable = this.f118139a;
        } else {
            drawable = this.f118140b;
        }
        setImageDrawable(drawable);
    }

    public AVDmtCheckableImageButton(Context context) {
        C52711k.m112240b(context, "context");
        this(context, null, 0);
    }

    public AVDmtCheckableImageButton(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(attributeSet, "attrs");
        this(context, attributeSet, 0);
    }

    public AVDmtCheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f118141c = true;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ce, R.attr.abh, R.attr.f5, R.attr.k9, R.attr.lt, R.attr.ml, R.attr.ow, R.attr.ox, R.attr.oy, R.attr.acm, R.attr.p2, R.attr.p3, R.attr.p4, R.attr.aco, R.attr.p5, R.attr.p6, R.attr.p7, R.attr.p8, R.attr.pl, R.attr.pm, R.attr.pn, R.attr.pp, R.attr.q4, R.attr.sk, R.attr.t7, R.attr.uk, R.attr.up, R.attr.uy, R.attr.v3, R.attr.vl, R.attr.ad9, R.attr.a04, R.attr.a1b, R.attr.a1d, R.attr.a1x, R.attr.a1y, R.attr.a3t, R.attr.a6c, R.attr.adn, R.attr.a6k, R.attr.a6o, R.attr.a72, R.attr.a_4, R.attr.adp, R.attr.a__});
            boolean z = obtainStyledAttributes.getBoolean(27, false);
            this.f118141c = obtainStyledAttributes.getBoolean(6, true);
            this.f118139a = obtainStyledAttributes.getDrawable(33);
            this.f118140b = obtainStyledAttributes.getDrawable(42);
            if (this.f118141c) {
                this.f118139a = C46788b.f118235d.mo94010a(this.f118139a, z);
                this.f118140b = C46788b.f118235d.mo94010a(this.f118140b, z);
            }
            setImageDrawable(this.f118140b);
        }
    }
}
