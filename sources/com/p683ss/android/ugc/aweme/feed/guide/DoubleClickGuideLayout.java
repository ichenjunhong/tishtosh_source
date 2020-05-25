package com.p683ss.android.ugc.aweme.feed.guide;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.guide.DoubleClickGuideLayout */
public final class DoubleClickGuideLayout extends RelativeLayout {
    public DoubleClickGuideLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public DoubleClickGuideLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public DoubleClickGuideLayout(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
    }

    public /* synthetic */ DoubleClickGuideLayout(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
