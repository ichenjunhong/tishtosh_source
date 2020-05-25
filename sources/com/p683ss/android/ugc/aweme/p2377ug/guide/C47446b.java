package com.p683ss.android.ugc.aweme.p2377ug.guide;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.support.p030v4.view.PagerAdapter;
import android.view.View;
import com.p683ss.android.ugc.aweme.common.widget.BaseVerticalViewPager;
import com.p683ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.ug.guide.b */
public final class C47446b {

    /* renamed from: d */
    public static boolean f119691d = true;

    /* renamed from: e */
    public static final C47447a f119692e = new C47447a(null);

    /* renamed from: a */
    public float f119693a;

    /* renamed from: b */
    public int f119694b;

    /* renamed from: c */
    public final BaseVerticalViewPager f119695c;

    /* renamed from: f */
    private ValueAnimator f119696f;

    /* renamed from: g */
    private final LoadMoreFrameLayout f119697g;

    /* renamed from: com.ss.android.ugc.aweme.ug.guide.b$a */
    public static final class C47447a {
        private C47447a() {
        }

        public /* synthetic */ C47447a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.guide.b$b */
    static final class C47448b implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C47446b f119698a;

        C47448b(C47446b bVar) {
            this.f119698a = bVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (this.f119698a.f119695c.mo55009b()) {
                BaseVerticalViewPager baseVerticalViewPager = this.f119698a.f119695c;
                C52711k.m112236a((Object) valueAnimator, "it");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    baseVerticalViewPager.mo55003a(((float) (((Integer) animatedValue).intValue() - this.f119698a.f119694b)) * this.f119698a.f119693a);
                } else {
                    throw new C52857u("null cannot be cast to non-null type kotlin.Int");
                }
            }
            C47446b bVar = this.f119698a;
            C52711k.m112236a((Object) valueAnimator, "it");
            Object animatedValue2 = valueAnimator.getAnimatedValue();
            if (animatedValue2 != null) {
                bVar.f119694b = ((Integer) animatedValue2).intValue();
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.guide.b$c */
    public static final class C47449c implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C47446b f119699a;

        public final void onAnimationRepeat(Animator animator) {
        }

        C47449c(C47446b bVar) {
            this.f119699a = bVar;
        }

        public final void onAnimationStart(Animator animator) {
            this.f119699a.f119695c.mo55010c();
        }

        public final void onAnimationCancel(Animator animator) {
            if (this.f119699a.f119695c.mo55009b()) {
                this.f119699a.f119695c.mo55014d();
            }
        }

        public final void onAnimationEnd(Animator animator) {
            if (this.f119699a.f119695c.mo55009b()) {
                this.f119699a.f119695c.mo55014d();
            }
            this.f119699a.f119694b = 0;
        }
    }

    /* renamed from: a */
    public final void mo94727a() {
        f119691d = false;
        PagerAdapter adapter = this.f119695c.getAdapter();
        C52711k.m112236a((Object) adapter, "viewPager.adapter");
        if (adapter.getCount() - 1 == this.f119695c.getCurrentItem()) {
            this.f119697g.mo64055g();
            return;
        }
        ValueAnimator valueAnimator = this.f119696f;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            View childAt = this.f119695c.getChildAt(0);
            C52711k.m112236a((Object) childAt, "item");
            this.f119693a = (((float) childAt.getHeight()) * -1.0f) / 100.0f;
            this.f119696f = ValueAnimator.ofInt(new int[]{0, 100});
            ValueAnimator valueAnimator2 = this.f119696f;
            if (valueAnimator2 != null) {
                valueAnimator2.addUpdateListener(new C47448b(this));
            }
            ValueAnimator valueAnimator3 = this.f119696f;
            if (valueAnimator3 != null) {
                valueAnimator3.addListener(new C47449c(this));
            }
            ValueAnimator valueAnimator4 = this.f119696f;
            if (valueAnimator4 != null) {
                valueAnimator4.start();
            }
        }
    }

    public C47446b(BaseVerticalViewPager baseVerticalViewPager, LoadMoreFrameLayout loadMoreFrameLayout) {
        C52711k.m112240b(baseVerticalViewPager, "viewPager");
        C52711k.m112240b(loadMoreFrameLayout, "loadMoreFrameLayout");
        this.f119695c = baseVerticalViewPager;
        this.f119697g = loadMoreFrameLayout;
    }
}
