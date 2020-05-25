package com.p683ss.android.ugc.aweme.views;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.p030v4.widget.C1119r;
import android.support.p030v4.widget.C1119r.C1122a;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.views.DragRelativeLayout */
public final class DragRelativeLayout extends RelativeLayout {

    /* renamed from: g */
    public static final C48153a f121096g = new C48153a(null);

    /* renamed from: a */
    public int f121097a;

    /* renamed from: b */
    public int f121098b;

    /* renamed from: c */
    public int f121099c;

    /* renamed from: d */
    public int f121100d;

    /* renamed from: e */
    public int f121101e;

    /* renamed from: f */
    public View f121102f;

    /* renamed from: h */
    private C1119r f121103h = C1119r.m3271a((ViewGroup) this, 1.0f, (C1122a) new C48154b(this));

    /* renamed from: i */
    private boolean f121104i;

    /* renamed from: com.ss.android.ugc.aweme.views.DragRelativeLayout$a */
    public static final class C48153a {
        private C48153a() {
        }

        public /* synthetic */ C48153a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.DragRelativeLayout$b */
    public static final class C48154b extends C1122a {

        /* renamed from: a */
        final /* synthetic */ DragRelativeLayout f121105a;

        C48154b(DragRelativeLayout dragRelativeLayout) {
            this.f121105a = dragRelativeLayout;
        }

        /* renamed from: a */
        public final int mo1305a(View view) {
            C52711k.m112240b(view, "child");
            return this.f121105a.getMeasuredHeight() - view.getMeasuredHeight();
        }

        /* renamed from: b */
        public final int mo1490b(View view) {
            C52711k.m112240b(view, "child");
            return this.f121105a.getMeasuredWidth() - view.getMeasuredWidth();
        }

        /* renamed from: a */
        public final boolean mo1310a(View view, int i) {
            C52711k.m112240b(view, "view");
            if (view == this.f121105a.f121102f) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final int mo1306a(View view, int i, int i2) {
            C52711k.m112240b(view, "child");
            if (i > this.f121105a.getHeight() - view.getHeight()) {
                return this.f121105a.getHeight() - view.getHeight();
            }
            if (i < 0) {
                return 0;
            }
            return i;
        }

        /* renamed from: b */
        public final int mo1311b(View view, int i, int i2) {
            C52711k.m112240b(view, "child");
            if (i > this.f121105a.getWidth() - view.getWidth()) {
                return this.f121105a.getWidth() - view.getWidth();
            }
            if (i < 0) {
                return 0;
            }
            return i;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00f5, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo1308a(android.view.View r8, float r9, float r10) {
            /*
                r7 = this;
                java.lang.String r0 = "releasedChild"
                p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
                com.ss.android.ugc.aweme.views.DragRelativeLayout r0 = r7.f121105a
                android.view.View r0 = r0.f121102f
                if (r8 == r0) goto L_0x000c
                return
            L_0x000c:
                com.ss.android.ugc.aweme.views.DragRelativeLayout r0 = r7.f121105a
                int r0 = r0.f121097a
                r2 = 3
                if (r0 != r2) goto L_0x0014
                return
            L_0x0014:
                com.ss.android.ugc.aweme.views.DragRelativeLayout r0 = r7.f121105a
                int r0 = r0.getWidth()
                int r2 = r8.getWidth()
                int r0 = r0 - r2
                com.ss.android.ugc.aweme.views.DragRelativeLayout r2 = r7.f121105a
                int r2 = r2.getHeight()
                int r3 = r8.getHeight()
                int r2 = r2 - r3
                int r3 = r8.getLeft()
                int r4 = r8.getTop()
                com.ss.android.ugc.aweme.views.DragRelativeLayout r5 = r7.f121105a
                int r5 = r5.getWidth()
                int r5 = r5 / 2
                int r6 = r8.getWidth()
                int r6 = r6 / 2
                int r5 = r5 - r6
                if (r3 >= r5) goto L_0x00f6
                com.ss.android.ugc.aweme.views.DragRelativeLayout r0 = r7.f121105a
                int r0 = r0.getHeight()
                int r0 = r0 / 2
                int r5 = r8.getWidth()
                int r5 = r5 / 2
                int r0 = r0 - r5
                if (r4 >= r0) goto L_0x00a1
                com.ss.android.ugc.aweme.views.DragRelativeLayout r0 = r7.f121105a
                int r0 = r0.f121100d
                int r0 = r4 - r0
                com.ss.android.ugc.aweme.views.DragRelativeLayout r2 = r7.f121105a
                int r2 = r2.f121098b
                int r2 = r3 - r2
                com.ss.android.ugc.aweme.views.DragRelativeLayout r5 = r7.f121105a
                int r5 = r5.f121097a
                switch(r5) {
                    case 0: goto L_0x0083;
                    case 1: goto L_0x0073;
                    case 2: goto L_0x0068;
                    default: goto L_0x0067;
                }
            L_0x0067:
                goto L_0x00a0
            L_0x0068:
                com.ss.android.ugc.aweme.views.DragRelativeLayout r0 = r7.f121105a
                int r2 = -r2
                r3 = 0
                r4 = 4
                r5 = 0
                r1 = r8
                com.p683ss.android.ugc.aweme.views.DragRelativeLayout.m104370a(r0, r1, r2, r3, r4, r5)
                goto L_0x00a0
            L_0x0073:
                com.ss.android.ugc.aweme.views.DragRelativeLayout r2 = r7.f121105a
                r3 = 0
                int r4 = -r0
                r5 = 2
                r6 = 0
                r0 = r2
                r1 = r8
                r2 = r3
                r3 = r4
                r4 = r5
                r5 = r6
                com.p683ss.android.ugc.aweme.views.DragRelativeLayout.m104370a(r0, r1, r2, r3, r4, r5)
                return
            L_0x0083:
                if (r3 <= r4) goto L_0x0095
                com.ss.android.ugc.aweme.views.DragRelativeLayout r2 = r7.f121105a
                r3 = 0
                int r4 = -r0
                r5 = 2
                r6 = 0
                r0 = r2
                r1 = r8
                r2 = r3
                r3 = r4
                r4 = r5
                r5 = r6
                com.p683ss.android.ugc.aweme.views.DragRelativeLayout.m104370a(r0, r1, r2, r3, r4, r5)
                return
            L_0x0095:
                com.ss.android.ugc.aweme.views.DragRelativeLayout r0 = r7.f121105a
                int r2 = -r2
                r3 = 0
                r4 = 4
                r5 = 0
                r1 = r8
                com.p683ss.android.ugc.aweme.views.DragRelativeLayout.m104370a(r0, r1, r2, r3, r4, r5)
                return
            L_0x00a0:
                return
            L_0x00a1:
                int r2 = r2 - r4
                com.ss.android.ugc.aweme.views.DragRelativeLayout r0 = r7.f121105a
                int r0 = r0.f121101e
                int r4 = r2 - r0
                com.ss.android.ugc.aweme.views.DragRelativeLayout r0 = r7.f121105a
                int r0 = r0.f121098b
                int r0 = r3 - r0
                com.ss.android.ugc.aweme.views.DragRelativeLayout r5 = r7.f121105a
                int r5 = r5.f121097a
                switch(r5) {
                    case 0: goto L_0x00d4;
                    case 1: goto L_0x00c6;
                    case 2: goto L_0x00b6;
                    default: goto L_0x00b5;
                }
            L_0x00b5:
                goto L_0x00f5
            L_0x00b6:
                com.ss.android.ugc.aweme.views.DragRelativeLayout r2 = r7.f121105a
                int r3 = -r0
                r4 = 0
                r5 = 4
                r6 = 0
                r0 = r2
                r1 = r8
                r2 = r3
                r3 = r4
                r4 = r5
                r5 = r6
                com.p683ss.android.ugc.aweme.views.DragRelativeLayout.m104370a(r0, r1, r2, r3, r4, r5)
                goto L_0x00f5
            L_0x00c6:
                com.ss.android.ugc.aweme.views.DragRelativeLayout r0 = r7.f121105a
                r2 = 0
                r5 = 2
                r6 = 0
                r1 = r8
                r3 = r4
                r4 = r5
                r5 = r6
                com.p683ss.android.ugc.aweme.views.DragRelativeLayout.m104370a(r0, r1, r2, r3, r4, r5)
                goto L_0x01a7
            L_0x00d4:
                if (r3 <= r2) goto L_0x00e4
                com.ss.android.ugc.aweme.views.DragRelativeLayout r0 = r7.f121105a
                r2 = 0
                r5 = 2
                r6 = 0
                r1 = r8
                r3 = r4
                r4 = r5
                r5 = r6
                com.p683ss.android.ugc.aweme.views.DragRelativeLayout.m104370a(r0, r1, r2, r3, r4, r5)
                goto L_0x01a7
            L_0x00e4:
                com.ss.android.ugc.aweme.views.DragRelativeLayout r2 = r7.f121105a
                int r3 = -r0
                r4 = 0
                r5 = 4
                r6 = 0
                r0 = r2
                r1 = r8
                r2 = r3
                r3 = r4
                r4 = r5
                r5 = r6
                com.p683ss.android.ugc.aweme.views.DragRelativeLayout.m104370a(r0, r1, r2, r3, r4, r5)
                goto L_0x01a7
            L_0x00f5:
                return
            L_0x00f6:
                com.ss.android.ugc.aweme.views.DragRelativeLayout r5 = r7.f121105a
                int r5 = r5.getHeight()
                int r5 = r5 / 2
                int r6 = r8.getWidth()
                int r6 = r6 / 2
                int r5 = r5 - r6
                if (r4 >= r5) goto L_0x0159
                com.ss.android.ugc.aweme.views.DragRelativeLayout r2 = r7.f121105a
                int r2 = r2.f121100d
                int r2 = r4 - r2
                int r0 = r0 - r3
                com.ss.android.ugc.aweme.views.DragRelativeLayout r3 = r7.f121105a
                int r3 = r3.f121099c
                int r3 = r0 - r3
                com.ss.android.ugc.aweme.views.DragRelativeLayout r5 = r7.f121105a
                int r5 = r5.f121097a
                switch(r5) {
                    case 0: goto L_0x0139;
                    case 1: goto L_0x012a;
                    case 2: goto L_0x011c;
                    default: goto L_0x011b;
                }
            L_0x011b:
                goto L_0x0158
            L_0x011c:
                com.ss.android.ugc.aweme.views.DragRelativeLayout r0 = r7.f121105a
                r4 = 0
                r5 = 4
                r6 = 0
                r1 = r8
                r2 = r3
                r3 = r4
                r4 = r5
                r5 = r6
                com.p683ss.android.ugc.aweme.views.DragRelativeLayout.m104370a(r0, r1, r2, r3, r4, r5)
                goto L_0x0158
            L_0x012a:
                com.ss.android.ugc.aweme.views.DragRelativeLayout r0 = r7.f121105a
                r3 = 0
                int r4 = -r2
                r5 = 2
                r6 = 0
                r1 = r8
                r2 = r3
                r3 = r4
                r4 = r5
                r5 = r6
                com.p683ss.android.ugc.aweme.views.DragRelativeLayout.m104370a(r0, r1, r2, r3, r4, r5)
                return
            L_0x0139:
                if (r0 <= r4) goto L_0x014a
                com.ss.android.ugc.aweme.views.DragRelativeLayout r0 = r7.f121105a
                r3 = 0
                int r4 = -r2
                r5 = 2
                r6 = 0
                r1 = r8
                r2 = r3
                r3 = r4
                r4 = r5
                r5 = r6
                com.p683ss.android.ugc.aweme.views.DragRelativeLayout.m104370a(r0, r1, r2, r3, r4, r5)
                return
            L_0x014a:
                com.ss.android.ugc.aweme.views.DragRelativeLayout r0 = r7.f121105a
                r4 = 0
                r5 = 4
                r6 = 0
                r1 = r8
                r2 = r3
                r3 = r4
                r4 = r5
                r5 = r6
                com.p683ss.android.ugc.aweme.views.DragRelativeLayout.m104370a(r0, r1, r2, r3, r4, r5)
                return
            L_0x0158:
                return
            L_0x0159:
                int r2 = r2 - r4
                com.ss.android.ugc.aweme.views.DragRelativeLayout r4 = r7.f121105a
                int r4 = r4.f121101e
                int r4 = r2 - r4
                int r0 = r0 - r3
                com.ss.android.ugc.aweme.views.DragRelativeLayout r3 = r7.f121105a
                int r3 = r3.f121099c
                int r3 = r0 - r3
                com.ss.android.ugc.aweme.views.DragRelativeLayout r5 = r7.f121105a
                int r5 = r5.f121097a
                switch(r5) {
                    case 0: goto L_0x018a;
                    case 1: goto L_0x017d;
                    case 2: goto L_0x016f;
                    default: goto L_0x016e;
                }
            L_0x016e:
                goto L_0x01a7
            L_0x016f:
                com.ss.android.ugc.aweme.views.DragRelativeLayout r0 = r7.f121105a
                r4 = 0
                r5 = 4
                r6 = 0
                r1 = r8
                r2 = r3
                r3 = r4
                r4 = r5
                r5 = r6
                com.p683ss.android.ugc.aweme.views.DragRelativeLayout.m104370a(r0, r1, r2, r3, r4, r5)
                goto L_0x01a7
            L_0x017d:
                com.ss.android.ugc.aweme.views.DragRelativeLayout r0 = r7.f121105a
                r2 = 0
                r5 = 2
                r6 = 0
                r1 = r8
                r3 = r4
                r4 = r5
                r5 = r6
                com.p683ss.android.ugc.aweme.views.DragRelativeLayout.m104370a(r0, r1, r2, r3, r4, r5)
                return
            L_0x018a:
                if (r0 <= r2) goto L_0x0199
                com.ss.android.ugc.aweme.views.DragRelativeLayout r0 = r7.f121105a
                r2 = 0
                r5 = 2
                r6 = 0
                r1 = r8
                r3 = r4
                r4 = r5
                r5 = r6
                com.p683ss.android.ugc.aweme.views.DragRelativeLayout.m104370a(r0, r1, r2, r3, r4, r5)
                return
            L_0x0199:
                com.ss.android.ugc.aweme.views.DragRelativeLayout r0 = r7.f121105a
                r4 = 0
                r5 = 4
                r6 = 0
                r1 = r8
                r2 = r3
                r3 = r4
                r4 = r5
                r5 = r6
                com.p683ss.android.ugc.aweme.views.DragRelativeLayout.m104370a(r0, r1, r2, r3, r4, r5)
                return
            L_0x01a7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.views.DragRelativeLayout.C48154b.mo1308a(android.view.View, float, float):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.DragRelativeLayout$c */
    static final class C48155c implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f121106a;

        /* renamed from: b */
        final /* synthetic */ int f121107b;

        /* renamed from: c */
        final /* synthetic */ int f121108c;

        C48155c(View view, int i, int i2) {
            this.f121106a = view;
            this.f121107b = i;
            this.f121108c = i2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C52711k.m112236a((Object) valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                int intValue = ((Integer) animatedValue).intValue();
                this.f121106a.layout(this.f121107b + intValue, this.f121108c, this.f121107b + intValue + this.f121106a.getWidth(), this.f121108c + this.f121106a.getHeight());
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.DragRelativeLayout$d */
    static final class C48156d implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f121109a;

        /* renamed from: b */
        final /* synthetic */ int f121110b;

        /* renamed from: c */
        final /* synthetic */ int f121111c;

        C48156d(View view, int i, int i2) {
            this.f121109a = view;
            this.f121110b = i;
            this.f121111c = i2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C52711k.m112236a((Object) valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                int intValue = ((Integer) animatedValue).intValue();
                this.f121109a.layout(this.f121110b, this.f121111c + intValue, this.f121110b + this.f121109a.getWidth(), this.f121111c + intValue + this.f121109a.getHeight());
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f121102f = getChildAt(0);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C52711k.m112240b(motionEvent, "event");
        if (!this.f121104i) {
            return super.onTouchEvent(motionEvent);
        }
        try {
            C1119r rVar = this.f121103h;
            if (rVar != null) {
                rVar.mo3580b(motionEvent);
            }
        } catch (IllegalArgumentException unused) {
        }
        return true;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        C52711k.m112240b(motionEvent, "event");
        View view = this.f121102f;
        if (view != null) {
            i = view.getLeft();
        } else {
            i = 0;
        }
        View view2 = this.f121102f;
        if (view2 != null) {
            i2 = view2.getTop();
        } else {
            i2 = 0;
        }
        View view3 = this.f121102f;
        if (view3 != null) {
            i3 = view3.getRight();
        } else {
            i3 = 0;
        }
        View view4 = this.f121102f;
        if (view4 != null) {
            i4 = view4.getBottom();
        } else {
            i4 = 0;
        }
        if (motionEvent.getX() < ((float) i) || motionEvent.getX() > ((float) i3) || motionEvent.getY() < ((float) i2) || motionEvent.getY() > ((float) i4)) {
            z = false;
        } else {
            z = true;
        }
        this.f121104i = z;
        if (!this.f121104i) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        C1119r rVar = this.f121103h;
        if (rVar != null) {
            return rVar.mo3574a(motionEvent);
        }
        return false;
    }

    public DragRelativeLayout(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(attributeSet, "attrs");
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.ac5, R.attr.ac6, R.attr.ac7, R.attr.ac8, R.attr.ac9});
        this.f121097a = obtainStyledAttributes.getInt(4, R.id.a8q);
        this.f121098b = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f121099c = obtainStyledAttributes.getDimensionPixelOffset(2, 0);
        this.f121100d = obtainStyledAttributes.getDimensionPixelOffset(3, 0);
        this.f121101e = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    static /* synthetic */ void m104370a(DragRelativeLayout dragRelativeLayout, View view, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        int left = view.getLeft();
        int top = view.getTop();
        ValueAnimator valueAnimator = null;
        if (i != 0) {
            valueAnimator = ValueAnimator.ofInt(new int[]{0, i});
            valueAnimator.addUpdateListener(new C48155c(view, left, top));
        } else if (i2 != 0) {
            valueAnimator = ValueAnimator.ofInt(new int[]{0, i2});
            valueAnimator.addUpdateListener(new C48156d(view, left, top));
        }
        if (valueAnimator != null) {
            valueAnimator.setDuration(250);
        }
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }
}
