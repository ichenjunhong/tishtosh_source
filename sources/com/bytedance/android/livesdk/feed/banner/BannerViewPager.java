package com.bytedance.android.livesdk.feed.banner;

import android.content.Context;
import android.support.p030v4.view.ViewPager.C0997e;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import com.bytedance.android.live.uikit.rtl.RtlViewPager;
import com.bytedance.android.livesdkapi.view.C8867d;

public class BannerViewPager extends RtlViewPager {

    /* renamed from: a */
    MotionEvent f18727a;

    /* renamed from: b */
    private boolean f18728b;

    /* renamed from: c */
    private Boolean f18729c;

    private C8867d getParentViewPager() {
        ViewParent viewParent = this;
        while (viewParent != null && !(viewParent instanceof C8867d)) {
            viewParent = viewParent.getParent();
        }
        return (C8867d) viewParent;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo13017b() {
        if (!this.f18728b) {
            this.f18728b = true;
            if (!(getParentViewPager() == null || this.f18729c == null)) {
                this.f18729c.booleanValue();
                this.f18729c = null;
            }
        }
    }

    /* renamed from: c */
    private void m14351c() {
        if (getChildCount() > 1 && this.f18728b) {
            this.f18728b = false;
            C8867d parentViewPager = getParentViewPager();
            if (parentViewPager != null && this.f18729c == null) {
                this.f18729c = Boolean.valueOf(parentViewPager.mo15865a());
            }
        }
    }

    public BannerViewPager(Context context) {
        super(context);
    }

    public void setOnPageChangeListener(C0997e eVar) {
        super.setOnPageChangeListener(eVar);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (motionEvent.getAction() == 0) {
            m14351c();
        } else if (motionEvent.getAction() != 2) {
            mo13017b();
        } else if (onInterceptTouchEvent) {
            m14351c();
        }
        this.f18727a = motionEvent;
        return onInterceptTouchEvent;
    }

    public BannerViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
