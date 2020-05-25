package com.bytedance.ies.dmt.p664ui.sliding;

import android.content.Context;
import android.support.p030v4.view.C1044i;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* renamed from: com.bytedance.ies.dmt.ui.sliding.AmeSlidingPaneLayout */
public class AmeSlidingPaneLayout extends DmtSlidingPaneLayout {

    /* renamed from: l */
    private float f28508l;

    /* renamed from: m */
    private boolean f28509m;

    /* renamed from: a */
    public final void mo19079a() {
        this.f28509m = true;
    }

    /* renamed from: b */
    public final void mo19080b() {
        this.f28509m = false;
    }

    public AmeSlidingPaneLayout(Context context) {
        this(context, null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (C1044i.m2981a(motionEvent) == 2 && !this.f28509m) {
            return false;
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return true;
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int a = C1044i.m2981a(motionEvent);
        if (a == 0) {
            this.f28508l = motionEvent.getX();
        } else if (a == 2) {
            if (!this.f28509m) {
                return false;
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (!mo19092d()) {
                if (mo19086a(this, false, Math.round(x - this.f28508l), Math.round(x), Math.round(y))) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.setAction(3);
                    return super.onInterceptTouchEvent(obtain);
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public AmeSlidingPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AmeSlidingPaneLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28509m = true;
        ViewConfiguration.get(context);
    }
}
