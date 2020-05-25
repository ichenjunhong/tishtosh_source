package com.twitter.sdk.android.tweetui.internal;

import android.animation.ObjectAnimator;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;

/* renamed from: com.twitter.sdk.android.tweetui.internal.f */
public final class C52296f implements OnTouchListener {

    /* renamed from: a */
    public C52297a f130237a;

    /* renamed from: b */
    public boolean f130238b;

    /* renamed from: c */
    private int f130239c;

    /* renamed from: d */
    private float f130240d;

    /* renamed from: e */
    private final float f130241e;

    /* renamed from: f */
    private final float f130242f;

    /* renamed from: g */
    private float f130243g;

    /* renamed from: h */
    private float f130244h;

    /* renamed from: i */
    private int f130245i;

    /* renamed from: com.twitter.sdk.android.tweetui.internal.f$a */
    public interface C52297a {
        /* renamed from: a */
        void mo109009a();
    }

    /* renamed from: com.twitter.sdk.android.tweetui.internal.f$b */
    public interface C52298b {
        /* renamed from: b */
        boolean mo109041b();
    }

    /* renamed from: a */
    private boolean m111734a(MotionEvent motionEvent) {
        if (this.f130245i < 0 || motionEvent.getPointerCount() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m111733a(View view) {
        if (view.getTranslationY() != 0.0f) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, new float[]{0.0f}).setDuration(100);
            duration.addUpdateListener(new C52299g(this));
            duration.start();
        }
    }

    /* renamed from: a */
    public static C52296f m111732a(View view, C52297a aVar) {
        return new C52296f(aVar, ViewConfiguration.get(view.getContext()).getScaledTouchSlop(), ((float) view.getContext().getResources().getDisplayMetrics().heightPixels) * 0.5f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0063, code lost:
        if (r0 != false) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.twitter.sdk.android.tweetui.internal.C52296f.C52298b
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0017
            r0 = r12
            com.twitter.sdk.android.tweetui.internal.f$b r0 = (com.twitter.sdk.android.tweetui.internal.C52296f.C52298b) r0
            boolean r0 = r0.mo109041b()
            if (r0 != 0) goto L_0x0017
            boolean r0 = r11.f130238b
            if (r0 == 0) goto L_0x0014
            goto L_0x0017
        L_0x0014:
            r0 = 0
            goto L_0x00fb
        L_0x0017:
            int r0 = r13.getActionMasked()
            r3 = 5
            if (r0 == r3) goto L_0x00f1
            switch(r0) {
                case 0: goto L_0x00d4;
                case 1: goto L_0x00a5;
                case 2: goto L_0x0022;
                case 3: goto L_0x00a5;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x0014
        L_0x0022:
            float r0 = r13.getRawX()
            float r3 = r13.getRawY()
            float r4 = r11.f130240d
            float r4 = r3 - r4
            float r5 = r11.f130243g
            float r5 = r0 - r5
            float r6 = r11.f130244h
            float r6 = r3 - r6
            r11.f130243g = r0
            r11.f130244h = r3
            boolean r0 = r11.m111734a(r13)
            if (r0 == 0) goto L_0x0014
            boolean r0 = r11.f130238b
            if (r0 != 0) goto L_0x0065
            float r0 = java.lang.Math.abs(r4)
            int r3 = r11.f130239c
            float r3 = (float) r3
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0051
            r0 = 1
            goto L_0x0052
        L_0x0051:
            r0 = 0
        L_0x0052:
            if (r0 == 0) goto L_0x0014
            float r0 = java.lang.Math.abs(r6)
            float r3 = java.lang.Math.abs(r5)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0062
            r0 = 1
            goto L_0x0063
        L_0x0062:
            r0 = 0
        L_0x0063:
            if (r0 == 0) goto L_0x0014
        L_0x0065:
            r11.f130238b = r1
            float r0 = r12.getTranslationY()
            double r3 = (double) r6
            float r5 = java.lang.Math.abs(r0)
            float r6 = r11.f130242f
            r7 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 * r7
            double r7 = (double) r5
            r9 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r7 = java.lang.Math.pow(r7, r9)
            double r5 = (double) r6
            double r5 = java.lang.Math.pow(r5, r9)
            r9 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r7 = r7 / r5
            double r9 = r9 - r7
            java.lang.Double.isNaN(r3)
            double r3 = r3 * r9
            float r3 = (float) r3
            float r0 = r0 + r3
            float r3 = r11.f130241e
            float r3 = -r3
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x0098
            float r0 = r11.f130241e
            float r0 = -r0
            goto L_0x00a0
        L_0x0098:
            float r3 = r11.f130241e
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x00a0
            float r0 = r11.f130241e
        L_0x00a0:
            r12.setTranslationY(r0)
            goto L_0x0014
        L_0x00a5:
            boolean r0 = r11.m111734a(r13)
            if (r0 == 0) goto L_0x00d0
            boolean r0 = r11.f130238b
            if (r0 == 0) goto L_0x00d0
            float r0 = r12.getTranslationY()
            float r3 = r11.f130242f
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 > 0) goto L_0x00c5
            float r3 = r11.f130242f
            float r3 = -r3
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c1
            goto L_0x00c5
        L_0x00c1:
            r11.m111733a(r12)
            goto L_0x00d0
        L_0x00c5:
            com.twitter.sdk.android.tweetui.internal.f$a r0 = r11.f130237a
            if (r0 == 0) goto L_0x00ce
            com.twitter.sdk.android.tweetui.internal.f$a r0 = r11.f130237a
            r0.mo109009a()
        L_0x00ce:
            r0 = 1
            goto L_0x00d1
        L_0x00d0:
            r0 = 0
        L_0x00d1:
            r11.f130238b = r2
            goto L_0x00fb
        L_0x00d4:
            float r0 = r13.getRawX()
            r11.f130243g = r0
            float r0 = r13.getRawY()
            r11.f130244h = r0
            r11.f130240d = r0
            r11.f130238b = r2
            int r0 = r13.getPointerCount()
            int r0 = r0 - r1
            int r0 = r13.getPointerId(r0)
            r11.f130245i = r0
            goto L_0x0014
        L_0x00f1:
            r11.m111733a(r12)
            r11.f130238b = r2
            r0 = -1
            r11.f130245i = r0
            goto L_0x0014
        L_0x00fb:
            if (r0 != 0) goto L_0x0105
            boolean r12 = r12.onTouchEvent(r13)
            if (r12 == 0) goto L_0x0104
            goto L_0x0105
        L_0x0104:
            return r2
        L_0x0105:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.twitter.sdk.android.tweetui.internal.C52296f.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    private C52296f(C52297a aVar, int i, float f) {
        this(aVar, i, f, 0.2f * f);
    }

    private C52296f(C52297a aVar, int i, float f, float f2) {
        this.f130237a = aVar;
        this.f130239c = i;
        this.f130241e = f;
        this.f130242f = f2;
    }
}
