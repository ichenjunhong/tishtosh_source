package com.p683ss.android.ugc.aweme.common.p1598j;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.MotionEvent;
import android.view.View;
import p2628d.C52847n;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.common.j.a */
public final class C26899a {

    /* renamed from: a */
    public static final C26900a f70756a = new C26900a(null);

    /* renamed from: com.ss.android.ugc.aweme.common.j.a$a */
    public static final class C26900a {

        /* renamed from: com.ss.android.ugc.aweme.common.j.a$a$a */
        public static final class C26901a implements AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ View f70757a;

            public C26901a(View view) {
                this.f70757a = view;
            }

            /* JADX WARNING: Removed duplicated region for block: B:10:0x0026  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onAnimationUpdate(android.animation.ValueAnimator r5) {
                /*
                    r4 = this;
                    java.lang.String r0 = "it"
                    p2628d.p2639f.p2641b.C52711k.m112236a(r5, r0)
                    java.lang.Object r5 = r5.getAnimatedValue()
                    boolean r0 = r5 instanceof p2628d.C52847n
                    if (r0 != 0) goto L_0x000e
                    r5 = 0
                L_0x000e:
                    d.n r5 = (p2628d.C52847n) r5
                    android.view.View r0 = r4.f70757a
                    r1 = 2
                    r2 = 0
                    if (r5 == 0) goto L_0x0023
                    java.lang.Object r3 = r5.getFirst()
                    java.lang.Float r3 = (java.lang.Float) r3
                    if (r3 == 0) goto L_0x0023
                    float r3 = r3.floatValue()
                    goto L_0x0024
                L_0x0023:
                    r3 = 0
                L_0x0024:
                    if (r5 == 0) goto L_0x0032
                    java.lang.Object r5 = r5.getSecond()
                    java.lang.Float r5 = (java.lang.Float) r5
                    if (r5 == 0) goto L_0x0032
                    float r2 = r5.floatValue()
                L_0x0032:
                    android.view.MotionEvent r5 = com.p683ss.android.ugc.aweme.common.p1598j.C26899a.C26900a.m65027a(r1, r3, r2)
                    r0.dispatchTouchEvent(r5)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.common.p1598j.C26899a.C26900a.C26901a.onAnimationUpdate(android.animation.ValueAnimator):void");
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.common.j.a$a$b */
        public static final class C26902b extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ View f70758a;

            /* renamed from: b */
            final /* synthetic */ C52847n f70759b;

            public final void onAnimationCancel(Animator animator) {
                super.onAnimationCancel(animator);
                this.f70758a.dispatchTouchEvent(C26900a.m65027a(3, ((Number) this.f70759b.getFirst()).floatValue(), ((Number) this.f70759b.getSecond()).floatValue()));
            }

            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                this.f70758a.dispatchTouchEvent(C26900a.m65027a(1, ((Number) this.f70759b.getFirst()).floatValue(), ((Number) this.f70759b.getSecond()).floatValue()));
            }

            public C26902b(View view, C52847n nVar) {
                this.f70758a = view;
                this.f70759b = nVar;
            }
        }

        private C26900a() {
        }

        public /* synthetic */ C26900a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static MotionEvent m65027a(int i, float f, float f2) {
            MotionEvent obtain = MotionEvent.obtain(System.currentTimeMillis(), System.currentTimeMillis(), i, f, f2, 0);
            C52711k.m112236a((Object) obtain, "MotionEvent.obtain(Syste…illis(), action, x, y, 0)");
            return obtain;
        }
    }
}
