package com.p683ss.android.ugc.aweme.discover.alading;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.Resources;
import android.support.p030v4.view.C1046k;
import android.support.p030v4.view.C1049n;
import android.support.p030v4.view.C1050o;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.OverScroller;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.alading.ScrollToOpenLayout */
public final class ScrollToOpenLayout extends LinearLayout implements C1049n {

    /* renamed from: a */
    public static final C28022a f73622a = new C28022a(null);

    /* renamed from: b */
    private boolean f73623b;

    /* renamed from: c */
    private final C1050o f73624c;

    /* renamed from: d */
    private int f73625d;

    /* renamed from: e */
    private int f73626e;

    /* renamed from: f */
    private int f73627f;

    /* renamed from: g */
    private C28023b f73628g;

    /* renamed from: com.ss.android.ugc.aweme.discover.alading.ScrollToOpenLayout$a */
    public static final class C28022a {
        private C28022a() {
        }

        public /* synthetic */ C28022a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.alading.ScrollToOpenLayout$b */
    public interface C28023b {
        void bH_();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.alading.ScrollToOpenLayout$c */
    static final class C28024c implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ ScrollToOpenLayout f73629a;

        C28024c(ScrollToOpenLayout scrollToOpenLayout) {
            this.f73629a = scrollToOpenLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ScrollToOpenLayout scrollToOpenLayout = this.f73629a;
            C52711k.m112236a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                scrollToOpenLayout.scrollTo(((Integer) animatedValue).intValue(), 0);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.alading.ScrollToOpenLayout$d */
    static final class C28025d implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ ScrollToOpenLayout f73630a;

        /* renamed from: b */
        final /* synthetic */ float f73631b;

        C28025d(ScrollToOpenLayout scrollToOpenLayout, float f) {
            this.f73630a = scrollToOpenLayout;
            this.f73631b = f;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ScrollToOpenLayout scrollToOpenLayout = this.f73630a;
            C52711k.m112236a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                scrollToOpenLayout.scrollTo(((Integer) animatedValue).intValue(), 0);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* renamed from: a */
    public final boolean mo1330a(View view, View view2, int i, int i2) {
        C52711k.m112240b(view, "child");
        C52711k.m112240b(view2, "target");
        return i == 1;
    }

    public final boolean getEnable() {
        return this.f73623b;
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        C52711k.m112240b(view, "target");
        return false;
    }

    public final int getNestedScrollAxes() {
        return this.f73624c.f3334a;
    }

    /* renamed from: a */
    private final double m66773a() {
        double scrollX = (double) getScrollX();
        double d = (double) this.f73625d;
        Double.isNaN(scrollX);
        Double.isNaN(d);
        return Math.max(0.05d, 1.0d - Math.pow(scrollX / d, 0.9d));
    }

    /* access modifiers changed from: protected */
    public final int computeHorizontalScrollRange() {
        if (!this.f73623b) {
            return super.computeHorizontalScrollRange();
        }
        int childCount = getChildCount();
        int i = 0;
        if (childCount >= 0) {
            int i2 = 0;
            while (true) {
                View childAt = getChildAt(i2);
                C52711k.m112236a((Object) childAt, "getChildAt(i)");
                i += childAt.getWidth();
                if (i2 == childCount) {
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() != 2) {
            throw new IllegalArgumentException("ScrollToOpenLayout must have two child");
        } else if (getChildAt(0) instanceof C1046k) {
            View childAt = getChildAt(0);
            C52711k.m112236a((Object) childAt, "child");
            LayoutParams layoutParams = childAt.getLayoutParams();
            layoutParams.width = -1;
            childAt.setLayoutParams(layoutParams);
        } else {
            throw new IllegalArgumentException("first child must be an instance of NestedScrollingChild2");
        }
    }

    public final void setEnable(boolean z) {
        this.f73623b = z;
    }

    public final void setOnScrollToEndListener(C28023b bVar) {
        this.f73628g = bVar;
    }

    public ScrollToOpenLayout(Context context) {
        C52711k.m112240b(context, "context");
        this(context, null);
    }

    public ScrollToOpenLayout(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "context");
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        View childAt = getChildAt(1);
        C52711k.m112236a((Object) childAt, "secondChild");
        this.f73625d = childAt.getMeasuredWidth();
    }

    /* renamed from: b */
    public final void mo1332b(View view, int i) {
        C52711k.m112240b(view, "target");
        this.f73624c.mo3235a(view, i);
        if (i == 0 && getScrollX() > 0) {
            double scrollX = (double) getScrollX();
            double d = (double) this.f73625d;
            Double.isNaN(d);
            if (scrollX > d * 0.88d) {
                C28023b bVar = this.f73628g;
                if (bVar != null) {
                    bVar.bH_();
                }
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{getScrollX(), 0});
            double scrollX2 = (double) getScrollX();
            double d2 = (double) this.f73625d;
            Double.isNaN(scrollX2);
            Double.isNaN(d2);
            ofInt.setDuration((long) ((scrollX2 / d2) * 200.0d));
            ofInt.addUpdateListener(new C28024c(this));
            ofInt.start();
        }
    }

    public ScrollToOpenLayout(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f73623b = true;
        this.f73624c = new C1050o(this);
        setOrientation(0);
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        C52711k.m112240b(view, "target");
        if (!this.f73623b) {
            return false;
        }
        OverScroller overScroller = new OverScroller(view.getContext());
        overScroller.fling(0, 0, (int) f, (int) f2, DynamicTabYellowPointVersion.DEFAULT, Integer.MAX_VALUE, DynamicTabYellowPointVersion.DEFAULT, Integer.MAX_VALUE);
        this.f73626e = overScroller.getFinalX();
        this.f73627f = 0;
        return false;
    }

    /* renamed from: b */
    public final void mo1333b(View view, View view2, int i, int i2) {
        C52711k.m112240b(view, "child");
        C52711k.m112240b(view2, "target");
        this.f73624c.mo3237a(view, view2, i, i2);
    }

    /* renamed from: a */
    public final void mo1328a(View view, int i, int i2, int[] iArr, int i3) {
        C52711k.m112240b(view, "target");
        C52711k.m112240b(iArr, "consumed");
        if (this.f73623b && i3 == 0 && i < 0 && getScrollX() > 0) {
            double a = m66773a();
            double d = (double) i;
            Double.isNaN(d);
            scrollBy(Math.max((int) (d * a), -getScrollX()), 0);
            iArr[0] = i;
        }
    }

    /* renamed from: a */
    public final void mo1327a(View view, int i, int i2, int i3, int i4, int i5) {
        C52711k.m112240b(view, "target");
        if (this.f73623b) {
            if (i5 == 0) {
                if (i3 > 0) {
                    requestDisallowInterceptTouchEvent(true);
                    double a = m66773a();
                    double d = (double) i3;
                    Double.isNaN(d);
                    scrollBy(Math.min((int) (d * a), this.f73625d - getScrollX()), 0);
                }
            } else if (i > 0) {
                this.f73627f += i;
                if (i3 > 0) {
                    int i6 = this.f73626e - this.f73627f;
                    Context context = getContext();
                    C52711k.m112236a((Object) context, "context");
                    Resources resources = context.getResources();
                    C52711k.m112236a((Object) resources, "context.resources");
                    float applyDimension = TypedValue.applyDimension(1, 800.0f, resources.getDisplayMetrics());
                    float min = Math.min((float) i6, applyDimension) / applyDimension;
                    double d2 = (double) this.f73625d;
                    Double.isNaN(d2);
                    double d3 = d2 * 0.66d;
                    double d4 = (double) min;
                    Double.isNaN(d4);
                    ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, (int) (d3 * d4), 0});
                    ofInt.setDuration((long) (600.0f * min));
                    ofInt.setInterpolator(new LinearInterpolator());
                    ofInt.addUpdateListener(new C28025d(this, min));
                    ofInt.start();
                }
            }
        }
    }
}
