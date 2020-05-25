package android.support.design.p023b;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build.VERSION;
import android.support.design.p023b.C0405d.C0407a;
import android.support.design.p023b.C0405d.C0408b;
import android.support.design.p023b.C0405d.C0410d;
import android.view.View;
import android.view.ViewAnimationUtils;

/* renamed from: android.support.design.b.a */
public final class C0399a {
    /* renamed from: a */
    public static Animator m977a(C0405d dVar, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(dVar, C0408b.f1304a, C0407a.f1302a, new C0410d[]{new C0410d(f, f2, f3)});
        if (VERSION.SDK_INT < 21) {
            return ofObject;
        }
        C0410d revealInfo = dVar.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) dVar, (int) f, (int) f2, revealInfo.f1308c, f3);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofObject, createCircularReveal});
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }
}
