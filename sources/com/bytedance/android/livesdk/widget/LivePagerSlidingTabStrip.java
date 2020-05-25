package com.bytedance.android.livesdk.widget;

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
import android.view.LayoutInflater;
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

public class LivePagerSlidingTabStrip extends HorizontalScrollView {

    /* renamed from: i */
    private static final int[] f23021i = {16842901, 16842904};

    /* renamed from: A */
    private int f23022A;

    /* renamed from: B */
    private int f23023B;

    /* renamed from: C */
    private ColorStateList f23024C;

    /* renamed from: D */
    private Typeface f23025D;

    /* renamed from: E */
    private int f23026E;

    /* renamed from: F */
    private int f23027F;

    /* renamed from: G */
    private int f23028G;

    /* renamed from: H */
    private Locale f23029H;

    /* renamed from: I */
    private int f23030I;

    /* renamed from: J */
    private int f23031J;

    /* renamed from: K */
    private int f23032K;

    /* renamed from: a */
    public C0997e f23033a;

    /* renamed from: b */
    public LinearLayout f23034b;

    /* renamed from: c */
    public ViewPager f23035c;

    /* renamed from: d */
    public int f23036d;

    /* renamed from: e */
    public float f23037e;

    /* renamed from: f */
    public boolean f23038f;

    /* renamed from: g */
    public int f23039g;

    /* renamed from: h */
    public int f23040h;

    /* renamed from: j */
    private LayoutParams f23041j;

    /* renamed from: k */
    private LayoutParams f23042k;

    /* renamed from: l */
    private final C8464d f23043l;

    /* renamed from: m */
    private int f23044m;

    /* renamed from: n */
    private Paint f23045n;

    /* renamed from: o */
    private Paint f23046o;

    /* renamed from: p */
    private int f23047p;

    /* renamed from: q */
    private int f23048q;

    /* renamed from: r */
    private int f23049r;

    /* renamed from: s */
    private int f23050s;

    /* renamed from: t */
    private int f23051t;

    /* renamed from: u */
    private boolean f23052u;

    /* renamed from: v */
    private int f23053v;

    /* renamed from: w */
    private int f23054w;

    /* renamed from: x */
    private int f23055x;

    /* renamed from: y */
    private int f23056y;

    /* renamed from: z */
    private int f23057z;

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
        int f23061a;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f23061a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f23061a);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.widget.LivePagerSlidingTabStrip$a */
    public interface C8461a {
        /* renamed from: a */
        View mo14778a(Context context, int i);
    }

    /* renamed from: com.bytedance.android.livesdk.widget.LivePagerSlidingTabStrip$b */
    public interface C8462b {
        /* renamed from: a */
        int mo14779a(int i);
    }

    /* renamed from: com.bytedance.android.livesdk.widget.LivePagerSlidingTabStrip$c */
    static class C8463c {

        /* renamed from: a */
        TextView f23062a;

        /* renamed from: b */
        View f23063b;

        /* renamed from: c */
        View f23064c;

        C8463c() {
        }
    }

    /* renamed from: com.bytedance.android.livesdk.widget.LivePagerSlidingTabStrip$d */
    class C8464d implements C0997e {
        private C8464d() {
        }

        public final void onPageSelected(int i) {
            if (LivePagerSlidingTabStrip.this.f23033a != null) {
                LivePagerSlidingTabStrip.this.f23033a.onPageSelected(i);
            }
        }

        public final void onPageScrollStateChanged(int i) {
            if (i == 0) {
                LivePagerSlidingTabStrip.this.mo14730a(LivePagerSlidingTabStrip.this.f23035c.getCurrentItem(), 0);
            }
            if (LivePagerSlidingTabStrip.this.f23033a != null) {
                LivePagerSlidingTabStrip.this.f23033a.onPageScrollStateChanged(i);
            }
        }

        public final void onPageScrolled(int i, float f, int i2) {
            if (LivePagerSlidingTabStrip.this.f23036d != i) {
                LivePagerSlidingTabStrip.this.mo14731a(LivePagerSlidingTabStrip.this.f23036d, false);
                LivePagerSlidingTabStrip.this.mo14731a(i, true);
            }
            LivePagerSlidingTabStrip.this.f23036d = i;
            LivePagerSlidingTabStrip.this.f23037e = f;
            LivePagerSlidingTabStrip.this.mo14730a(i, (int) (((float) LivePagerSlidingTabStrip.this.f23034b.getChildAt(i).getWidth()) * f));
            LivePagerSlidingTabStrip.this.invalidate();
            if (LivePagerSlidingTabStrip.this.f23033a != null) {
                LivePagerSlidingTabStrip.this.f23033a.onPageScrolled(i, f, i2);
            }
        }
    }

    public int getDividerColor() {
        return this.f23051t;
    }

    public int getDividerPadding() {
        return this.f23056y;
    }

    public int getIndicatorColor() {
        return this.f23049r;
    }

    public int getIndicatorHeight() {
        return this.f23054w;
    }

    public int getIndicatorWidth() {
        return this.f23047p;
    }

    public int getScrollOffset() {
        return this.f23053v;
    }

    public boolean getShouldExpand() {
        return this.f23052u;
    }

    public int getTabBackground() {
        return this.f23028G;
    }

    public int getTabPaddingLeftRight() {
        return this.f23057z;
    }

    public ColorStateList getTextColor() {
        return this.f23024C;
    }

    public int getTextSize() {
        return this.f23023B;
    }

    public int getUnderlineColor() {
        return this.f23050s;
    }

    public int getUnderlineHeight() {
        return this.f23055x;
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f23061a = this.f23036d;
        return savedState;
    }

    /* renamed from: b */
    private void m16678b() {
        for (int i = 0; i < this.f23044m; i++) {
            View childAt = this.f23034b.getChildAt(i);
            childAt.setBackgroundResource(this.f23028G);
            Object tag = childAt.getTag();
            if (tag instanceof C8463c) {
                C8463c cVar = (C8463c) tag;
                cVar.f23062a.setTextSize(0, (float) this.f23023B);
                cVar.f23062a.setTypeface(this.f23025D, this.f23026E);
                cVar.f23062a.setTextColor(this.f23024C);
                if (this.f23038f) {
                    if (VERSION.SDK_INT >= 14) {
                        cVar.f23062a.setAllCaps(true);
                    } else {
                        cVar.f23062a.setText(cVar.f23062a.getText().toString().toUpperCase(this.f23029H));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m16676a() {
        View view;
        this.f23034b.removeAllViews();
        this.f23044m = this.f23035c.getAdapter().getCount();
        for (int i = 0; i < this.f23044m; i++) {
            if (this.f23035c.getAdapter() instanceof C8461a) {
                m16677a(i, ((C8461a) this.f23035c.getAdapter()).mo14778a(getContext(), i));
            } else if (this.f23035c.getAdapter() instanceof C8462b) {
                int a = ((C8462b) this.f23035c.getAdapter()).mo14779a(i);
                ImageButton imageButton = new ImageButton(getContext());
                imageButton.setImageResource(a);
                m16677a(i, (View) imageButton);
            } else {
                CharSequence pageTitle = this.f23035c.getAdapter().getPageTitle(i);
                if (pageTitle != null) {
                    String charSequence = pageTitle.toString();
                    C8463c cVar = new C8463c();
                    if (this.f23039g <= 0 || this.f23040h <= 0) {
                        view = LayoutInflater.from(getContext()).inflate(R.layout.amh, null, false);
                        cVar.f23062a = (TextView) view.findViewById(R.id.text);
                        cVar.f23063b = view.findViewById(R.id.a70);
                        cVar.f23063b.setVisibility(8);
                    } else {
                        view = LayoutInflater.from(getContext()).inflate(this.f23039g, null, false);
                        cVar.f23062a = (TextView) view.findViewById(this.f23040h);
                        cVar.f23064c = view.findViewById(this.f23030I);
                    }
                    cVar.f23062a.setText(charSequence);
                    cVar.f23062a.setGravity(17);
                    cVar.f23062a.setSingleLine();
                    view.setTag(cVar);
                    m16677a(i, view);
                }
            }
        }
        m16678b();
        getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
            public final void onGlobalLayout() {
                if (VERSION.SDK_INT < 16) {
                    LivePagerSlidingTabStrip.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                } else {
                    LivePagerSlidingTabStrip.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
                LivePagerSlidingTabStrip.this.f23036d = LivePagerSlidingTabStrip.this.f23035c.getCurrentItem();
                LivePagerSlidingTabStrip.this.mo14731a(LivePagerSlidingTabStrip.this.f23036d, true);
                LivePagerSlidingTabStrip.this.mo14730a(LivePagerSlidingTabStrip.this.f23036d, 0);
            }
        });
    }

    public void setAllCaps(boolean z) {
        this.f23038f = z;
    }

    public void setIconResId(int i) {
        this.f23030I = i;
    }

    public void setIndicatorBottomMargin(int i) {
        this.f23031J = i;
    }

    public void setOnPageChangeListener(C0997e eVar) {
        this.f23033a = eVar;
    }

    public void setTabBackground(int i) {
        this.f23028G = i;
    }

    public void setTextSelectedStyle(int i) {
        this.f23032K = i;
    }

    public LivePagerSlidingTabStrip(Context context) {
        this(context, null);
    }

    public void setDividerColor(int i) {
        this.f23051t = i;
        invalidate();
    }

    public void setDividerPadding(int i) {
        this.f23056y = i;
        invalidate();
    }

    public void setIndicatorColor(int i) {
        this.f23049r = i;
        invalidate();
    }

    public void setIndicatorHeight(int i) {
        this.f23054w = i;
        invalidate();
    }

    public void setIndicatorRadius(int i) {
        this.f23048q = i;
        m16678b();
    }

    public void setIndicatorWidth(int i) {
        this.f23047p = i;
        m16678b();
    }

    public void setScrollOffset(int i) {
        this.f23053v = i;
        invalidate();
    }

    public void setShouldExpand(boolean z) {
        this.f23052u = z;
        requestLayout();
    }

    public void setTabPaddingLeftRight(int i) {
        this.f23057z = i;
        m16678b();
    }

    public void setTextSize(int i) {
        this.f23023B = i;
        m16678b();
    }

    public void setUnderlineColor(int i) {
        this.f23050s = i;
        invalidate();
    }

    public void setUnderlineHeight(int i) {
        this.f23055x = i;
        invalidate();
    }

    public void setDividerColorResource(int i) {
        this.f23051t = getResources().getColor(i);
        invalidate();
    }

    public void setIndicatorColorResource(int i) {
        this.f23049r = getResources().getColor(i);
        invalidate();
    }

    public void setTextColor(int i) {
        this.f23024C = ColorStateList.valueOf(i);
        m16678b();
    }

    public void setTextColorResource(int i) {
        this.f23024C = getResources().getColorStateList(i);
        m16678b();
    }

    public void setUnderlineColorResource(int i) {
        this.f23050s = getResources().getColor(i);
        invalidate();
    }

    /* renamed from: a */
    public final void mo14729a(int i) {
        if (this.f23034b.getChildCount() > i) {
            Object tag = this.f23034b.getChildAt(i).getTag();
            if (tag instanceof C8463c) {
                ((C8463c) tag).f23063b.setVisibility(0);
            }
        }
    }

    /* renamed from: b */
    public final void mo14732b(int i) {
        if (this.f23034b.getChildCount() > i) {
            Object tag = this.f23034b.getChildAt(i).getTag();
            if (tag instanceof C8463c) {
                ((C8463c) tag).f23063b.setVisibility(8);
            }
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f23036d = savedState.f23061a;
        requestLayout();
    }

    public void setViewPager(ViewPager viewPager) {
        this.f23035c = viewPager;
        if (viewPager.getAdapter() != null) {
            viewPager.setOnPageChangeListener(this.f23043l);
            m16676a();
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter INSTANCE.");
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!isInEditMode() && this.f23044m != 0) {
            int height = getHeight();
            this.f23045n.setColor(this.f23049r);
            View childAt = this.f23034b.getChildAt(this.f23036d);
            float left = (float) childAt.getLeft();
            float right = (float) childAt.getRight();
            if (this.f23037e > 0.0f && this.f23036d < this.f23044m - 1) {
                View childAt2 = this.f23034b.getChildAt(this.f23036d + 1);
                float left2 = (float) childAt2.getLeft();
                left = (this.f23037e * left2) + ((1.0f - this.f23037e) * left);
                right = (this.f23037e * ((float) childAt2.getRight())) + ((1.0f - this.f23037e) * right);
            }
            if (this.f23047p != 0) {
                float f = ((right - left) - ((float) this.f23047p)) / 2.0f;
                left += f;
                right -= f;
            }
            float f2 = right;
            float f3 = left;
            if (this.f23048q <= 0 || VERSION.SDK_INT <= 21) {
                canvas.drawRect(f3, (float) ((height - this.f23054w) - this.f23031J), f2, (float) (height - this.f23031J), this.f23045n);
            } else {
                canvas.drawRoundRect(f3, (float) ((height - this.f23054w) - this.f23031J), f2, (float) (height - this.f23031J), (float) this.f23048q, (float) this.f23048q, this.f23045n);
            }
            this.f23045n.setColor(this.f23050s);
            canvas.drawRect(0.0f, (float) (height - this.f23055x), (float) this.f23034b.getWidth(), (float) height, this.f23045n);
            this.f23046o.setColor(this.f23051t);
            for (int i = 0; i < this.f23044m - 1; i++) {
                View childAt3 = this.f23034b.getChildAt(i);
                canvas.drawLine((float) childAt3.getRight(), (float) this.f23056y, (float) childAt3.getRight(), (float) (height - this.f23056y), this.f23046o);
            }
        }
    }

    public LivePagerSlidingTabStrip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m16677a(final int i, View view) {
        LayoutParams layoutParams;
        view.setFocusable(true);
        view.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                LivePagerSlidingTabStrip.this.f23035c.setCurrentItem(i);
            }
        });
        view.setPadding(this.f23057z, 0, this.f23057z, 0);
        if (VERSION.SDK_INT >= 17 && C4206c.m10426a(getContext())) {
            view.setPaddingRelative(this.f23057z, 0, this.f23057z, 0);
        }
        LinearLayout linearLayout = this.f23034b;
        if (this.f23052u) {
            layoutParams = this.f23042k;
        } else {
            layoutParams = this.f23041j;
        }
        linearLayout.addView(view, i, layoutParams);
    }

    /* renamed from: a */
    public final void mo14730a(int i, int i2) {
        int i3;
        if (this.f23044m != 0) {
            if (C4206c.m10426a(getContext())) {
                i3 = this.f23034b.getChildAt(i).getLeft() - i2;
            } else {
                i3 = this.f23034b.getChildAt(i).getLeft() + i2;
            }
            if (i > 0 || i2 > 0) {
                i3 -= this.f23053v;
            }
            if (i3 != this.f23027F) {
                this.f23027F = i3;
                scrollTo(i3, 0);
            }
        }
    }

    /* renamed from: a */
    public final void mo14731a(int i, boolean z) {
        int childCount = this.f23034b.getChildCount();
        if (childCount != 0 && i >= 0 && i < childCount) {
            View childAt = this.f23034b.getChildAt(i);
            childAt.setSelected(z);
            Object tag = childAt.getTag();
            if (tag instanceof C8463c) {
                C8463c cVar = (C8463c) tag;
                if (this.f23032K == 1) {
                    if (z) {
                        cVar.f23062a.setTypeface(Typeface.DEFAULT_BOLD);
                        return;
                    }
                    cVar.f23062a.setTypeface(Typeface.DEFAULT);
                }
            }
        }
    }

    public LivePagerSlidingTabStrip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23043l = new C8464d();
        this.f23036d = 0;
        this.f23037e = 0.0f;
        this.f23047p = 0;
        this.f23048q = 0;
        this.f23049r = 16737894;
        this.f23050s = 436207616;
        this.f23051t = 436207616;
        this.f23052u = false;
        this.f23038f = true;
        this.f23053v = 52;
        this.f23054w = 8;
        this.f23055x = 2;
        this.f23056y = 12;
        this.f23057z = 24;
        this.f23022A = 1;
        this.f23023B = 12;
        this.f23024C = ColorStateList.valueOf(16737894);
        this.f23025D = null;
        this.f23026E = 1;
        this.f23027F = 0;
        this.f23028G = R.drawable.be9;
        this.f23031J = 0;
        this.f23032K = 0;
        setFillViewport(true);
        setWillNotDraw(false);
        this.f23034b = new LinearLayout(context);
        this.f23034b.setOrientation(0);
        this.f23034b.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.f23034b);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f23053v = (int) TypedValue.applyDimension(1, (float) this.f23053v, displayMetrics);
        this.f23054w = (int) TypedValue.applyDimension(1, (float) this.f23054w, displayMetrics);
        this.f23055x = (int) TypedValue.applyDimension(1, (float) this.f23055x, displayMetrics);
        this.f23056y = (int) TypedValue.applyDimension(1, (float) this.f23056y, displayMetrics);
        this.f23057z = (int) TypedValue.applyDimension(1, (float) this.f23057z, displayMetrics);
        this.f23022A = (int) TypedValue.applyDimension(1, (float) this.f23022A, displayMetrics);
        this.f23023B = (int) TypedValue.applyDimension(2, (float) this.f23023B, displayMetrics);
        this.f23047p = (int) TypedValue.applyDimension(1, (float) this.f23047p, displayMetrics);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f23021i);
        this.f23023B = obtainStyledAttributes.getDimensionPixelSize(0, this.f23023B);
        this.f23024C = obtainStyledAttributes.getColorStateList(1);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a4y, R.attr.a4z, R.attr.a50, R.attr.a51, R.attr.a52, R.attr.a53, R.attr.a54, R.attr.a55, R.attr.a56, R.attr.a57, R.attr.a58, R.attr.a59, R.attr.a5_, R.attr.a5a, R.attr.a5b, R.attr.a5c});
        this.f23049r = obtainStyledAttributes2.getColor(3, this.f23049r);
        this.f23050s = obtainStyledAttributes2.getColor(14, this.f23050s);
        this.f23051t = obtainStyledAttributes2.getColor(1, this.f23051t);
        this.f23054w = obtainStyledAttributes2.getDimensionPixelSize(4, this.f23054w);
        this.f23055x = obtainStyledAttributes2.getDimensionPixelSize(15, this.f23055x);
        this.f23056y = obtainStyledAttributes2.getDimensionPixelSize(2, this.f23056y);
        this.f23057z = obtainStyledAttributes2.getDimensionPixelSize(7, this.f23057z);
        this.f23028G = obtainStyledAttributes2.getResourceId(0, this.f23028G);
        this.f23052u = obtainStyledAttributes2.getBoolean(9, this.f23052u);
        this.f23053v = obtainStyledAttributes2.getDimensionPixelSize(8, this.f23053v);
        this.f23038f = obtainStyledAttributes2.getBoolean(10, this.f23038f);
        this.f23023B = obtainStyledAttributes2.getDimensionPixelSize(12, this.f23023B);
        this.f23024C = obtainStyledAttributes2.getColorStateList(11);
        this.f23047p = obtainStyledAttributes2.getDimensionPixelSize(6, this.f23047p);
        this.f23048q = obtainStyledAttributes2.getDimensionPixelSize(5, 0);
        this.f23026E = obtainStyledAttributes2.getInt(13, 1);
        obtainStyledAttributes2.recycle();
        this.f23045n = new Paint();
        this.f23045n.setAntiAlias(true);
        this.f23045n.setStyle(Style.FILL);
        this.f23046o = new Paint();
        this.f23046o.setAntiAlias(true);
        this.f23046o.setStrokeWidth((float) this.f23022A);
        this.f23041j = new LayoutParams(-2, -1);
        this.f23042k = new LayoutParams(0, -1, 1.0f);
        if (this.f23029H == null) {
            this.f23029H = getResources().getConfiguration().locale;
        }
        if (this.f23024C == null) {
            this.f23024C = ColorStateList.valueOf(16737894);
        }
    }
}
