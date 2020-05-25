package com.p683ss.android.ugc.aweme.feed.widget;

import android.content.Context;
import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget.SwipeRefreshLayout;
import com.p683ss.android.ugc.aweme.common.widget.BaseCustomViewPager;

/* renamed from: com.ss.android.ugc.aweme.feed.widget.FeedSwipeRefreshLayout */
public class FeedSwipeRefreshLayout extends SwipeRefreshLayout {

    /* renamed from: n */
    private BaseCustomViewPager f81692n;

    /* renamed from: o */
    private boolean f81693o;

    /* renamed from: p */
    private RecyclerView f81694p;

    public void setCanTouch(boolean z) {
        this.f81693o = z;
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        this.f81694p = recyclerView;
    }

    public void setViewPager(BaseCustomViewPager baseCustomViewPager) {
        this.f81692n = baseCustomViewPager;
    }

    public FeedSwipeRefreshLayout(Context context) {
        this(context, null);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f81693o || !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f81693o || ((this.f81692n != null && this.f81692n.getAdapter() != null && this.f81692n.getAdapter().getCount() != 0 && this.f81692n.getCurrentItem() != 0) || ((this.f81694p != null && ((GridLayoutManager) this.f81694p.getLayoutManager()).mo4750k() != 0) || !super.onInterceptTouchEvent(motionEvent)))) {
            return false;
        }
        return true;
    }

    public FeedSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f81693o = true;
    }
}
