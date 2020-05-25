package com.bytedance.polaris.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.common.utility.C9432q;

public class SwipeOverlayFrameLayout extends FrameLayout {

    /* renamed from: a */
    C12654a f33230a;

    /* renamed from: b */
    float f33231b;

    /* renamed from: c */
    float f33232c;

    /* renamed from: d */
    private GestureDetector f33233d;

    /* renamed from: e */
    private boolean f33234e = true;

    /* renamed from: f */
    private boolean f33235f;

    /* renamed from: g */
    private boolean f33236g;

    /* renamed from: com.bytedance.polaris.widget.SwipeOverlayFrameLayout$a */
    public interface C12654a {
        /* renamed from: a */
        boolean mo23651a();

        /* renamed from: b */
        boolean mo23652b();
    }

    public void setDisllowInterceptEnabled(boolean z) {
        this.f33235f = z;
    }

    public void setOnSwipeListener(C12654a aVar) {
        this.f33230a = aVar;
    }

    public void setSwipeEnabled(boolean z) {
        this.f33234e = z;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.f33236g = z;
    }

    public SwipeOverlayFrameLayout(Context context) {
        super(context);
        m25433a(context);
    }

    /* renamed from: a */
    private void m25433a(Context context) {
        C126531 r0 = new SimpleOnGestureListener() {
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                SwipeOverlayFrameLayout swipeOverlayFrameLayout = SwipeOverlayFrameLayout.this;
                boolean z = false;
                if (swipeOverlayFrameLayout.f33230a == null || Math.abs(motionEvent2.getY() - motionEvent.getY()) > swipeOverlayFrameLayout.f33231b) {
                    return false;
                }
                float abs = Math.abs(f);
                float abs2 = Math.abs(f2);
                float abs3 = Math.abs(motionEvent2.getX() - motionEvent.getX());
                float abs4 = Math.abs(motionEvent2.getY() - motionEvent.getY());
                if (abs2 >= abs || abs4 >= abs3) {
                    return false;
                }
                if (abs3 > swipeOverlayFrameLayout.f33232c) {
                    if (f > 0.0f) {
                        z = swipeOverlayFrameLayout.f33230a.mo23651a();
                    } else if (f < 0.0f) {
                        z = swipeOverlayFrameLayout.f33230a.mo23652b();
                    }
                }
                return z;
            }
        };
        this.f33231b = C9432q.m18687b(context, 45.0f);
        this.f33232c = C9432q.m18687b(context, 65.0f);
        this.f33233d = new GestureDetector(context.getApplicationContext(), r0);
        this.f33233d.setOnDoubleTapListener(null);
        this.f33233d.setIsLongpressEnabled(false);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            boolean z = false;
            if (motionEvent.getAction() == 0) {
                this.f33236g = false;
            }
            if (this.f33236g && this.f33235f) {
                z = true;
            }
            if (!this.f33234e || this.f33233d == null || z || !this.f33233d.onTouchEvent(motionEvent)) {
                return super.dispatchTouchEvent(motionEvent);
            }
            motionEvent.setAction(3);
            super.dispatchTouchEvent(motionEvent);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    public SwipeOverlayFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m25433a(context);
    }

    public SwipeOverlayFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m25433a(context);
    }
}
