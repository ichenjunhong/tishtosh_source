package com.p683ss.android.ugc.aweme.pendant;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.pendant.setting.ShredConfiguration;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52722v.C52724b;

/* renamed from: com.ss.android.ugc.aweme.pendant.a */
public abstract class C38571a implements C38632o {

    /* renamed from: o */
    public static final C38575d f98082o = new C38575d(null);

    /* renamed from: a */
    public final float f98083a = C9432q.m18687b(this.f98091i, 10.0f);

    /* renamed from: b */
    public final boolean f98084b = this.f98096n.f98194a;

    /* renamed from: c */
    public boolean f98085c;

    /* renamed from: d */
    public boolean f98086d;

    /* renamed from: e */
    public boolean f98087e;

    /* renamed from: f */
    AnimatorSet f98088f;

    /* renamed from: g */
    public boolean f98089g;

    /* renamed from: h */
    public boolean f98090h;

    /* renamed from: i */
    public final Context f98091i;

    /* renamed from: j */
    public final View f98092j;

    /* renamed from: k */
    public final View f98093k;

    /* renamed from: l */
    public final View f98094l;

    /* renamed from: m */
    public final View f98095m;

    /* renamed from: n */
    public final C38609g f98096n;

    /* renamed from: p */
    private final float f98097p = C9432q.m18687b(this.f98091i, 90.0f);

    /* renamed from: q */
    private final float f98098q = C9432q.m18687b(this.f98091i, 36.0f);

    /* renamed from: com.ss.android.ugc.aweme.pendant.a$a */
    static final class C38572a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C52670a f98099a;

        /* renamed from: b */
        final /* synthetic */ C38571a f98100b;

        C38572a(C52670a aVar, C38571a aVar2) {
            this.f98099a = aVar;
            this.f98100b = aVar2;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f98099a.invoke();
            this.f98100b.mo78503d();
            this.f98100b.f98085c = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.a$b */
    static final class C38573b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C52670a f98101a;

        C38573b(C52670a aVar) {
            this.f98101a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f98101a.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.a$c */
    static final class C38574c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C52670a f98102a;

        C38574c(C52670a aVar) {
            this.f98102a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f98102a.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.a$d */
    public static final class C38575d {
        private C38575d() {
        }

        public /* synthetic */ C38575d(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.a$e */
    public static final class C38576e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C38571a f98103a;

        C38576e(C38571a aVar) {
            this.f98103a = aVar;
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f98103a.mo78497a(false);
        }

        public final void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f98103a.mo78497a(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.a$f */
    static final class C38577f implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C38571a f98104a;

        /* renamed from: b */
        final /* synthetic */ C52724b f98105b;

        /* renamed from: c */
        final /* synthetic */ C52724b f98106c;

        C38577f(C38571a aVar, C52724b bVar, C52724b bVar2) {
            this.f98104a = aVar;
            this.f98105b = bVar;
            this.f98106c = bVar2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f98104a.f98092j;
            float f = this.f98105b.element;
            float f2 = this.f98106c.element;
            C52711k.m112236a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                view.setTranslationX(f + (f2 * ((Float) animatedValue).floatValue()));
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.a$g */
    public static final class C38578g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C38571a f98107a;

        /* renamed from: b */
        final /* synthetic */ boolean f98108b;

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f98108b) {
                this.f98107a.mo78504e();
            }
        }

        public final void onAnimationStart(Animator animator) {
            if (!this.f98108b) {
                this.f98107a.f98093k.setVisibility(8);
                this.f98107a.f98094l.setVisibility(0);
                if (this.f98107a.f98094l instanceof LottieAnimationView) {
                    ((LottieAnimationView) this.f98107a.f98094l).mo6654b();
                }
                this.f98107a.mo78504e();
            }
        }

        C38578g(C38571a aVar, boolean z) {
            this.f98107a = aVar;
            this.f98108b = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.a$h */
    static final class C38579h implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C38571a f98109a;

        /* renamed from: b */
        final /* synthetic */ C52724b f98110b;

        /* renamed from: c */
        final /* synthetic */ C52724b f98111c;

        C38579h(C38571a aVar, C52724b bVar, C52724b bVar2) {
            this.f98109a = aVar;
            this.f98110b = bVar;
            this.f98111c = bVar2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f98109a.f98092j;
            float f = this.f98110b.element;
            C52711k.m112236a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                view.setTranslationX(f - (((Float) animatedValue).floatValue() * this.f98111c.element));
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.a$i */
    public static final class C38580i extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C38571a f98112a;

        /* renamed from: b */
        final /* synthetic */ boolean f98113b;

        public final void onAnimationStart(Animator animator) {
            if (this.f98113b) {
                this.f98112a.f98093k.setVisibility(0);
                this.f98112a.f98094l.setVisibility(8);
            }
        }

        C38580i(C38571a aVar, boolean z) {
            this.f98112a = aVar;
            this.f98113b = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.a$j */
    static final class C38581j implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C38571a f98114a;

        /* renamed from: b */
        final /* synthetic */ float f98115b;

        C38581j(C38571a aVar, float f) {
            this.f98114a = aVar;
            this.f98115b = f;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f98114a.f98092j;
            float f = this.f98115b;
            C52711k.m112236a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                view.setTranslationX(f + (((Float) animatedValue).floatValue() * this.f98114a.f98083a));
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.a$k */
    public static final class C38582k extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C38571a f98116a;

        /* renamed from: b */
        final /* synthetic */ boolean f98117b;

        public final void onAnimationEnd(Animator animator) {
            C52711k.m112240b(animator, "animation");
            if (!this.f98117b && !this.f98116a.f98084b) {
                this.f98116a.f98095m.setVisibility(4);
            }
        }

        public final void onAnimationStart(Animator animator) {
            C52711k.m112240b(animator, "animation");
            if (this.f98117b) {
                this.f98116a.f98095m.setVisibility(0);
            }
        }

        C38582k(C38571a aVar, boolean z) {
            this.f98116a = aVar;
            this.f98117b = z;
        }
    }

    /* renamed from: e */
    public abstract void mo78504e();

    /* renamed from: a */
    protected static boolean m85892a() {
        return ShredConfiguration.getShredConfiguration().getTwinkleEnabled();
    }

    /* renamed from: b */
    public void mo78499b() {
        if (!this.f98085c && this.f98089g) {
            this.f98092j.setVisibility(0);
        }
    }

    /* renamed from: c */
    public void mo78501c() {
        C26890h.m65011a("fragment_show", C23089d.m56640a().f61491a);
    }

    /* renamed from: d */
    public final void mo78503d() {
        this.f98092j.setVisibility(8);
        if (this.f98087e) {
            mo78504e();
        }
    }

    /* renamed from: f */
    public final void mo78505f() {
        if (this.f98089g && !this.f98086d) {
            if (this.f98084b) {
                this.f98095m.setVisibility(0);
            } else {
                this.f98095m.setVisibility(4);
            }
            this.f98086d = true;
            this.f98088f = new AnimatorSet();
            AnimatorSet animatorSet = this.f98088f;
            if (animatorSet != null) {
                animatorSet.playSequentially(new Animator[]{mo78500c(false), mo78502d(false), mo78498b(false)});
                animatorSet.addListener(new C38576e(this));
                animatorSet.start();
            }
        }
    }

    /* renamed from: a */
    public final void mo78497a(boolean z) {
        if (this.f98090h && !z) {
            C52670a<C52860x> aVar = this.f98096n.f98200g;
            if (aVar != null) {
                aVar.invoke();
            }
        }
        this.f98090h = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final ValueAnimator mo78502d(boolean z) {
        float f;
        ValueAnimator valueAnimator;
        C52724b bVar = new C52724b();
        if (z) {
            f = -this.f98097p;
        } else {
            f = this.f98092j.getTranslationX();
        }
        bVar.element = f;
        C52724b bVar2 = new C52724b();
        bVar2.element = this.f98083a + this.f98097p;
        if (z) {
            valueAnimator = ValueAnimator.ofFloat(new float[]{0.0f, -1.0f});
        } else {
            valueAnimator = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        }
        valueAnimator.addUpdateListener(new C38579h(this, bVar, bVar2));
        valueAnimator.addListener(new C38580i(this, z));
        C52711k.m112236a((Object) valueAnimator, "valueAnimator");
        valueAnimator.setDuration(300);
        return valueAnimator;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final Animator mo78498b(boolean z) {
        ValueAnimator valueAnimator;
        float f;
        ObjectAnimator objectAnimator;
        AnimatorSet animatorSet = new AnimatorSet();
        if (z) {
            valueAnimator = ValueAnimator.ofFloat(new float[]{0.0f, -1.0f});
        } else {
            valueAnimator = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        }
        C52724b bVar = new C52724b();
        if (z) {
            f = 0.0f;
        } else {
            f = -this.f98098q;
        }
        bVar.element = f;
        C52724b bVar2 = new C52724b();
        bVar2.element = this.f98098q;
        valueAnimator.addListener(new C38578g(this, z));
        valueAnimator.addUpdateListener(new C38577f(this, bVar, bVar2));
        C52711k.m112236a((Object) valueAnimator, "valueAnimator");
        valueAnimator.setDuration(200);
        if (z) {
            objectAnimator = ObjectAnimator.ofFloat(this.f98095m, "alpha", new float[]{1.0f, 0.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(this.f98095m, "alpha", new float[]{0.0f, 1.0f});
        }
        C52711k.m112236a((Object) objectAnimator, "closeBtnAnimator");
        objectAnimator.setDuration(150);
        if (z) {
            animatorSet.playSequentially(new Animator[]{objectAnimator, valueAnimator});
        } else {
            animatorSet.playSequentially(new Animator[]{valueAnimator, objectAnimator});
        }
        return animatorSet;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final Animator mo78500c(boolean z) {
        float f;
        ValueAnimator valueAnimator;
        ObjectAnimator objectAnimator;
        if (z) {
            f = this.f98083a;
        } else {
            f = this.f98092j.getTranslationX();
        }
        if (z) {
            valueAnimator = ValueAnimator.ofFloat(new float[]{0.0f, -1.0f});
        } else {
            valueAnimator = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        }
        valueAnimator.addUpdateListener(new C38581j(this, f));
        C52711k.m112236a((Object) valueAnimator, "valueAnimator");
        valueAnimator.setDuration(150);
        AnimatorSet animatorSet = new AnimatorSet();
        if (z) {
            objectAnimator = ObjectAnimator.ofFloat(this.f98095m, "alpha", new float[]{0.0f, 1.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(this.f98095m, "alpha", new float[]{1.0f, 0.0f});
        }
        C52711k.m112236a((Object) objectAnimator, "closeBtnAnimator");
        objectAnimator.setDuration(150);
        objectAnimator.addListener(new C38582k(this, z));
        animatorSet.playTogether(new Animator[]{objectAnimator, valueAnimator});
        return animatorSet;
    }

    public C38571a(Context context, View view, View view2, View view3, View view4, C38609g gVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(view, C42311c.f106865i);
        C52711k.m112240b(view2, "bigView");
        C52711k.m112240b(view3, "smallView");
        C52711k.m112240b(view4, "closeBtn");
        C52711k.m112240b(gVar, "configure");
        this.f98091i = context;
        this.f98092j = view;
        this.f98093k = view2;
        this.f98094l = view3;
        this.f98095m = view4;
        this.f98096n = gVar;
        C52670a<C52860x> aVar = this.f98096n.f98196c;
        if (aVar != null) {
            this.f98093k.setOnClickListener(new C38573b(aVar));
            this.f98094l.setOnClickListener(new C38574c(aVar));
        }
        C52670a<C52860x> aVar2 = this.f98096n.f98197d;
        if (aVar2 != null) {
            this.f98095m.setOnClickListener(new C38572a(aVar2, this));
        }
    }
}
