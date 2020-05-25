package android.support.p030v4.view;

import android.view.MotionEvent;

/* renamed from: android.support.v4.view.i */
public final class C1044i {
    /* renamed from: a */
    public static int m2981a(MotionEvent motionEvent) {
        return motionEvent.getActionMasked();
    }

    /* renamed from: b */
    public static int m2983b(MotionEvent motionEvent) {
        return motionEvent.getActionIndex();
    }

    /* renamed from: c */
    public static float m2985c(MotionEvent motionEvent, int i) {
        return motionEvent.getX(i);
    }

    /* renamed from: d */
    public static float m2986d(MotionEvent motionEvent, int i) {
        return motionEvent.getY(i);
    }

    /* renamed from: a */
    public static int m2982a(MotionEvent motionEvent, int i) {
        return motionEvent.findPointerIndex(i);
    }

    /* renamed from: b */
    public static int m2984b(MotionEvent motionEvent, int i) {
        return motionEvent.getPointerId(i);
    }

    /* renamed from: e */
    public static boolean m2987e(MotionEvent motionEvent, int i) {
        if ((motionEvent.getSource() & 8194) == 8194) {
            return true;
        }
        return false;
    }
}
