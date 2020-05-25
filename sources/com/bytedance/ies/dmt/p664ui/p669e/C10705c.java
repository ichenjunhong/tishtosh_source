package com.bytedance.ies.dmt.p664ui.p669e;

import android.animation.ObjectAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.bytedance.ies.dmt.ui.e.c */
public final class C10705c {

    /* renamed from: com.bytedance.ies.dmt.ui.e.c$a */
    public static class C10707a implements OnTouchListener {

        /* renamed from: a */
        public GestureDetector f28506a;

        /* renamed from: b */
        public OnTouchListener f28507b;

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            boolean z;
            if (this.f28506a != null) {
                z = this.f28506a.onTouchEvent(motionEvent);
            } else {
                z = false;
            }
            int action = motionEvent.getAction();
            if (action != 3) {
                switch (action) {
                    case 0:
                        C10705c.m21581a(true, view, 0.5f);
                        break;
                    case 1:
                        break;
                }
            }
            C10705c.m21581a(false, view, 0.5f);
            if (this.f28507b != null) {
                return z | this.f28507b.onTouch(view, motionEvent);
            }
            return z;
        }
    }

    /* renamed from: a */
    public static void m21579a(View view) {
        m21580a(view, 0.5f);
    }

    /* renamed from: a */
    public static void m21580a(View view, final float f) {
        view.setOnTouchListener(new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action != 3) {
                    switch (action) {
                        case 0:
                            C10705c.m21581a(true, view, f);
                            break;
                        case 1:
                            break;
                    }
                }
                C10705c.m21581a(false, view, f);
                return false;
            }
        });
    }

    /* renamed from: a */
    public static void m21581a(boolean z, View view, float f) {
        float f2;
        String str = "alpha";
        float[] fArr = new float[2];
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        fArr[0] = f2;
        if (!z) {
            f = 1.0f;
        }
        fArr[1] = f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, str, fArr);
        ofFloat.setDuration(100);
        ofFloat.start();
    }
}
