package com.p683ss.android.ugc.aweme.discover.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget.SwipeRefreshLayout;

/* renamed from: com.ss.android.ugc.aweme.discover.widget.BannerSwipeRefreshLayout */
public class BannerSwipeRefreshLayout extends SwipeRefreshLayout {

    /* renamed from: n */
    private View f75797n;

    /* renamed from: o */
    private int f75798o;

    /* renamed from: p */
    private boolean f75799p;

    /* renamed from: q */
    private float f75800q;

    /* renamed from: r */
    private float f75801r;

    /* renamed from: s */
    private float f75802s;

    /* renamed from: t */
    private int f75803t;

    public void setHeader(View view) {
        this.f75797n = view;
    }

    public BannerSwipeRefreshLayout(Context context) {
        this(context, null);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        try {
            if (this.f75797n != null) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    this.f75800q = motionEvent.getX();
                    this.f75801r = this.f75800q;
                    this.f75802s = motionEvent.getY();
                    this.f75799p = false;
                    this.f75803t = motionEvent.getPointerId(0);
                } else if (action == 2) {
                    if (this.f75799p) {
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(this.f75803t);
                    float x = motionEvent.getX(findPointerIndex);
                    float abs = Math.abs(x - this.f75801r);
                    float y = motionEvent.getY(findPointerIndex);
                    float abs2 = Math.abs(y - this.f75802s);
                    if (abs <= ((float) this.f75798o) || abs * 0.5f <= abs2 || ((float) this.f75797n.getBottom()) <= y) {
                        if (x - this.f75801r > 0.0f) {
                            f = this.f75800q + ((float) this.f75798o);
                        } else {
                            f = this.f75800q - ((float) this.f75798o);
                        }
                        this.f75801r = f;
                        this.f75802s = y;
                    } else {
                        this.f75799p = true;
                        return false;
                    }
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public BannerSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f75798o = ViewConfiguration.get(context).getScaledPagingTouchSlop();
        this.f75799p = false;
        setDoNotCatchException(true);
    }
}
