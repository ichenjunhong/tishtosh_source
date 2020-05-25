package com.p683ss.android.ugc.aweme.music.p1970a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import com.p683ss.android.ugc.aweme.detail.C27387k;
import com.ss.android.ugc.trill.R;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.music.a.d */
public final class C37246d implements C27387k {

    /* renamed from: a */
    public final View f95093a;

    /* renamed from: b */
    public final Context f95094b;

    /* renamed from: c */
    public final ViewGroup f95095c;

    /* renamed from: com.ss.android.ugc.aweme.music.a.d$a */
    public static final class C37247a implements AnimationListener {

        /* renamed from: a */
        final /* synthetic */ C37246d f95096a;

        /* renamed from: b */
        final /* synthetic */ C52670a f95097b;

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
        }

        public final void onAnimationEnd(Animation animation) {
            this.f95096a.f95093a.setVisibility(8);
            this.f95097b.invoke();
        }

        C37247a(C37246d dVar, C52670a aVar) {
            this.f95096a = dVar;
            this.f95097b = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.a.d$b */
    public static final class C37248b implements AnimationListener {

        /* renamed from: a */
        final /* synthetic */ C52670a f95098a;

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
        }

        C37248b(C52670a aVar) {
            this.f95098a = aVar;
        }

        public final void onAnimationEnd(Animation animation) {
            this.f95098a.invoke();
        }
    }

    /* renamed from: b */
    public final void mo55760b(C52670a<C52860x> aVar) {
        C52711k.m112240b(aVar, "callback");
        this.f95093a.clearAnimation();
        this.f95093a.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo55759a(C52670a<C52860x> aVar) {
        C52711k.m112240b(aVar, "callback");
        if (this.f95093a.getAnimation() != null) {
            this.f95093a.clearAnimation();
        }
        this.f95093a.setVisibility(0);
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f95094b, R.anim.fj);
        loadAnimation.setAnimationListener(new C37248b(aVar));
        this.f95093a.startAnimation(loadAnimation);
    }

    /* renamed from: c */
    public final void mo55863c(C52670a<C52860x> aVar) {
        C52711k.m112240b(aVar, "callback");
        if (this.f95093a.getAnimation() != null) {
            this.f95093a.clearAnimation();
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f95094b, R.anim.fk);
        loadAnimation.setAnimationListener(new C37247a(this, aVar));
        this.f95093a.startAnimation(loadAnimation);
    }

    public C37246d(Context context, ViewGroup viewGroup) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(viewGroup, "viewGroup");
        this.f95094b = context;
        this.f95095c = viewGroup;
        View findViewById = this.f95095c.findViewById(R.id.cse);
        C52711k.m112236a((Object) findViewById, "this.viewGroup.findViewB…id.start_record_out_ring)");
        this.f95093a = findViewById;
    }
}
