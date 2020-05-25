package com.p683ss.android.ugc.aweme.poi.search;

import android.content.Context;
import android.support.p030v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* renamed from: com.ss.android.ugc.aweme.poi.search.PoiSearchViewPager */
public class PoiSearchViewPager extends ViewPager {
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public PoiSearchViewPager(Context context) {
        super(context);
    }

    public void setCurrentItem(int i) {
        super.setCurrentItem(i, false);
    }

    public PoiSearchViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
