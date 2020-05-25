package com.p683ss.android.ugc.aweme.optimize;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.optimize.c */
public final class C38543c implements OnTouchListener {

    /* renamed from: a */
    private int f98041a;

    /* renamed from: b */
    private int f98042b;

    /* renamed from: c */
    private float f98043c;

    /* renamed from: d */
    private float f98044d;

    /* renamed from: e */
    private LayoutParams f98045e;

    /* renamed from: f */
    private WindowManager f98046f;

    /* renamed from: g */
    private GestureDetector f98047g;

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Integer num;
        GestureDetector gestureDetector = this.f98047g;
        if (gestureDetector != null) {
            gestureDetector.onTouchEvent(motionEvent);
        }
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getAction());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 0) {
            LayoutParams layoutParams = this.f98045e;
            if (layoutParams == null) {
                C52711k.m112234a();
            }
            this.f98041a = layoutParams.x;
            LayoutParams layoutParams2 = this.f98045e;
            if (layoutParams2 == null) {
                C52711k.m112234a();
            }
            this.f98042b = layoutParams2.y;
            this.f98043c = motionEvent.getRawX();
            this.f98044d = motionEvent.getRawY();
        } else if ((num == null || num.intValue() != 1) && num != null && num.intValue() == 2) {
            LayoutParams layoutParams3 = this.f98045e;
            if (layoutParams3 == null) {
                C52711k.m112234a();
            }
            layoutParams3.x = (int) (((float) this.f98041a) + (motionEvent.getRawX() - this.f98043c));
            LayoutParams layoutParams4 = this.f98045e;
            if (layoutParams4 == null) {
                C52711k.m112234a();
            }
            layoutParams4.y = (int) (((float) this.f98042b) + (motionEvent.getRawY() - this.f98044d));
            WindowManager windowManager = this.f98046f;
            if (windowManager != null) {
                windowManager.updateViewLayout(view, this.f98045e);
            }
        }
        return false;
    }

    public C38543c(LayoutParams layoutParams, WindowManager windowManager, GestureDetector gestureDetector) {
        C52711k.m112240b(layoutParams, "paramsF");
        C52711k.m112240b(gestureDetector, "gestureDetector");
        this.f98045e = layoutParams;
        this.f98046f = windowManager;
        this.f98047g = gestureDetector;
    }
}
