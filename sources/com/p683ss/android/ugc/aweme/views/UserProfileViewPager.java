package com.p683ss.android.ugc.aweme.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* renamed from: com.ss.android.ugc.aweme.views.UserProfileViewPager */
public class UserProfileViewPager extends RtlViewPager {

    /* renamed from: c */
    boolean f121187c = true;

    public void setScrollable(boolean z) {
        this.f121187c = z;
    }

    public UserProfileViewPager(Context context) {
        super(context);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f121187c) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    public UserProfileViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
