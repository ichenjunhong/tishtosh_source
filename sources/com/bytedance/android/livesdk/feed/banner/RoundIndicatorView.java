package com.bytedance.android.livesdk.feed.banner;

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
    public int f18730a;

    /* renamed from: b */
    private int f18731b;

    /* renamed from: c */
    private int f18732c;

    /* renamed from: d */
    private float f18733d;

    /* renamed from: e */
    private float f18734e;

    /* renamed from: f */
    private float f18735f;

    /* renamed from: g */
    private Paint f18736g;

    /* renamed from: h */
    private float f18737h;

    /* renamed from: i */
    private float f18738i;

    /* renamed from: j */
    private int f18739j;

    /* renamed from: k */
    private ViewPager f18740k;

    /* renamed from: com.bytedance.android.livesdk.feed.banner.RoundIndicatorView$a */
    class C6837a implements C0997e {
        public final void onPageScrollStateChanged(int i) {
        }

        public final void onPageScrolled(int i, float f, int i2) {
        }

        C6837a() {
        }

        public final void onPageSelected(int i) {
            if (RoundIndicatorView.this.f18730a > 0) {
                int i2 = i % RoundIndicatorView.this.f18730a;
                if (i2 < RoundIndicatorView.this.f18730a) {
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
        this.f18739j = i;
        invalidate();
    }

    /* renamed from: a */
    public final void mo13018a(C0997e eVar) {
        if (this.f18740k != null) {
            this.f18740k.addOnPageChangeListener(eVar);
        }
    }

    public void setCount(int i) {
        this.f18730a = i;
        measure(0, 0);
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        this.f18740k = viewPager;
        if (this.f18740k != null) {
            this.f18740k.addOnPageChangeListener(new C6837a());
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f18737h = (float) getPaddingLeft();
        this.f18738i = (float) getPaddingTop();
        this.f18736g.setColor(this.f18732c);
        float f = this.f18737h;
        for (int i = 0; i < this.f18730a; i++) {
            if (this.f18739j == i) {
                this.f18736g.setColor(this.f18731b);
            } else {
                this.f18736g.setColor(this.f18732c);
            }
            canvas.drawCircle(this.f18735f + f, this.f18738i + this.f18735f, this.f18735f, this.f18736g);
            f += this.f18734e + this.f18733d;
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
            if (this.f18730a > 0) {
                size = (int) (((float) size) + (((float) this.f18730a) * this.f18734e) + (((float) (this.f18730a - 1)) * this.f18733d));
            }
            if (mode == Integer.MIN_VALUE) {
                size = Math.max(size, getSuggestedMinimumWidth());
            }
        }
        if (mode2 != 1073741824) {
            size2 = getPaddingBottom() + getPaddingTop();
            if (this.f18730a > 0) {
                size2 += (int) this.f18734e;
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
        this.f18733d = obtainStyledAttributes.getDimension(4, 0.0f);
        this.f18734e = obtainStyledAttributes.getDimension(3, 0.0f);
        this.f18735f = this.f18734e / 2.0f;
        this.f18732c = obtainStyledAttributes.getColor(1, -1726079458);
        this.f18731b = obtainStyledAttributes.getColor(2, -10704);
        this.f18730a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        this.f18736g = new Paint();
        this.f18736g.setAntiAlias(true);
        this.f18739j = 0;
    }
}
