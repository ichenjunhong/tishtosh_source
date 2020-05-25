package com.p683ss.android.ugc.aweme.commercialize.egg.impl.p1563b;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import com.p683ss.android.ugc.aweme.base.p1420ui.AnimationImageView;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.b.e */
public final class C25812e extends C25797a {

    /* renamed from: h */
    public static final C25813a f68251h = new C25813a(null);

    /* renamed from: i */
    private AnimationImageView f68252i;

    /* renamed from: j */
    private AnimationImageView f68253j;

    /* renamed from: k */
    private long f68254k;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.b.e$a */
    public static final class C25813a {
        private C25813a() {
        }

        public /* synthetic */ C25813a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.b.e$b */
    public static final class C25814b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ AnimationImageView f68255a;

        C25814b(AnimationImageView animationImageView) {
            this.f68255a = animationImageView;
        }

        public final void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            this.f68255a.setLayerType(0, null);
            this.f68255a.setVisibility(8);
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f68255a.setLayerType(0, null);
            this.f68255a.setVisibility(8);
        }
    }

    /* renamed from: b */
    public final void mo53004b() {
        AnimationImageView animationImageView = this.f68252i;
        if (animationImageView != null) {
            animationImageView.setVisibility(8);
        }
        AnimationImageView animationImageView2 = this.f68253j;
        if (animationImageView2 != null) {
            animationImageView2.setVisibility(8);
        }
        AnimationImageView animationImageView3 = this.f68252i;
        if (animationImageView3 != null) {
            this.f68226g.removeView(animationImageView3);
            animationImageView3.mo6661f();
        }
        AnimationImageView animationImageView4 = this.f68253j;
        if (animationImageView4 != null) {
            this.f68226g.removeView(animationImageView4);
            animationImageView4.mo6661f();
        }
        this.f68223d = null;
        this.f68252i = null;
        this.f68253j = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0010  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo53002a() {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.commercialize.egg.e.a r0 = r8.f68222c
            r1 = 0
            if (r0 == 0) goto L_0x000c
            com.ss.android.ugc.aweme.commercialize.egg.e.c r0 = r0.f68163k
            if (r0 == 0) goto L_0x000c
            com.airbnb.lottie.e r0 = r0.f68183a
            goto L_0x000d
        L_0x000c:
            r0 = r1
        L_0x000d:
            r2 = 1
            if (r0 == 0) goto L_0x00c5
            android.content.Context r3 = r8.f68221b
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r4 = r8.f68252i
            if (r4 != 0) goto L_0x0025
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r4 = m62452a(r3)
            r8.f68252i = r4
            android.widget.FrameLayout r4 = r8.f68226g
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r5 = r8.f68252i
            android.view.View r5 = (android.view.View) r5
            r4.addView(r5)
        L_0x0025:
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r4 = r8.f68253j
            if (r4 != 0) goto L_0x0038
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r3 = m62452a(r3)
            r8.f68253j = r3
            android.widget.FrameLayout r3 = r8.f68226g
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r4 = r8.f68253j
            android.view.View r4 = (android.view.View) r4
            r3.addView(r4)
        L_0x0038:
            long r3 = r8.f68254k
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x004d
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r8.f68254k
            long r3 = r3 - r5
            r5 = 800(0x320, double:3.953E-321)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x00cf
        L_0x004d:
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r3 = r8.f68252i
            r4 = 0
            if (r3 == 0) goto L_0x0057
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r3 = r8.f68253j
            if (r3 == 0) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            r2 = 0
        L_0x0058:
            if (r2 == 0) goto L_0x005b
            r1 = r8
        L_0x005b:
            com.ss.android.ugc.aweme.commercialize.egg.impl.b.e r1 = (com.p683ss.android.ugc.aweme.commercialize.egg.impl.p1563b.C25812e) r1
            if (r1 == 0) goto L_0x00c4
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r1 = r8.f68252i
            if (r1 != 0) goto L_0x0066
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0066:
            boolean r1 = r1.mo6660e()
            if (r1 != 0) goto L_0x0092
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r1 = r8.f68252i
            if (r1 == 0) goto L_0x0073
            r1.setVisibility(r4)
        L_0x0073:
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r1 = r8.f68252i
            if (r1 == 0) goto L_0x007a
            r1.setComposition(r0)
        L_0x007a:
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r0 = r8.f68252i
            if (r0 == 0) goto L_0x0081
            r0.mo6654b()
        L_0x0081:
            com.ss.android.ugc.aweme.commercialize.egg.a.d r0 = r8.f68223d
            if (r0 == 0) goto L_0x0088
            r0.mo52942a()
        L_0x0088:
            long r0 = java.lang.System.currentTimeMillis()
            r8.f68254k = r0
            r8.mo53005c()
            goto L_0x00cf
        L_0x0092:
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r1 = r8.f68253j
            if (r1 != 0) goto L_0x0099
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0099:
            boolean r1 = r1.mo6660e()
            if (r1 != 0) goto L_0x00c4
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r1 = r8.f68253j
            if (r1 == 0) goto L_0x00a6
            r1.setVisibility(r4)
        L_0x00a6:
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r1 = r8.f68253j
            if (r1 == 0) goto L_0x00ad
            r1.setComposition(r0)
        L_0x00ad:
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r0 = r8.f68253j
            if (r0 == 0) goto L_0x00b4
            r0.mo6654b()
        L_0x00b4:
            com.ss.android.ugc.aweme.commercialize.egg.a.d r0 = r8.f68223d
            if (r0 == 0) goto L_0x00bb
            r0.mo52942a()
        L_0x00bb:
            long r0 = java.lang.System.currentTimeMillis()
            r8.f68254k = r0
            r8.mo53005c()
        L_0x00c4:
            return
        L_0x00c5:
            com.ss.android.ugc.aweme.commercialize.egg.a.d r0 = r8.f68223d
            if (r0 == 0) goto L_0x00cc
            r0.mo52945b()
        L_0x00cc:
            r8.mo53003a(null)
        L_0x00cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.egg.impl.p1563b.C25812e.mo53002a():void");
    }

    public C25812e(FrameLayout frameLayout) {
        C52711k.m112240b(frameLayout, "eggLayout");
        super(frameLayout);
    }

    /* renamed from: a */
    private static AnimationImageView m62452a(Context context) {
        AnimationImageView animationImageView = new AnimationImageView(context);
        animationImageView.setScaleType(ScaleType.CENTER_CROP);
        animationImageView.setLayoutParams(new LayoutParams(-1, -1));
        animationImageView.mo6652a((AnimatorListener) new C25814b(animationImageView));
        return animationImageView;
    }
}
