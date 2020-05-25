package com.bytedance.scene.p841c;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: com.bytedance.scene.c.e */
public final class C12872e extends AnimatorListenerAdapter {

    /* renamed from: a */
    private View f33703a;

    /* renamed from: b */
    private int f33704b = this.f33703a.getLayerType();

    public C12872e(View view) {
        this.f33703a = view;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f33703a.setLayerType(this.f33704b, null);
    }

    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        this.f33703a.setLayerType(2, null);
    }
}
