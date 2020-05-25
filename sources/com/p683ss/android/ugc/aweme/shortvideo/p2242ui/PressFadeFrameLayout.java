package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.PressFadeFrameLayout */
public class PressFadeFrameLayout extends FrameLayout {

    /* renamed from: a */
    public boolean f113657a;

    /* renamed from: a */
    private void m98147a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            childAt.clearAnimation();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, "alpha", new float[]{childAt.getAlpha(), 1.0f});
            ofFloat.setDuration(100);
            ofFloat.start();
            ofFloat.addUpdateListener(C44968af.f113893a);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f113657a;
    }

    public void setIntercept(boolean z) {
        this.f113657a = z;
    }

    public PressFadeFrameLayout(Context context) {
        this(context, null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    int childCount = getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(getChildAt(i), "alpha", new float[]{1.0f, 0.5f});
                        ofFloat.setDuration(100);
                        ofFloat.start();
                        ofFloat.addUpdateListener(C44967ae.f113892a);
                    }
                    break;
                case 1:
                    m98147a();
                    break;
            }
        } else {
            m98147a();
        }
        return super.onTouchEvent(motionEvent);
    }

    public PressFadeFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PressFadeFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
