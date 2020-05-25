package com.p683ss.android.ugc.aweme.views;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;

/* renamed from: com.ss.android.ugc.aweme.views.k */
public final class C48200k extends HorizontalScrollView {

    /* renamed from: a */
    private boolean f121272a = true;

    public final void setScrollable(boolean z) {
        this.f121272a = z;
    }

    public C48200k(Context context) {
        super(context);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f121272a) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }
}
