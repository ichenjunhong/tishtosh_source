package com.p683ss.android.ugc.aweme.emoji.utils;

import android.animation.ObjectAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.l */
public final class C29484l {

    /* renamed from: com.ss.android.ugc.aweme.emoji.utils.l$a */
    public static class C29486a implements OnTouchListener {

        /* renamed from: g */
        public GestureDetector f77228g;

        /* renamed from: h */
        public OnTouchListener f77229h;

        public boolean onTouch(View view, MotionEvent motionEvent) {
            boolean z;
            if (this.f77228g != null) {
                z = this.f77228g.onTouchEvent(motionEvent);
            } else {
                z = false;
            }
            int action = motionEvent.getAction();
            if (action != 3) {
                switch (action) {
                    case 0:
                        C29484l.m69577a(true, view, 0.5f);
                        break;
                    case 1:
                        break;
                }
            }
            C29484l.m69577a(false, view, 0.5f);
            if (this.f77229h != null) {
                return z | this.f77229h.onTouch(view, motionEvent);
            }
            return z;
        }
    }

    /* renamed from: a */
    public static void m69577a(boolean z, View view, float f) {
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
