package com.p683ss.android.ugc.aweme.shortvideo.duet;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;
import com.p683ss.android.ugc.aweme.adaptation.C22452a;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52710j;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.f */
public final class C43246f implements AnimatorListener {

    /* renamed from: a */
    final LottieAnimationView f109359a;

    /* renamed from: b */
    public ValueAnimator f109360b;

    /* renamed from: c */
    final long f109361c;

    /* renamed from: d */
    final float f109362d;

    /* renamed from: e */
    final long f109363e;

    /* renamed from: f */
    final long f109364f;

    /* renamed from: g */
    public float f109365g;

    /* renamed from: h */
    public C52682m<? super Float, ? super Float, C52860x> f109366h;

    /* renamed from: i */
    public C52670a<C52860x> f109367i;

    /* renamed from: j */
    final ViewGroup f109368j;

    /* renamed from: k */
    final C43247a f109369k;

    /* renamed from: l */
    private final long f109370l;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.f$a */
    public enum C43247a {
        UP_DOWN,
        THREE_SCREEN,
        NONE
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.f$b */
    static final class C43248b implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C43246f f109372a;

        C43248b(C43246f fVar) {
            this.f109372a = fVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (valueAnimator != null) {
                C43246f fVar = this.f109372a;
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    fVar.f109359a.setAlpha(((Float) animatedValue).floatValue());
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type kotlin.Float");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.f$c */
    public static final class C43249c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C43246f f109373a;

        C43249c(C43246f fVar) {
            this.f109373a = fVar;
        }

        public final void onAnimationEnd(Animator animator) {
            C52670a<C52860x> aVar = this.f109373a.f109367i;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.f$d */
    static final /* synthetic */ class C43250d extends C52710j implements C52670a<C52860x> {
        C43250d(C43246f fVar) {
            super(0, fVar);
        }

        public final String getName() {
            return "restartAnimation";
        }

        public final C52761d getOwner() {
            return C52728w.m112245a(C43246f.class);
        }

        public final String getSignature() {
            return "restartAnimation()V";
        }

        public final /* synthetic */ Object invoke() {
            C43246f fVar = (C43246f) this.receiver;
            fVar.f109359a.mo6657c();
            fVar.f109359a.setTranslationY(fVar.f109365g);
            C52682m<? super Float, ? super Float, C52860x> mVar = fVar.f109366h;
            if (mVar != null) {
                mVar.invoke(Float.valueOf(fVar.f109365g), Float.valueOf(0.0f));
            }
            fVar.f109359a.postDelayed(new C43251e(fVar), fVar.f109363e);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.f$e */
    static final class C43251e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C43246f f109374a;

        C43251e(C43246f fVar) {
            this.f109374a = fVar;
        }

        public final void run() {
            ValueAnimator valueAnimator = this.f109374a.f109360b;
            if (valueAnimator != null) {
                valueAnimator.start();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.f$f */
    static final class C43252f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C43246f f109375a;

        C43252f(C43246f fVar) {
            this.f109375a = fVar;
        }

        public final void run() {
            ValueAnimator valueAnimator = this.f109375a.f109360b;
            if (valueAnimator != null) {
                valueAnimator.start();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.f$g */
    static final /* synthetic */ class C43253g extends C52710j implements C52670a<C52860x> {
        C43253g(C43246f fVar) {
            super(0, fVar);
        }

        public final String getName() {
            return "startAnimation";
        }

        public final C52761d getOwner() {
            return C52728w.m112245a(C43246f.class);
        }

        public final String getSignature() {
            return "startAnimation()V";
        }

        public final /* synthetic */ Object invoke() {
            C43246f fVar = (C43246f) this.receiver;
            fVar.f109359a.mo6654b();
            fVar.f109359a.setVisibility(0);
            fVar.f109359a.postDelayed(new C43252f(fVar), fVar.f109363e);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.f$h */
    static final class C43254h implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C43246f f109376a;

        C43254h(C43246f fVar) {
            this.f109376a = fVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (valueAnimator != null) {
                C52682m<? super Float, ? super Float, C52860x> mVar = this.f109376a.f109366h;
                if (mVar != null) {
                    Float valueOf = Float.valueOf(this.f109376a.f109365g);
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    if (animatedValue != null) {
                        mVar.invoke(valueOf, (Float) animatedValue);
                    } else {
                        throw new C52857u("null cannot be cast to non-null type kotlin.Float");
                    }
                }
                C43246f fVar = this.f109376a;
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                if (animatedValue2 != null) {
                    fVar.f109359a.setTranslationY(((Float) animatedValue2).floatValue() + this.f109376a.f109365g);
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type kotlin.Float");
            }
        }
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    /* renamed from: b */
    private final void m94887b() {
        switch (C43255g.f109378b[this.f109369k.ordinal()]) {
            case 1:
                C43259k.m94900a();
                return;
            case 2:
                C43259k.m94901b();
                break;
        }
    }

    /* renamed from: a */
    public final void mo87924a() {
        ValueAnimator valueAnimator = this.f109360b;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
        }
        this.f109359a.mo6659d();
        this.f109359a.mo6661f();
        this.f109359a.setVisibility(8);
        m94887b();
    }

    public final void onAnimationRepeat(Animator animator) {
        this.f109359a.mo6662g();
        this.f109359a.postDelayed(new C43256h(new C43250d(this)), this.f109364f);
    }

    public final void onAnimationEnd(Animator animator) {
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f}).setDuration(this.f109370l);
        duration.removeAllUpdateListeners();
        duration.addUpdateListener(new C43248b(this));
        duration.addListener(new C43249c(this));
        duration.start();
        m94887b();
    }

    public C43246f(ViewGroup viewGroup, C43247a aVar) {
        C52711k.m112240b(viewGroup, "mRootLayout");
        C52711k.m112240b(aVar, "mLayoutMode");
        this.f109368j = viewGroup;
        this.f109369k = aVar;
        View inflate = LayoutInflater.from(this.f109368j.getContext()).inflate(R.layout.bv8, this.f109368j, false);
        if (inflate != null) {
            this.f109359a = (LottieAnimationView) inflate;
            this.f109361c = 880;
            this.f109363e = 680;
            this.f109370l = 520;
            this.f109364f = 300;
            this.f109368j.addView(this.f109359a);
            this.f109362d = (float) C22452a.m55501g();
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.airbnb.lottie.LottieAnimationView");
    }
}
