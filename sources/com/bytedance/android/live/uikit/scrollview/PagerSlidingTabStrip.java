package com.bytedance.android.live.uikit.scrollview;

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
    private static final int[] f11718k = {16842901, 16842904};

    /* renamed from: A */
    private Typeface f11719A;

    /* renamed from: B */
    private int f11720B;

    /* renamed from: C */
    private int f11721C;

    /* renamed from: D */
    private int f11722D;

    /* renamed from: E */
    private Locale f11723E;

    /* renamed from: a */
    public C0997e f11724a;

    /* renamed from: b */
    public LinearLayout f11725b;

    /* renamed from: c */
    public ViewPager f11726c;

    /* renamed from: d */
    int f11727d;

    /* renamed from: e */
    public int f11728e;

    /* renamed from: f */
    public float f11729f;

    /* renamed from: g */
    int f11730g;

    /* renamed from: h */
    public boolean f11731h;

    /* renamed from: i */
    public boolean f11732i;

    /* renamed from: j */
    int f11733j;

    /* renamed from: l */
    private LayoutParams f11734l;

    /* renamed from: m */
    private LayoutParams f11735m;

    /* renamed from: n */
    private final C4275b f11736n;

    /* renamed from: o */
    private Paint f11737o;

    /* renamed from: p */
    private Paint f11738p;

    /* renamed from: q */
    private int f11739q;

    /* renamed from: r */
    private int f11740r;

    /* renamed from: s */
    private boolean f11741s;

    /* renamed from: t */
    private boolean f11742t;

    /* renamed from: u */
    private int f11743u;

    /* renamed from: v */
    private int f11744v;

    /* renamed from: w */
    private int f11745w;

    /* renamed from: x */
    private int f11746x;

    /* renamed from: y */
    private int f11747y;

    /* renamed from: z */
    private int f11748z;

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
        int f11752a;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f11752a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f11752a);
        }
    }

    /* renamed from: com.bytedance.android.live.uikit.scrollview.PagerSlidingTabStrip$a */
    public interface C4274a {
        /* renamed from: a */
        int mo9988a(int i);
    }

    /* renamed from: com.bytedance.android.live.uikit.scrollview.PagerSlidingTabStrip$b */
    class C4275b implements C0997e {

        /* renamed from: a */
        final /* synthetic */ PagerSlidingTabStrip f11753a;

        public final void onPageScrollStateChanged(int i) {
            if (i == 0) {
                this.f11753a.mo9945a(this.f11753a.f11726c.getCurrentItem(), 0);
            }
            if (this.f11753a.f11724a != null) {
                this.f11753a.f11724a.onPageScrollStateChanged(i);
            }
        }

        public final void onPageSelected(int i) {
            if (this.f11753a.f11732i) {
                PagerSlidingTabStrip pagerSlidingTabStrip = this.f11753a;
                int currentItem = pagerSlidingTabStrip.f11726c.getCurrentItem();
                for (int i2 = 0; i2 < pagerSlidingTabStrip.f11727d; i2++) {
                    View childAt = pagerSlidingTabStrip.f11725b.getChildAt(i2);
                    TextView textView = null;
                    if (pagerSlidingTabStrip.f11726c.getAdapter() instanceof C4276c) {
                        textView = ((C4276c) pagerSlidingTabStrip.f11726c.getAdapter()).mo9990a(childAt);
                    }
                    if (textView == null && (childAt instanceof TextView)) {
                        textView = (TextView) childAt;
                    }
                    if (textView != null) {
                        if (currentItem != i2 || !pagerSlidingTabStrip.f11732i) {
                            textView.setTextColor(pagerSlidingTabStrip.f11733j);
                        } else {
                            textView.setTextColor(pagerSlidingTabStrip.f11730g);
                        }
                    }
                }
            }
            if (this.f11753a.f11724a != null) {
                this.f11753a.f11724a.onPageSelected(i);
            }
        }

        public final void onPageScrolled(int i, float f, int i2) {
            this.f11753a.f11728e = i;
            this.f11753a.f11729f = f;
            this.f11753a.mo9945a(i, (int) (((float) this.f11753a.f11725b.getChildAt(i).getWidth()) * f));
            this.f11753a.invalidate();
            if (this.f11753a.f11724a != null) {
                this.f11753a.f11724a.onPageScrolled(i, f, i2);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.uikit.scrollview.PagerSlidingTabStrip$c */
    public interface C4276c {
        /* renamed from: a */
        View mo9989a(int i, ViewGroup viewGroup);

        /* renamed from: a */
        TextView mo9990a(View view);
    }

    public final int getDividerColor() {
        return this.f11740r;
    }

    public final int getDividerPadding() {
        return this.f11746x;
    }

    public final boolean getHighlightTitle() {
        return this.f11732i;
    }

    public final int getIndicatorColor() {
        return this.f11730g;
    }

    public final int getIndicatorHeight() {
        return this.f11744v;
    }

    public final int getScrollOffset() {
        return this.f11743u;
    }

    public final boolean getShouldExpand() {
        return this.f11741s;
    }

    public final int getTabBackground() {
        return this.f11722D;
    }

    public final int getTabPaddingLeftRight() {
        return this.f11747y;
    }

    public final int getTextColor() {
        return this.f11733j;
    }

    public final int getTextSize() {
        return this.f11748z;
    }

    public final int getUnderlineColor() {
        return this.f11739q;
    }

    public final int getUnderlineHeight() {
        return this.f11745w;
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f11752a = this.f11728e;
        return savedState;
    }

    /* renamed from: b */
    private void m10540b() {
        int currentItem = this.f11726c.getCurrentItem();
        for (int i = 0; i < this.f11727d; i++) {
            View childAt = this.f11725b.getChildAt(i);
            childAt.setBackgroundResource(this.f11722D);
            TextView textView = null;
            if (this.f11726c.getAdapter() instanceof C4276c) {
                textView = ((C4276c) this.f11726c.getAdapter()).mo9990a(childAt);
            }
            if (textView == null && (childAt instanceof TextView)) {
                textView = (TextView) childAt;
            }
            if (textView != null) {
                textView.setTextSize(0, (float) this.f11748z);
                textView.setTypeface(this.f11719A, this.f11720B);
                if (currentItem != i || !this.f11732i) {
                    textView.setTextColor(this.f11733j);
                } else {
                    textView.setTextColor(this.f11730g);
                }
                if (this.f11731h) {
                    if (VERSION.SDK_INT >= 14) {
                        textView.setAllCaps(true);
                    } else {
                        textView.setText(textView.getText().toString().toUpperCase(this.f11723E));
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
    private void m10538a() {
        /*
            r5 = this;
            android.widget.LinearLayout r0 = r5.f11725b
            r0.removeAllViews()
            android.support.v4.view.ViewPager r0 = r5.f11726c
            android.support.v4.view.PagerAdapter r0 = r0.getAdapter()
            int r0 = r0.getCount()
            r5.f11727d = r0
            r0 = 0
        L_0x0012:
            int r1 = r5.f11727d
            if (r0 >= r1) goto L_0x0088
            android.support.v4.view.ViewPager r1 = r5.f11726c
            android.support.v4.view.PagerAdapter r1 = r1.getAdapter()
            boolean r1 = r1 instanceof com.bytedance.android.live.uikit.scrollview.PagerSlidingTabStrip.C4274a
            if (r1 == 0) goto L_0x003c
            android.support.v4.view.ViewPager r1 = r5.f11726c
            android.support.v4.view.PagerAdapter r1 = r1.getAdapter()
            com.bytedance.android.live.uikit.scrollview.PagerSlidingTabStrip$a r1 = (com.bytedance.android.live.uikit.scrollview.PagerSlidingTabStrip.C4274a) r1
            int r1 = r1.mo9988a(r0)
            android.widget.ImageButton r2 = new android.widget.ImageButton
            android.content.Context r3 = r5.getContext()
            r2.<init>(r3)
            r2.setImageResource(r1)
            r5.m10539a(r0, r2)
            goto L_0x0085
        L_0x003c:
            android.support.v4.view.ViewPager r1 = r5.f11726c
            android.support.v4.view.PagerAdapter r1 = r1.getAdapter()
            java.lang.CharSequence r1 = r1.getPageTitle(r0)
            java.lang.String r1 = r1.toString()
            android.support.v4.view.ViewPager r2 = r5.f11726c
            android.support.v4.view.PagerAdapter r2 = r2.getAdapter()
            boolean r2 = r2 instanceof com.bytedance.android.live.uikit.scrollview.PagerSlidingTabStrip.C4276c
            r3 = 0
            if (r2 == 0) goto L_0x006a
            android.support.v4.view.ViewPager r2 = r5.f11726c
            android.support.v4.view.PagerAdapter r2 = r2.getAdapter()
            com.bytedance.android.live.uikit.scrollview.PagerSlidingTabStrip$c r2 = (com.bytedance.android.live.uikit.scrollview.PagerSlidingTabStrip.C4276c) r2
            android.widget.LinearLayout r4 = r5.f11725b
            android.view.View r4 = r2.mo9989a(r0, r4)
            if (r4 == 0) goto L_0x006b
            android.widget.TextView r3 = r2.mo9990a(r4)
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
            r5.m10539a(r0, r4)
        L_0x0085:
            int r0 = r0 + 1
            goto L_0x0012
        L_0x0088:
            r5.m10540b()
            android.view.ViewTreeObserver r0 = r5.getViewTreeObserver()
            com.bytedance.android.live.uikit.scrollview.PagerSlidingTabStrip$1 r1 = new com.bytedance.android.live.uikit.scrollview.PagerSlidingTabStrip$1
            r1.<init>()
            r0.addOnGlobalLayoutListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.uikit.scrollview.PagerSlidingTabStrip.m10538a():void");
    }

    public final void setAllCaps(boolean z) {
        this.f11731h = z;
    }

    public final void setHighlightTitle(boolean z) {
        this.f11732i = z;
    }

    public final void setOnPageChangeListener(C0997e eVar) {
        this.f11724a = eVar;
    }

    public final void setOverlayIndicator(boolean z) {
        this.f11742t = z;
    }

    public final void setTabBackground(int i) {
        this.f11722D = i;
    }

    public final void setDividerColor(int i) {
        this.f11740r = i;
        invalidate();
    }

    public final void setDividerPadding(int i) {
        this.f11746x = i;
        invalidate();
    }

    public final void setIndicatorColor(int i) {
        this.f11730g = i;
        invalidate();
    }

    public final void setIndicatorHeight(int i) {
        this.f11744v = i;
        invalidate();
    }

    public final void setScrollOffset(int i) {
        this.f11743u = i;
        invalidate();
    }

    public final void setShouldExpand(boolean z) {
        this.f11741s = z;
        requestLayout();
    }

    public final void setTabPaddingLeftRight(int i) {
        this.f11747y = i;
        m10540b();
    }

    public final void setTextColor(int i) {
        this.f11733j = i;
        m10540b();
    }

    public final void setTextSize(int i) {
        this.f11748z = i;
        m10540b();
    }

    public final void setUnderlineColor(int i) {
        this.f11739q = i;
        invalidate();
    }

    public final void setUnderlineHeight(int i) {
        this.f11745w = i;
        invalidate();
    }

    public final void setDividerColorResource(int i) {
        this.f11740r = getResources().getColor(i);
        invalidate();
    }

    public final void setIndicatorColorResource(int i) {
        this.f11730g = getResources().getColor(i);
        invalidate();
    }

    public final void setTextColorResource(int i) {
        this.f11733j = getResources().getColor(i);
        m10540b();
    }

    public final void setUnderlineColorResource(int i) {
        this.f11739q = getResources().getColor(i);
        invalidate();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f11728e = savedState.f11752a;
        requestLayout();
    }

    public final void setViewPager(ViewPager viewPager) {
        this.f11726c = viewPager;
        if (viewPager.getAdapter() != null) {
            viewPager.setOnPageChangeListener(this.f11736n);
            m10538a();
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter instance.");
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!isInEditMode() && this.f11727d != 0) {
            int height = getHeight();
            if (this.f11742t) {
                this.f11737o.setColor(this.f11739q);
                canvas.drawRect(0.0f, (float) (height - this.f11745w), (float) this.f11725b.getWidth(), (float) height, this.f11737o);
            }
            this.f11737o.setColor(this.f11730g);
            View childAt = this.f11725b.getChildAt(this.f11728e);
            float left = (float) childAt.getLeft();
            float right = (float) childAt.getRight();
            if (this.f11729f > 0.0f && this.f11728e < this.f11727d - 1) {
                View childAt2 = this.f11725b.getChildAt(this.f11728e + 1);
                float left2 = (float) childAt2.getLeft();
                left = (this.f11729f * left2) + ((1.0f - this.f11729f) * left);
                right = (this.f11729f * ((float) childAt2.getRight())) + ((1.0f - this.f11729f) * right);
            }
            float f = (float) height;
            Canvas canvas2 = canvas;
            canvas2.drawRect(left, (float) (height - this.f11744v), right, f, this.f11737o);
            if (!this.f11742t) {
                this.f11737o.setColor(this.f11739q);
                canvas.drawRect(0.0f, (float) (height - this.f11745w), (float) this.f11725b.getWidth(), f, this.f11737o);
            }
            this.f11738p.setColor(this.f11740r);
            for (int i = 0; i < this.f11727d - 1; i++) {
                View childAt3 = this.f11725b.getChildAt(i);
                canvas.drawLine((float) childAt3.getRight(), (float) this.f11746x, (float) childAt3.getRight(), (float) (height - this.f11746x), this.f11738p);
            }
        }
    }

    /* renamed from: a */
    private void m10539a(final int i, View view) {
        LayoutParams layoutParams;
        view.setFocusable(true);
        view.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                if (!(PagerSlidingTabStrip.this.f11726c.getAdapter() instanceof C4276c) || PagerSlidingTabStrip.this.f11726c.getCurrentItem() != i) {
                    PagerSlidingTabStrip.this.f11726c.setCurrentItem(i);
                } else {
                    PagerSlidingTabStrip.this.f11726c.getAdapter();
                }
            }
        });
        view.setPadding(this.f11747y, 0, this.f11747y, 0);
        LinearLayout linearLayout = this.f11725b;
        if (this.f11741s) {
            layoutParams = this.f11735m;
        } else {
            layoutParams = this.f11734l;
        }
        linearLayout.addView(view, i, layoutParams);
    }

    /* renamed from: a */
    public final void mo9945a(int i, int i2) {
        if (this.f11727d != 0) {
            int left = this.f11725b.getChildAt(i).getLeft() + i2;
            if (i > 0 || i2 > 0) {
                left -= this.f11743u;
            }
            if (left != this.f11721C) {
                this.f11721C = left;
                scrollTo(left, 0);
            }
        }
    }
}
