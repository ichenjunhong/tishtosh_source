package com.p683ss.android.ugc.aweme.views;

import android.content.Context;
import android.support.p030v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* renamed from: com.ss.android.ugc.aweme.views.FixedViewPager */
public class FixedViewPager extends ViewPager {
    public FixedViewPager(Context context) {
        super(context);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    public FixedViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
