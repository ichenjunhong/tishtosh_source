package android.support.p043v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.p043v7.app.ActionBar.C1126a;
import android.support.p043v7.view.C1217a;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import com.ss.android.ugc.trill.R;

/* renamed from: android.support.v7.widget.at */
public final class C1436at extends HorizontalScrollView implements OnItemSelectedListener {

    /* renamed from: i */
    private static final Interpolator f5166i = new DecelerateInterpolator();

    /* renamed from: a */
    Runnable f5167a;

    /* renamed from: b */
    LinearLayoutCompat f5168b;

    /* renamed from: c */
    int f5169c;

    /* renamed from: d */
    int f5170d;

    /* renamed from: e */
    int f5171e;

    /* renamed from: f */
    private Spinner f5172f;

    /* renamed from: g */
    private boolean f5173g;

    /* renamed from: h */
    private int f5174h;

    /* renamed from: android.support.v7.widget.at$a */
    class C1438a extends BaseAdapter {
        public final long getItemId(int i) {
            return (long) i;
        }

        public final int getCount() {
            return C1436at.this.f5168b.getChildCount();
        }

        C1438a() {
        }

        public final Object getItem(int i) {
            return ((C1439b) C1436at.this.f5168b.getChildAt(i)).f5178a;
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                C1436at atVar = C1436at.this;
                C1439b bVar = new C1439b(atVar.getContext(), (C1126a) getItem(i), true);
                bVar.setBackgroundDrawable(null);
                bVar.setLayoutParams(new LayoutParams(-1, atVar.f5171e));
                return bVar;
            }
            C1439b bVar2 = (C1439b) view;
            bVar2.f5178a = (C1126a) getItem(i);
            bVar2.mo5620a();
            return view;
        }
    }

    /* renamed from: android.support.v7.widget.at$b */
    class C1439b extends LinearLayout {

        /* renamed from: a */
        C1126a f5178a;

        /* renamed from: c */
        private final int[] f5180c = {16842964};

        /* renamed from: d */
        private TextView f5181d;

        /* renamed from: e */
        private ImageView f5182e;

        /* renamed from: f */
        private View f5183f;

        /* renamed from: a */
        public final void mo5620a() {
            C1126a aVar = this.f5178a;
            View c = aVar.mo3605c();
            CharSequence charSequence = null;
            if (c != null) {
                ViewParent parent = c.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(c);
                    }
                    addView(c);
                }
                this.f5183f = c;
                if (this.f5181d != null) {
                    this.f5181d.setVisibility(8);
                }
                if (this.f5182e != null) {
                    this.f5182e.setVisibility(8);
                    this.f5182e.setImageDrawable(null);
                }
                return;
            }
            if (this.f5183f != null) {
                removeView(this.f5183f);
                this.f5183f = null;
            }
            Drawable a = aVar.mo3603a();
            CharSequence b = aVar.mo3604b();
            if (a != null) {
                if (this.f5182e == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f5182e = appCompatImageView;
                }
                this.f5182e.setImageDrawable(a);
                this.f5182e.setVisibility(0);
            } else if (this.f5182e != null) {
                this.f5182e.setVisibility(8);
                this.f5182e.setImageDrawable(null);
            }
            boolean z = !TextUtils.isEmpty(b);
            if (z) {
                if (this.f5181d == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, R.attr.i);
                    appCompatTextView.setEllipsize(TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f5181d = appCompatTextView;
                }
                this.f5181d.setText(b);
                this.f5181d.setVisibility(0);
            } else if (this.f5181d != null) {
                this.f5181d.setVisibility(8);
                this.f5181d.setText(null);
            }
            if (this.f5182e != null) {
                this.f5182e.setContentDescription(aVar.mo3606d());
            }
            if (!z) {
                charSequence = aVar.mo3606d();
            }
            C1455bd.m5087a(this, charSequence);
        }

        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(C1126a.class.getName());
        }

        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(C1126a.class.getName());
        }

        public final void setSelected(boolean z) {
            boolean z2;
            if (isSelected() != z) {
                z2 = true;
            } else {
                z2 = false;
            }
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }

        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (C1436at.this.f5169c > 0 && getMeasuredWidth() > C1436at.this.f5169c) {
                super.onMeasure(MeasureSpec.makeMeasureSpec(C1436at.this.f5169c, 1073741824), i2);
            }
        }

        public C1439b(Context context, C1126a aVar, boolean z) {
            super(context, null, R.attr.h);
            this.f5178a = aVar;
            C1451bb a = C1451bb.m5032a(context, null, this.f5180c, R.attr.h, 0);
            if (a.mo5664f(0)) {
                setBackgroundDrawable(a.mo5652a(0));
            }
            a.mo5653a();
            if (z) {
                setGravity(8388627);
            }
            mo5620a();
        }
    }

    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
    }

    public final void onNothingSelected(AdapterView<?> adapterView) {
    }

    /* renamed from: a */
    private boolean m4981a() {
        if (this.f5172f == null || this.f5172f.getParent() != this) {
            return false;
        }
        return true;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f5167a != null) {
            post(this.f5167a);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f5167a != null) {
            removeCallbacks(this.f5167a);
        }
    }

    /* renamed from: b */
    private boolean m4982b() {
        if (!m4981a()) {
            return false;
        }
        removeView(this.f5172f);
        addView(this.f5168b, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f5172f.getSelectedItemPosition());
        return false;
    }

    public final void setAllowCollapse(boolean z) {
        this.f5173g = z;
    }

    public final void setContentHeight(int i) {
        this.f5171e = i;
        requestLayout();
    }

    public final void setTabSelected(int i) {
        boolean z;
        this.f5174h = i;
        int childCount = this.f5168b.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.f5168b.getChildAt(i2);
            if (i2 == i) {
                z = true;
            } else {
                z = false;
            }
            childAt.setSelected(z);
            if (z) {
                final View childAt2 = this.f5168b.getChildAt(i);
                if (this.f5167a != null) {
                    removeCallbacks(this.f5167a);
                }
                this.f5167a = new Runnable() {
                    public final void run() {
                        C1436at.this.smoothScrollTo(childAt2.getLeft() - ((C1436at.this.getWidth() - childAt2.getWidth()) / 2), 0);
                        C1436at.this.f5167a = null;
                    }
                };
                post(this.f5167a);
            }
        }
        if (this.f5172f != null && i >= 0) {
            this.f5172f.setSelection(i);
        }
    }

    /* access modifiers changed from: protected */
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C1217a a = C1217a.m3676a(getContext());
        TypedArray obtainStyledAttributes = a.f4017a.obtainStyledAttributes(null, new int[]{R.attr.bt, R.attr.bw, R.attr.bx, R.attr.i5, R.attr.i6, R.attr.i7, R.attr.i8, R.attr.i9, R.attr.i_, R.attr.j8, R.attr.js, R.attr.jt, R.attr.k_, R.attr.n0, R.attr.n7, R.attr.nh, R.attr.ni, R.attr.nl, R.attr.oc, R.attr.po, R.attr.t8, R.attr.un, R.attr.vs, R.attr.wa, R.attr.wb, R.attr.a3v, R.attr.a3y, R.attr.a6u, R.attr.a76}, R.attr.f, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(13, 0);
        Resources resources = a.f4017a.getResources();
        if (!a.mo3936b()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(R.dimen.m));
        }
        obtainStyledAttributes.recycle();
        setContentHeight(layoutDimension);
        this.f5170d = a.f4017a.getResources().getDimensionPixelSize(R.dimen.n);
    }

    public final void onMeasure(int i, int i2) {
        boolean z;
        int mode = MeasureSpec.getMode(i);
        boolean z2 = true;
        if (mode == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        setFillViewport(z);
        int childCount = this.f5168b.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f5169c = -1;
        } else {
            if (childCount > 2) {
                this.f5169c = (int) (((float) MeasureSpec.getSize(i)) * 0.4f);
            } else {
                this.f5169c = MeasureSpec.getSize(i) / 2;
            }
            this.f5169c = Math.min(this.f5169c, this.f5170d);
        }
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f5171e, 1073741824);
        if (z || !this.f5173g) {
            z2 = false;
        }
        if (z2) {
            this.f5168b.measure(0, makeMeasureSpec);
            if (this.f5168b.getMeasuredWidth() <= MeasureSpec.getSize(i)) {
                m4982b();
            } else if (!m4981a()) {
                if (this.f5172f == null) {
                    AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), null, R.attr.m);
                    appCompatSpinner.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
                    appCompatSpinner.setOnItemSelectedListener(this);
                    this.f5172f = appCompatSpinner;
                }
                removeView(this.f5168b);
                addView(this.f5172f, new ViewGroup.LayoutParams(-2, -1));
                if (this.f5172f.getAdapter() == null) {
                    this.f5172f.setAdapter(new C1438a());
                }
                if (this.f5167a != null) {
                    removeCallbacks(this.f5167a);
                    this.f5167a = null;
                }
                this.f5172f.setSelection(this.f5174h);
            }
        } else {
            m4982b();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (z && measuredWidth != measuredWidth2) {
            setTabSelected(this.f5174h);
        }
    }
}
