package com.p683ss.android.ugc.aweme.p1308ad.utils;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.ss.android.ugc.aweme.ad.utils.f */
final /* synthetic */ class C22439f implements OnTouchListener {

    /* renamed from: a */
    private final View f60437a;

    /* renamed from: b */
    private final float f60438b;

    C22439f(View view, float f) {
        this.f60437a = view;
        this.f60438b = f;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2 = this.f60437a;
        float f = this.f60438b;
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
        view2.animate().alpha(f).setDuration(150).start();
        return false;
    }
}
