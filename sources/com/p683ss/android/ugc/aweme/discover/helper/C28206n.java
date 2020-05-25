package com.p683ss.android.ugc.aweme.discover.helper;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.n */
public final class C28206n extends Visibility {
    public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        C52711k.m112240b(viewGroup, "sceneRoot");
        C52711k.m112240b(view, "view");
        C52711k.m112240b(transitionValues, "startValues");
        C52711k.m112240b(transitionValues2, "endValues");
        return null;
    }

    public final Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        C52711k.m112240b(viewGroup, "sceneRoot");
        C52711k.m112240b(view, "view");
        C52711k.m112240b(transitionValues, "startValues");
        C52711k.m112240b(transitionValues2, "endValues");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", new float[]{(float) C23728o.m58241a(20.0d), 0.0f});
        C52711k.m112236a((Object) ofFloat, "translationY");
        ofFloat.setDuration(200);
        ofFloat.setInterpolator(new LinearInterpolator());
        return ofFloat;
    }
}
