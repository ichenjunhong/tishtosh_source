package com.p683ss.android.ugc.aweme.detail.p1619a;

import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;

/* renamed from: com.ss.android.ugc.aweme.detail.a.a */
public final class C27312a {

    /* renamed from: a */
    public static final C27312a f72052a = new C27312a();

    private C27312a() {
    }

    /* renamed from: a */
    public static /* synthetic */ AnimationSet m65832a(boolean z, int i, Object obj) {
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(-0.5f, 1.0f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(translateAnimation);
        animationSet.setDuration(300);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setFillAfter(false);
        return animationSet;
    }

    /* renamed from: b */
    public static /* synthetic */ AnimationSet m65833b(boolean z, int i, Object obj) {
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(200);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(translateAnimation);
        animationSet.setDuration(300);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setFillAfter(false);
        return animationSet;
    }
}
