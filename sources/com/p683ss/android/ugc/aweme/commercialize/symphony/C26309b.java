package com.p683ss.android.ugc.aweme.commercialize.symphony;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.p683ss.android.ugc.aweme.feed.adapter.C30081g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.b */
public final class C26309b implements OnTouchListener {

    /* renamed from: a */
    private final float f69435a = 0.92f;

    /* renamed from: b */
    private final float f69436b = 1.0f;

    /* renamed from: a */
    private final void m63682a(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", new float[]{this.f69436b});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", new float[]{this.f69436b});
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet duration = animatorSet.setDuration(60);
        C52711k.m112236a((Object) duration, "set.setDuration(60)");
        duration.setInterpolator(new C30081g());
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.start();
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C52711k.m112240b(view, "v");
        C52711k.m112240b(motionEvent, "event");
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", new float[]{this.f69435a});
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", new float[]{this.f69435a});
                    AnimatorSet animatorSet = new AnimatorSet();
                    AnimatorSet duration = animatorSet.setDuration(100);
                    C52711k.m112236a((Object) duration, "set.setDuration(100)");
                    duration.setInterpolator(new C30081g());
                    animatorSet.play(ofFloat).with(ofFloat2);
                    animatorSet.start();
                    break;
                case 1:
                    m63682a(view);
                    view.performClick();
                    return true;
            }
            return true;
        }
        m63682a(view);
        return false;
    }
}
