package com.p683ss.android.ugc.aweme.commercialize.playfun.p1577a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.view.View;
import com.p683ss.android.ugc.aweme.commercialize.playfun.C26155a;
import com.p683ss.android.ugc.aweme.commercialize.playfun.C26167b;
import com.p683ss.android.ugc.aweme.commercialize.playfun.C26167b.C26168a;
import com.p683ss.android.ugc.aweme.commercialize.playfun.C26171d;
import com.p683ss.android.ugc.aweme.commercialize.playfun.C26173f;
import com.p683ss.android.ugc.aweme.feed.model.AwemePlayFunModel;
import com.p683ss.android.ugc.aweme.p1334ai.C22546a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.a.b */
public final class C26159b extends C26157a {

    /* renamed from: d */
    private Animator f69078d;

    /* renamed from: e */
    private Animator f69079e;

    /* renamed from: d */
    public final void mo53782d() {
        super.mo53782d();
        Animator animator = this.f69078d;
        if (animator != null) {
            animator.cancel();
        }
        this.f69078d = null;
        Animator animator2 = this.f69079e;
        if (animator2 != null) {
            animator2.cancel();
        }
        this.f69079e = null;
    }

    /* renamed from: a */
    public final void mo53778a() {
        float f;
        long j;
        m63447a("CollapseState---handle");
        super.mo53778a();
        AwemePlayFunModel awemePlayFunModel = this.f69111b.f69114c;
        if (awemePlayFunModel != null) {
            f = awemePlayFunModel.getEndDuration();
        } else {
            f = 0.0f;
        }
        float f2 = f * 1000.0f;
        PointF c = this.f69111b.mo53803c();
        C26167b a = new C26168a().mo53788a(f2).mo53789a(new PointF(this.f69111b.f69116e.getTranslationX(), this.f69111b.f69116e.getTranslationY())).mo53791b(new PointF(c.x, c.y)).mo53790a();
        C26155a aVar = C26155a.f69072a;
        View view = this.f69111b.f69116e;
        C26171d dVar = this.f69111b.f69122k;
        C52711k.m112240b(view, "target");
        C52711k.m112240b(dVar, "playFunParam");
        C52711k.m112240b(a, "animParams");
        view.setPivotX(((float) dVar.f69106a) / 2.0f);
        view.setPivotY(((float) dVar.f69106a) / 2.0f);
        Path path = new Path();
        path.moveTo(a.f69087b, a.f69088c);
        Path path2 = path;
        path2.cubicTo((a.f69087b + a.f69091f) / 2.0f, a.f69088c, a.f69091f, (a.f69088c + a.f69092g) / 2.0f, a.f69091f, a.f69092g);
        Animator a2 = C26155a.m63419a(view, path);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", new float[]{view.getScaleX(), dVar.f69109d});
        C52711k.m112236a((Object) ofFloat, "ObjectAnimator.ofFloat(t…playFunParam.widgetScale)");
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "ScaleY", new float[]{view.getScaleY(), dVar.f69109d});
        C52711k.m112236a((Object) ofFloat2, "ObjectAnimator.ofFloat(t…playFunParam.widgetScale)");
        AnimatorSet animatorSet = new AnimatorSet();
        float f3 = a.f69086a;
        if (f3 > 0.0f) {
            j = (long) f3;
        } else {
            j = 500;
        }
        animatorSet.setDuration(j);
        animatorSet.setInterpolator(new C22546a());
        animatorSet.play(a2).with(ofFloat).with(ofFloat2);
        mo53779a(animatorSet);
        Animator animator = this.f69076c;
        if (animator != null) {
            animator.start();
        }
        long j2 = ((long) f2) / 2;
        View view2 = this.f69111b.f69115d;
        C52711k.m112240b(view2, "target");
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view2, "alpha", new float[]{1.0f, 0.0f});
        C52711k.m112236a((Object) ofFloat3, "alphaAnim");
        ofFloat3.setDuration(j2);
        this.f69078d = ofFloat3;
        Animator animator2 = this.f69078d;
        if (animator2 != null) {
            animator2.start();
        }
        View view3 = this.f69111b.f69117f;
        C52711k.m112240b(view3, "target");
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view3, "alpha", new float[]{1.0f, 0.0f});
        C52711k.m112236a((Object) ofFloat4, "alphaAnim");
        ofFloat4.setDuration(200);
        this.f69079e = ofFloat4;
        Animator animator3 = this.f69079e;
        if (animator3 != null) {
            animator3.start();
        }
    }

    public C26159b(C26173f fVar) {
        C52711k.m112240b(fVar, "stateContext");
        super(fVar);
    }
}
