package com.p683ss.android.ugc.aweme.discover.p1659ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.MotionEvent;
import android.view.View;
import com.p683ss.android.ugc.aweme.common.p1593e.C26869c;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.aw */
public abstract class C28515aw extends C26869c {

    /* renamed from: e */
    public boolean f74940e = true;

    /* renamed from: b */
    public abstract void mo55272b(View view, MotionEvent motionEvent);

    /* renamed from: b */
    public final Animator mo51960b(View view) {
        if (!this.f74940e) {
            return ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 1.0f});
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.5f});
        ofFloat.setDuration(150);
        return ofFloat;
    }

    /* renamed from: c */
    public final Animator mo51961c(View view) {
        if (!this.f74940e) {
            return ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 1.0f});
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.5f, 1.0f});
        ofFloat.setDuration(150);
        return ofFloat;
    }

    /* renamed from: a */
    public final void mo51959a(View view, MotionEvent motionEvent) {
        mo55272b(view, motionEvent);
    }
}
