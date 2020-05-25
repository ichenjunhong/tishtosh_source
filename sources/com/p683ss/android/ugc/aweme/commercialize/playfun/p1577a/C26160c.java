package com.p683ss.android.ugc.aweme.commercialize.playfun.p1577a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Point;
import android.view.View;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.commercialize.playfun.C26173f;
import com.p683ss.android.ugc.aweme.feed.model.AwemePlayFunModel;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.a.c */
public final class C26160c extends C26157a {

    /* renamed from: d */
    public Animator f69080d;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.a.c$a */
    static final class C26161a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C26160c f69081a;

        C26161a(C26160c cVar) {
            this.f69081a = cVar;
        }

        public final void run() {
            float f;
            long j;
            AwemePlayFunModel awemePlayFunModel = this.f69081a.f69111b.f69114c;
            if (awemePlayFunModel != null) {
                f = awemePlayFunModel.getShowDuration();
            } else {
                f = 0.0f;
            }
            float f2 = f * 1000.0f;
            C26160c cVar = this.f69081a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            C52711k.m112236a((Object) ofFloat, "ValueAnimator.ofFloat(0f, 1f)");
            if (f2 > 0.0f) {
                j = (long) f2;
            } else {
                j = 3000;
            }
            ofFloat.setDuration(j);
            cVar.mo53779a(ofFloat);
            Animator animator = this.f69081a.f69076c;
            if (animator != null) {
                animator.start();
            }
            View view = this.f69081a.f69111b.f69117f;
            View view2 = this.f69081a.f69111b.f69116e;
            view.setAlpha(0.0f);
            view.setVisibility(0);
            view.measure(0, 0);
            int measuredWidth = view.getMeasuredWidth();
            StringBuilder sb = new StringBuilder("eggTitleViewWidth: ");
            sb.append(measuredWidth);
            C26160c.m63447a(sb.toString());
            view.setTranslationX((view2.getTranslationX() + (((float) view2.getWidth()) / 2.0f)) - (((float) measuredWidth) / 2.0f));
            float translationY = view2.getTranslationY() + ((float) this.f69081a.f69111b.f69122k.f69106a);
            C26160c cVar2 = this.f69081a;
            C52711k.m112240b(view, "target");
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "translationY", new float[]{C9432q.m18687b(C11010c.m22280a(), 25.0f) + translationY, translationY});
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 1.0f});
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(200);
            animatorSet.play(ofFloat2).with(ofFloat3);
            cVar2.f69080d = animatorSet;
            Animator animator2 = this.f69081a.f69080d;
            if (animator2 != null) {
                animator2.start();
            }
            this.f69081a.f69111b.mo53801a("show_in_center", new Point((int) view2.getTranslationX(), (int) view2.getTranslationY()), new Point((int) view.getTranslationX(), (int) translationY));
        }
    }

    /* renamed from: e */
    public final boolean mo53785e() {
        return true;
    }

    /* renamed from: d */
    public final void mo53782d() {
        super.mo53782d();
        Animator animator = this.f69080d;
        if (animator != null) {
            animator.cancel();
        }
        this.f69080d = null;
    }

    /* renamed from: a */
    public final void mo53778a() {
        m63447a("EggShowState---handle");
        super.mo53778a();
        mo53796a((Runnable) new C26161a(this));
    }

    public C26160c(C26173f fVar) {
        C52711k.m112240b(fVar, "stateContext");
        super(fVar);
    }
}
