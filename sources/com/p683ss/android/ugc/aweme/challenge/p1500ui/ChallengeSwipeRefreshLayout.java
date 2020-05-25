package com.p683ss.android.ugc.aweme.challenge.p1500ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget.SwipeRefreshLayout;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.ChallengeSwipeRefreshLayout */
public class ChallengeSwipeRefreshLayout extends SwipeRefreshLayout {

    /* renamed from: n */
    private int f65109n;

    public ChallengeSwipeRefreshLayout(Context context) {
        super(context);
    }

    public void setChildScrollY(int i) {
        this.f65109n = i;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f65109n > 0) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public ChallengeSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        if (this.f65109n <= 0) {
            super.onNestedScroll(view, i, i2, i3, i4);
        }
    }
}
