package com.p683ss.android.ugc.aweme.notification.util;

import android.animation.ObjectAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewPropertyAnimator;

/* renamed from: com.ss.android.ugc.aweme.notification.util.k */
public final class C38446k {

    /* renamed from: com.ss.android.ugc.aweme.notification.util.k$a */
    public static class C38451a implements OnTouchListener {

        /* renamed from: a */
        public GestureDetector f97854a;

        /* renamed from: b */
        public OnTouchListener f97855b;

        /* renamed from: a */
        public final void mo78343a(View... viewArr) {
            for (int i = 0; i < 2; i++) {
                View view = viewArr[i];
                if (view != null) {
                    view.setOnTouchListener(this);
                }
            }
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            boolean z;
            if (this.f97854a != null) {
                z = this.f97854a.onTouchEvent(motionEvent);
            } else {
                z = false;
            }
            int action = motionEvent.getAction();
            if (action != 3) {
                switch (action) {
                    case 0:
                        C38446k.m85766a(true, view);
                        break;
                    case 1:
                        break;
                }
            }
            C38446k.m85766a(false, view);
            if (this.f97855b != null) {
                return z | this.f97855b.onTouch(view, motionEvent);
            }
            return z;
        }
    }

    /* renamed from: a */
    public static void m85764a(View view) {
        view.setOnTouchListener(new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action != 3) {
                    switch (action) {
                        case 0:
                            C38446k.m85766a(true, view);
                            break;
                        case 1:
                            break;
                    }
                }
                C38446k.m85766a(false, view);
                return false;
            }
        });
    }

    /* renamed from: b */
    public static void m85767b(View view) {
        view.setOnTouchListener(new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action != 3) {
                    switch (action) {
                        case 0:
                            C38446k.m85765a(view, true);
                            break;
                        case 1:
                            break;
                    }
                }
                C38446k.m85765a(view, false);
                return false;
            }
        });
    }

    /* renamed from: a */
    public static void m85765a(View view, boolean z) {
        float f;
        ViewPropertyAnimator animate = view.animate();
        float f2 = 1.0f;
        if (z) {
            f = 1.2f;
        } else {
            f = 1.0f;
        }
        ViewPropertyAnimator scaleX = animate.scaleX(f);
        if (z) {
            f2 = 1.2f;
        }
        scaleX.scaleY(f2).setDuration(100).start();
    }

    /* renamed from: a */
    public static void m85766a(boolean z, View view) {
        float f;
        String str = "alpha";
        float[] fArr = new float[2];
        float f2 = 0.5f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        fArr[0] = f;
        if (!z) {
            f2 = 1.0f;
        }
        fArr[1] = f2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, str, fArr);
        ofFloat.setDuration(100);
        ofFloat.start();
    }
}
