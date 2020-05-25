package com.bytedance.android.live.wallet.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.p030v4.view.ViewPager;
import android.support.p030v4.view.ViewPager.C0997e;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.ss.android.ugc.trill.R;

public class RoundIndicatorView extends View {

    /* renamed from: a */
    public int f12219a;

    /* renamed from: b */
    private int f12220b;

    /* renamed from: c */
    private int f12221c;

    /* renamed from: d */
    private float f12222d;

    /* renamed from: e */
    private float f12223e;

    /* renamed from: f */
    private float f12224f;

    /* renamed from: g */
    private Paint f12225g;

    /* renamed from: h */
    private float f12226h;

    /* renamed from: i */
    private float f12227i;

    /* renamed from: j */
    private int f12228j;

    /* renamed from: k */
    private ViewPager f12229k;

    /* renamed from: com.bytedance.android.live.wallet.view.RoundIndicatorView$a */
    class C4470a implements C0997e {
        public final void onPageScrollStateChanged(int i) {
        }

        public final void onPageScrolled(int i, float f, int i2) {
        }

        C4470a() {
        }

        public final void onPageSelected(int i) {
            if (RoundIndicatorView.this.f12219a > 0) {
                int i2 = i % RoundIndicatorView.this.f12219a;
                if (i2 < RoundIndicatorView.this.f12219a) {
                    RoundIndicatorView.this.setLocation(i2);
                    return;
                }
                RoundIndicatorView.this.setLocation(0);
            }
        }
    }

    public RoundIndicatorView(Context context) {
        this(context, null);
    }

    public void setLocation(int i) {
        this.f12228j = i;
        invalidate();
    }

    public void setCount(int i) {
        this.f12219a = i;
        measure(0, 0);
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        this.f12229k = viewPager;
        if (this.f12229k != null) {
            this.f12229k.addOnPageChangeListener(new C4470a());
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f12226h = (float) getPaddingLeft();
        this.f12227i = (float) getPaddingTop();
        this.f12225g.setColor(this.f12221c);
        float f = this.f12226h;
        for (int i = 0; i < this.f12219a; i++) {
            if (this.f12228j == i) {
                this.f12225g.setColor(this.f12220b);
            } else {
                this.f12225g.setColor(this.f12221c);
            }
            canvas.drawCircle(this.f12224f + f, this.f12227i + this.f12224f, this.f12224f, this.f12225g);
            f += this.f12223e + this.f12222d;
        }
    }

    public RoundIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            size = getPaddingLeft() + getPaddingRight();
            if (this.f12219a > 0) {
                size = (int) (((float) size) + (((float) this.f12219a) * this.f12223e) + (((float) (this.f12219a - 1)) * this.f12222d));
            }
            if (mode == Integer.MIN_VALUE) {
                size = Math.max(size, getSuggestedMinimumWidth());
            }
        }
        if (mode2 != 1073741824) {
            size2 = getPaddingBottom() + getPaddingTop();
            if (this.f12219a > 0) {
                size2 += (int) this.f12223e;
            }
            if (mode2 == Integer.MIN_VALUE) {
                size2 = Math.max(size2, getSuggestedMinimumHeight());
            }
        }
        setMeasuredDimension(size, size2);
    }

    public RoundIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.z8, R.attr.z9, R.attr.z_, R.attr.za, R.attr.zb, R.attr.a8b, R.attr.a8c, R.attr.a8d, R.attr.a8e, R.attr.a8f}, i, 0);
        this.f12222d = obtainStyledAttributes.getDimension(9, 0.0f);
        this.f12223e = obtainStyledAttributes.getDimension(8, 0.0f);
        this.f12224f = this.f12223e / 2.0f;
        this.f12221c = obtainStyledAttributes.getColor(6, -1726079458);
        this.f12220b = obtainStyledAttributes.getColor(7, -10704);
        this.f12219a = obtainStyledAttributes.getInt(5, 0);
        obtainStyledAttributes.recycle();
        this.f12225g = new Paint();
        this.f12225g.setAntiAlias(true);
        this.f12228j = 0;
    }
}
