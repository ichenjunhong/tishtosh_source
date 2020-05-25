package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.support.p030v4.view.p042b.C1027f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.chatroom.viewmodule.C6422a.C6428f;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.eg */
public final class C6553eg extends C6422a<LinkPkTaskWidget> {

    /* renamed from: g */
    public final FrameLayout f17884g = ((FrameLayout) mo12567a().findViewById(R.id.dyo));

    /* renamed from: h */
    private final ObjectAnimator f17885h;

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.eg$a */
    public static final class C6554a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C6553eg f17886a;

        C6554a(C6553eg egVar) {
            this.f17886a = egVar;
        }

        public final void onAnimationEnd(Animator animator, boolean z) {
            if (z) {
                FrameLayout frameLayout = this.f17886a.f17884g;
                C52711k.m112236a((Object) frameLayout, "barContainerView");
                frameLayout.setVisibility(8);
            }
        }
    }

    /* renamed from: b */
    public final void mo12572b() {
        this.f17885h.reverse();
    }

    /* renamed from: e */
    public final void mo12575e() {
        this.f17885h.cancel();
    }

    /* renamed from: d */
    public final void mo12574d() {
        LinkPkTaskWidget linkPkTaskWidget = (LinkPkTaskWidget) this.f17696b;
        if (linkPkTaskWidget != null) {
            linkPkTaskWidget.f17249f = this;
        }
    }

    /* renamed from: c */
    public final void mo12573c() {
        this.f17885h.start();
        FrameLayout frameLayout = this.f17884g;
        C52711k.m112236a((Object) frameLayout, "barContainerView");
        frameLayout.setVisibility(0);
    }

    /* renamed from: a */
    public final View mo12568a(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parentView");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bxm, viewGroup, false);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(pare…older, parentView, false)");
        return inflate;
    }

    /* renamed from: a */
    public final void mo12569a(ValueAnimator valueAnimator) {
        C52711k.m112240b(valueAnimator, "animator");
        int[] iArr = new int[2];
        LayoutParams layoutParams = this.f17697c.getLayoutParams();
        if (layoutParams != null) {
            iArr[0] = ((MarginLayoutParams) layoutParams).bottomMargin;
            int i = -this.f17697c.getHeight();
            FrameLayout frameLayout = this.f17884g;
            C52711k.m112236a((Object) frameLayout, "barContainerView");
            iArr[1] = i + frameLayout.getHeight();
            valueAnimator.setIntValues(iArr);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public C6553eg(ViewGroup viewGroup, C6428f fVar) {
        C52711k.m112240b(viewGroup, "parentView");
        C52711k.m112240b(fVar, "stateChangeListener");
        super(viewGroup, R.id.eov, fVar);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f17884g, "alpha", new float[]{0.0f, 1.0f});
        ofFloat.setDuration(300);
        ofFloat.setInterpolator(C1027f.m2954a(0.42f, 0.0f, 0.58f, 1.0f));
        ofFloat.addListener(new C6554a(this));
        this.f17885h = ofFloat;
    }
}
