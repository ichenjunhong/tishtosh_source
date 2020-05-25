package com.p683ss.android.ugc.aweme.commercialize.loft;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.arch.lifecycle.C0198r;
import android.content.Context;
import android.os.Build.VERSION;
import android.support.p030v4.view.C1048m;
import android.support.p030v4.view.C1050o;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.commercialize.loft.p1574a.C26002a;
import com.p683ss.android.ugc.aweme.commercialize.loft.p1574a.C26003b;
import com.p683ss.android.ugc.aweme.commercialize.loft.p1574a.C26004c;
import com.p683ss.android.ugc.aweme.commercialize.loft.p1575b.C26009d;
import com.p683ss.android.ugc.aweme.commercialize.loft.p1575b.C26009d.C26010a;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.loft.LoftNestedRefreshLayout */
public final class LoftNestedRefreshLayout extends AbsLoftNestedRefreshLayout implements C1048m {

    /* renamed from: a */
    public ViewGroup f68616a;

    /* renamed from: b */
    public boolean f68617b;

    /* renamed from: c */
    public boolean f68618c;

    /* renamed from: d */
    public boolean f68619d;

    /* renamed from: e */
    public ArrayList<C26003b> f68620e;

    /* renamed from: f */
    private final C1050o f68621f;

    /* renamed from: g */
    private View f68622g;

    /* renamed from: h */
    private View f68623h;

    /* renamed from: i */
    private boolean f68624i;

    /* renamed from: j */
    private C0198r<Float> f68625j;

    /* renamed from: k */
    private boolean f68626k;

    /* renamed from: l */
    private ValueAnimator f68627l;

    /* renamed from: m */
    private boolean f68628m;

    /* renamed from: n */
    private float f68629n;

    /* renamed from: o */
    private float f68630o;

    /* renamed from: p */
    private boolean f68631p;

    /* renamed from: q */
    private C26002a f68632q;

    /* renamed from: r */
    private C26004c f68633r;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.LoftNestedRefreshLayout$a */
    static final class C25994a implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ LoftNestedRefreshLayout f68634a;

        C25994a(LoftNestedRefreshLayout loftNestedRefreshLayout) {
            this.f68634a = loftNestedRefreshLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            LoftNestedRefreshLayout loftNestedRefreshLayout = this.f68634a;
            C52711k.m112236a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                loftNestedRefreshLayout.mo53372a(((Float) animatedValue).floatValue());
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.LoftNestedRefreshLayout$b */
    public static final class C25995b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ LoftNestedRefreshLayout f68635a;

        C25995b(LoftNestedRefreshLayout loftNestedRefreshLayout) {
            this.f68635a = loftNestedRefreshLayout;
        }

        public final void onAnimationStart(Animator animator) {
            this.f68635a.setReturningToStart(true);
        }

        public final void onAnimationEnd(Animator animator) {
            this.f68635a.setReturningToStart(false);
            if (this.f68635a.f68618c) {
                this.f68635a.f68618c = false;
                if (this.f68635a.getIRefresh() == null) {
                }
            } else {
                for (C26003b d : this.f68635a.f68620e) {
                    d.mo53406d();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.LoftNestedRefreshLayout$c */
    static final class C25996c implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ LoftNestedRefreshLayout f68636a;

        C25996c(LoftNestedRefreshLayout loftNestedRefreshLayout) {
            this.f68636a = loftNestedRefreshLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            LoftNestedRefreshLayout loftNestedRefreshLayout = this.f68636a;
            C52711k.m112236a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                loftNestedRefreshLayout.mo53372a(((Float) animatedValue).floatValue());
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.LoftNestedRefreshLayout$d */
    public static final class C25997d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ LoftNestedRefreshLayout f68637a;

        C25997d(LoftNestedRefreshLayout loftNestedRefreshLayout) {
            this.f68637a = loftNestedRefreshLayout;
        }

        public final void onAnimationStart(Animator animator) {
            this.f68637a.f68617b = true;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f68637a.f68617b = false;
            for (C26003b b : this.f68637a.f68620e) {
                b.mo53404b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.LoftNestedRefreshLayout$e */
    public static final class C25998e implements C26002a {

        /* renamed from: a */
        final /* synthetic */ LoftNestedRefreshLayout f68638a;

        C25998e(LoftNestedRefreshLayout loftNestedRefreshLayout) {
            this.f68638a = loftNestedRefreshLayout;
        }

        /* renamed from: a */
        public final float mo53399a(float f) {
            Object value = this.f68638a.getTotalConsume().getValue();
            if (value == null) {
                C52711k.m112234a();
            }
            return ((float) Math.pow(0.9950248756218907d, (double) ((Number) value).floatValue())) * f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.LoftNestedRefreshLayout$f */
    static final class C25999f implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ LoftNestedRefreshLayout f68639a;

        /* renamed from: b */
        final /* synthetic */ boolean f68640b;

        C25999f(LoftNestedRefreshLayout loftNestedRefreshLayout, boolean z) {
            this.f68639a = loftNestedRefreshLayout;
            this.f68640b = z;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            LoftNestedRefreshLayout loftNestedRefreshLayout = this.f68639a;
            C52711k.m112236a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                loftNestedRefreshLayout.mo53372a(((Float) animatedValue).floatValue());
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.LoftNestedRefreshLayout$g */
    public static final class C26000g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ LoftNestedRefreshLayout f68641a;

        /* renamed from: b */
        final /* synthetic */ boolean f68642b;

        public final void onAnimationStart(Animator animator) {
            C26004c iRefresh = this.f68641a.getIRefresh();
            if (iRefresh != null) {
                iRefresh.mo53407e();
            }
        }

        public final void onAnimationEnd(Animator animator) {
            if (!this.f68641a.f68619d) {
                this.f68641a.f68619d = this.f68642b;
                C26004c iRefresh = this.f68641a.getIRefresh();
                if (iRefresh != null) {
                    iRefresh.mo53408f();
                }
            }
        }

        C26000g(LoftNestedRefreshLayout loftNestedRefreshLayout, boolean z) {
            this.f68641a = loftNestedRefreshLayout;
            this.f68642b = z;
        }
    }

    public LoftNestedRefreshLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public LoftNestedRefreshLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    private boolean m63029a() {
        return this.f68619d;
    }

    public final boolean getEnableExpand() {
        return this.f68628m;
    }

    public final boolean getExpand() {
        return this.f68631p;
    }

    public final C26002a getIDamping() {
        return this.f68632q;
    }

    public final C26004c getIRefresh() {
        return this.f68633r;
    }

    public final boolean getReturningToStart() {
        return this.f68624i;
    }

    public final C0198r<Float> getTotalConsume() {
        return this.f68625j;
    }

    public final ViewGroup getHeaderView() {
        ViewGroup viewGroup = this.f68616a;
        if (viewGroup == null) {
            C52711k.m112237a("headerView");
        }
        return viewGroup;
    }

    public final int getNestedScrollAxes() {
        if (VERSION.SDK_INT >= 21) {
            return super.getNestedScrollAxes();
        }
        return this.f68621f.f3334a;
    }

    public final void setEnableExpand(boolean z) {
        this.f68628m = z;
    }

    public final void setIRefresh(C26004c cVar) {
        this.f68633r = cVar;
    }

    public final void setReturningToStart(boolean z) {
        this.f68624i = z;
    }

    public final void setHeaderView(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "<set-?>");
        this.f68616a = viewGroup;
    }

    public final void setIDamping(C26002a aVar) {
        C52711k.m112240b(aVar, "<set-?>");
        this.f68632q = aVar;
    }

    public final void setTotalConsume(C0198r<Float> rVar) {
        C52711k.m112240b(rVar, "<set-?>");
        this.f68625j = rVar;
    }

    /* renamed from: a */
    public final void mo53373a(C26003b bVar) {
        C52711k.m112240b(bVar, "listener");
        this.f68620e.add(bVar);
    }

    /* renamed from: a */
    public final void mo53372a(float f) {
        if (f >= 0.0f) {
            getHeaderView().setTranslationY(f);
            View view = this.f68623h;
            if (view != null) {
                view.setTranslationY(f);
            }
            getTotalConsume().setValue(Float.valueOf(f));
        }
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        C26010a aVar = C26009d.f68671j;
        Context context = getContext();
        C52711k.m112236a((Object) context, "context");
        ((C26009d) aVar.mo53461a(context)).f68673b = z;
    }

    public final void setHeader(View view) {
        C52711k.m112240b(view, "view");
        getHeaderView().removeAllViews();
        getHeaderView().addView(view);
    }

    public final void setRefreshing(boolean z) {
        if (z) {
            ValueAnimator valueAnimator = this.f68627l;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                ValueAnimator valueAnimator2 = this.f68627l;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
            }
            float[] fArr = new float[2];
            Object value = getTotalConsume().getValue();
            if (value == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a(value, "totalConsume.value!!");
            fArr[0] = ((Number) value).floatValue();
            fArr[1] = this.f68630o;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
            ofFloat.setDuration(50);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.addUpdateListener(new C25999f(this, z));
            ofFloat.addListener(new C26000g(this, z));
            ofFloat.start();
            this.f68627l = ofFloat;
            return;
        }
        if (this.f68619d) {
            this.f68619d = z;
            this.f68618c = true;
            setExpand(false);
        }
    }

    public final void onStopNestedScroll(View view) {
        C52711k.m112240b(view, "child");
        this.f68621f.mo3234a(view);
        if (this.f68626k) {
            this.f68626k = false;
            if (!C52711k.m112238a((Float) getTotalConsume().getValue(), 0.0f)) {
                boolean enableExpand = getEnableExpand();
                if (!m63029a()) {
                    Object value = getTotalConsume().getValue();
                    if (value == null) {
                        C52711k.m112234a();
                    }
                    if (((Number) value).floatValue() < this.f68629n) {
                        Object value2 = getTotalConsume().getValue();
                        if (value2 == null) {
                            C52711k.m112234a();
                        }
                        if (((Number) value2).floatValue() >= this.f68630o) {
                            Object value3 = getTotalConsume().getValue();
                            if (value3 == null) {
                                C52711k.m112234a();
                            }
                            if (((Number) value3).floatValue() < this.f68629n) {
                                setRefreshing(true);
                                return;
                            }
                        }
                        setExpand(false);
                    } else if (enableExpand) {
                        setExpand(true);
                    } else {
                        setRefreshing(true);
                    }
                }
            }
        }
    }

    public final void setExpand(boolean z) {
        this.f68631p = z;
        ValueAnimator valueAnimator = this.f68627l;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            ValueAnimator valueAnimator2 = this.f68627l;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
        }
        if (!z) {
            for (C26003b c : this.f68620e) {
                c.mo53405c();
            }
            float[] fArr = new float[2];
            Object value = getTotalConsume().getValue();
            if (value == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a(value, "totalConsume.value!!");
            fArr[0] = ((Number) value).floatValue();
            fArr[1] = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.addUpdateListener(new C25994a(this));
            ofFloat.addListener(new C25995b(this));
            ofFloat.start();
            this.f68627l = ofFloat;
            return;
        }
        if (z) {
            for (C26003b a : this.f68620e) {
                a.mo53403a();
            }
            float[] fArr2 = new float[2];
            Object value2 = getTotalConsume().getValue();
            if (value2 == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a(value2, "totalConsume.value!!");
            fArr2[0] = ((Number) value2).floatValue();
            int measuredHeight = getMeasuredHeight();
            View view = this.f68622g;
            if (view == null) {
                C52711k.m112234a();
            }
            fArr2[1] = (float) (measuredHeight - view.getMeasuredHeight());
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr2);
            ofFloat2.setInterpolator(new LinearInterpolator());
            ofFloat2.addUpdateListener(new C25996c(this));
            ofFloat2.addListener(new C25997d(this));
            ofFloat2.start();
            this.f68627l = ofFloat2;
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean z = false;
        if (this.f68622g == null && this.f68622g == null) {
            int childCount = getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i3);
                if ((!C52711k.m112239a((Object) childAt, (Object) getHeaderView())) && (!C52711k.m112239a((Object) childAt, (Object) this.f68623h))) {
                    this.f68622g = childAt;
                    break;
                }
                i3++;
            }
        }
        if (this.f68623h == null && this.f68623h == null) {
            int childCount2 = getChildCount();
            int i4 = 0;
            while (true) {
                if (i4 >= childCount2) {
                    break;
                }
                View childAt2 = getChildAt(i4);
                if ((!C52711k.m112239a((Object) childAt2, (Object) getHeaderView())) && (!C52711k.m112239a((Object) childAt2, (Object) this.f68622g))) {
                    this.f68623h = childAt2;
                    break;
                }
                i4++;
            }
        }
        if (getChildCount() <= 3 && getChildCount() == 3) {
            int childCount3 = getChildCount();
            int i5 = 0;
            for (int i6 = 0; i6 < childCount3; i6++) {
                if (C52711k.m112239a((Object) getChildAt(i6), (Object) getHeaderView()) || C52711k.m112239a((Object) getChildAt(i6), (Object) this.f68623h) || C52711k.m112239a((Object) getChildAt(i6), (Object) this.f68622g)) {
                    i5++;
                }
            }
            if (i5 == 3) {
                z = true;
            }
        }
        if (z) {
            measureChild(getHeaderView(), i, i2);
            measureChild(this.f68622g, i, i2);
            int size = MeasureSpec.getSize(i2);
            View view = this.f68622g;
            if (view == null) {
                C52711k.m112234a();
            }
            measureChild(this.f68623h, i, MeasureSpec.makeMeasureSpec(size - view.getMeasuredHeight(), MeasureSpec.getMode(i2)));
            return;
        }
        throw new AndroidRuntimeException("Only can have one child view");
    }

    public final void onNestedScrollAccepted(View view, View view2, int i) {
        C52711k.m112240b(view, "child");
        C52711k.m112240b(view2, "target");
        if (VERSION.SDK_INT >= 21) {
            super.onNestedScrollAccepted(view, view2, i);
        } else {
            this.f68621f.mo3236a(view, view2, i);
        }
    }

    public final boolean onStartNestedScroll(View view, View view2, int i) {
        C52711k.m112240b(view, "child");
        C52711k.m112240b(view2, "target");
        if (!isEnabled() || (i & 2) == 0) {
            return false;
        }
        return true;
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        C52711k.m112240b(view, "target");
        Float f3 = (Float) getTotalConsume().getValue();
        if (f3 == null) {
            f3 = Float.valueOf(0.0f);
        }
        if (f3.floatValue() > 0.0f) {
            return true;
        }
        return false;
    }

    public LoftNestedRefreshLayout(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f68621f = new C1050o(this);
        setHeaderView(new LinearLayout(getContext()));
        getHeaderView().setBackgroundResource(R.color.a0_);
        getHeaderView().setLayoutParams(new LayoutParams(-1, -1));
        addView(getHeaderView(), 0);
        setEnabled(false);
        this.f68620e = new ArrayList<>();
        C0198r<Float> rVar = new C0198r<>();
        rVar.setValue(Float.valueOf(0.0f));
        this.f68625j = rVar;
        this.f68629n = (float) C23728o.m58241a(120.0d);
        this.f68630o = (float) C23728o.m58241a(60.0d);
        this.f68632q = new C25998e(this);
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        C52711k.m112240b(view, "target");
        Float f3 = (Float) getTotalConsume().getValue();
        if (f3 == null) {
            f3 = Float.valueOf(0.0f);
        }
        if (f3.floatValue() > 0.0f) {
            return true;
        }
        return false;
    }

    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        C52711k.m112240b(view, "target");
        C52711k.m112240b(iArr, "consumed");
        this.f68626k = true;
        if (i2 > 0) {
            Object value = getTotalConsume().getValue();
            if (value == null) {
                C52711k.m112234a();
            }
            if (Float.compare(((Number) value).floatValue(), 0.0f) > 0) {
                Object value2 = getTotalConsume().getValue();
                if (value2 == null) {
                    C52711k.m112234a();
                }
                float floatValue = ((Number) value2).floatValue() - this.f68632q.mo53399a((float) Math.abs(i2));
                iArr[1] = i2;
                mo53372a(floatValue);
            }
        }
    }

    public /* synthetic */ LoftNestedRefreshLayout(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        C52711k.m112240b(view, "target");
        this.f68626k = true;
        if (i4 < 0) {
            Object value = getTotalConsume().getValue();
            if (value == null) {
                C52711k.m112234a();
            }
            float floatValue = ((Number) value).floatValue() + this.f68632q.mo53399a((float) Math.abs(i4));
            if ((m63029a() && floatValue <= this.f68630o) || !m63029a()) {
                mo53372a(floatValue);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ViewGroup headerView = getHeaderView();
        int paddingLeft = getPaddingLeft();
        View view = this.f68622g;
        if (view == null) {
            C52711k.m112234a();
        }
        int measuredHeight = view.getMeasuredHeight() - getHeaderView().getMeasuredHeight();
        int paddingLeft2 = getPaddingLeft() + getHeaderView().getMeasuredWidth();
        View view2 = this.f68622g;
        if (view2 == null) {
            C52711k.m112234a();
        }
        headerView.layout(paddingLeft, measuredHeight, paddingLeft2, view2.getMeasuredHeight());
        View view3 = this.f68622g;
        if (view3 == null) {
            C52711k.m112234a();
        }
        int paddingLeft3 = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingLeft4 = getPaddingLeft();
        View view4 = this.f68622g;
        if (view4 == null) {
            C52711k.m112234a();
        }
        int measuredWidth = paddingLeft4 + view4.getMeasuredWidth();
        int paddingTop2 = getPaddingTop();
        View view5 = this.f68622g;
        if (view5 == null) {
            C52711k.m112234a();
        }
        view3.layout(paddingLeft3, paddingTop, measuredWidth, paddingTop2 + view5.getMeasuredHeight());
        View view6 = this.f68623h;
        if (view6 == null) {
            C52711k.m112234a();
        }
        int paddingLeft5 = getPaddingLeft();
        int paddingTop3 = getPaddingTop();
        View view7 = this.f68622g;
        if (view7 == null) {
            C52711k.m112234a();
        }
        int measuredHeight2 = paddingTop3 + view7.getMeasuredHeight();
        int paddingLeft6 = getPaddingLeft();
        View view8 = this.f68623h;
        if (view8 == null) {
            C52711k.m112234a();
        }
        int measuredWidth2 = paddingLeft6 + view8.getMeasuredWidth();
        int paddingTop4 = getPaddingTop();
        View view9 = this.f68622g;
        if (view9 == null) {
            C52711k.m112234a();
        }
        int measuredHeight3 = paddingTop4 + view9.getMeasuredHeight();
        View view10 = this.f68623h;
        if (view10 == null) {
            C52711k.m112234a();
        }
        view6.layout(paddingLeft5, measuredHeight2, measuredWidth2, measuredHeight3 + view10.getMeasuredHeight());
    }
}
