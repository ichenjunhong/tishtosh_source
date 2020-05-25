package android.support.p019b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build.VERSION;

/* renamed from: android.support.b.a */
final class C0237a {

    /* renamed from: android.support.b.a$a */
    interface C0238a {
        void onAnimationPause(Animator animator);

        void onAnimationResume(Animator animator);
    }

    /* renamed from: a */
    static void m485a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
        if (VERSION.SDK_INT >= 19) {
            animator.addPauseListener(animatorListenerAdapter);
        }
    }
}
