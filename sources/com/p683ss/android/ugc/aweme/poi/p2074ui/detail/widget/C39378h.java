package com.p683ss.android.ugc.aweme.poi.p2074ui.detail.widget;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.view.View;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.widget.h */
final class C39378h {

    /* renamed from: a */
    static final int[] f100734a = {16843848};

    /* renamed from: a */
    static void m87558a(View view, float f) {
        int integer = view.getResources().getInteger(R.integer.c);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = (long) integer;
        stateListAnimator.addState(new int[]{16842766, R.attr.a3e, -2131362945}, ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(j));
        stateListAnimator.addState(new int[]{16842766}, ObjectAnimator.ofFloat(view, "elevation", new float[]{f}).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(0));
        view.setStateListAnimator(stateListAnimator);
    }
}
