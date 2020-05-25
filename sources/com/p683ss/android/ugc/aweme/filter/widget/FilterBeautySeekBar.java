package com.p683ss.android.ugc.aweme.filter.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.p043v7.widget.AppCompatSeekBar;
import android.util.AttributeSet;
import com.p683ss.android.ugc.aweme.themechange.base.C46788b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.filter.widget.FilterBeautySeekBar */
public class FilterBeautySeekBar extends AppCompatSeekBar {

    /* renamed from: a */
    protected String f82874a;

    /* renamed from: b */
    protected Paint f82875b;

    /* renamed from: c */
    private float f82876c;

    /* renamed from: d */
    private float f82877d;

    /* renamed from: e */
    private float f82878e;

    /* renamed from: f */
    private float f82879f;

    /* renamed from: g */
    private float f82880g;

    /* renamed from: h */
    private float f82881h;

    /* renamed from: i */
    private float f82882i;

    /* renamed from: j */
    private int f82883j;

    /* renamed from: k */
    private boolean f82884k;

    /* renamed from: l */
    private int f82885l;

    /* renamed from: m */
    private int f82886m;

    /* renamed from: n */
    private float f82887n;

    /* renamed from: o */
    private Paint f82888o;

    public synchronized int getProgress() {
        int progress;
        progress = super.getProgress();
        this.f82874a = String.valueOf(progress);
        if (this.f82875b != null) {
            this.f82877d = this.f82875b.measureText(this.f82874a);
        }
        return progress;
    }

    public FilterBeautySeekBar(Context context) {
        this(context, null, 0);
    }

    public void setDefaultDotProgress(int i) {
        this.f82885l = i;
        invalidate();
    }

    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Rect bounds = getProgressDrawable().getBounds();
        canvas.drawText(this.f82874a, (((float) ((bounds.width() * getProgress()) / getMax())) - (this.f82877d / 2.0f)) + this.f82878e, m73679a(getContext(), 10.0f - this.f82882i), this.f82875b);
        if (this.f82885l != -1 && this.f82884k) {
            canvas.drawCircle(((float) ((bounds.width() * this.f82885l) / 100)) + m73679a(getContext(), this.f82887n) + this.f82878e, (float) (getHeight() / 2), m73679a(getContext(), this.f82887n), this.f82888o);
        }
    }

    public FilterBeautySeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private static float m73679a(Context context, float f) {
        return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public FilterBeautySeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f82874a = "";
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.cr, R.attr.jd, R.attr.je, R.attr.jf, R.attr.s4, R.attr.xs, R.attr.xu, R.attr.zc, R.attr.a21, R.attr.a65, R.attr.a66, R.attr.a7f}, i, 0);
        int indexCount = obtainStyledAttributes.getIndexCount();
        boolean z = false;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == 5) {
                this.f82883j = obtainStyledAttributes.getColor(index, -1);
            } else {
                if (index == 6) {
                    this.f82876c = obtainStyledAttributes.getDimension(index, 15.0f);
                }
                if (index == 10) {
                    z = obtainStyledAttributes.getBoolean(index, false);
                }
            }
        }
        if (obtainStyledAttributes.hasValue(4)) {
            this.f82878e = obtainStyledAttributes.getDimension(4, 0.0f);
        } else {
            this.f82878e = m73679a(context, 10.0f);
        }
        if (obtainStyledAttributes.hasValue(7)) {
            this.f82879f = obtainStyledAttributes.getDimension(7, 0.0f);
        } else {
            this.f82879f = this.f82878e;
        }
        if (obtainStyledAttributes.hasValue(11)) {
            this.f82880g = obtainStyledAttributes.getDimension(11, 0.0f);
        } else {
            this.f82880g = m73679a(context, 13.0f);
        }
        if (obtainStyledAttributes.hasValue(0)) {
            this.f82881h = obtainStyledAttributes.getDimension(0, 0.0f);
        } else {
            this.f82881h = this.f82880g;
        }
        if (obtainStyledAttributes.hasValue(9)) {
            this.f82882i = obtainStyledAttributes.getDimension(9, 0.0f);
        }
        this.f82884k = obtainStyledAttributes.getBoolean(8, false);
        this.f82885l = obtainStyledAttributes.getInt(2, -1);
        this.f82886m = obtainStyledAttributes.getColor(1, -1);
        this.f82887n = obtainStyledAttributes.getFloat(3, 2.5f);
        obtainStyledAttributes.recycle();
        if (z) {
            this.f82883j = C46788b.f118235d.mo94011b(false);
        }
        this.f82875b = new Paint();
        this.f82875b.setAntiAlias(true);
        this.f82875b.setColor(this.f82883j);
        this.f82875b.setTextSize(this.f82876c);
        Rect rect = new Rect();
        this.f82874a = String.valueOf(getProgress());
        this.f82875b.getTextBounds(this.f82874a, 0, this.f82874a.length(), rect);
        this.f82888o = new Paint();
        this.f82888o.setAntiAlias(true);
        this.f82888o.setColor(this.f82886m);
        setPadding((int) this.f82878e, (int) this.f82880g, (int) this.f82879f, (int) this.f82881h);
    }
}
