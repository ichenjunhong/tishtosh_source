package com.p683ss.android.ugc.tools.view.widget;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.ss.android.ugc.tools.view.widget.g */
public final class C50283g implements OnTouchListener {

    /* renamed from: a */
    public OnTouchListener f126162a = null;

    /* renamed from: b */
    private final float f126163b = 0.5f;

    /* renamed from: c */
    private final long f126164c = 200;

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    view.animate().alpha(this.f126163b).setDuration(this.f126164c).start();
                    break;
                case 1:
                    break;
            }
        }
        view.animate().alpha(1.0f).setDuration(this.f126164c).start();
        if (this.f126162a == null || !this.f126162a.onTouch(view, motionEvent)) {
            return false;
        }
        return true;
    }

    public C50283g(float f, long j, OnTouchListener onTouchListener) {
    }
}
