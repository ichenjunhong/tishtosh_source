package com.p683ss.android.ugc.aweme.p1807im.sdk.msgdetail;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.MediaBrowserRecyclerView */
public final class MediaBrowserRecyclerView extends RecyclerView {

    /* renamed from: N */
    private int f89372N;

    /* renamed from: O */
    private int f89373O;

    /* renamed from: P */
    private int f89374P;

    /* renamed from: Q */
    private int f89375Q;

    public MediaBrowserRecyclerView(Context context) {
        this(context, null, 0, 6, null);
    }

    public MediaBrowserRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void setScrollingTouchSlop(int i) {
        int i2;
        super.setScrollingTouchSlop(i);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        switch (i) {
            case 0:
                C52711k.m112236a((Object) viewConfiguration, "configuration");
                i2 = viewConfiguration.getScaledTouchSlop();
                break;
            case 1:
                C52711k.m112236a((Object) viewConfiguration, "configuration");
                i2 = viewConfiguration.getScaledPagingTouchSlop();
                break;
            default:
                C52711k.m112236a((Object) viewConfiguration, "configuration");
                i2 = viewConfiguration.getScaledTouchSlop();
                break;
        }
        this.f89372N = i2;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (motionEvent == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f89373O = motionEvent.getPointerId(0);
            this.f89374P = (int) (motionEvent.getX() + 0.5f);
            this.f89375Q = (int) (motionEvent.getY() + 0.5f);
            return super.onInterceptTouchEvent(motionEvent);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f89373O);
            if (findPointerIndex < 0) {
                return false;
            }
            if (getScrollState() == 1) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            int x = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int i = x - this.f89374P;
            int y = ((int) (motionEvent.getY(findPointerIndex) + 0.5f)) - this.f89375Q;
            C1332i layoutManager = getLayoutManager();
            if (layoutManager == null) {
                C52711k.m112234a();
            }
            boolean e = layoutManager.mo4742e();
            C1332i layoutManager2 = getLayoutManager();
            if (layoutManager2 == null) {
                C52711k.m112234a();
            }
            boolean f = layoutManager2.mo4745f();
            if (!e || Math.abs(i) <= this.f89372N || (Math.abs(i) < Math.abs(y) && !f)) {
                z = false;
            } else {
                z = true;
            }
            if (f && Math.abs(y) > this.f89372N && (Math.abs(y) >= Math.abs(i) || e)) {
                z = true;
            }
            if (!z || !super.onInterceptTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        } else if (actionMasked != 5) {
            return super.onInterceptTouchEvent(motionEvent);
        } else {
            this.f89373O = motionEvent.getPointerId(motionEvent.getActionIndex());
            this.f89374P = (int) (motionEvent.getX(motionEvent.getActionIndex()) + 0.5f);
            this.f89375Q = (int) (motionEvent.getY(motionEvent.getActionIndex()) + 0.5f);
            return super.onInterceptTouchEvent(motionEvent);
        }
    }

    public MediaBrowserRecyclerView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f89373O = -1;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        C52711k.m112236a((Object) viewConfiguration, "ViewConfiguration.get(context)");
        this.f89372N = viewConfiguration.getScaledTouchSlop();
    }

    public /* synthetic */ MediaBrowserRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
