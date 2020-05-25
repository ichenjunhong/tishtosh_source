package com.p683ss.android.ugc.aweme.following.p1770ui;

import android.content.Context;
import android.support.p030v4.widget.NestedScrollView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.following.ui.NestedVPScrollView */
public final class NestedVPScrollView extends NestedScrollView {

    /* renamed from: c */
    private float f83660c;

    /* renamed from: d */
    private float f83661d;

    public NestedVPScrollView(Context context) {
        C52711k.m112240b(context, "context");
        super(context, null, 0);
        this.f83660c = -1.0f;
        this.f83661d = -1.0f;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            int action = motionEvent.getAction();
            if (action == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            } else if (action == 2) {
                if (Math.abs(rawX - this.f83660c) + 0.0f >= Math.abs(rawY - this.f83661d) + 0.0f) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                } else {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                this.f83660c = rawX;
                this.f83661d = rawY;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public NestedVPScrollView(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, 0);
        this.f83660c = -1.0f;
        this.f83661d = -1.0f;
    }

    public NestedVPScrollView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f83660c = -1.0f;
        this.f83661d = -1.0f;
    }

    public /* synthetic */ NestedVPScrollView(Context context, AttributeSet attributeSet, int i, C52707g gVar) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public /* synthetic */ NestedVPScrollView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
