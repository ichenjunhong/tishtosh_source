package com.p683ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import com.p683ss.android.ugc.aweme.filter.widget.FilterBeautySeekBar;
import com.p683ss.android.ugc.aweme.shortvideo.C42430at;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.themechange.base.AVDmtSeekBar */
public final class AVDmtSeekBar extends FilterBeautySeekBar {

    /* renamed from: c */
    private ClipDrawable f118195c;

    public AVDmtSeekBar(Context context) {
        this(context, null, 0, 6, null);
    }

    public AVDmtSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void setProgress(int i) {
        super.setProgress(i);
        if (this.f118195c != null) {
            ClipDrawable clipDrawable = this.f118195c;
            if (clipDrawable == null) {
                C52711k.m112234a();
            }
            clipDrawable.setLevel(i * 100);
        }
    }

    public AVDmtSeekBar(Context context, AttributeSet attributeSet, int i) {
        int i2;
        int i3;
        int i4;
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ce, R.attr.abh, R.attr.f5, R.attr.k9, R.attr.lt, R.attr.ml, R.attr.ow, R.attr.ox, R.attr.oy, R.attr.acm, R.attr.p2, R.attr.p3, R.attr.p4, R.attr.aco, R.attr.p5, R.attr.p6, R.attr.p7, R.attr.p8, R.attr.pl, R.attr.pm, R.attr.pn, R.attr.pp, R.attr.q4, R.attr.sk, R.attr.t7, R.attr.uk, R.attr.up, R.attr.uy, R.attr.v3, R.attr.vl, R.attr.ad9, R.attr.a04, R.attr.a1b, R.attr.a1d, R.attr.a1x, R.attr.a1y, R.attr.a3t, R.attr.a6c, R.attr.adn, R.attr.a6k, R.attr.a6o, R.attr.a72, R.attr.a_4, R.attr.adp, R.attr.a__});
            i2 = (int) obtainStyledAttributes.getDimension(31, 0.0f);
            i4 = (int) obtainStyledAttributes.getDimension(40, 0.0f);
            i3 = (int) obtainStyledAttributes.getDimension(39, 0.0f);
        } else {
            i3 = 0;
            i2 = 0;
            i4 = 0;
        }
        int i5 = C46788b.f118232a;
        setThumb(C42430at.m93197a(i5, i5, 0, i4, i3));
        int color = getResources().getColor(R.color.a3_);
        this.f118195c = new ClipDrawable(C42430at.m93196a(color, color, 0, i2), 3, 1);
        ClipDrawable clipDrawable = this.f118195c;
        if (clipDrawable == null) {
            C52711k.m112234a();
        }
        clipDrawable.setLevel(getProgress() * 100);
        int a = C46788b.f118235d.mo94007a(false, false, false, false, true);
        Drawable a2 = C42430at.m93196a(a, a, 0, i2);
        Drawable[] drawableArr = new Drawable[2];
        C52711k.m112236a((Object) a2, "bgDrawable");
        drawableArr[0] = a2;
        ClipDrawable clipDrawable2 = this.f118195c;
        if (clipDrawable2 == null) {
            C52711k.m112234a();
        }
        drawableArr[1] = clipDrawable2;
        setProgressDrawable(new LayerDrawable(drawableArr));
    }

    public /* synthetic */ AVDmtSeekBar(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
