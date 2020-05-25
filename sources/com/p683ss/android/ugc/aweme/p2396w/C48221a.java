package com.p683ss.android.ugc.aweme.p2396w;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.ss.android.ugc.aweme.w.a */
public final class C48221a implements OnTouchListener {

    /* renamed from: a */
    public OnTouchListener f121350a;

    /* renamed from: b */
    private final float f121351b;

    /* renamed from: c */
    private final long f121352c;

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    view.animate().alpha(this.f121351b).setDuration(this.f121352c).start();
                    break;
                case 1:
                    break;
            }
        }
        view.animate().alpha(1.0f).setDuration(this.f121352c).start();
        if (this.f121350a == null || !this.f121350a.onTouch(view, motionEvent)) {
            return false;
        }
        return true;
    }

    public C48221a(float f, long j, OnTouchListener onTouchListener) {
        this.f121351b = f;
        this.f121352c = j;
        this.f121350a = onTouchListener;
    }
}
