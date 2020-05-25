package android.support.p019b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.view.View;
import com.ss.android.ugc.trill.R;

/* renamed from: android.support.b.u */
final class C0314u {

    /* renamed from: android.support.b.u$a */
    static class C0315a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private final View f777a;

        /* renamed from: b */
        private final View f778b;

        /* renamed from: c */
        private final int f779c;

        /* renamed from: d */
        private final int f780d;

        /* renamed from: e */
        private int[] f781e = ((int[]) this.f777a.getTag(R.id.d48));

        /* renamed from: f */
        private float f782f;

        /* renamed from: g */
        private float f783g;

        /* renamed from: h */
        private final float f784h;

        /* renamed from: i */
        private final float f785i;

        public final void onAnimationEnd(Animator animator) {
            this.f778b.setTranslationX(this.f784h);
            this.f778b.setTranslationY(this.f785i);
        }

        public final void onAnimationResume(Animator animator) {
            this.f778b.setTranslationX(this.f782f);
            this.f778b.setTranslationY(this.f783g);
        }

        public final void onAnimationPause(Animator animator) {
            this.f782f = this.f778b.getTranslationX();
            this.f783g = this.f778b.getTranslationY();
            this.f778b.setTranslationX(this.f784h);
            this.f778b.setTranslationY(this.f785i);
        }

        public final void onAnimationCancel(Animator animator) {
            if (this.f781e == null) {
                this.f781e = new int[2];
            }
            this.f781e[0] = Math.round(((float) this.f779c) + this.f778b.getTranslationX());
            this.f781e[1] = Math.round(((float) this.f780d) + this.f778b.getTranslationY());
            this.f777a.setTag(R.id.d48, this.f781e);
        }

        C0315a(View view, View view2, int i, int i2, float f, float f2) {
            this.f778b = view;
            this.f777a = view2;
            this.f779c = i - Math.round(this.f778b.getTranslationX());
            this.f780d = i2 - Math.round(this.f778b.getTranslationY());
            this.f784h = f;
            this.f785i = f2;
            if (this.f781e != null) {
                this.f777a.setTag(R.id.d48, null);
            }
        }
    }

    /* renamed from: a */
    static Animator m684a(View view, C0312s sVar, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        float f5;
        float f6;
        View view2 = view;
        C0312s sVar2 = sVar;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) sVar2.f771b.getTag(R.id.d48);
        if (iArr != null) {
            f5 = ((float) (iArr[0] - i)) + translationX;
            f6 = ((float) (iArr[1] - i2)) + translationY;
        } else {
            f5 = f;
            f6 = f2;
        }
        int round = i + Math.round(f5 - translationX);
        int round2 = i2 + Math.round(f6 - translationY);
        view2.setTranslationX(f5);
        view2.setTranslationY(f6);
        if (f5 == f3 && f6 == f4) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view2, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{f5, f3}), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{f6, f4})});
        C0315a aVar = new C0315a(view, sVar2.f771b, round, round2, translationX, translationY);
        ofPropertyValuesHolder.addListener(aVar);
        C0237a.m485a(ofPropertyValuesHolder, aVar);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }
}
