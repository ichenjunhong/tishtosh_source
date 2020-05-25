package com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.p1737a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ttve.utils.C20141b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.C31051a;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.C31080f;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.C31083i;
import com.p683ss.android.ugc.aweme.shortvideo.C42422am;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.a */
public final class C31052a extends C31068i {

    /* renamed from: d */
    public static final C31053a f81302d = new C31053a(null);

    /* renamed from: i */
    private static final int f81303i = ((int) C20141b.m49696a(C11010c.m22280a(), 8.0f));

    /* renamed from: j */
    private static final C42422am f81304j = new C42422am(0.25f, 0.1f, 0.25f, 1.0f);

    /* renamed from: a */
    public ViewGroup f81305a;

    /* renamed from: b */
    public ViewGroup f81306b;

    /* renamed from: c */
    public final C31051a f81307c;

    /* renamed from: g */
    private C31083i f81308g;

    /* renamed from: h */
    private AnimatorSet f81309h;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.a$a */
    public static final class C31053a {
        private C31053a() {
        }

        public /* synthetic */ C31053a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.a$b */
    static final class C31054b implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C31052a f81310a;

        C31054b(C31052a aVar) {
            this.f81310a = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C52711k.m112236a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                ViewGroup viewGroup = this.f81310a.f81305a;
                if (viewGroup != null) {
                    viewGroup.setAlpha(floatValue);
                }
                if (floatValue > 0.0f) {
                    ViewGroup viewGroup2 = this.f81310a.f81305a;
                    if (viewGroup2 != null) {
                        viewGroup2.setVisibility(0);
                        return;
                    }
                }
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.a$c */
    static final class C31055c implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C31052a f81311a;

        C31055c(C31052a aVar) {
            this.f81311a = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C52711k.m112236a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                ViewGroup viewGroup = this.f81311a.f81306b;
                if (viewGroup != null) {
                    viewGroup.setAlpha(floatValue);
                }
                if (floatValue <= 0.0f) {
                    ViewGroup viewGroup2 = this.f81311a.f81306b;
                    if (viewGroup2 != null) {
                        viewGroup2.setVisibility(4);
                        return;
                    }
                }
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.a$d */
    static final class C31056d implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C31052a f81312a;

        C31056d(C31052a aVar) {
            this.f81312a = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C52711k.m112236a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                int intValue = ((Integer) animatedValue).intValue();
                ViewGroup viewGroup = this.f81312a.f81305a;
                if (viewGroup != null) {
                    viewGroup.setScrollX(intValue);
                    return;
                }
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.a$e */
    static final class C31057e implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C31052a f81313a;

        C31057e(C31052a aVar) {
            this.f81313a = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C52711k.m112236a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                int intValue = ((Integer) animatedValue).intValue();
                ViewGroup viewGroup = this.f81313a.f81306b;
                if (viewGroup != null) {
                    viewGroup.setScrollX(intValue);
                    return;
                }
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.a$f */
    static final class C31058f implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C31052a f81314a;

        C31058f(C31052a aVar) {
            this.f81314a = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C52711k.m112236a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                int intValue = ((Integer) animatedValue).intValue();
                ViewGroup viewGroup = this.f81314a.f81306b;
                if (viewGroup != null) {
                    LayoutParams layoutParams = viewGroup.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = intValue;
                    }
                }
                ViewGroup viewGroup2 = this.f81314a.f81306b;
                if (viewGroup2 != null) {
                    viewGroup2.requestLayout();
                    return;
                }
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* renamed from: b */
    public final void mo63839b(View view) {
        C52711k.m112240b(view, "v");
        mo63838a(view);
    }

    public C31052a(C31051a aVar) {
        ViewGroup viewGroup;
        C52711k.m112240b(aVar, "actionsManager");
        super(aVar);
        this.f81307c = aVar;
        C31080f fVar = this.f81307c.f81297a;
        if (fVar != null) {
            this.f81308g = (C31083i) fVar;
            C31083i iVar = this.f81308g;
            ViewGroup viewGroup2 = null;
            if (iVar != null) {
                viewGroup = iVar.mo63859b();
            } else {
                viewGroup = null;
            }
            this.f81305a = viewGroup;
            C31083i iVar2 = this.f81308g;
            if (iVar2 != null) {
                viewGroup2 = iVar2.mo63858a();
            }
            this.f81306b = viewGroup2;
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.ui.masklayer2.OptionsDialog");
    }

    /* renamed from: a */
    public final void mo63838a(View view) {
        C52711k.m112240b(view, "v");
        AnimatorSet animatorSet = this.f81309h;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        C52711k.m112236a((Object) ofFloat, "ValueAnimator.ofFloat(0f, 1f)");
        ofFloat.setDuration(300);
        ofFloat.addUpdateListener(new C31054b(this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        C52711k.m112236a((Object) ofFloat2, "ValueAnimator.ofFloat(1f, 0f)");
        ofFloat2.setDuration(200);
        ofFloat2.addUpdateListener(new C31055c(this));
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{f81303i, 0});
        C52711k.m112236a((Object) ofInt, "ValueAnimator.ofInt(XOFFSET, 0)");
        ofInt.setDuration(300);
        ofInt.addUpdateListener(new C31056d(this));
        ValueAnimator ofInt2 = ValueAnimator.ofInt(new int[]{0, -f81303i});
        C52711k.m112236a((Object) ofInt2, "ValueAnimator.ofInt(0, -XOFFSET)");
        ofInt2.setDuration(300);
        ofInt2.addUpdateListener(new C31057e(this));
        int[] iArr = new int[2];
        ViewGroup viewGroup = this.f81306b;
        if (viewGroup == null) {
            C52711k.m112234a();
        }
        iArr[0] = viewGroup.getMeasuredHeight();
        ViewGroup viewGroup2 = this.f81305a;
        if (viewGroup2 == null) {
            C52711k.m112234a();
        }
        iArr[1] = viewGroup2.getMeasuredHeight();
        ValueAnimator ofInt3 = ValueAnimator.ofInt(iArr);
        C52711k.m112236a((Object) ofInt3, "ValueAnimator.ofInt(mSec…onsView!!.measuredHeight)");
        ofInt3.setDuration(300);
        ofInt3.addUpdateListener(new C31058f(this));
        this.f81309h = new AnimatorSet();
        AnimatorSet animatorSet2 = this.f81309h;
        if (animatorSet2 != null) {
            animatorSet2.setInterpolator(f81304j);
            animatorSet2.playTogether(new Animator[]{ofFloat, ofFloat2, ofInt, ofInt2, ofInt3});
            animatorSet2.start();
        }
        C26890h.m65011a("block_videos_click_back", C23089d.m56640a().mo47829a("click_method", "button").mo47829a("enter_from", this.f81307c.f81299c).mo47829a("enter_method", "long_press").f61491a);
    }
}
