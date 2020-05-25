package com.p683ss.android.ugc.aweme.commercialize.playfun.p1577a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.p683ss.android.ugc.aweme.commercialize.playfun.C26155a;
import com.p683ss.android.ugc.aweme.commercialize.playfun.C26167b;
import com.p683ss.android.ugc.aweme.commercialize.playfun.C26167b.C26168a;
import com.p683ss.android.ugc.aweme.commercialize.playfun.C26171d;
import com.p683ss.android.ugc.aweme.commercialize.playfun.C26173f;
import com.p683ss.android.ugc.aweme.commercialize.playfun.C26175g;
import com.p683ss.android.ugc.aweme.feed.model.AwemePlayFunModel;
import com.p683ss.android.ugc.aweme.p1334ai.C22546a;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.a.d */
public final class C26162d extends C26157a {

    /* renamed from: d */
    public Animator f69082d;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.a.d$a */
    static final class C26163a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C26162d f69083a;

        C26163a(C26162d dVar) {
            this.f69083a = dVar;
        }

        public final void run() {
            float f;
            PointF pointF;
            int i;
            float f2;
            long j;
            int i2;
            int i3;
            AwemePlayFunModel awemePlayFunModel = this.f69083a.f69111b.f69114c;
            if (awemePlayFunModel != null) {
                f = awemePlayFunModel.getStartDuration();
            } else {
                f = 0.0f;
            }
            float f3 = f * 1000.0f;
            C26168a a = new C26168a().mo53788a(f3);
            C26162d dVar = this.f69083a;
            if (awemePlayFunModel == null) {
                pointF = new PointF(0.0f, 0.0f);
            } else {
                ViewParent parent = dVar.f69111b.f69121j.getParent();
                if (parent != null) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    View childAt = viewGroup.getChildAt(0);
                    C52711k.m112236a((Object) childAt, "textureView");
                    if (childAt.getWidth() > viewGroup.getWidth()) {
                        i2 = (childAt.getWidth() - viewGroup.getWidth()) / 2;
                    } else {
                        i2 = 0;
                    }
                    if (childAt.getHeight() > viewGroup.getHeight()) {
                        i3 = (childAt.getHeight() - viewGroup.getHeight()) / 2;
                    } else {
                        i3 = 0;
                    }
                    float f4 = (float) (dVar.f69111b.f69122k.f69106a / 2);
                    pointF = new PointF(((((float) childAt.getWidth()) * awemePlayFunModel.getPositionX()) - ((float) i2)) - f4, ((((float) childAt.getHeight()) * awemePlayFunModel.getPositionY()) - ((float) i3)) - f4);
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
                }
            }
            C26168a a2 = a.mo53789a(pointF);
            C26162d dVar2 = this.f69083a;
            C26168a b = a2.mo53791b(new PointF(dVar2.f69111b.f69122k.f69108c, dVar2.f69111b.f69122k.f69107b - ((float) C26175g.m63463a(dVar2.f69111b.f69121j))));
            if (awemePlayFunModel != null) {
                i = awemePlayFunModel.getAngle();
            } else {
                i = 0;
            }
            b.f69094b = i;
            if (awemePlayFunModel != null) {
                f2 = awemePlayFunModel.getSize();
            } else {
                f2 = 0.0f;
            }
            b.f69093a = f2;
            C26167b a3 = b.mo53790a();
            C26162d dVar3 = this.f69083a;
            C26155a aVar = C26155a.f69072a;
            View view = this.f69083a.f69111b.f69116e;
            C26171d dVar4 = this.f69083a.f69111b.f69122k;
            C52711k.m112240b(view, "target");
            C52711k.m112240b(dVar4, "playFunParam");
            C52711k.m112240b(a3, "animParams");
            view.setPivotX(((float) dVar4.f69106a) / 2.0f);
            view.setPivotY(((float) dVar4.f69106a) / 2.0f);
            view.setTranslationX(a3.f69087b);
            view.setTranslationY(a3.f69088c);
            view.setScaleX(a3.f69089d);
            view.setScaleY(a3.f69089d);
            view.setRotation((float) a3.f69090e);
            Path path = new Path();
            path.moveTo(a3.f69087b, a3.f69088c);
            path.lineTo(a3.f69091f, a3.f69092g);
            Animator a4 = C26155a.m63419a(view, path);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", new float[]{a3.f69089d, 1.0f});
            C52711k.m112236a((Object) ofFloat, "ObjectAnimator.ofFloat(t…E_X, animParams.size, 1f)");
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "ScaleY", new float[]{a3.f69089d, 1.0f});
            C52711k.m112236a((Object) ofFloat2, "ObjectAnimator.ofFloat(t…E_Y, animParams.size, 1f)");
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "rotation", new float[]{(float) a3.f69090e, 0.0f});
            C52711k.m112236a((Object) ofFloat3, "ObjectAnimator.ofFloat(t…rams.angle.toFloat(), 0f)");
            AnimatorSet animatorSet = new AnimatorSet();
            float f5 = a3.f69086a;
            if (f5 > 0.0f) {
                j = (long) f5;
            } else {
                j = 500;
            }
            animatorSet.setDuration(j);
            animatorSet.setInterpolator(new C22546a());
            animatorSet.play(a4).with(ofFloat).with(ofFloat2).with(ofFloat3);
            dVar3.mo53779a(animatorSet);
            this.f69083a.f69111b.f69116e.setAlpha(1.0f);
            Animator animator = this.f69083a.f69076c;
            if (animator != null) {
                animator.start();
            }
            long j2 = ((long) f3) / 2;
            this.f69083a.f69111b.f69115d.setAlpha(0.0f);
            C26162d dVar5 = this.f69083a;
            View view2 = this.f69083a.f69111b.f69115d;
            C52711k.m112240b(view2, "target");
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view2, "alpha", new float[]{0.0f, 1.0f});
            C52711k.m112236a((Object) ofFloat4, "alphaAnim");
            ofFloat4.setDuration(j2);
            dVar5.f69082d = ofFloat4;
            Animator animator2 = this.f69083a.f69082d;
            if (animator2 != null) {
                animator2.setStartDelay(j2);
            }
            Animator animator3 = this.f69083a.f69082d;
            if (animator3 != null) {
                animator3.start();
            }
            this.f69083a.f69111b.mo53801a("start_expand", new Point((int) a3.f69087b, (int) a3.f69088c), null);
        }
    }

    /* renamed from: d */
    public final void mo53782d() {
        super.mo53782d();
        Animator animator = this.f69082d;
        if (animator != null) {
            animator.cancel();
        }
        this.f69082d = null;
    }

    /* renamed from: a */
    public final void mo53778a() {
        m63447a("ExpandState---handle");
        super.mo53778a();
        this.f69111b.mo53800a("egg");
        mo53796a((Runnable) new C26163a(this));
    }

    public C26162d(C26173f fVar) {
        C52711k.m112240b(fVar, "stateContext");
        super(fVar);
    }
}
