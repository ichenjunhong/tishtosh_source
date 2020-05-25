package com.p683ss.android.ugc.aweme.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* renamed from: com.ss.android.ugc.aweme.common.widget.ZeusFrameLayout */
public class ZeusFrameLayout extends FrameLayout {

    /* renamed from: a */
    public boolean f71051a;

    public ZeusFrameLayout(Context context) {
        super(context);
    }

    public void setInterruptAll(boolean z) {
        this.f71051a = z;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f71051a || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public ZeusFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ZeusFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
