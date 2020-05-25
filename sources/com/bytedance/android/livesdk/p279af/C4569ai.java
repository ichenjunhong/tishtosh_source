package com.bytedance.android.livesdk.p279af;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.bytedance.android.livesdk.af.ai */
public final class C4569ai implements OnTouchListener {
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            view.setScaleX(0.96f);
            view.setScaleY(0.96f);
            view.setAlpha(0.64f);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setAlpha(1.0f);
        }
        return false;
    }
}
