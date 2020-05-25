package com.p683ss.android.ugc.aweme.commercialize.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import java.util.Iterator;
import p2628d.C52857u;
import p2628d.p2629a.C52549aa;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2647j.C52753d;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.HeaderFrameLayout */
public class HeaderFrameLayout extends FrameLayout {

    /* renamed from: e */
    public static final C26632a f70143e = new C26632a(null);

    /* renamed from: a */
    public View f70144a;

    /* renamed from: b */
    public int f70145b;

    /* renamed from: c */
    public int f70146c;

    /* renamed from: d */
    public Animator f70147d;

    /* renamed from: f */
    private int f70148f = -1;

    /* renamed from: g */
    private int f70149g;

    /* renamed from: h */
    private int f70150h;

    /* renamed from: i */
    private int f70151i;

    /* renamed from: j */
    private boolean f70152j;

    /* renamed from: k */
    private boolean f70153k;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.HeaderFrameLayout$a */
    public static final class C26632a {
        private C26632a() {
        }

        public /* synthetic */ C26632a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.HeaderFrameLayout$b */
    public static final class C26633b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ HeaderFrameLayout f70154a;

        /* renamed from: b */
        final /* synthetic */ View f70155b;

        /* renamed from: c */
        final /* synthetic */ HeaderFrameLayout f70156c;

        public C26633b(HeaderFrameLayout headerFrameLayout, View view, HeaderFrameLayout headerFrameLayout2) {
            this.f70154a = headerFrameLayout;
            this.f70155b = view;
            this.f70156c = headerFrameLayout2;
        }

        public final void run() {
            if (this.f70155b.getMeasuredHeight() <= 0) {
                this.f70154a.measureChild(this.f70155b, this.f70154a.f70145b, this.f70154a.f70146c);
            }
            final ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f70154a, "scrollOffset", new int[]{this.f70156c.getScrollOffset(), this.f70155b.getMeasuredHeight()});
            C52711k.m112236a((Object) ofInt, "anim");
            ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
            ofInt.setDuration(250);
            ofInt.addUpdateListener(new AnimatorUpdateListener(this) {

                /* renamed from: a */
                final /* synthetic */ C26633b f70157a;

                {
                    this.f70157a = r1;
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    HeaderFrameLayout headerFrameLayout = this.f70157a.f70154a;
                    C52711k.m112236a((Object) valueAnimator, "it");
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    if (animatedValue != null) {
                        headerFrameLayout.setScrollOffset(((Integer) animatedValue).intValue());
                        return;
                    }
                    throw new C52857u("null cannot be cast to non-null type kotlin.Int");
                }
            });
            ofInt.addListener(new AnimatorListenerAdapter(this) {

                /* renamed from: a */
                final /* synthetic */ C26633b f70158a;

                public final void onAnimationCancel(Animator animator) {
                    this.f70158a.f70154a.f70147d = null;
                }

                public final void onAnimationEnd(Animator animator) {
                    this.f70158a.f70154a.f70147d = null;
                }

                {
                    this.f70158a = r1;
                }

                public final void onAnimationStart(Animator animator, boolean z) {
                    Animator animator2 = this.f70158a.f70154a.f70147d;
                    if (animator2 != null) {
                        animator2.cancel();
                    }
                    this.f70158a.f70154a.f70147d = ofInt;
                }
            });
            ofInt.start();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.HeaderFrameLayout$c */
    public static final class C26636c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ HeaderFrameLayout f70160a;

        /* renamed from: b */
        final /* synthetic */ View f70161b;

        /* renamed from: c */
        final /* synthetic */ HeaderFrameLayout f70162c;

        public C26636c(HeaderFrameLayout headerFrameLayout, View view, HeaderFrameLayout headerFrameLayout2) {
            this.f70160a = headerFrameLayout;
            this.f70161b = view;
            this.f70162c = headerFrameLayout2;
        }

        public final void run() {
            if (this.f70161b.getMeasuredHeight() <= 0) {
                this.f70160a.measureChild(this.f70161b, this.f70160a.f70145b, this.f70160a.f70146c);
            }
            final ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f70160a, "scrollOffset", new int[]{this.f70162c.getScrollOffset(), 0});
            C52711k.m112236a((Object) ofInt, "anim");
            ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
            ofInt.setDuration(250);
            ofInt.addUpdateListener(new AnimatorUpdateListener(this) {

                /* renamed from: a */
                final /* synthetic */ C26636c f70163a;

                {
                    this.f70163a = r1;
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    HeaderFrameLayout headerFrameLayout = this.f70163a.f70160a;
                    C52711k.m112236a((Object) valueAnimator, "it");
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    if (animatedValue != null) {
                        headerFrameLayout.setScrollOffset(((Integer) animatedValue).intValue());
                        return;
                    }
                    throw new C52857u("null cannot be cast to non-null type kotlin.Int");
                }
            });
            ofInt.addListener(new AnimatorListenerAdapter(this) {

                /* renamed from: a */
                final /* synthetic */ C26636c f70164a;

                public final void onAnimationCancel(Animator animator) {
                    this.f70164a.f70160a.f70147d = null;
                }

                public final void onAnimationEnd(Animator animator) {
                    this.f70164a.f70160a.f70147d = null;
                }

                {
                    this.f70164a = r1;
                }

                public final void onAnimationStart(Animator animator, boolean z) {
                    Animator animator2 = this.f70164a.f70160a.f70147d;
                    if (animator2 != null) {
                        animator2.cancel();
                    }
                    this.f70164a.f70160a.f70147d = ofInt;
                }
            });
            ofInt.start();
        }
    }

    /* access modifiers changed from: protected */
    public boolean getCanScaleContent() {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean getCanScroll() {
        return false;
    }

    public final View getHeader() {
        return this.f70144a;
    }

    public final int getHeaderId() {
        return this.f70148f;
    }

    public final int getScrollOffset() {
        return this.f70149g;
    }

    public HeaderFrameLayout(Context context) {
        super(context);
    }

    public final void setScrollOffset(int i) {
        if (this.f70149g != i) {
            this.f70149g = i;
            requestLayout();
        }
    }

    public void onViewRemoved(View view) {
        C52711k.m112240b(view, "child");
        super.onViewRemoved(view);
        if (C52711k.m112239a((Object) this.f70144a, (Object) view)) {
            this.f70144a = null;
        }
    }

    public final void setHeaderId(int i) {
        if (this.f70148f != i) {
            View findViewById = findViewById(i);
            if (!C52711k.m112239a((Object) this.f70144a, (Object) findViewById)) {
                this.f70144a = findViewById;
                requestLayout();
            }
            this.f70148f = i;
        }
    }

    public void onViewAdded(View view) {
        C52711k.m112240b(view, "child");
        super.onViewAdded(view);
        if (this.f70148f != -1 && view.getId() == this.f70148f) {
            if (this.f70144a == null) {
                this.f70144a = view;
                return;
            }
            throw new RuntimeException("dup header");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            java.lang.String r0 = "event"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
            android.view.View r0 = r6.f70144a
            int r1 = r7.getActionMasked()
            r2 = 2
            r3 = 0
            if (r1 == 0) goto L_0x001e
            if (r1 == r2) goto L_0x0012
            goto L_0x0033
        L_0x0012:
            float r1 = r7.getY()
            int r1 = (int) r1
            int r4 = r6.f70150h
            int r4 = r1 - r4
            r6.f70150h = r1
            goto L_0x0034
        L_0x001e:
            float r1 = r7.getY()
            int r1 = (int) r1
            r6.f70151i = r1
            float r1 = r7.getY()
            int r1 = (int) r1
            r6.f70150h = r1
            android.animation.Animator r1 = r6.f70147d
            if (r1 == 0) goto L_0x0033
            r1.cancel()
        L_0x0033:
            r4 = 0
        L_0x0034:
            if (r0 == 0) goto L_0x00d6
            int r1 = r7.getActionMasked()
            if (r1 != r2) goto L_0x00d6
            boolean r1 = r6.getCanScroll()
            if (r1 == 0) goto L_0x00d6
            boolean r1 = r6.f70153k
            r2 = 1
            if (r1 != 0) goto L_0x005b
            float r1 = r7.getY()
            int r5 = r6.f70151i
            float r5 = (float) r5
            float r1 = r1 - r5
            float r1 = java.lang.Math.abs(r1)
            r5 = 1101004800(0x41a00000, float:20.0)
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x005b
            r6.f70153k = r2
        L_0x005b:
            int r1 = r6.f70149g
            int r1 = r1 + r4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            java.lang.Comparable r4 = (java.lang.Comparable) r4
            int r0 = r0.getMeasuredHeight()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Comparable r0 = (java.lang.Comparable) r0
            int r5 = r1.compareTo(r4)
            if (r5 >= 0) goto L_0x007c
            r0 = r4
            goto L_0x0084
        L_0x007c:
            int r4 = r1.compareTo(r0)
            if (r4 <= 0) goto L_0x0083
            goto L_0x0084
        L_0x0083:
            r0 = r1
        L_0x0084:
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            boolean r1 = r6.f70153k
            if (r1 == 0) goto L_0x00d6
            boolean r1 = r6.f70152j
            if (r1 == 0) goto L_0x00b9
            int r1 = r6.f70149g
            if (r0 != r1) goto L_0x00b5
            r6.f70152j = r3
            android.view.MotionEvent r0 = android.view.MotionEvent.obtainNoHistory(r7)
            java.lang.String r1 = "downEvent"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            r0.setAction(r3)
            super.dispatchTouchEvent(r0)
            r0.recycle()
            android.view.MotionEvent r7 = android.view.MotionEvent.obtainNoHistory(r7)
            super.dispatchTouchEvent(r7)
            r7.recycle()
            goto L_0x00b8
        L_0x00b5:
            r6.setScrollOffset(r0)
        L_0x00b8:
            return r2
        L_0x00b9:
            int r1 = r6.f70149g
            if (r0 == r1) goto L_0x00d6
            r6.f70152j = r2
            r6.setScrollOffset(r0)
            android.view.MotionEvent r7 = android.view.MotionEvent.obtainNoHistory(r7)
            java.lang.String r0 = "cancelEvent"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r0)
            r0 = 3
            r7.setAction(r0)
            super.dispatchTouchEvent(r7)
            r7.recycle()
            return r2
        L_0x00d6:
            android.view.MotionEvent r7 = android.view.MotionEvent.obtainNoHistory(r7)
            boolean r0 = super.dispatchTouchEvent(r7)
            r7.recycle()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.views.HeaderFrameLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        this.f70145b = i;
        this.f70146c = i2;
        super.onMeasure(i, i2);
    }

    public HeaderFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HeaderFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int paddingLeft = i + getPaddingLeft();
        int paddingTop = i2 + getPaddingTop();
        int paddingRight = i3 - getPaddingRight();
        int paddingBottom = i4 - getPaddingBottom();
        Iterator it = C52753d.m112320b(0, getChildCount()).iterator();
        while (it.hasNext()) {
            View childAt = getChildAt(((C52549aa) it).mo110114a());
            C52711k.m112236a((Object) childAt, "child");
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (layoutParams2.gravity == -1) {
                        i5 = 8388659;
                    } else {
                        i5 = layoutParams2.gravity;
                    }
                    if (VERSION.SDK_INT >= 17) {
                        i5 = Gravity.getAbsoluteGravity(i5, getLayoutDirection());
                    }
                    int i8 = i5 & 7;
                    int i9 = i5 & 112;
                    if (i8 == 1) {
                        i6 = (((((paddingRight - paddingLeft) - measuredWidth) / 2) + paddingLeft) + layoutParams2.leftMargin) - layoutParams2.rightMargin;
                    } else if (i8 != 5) {
                        i6 = paddingLeft;
                    } else {
                        i6 = (paddingRight - measuredWidth) - layoutParams2.rightMargin;
                    }
                    if (i9 == 16) {
                        i7 = (((((paddingBottom - paddingTop) - measuredHeight) / 2) + paddingTop) + layoutParams2.topMargin) - layoutParams2.bottomMargin;
                    } else if (i9 != 80) {
                        i7 = layoutParams2.topMargin + paddingTop;
                    } else {
                        i7 = (paddingBottom - measuredHeight) - layoutParams2.bottomMargin;
                    }
                    int i10 = measuredWidth + i6;
                    int i11 = measuredHeight + i7;
                    C52711k.m112240b(childAt, "child");
                    if (C52711k.m112239a((Object) childAt, (Object) this.f70144a)) {
                        int measuredHeight2 = this.f70149g - childAt.getMeasuredHeight();
                        i7 += measuredHeight2;
                        i11 += measuredHeight2;
                    } else if (this.f70144a != null) {
                        i7 += this.f70149g;
                        if (!getCanScaleContent()) {
                            i11 += this.f70149g;
                        }
                    }
                    childAt.layout(i6, i7, i10, i11);
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
            }
        }
    }
}
