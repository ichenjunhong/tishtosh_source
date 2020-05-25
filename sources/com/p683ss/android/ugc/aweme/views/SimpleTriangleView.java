package com.p683ss.android.ugc.aweme.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.p683ss.android.ugc.aweme.themechange.base.C46788b;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.views.SimpleTriangleView */
public final class SimpleTriangleView extends View {

    /* renamed from: a */
    private int f121163a;

    /* renamed from: b */
    private int f121164b;

    /* renamed from: c */
    private int f121165c;

    /* renamed from: d */
    private final Paint f121166d;

    /* renamed from: e */
    private final Path f121167e;

    /* renamed from: f */
    private int f121168f;

    public SimpleTriangleView(Context context) {
        this(context, null, 0, 6, null);
    }

    public SimpleTriangleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final Paint getPaint() {
        return this.f121166d;
    }

    public final Path getPath() {
        return this.f121167e;
    }

    public final void setColor(int i) {
        this.f121168f = i;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f121167e.lineTo((float) getWidth(), 0.0f);
        this.f121167e.lineTo((float) ((getWidth() / 2) + this.f121165c), (float) (getHeight() - this.f121165c));
        this.f121167e.quadTo((float) (getWidth() / 2), (float) getHeight(), (float) ((getWidth() / 2) - this.f121165c), (float) (getHeight() - this.f121165c));
        this.f121167e.close();
        if (canvas != null) {
            canvas.drawPath(this.f121167e, this.f121166d);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f121163a = getMeasuredWidth();
        this.f121164b = getMeasuredHeight();
    }

    public SimpleTriangleView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f121166d = new Paint();
        this.f121167e = new Path();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.acc, R.attr.xq}, 0, 0);
        TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.ce, R.attr.abh, R.attr.f5, R.attr.k9, R.attr.lt, R.attr.ml, R.attr.ow, R.attr.ox, R.attr.oy, R.attr.acm, R.attr.p2, R.attr.p3, R.attr.p4, R.attr.aco, R.attr.p5, R.attr.p6, R.attr.p7, R.attr.p8, R.attr.pl, R.attr.pm, R.attr.pn, R.attr.pp, R.attr.q4, R.attr.sk, R.attr.t7, R.attr.uk, R.attr.up, R.attr.uy, R.attr.v3, R.attr.vl, R.attr.ad9, R.attr.a04, R.attr.a1b, R.attr.a1d, R.attr.a1x, R.attr.a1y, R.attr.a3t, R.attr.a6c, R.attr.adn, R.attr.a6k, R.attr.a6o, R.attr.a72, R.attr.a_4, R.attr.adp, R.attr.a__});
        boolean z = obtainStyledAttributes2.getBoolean(27, false);
        int a = C46788b.f118235d.mo94007a(obtainStyledAttributes2.getBoolean(5, false), obtainStyledAttributes2.getBoolean(32, false), obtainStyledAttributes2.getBoolean(3, false), z, obtainStyledAttributes2.getBoolean(36, false));
        obtainStyledAttributes2.recycle();
        this.f121168f = obtainStyledAttributes.getColor(0, a);
        this.f121165c = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f121166d.setAntiAlias(true);
        this.f121166d.setStyle(Style.FILL_AND_STROKE);
        this.f121166d.setColor(this.f121168f);
        obtainStyledAttributes.recycle();
    }

    public /* synthetic */ SimpleTriangleView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
