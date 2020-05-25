package com.p683ss.android.ugc.aweme.choosemusic.p1507f.p1509b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.f.b.a */
public abstract class C24876a implements OnTouchListener {
    /* renamed from: a */
    public abstract void mo50797a(View view, MotionEvent motionEvent);

    /* renamed from: a */
    private static Animator m60434a(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.5f, 1.0f});
        ofFloat.setDuration(150);
        return ofFloat;
    }

    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.5f});
            ofFloat.setDuration(150);
            ofFloat.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                }
            });
            ofFloat.start();
            return true;
        } else if (motionEvent.getAction() == 1) {
            Animator a = m60434a(view);
            a.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    C24876a.this.mo50797a(view, motionEvent);
                }
            });
            a.start();
            return true;
        } else if (motionEvent.getAction() != 3) {
            return false;
        } else {
            m60434a(view).start();
            return false;
        }
    }
}
