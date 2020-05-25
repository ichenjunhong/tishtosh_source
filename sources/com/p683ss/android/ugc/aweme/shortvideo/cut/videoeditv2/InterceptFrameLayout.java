package com.p683ss.android.ugc.aweme.shortvideo.cut.videoeditv2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.InterceptFrameLayout */
public final class InterceptFrameLayout extends FrameLayout {

    /* renamed from: a */
    private boolean f108978a;

    public InterceptFrameLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public InterceptFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final boolean getIntercept() {
        return this.f108978a;
    }

    public final void setIntercept(boolean z) {
        this.f108978a = z;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f108978a) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public InterceptFrameLayout(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
    }

    public /* synthetic */ InterceptFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
