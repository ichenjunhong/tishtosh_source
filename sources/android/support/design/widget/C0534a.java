package android.support.design.widget;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;

/* renamed from: android.support.design.widget.a */
final class C0534a {
    /* renamed from: a */
    static boolean m1449a(BottomSheetBehavior bottomSheetBehavior, CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        try {
            if (!view.isShown()) {
                return false;
            }
            int actionMasked = motionEvent.getActionMasked();
            if (bottomSheetBehavior.f1640k == 1 && actionMasked == 0) {
                return true;
            }
            if (bottomSheetBehavior.f1641l != null) {
                bottomSheetBehavior.f1641l.mo3580b(motionEvent);
            }
            if (actionMasked == 0) {
                bottomSheetBehavior.mo1295a();
            }
            if (bottomSheetBehavior.f1647r == null) {
                bottomSheetBehavior.f1647r = VelocityTracker.obtain();
            }
            bottomSheetBehavior.f1647r.addMovement(motionEvent);
            if (actionMasked == 2 && !bottomSheetBehavior.f1642m && Math.abs(((float) bottomSheetBehavior.f1649t) - motionEvent.getY()) > ((float) bottomSheetBehavior.f1641l.f3563b)) {
                bottomSheetBehavior.f1641l.mo3571a(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
            if (!bottomSheetBehavior.f1642m) {
                return true;
            }
            return false;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    static float m1448a(BottomSheetBehavior bottomSheetBehavior) {
        try {
            if (bottomSheetBehavior.f1647r == null) {
                return 0.0f;
            }
            bottomSheetBehavior.f1647r.computeCurrentVelocity(1000, bottomSheetBehavior.f1631b);
            return bottomSheetBehavior.f1647r.getYVelocity(bottomSheetBehavior.f1648s);
        } catch (Exception unused) {
            return 0.0f;
        }
    }
}
