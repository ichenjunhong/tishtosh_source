package android.support.design.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* renamed from: android.support.design.widget.p */
public final class C0567p {

    /* renamed from: a */
    final ArrayList<C0569a> f2054a = new ArrayList<>();

    /* renamed from: b */
    C0569a f2055b = null;

    /* renamed from: c */
    ValueAnimator f2056c = null;

    /* renamed from: d */
    private final AnimatorListener f2057d = new AnimatorListenerAdapter() {
        public final void onAnimationEnd(Animator animator) {
            if (C0567p.this.f2056c == animator) {
                C0567p.this.f2056c = null;
            }
        }
    };

    /* renamed from: android.support.design.widget.p$a */
    static class C0569a {

        /* renamed from: a */
        final int[] f2059a;

        /* renamed from: b */
        final ValueAnimator f2060b;

        C0569a(int[] iArr, ValueAnimator valueAnimator) {
            this.f2059a = iArr;
            this.f2060b = valueAnimator;
        }
    }

    /* renamed from: a */
    public final void mo1769a(int[] iArr, ValueAnimator valueAnimator) {
        C0569a aVar = new C0569a(iArr, valueAnimator);
        valueAnimator.addListener(this.f2057d);
        this.f2054a.add(aVar);
    }
}
