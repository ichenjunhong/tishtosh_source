package com.bytedance.ies.uikit.scrollview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p030v4.view.ViewPager;
import android.support.p030v4.view.ViewPager.C0997e;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import java.util.Locale;

public final class PagerSlidingTabStrip extends HorizontalScrollView {

    /* renamed from: k */
    private static final int[] f30038k = {16842901, 16842904};

    /* renamed from: A */
    private Typeface f30039A;

    /* renamed from: B */
    private int f30040B;

    /* renamed from: C */
    private int f30041C;

    /* renamed from: D */
    private int f30042D;

    /* renamed from: E */
    private Locale f30043E;

    /* renamed from: a */
    public C0997e f30044a;

    /* renamed from: b */
    public LinearLayout f30045b;

    /* renamed from: c */
    public ViewPager f30046c;

    /* renamed from: d */
    int f30047d;

    /* renamed from: e */
    public int f30048e;

    /* renamed from: f */
    public float f30049f;

    /* renamed from: g */
    int f30050g;

    /* renamed from: h */
    public boolean f30051h;

    /* renamed from: i */
    public boolean f30052i;

    /* renamed from: j */
    int f30053j;

    /* renamed from: l */
    private LayoutParams f30054l;

    /* renamed from: m */
    private LayoutParams f30055m;

    /* renamed from: n */
    private final C11151b f30056n;

    /* renamed from: o */
    private Paint f30057o;

    /* renamed from: p */
    private Paint f30058p;

    /* renamed from: q */
    private int f30059q;

    /* renamed from: r */
    private int f30060r;

    /* renamed from: s */
    private boolean f30061s;

    /* renamed from: t */
    private boolean f30062t;

    /* renamed from: u */
    private int f30063u;

    /* renamed from: v */
    private int f30064v;

    /* renamed from: w */
    private int f30065w;

    /* renamed from: x */
    private int f30066x;

    /* renamed from: y */
    private int f30067y;

    /* renamed from: z */
    private int f30068z;

    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };

        /* renamed from: a */
        int f30072a;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f30072a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f30072a);
        }
    }

    /* renamed from: com.bytedance.ies.uikit.scrollview.PagerSlidingTabStrip$a */
    public interface C11150a {
        /* renamed from: a */
        int mo20452a(int i);
    }

    /* renamed from: com.bytedance.ies.uikit.scrollview.PagerSlidingTabStrip$b */
    class C11151b implements C0997e {

        /* renamed from: a */
        final /* synthetic */ PagerSlidingTabStrip f30073a;

        public final void onPageScrollStateChanged(int i) {
            if (i == 0) {
                this.f30073a.mo20409a(this.f30073a.f30046c.getCurrentItem(), 0);
            }
            if (this.f30073a.f30044a != null) {
                this.f30073a.f30044a.onPageScrollStateChanged(i);
            }
        }

        public final void onPageSelected(int i) {
            if (this.f30073a.f30052i) {
                PagerSlidingTabStrip pagerSlidingTabStrip = this.f30073a;
                int currentItem = pagerSlidingTabStrip.f30046c.getCurrentItem();
                for (int i2 = 0; i2 < pagerSlidingTabStrip.f30047d; i2++) {
                    View childAt = pagerSlidingTabStrip.f30045b.getChildAt(i2);
                    TextView textView = null;
                    if (pagerSlidingTabStrip.f30046c.getAdapter() instanceof C11152c) {
                        textView = ((C11152c) pagerSlidingTabStrip.f30046c.getAdapter()).mo20454a(childAt);
                    }
                    if (textView == null && (childAt instanceof TextView)) {
                        textView = (TextView) childAt;
                    }
                    if (textView != null) {
                        if (currentItem != i2 || !pagerSlidingTabStrip.f30052i) {
                            textView.setTextColor(pagerSlidingTabStrip.f30053j);
                        } else {
                            textView.setTextColor(pagerSlidingTabStrip.f30050g);
                        }
                    }
                }
            }
            if (this.f30073a.f30044a != null) {
                this.f30073a.f30044a.onPageSelected(i);
            }
        }

        public final void onPageScrolled(int i, float f, int i2) {
            this.f30073a.f30048e = i;
            this.f30073a.f30049f = f;
            this.f30073a.mo20409a(i, (int) (((float) this.f30073a.f30045b.getChildAt(i).getWidth()) * f));
            this.f30073a.invalidate();
            if (this.f30073a.f30044a != null) {
                this.f30073a.f30044a.onPageScrolled(i, f, i2);
            }
        }
    }

    /* renamed from: com.bytedance.ies.uikit.scrollview.PagerSlidingTabStrip$c */
    public interface C11152c {
        /* renamed from: a */
        View mo20453a(int i, ViewGroup viewGroup);

        /* renamed from: a */
        TextView mo20454a(View view);
    }

    public final int getDividerColor() {
        return this.f30060r;
    }

    public final int getDividerPadding() {
        return this.f30066x;
    }

    public final boolean getHighlightTitle() {
        return this.f30052i;
    }

    public final int getIndicatorColor() {
        return this.f30050g;
    }

    public final int getIndicatorHeight() {
        return this.f30064v;
    }

    public final int getScrollOffset() {
        return this.f30063u;
    }

    public final boolean getShouldExpand() {
        return this.f30061s;
    }

    public final int getTabBackground() {
        return this.f30042D;
    }

    public final int getTabPaddingLeftRight() {
        return this.f30067y;
    }

    public final int getTextColor() {
        return this.f30053j;
    }

    public final int getTextSize() {
        return this.f30068z;
    }

    public final int getUnderlineColor() {
        return this.f30059q;
    }

    public final int getUnderlineHeight() {
        return this.f30065w;
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f30072a = this.f30048e;
        return savedState;
    }

    /* renamed from: b */
    private void m22547b() {
        int currentItem = this.f30046c.getCurrentItem();
        for (int i = 0; i < this.f30047d; i++) {
            View childAt = this.f30045b.getChildAt(i);
            childAt.setBackgroundResource(this.f30042D);
            TextView textView = null;
            if (this.f30046c.getAdapter() instanceof C11152c) {
                textView = ((C11152c) this.f30046c.getAdapter()).mo20454a(childAt);
            }
            if (textView == null && (childAt instanceof TextView)) {
                textView = (TextView) childAt;
            }
            if (textView != null) {
                textView.setTextSize(0, (float) this.f30068z);
                textView.setTypeface(this.f30039A, this.f30040B);
                if (currentItem != i || !this.f30052i) {
                    textView.setTextColor(this.f30053j);
                } else {
                    textView.setTextColor(this.f30050g);
                }
                if (this.f30051h) {
                    if (VERSION.SDK_INT >= 14) {
                        textView.setAllCaps(true);
                    } else {
                        textView.setText(textView.getText().toString().toUpperCase(this.f30043E));
                    }
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: type inference failed for: r4v1, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r3v2, types: [android.widget.TextView] */
    /* JADX WARNING: type inference failed for: r3v3, types: [android.widget.TextView] */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r3v4, types: [android.widget.TextView] */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m22545a() {
        /*
            r5 = this;
            android.widget.LinearLayout r0 = r5.f30045b
            r0.removeAllViews()
            android.support.v4.view.ViewPager r0 = r5.f30046c
            android.support.v4.view.PagerAdapter r0 = r0.getAdapter()
            int r0 = r0.getCount()
            r5.f30047d = r0
            r0 = 0
        L_0x0012:
            int r1 = r5.f30047d
            if (r0 >= r1) goto L_0x0088
            android.support.v4.view.ViewPager r1 = r5.f30046c
            android.support.v4.view.PagerAdapter r1 = r1.getAdapter()
            boolean r1 = r1 instanceof com.bytedance.ies.uikit.scrollview.PagerSlidingTabStrip.C11150a
            if (r1 == 0) goto L_0x003c
            android.support.v4.view.ViewPager r1 = r5.f30046c
            android.support.v4.view.PagerAdapter r1 = r1.getAdapter()
            com.bytedance.ies.uikit.scrollview.PagerSlidingTabStrip$a r1 = (com.bytedance.ies.uikit.scrollview.PagerSlidingTabStrip.C11150a) r1
            int r1 = r1.mo20452a(r0)
            android.widget.ImageButton r2 = new android.widget.ImageButton
            android.content.Context r3 = r5.getContext()
            r2.<init>(r3)
            r2.setImageResource(r1)
            r5.m22546a(r0, r2)
            goto L_0x0085
        L_0x003c:
            android.support.v4.view.ViewPager r1 = r5.f30046c
            android.support.v4.view.PagerAdapter r1 = r1.getAdapter()
            java.lang.CharSequence r1 = r1.getPageTitle(r0)
            java.lang.String r1 = r1.toString()
            android.support.v4.view.ViewPager r2 = r5.f30046c
            android.support.v4.view.PagerAdapter r2 = r2.getAdapter()
            boolean r2 = r2 instanceof com.bytedance.ies.uikit.scrollview.PagerSlidingTabStrip.C11152c
            r3 = 0
            if (r2 == 0) goto L_0x006a
            android.support.v4.view.ViewPager r2 = r5.f30046c
            android.support.v4.view.PagerAdapter r2 = r2.getAdapter()
            com.bytedance.ies.uikit.scrollview.PagerSlidingTabStrip$c r2 = (com.bytedance.ies.uikit.scrollview.PagerSlidingTabStrip.C11152c) r2
            android.widget.LinearLayout r4 = r5.f30045b
            android.view.View r4 = r2.mo20453a(r0, r4)
            if (r4 == 0) goto L_0x006b
            android.widget.TextView r3 = r2.mo20454a(r4)
            goto L_0x006b
        L_0x006a:
            r4 = r3
        L_0x006b:
            if (r3 != 0) goto L_0x0077
            android.widget.TextView r3 = new android.widget.TextView
            android.content.Context r2 = r5.getContext()
            r3.<init>(r2)
            r4 = r3
        L_0x0077:
            r3.setText(r1)
            r1 = 17
            r3.setGravity(r1)
            r3.setSingleLine()
            r5.m22546a(r0, r4)
        L_0x0085:
            int r0 = r0 + 1
            goto L_0x0012
        L_0x0088:
            r5.m22547b()
            android.view.ViewTreeObserver r0 = r5.getViewTreeObserver()
            com.bytedance.ies.uikit.scrollview.PagerSlidingTabStrip$1 r1 = new com.bytedance.ies.uikit.scrollview.PagerSlidingTabStrip$1
            r1.<init>()
            r0.addOnGlobalLayoutListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.uikit.scrollview.PagerSlidingTabStrip.m22545a():void");
    }

    public final void setAllCaps(boolean z) {
        this.f30051h = z;
    }

    public final void setHighlightTitle(boolean z) {
        this.f30052i = z;
    }

    public final void setOnPageChangeListener(C0997e eVar) {
        this.f30044a = eVar;
    }

    public final void setOverlayIndicator(boolean z) {
        this.f30062t = z;
    }

    public final void setTabBackground(int i) {
        this.f30042D = i;
    }

    public final void setDividerColor(int i) {
        this.f30060r = i;
        invalidate();
    }

    public final void setDividerPadding(int i) {
        this.f30066x = i;
        invalidate();
    }

    public final void setIndicatorColor(int i) {
        this.f30050g = i;
        invalidate();
    }

    public final void setIndicatorHeight(int i) {
        this.f30064v = i;
        invalidate();
    }

    public final void setScrollOffset(int i) {
        this.f30063u = i;
        invalidate();
    }

    public final void setShouldExpand(boolean z) {
        this.f30061s = z;
        requestLayout();
    }

    public final void setTabPaddingLeftRight(int i) {
        this.f30067y = i;
        m22547b();
    }

    public final void setTextColor(int i) {
        this.f30053j = i;
        m22547b();
    }

    public final void setTextSize(int i) {
        this.f30068z = i;
        m22547b();
    }

    public final void setUnderlineColor(int i) {
        this.f30059q = i;
        invalidate();
    }

    public final void setUnderlineHeight(int i) {
        this.f30065w = i;
        invalidate();
    }

    public final void setDividerColorResource(int i) {
        this.f30060r = getResources().getColor(i);
        invalidate();
    }

    public final void setIndicatorColorResource(int i) {
        this.f30050g = getResources().getColor(i);
        invalidate();
    }

    public final void setTextColorResource(int i) {
        this.f30053j = getResources().getColor(i);
        m22547b();
    }

    public final void setUnderlineColorResource(int i) {
        this.f30059q = getResources().getColor(i);
        invalidate();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f30048e = savedState.f30072a;
        requestLayout();
    }

    public final void setViewPager(ViewPager viewPager) {
        this.f30046c = viewPager;
        if (viewPager.getAdapter() != null) {
            viewPager.setOnPageChangeListener(this.f30056n);
            m22545a();
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter instance.");
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!isInEditMode() && this.f30047d != 0) {
            int height = getHeight();
            if (this.f30062t) {
                this.f30057o.setColor(this.f30059q);
                canvas.drawRect(0.0f, (float) (height - this.f30065w), (float) this.f30045b.getWidth(), (float) height, this.f30057o);
            }
            this.f30057o.setColor(this.f30050g);
            View childAt = this.f30045b.getChildAt(this.f30048e);
            float left = (float) childAt.getLeft();
            float right = (float) childAt.getRight();
            if (this.f30049f > 0.0f && this.f30048e < this.f30047d - 1) {
                View childAt2 = this.f30045b.getChildAt(this.f30048e + 1);
                float left2 = (float) childAt2.getLeft();
                left = (this.f30049f * left2) + ((1.0f - this.f30049f) * left);
                right = (this.f30049f * ((float) childAt2.getRight())) + ((1.0f - this.f30049f) * right);
            }
            float f = (float) height;
            Canvas canvas2 = canvas;
            canvas2.drawRect(left, (float) (height - this.f30064v), right, f, this.f30057o);
            if (!this.f30062t) {
                this.f30057o.setColor(this.f30059q);
                canvas.drawRect(0.0f, (float) (height - this.f30065w), (float) this.f30045b.getWidth(), f, this.f30057o);
            }
            this.f30058p.setColor(this.f30060r);
            for (int i = 0; i < this.f30047d - 1; i++) {
                View childAt3 = this.f30045b.getChildAt(i);
                canvas.drawLine((float) childAt3.getRight(), (float) this.f30066x, (float) childAt3.getRight(), (float) (height - this.f30066x), this.f30058p);
            }
        }
    }

    /* renamed from: a */
    private void m22546a(final int i, View view) {
        LayoutParams layoutParams;
        view.setFocusable(true);
        view.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                if (!(PagerSlidingTabStrip.this.f30046c.getAdapter() instanceof C11152c) || PagerSlidingTabStrip.this.f30046c.getCurrentItem() != i) {
                    PagerSlidingTabStrip.this.f30046c.setCurrentItem(i);
                } else {
                    PagerSlidingTabStrip.this.f30046c.getAdapter();
                }
            }
        });
        view.setPadding(this.f30067y, 0, this.f30067y, 0);
        LinearLayout linearLayout = this.f30045b;
        if (this.f30061s) {
            layoutParams = this.f30055m;
        } else {
            layoutParams = this.f30054l;
        }
        linearLayout.addView(view, i, layoutParams);
    }

    /* renamed from: a */
    public final void mo20409a(int i, int i2) {
        if (this.f30047d != 0) {
            int left = this.f30045b.getChildAt(i).getLeft() + i2;
            if (i > 0 || i2 > 0) {
                left -= this.f30063u;
            }
            if (left != this.f30041C) {
                this.f30041C = left;
                scrollTo(left, 0);
            }
        }
    }
}
