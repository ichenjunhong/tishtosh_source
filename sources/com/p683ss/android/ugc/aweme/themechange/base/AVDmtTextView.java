package com.p683ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.p683ss.android.ugc.tools.C50179a.C50180a;
import com.p683ss.android.ugc.tools.view.p2513f.C50235a;
import com.p683ss.android.ugc.tools.view.p2513f.C50237c;
import com.p683ss.android.ugc.tools.view.widget.AVTextView;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.themechange.base.AVDmtTextView */
public final class AVDmtTextView extends AVTextView {

    /* renamed from: b */
    private boolean f118207b;

    /* renamed from: c */
    private boolean f118208c;

    /* renamed from: d */
    private boolean f118209d;

    /* renamed from: e */
    private boolean f118210e;

    /* renamed from: f */
    private boolean f118211f;

    /* renamed from: g */
    private int f118212g;

    /* renamed from: h */
    private int f118213h;

    /* renamed from: i */
    private int f118214i;

    /* renamed from: j */
    private boolean f118215j;

    /* renamed from: k */
    private Typeface f118216k;

    /* renamed from: l */
    private boolean f118217l;

    /* renamed from: m */
    private boolean f118218m;

    public AVDmtTextView(Context context) {
        this(context, null, 0, 6, null);
    }

    public AVDmtTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final void mo1037a() {
        if (C50180a.m108284a().f125726f) {
            setTextSize(12.0f);
            mo93998b();
            return;
        }
        setTextSize(11.0f);
        setTypeface(Typeface.defaultFromStyle(0));
    }

    /* renamed from: b */
    public final void mo93998b() {
        if (this.f118216k == null) {
            this.f118216k = C50237c.m108425a(C50235a.MEDIUM.getFONT_NAME());
        }
        Typeface typeface = this.f118216k;
        if (typeface != null) {
            setTypeface(typeface);
        } else {
            setTypeface(getTypeface(), 1);
        }
    }

    public final void setStatusTextColor(int i) {
        this.f118214i = i;
        mo93997a(this.f118218m);
    }

    public final void setOldPanelStyle(boolean z) {
        int i;
        this.f118207b = z;
        this.f118212g = C46788b.m101630a(this.f118207b);
        this.f118213h = C46788b.m101629a(this.f118212g);
        if (this.f118211f) {
            i = this.f118212g;
        } else {
            i = this.f118213h;
        }
        setTextColor(i);
    }

    public final void setSelected(boolean z) {
        int i;
        super.setSelected(z);
        if (this.f118210e) {
            if (z) {
                i = this.f118212g;
            } else {
                i = this.f118213h;
            }
            setTextColor(i);
        }
    }

    /* renamed from: a */
    public final void mo93997a(boolean z) {
        this.f118218m = z;
        if (!z) {
            setTextColor(this.f118212g);
        } else if (this.f118208c) {
            setTextColor(this.f118214i);
        }
    }

    public final void setEnableUI(boolean z) {
        if (!z) {
            setTextColor(getResources().getColor(R.color.aw7));
        } else if (!this.f118218m) {
            setTextColor(this.f118212g);
        } else if (this.f118208c) {
            setTextColor(this.f118214i);
        }
    }

    public AVDmtTextView(Context context, AttributeSet attributeSet, int i) {
        int i2;
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f118208c = true;
        this.f118211f = true;
        this.f118215j = true;
        this.f118216k = C50237c.m108425a(C50235a.MEDIUM.getFONT_NAME());
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ce, R.attr.abh, R.attr.f5, R.attr.k9, R.attr.lt, R.attr.ml, R.attr.ow, R.attr.ox, R.attr.oy, R.attr.acm, R.attr.p2, R.attr.p3, R.attr.p4, R.attr.aco, R.attr.p5, R.attr.p6, R.attr.p7, R.attr.p8, R.attr.pl, R.attr.pm, R.attr.pn, R.attr.pp, R.attr.q4, R.attr.sk, R.attr.t7, R.attr.uk, R.attr.up, R.attr.uy, R.attr.v3, R.attr.vl, R.attr.ad9, R.attr.a04, R.attr.a1b, R.attr.a1d, R.attr.a1x, R.attr.a1y, R.attr.a3t, R.attr.a6c, R.attr.adn, R.attr.a6k, R.attr.a6o, R.attr.a72, R.attr.a_4, R.attr.adp, R.attr.a__});
            this.f118207b = obtainStyledAttributes.getBoolean(27, false);
            this.f118208c = obtainStyledAttributes.getBoolean(2, true);
            this.f118209d = obtainStyledAttributes.getBoolean(7, false);
            this.f118210e = obtainStyledAttributes.getBoolean(10, false);
            this.f118211f = obtainStyledAttributes.getBoolean(11, true);
            this.f118215j = obtainStyledAttributes.getBoolean(6, true);
            this.f118217l = obtainStyledAttributes.getBoolean(34, false);
            obtainStyledAttributes.recycle();
        }
        if (this.f118217l) {
            setBackgroundDrawable(C46788b.f118235d.mo94009a(context, attributeSet));
        }
        this.f118214i = getResources().getColor(R.color.a3_);
        this.f118212g = C46788b.m101630a(this.f118207b);
        this.f118213h = C46788b.m101629a(this.f118212g);
        if (this.f118215j) {
            if (this.f118211f) {
                i2 = this.f118212g;
            } else {
                i2 = this.f118213h;
            }
            setTextColor(i2);
        }
    }

    public /* synthetic */ AVDmtTextView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
