package com.p683ss.android.ugc.aweme.effect;

import android.content.Context;
import android.support.p030v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.p683ss.android.ugc.tools.utils.C50203g;

/* renamed from: com.ss.android.ugc.aweme.effect.NoScrollViewPager */
public class NoScrollViewPager extends ViewPager {

    /* renamed from: a */
    private boolean f76223a = true;

    public void setNoScroll(boolean z) {
        this.f76223a = z;
    }

    public NoScrollViewPager(Context context) {
        super(context);
    }

    public void setCurrentItem(int i) {
        super.setCurrentItem(i, false);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f76223a || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            if (this.f76223a || !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("cur_item:");
            sb.append(getCurrentItem());
            if (getAdapter() != null) {
                sb.append(", count:");
                sb.append(getAdapter().getCount());
            }
            C50203g.m108361b(sb.toString());
            return false;
        }
    }

    public void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
    }

    public void setCurrentItem(int i, boolean z) {
        super.setCurrentItem(i, z);
    }

    public NoScrollViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
