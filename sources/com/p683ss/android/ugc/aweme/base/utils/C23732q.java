package com.p683ss.android.ugc.aweme.base.utils;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.ss.android.ugc.aweme.base.utils.q */
final /* synthetic */ class C23732q implements OnTouchListener {

    /* renamed from: a */
    static final OnTouchListener f63264a = new C23732q();

    private C23732q() {
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    view.setScaleX(0.8f);
                    view.setScaleY(0.8f);
                    break;
                case 1:
                    break;
            }
        }
        view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(40).start();
        return false;
    }
}
