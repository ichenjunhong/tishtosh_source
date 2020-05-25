package com.p683ss.android.ugc.aweme.common.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p030v4.view.ViewPager;
import android.support.p030v4.view.ViewPager.C0997e;
import android.text.TextPaint;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.common.widget.PagerSlidingTabStrip */
public final class PagerSlidingTabStrip extends HorizontalScrollView {

    /* renamed from: j */
    private static final int[] f70904j = {16842901, 16842904};

    /* renamed from: A */
    private int f70905A;

    /* renamed from: B */
    private int f70906B;

    /* renamed from: C */
    private Typeface f70907C;

    /* renamed from: D */
    private int f70908D;

    /* renamed from: E */
    private int f70909E;

    /* renamed from: F */
    private int f70910F;

    /* renamed from: G */
    private Locale f70911G;

    /* renamed from: H */
    private int f70912H;

    /* renamed from: I */
    private int f70913I;

    /* renamed from: J */
    private int f70914J;

    /* renamed from: K */
    private boolean f70915K;

    /* renamed from: a */
    public C26945b f70916a;

    /* renamed from: b */
    public C0997e f70917b;

    /* renamed from: c */
    public LinearLayout f70918c;

    /* renamed from: d */
    public ViewPager f70919d;

    /* renamed from: e */
    public int f70920e;

    /* renamed from: f */
    public int f70921f;

    /* renamed from: g */
    public float f70922g;

    /* renamed from: h */
    public boolean f70923h;

    /* renamed from: i */
    public boolean f70924i;

    /* renamed from: k */
    private LayoutParams f70925k;

    /* renamed from: l */
    private LayoutParams f70926l;

    /* renamed from: m */
    private final C26946c f70927m;

    /* renamed from: n */
    private Paint f70928n;

    /* renamed from: o */
    private Paint f70929o;

    /* renamed from: p */
    private int f70930p;

    /* renamed from: q */
    private int f70931q;

    /* renamed from: r */
    private int f70932r;

    /* renamed from: s */
    private boolean f70933s;

    /* renamed from: t */
    private boolean f70934t;

    /* renamed from: u */
    private int f70935u;

    /* renamed from: v */
    private int f70936v;

    /* renamed from: w */
    private int f70937w;

    /* renamed from: x */
    private int f70938x;

    /* renamed from: y */
    private int f70939y;

    /* renamed from: z */
    private int f70940z;

    /* renamed from: com.ss.android.ugc.aweme.common.widget.PagerSlidingTabStrip$SavedState */
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
        int f70944a;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f70944a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f70944a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.PagerSlidingTabStrip$a */
    public interface C26944a {
        /* renamed from: a */
        int mo54983a(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.PagerSlidingTabStrip$b */
    public interface C26945b {
        /* renamed from: a */
        boolean mo54984a(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.PagerSlidingTabStrip$c */
    class C26946c implements C0997e {

        /* renamed from: a */
        final /* synthetic */ PagerSlidingTabStrip f70945a;

        public final void onPageScrollStateChanged(int i) {
            if (i == 0) {
                this.f70945a.mo54937a(this.f70945a.f70919d.getCurrentItem(), 0);
            }
            if (this.f70945a.f70917b != null) {
                this.f70945a.f70917b.onPageScrollStateChanged(i);
            }
        }

        public final void onPageSelected(int i) {
            if (this.f70945a.f70924i) {
                this.f70945a.mo54936a();
            }
            if (this.f70945a.f70917b != null) {
                this.f70945a.f70917b.onPageSelected(i);
            }
        }

        public final void onPageScrolled(int i, float f, int i2) {
            this.f70945a.f70921f = i;
            this.f70945a.f70922g = f;
            this.f70945a.mo54937a(i, (int) (((float) this.f70945a.f70918c.getChildAt(i).getWidth()) * f));
            this.f70945a.invalidate();
            if (this.f70945a.f70917b != null) {
                this.f70945a.f70917b.onPageScrolled(i, f, i2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.PagerSlidingTabStrip$d */
    public interface C26947d {
        /* renamed from: a */
        View mo54985a(int i, ViewGroup viewGroup);

        /* renamed from: a */
        TextView mo54986a(View view);
    }

    public final int getDividerColor() {
        return this.f70932r;
    }

    public final int getDividerPadding() {
        return this.f70938x;
    }

    public final boolean getHighlightTitle() {
        return this.f70924i;
    }

    public final int getIndicatorColor() {
        return this.f70930p;
    }

    public final int getIndicatorHeight() {
        return this.f70936v;
    }

    public final int getScrollOffset() {
        return this.f70935u;
    }

    public final boolean getShouldExpand() {
        return this.f70933s;
    }

    public final int getTabBackground() {
        return this.f70910F;
    }

    public final int getTabPaddingLeftRight() {
        return this.f70939y;
    }

    public final int getTextColor() {
        return this.f70906B;
    }

    public final int getTextSize() {
        return this.f70905A;
    }

    public final int getUnderlineColor() {
        return this.f70931q;
    }

    public final int getUnderlineHeight() {
        return this.f70937w;
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f70944a = this.f70921f;
        return savedState;
    }

    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r5v1, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r4v2, types: [android.widget.TextView] */
    /* JADX WARNING: type inference failed for: r4v3, types: [android.widget.TextView, com.bytedance.ies.dmt.ui.widget.DmtTextView] */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r4v4, types: [android.widget.TextView] */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m65062b() {
        /*
            r7 = this;
            android.widget.LinearLayout r0 = r7.f70918c
            r0.removeAllViews()
            android.support.v4.view.ViewPager r0 = r7.f70919d
            android.support.v4.view.PagerAdapter r0 = r0.getAdapter()
            int r0 = r0.getCount()
            r7.f70920e = r0
            r0 = 0
            r1 = 0
        L_0x0013:
            int r2 = r7.f70920e
            if (r1 >= r2) goto L_0x0097
            android.support.v4.view.ViewPager r2 = r7.f70919d
            android.support.v4.view.PagerAdapter r2 = r2.getAdapter()
            boolean r2 = r2 instanceof com.p683ss.android.ugc.aweme.common.widget.PagerSlidingTabStrip.C26944a
            if (r2 == 0) goto L_0x003d
            android.support.v4.view.ViewPager r2 = r7.f70919d
            android.support.v4.view.PagerAdapter r2 = r2.getAdapter()
            com.ss.android.ugc.aweme.common.widget.PagerSlidingTabStrip$a r2 = (com.p683ss.android.ugc.aweme.common.widget.PagerSlidingTabStrip.C26944a) r2
            int r2 = r2.mo54983a(r1)
            android.widget.ImageButton r3 = new android.widget.ImageButton
            android.content.Context r4 = r7.getContext()
            r3.<init>(r4)
            r3.setImageResource(r2)
            r7.m65061a(r1, r3)
            goto L_0x0093
        L_0x003d:
            android.support.v4.view.ViewPager r2 = r7.f70919d
            android.support.v4.view.PagerAdapter r2 = r2.getAdapter()
            java.lang.CharSequence r2 = r2.getPageTitle(r1)
            java.lang.String r2 = r2.toString()
            android.support.v4.view.ViewPager r3 = r7.f70919d
            android.support.v4.view.PagerAdapter r3 = r3.getAdapter()
            boolean r3 = r3 instanceof com.p683ss.android.ugc.aweme.common.widget.PagerSlidingTabStrip.C26947d
            r4 = 0
            if (r3 == 0) goto L_0x006b
            android.support.v4.view.ViewPager r3 = r7.f70919d
            android.support.v4.view.PagerAdapter r3 = r3.getAdapter()
            com.ss.android.ugc.aweme.common.widget.PagerSlidingTabStrip$d r3 = (com.p683ss.android.ugc.aweme.common.widget.PagerSlidingTabStrip.C26947d) r3
            android.widget.LinearLayout r5 = r7.f70918c
            android.view.View r5 = r3.mo54985a(r1, r5)
            if (r5 == 0) goto L_0x006c
            android.widget.TextView r4 = r3.mo54986a(r5)
            goto L_0x006c
        L_0x006b:
            r5 = r4
        L_0x006c:
            if (r4 != 0) goto L_0x0083
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = new com.bytedance.ies.dmt.ui.widget.DmtTextView
            android.content.Context r3 = r7.getContext()
            r4.<init>(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            int r5 = r7.f70940z
            r6 = -1
            r3.<init>(r5, r6)
            r4.setLayoutParams(r3)
            r5 = r4
        L_0x0083:
            r4.setText(r2)
            r2 = 1
            r4.setGravity(r2)
            r4.setSingleLine()
            r4.setBackgroundColor(r0)
            r7.m65061a(r1, r5)
        L_0x0093:
            int r1 = r1 + 1
            goto L_0x0013
        L_0x0097:
            r7.m65063c()
            android.view.ViewTreeObserver r0 = r7.getViewTreeObserver()
            com.ss.android.ugc.aweme.common.widget.PagerSlidingTabStrip$1 r1 = new com.ss.android.ugc.aweme.common.widget.PagerSlidingTabStrip$1
            r1.<init>()
            r0.addOnGlobalLayoutListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.common.widget.PagerSlidingTabStrip.m65062b():void");
    }

    /* renamed from: c */
    private void m65063c() {
        TextView textView;
        int currentItem = this.f70919d.getCurrentItem();
        for (int i = 0; i < this.f70920e; i++) {
            View childAt = this.f70918c.getChildAt(i);
            childAt.setBackgroundResource(this.f70910F);
            if (this.f70919d.getAdapter() instanceof C26947d) {
                textView = ((C26947d) this.f70919d.getAdapter()).mo54986a(childAt);
            } else {
                textView = null;
            }
            if (textView == null && (childAt instanceof TextView)) {
                textView = (TextView) childAt;
            }
            if (textView != null) {
                textView.setTextSize(0, (float) this.f70905A);
                textView.setTypeface(this.f70907C, this.f70908D);
                if (currentItem != i || !this.f70924i) {
                    textView.setTextColor(this.f70906B);
                    textView.setTypeface(null, 0);
                    textView.setShadowLayer(0.0f, 0.0f, 0.0f, getContext().getResources().getColor(R.color.a1v));
                } else {
                    textView.setTextColor(this.f70930p);
                    textView.setTypeface(null, 1);
                    textView.setShadowLayer(2.0f, 0.0f, 2.0f, getContext().getResources().getColor(R.color.a1v));
                }
                if (this.f70923h) {
                    if (VERSION.SDK_INT >= 14) {
                        textView.setAllCaps(true);
                    } else {
                        textView.setText(textView.getText().toString().toUpperCase(this.f70911G));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo54936a() {
        TextView textView;
        int currentItem = this.f70919d.getCurrentItem();
        for (int i = 0; i < this.f70920e; i++) {
            View childAt = this.f70918c.getChildAt(i);
            childAt.setBackgroundColor(getContext().getResources().getColor(R.color.arz));
            childAt.setBackgroundColor(getContext().getResources().getColor(R.color.arz));
            int b = (int) C9432q.m18687b(getContext(), 0.0f);
            childAt.setPadding(b, (int) C9432q.m18687b(getContext(), 7.0f), b, 0);
            if (this.f70919d.getAdapter() instanceof C26947d) {
                textView = ((C26947d) this.f70919d.getAdapter()).mo54986a(childAt);
            } else {
                textView = null;
            }
            if (textView == null && (childAt instanceof TextView)) {
                textView = (TextView) childAt;
            }
            if (textView != null) {
                if (currentItem != i || !this.f70924i) {
                    textView.setTextColor(this.f70906B);
                    textView.setTypeface(null, 0);
                    textView.setShadowLayer(0.0f, 0.0f, 0.0f, getContext().getResources().getColor(R.color.a1v));
                } else {
                    textView.setTextColor(this.f70930p);
                    textView.setTypeface(null, 1);
                    textView.setShadowLayer(2.0f, 0.0f, 2.0f, getContext().getResources().getColor(R.color.a1v));
                }
            }
        }
    }

    public final void setAllCaps(boolean z) {
        this.f70923h = z;
    }

    public final void setHighlightTitle(boolean z) {
        this.f70924i = z;
    }

    public final void setOnPageChangeListener(C0997e eVar) {
        this.f70917b = eVar;
    }

    public final void setOnTabTriggerOnListener(C26945b bVar) {
        this.f70916a = bVar;
    }

    public final void setOverlayIndicator(boolean z) {
        this.f70934t = z;
    }

    public final void setTabBackground(int i) {
        this.f70910F = i;
    }

    public final void setDividerColor(int i) {
        this.f70932r = i;
        invalidate();
    }

    public final void setDividerPadding(int i) {
        this.f70938x = i;
        invalidate();
    }

    public final void setIndicatorColor(int i) {
        this.f70930p = i;
        invalidate();
    }

    public final void setIndicatorHeight(int i) {
        this.f70936v = i;
        invalidate();
    }

    public final void setScrollOffset(int i) {
        this.f70935u = i;
        invalidate();
    }

    public final void setShouldExpand(boolean z) {
        this.f70933s = z;
        requestLayout();
    }

    public final void setTabPaddingLeftRight(int i) {
        this.f70939y = i;
        m65063c();
    }

    public final void setTextColor(int i) {
        this.f70906B = i;
        m65063c();
    }

    public final void setTextSize(int i) {
        this.f70905A = i;
        m65063c();
    }

    public final void setUnderlineColor(int i) {
        this.f70931q = i;
        invalidate();
    }

    public final void setUnderlineHeight(int i) {
        this.f70937w = i;
        invalidate();
    }

    public final void setDividerColorResource(int i) {
        this.f70932r = getResources().getColor(i);
        invalidate();
    }

    public final void setIndicatorColorResource(int i) {
        this.f70930p = getResources().getColor(i);
        invalidate();
    }

    public final void setShowDot(boolean z) {
        if (this.f70915K != z) {
            this.f70915K = z;
            invalidate();
        }
    }

    public final void setTextColorResource(int i) {
        this.f70906B = getResources().getColor(i);
        m65063c();
    }

    public final void setUnderlineColorResource(int i) {
        this.f70931q = getResources().getColor(i);
        invalidate();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f70921f = savedState.f70944a;
        requestLayout();
    }

    public final void setViewPager(ViewPager viewPager) {
        this.f70919d = viewPager;
        if (viewPager.getAdapter() != null) {
            viewPager.setOnPageChangeListener(this.f70927m);
            m65062b();
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter instance.");
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!isInEditMode() && this.f70920e != 0) {
            int height = getHeight();
            if (this.f70934t) {
                this.f70928n.setColor(this.f70931q);
                canvas.drawRect(0.0f, 0.0f, (float) this.f70918c.getWidth(), (float) this.f70937w, this.f70928n);
            }
            if (this.f70915K) {
                this.f70928n.setColor(this.f70913I);
                View childAt = getChildAt(0);
                if (!(childAt == null || childAt.getWidth() == 0)) {
                    LinearLayout linearLayout = (LinearLayout) childAt;
                    if (linearLayout.getChildCount() > 0) {
                        if (this.f70914J < 0) {
                            Rect rect = new Rect();
                            TextView textView = (TextView) linearLayout.getChildAt(0);
                            TextPaint paint = textView.getPaint();
                            String charSequence = textView.getText().toString();
                            paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
                            this.f70914J = (textView.getWidth() + rect.width()) / 2;
                        }
                        canvas.drawCircle((float) (this.f70914J + this.f70912H), (float) (((int) C9432q.m18687b(getContext(), 7.0f)) + this.f70912H), (float) (this.f70912H / 2), this.f70928n);
                    }
                }
            }
            this.f70928n.setColor(this.f70930p);
            View childAt2 = this.f70918c.getChildAt(this.f70921f);
            float left = (float) childAt2.getLeft();
            float right = (float) childAt2.getRight();
            if (this.f70922g > 0.0f && this.f70921f < this.f70920e - 1) {
                View childAt3 = this.f70918c.getChildAt(this.f70921f + 1);
                float left2 = (float) childAt3.getLeft();
                left = (this.f70922g * left2) + ((1.0f - this.f70922g) * left);
                right = (this.f70922g * ((float) childAt3.getRight())) + ((1.0f - this.f70922g) * right);
            }
            Canvas canvas2 = canvas;
            canvas2.drawRect(left, 0.0f, right, (float) this.f70936v, this.f70928n);
            if (!this.f70934t) {
                this.f70928n.setColor(this.f70931q);
                canvas.drawRect(0.0f, 0.0f, (float) this.f70918c.getWidth(), (float) this.f70937w, this.f70928n);
            }
            this.f70929o.setColor(this.f70932r);
            for (int i = 0; i < this.f70920e - 1; i++) {
                View childAt4 = this.f70918c.getChildAt(i);
                canvas.drawLine((float) childAt4.getRight(), (float) this.f70938x, (float) childAt4.getRight(), (float) (height - this.f70938x), this.f70929o);
            }
        }
    }

    /* renamed from: a */
    private void m65061a(final int i, View view) {
        LayoutParams layoutParams;
        view.setFocusable(true);
        view.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if ((PagerSlidingTabStrip.this.f70919d.getAdapter() instanceof C26947d) && PagerSlidingTabStrip.this.f70919d.getCurrentItem() == i) {
                    PagerSlidingTabStrip.this.f70919d.getAdapter();
                } else if (PagerSlidingTabStrip.this.f70916a == null || !PagerSlidingTabStrip.this.f70916a.mo54984a(i)) {
                    PagerSlidingTabStrip.this.f70919d.setCurrentItem(i);
                }
            }
        });
        view.setPadding(this.f70939y, 0, this.f70939y, 0);
        LinearLayout linearLayout = this.f70918c;
        if (this.f70933s) {
            layoutParams = this.f70926l;
        } else {
            layoutParams = this.f70925k;
        }
        linearLayout.addView(view, i, layoutParams);
    }

    /* renamed from: a */
    public final void mo54937a(int i, int i2) {
        if (this.f70920e != 0) {
            int left = this.f70918c.getChildAt(i).getLeft() + i2;
            if (i > 0 || i2 > 0) {
                left -= this.f70935u;
            }
            if (left != this.f70909E) {
                this.f70909E = left;
                scrollTo(left, 0);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!isInEditMode() && this.f70920e != 0) {
            mo54936a();
        }
    }
}
