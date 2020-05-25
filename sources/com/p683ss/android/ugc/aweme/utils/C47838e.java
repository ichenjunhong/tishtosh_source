package com.p683ss.android.ugc.aweme.utils;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.ss.android.ugc.aweme.utils.e */
final /* synthetic */ class C47838e implements OnTouchListener {

    /* renamed from: a */
    private final View f120399a;

    /* renamed from: b */
    private final float f120400b;

    /* renamed from: c */
    private final float f120401c;

    C47838e(View view, float f, float f2) {
        this.f120399a = view;
        this.f120400b = f;
        this.f120401c = f2;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2 = this.f120399a;
        float f = this.f120400b;
        float f2 = this.f120401c;
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    view2.animate().alpha(f).setDuration(150).start();
                    break;
                case 1:
                    break;
            }
        }
        view2.animate().alpha(f2).setDuration(150).start();
        return false;
    }
}
