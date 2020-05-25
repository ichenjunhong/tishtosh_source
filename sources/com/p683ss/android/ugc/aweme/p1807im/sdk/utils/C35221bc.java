package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

import android.animation.ObjectAnimator;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.bc */
public final class C35221bc {

    /* renamed from: a */
    public static Handler f90519a = new Handler(Looper.getMainLooper());

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.bc$a */
    public static class C35225a implements OnTouchListener {

        /* renamed from: k */
        public GestureDetector f90524k;

        /* renamed from: l */
        public static C35225a m79617l() {
            return new C35225a();
        }

        /* renamed from: a */
        public final void mo73331a(View... viewArr) {
            if (viewArr.length > 0) {
                for (View view : viewArr) {
                    if (view != null) {
                        view.setOnTouchListener(this);
                    }
                }
            }
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            boolean z;
            if (this.f90524k != null) {
                z = this.f90524k.onTouchEvent(motionEvent);
            } else {
                z = false;
            }
            int action = motionEvent.getAction();
            if (action != 3) {
                switch (action) {
                    case 0:
                        C35221bc.m79615a(true, view);
                        break;
                    case 1:
                        break;
                }
            }
            C35221bc.m79615a(false, view);
            return z;
        }
    }

    /* renamed from: b */
    public static void m79616b(View view) {
        view.setOnTouchListener(null);
    }

    /* renamed from: a */
    public static void m79614a(View view) {
        view.setOnTouchListener(new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action != 3) {
                    switch (action) {
                        case 0:
                            C35221bc.m79615a(true, view);
                            break;
                        case 1:
                            break;
                    }
                }
                C35221bc.m79615a(false, view);
                return false;
            }
        });
    }

    /* renamed from: a */
    public static void m79615a(boolean z, View view) {
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

    /* renamed from: a */
    public static void m79613a(final int i, final int i2, View... viewArr) {
        for (final View view : viewArr) {
            view.setOnTouchListener(new OnTouchListener() {
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 0) {
                        view.setBackgroundColor(i2);
                        C35221bc.f90519a.postDelayed(new Runnable() {
                            public final void run() {
                                view.setBackgroundColor(i);
                            }
                        }, 150);
                    }
                    return false;
                }
            });
        }
    }
}
