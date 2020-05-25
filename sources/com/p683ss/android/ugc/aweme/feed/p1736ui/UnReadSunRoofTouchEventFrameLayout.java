package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.p683ss.android.ugc.aweme.base.p1420ui.CustomInterceptTouchEventFrameLayout;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.UnReadSunRoofTouchEventFrameLayout */
public final class UnReadSunRoofTouchEventFrameLayout extends AbstractUnReadSunRoofTouchEventFrameLayout {

    /* renamed from: a */
    private boolean f80521a;

    /* renamed from: b */
    private float f80522b;

    /* renamed from: c */
    private float f80523c;

    /* renamed from: d */
    private long f80524d;

    public UnReadSunRoofTouchEventFrameLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public UnReadSunRoofTouchEventFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C52711k.m112240b(motionEvent, "ev");
        super.onInterceptTouchEvent(motionEvent);
        this.f80521a = false;
        switch (motionEvent.getAction()) {
            case 0:
                this.f80522b = motionEvent.getX();
                this.f80523c = motionEvent.getY();
                this.f80524d = System.currentTimeMillis();
                break;
            case 1:
                if (getNeedIntercept()) {
                    float x = motionEvent.getX() - this.f80522b;
                    float y = motionEvent.getY() - this.f80523c;
                    if (Math.abs(x) < ((float) CustomInterceptTouchEventFrameLayout.f62924a) && Math.abs(y) < ((float) CustomInterceptTouchEventFrameLayout.f62924a)) {
                        getCallBack().invoke();
                        this.f80521a = true;
                        break;
                    }
                }
                break;
            case 2:
                if (getNeedIntercept()) {
                    float x2 = motionEvent.getX() - this.f80522b;
                    float y2 = motionEvent.getY() - this.f80523c;
                    if (Math.abs(x2) <= ((float) CustomInterceptTouchEventFrameLayout.f62924a) && Math.abs(y2) <= ((float) CustomInterceptTouchEventFrameLayout.f62924a)) {
                        if (System.currentTimeMillis() - this.f80524d > ((long) ViewConfiguration.getDoubleTapTimeout())) {
                            getCallBack().invoke();
                            this.f80521a = true;
                            break;
                        }
                    } else if (((Boolean) getScrollPredicate().invoke(Float.valueOf(x2), Float.valueOf(y2))).booleanValue()) {
                        getCallBack().invoke();
                        this.f80521a = true;
                        break;
                    }
                }
                break;
        }
        return this.f80521a;
    }

    public UnReadSunRoofTouchEventFrameLayout(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
    }

    public /* synthetic */ UnReadSunRoofTouchEventFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
