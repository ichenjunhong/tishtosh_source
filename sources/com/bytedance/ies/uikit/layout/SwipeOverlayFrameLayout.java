package com.bytedance.ies.uikit.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.common.utility.C9432q;

public class SwipeOverlayFrameLayout extends FrameLayout {

    /* renamed from: a */
    C11118a f29958a;

    /* renamed from: b */
    float f29959b;

    /* renamed from: c */
    float f29960c;

    /* renamed from: d */
    private GestureDetector f29961d;

    /* renamed from: e */
    private boolean f29962e = true;

    /* renamed from: f */
    private boolean f29963f;

    /* renamed from: g */
    private boolean f29964g;

    /* renamed from: com.bytedance.ies.uikit.layout.SwipeOverlayFrameLayout$a */
    public interface C11118a {
        /* renamed from: a */
        boolean mo20219a();

        /* renamed from: b */
        boolean mo20220b();
    }

    public void setDisllowInterceptEnabled(boolean z) {
        this.f29963f = z;
    }

    public void setOnSwipeListener(C11118a aVar) {
        this.f29958a = aVar;
    }

    public void setSwipeEnabled(boolean z) {
        this.f29962e = z;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.f29964g = z;
    }

    public SwipeOverlayFrameLayout(Context context) {
        super(context);
        m22509a(context);
    }

    /* renamed from: a */
    private void m22509a(Context context) {
        C111171 r0 = new SimpleOnGestureListener() {
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                SwipeOverlayFrameLayout swipeOverlayFrameLayout = SwipeOverlayFrameLayout.this;
                boolean z = false;
                if (swipeOverlayFrameLayout.f29958a == null || Math.abs(motionEvent2.getY() - motionEvent.getY()) > swipeOverlayFrameLayout.f29959b) {
                    return false;
                }
                float abs = Math.abs(f);
                float abs2 = Math.abs(f2);
                float abs3 = Math.abs(motionEvent2.getX() - motionEvent.getX());
                float abs4 = Math.abs(motionEvent2.getY() - motionEvent.getY());
                if (abs2 >= abs || abs4 >= abs3) {
                    return false;
                }
                if (abs3 > swipeOverlayFrameLayout.f29960c) {
                    if (f > 0.0f) {
                        z = swipeOverlayFrameLayout.f29958a.mo20220b();
                    } else if (f < 0.0f) {
                        z = swipeOverlayFrameLayout.f29958a.mo20219a();
                    }
                }
                return z;
            }
        };
        this.f29959b = C9432q.m18687b(context, 45.0f);
        this.f29960c = C9432q.m18687b(context, 65.0f);
        this.f29961d = new GestureDetector(context.getApplicationContext(), r0);
        this.f29961d.setOnDoubleTapListener(null);
        this.f29961d.setIsLongpressEnabled(false);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            boolean z = false;
            if (motionEvent.getAction() == 0) {
                this.f29964g = false;
            }
            if (this.f29964g && this.f29963f) {
                z = true;
            }
            if (!this.f29962e || this.f29961d == null || z || !this.f29961d.onTouchEvent(motionEvent)) {
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
        m22509a(context);
    }

    public SwipeOverlayFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m22509a(context);
    }
}
