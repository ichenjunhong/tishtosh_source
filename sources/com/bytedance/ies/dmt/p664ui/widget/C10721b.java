package com.bytedance.ies.dmt.p664ui.widget;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.bytedance.ies.dmt.ui.widget.b */
public final class C10721b implements OnTouchListener {

    /* renamed from: a */
    private float f28691a = 0.5f;

    /* renamed from: b */
    private float f28692b = 1.0f;

    public C10721b(float f, float f2) {
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    view.setAlpha(this.f28691a);
                    break;
                case 1:
                    break;
            }
        }
        view.setAlpha(this.f28692b);
        return false;
    }
}
