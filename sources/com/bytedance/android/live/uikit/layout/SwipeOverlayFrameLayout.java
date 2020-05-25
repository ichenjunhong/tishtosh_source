package com.bytedance.android.live.uikit.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.common.utility.C9432q;

public class SwipeOverlayFrameLayout extends FrameLayout {

    /* renamed from: a */
    C4225a f11528a;

    /* renamed from: b */
    float f11529b;

    /* renamed from: c */
    float f11530c;

    /* renamed from: d */
    private GestureDetector f11531d;

    /* renamed from: e */
    private boolean f11532e = true;

    /* renamed from: f */
    private boolean f11533f;

    /* renamed from: g */
    private boolean f11534g;

    /* renamed from: com.bytedance.android.live.uikit.layout.SwipeOverlayFrameLayout$a */
    public interface C4225a {
        /* renamed from: a */
        boolean mo9708a();

        /* renamed from: b */
        boolean mo9709b();
    }

    public void setDisllowInterceptEnabled(boolean z) {
        this.f11533f = z;
    }

    public void setOnSwipeListener(C4225a aVar) {
        this.f11528a = aVar;
    }

    public void setSwipeEnabled(boolean z) {
        this.f11532e = z;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.f11534g = z;
    }

    public SwipeOverlayFrameLayout(Context context) {
        super(context);
        m10449a(context);
    }

    /* renamed from: a */
    private void m10449a(Context context) {
        C42241 r0 = new SimpleOnGestureListener() {
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                SwipeOverlayFrameLayout swipeOverlayFrameLayout = SwipeOverlayFrameLayout.this;
                boolean z = false;
                if (swipeOverlayFrameLayout.f11528a == null || Math.abs(motionEvent2.getY() - motionEvent.getY()) > swipeOverlayFrameLayout.f11529b) {
                    return false;
                }
                float abs = Math.abs(f);
                float abs2 = Math.abs(f2);
                float abs3 = Math.abs(motionEvent2.getX() - motionEvent.getX());
                float abs4 = Math.abs(motionEvent2.getY() - motionEvent.getY());
                if (abs2 >= abs || abs4 >= abs3) {
                    return false;
                }
                if (abs3 > swipeOverlayFrameLayout.f11530c) {
                    if (f > 0.0f) {
                        z = swipeOverlayFrameLayout.f11528a.mo9709b();
                    } else if (f < 0.0f) {
                        z = swipeOverlayFrameLayout.f11528a.mo9708a();
                    }
                }
                return z;
            }
        };
        this.f11529b = C9432q.m18687b(context, 45.0f);
        this.f11530c = C9432q.m18687b(context, 65.0f);
        this.f11531d = new GestureDetector(context.getApplicationContext(), r0);
        this.f11531d.setOnDoubleTapListener(null);
        this.f11531d.setIsLongpressEnabled(false);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            boolean z = false;
            if (motionEvent.getAction() == 0) {
                this.f11534g = false;
            }
            if (this.f11534g && this.f11533f) {
                z = true;
            }
            if (!this.f11532e || this.f11531d == null || z || !this.f11531d.onTouchEvent(motionEvent)) {
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
        m10449a(context);
    }

    public SwipeOverlayFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m10449a(context);
    }
}
