package com.p683ss.android.ugc.aweme.emoji.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* renamed from: com.ss.android.ugc.aweme.emoji.views.SwipeControlledViewPager */
public class SwipeControlledViewPager extends SSViewPager {

    /* renamed from: a */
    private boolean f77230a = true;

    public void setSwipeEnabled(boolean z) {
        this.f77230a = z;
    }

    public SwipeControlledViewPager(Context context) {
        super(context);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f77230a) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f77230a) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public SwipeControlledViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
