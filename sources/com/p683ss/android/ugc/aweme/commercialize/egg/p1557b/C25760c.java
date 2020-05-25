package com.p683ss.android.ugc.aweme.commercialize.egg.p1557b;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView.ScaleType;
import com.p683ss.android.ugc.aweme.base.p1420ui.AnimationImageView;
import com.p683ss.android.ugc.aweme.commercialize.egg.CommerceEggLayout;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.b.c */
public final class C25760c extends C25752a {

    /* renamed from: a */
    public static final C25761a f68121a = new C25761a(null);

    /* renamed from: b */
    private AnimationImageView f68122b;

    /* renamed from: c */
    private AnimationImageView f68123c;

    /* renamed from: j */
    private long f68124j;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.b.c$a */
    public static final class C25761a {
        private C25761a() {
        }

        public /* synthetic */ C25761a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.b.c$b */
    public static final class C25762b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ AnimationImageView f68125a;

        C25762b(AnimationImageView animationImageView) {
            this.f68125a = animationImageView;
        }

        public final void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            this.f68125a.setLayerType(0, null);
            this.f68125a.setVisibility(8);
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f68125a.setLayerType(0, null);
            this.f68125a.setVisibility(8);
        }
    }

    /* renamed from: b */
    public final void mo52953b() {
        AnimationImageView animationImageView = this.f68122b;
        if (animationImageView != null) {
            animationImageView.setVisibility(8);
        }
        AnimationImageView animationImageView2 = this.f68123c;
        if (animationImageView2 != null) {
            animationImageView2.setVisibility(8);
        }
        AnimationImageView animationImageView3 = this.f68122b;
        if (animationImageView3 != null) {
            this.f68106i.removeView(animationImageView3);
            animationImageView3.mo6661f();
        }
        AnimationImageView animationImageView4 = this.f68123c;
        if (animationImageView4 != null) {
            this.f68106i.removeView(animationImageView4);
            animationImageView4.mo6661f();
        }
        this.f68122b = null;
        this.f68123c = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x000f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo52951a() {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.commercialize.egg.b r0 = r7.f68102e
            r1 = 0
            if (r0 == 0) goto L_0x000c
            com.ss.android.ugc.aweme.commercialize.egg.f r0 = r0.f68099f
            if (r0 == 0) goto L_0x000c
            com.airbnb.lottie.e r0 = r0.f68188a
            goto L_0x000d
        L_0x000c:
            r0 = r1
        L_0x000d:
            if (r0 == 0) goto L_0x00c5
            android.content.Context r2 = r7.f68101d
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r3 = r7.f68122b
            if (r3 != 0) goto L_0x0024
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r3 = m62358a(r2)
            r7.f68122b = r3
            com.ss.android.ugc.aweme.commercialize.egg.CommerceEggLayout r3 = r7.f68106i
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r4 = r7.f68122b
            android.view.View r4 = (android.view.View) r4
            r3.addView(r4)
        L_0x0024:
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r3 = r7.f68123c
            if (r3 != 0) goto L_0x0037
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r2 = m62358a(r2)
            r7.f68123c = r2
            com.ss.android.ugc.aweme.commercialize.egg.CommerceEggLayout r2 = r7.f68106i
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r3 = r7.f68123c
            android.view.View r3 = (android.view.View) r3
            r2.addView(r3)
        L_0x0037:
            long r2 = r7.f68124j
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x004c
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r7.f68124j
            long r2 = r2 - r4
            r4 = 800(0x320, double:3.953E-321)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x00cf
        L_0x004c:
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r2 = r7.f68122b
            r3 = 0
            if (r2 == 0) goto L_0x0057
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r2 = r7.f68123c
            if (r2 == 0) goto L_0x0057
            r2 = 1
            goto L_0x0058
        L_0x0057:
            r2 = 0
        L_0x0058:
            if (r2 == 0) goto L_0x005b
            r1 = r7
        L_0x005b:
            com.ss.android.ugc.aweme.commercialize.egg.b.c r1 = (com.p683ss.android.ugc.aweme.commercialize.egg.p1557b.C25760c) r1
            if (r1 == 0) goto L_0x00c4
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r1 = r7.f68122b
            if (r1 != 0) goto L_0x0066
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0066:
            boolean r1 = r1.mo6660e()
            if (r1 != 0) goto L_0x0092
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r1 = r7.f68122b
            if (r1 == 0) goto L_0x0073
            r1.setVisibility(r3)
        L_0x0073:
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r1 = r7.f68122b
            if (r1 == 0) goto L_0x007a
            r1.setComposition(r0)
        L_0x007a:
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r0 = r7.f68122b
            if (r0 == 0) goto L_0x0081
            r0.mo6654b()
        L_0x0081:
            com.ss.android.ugc.aweme.commercialize.egg.a.b r0 = r7.f68103f
            if (r0 == 0) goto L_0x0088
            r0.mo52926a()
        L_0x0088:
            long r0 = java.lang.System.currentTimeMillis()
            r7.f68124j = r0
            r7.mo52954c()
            goto L_0x00cf
        L_0x0092:
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r1 = r7.f68123c
            if (r1 != 0) goto L_0x0099
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0099:
            boolean r1 = r1.mo6660e()
            if (r1 != 0) goto L_0x00c4
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r1 = r7.f68123c
            if (r1 == 0) goto L_0x00a6
            r1.setVisibility(r3)
        L_0x00a6:
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r1 = r7.f68123c
            if (r1 == 0) goto L_0x00ad
            r1.setComposition(r0)
        L_0x00ad:
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r0 = r7.f68123c
            if (r0 == 0) goto L_0x00b4
            r0.mo6654b()
        L_0x00b4:
            com.ss.android.ugc.aweme.commercialize.egg.a.b r0 = r7.f68103f
            if (r0 == 0) goto L_0x00bb
            r0.mo52926a()
        L_0x00bb:
            long r0 = java.lang.System.currentTimeMillis()
            r7.f68124j = r0
            r7.mo52954c()
        L_0x00c4:
            return
        L_0x00c5:
            com.ss.android.ugc.aweme.commercialize.egg.a.b r0 = r7.f68103f
            if (r0 == 0) goto L_0x00cc
            r0.mo52930b()
        L_0x00cc:
            r7.mo52952a(r1)
        L_0x00cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.egg.p1557b.C25760c.mo52951a():void");
    }

    public C25760c(CommerceEggLayout commerceEggLayout) {
        C52711k.m112240b(commerceEggLayout, "eggLayout");
        super(commerceEggLayout);
    }

    /* renamed from: a */
    private static AnimationImageView m62358a(Context context) {
        AnimationImageView animationImageView = new AnimationImageView(context);
        animationImageView.setScaleType(ScaleType.CENTER_CROP);
        animationImageView.setLayoutParams(new LayoutParams(-1, -1));
        animationImageView.mo6652a((AnimatorListener) new C25762b(animationImageView));
        return animationImageView;
    }
}
