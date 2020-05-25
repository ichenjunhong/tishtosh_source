package com.p683ss.android.ugc.aweme.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* renamed from: com.ss.android.ugc.aweme.views.ChallengeViewPager */
public class ChallengeViewPager extends RtlViewPager {

    /* renamed from: a */
    private boolean f121022a;

    public ChallengeViewPager(Context context) {
        super(context);
    }

    public void setPagingEnable(boolean z) {
        this.f121022a = z;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f121022a) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f121022a) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public ChallengeViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
