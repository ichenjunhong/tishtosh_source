package com.p683ss.android.ugc.aweme.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.p683ss.android.ugc.aweme.base.widget.BaseRecyclerView;

/* renamed from: com.ss.android.ugc.aweme.common.widget.NestedScrollingRecyclerView */
public class NestedScrollingRecyclerView extends BaseRecyclerView {

    /* renamed from: N */
    private int f70899N;

    /* renamed from: O */
    private int f70900O;

    /* renamed from: P */
    private int f70901P;

    /* renamed from: Q */
    private int f70902Q;

    public NestedScrollingRecyclerView(Context context) {
        this(context, null);
    }

    public void setScrollingTouchSlop(int i) {
        super.setScrollingTouchSlop(i);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        switch (i) {
            case 0:
                this.f70902Q = viewConfiguration.getScaledTouchSlop();
                return;
            case 1:
                this.f70902Q = viewConfiguration.getScaledPagingTouchSlop();
                break;
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            this.f70899N = motionEvent.getPointerId(0);
            this.f70900O = (int) (motionEvent.getX() + 0.5f);
            this.f70901P = (int) (motionEvent.getY() + 0.5f);
            return super.onInterceptTouchEvent(motionEvent);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f70899N);
            if (findPointerIndex < 0) {
                return false;
            }
            int x = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (getScrollState() == 1) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            int i = x - this.f70900O;
            int i2 = y - this.f70901P;
            boolean e = getLayoutManager().mo4742e();
            boolean f = getLayoutManager().mo4745f();
            if (!e || Math.abs(i) <= this.f70902Q || (Math.abs(i) < Math.abs(i2) && !f)) {
                z = false;
            } else {
                z = true;
            }
            if (f && Math.abs(i2) > this.f70902Q && (Math.abs(i2) >= Math.abs(i) || e)) {
                z = true;
            }
            if (!z || !super.onInterceptTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        } else if (actionMasked != 5) {
            return super.onInterceptTouchEvent(motionEvent);
        } else {
            this.f70899N = motionEvent.getPointerId(actionIndex);
            this.f70900O = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f70901P = (int) (motionEvent.getY(actionIndex) + 0.5f);
            return super.onInterceptTouchEvent(motionEvent);
        }
    }

    public NestedScrollingRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollingRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f70899N = -1;
        this.f70902Q = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }
}
