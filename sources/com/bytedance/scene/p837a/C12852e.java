package com.bytedance.scene.p837a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.bytedance.scene.a.e */
public final class C12852e {
    /* renamed from: a */
    public static Animator m25763a(Animator... animatorArr) {
        List asList = Arrays.asList(animatorArr);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(asList);
        return animatorSet;
    }
}
