package com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.DmtPlusView */
public final class DmtPlusView extends View {

    /* renamed from: a */
    private final Paint f108715a;

    /* renamed from: b */
    private int f108716b;

    /* renamed from: c */
    private int f108717c;

    /* renamed from: d */
    private int f108718d;

    /* renamed from: e */
    private int f108719e;

    /* renamed from: f */
    private final RectF f108720f;

    /* renamed from: g */
    private final RectF f108721g;

    public DmtPlusView(Context context) {
        this(context, null, 0, 6, null);
    }

    public DmtPlusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void setBgColor(int i) {
        this.f108715a.setColor(i);
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        C52711k.m112240b(canvas, "canvas");
        canvas.drawRoundRect(this.f108720f, (float) this.f108716b, (float) this.f108716b, this.f108715a);
        canvas.drawRoundRect(this.f108721g, (float) this.f108716b, (float) this.f108716b, this.f108715a);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f108718d = MeasureSpec.getSize(i);
        this.f108719e = MeasureSpec.getSize(i2);
        this.f108720f.set(0.0f, (float) ((this.f108719e - this.f108717c) / 2), (float) this.f108718d, (float) ((this.f108719e + this.f108717c) / 2));
        this.f108721g.set((float) ((this.f108718d - this.f108717c) / 2), 0.0f, (float) ((this.f108718d + this.f108717c) / 2), (float) this.f108719e);
    }

    public DmtPlusView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f108715a = new Paint();
        this.f108720f = new RectF();
        this.f108721g = new RectF();
        this.f108715a.setAntiAlias(true);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ce, R.attr.abh, R.attr.f5, R.attr.k9, R.attr.lt, R.attr.ml, R.attr.ow, R.attr.ox, R.attr.oy, R.attr.acm, R.attr.p2, R.attr.p3, R.attr.p4, R.attr.aco, R.attr.p5, R.attr.p6, R.attr.p7, R.attr.p8, R.attr.pl, R.attr.pm, R.attr.pn, R.attr.pp, R.attr.q4, R.attr.sk, R.attr.t7, R.attr.uk, R.attr.up, R.attr.uy, R.attr.v3, R.attr.vl, R.attr.ad9, R.attr.a04, R.attr.a1b, R.attr.a1d, R.attr.a1x, R.attr.a1y, R.attr.a3t, R.attr.a6c, R.attr.adn, R.attr.a6k, R.attr.a6o, R.attr.a72, R.attr.a_4, R.attr.adp, R.attr.a__});
            this.f108716b = (int) obtainStyledAttributes.getDimension(31, 0.0f);
            this.f108717c = (int) obtainStyledAttributes.getDimension(23, 0.0f);
        }
    }

    public /* synthetic */ DmtPlusView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
