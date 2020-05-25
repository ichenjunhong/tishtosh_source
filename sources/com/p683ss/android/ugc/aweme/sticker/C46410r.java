package com.p683ss.android.ugc.aweme.sticker;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.r */
public final class C46410r implements OnTouchListener {

    /* renamed from: a */
    public final long f117088a;

    /* renamed from: b */
    private final float f117089b;

    /* renamed from: c */
    private final View f117090c;

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C52711k.m112240b(view, "v");
        C52711k.m112240b(motionEvent, "event");
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    this.f117090c.animate().scaleX(this.f117089b).scaleY(this.f117089b).setDuration(this.f117088a).start();
                    break;
                case 1:
                    break;
            }
        }
        this.f117090c.animate().scaleX(1.0f).scaleY(1.0f).setDuration(this.f117088a).start();
        return false;
    }

    public C46410r(float f, long j, View view) {
        C52711k.m112240b(view, "animateView");
        this.f117089b = f;
        this.f117088a = j;
        this.f117090c = view;
    }
}
