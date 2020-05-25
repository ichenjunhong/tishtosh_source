package com.p683ss.android.ugc.aweme.discover.p1659ui;

import android.content.Context;
import android.support.p030v4.view.PagerAdapter;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.discover.adapter.C27781a;
import com.p683ss.android.ugc.aweme.search.C41428h;
import com.p683ss.android.ugc.aweme.views.RtlViewPager;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.LazyRtlViewPager */
public class LazyRtlViewPager extends RtlViewPager {

    /* renamed from: a */
    private C27781a f74786a;

    public LazyRtlViewPager(Context context) {
        super(context);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        if (pagerAdapter instanceof C27781a) {
            this.f74786a = (C27781a) pagerAdapter;
            super.setAdapter(pagerAdapter);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 2 && C41428h.f105000a.getDisableIntercept()) {
            return false;
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    public LazyRtlViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onPageScrolled(int i, float f, int i2) {
        if (getCurrentItem() == i) {
            int i3 = i + 1;
            if (f >= 0.1f && this.f74786a.mo56226a(i3)) {
                this.f74786a.startUpdate(this);
                this.f74786a.mo56227b((ViewGroup) this, i3);
                this.f74786a.finishUpdate(this);
            }
        } else if (getCurrentItem() > i && 1.0f - f >= 0.1f && this.f74786a.mo56226a(i)) {
            this.f74786a.startUpdate(this);
            this.f74786a.mo56227b((ViewGroup) this, i);
            this.f74786a.finishUpdate(this);
        }
        super.onPageScrolled(i, f, i2);
    }
}
