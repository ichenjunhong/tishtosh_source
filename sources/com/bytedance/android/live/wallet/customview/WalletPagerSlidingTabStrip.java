package com.bytedance.android.live.wallet.customview;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p030v4.view.ViewPager;
import android.support.p030v4.view.ViewPager.C0997e;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.android.live.uikit.p257c.C4206c;
import com.ss.android.ugc.trill.R;
import java.util.Locale;

public class WalletPagerSlidingTabStrip extends HorizontalScrollView {

    /* renamed from: g */
    private static final int[] f11966g = {16842901, 16842904};

    /* renamed from: A */
    private ColorStateList f11967A;

    /* renamed from: B */
    private Typeface f11968B;

    /* renamed from: C */
    private int f11969C;

    /* renamed from: D */
    private int f11970D;

    /* renamed from: E */
    private Locale f11971E;

    /* renamed from: a */
    public C0997e f11972a;

    /* renamed from: b */
    public LinearLayout f11973b;

    /* renamed from: c */
    public ViewPager f11974c;

    /* renamed from: d */
    public int f11975d;

    /* renamed from: e */
    public float f11976e;

    /* renamed from: f */
    public boolean f11977f;

    /* renamed from: h */
    private LayoutParams f11978h;

    /* renamed from: i */
    private LayoutParams f11979i;

    /* renamed from: j */
    private final C4382d f11980j;

    /* renamed from: k */
    private int f11981k;

    /* renamed from: l */
    private Paint f11982l;

    /* renamed from: m */
    private Paint f11983m;

    /* renamed from: n */
    private int f11984n;

    /* renamed from: o */
    private int f11985o;

    /* renamed from: p */
    private int f11986p;

    /* renamed from: q */
    private int f11987q;

    /* renamed from: r */
    private int f11988r;

    /* renamed from: s */
    private boolean f11989s;

    /* renamed from: t */
    private int f11990t;

    /* renamed from: u */
    private int f11991u;

    /* renamed from: v */
    private int f11992v;

    /* renamed from: w */
    private int f11993w;

    /* renamed from: x */
    private int f11994x;

    /* renamed from: y */
    private int f11995y;

    /* renamed from: z */
    private int f11996z;

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
        int f12000a;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f12000a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f12000a);
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.customview.WalletPagerSlidingTabStrip$a */
    public interface C4379a {
        /* renamed from: a */
        View mo10044a(Context context, int i);
    }

    /* renamed from: com.bytedance.android.live.wallet.customview.WalletPagerSlidingTabStrip$b */
    public interface C4380b {
        /* renamed from: a */
        int mo10209a(int i);
    }

    /* renamed from: com.bytedance.android.live.wallet.customview.WalletPagerSlidingTabStrip$c */
    static class C4381c {

        /* renamed from: a */
        TextView f12001a;

        C4381c() {
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.customview.WalletPagerSlidingTabStrip$d */
    class C4382d implements C0997e {
        private C4382d() {
        }

        public final void onPageSelected(int i) {
            if (WalletPagerSlidingTabStrip.this.f11972a != null) {
                WalletPagerSlidingTabStrip.this.f11972a.onPageSelected(i);
            }
        }

        public final void onPageScrollStateChanged(int i) {
            if (i == 0) {
                WalletPagerSlidingTabStrip.this.mo10165a(WalletPagerSlidingTabStrip.this.f11974c.getCurrentItem(), 0);
            }
            if (WalletPagerSlidingTabStrip.this.f11972a != null) {
                WalletPagerSlidingTabStrip.this.f11972a.onPageScrollStateChanged(i);
            }
        }

        public final void onPageScrolled(int i, float f, int i2) {
            if (WalletPagerSlidingTabStrip.this.f11975d != i) {
                WalletPagerSlidingTabStrip.this.mo10166a(WalletPagerSlidingTabStrip.this.f11975d, false);
                WalletPagerSlidingTabStrip.this.mo10166a(i, true);
            }
            WalletPagerSlidingTabStrip.this.f11975d = i;
            WalletPagerSlidingTabStrip.this.f11976e = f;
            WalletPagerSlidingTabStrip.this.mo10165a(i, (int) (((float) WalletPagerSlidingTabStrip.this.f11973b.getChildAt(i).getWidth()) * f));
            WalletPagerSlidingTabStrip.this.invalidate();
            if (WalletPagerSlidingTabStrip.this.f11972a != null) {
                WalletPagerSlidingTabStrip.this.f11972a.onPageScrolled(i, f, i2);
            }
        }
    }

    public int getDividerColor() {
        return this.f11988r;
    }

    public int getDividerPadding() {
        return this.f11993w;
    }

    public int getIndicatorColor() {
        return this.f11986p;
    }

    public int getIndicatorHeight() {
        return this.f11991u;
    }

    public int getIndicatorWidth() {
        return this.f11984n;
    }

    public int getScrollOffset() {
        return this.f11990t;
    }

    public boolean getShouldExpand() {
        return this.f11989s;
    }

    public int getTabBackground() {
        return this.f11970D;
    }

    public int getTabPaddingLeftRight() {
        return this.f11994x;
    }

    public ColorStateList getTextColor() {
        return this.f11967A;
    }

    public int getTextSize() {
        return this.f11996z;
    }

    public int getUnderlineColor() {
        return this.f11987q;
    }

    public int getUnderlineHeight() {
        return this.f11992v;
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f12000a = this.f11975d;
        return savedState;
    }

    /* renamed from: b */
    private void m10676b() {
        this.f11973b.removeAllViews();
        this.f11981k = this.f11974c.getAdapter().getCount();
        for (int i = 0; i < this.f11981k; i++) {
            if (this.f11974c.getAdapter() instanceof C4379a) {
                m10675a(i, ((C4379a) this.f11974c.getAdapter()).mo10044a(getContext(), i));
            } else if (this.f11974c.getAdapter() instanceof C4380b) {
                int a = ((C4380b) this.f11974c.getAdapter()).mo10209a(i);
                ImageButton imageButton = new ImageButton(getContext());
                imageButton.setImageResource(a);
                m10675a(i, (View) imageButton);
            }
        }
        m10677c();
        getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
            public final void onGlobalLayout() {
                if (VERSION.SDK_INT < 16) {
                    WalletPagerSlidingTabStrip.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                } else {
                    WalletPagerSlidingTabStrip.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
                WalletPagerSlidingTabStrip.this.f11975d = WalletPagerSlidingTabStrip.this.f11974c.getCurrentItem();
                WalletPagerSlidingTabStrip.this.mo10166a(WalletPagerSlidingTabStrip.this.f11975d, true);
                WalletPagerSlidingTabStrip.this.mo10165a(WalletPagerSlidingTabStrip.this.f11975d, 0);
            }
        });
    }

    /* renamed from: c */
    private void m10677c() {
        for (int i = 0; i < this.f11981k; i++) {
            View childAt = this.f11973b.getChildAt(i);
            childAt.setBackgroundResource(this.f11970D);
            Object tag = childAt.getTag();
            if (tag instanceof C4381c) {
                C4381c cVar = (C4381c) tag;
                cVar.f12001a.setTextSize(0, (float) this.f11996z);
                cVar.f12001a.setTextColor(this.f11967A);
                if (this.f11977f) {
                    if (VERSION.SDK_INT >= 14) {
                        cVar.f12001a.setAllCaps(true);
                    } else {
                        cVar.f12001a.setText(cVar.f12001a.getText().toString().toUpperCase(this.f11971E));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo10167a() {
        if (this.f11981k == 0 || this.f11973b.getChildCount() < 5) {
            return false;
        }
        ObjectAnimator.ofInt(this, "scrollX", new int[]{0, this.f11973b.getChildAt(2).getLeft(), 0}).setDuration(1300).start();
        return true;
    }

    public void setAllCaps(boolean z) {
        this.f11977f = z;
    }

    public void setOnPageChangeListener(C0997e eVar) {
        this.f11972a = eVar;
    }

    public void setTabBackground(int i) {
        this.f11970D = i;
    }

    public WalletPagerSlidingTabStrip(Context context) {
        this(context, null);
    }

    public void setDividerColor(int i) {
        this.f11988r = i;
        invalidate();
    }

    public void setDividerPadding(int i) {
        this.f11993w = i;
        invalidate();
    }

    public void setIndicatorColor(int i) {
        this.f11986p = i;
        invalidate();
    }

    public void setIndicatorHeight(int i) {
        this.f11991u = i;
        invalidate();
    }

    public void setIndicatorWidth(int i) {
        this.f11984n = i;
        m10677c();
    }

    public void setScrollOffset(int i) {
        this.f11990t = i;
        invalidate();
    }

    public void setShouldExpand(boolean z) {
        this.f11989s = z;
        requestLayout();
    }

    public void setTabPaddingLeftRight(int i) {
        this.f11994x = i;
        m10677c();
    }

    public void setTextSize(int i) {
        this.f11996z = i;
        m10677c();
    }

    public void setUnderlineColor(int i) {
        this.f11987q = i;
        invalidate();
    }

    public void setUnderlineHeight(int i) {
        this.f11992v = i;
        invalidate();
    }

    public void setDividerColorResource(int i) {
        this.f11988r = getResources().getColor(i);
        invalidate();
    }

    public void setIndicatorColorResource(int i) {
        this.f11986p = getResources().getColor(i);
        invalidate();
    }

    public void setTextColor(int i) {
        this.f11967A = ColorStateList.valueOf(i);
        m10677c();
    }

    public void setTextColorResource(int i) {
        this.f11967A = getResources().getColorStateList(i);
        m10677c();
    }

    public void setUnderlineColorResource(int i) {
        this.f11987q = getResources().getColor(i);
        invalidate();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f11975d = savedState.f12000a;
        requestLayout();
    }

    public void setViewPager(ViewPager viewPager) {
        this.f11974c = viewPager;
        if (viewPager.getAdapter() != null) {
            viewPager.setOnPageChangeListener(this.f11980j);
            m10676b();
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter instance.");
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!isInEditMode() && this.f11981k != 0) {
            int height = getHeight();
            this.f11982l.setColor(this.f11986p);
            View childAt = this.f11973b.getChildAt(this.f11975d);
            float left = (float) childAt.getLeft();
            float right = (float) childAt.getRight();
            if (this.f11976e > 0.0f && this.f11975d < this.f11981k - 1) {
                View childAt2 = this.f11973b.getChildAt(this.f11975d + 1);
                float left2 = (float) childAt2.getLeft();
                left = (this.f11976e * left2) + ((1.0f - this.f11976e) * left);
                right = (this.f11976e * ((float) childAt2.getRight())) + ((1.0f - this.f11976e) * right);
            }
            if (this.f11984n != 0) {
                float f = ((right - left) - ((float) this.f11984n)) / 2.0f;
                left += f;
                right -= f;
            }
            float f2 = right;
            float f3 = left;
            if (this.f11985o <= 0 || VERSION.SDK_INT <= 21) {
                canvas.drawRect(f3, (float) (height - this.f11991u), f2, (float) height, this.f11982l);
            } else {
                canvas.drawRoundRect(f3, (float) (height - this.f11991u), f2, (float) height, (float) this.f11985o, (float) this.f11985o, this.f11982l);
            }
            this.f11982l.setColor(this.f11987q);
            canvas.drawRect(0.0f, (float) (height - this.f11992v), (float) this.f11973b.getWidth(), (float) height, this.f11982l);
            this.f11983m.setColor(this.f11988r);
            for (int i = 0; i < this.f11981k - 1; i++) {
                View childAt3 = this.f11973b.getChildAt(i);
                canvas.drawLine((float) childAt3.getRight(), (float) this.f11993w, (float) childAt3.getRight(), (float) (height - this.f11993w), this.f11983m);
            }
        }
    }

    public WalletPagerSlidingTabStrip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo10166a(int i, boolean z) {
        int childCount = this.f11973b.getChildCount();
        if (childCount != 0 && i >= 0 && i < childCount) {
            this.f11973b.getChildAt(i).setSelected(z);
        }
    }

    /* renamed from: a */
    private void m10675a(final int i, View view) {
        LayoutParams layoutParams;
        view.setFocusable(true);
        view.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                WalletPagerSlidingTabStrip.this.f11974c.setCurrentItem(i);
            }
        });
        view.setPadding(this.f11994x, 0, this.f11994x, 0);
        if (VERSION.SDK_INT >= 17 && C4206c.m10426a(getContext())) {
            view.setPaddingRelative(this.f11994x, 0, this.f11994x, 0);
        }
        LinearLayout linearLayout = this.f11973b;
        if (this.f11989s) {
            layoutParams = this.f11979i;
        } else {
            layoutParams = this.f11978h;
        }
        linearLayout.addView(view, i, layoutParams);
    }

    /* renamed from: a */
    public final void mo10165a(int i, int i2) {
        int i3;
        if (this.f11981k != 0) {
            if (C4206c.m10426a(getContext())) {
                i3 = this.f11973b.getChildAt(i).getLeft() - i2;
            } else {
                i3 = this.f11973b.getChildAt(i).getLeft() + i2;
            }
            if (i > 0 || i2 > 0) {
                i3 -= this.f11990t;
            }
            if (i3 != this.f11969C) {
                this.f11969C = i3;
                scrollTo(i3, 0);
            }
        }
    }

    public WalletPagerSlidingTabStrip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11980j = new C4382d();
        this.f11975d = 0;
        this.f11976e = 0.0f;
        this.f11984n = 0;
        this.f11985o = 0;
        this.f11986p = 16737894;
        this.f11987q = 436207616;
        this.f11988r = 436207616;
        this.f11989s = false;
        this.f11977f = true;
        this.f11990t = 52;
        this.f11991u = 8;
        this.f11992v = 2;
        this.f11993w = 12;
        this.f11994x = 24;
        this.f11995y = 1;
        this.f11996z = 12;
        this.f11967A = ColorStateList.valueOf(16737894);
        this.f11968B = null;
        this.f11969C = 0;
        this.f11970D = R.drawable.g8;
        setFillViewport(true);
        setWillNotDraw(false);
        this.f11973b = new LinearLayout(context);
        this.f11973b.setOrientation(0);
        this.f11973b.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.f11973b);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f11990t = (int) TypedValue.applyDimension(1, (float) this.f11990t, displayMetrics);
        this.f11991u = (int) TypedValue.applyDimension(1, (float) this.f11991u, displayMetrics);
        this.f11992v = (int) TypedValue.applyDimension(1, (float) this.f11992v, displayMetrics);
        this.f11993w = (int) TypedValue.applyDimension(1, (float) this.f11993w, displayMetrics);
        this.f11994x = (int) TypedValue.applyDimension(1, (float) this.f11994x, displayMetrics);
        this.f11995y = (int) TypedValue.applyDimension(1, (float) this.f11995y, displayMetrics);
        this.f11996z = (int) TypedValue.applyDimension(2, (float) this.f11996z, displayMetrics);
        this.f11984n = (int) TypedValue.applyDimension(1, (float) this.f11984n, displayMetrics);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f11966g);
        this.f11996z = obtainStyledAttributes.getDimensionPixelSize(0, this.f11996z);
        this.f11967A = obtainStyledAttributes.getColorStateList(1);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a8n, R.attr.a8o, R.attr.a8p, R.attr.a8q, R.attr.a8r, R.attr.a8s, R.attr.a8t, R.attr.a8u, R.attr.a8v, R.attr.a8w, R.attr.a8x, R.attr.a8y, R.attr.a8z, R.attr.a90, R.attr.a91});
        this.f11986p = obtainStyledAttributes2.getColor(3, this.f11986p);
        this.f11987q = obtainStyledAttributes2.getColor(13, this.f11987q);
        this.f11988r = obtainStyledAttributes2.getColor(1, this.f11988r);
        this.f11991u = obtainStyledAttributes2.getDimensionPixelSize(4, this.f11991u);
        this.f11992v = obtainStyledAttributes2.getDimensionPixelSize(14, this.f11992v);
        this.f11993w = obtainStyledAttributes2.getDimensionPixelSize(2, this.f11993w);
        this.f11994x = obtainStyledAttributes2.getDimensionPixelSize(7, this.f11994x);
        this.f11970D = obtainStyledAttributes2.getResourceId(0, this.f11970D);
        this.f11989s = obtainStyledAttributes2.getBoolean(9, this.f11989s);
        this.f11990t = obtainStyledAttributes2.getDimensionPixelSize(8, this.f11990t);
        this.f11977f = obtainStyledAttributes2.getBoolean(10, this.f11977f);
        this.f11996z = obtainStyledAttributes2.getDimensionPixelSize(12, this.f11996z);
        this.f11967A = obtainStyledAttributes2.getColorStateList(11);
        this.f11984n = obtainStyledAttributes2.getDimensionPixelSize(6, this.f11984n);
        this.f11985o = obtainStyledAttributes2.getDimensionPixelSize(5, 0);
        obtainStyledAttributes2.recycle();
        this.f11982l = new Paint();
        this.f11982l.setAntiAlias(true);
        this.f11982l.setStyle(Style.FILL);
        this.f11983m = new Paint();
        this.f11983m.setAntiAlias(true);
        this.f11983m.setStrokeWidth((float) this.f11995y);
        this.f11978h = new LayoutParams(-2, -1);
        this.f11979i = new LayoutParams(0, -1, 1.0f);
        if (this.f11971E == null) {
            this.f11971E = getResources().getConfiguration().locale;
        }
        if (this.f11967A == null) {
            this.f11967A = ColorStateList.valueOf(16737894);
        }
    }
}
