package com.p683ss.android.ugc.aweme.base.p1420ui;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.p683ss.android.ugc.aweme.adaptation.C22453b;

/* renamed from: com.ss.android.ugc.aweme.base.ui.FlippableViewPager */
public class FlippableViewPager extends RtlCompatViewPager {

    /* renamed from: g */
    public boolean f62942g = true;

    public boolean performAccessibilityAction(int i, Bundle bundle) {
        return true;
    }

    public FlippableViewPager(Context context) {
        super(context);
    }

    public void setOffscreenPageLimit(int i) {
        throw new UnsupportedOperationException();
    }

    public boolean canScrollHorizontally(int i) {
        if (!this.f62942g || !super.canScrollHorizontally(i)) {
            return false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f62942g || !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!C22453b.m55507a(motionEvent, getContext()) && this.f62942g && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public FlippableViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
