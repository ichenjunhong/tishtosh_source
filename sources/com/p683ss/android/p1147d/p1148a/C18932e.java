package com.p683ss.android.p1147d.p1148a;

import android.content.Context;
import android.support.p030v4.view.C1044i;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* renamed from: com.ss.android.d.a.e */
public final class C18932e implements OnScaleGestureListener {

    /* renamed from: a */
    public final float f52152a;

    /* renamed from: b */
    public final float f52153b;

    /* renamed from: c */
    public final ScaleGestureDetector f52154c;

    /* renamed from: d */
    public final C18930c f52155d;

    /* renamed from: e */
    public VelocityTracker f52156e;

    /* renamed from: f */
    public boolean f52157f;

    /* renamed from: g */
    public float f52158g;

    /* renamed from: h */
    public float f52159h;

    /* renamed from: i */
    public int f52160i = -1;

    /* renamed from: j */
    public int f52161j;

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    /* renamed from: a */
    public final boolean mo38795a() {
        return this.f52154c.isInProgress();
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.f52155d.mo38790a();
    }

    /* renamed from: a */
    public float mo38794a(MotionEvent motionEvent) {
        try {
            return C1044i.m2985c(motionEvent, this.f52161j);
        } catch (Exception unused) {
            return motionEvent.getX();
        }
    }

    /* renamed from: b */
    public float mo38796b(MotionEvent motionEvent) {
        try {
            return C1044i.m2986d(motionEvent, this.f52161j);
        } catch (Exception unused) {
            return motionEvent.getY();
        }
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
            return false;
        }
        this.f52155d.mo38792a(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        return true;
    }

    public C18932e(Context context, C18930c cVar) {
        this.f52154c = new ScaleGestureDetector(context, this);
        this.f52155d = cVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f52153b = (float) viewConfiguration.getScaledMinimumFlingVelocity();
        this.f52152a = (float) viewConfiguration.getScaledTouchSlop();
    }
}
