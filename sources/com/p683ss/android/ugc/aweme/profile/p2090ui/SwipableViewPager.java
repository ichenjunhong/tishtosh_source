package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.p683ss.android.ugc.aweme.views.UserProfileViewPager;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.SwipableViewPager */
public class SwipableViewPager extends UserProfileViewPager {

    /* renamed from: a */
    boolean f102579a = true;

    public SwipableViewPager(Context context) {
        super(context);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f102579a || !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public SwipableViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
