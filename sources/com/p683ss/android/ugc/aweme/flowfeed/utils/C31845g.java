package com.p683ss.android.ugc.aweme.flowfeed.utils;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.utils.g */
public final class C31845g {
    /* renamed from: a */
    public static boolean m74212a(int i, MotionEvent motionEvent, MotionEvent motionEvent2, Context context) {
        if (motionEvent == null || motionEvent2 == null) {
            return false;
        }
        int x = (int) (motionEvent2.getX() - motionEvent.getX());
        int y = (int) (motionEvent2.getY() - motionEvent.getY());
        int i2 = (x * x) + (y * y);
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop() * 3;
        int scaledTouchSlop2 = ViewConfiguration.get(context).getScaledTouchSlop() * 3;
        if (i2 > scaledTouchSlop2 * scaledTouchSlop2 || Math.abs(x) >= scaledTouchSlop) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m74213a(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3, Context context) {
        int scaledDoubleTapSlop = ViewConfiguration.get(context).getScaledDoubleTapSlop();
        int i = scaledDoubleTapSlop * scaledDoubleTapSlop;
        if (motionEvent == null || motionEvent2 == null || motionEvent3 == null) {
            return false;
        }
        long eventTime = motionEvent3.getEventTime() - motionEvent2.getEventTime();
        if (eventTime > ((long) ViewConfiguration.getDoubleTapTimeout()) || eventTime < 40) {
            return false;
        }
        int x = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
        int y = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
        if ((x * x) + (y * y) < i) {
            return true;
        }
        return false;
    }
}
