package com.bytedance.android.live.broadcast.bgbroadcast.p199a;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.android.live.broadcast.widget.C3786r;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.floatwindow.C7176g;
import com.bytedance.common.utility.C9432q;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.j */
final /* synthetic */ class C3103j implements C1710e {

    /* renamed from: a */
    private final C3089f f9061a;

    /* renamed from: b */
    private final C7176g f9062b;

    C3103j(C3089f fVar, C7176g gVar) {
        this.f9061a = fVar;
        this.f9062b = gVar;
    }

    public final void accept(Object obj) {
        C3089f fVar = this.f9061a;
        C7176g gVar = this.f9062b;
        Long l = (Long) obj;
        ValueAnimator ofInt = ObjectAnimator.ofInt(new int[]{0, (int) (-C9432q.m18687b(C3922z.m9915e(), 20.0f))});
        ofInt.addUpdateListener(new AnimatorUpdateListener(gVar) {

            /* renamed from: a */
            final /* synthetic */ C7176g f9053a;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f9053a.f19485a.mo13309a(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }

            {
                this.f9053a = r2;
            }
        });
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.setDuration(100).start();
        ofInt.addListener(new AnimatorListener(gVar) {

            /* renamed from: a */
            final /* synthetic */ C7176g f9055a;

            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
                ((C3786r) this.f9055a.mo13317d()).mo9158a();
                C3089f.this.f9035g.dispose();
            }

            {
                this.f9055a = r2;
            }
        });
    }
}
