package com.p683ss.android.ugc.aweme.account.shortvideo.p1306ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;

/* renamed from: com.ss.android.ugc.aweme.account.shortvideo.ui.PressFadeTextView */
public class PressFadeTextView extends DmtTextView {

    /* renamed from: b */
    private boolean f59747b;

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return null;
    }

    /* renamed from: a */
    private void m54949a() {
        clearAnimation();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", new float[]{getAlpha(), 1.0f});
        ofFloat.setDuration(100);
        ofFloat.start();
        ofFloat.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
            }
        });
    }

    public void setEnable(boolean z) {
        this.f59747b = z;
    }

    public PressFadeTextView(Context context) {
        this(context, null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f59747b) {
            int action = motionEvent.getAction();
            if (action != 3) {
                switch (action) {
                    case 0:
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", new float[]{1.0f, 0.5f});
                        ofFloat.setDuration(100);
                        ofFloat.start();
                        break;
                    case 1:
                        m54949a();
                        break;
                }
            } else {
                m54949a();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public PressFadeTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PressFadeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f59747b = true;
    }
}
