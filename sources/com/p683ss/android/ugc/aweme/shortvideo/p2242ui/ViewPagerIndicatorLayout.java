package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.support.p030v4.view.DmtRtlViewPager;
import android.support.p030v4.view.DmtViewPager;
import android.support.p030v4.view.DmtViewPager.C0984d;
import android.support.p030v4.view.PagerAdapter;
import android.support.p030v4.view.ViewPager;
import android.support.p030v4.view.ViewPager.C0996d;
import android.support.p030v4.view.ViewPager.C0997e;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ViewPagerIndicatorLayout */
public class ViewPagerIndicatorLayout extends LinearLayout implements C0984d, C0996d, C0997e {

    /* renamed from: a */
    public ViewPager f113812a;

    /* renamed from: b */
    public DmtRtlViewPager f113813b;

    /* renamed from: c */
    int f113814c;

    /* renamed from: d */
    int f113815d;

    /* renamed from: e */
    int f113816e;

    /* renamed from: f */
    int f113817f;

    /* renamed from: g */
    int f113818g;

    /* renamed from: h */
    int f113819h;

    /* renamed from: i */
    DataSetObserver f113820i;

    /* renamed from: j */
    private C44937b[] f113821j;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ViewPagerIndicatorLayout$a */
    class C44936a extends DataSetObserver {

        /* renamed from: a */
        PagerAdapter f113822a;

        /* renamed from: b */
        ViewPagerIndicatorLayout f113823b;

        public final void onChanged() {
            if (ViewPagerIndicatorLayout.this.f113812a != null) {
                ViewPagerIndicatorLayout.this.f113812a.requestLayout();
            }
            if (ViewPagerIndicatorLayout.this.f113813b != null) {
                ViewPagerIndicatorLayout.this.f113813b.requestLayout();
            }
            this.f113823b.setUpViews(this.f113822a);
        }

        public final void onInvalidated() {
            if (ViewPagerIndicatorLayout.this.f113812a != null) {
                ViewPagerIndicatorLayout.this.f113812a.requestLayout();
            }
            if (ViewPagerIndicatorLayout.this.f113813b != null) {
                ViewPagerIndicatorLayout.this.f113813b.requestLayout();
            }
            this.f113823b.setUpViews(this.f113822a);
        }

        C44936a(ViewPagerIndicatorLayout viewPagerIndicatorLayout, PagerAdapter pagerAdapter) {
            this.f113822a = pagerAdapter;
            this.f113823b = viewPagerIndicatorLayout;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ViewPagerIndicatorLayout$b */
    public static class C44937b extends View {

        /* renamed from: a */
        Paint f113825a = new Paint();

        /* renamed from: b */
        Paint f113826b;

        /* renamed from: c */
        int f113827c;

        /* renamed from: d */
        int f113828d;

        /* renamed from: e */
        int f113829e;

        public final void setFillAlpha(int i) {
            this.f113827c = i;
            invalidate();
        }

        public final void setStrokeAlpha(int i) {
            this.f113828d = i;
            invalidate();
        }

        public final void setSolidColor(int i) {
            this.f113825a.setColor(i);
            invalidate();
        }

        public final void setStrokeColor(int i) {
            this.f113826b.setColor(i);
            invalidate();
        }

        public final void setStrokeWidth(int i) {
            this.f113829e = i;
            this.f113826b.setStrokeWidth((float) i);
            invalidate();
        }

        public C44937b(Context context) {
            super(context);
            this.f113825a.setAntiAlias(true);
            this.f113825a.setStyle(Style.FILL);
            this.f113826b = new Paint();
            this.f113826b.setAntiAlias(true);
            this.f113826b.setStyle(Style.STROKE);
        }

        /* access modifiers changed from: protected */
        public final void onDraw(Canvas canvas) {
            int width = getWidth() / 2;
            this.f113825a.setAlpha(this.f113827c);
            float f = (float) width;
            canvas.drawCircle(f, f, f, this.f113825a);
            this.f113826b.setAlpha(this.f113828d);
            canvas.drawCircle(f, f, (float) (width - (this.f113829e / 2)), this.f113826b);
        }
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageSelected(int i) {
    }

    public int getCount() {
        int i;
        int i2;
        if (this.f113812a != null) {
            PagerAdapter adapter = this.f113812a.getAdapter();
            if (adapter == null) {
                return 0;
            }
            if (adapter instanceof C45206o) {
                i2 = ((C45206o) adapter).mo91494c();
            } else {
                i2 = adapter.getCount();
            }
            return i2;
        } else if (this.f113813b == null) {
            return 0;
        } else {
            PagerAdapter adapter2 = this.f113813b.getAdapter();
            if (adapter2 == null) {
                return 0;
            }
            if (adapter2 instanceof C45206o) {
                i = ((C45206o) adapter2).mo91494c();
            } else {
                i = adapter2.getCount();
            }
            return i;
        }
    }

    public ViewPagerIndicatorLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private C44937b m98274a(int i) {
        return this.f113821j[i];
    }

    public void setOrientation(int i) {
        super.setOrientation(i);
        if (i == 0) {
            setGravity(16);
        } else {
            setGravity(1);
        }
    }

    public void setUpViewPager(ViewPager viewPager) {
        if (viewPager != null) {
            if (this.f113812a != null) {
                viewPager.removeOnPageChangeListener(this);
                viewPager.removeOnAdapterChangeListener(this);
            }
            this.f113812a = viewPager;
            PagerAdapter adapter = viewPager.getAdapter();
            viewPager.addOnPageChangeListener(this);
            viewPager.addOnAdapterChangeListener(this);
            if (adapter != null) {
                if (this.f113820i != null) {
                    adapter.unregisterDataSetObserver(this.f113820i);
                }
                this.f113820i = new C44936a(this, adapter);
                adapter.registerDataSetObserver(this.f113820i);
                setUpViews(adapter);
                return;
            }
            return;
        }
        throw new NullPointerException("viewPager == null.");
    }

    public void setUpViewPager(DmtRtlViewPager dmtRtlViewPager) {
        if (dmtRtlViewPager != null) {
            if (this.f113813b != null) {
                dmtRtlViewPager.mo2959b((C0997e) this);
                if (dmtRtlViewPager.f3170f != null) {
                    dmtRtlViewPager.f3170f.remove(this);
                }
            }
            this.f113813b = dmtRtlViewPager;
            PagerAdapter adapter = dmtRtlViewPager.getAdapter();
            dmtRtlViewPager.mo2957a((C0997e) this);
            if (dmtRtlViewPager.f3170f == null) {
                dmtRtlViewPager.f3170f = new ArrayList();
            }
            dmtRtlViewPager.f3170f.add(this);
            if (adapter != null) {
                if (this.f113820i != null) {
                    adapter.unregisterDataSetObserver(this.f113820i);
                }
                this.f113820i = new C44936a(this, adapter);
                adapter.registerDataSetObserver(this.f113820i);
                setUpViews(adapter);
                return;
            }
            return;
        }
        throw new NullPointerException("viewPager == null.");
    }

    public void setUpViews(PagerAdapter pagerAdapter) {
        int i;
        if (pagerAdapter instanceof C45206o) {
            i = ((C45206o) pagerAdapter).mo91494c();
        } else {
            i = pagerAdapter.getCount();
        }
        removeAllViews();
        this.f113821j = new C44937b[i];
        int i2 = this.f113818g / 2;
        for (int i3 = 0; i3 < i; i3++) {
            C44937b bVar = new C44937b(getContext());
            bVar.setSolidColor(this.f113815d);
            bVar.setStrokeColor(this.f113816e);
            LayoutParams layoutParams = new LayoutParams(this.f113814c, this.f113814c);
            if (getOrientation() == 1) {
                layoutParams.setMargins(0, i2, 0, i2);
            } else {
                layoutParams.setMargins(i2, 0, i2, 0);
            }
            addView(bVar, layoutParams);
            this.f113821j[i3] = bVar;
        }
    }

    public ViewPagerIndicatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo3024a(DmtViewPager dmtViewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        if (!(pagerAdapter == null || this.f113820i == null)) {
            pagerAdapter.unregisterDataSetObserver(this.f113820i);
        }
        if (pagerAdapter2 != null) {
            this.f113820i = new C44936a(this, pagerAdapter2);
            pagerAdapter2.registerDataSetObserver(this.f113820i);
        }
    }

    /* renamed from: a */
    public final void mo1576a(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        if (!(pagerAdapter == null || this.f113820i == null)) {
            pagerAdapter.unregisterDataSetObserver(this.f113820i);
        }
        if (pagerAdapter2 != null) {
            this.f113820i = new C44936a(this, pagerAdapter2);
            pagerAdapter2.registerDataSetObserver(this.f113820i);
        }
    }

    public ViewPagerIndicatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f113821j = new C44937b[0];
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.od, R.attr.oe, R.attr.of, R.attr.og, R.attr.oh, R.attr.oi}, i, 0);
        this.f113815d = obtainStyledAttributes.getColor(1, -1);
        this.f113816e = obtainStyledAttributes.getColor(3, -1);
        this.f113814c = obtainStyledAttributes.getDimensionPixelSize(0, (int) C9432q.m18687b(context, 4.0f));
        this.f113817f = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        float f = 0.5f;
        float f2 = obtainStyledAttributes.getFloat(5, 0.5f);
        if (f2 > 0.0f && f2 <= 1.0f) {
            f = f2;
        }
        this.f113819h = (int) (f * 255.0f);
        this.f113818g = obtainStyledAttributes.getDimensionPixelSize(2, (int) C9432q.m18687b(context, 4.0f));
        obtainStyledAttributes.recycle();
        if (getOrientation() == 0) {
            setGravity(16);
        } else {
            setGravity(1);
        }
    }

    public void onPageScrolled(int i, float f, int i2) {
        int count = getCount();
        if (count != 0) {
            if (count != this.f113821j.length) {
                if (this.f113812a != null) {
                    setUpViews(this.f113812a.getAdapter());
                }
                if (this.f113813b != null) {
                    setUpViews(this.f113813b.getAdapter());
                }
            }
            int i3 = i % count;
            C44937b a = m98274a(i3);
            a.setStrokeAlpha(0);
            double d = (double) (1.0f - f);
            Double.isNaN(d);
            double sin = (Math.sin((d * 3.141592653589793d) / 2.0d) * 255.0d) / 2.0d;
            double d2 = (double) this.f113819h;
            Double.isNaN(d2);
            a.setFillAlpha((int) (sin + d2));
            int i4 = (i3 + 1) % count;
            C44937b a2 = m98274a(i4);
            a2.setStrokeAlpha(0);
            double d3 = (double) f;
            Double.isNaN(d3);
            double sin2 = (Math.sin((d3 * 3.141592653589793d) / 2.0d) * 255.0d) / 2.0d;
            double d4 = (double) this.f113819h;
            Double.isNaN(d4);
            a2.setFillAlpha((int) (sin2 + d4));
            for (int i5 = 0; i5 < count; i5++) {
                if (!(i5 == i3 || i5 == i4)) {
                    C44937b a3 = m98274a(i5);
                    a3.setStrokeAlpha(0);
                    a3.setFillAlpha(this.f113819h);
                }
            }
        }
    }
}
