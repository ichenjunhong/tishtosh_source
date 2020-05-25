package android.support.p019b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.support.p019b.C0296m.C0302c;
import android.support.p030v4.view.C1056u;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.b.d */
public final class C0272d extends C0251aj {

    /* renamed from: android.support.b.d$a */
    static class C0274a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private final View f671a;

        /* renamed from: b */
        private boolean f672b;

        C0274a(View view) {
            this.f671a = view;
        }

        public final void onAnimationEnd(Animator animator) {
            C0244ae.m499a(this.f671a, 1.0f);
            if (this.f672b) {
                this.f671a.setLayerType(0, null);
            }
        }

        public final void onAnimationStart(Animator animator) {
            if (C1056u.m3074t(this.f671a) && this.f671a.getLayerType() == 0) {
                this.f672b = true;
                this.f671a.setLayerType(2, null);
            }
        }
    }

    public C0272d() {
    }

    public C0272d(int i) {
        if ((i & -4) == 0) {
            this.f613p = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    /* renamed from: a */
    public final void mo524a(C0312s sVar) {
        super.mo524a(sVar);
        sVar.f770a.put("android:fade:transitionAlpha", Float.valueOf(C0244ae.m503c(sVar.f771b)));
    }

    /* renamed from: a */
    private static float m545a(C0312s sVar, float f) {
        if (sVar == null) {
            return f;
        }
        Float f2 = (Float) sVar.f770a.get("android:fade:transitionAlpha");
        if (f2 != null) {
            return f2.floatValue();
        }
        return f;
    }

    /* renamed from: a */
    private Animator m546a(final View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        C0244ae.m499a(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C0244ae.f598b, new float[]{f2});
        ofFloat.addListener(new C0274a(view));
        mo589a((C0302c) new C0303n() {
            /* renamed from: a */
            public final void mo530a(C0296m mVar) {
                C0244ae.m499a(view, 1.0f);
                C0244ae.f597a.mo518c(view);
                mVar.mo602b((C0302c) this);
            }
        });
        return ofFloat;
    }

    /* renamed from: b */
    public final Animator mo527b(ViewGroup viewGroup, View view, C0312s sVar, C0312s sVar2) {
        C0244ae.f597a.mo517b(view);
        return m546a(view, m545a(sVar, 1.0f), 0.0f);
    }

    /* renamed from: a */
    public final Animator mo523a(ViewGroup viewGroup, View view, C0312s sVar, C0312s sVar2) {
        float f = 0.0f;
        float a = m545a(sVar, 0.0f);
        if (a != 1.0f) {
            f = a;
        }
        return m546a(view, f, 1.0f);
    }
}
