package com.p683ss.android.ugc.aweme.common.p1593e;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.ss.android.ugc.aweme.common.e.c */
public abstract class C26869c implements OnTouchListener {
    /* renamed from: a */
    public abstract void mo51959a(View view, MotionEvent motionEvent);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Animator mo51960b(View view);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Animator mo51961c(View view);

    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            Animator b = mo51960b(view);
            b.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                }
            });
            b.start();
            return true;
        } else if (motionEvent.getAction() == 1) {
            Animator c = mo51961c(view);
            c.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    C26869c.this.mo51959a(view, motionEvent);
                }
            });
            c.start();
            return true;
        } else if (motionEvent.getAction() != 3) {
            return false;
        } else {
            mo51961c(view).start();
            return false;
        }
    }
}
