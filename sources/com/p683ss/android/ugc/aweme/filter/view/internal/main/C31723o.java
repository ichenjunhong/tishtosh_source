package com.p683ss.android.ugc.aweme.filter.view.internal.main;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import com.p683ss.android.ugc.aweme.p1484bx.C24454d;
import com.p683ss.android.ugc.aweme.p1484bx.C24456f;
import com.p683ss.android.ugc.aweme.p1484bx.C24458h;
import com.p683ss.android.ugc.aweme.p1484bx.C24458h.C24459a;
import com.p683ss.android.ugc.tools.view.p2510c.C50221d;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.o */
public final class C31723o extends C24459a implements C24456f {

    /* renamed from: d */
    public static final C31724a f82859d = new C31724a(null);

    /* renamed from: a */
    public C24458h f82860a;

    /* renamed from: b */
    public final View f82861b;

    /* renamed from: c */
    public final long f82862c;

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.o$a */
    public static final class C31724a {
        private C31724a() {
        }

        public /* synthetic */ C31724a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.o$b */
    static final class C31725b implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C31723o f82863a;

        /* renamed from: b */
        final /* synthetic */ int f82864b;

        /* renamed from: c */
        final /* synthetic */ C24454d f82865c;

        C31725b(C31723o oVar, int i, C24454d dVar) {
            this.f82863a = oVar;
            this.f82864b = i;
            this.f82865c = dVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C52711k.m112236a((Object) valueAnimator, "it");
            float animatedFraction = valueAnimator.getAnimatedFraction();
            int i = this.f82864b;
            C24458h hVar = this.f82863a.f82860a;
            if (hVar != null) {
                hVar.mo50222b(animatedFraction, 0, i);
            }
            this.f82863a.f82861b.setTranslationY(((float) (i + 0)) * animatedFraction);
            this.f82863a.f82861b.setAlpha(1.0f - animatedFraction);
            C24454d dVar = this.f82865c;
            if (dVar != null) {
                dVar.mo50222b(animatedFraction, 0, i);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.o$c */
    public static final class C31726c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C31723o f82866a;

        /* renamed from: b */
        final /* synthetic */ C24454d f82867b;

        public final void onAnimationEnd(Animator animator) {
            C24458h hVar = this.f82866a.f82860a;
            if (hVar != null) {
                hVar.mo50225d();
            }
            C24454d dVar = this.f82867b;
            if (dVar != null) {
                dVar.mo50225d();
            }
        }

        C31726c(C31723o oVar, C24454d dVar) {
            this.f82866a = oVar;
            this.f82867b = dVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.o$d */
    static final class C31727d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C31723o f82868a;

        /* renamed from: b */
        final /* synthetic */ C24454d f82869b;

        C31727d(C31723o oVar, C24454d dVar) {
            this.f82868a = oVar;
            this.f82869b = dVar;
        }

        public final void run() {
            C24458h hVar = this.f82868a.f82860a;
            if (hVar != null) {
                hVar.mo50217a();
            }
            C24454d dVar = this.f82869b;
            if (dVar != null) {
                dVar.mo50217a();
            }
            ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(this.f82868a.f82862c);
            C52711k.m112236a((Object) duration, "animator");
            duration.setInterpolator(new C50221d());
            final int measuredHeight = this.f82868a.f82861b.getMeasuredHeight();
            duration.addUpdateListener(new AnimatorUpdateListener(this) {

                /* renamed from: a */
                final /* synthetic */ C31727d f82870a;

                {
                    this.f82870a = r1;
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C52711k.m112236a((Object) valueAnimator, "it");
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    int i = measuredHeight;
                    C24458h hVar = this.f82870a.f82868a.f82860a;
                    if (hVar != null) {
                        hVar.mo50218a(animatedFraction, 0, i);
                    }
                    this.f82870a.f82868a.f82861b.setTranslationY(((float) i) + (((float) (0 - i)) * animatedFraction));
                    this.f82870a.f82868a.f82861b.setAlpha(animatedFraction);
                    C24454d dVar = this.f82870a.f82869b;
                    if (dVar != null) {
                        dVar.mo50218a(animatedFraction, 0, i);
                    }
                }
            });
            duration.addListener(new AnimatorListenerAdapter(this) {

                /* renamed from: a */
                final /* synthetic */ C31727d f82872a;

                {
                    this.f82872a = r1;
                }

                public final void onAnimationEnd(Animator animator) {
                    C24458h hVar = this.f82872a.f82868a.f82860a;
                    if (hVar != null) {
                        hVar.mo50221b();
                    }
                    C24454d dVar = this.f82872a.f82869b;
                    if (dVar != null) {
                        dVar.mo50221b();
                    }
                }
            });
            duration.start();
        }
    }

    /* renamed from: a */
    public final void mo50220a(C24458h hVar) {
        C52711k.m112240b(hVar, "listener");
        this.f82860a = hVar;
    }

    /* renamed from: a */
    public final void mo50219a(C24454d dVar) {
        this.f82861b.post(new C31727d(this, dVar));
    }

    /* renamed from: b */
    public final void mo50223b(C24454d dVar) {
        C24458h hVar = this.f82860a;
        if (hVar != null) {
            hVar.mo50224c();
        }
        if (dVar != null) {
            dVar.mo50224c();
        }
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(this.f82862c);
        duration.addUpdateListener(new C31725b(this, this.f82861b.getMeasuredHeight(), dVar));
        duration.addListener(new C31726c(this, dVar));
        duration.start();
    }

    private C31723o(View view, long j) {
        C52711k.m112240b(view, "target");
        this.f82861b = view;
        this.f82862c = j;
    }

    public /* synthetic */ C31723o(View view, long j, int i, C52707g gVar) {
        this(view, 200);
    }
}
