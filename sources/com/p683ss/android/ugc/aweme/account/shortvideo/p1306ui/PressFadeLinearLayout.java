package com.p683ss.android.ugc.aweme.account.shortvideo.p1306ui;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: com.ss.android.ugc.aweme.account.shortvideo.ui.PressFadeLinearLayout */
public class PressFadeLinearLayout extends LinearLayout {

    /* renamed from: a */
    public boolean f59744a;

    /* renamed from: a */
    private void m54948a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            childAt.clearAnimation();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, "alpha", new float[]{childAt.getAlpha(), 1.0f});
            ofFloat.setDuration(100);
            ofFloat.start();
            ofFloat.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                }
            });
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f59744a;
    }

    public void setIntercept(boolean z) {
        this.f59744a = z;
    }

    public PressFadeLinearLayout(Context context) {
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
                        ofFloat.addUpdateListener(new AnimatorUpdateListener() {
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            }
                        });
                    }
                    break;
                case 1:
                    m54948a();
                    break;
            }
        } else {
            m54948a();
        }
        return super.onTouchEvent(motionEvent);
    }

    public PressFadeLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PressFadeLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
