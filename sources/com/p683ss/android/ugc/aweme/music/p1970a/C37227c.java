package com.p683ss.android.ugc.aweme.music.p1970a;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.detail.C27387k;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52710j;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52762e;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.music.a.c */
public final class C37227c implements C27387k {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f95054a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C37227c.class), "vgSizeAnimationState", "getVgSizeAnimationState()Lcom/ss/android/ugc/aweme/music/animator/DetailRecordButtonScaleInAnimatorImpl$SizeAnimationState;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C37227c.class), "vgMarginAnimationState", "getVgMarginAnimationState()Lcom/ss/android/ugc/aweme/music/animator/DetailRecordButtonScaleInAnimatorImpl$IntAnimationState;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C37227c.class), "imgSizeAnimationState", "getImgSizeAnimationState()Lcom/ss/android/ugc/aweme/music/animator/DetailRecordButtonScaleInAnimatorImpl$SizeAnimationState;"))};

    /* renamed from: h */
    public static final C52671b<View, C52682m<C37237g, C37237g, C52860x>> f95055h = C37233e.f95076a;

    /* renamed from: i */
    public static final C52671b<View, C52682m<Integer, Integer, C52860x>> f95056i = C37231d.f95074a;

    /* renamed from: j */
    public static final C37230c f95057j = new C37230c(null);

    /* renamed from: b */
    public final ImageView f95058b;

    /* renamed from: c */
    public final TextView f95059c;

    /* renamed from: d */
    public final C37229b f95060d = new C37229b(0.0f, 1, null);

    /* renamed from: e */
    public final C52762e<Integer> f95061e = new C37242k(this.f95062f.getResources());

    /* renamed from: f */
    public final Context f95062f;

    /* renamed from: g */
    public final ViewGroup f95063g;

    /* renamed from: k */
    private ValueAnimator f95064k;

    /* renamed from: l */
    private final C52668f f95065l = C52732g.m112285a(new C37245n(this));

    /* renamed from: m */
    private final C52668f f95066m = C52732g.m112285a(new C37244m(this));

    /* renamed from: n */
    private final C52668f f95067n = C52732g.m112285a(new C37243l(this));

    /* renamed from: com.ss.android.ugc.aweme.music.a.c$a */
    static class C37228a<T> {

        /* renamed from: a */
        public T f95068a;

        /* renamed from: b */
        public final T f95069b;

        /* renamed from: c */
        public final T f95070c;

        /* renamed from: d */
        public C52682m<? super T, ? super T, C52860x> f95071d;

        /* renamed from: a */
        public final void mo76550a(T t) {
            this.f95071d.invoke(this.f95068a, t);
            this.f95068a = t;
        }

        public C37228a(T t, T t2, C52682m<? super T, ? super T, C52860x> mVar, T t3) {
            C52711k.m112240b(mVar, "onCurrentChanged");
            this.f95069b = t;
            this.f95070c = t2;
            this.f95071d = mVar;
            this.f95068a = t3;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.a.c$b */
    static final class C37229b {

        /* renamed from: a */
        public final List<C52682m<Float, Float, C52860x>> f95072a;

        /* renamed from: b */
        public float f95073b;

        public C37229b() {
            this(0.0f, 1, null);
        }

        private C37229b(float f) {
            this.f95072a = new ArrayList();
            this.f95073b = f;
        }

        /* renamed from: a */
        public final void mo76551a(float f) {
            for (C52682m invoke : this.f95072a) {
                invoke.invoke(Float.valueOf(this.f95073b), Float.valueOf(f));
            }
            this.f95073b = f;
        }

        public /* synthetic */ C37229b(float f, int i, C52707g gVar) {
            this(0.0f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.a.c$c */
    static final class C37230c {
        private C37230c() {
        }

        /* renamed from: a */
        public static C52671b<View, C52682m<C37237g, C37237g, C52860x>> m83506a() {
            return C37227c.f95055h;
        }

        public /* synthetic */ C37230c(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.a.c$d */
    static final class C37231d extends C52712l implements C52671b<View, C52682m<? super Integer, ? super Integer, ? extends C52860x>> {

        /* renamed from: a */
        public static final C37231d f95074a = new C37231d();

        C37231d() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            final View view = (View) obj;
            C52711k.m112240b(view, "view");
            return new C52682m<Integer, Integer, C52860x>() {
                public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                    ((Number) obj).intValue();
                    int intValue = ((Number) obj2).intValue();
                    View view = view;
                    LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams != null) {
                        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                        marginLayoutParams.bottomMargin = intValue;
                        view.setLayoutParams(marginLayoutParams);
                        return C52860x.f131107a;
                    }
                    throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.a.c$e */
    static final class C37233e extends C52712l implements C52671b<View, C52682m<? super C37237g, ? super C37237g, ? extends C52860x>> {

        /* renamed from: a */
        public static final C37233e f95076a = new C37233e();

        C37233e() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            final View view = (View) obj;
            C52711k.m112240b(view, "view");
            return new C52682m<C37237g, C37237g, C52860x>() {
                public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                    C37237g gVar = (C37237g) obj2;
                    C52711k.m112240b((C37237g) obj, "before");
                    C52711k.m112240b(gVar, "after");
                    View view = view;
                    LayoutParams layoutParams = view.getLayoutParams();
                    layoutParams.width = gVar.f95079a;
                    layoutParams.height = gVar.f95080b;
                    view.setLayoutParams(layoutParams);
                    return C52860x.f131107a;
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.a.c$f */
    static final class C37235f extends C37228a<Integer> {
        public C37235f(int i, int i2, C52682m<? super Integer, ? super Integer, C52860x> mVar, C37229b bVar) {
            C52711k.m112240b(mVar, "onCurrentChanged");
            C52711k.m112240b(bVar, "tracker");
            super(Integer.valueOf(i), Integer.valueOf(i2), mVar, Integer.valueOf(i));
            bVar.f95072a.add(new C52682m<Float, Float, C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C37235f f95078a;

                {
                    this.f95078a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                    ((Number) obj).floatValue();
                    this.f95078a.mo76550a(Integer.valueOf(((int) (((float) (((Number) this.f95078a.f95070c).intValue() - ((Number) this.f95078a.f95069b).intValue())) * ((Number) obj2).floatValue())) + ((Number) this.f95078a.f95069b).intValue()));
                    return C52860x.f131107a;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.a.c$g */
    static final class C37237g {

        /* renamed from: a */
        public final int f95079a;

        /* renamed from: b */
        public final int f95080b;

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C37237g) {
                    C37237g gVar = (C37237g) obj;
                    if (this.f95079a == gVar.f95079a) {
                        if (this.f95080b == gVar.f95080b) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (this.f95079a * 31) + this.f95080b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Size(width=");
            sb.append(this.f95079a);
            sb.append(", height=");
            sb.append(this.f95080b);
            sb.append(")");
            return sb.toString();
        }

        public C37237g(int i, int i2) {
            this.f95079a = i;
            this.f95080b = i2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.a.c$h */
    static final class C37238h extends C37228a<C37237g> {
        public C37238h(C37237g gVar, C37237g gVar2, C52682m<? super C37237g, ? super C37237g, C52860x> mVar, C37229b bVar) {
            C52711k.m112240b(gVar, "begin");
            C52711k.m112240b(gVar2, "end");
            C52711k.m112240b(mVar, "onCurrentChanged");
            C52711k.m112240b(bVar, "tracker");
            super(gVar, gVar2, mVar, gVar);
            bVar.f95072a.add(new C52682m<Float, Float, C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C37238h f95081a;

                {
                    this.f95081a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                    ((Number) obj).floatValue();
                    float floatValue = ((Number) obj2).floatValue();
                    C37238h hVar = this.f95081a;
                    C37237g gVar = (C37237g) this.f95081a.f95070c;
                    C37237g gVar2 = (C37237g) this.f95081a.f95069b;
                    C52711k.m112240b(gVar2, "decrement");
                    C37237g gVar3 = new C37237g(gVar.f95079a - gVar2.f95079a, gVar.f95080b - gVar2.f95080b);
                    C37237g gVar4 = new C37237g((int) (((float) gVar3.f95079a) * floatValue), (int) (((float) gVar3.f95080b) * floatValue));
                    C37237g gVar5 = (C37237g) this.f95081a.f95069b;
                    C52711k.m112240b(gVar5, "increment");
                    hVar.mo76550a(new C37237g(gVar4.f95079a + gVar5.f95079a, gVar4.f95080b + gVar5.f95080b));
                    return C52860x.f131107a;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.a.c$i */
    static final class C37240i implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C37227c f95082a;

        /* renamed from: b */
        final /* synthetic */ C52670a f95083b;

        /* renamed from: c */
        final /* synthetic */ float f95084c;

        C37240i(C37227c cVar, C52670a aVar, float f) {
            this.f95082a = cVar;
            this.f95083b = aVar;
            this.f95084c = f;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C37229b bVar = this.f95082a.f95060d;
            C52711k.m112236a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                bVar.mo76551a(((Float) animatedValue).floatValue());
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.a.c$j */
    public static final class C37241j implements AnimatorListener {

        /* renamed from: a */
        public TruncateAt f95085a = TruncateAt.END;

        /* renamed from: b */
        final /* synthetic */ ValueAnimator f95086b;

        /* renamed from: c */
        final /* synthetic */ C37227c f95087c;

        /* renamed from: d */
        final /* synthetic */ C52670a f95088d;

        /* renamed from: e */
        final /* synthetic */ float f95089e;

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationCancel(Animator animator) {
            this.f95087c.f95059c.setEllipsize(this.f95085a);
            this.f95086b.removeAllUpdateListeners();
            this.f95086b.removeListener(this);
            this.f95088d.invoke();
        }

        public final void onAnimationStart(Animator animator) {
            TruncateAt ellipsize = this.f95087c.f95059c.getEllipsize();
            C52711k.m112236a((Object) ellipsize, "recordTitleView.ellipsize");
            this.f95085a = ellipsize;
            this.f95087c.f95059c.setEllipsize(TruncateAt.MARQUEE);
        }

        public final void onAnimationEnd(Animator animator) {
            this.f95087c.f95059c.setEllipsize(this.f95085a);
            this.f95086b.removeAllUpdateListeners();
            this.f95086b.removeListener(this);
            this.f95087c.f95060d.mo76551a(this.f95089e);
            this.f95088d.invoke();
        }

        C37241j(ValueAnimator valueAnimator, C37227c cVar, C52670a aVar, float f) {
            this.f95086b = valueAnimator;
            this.f95087c = cVar;
            this.f95088d = aVar;
            this.f95089e = f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.a.c$k */
    static final /* synthetic */ class C37242k extends C52710j implements C52671b<Integer, Integer> {
        C37242k(Resources resources) {
            super(1, resources);
        }

        public final String getName() {
            return "getDimensionPixelSize";
        }

        public final C52761d getOwner() {
            return C52728w.m112245a(Resources.class);
        }

        public final String getSignature() {
            return "getDimensionPixelSize(I)I";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Integer.valueOf(((Resources) this.receiver).getDimensionPixelSize(((Number) obj).intValue()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.a.c$l */
    static final class C37243l extends C52712l implements C52670a<C37238h> {

        /* renamed from: a */
        final /* synthetic */ C37227c f95090a;

        C37243l(C37227c cVar) {
            this.f95090a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C37238h(new C37237g(this.f95090a.f95058b.getMeasuredWidth(), this.f95090a.f95058b.getMeasuredHeight()), new C37237g(((Number) ((C52671b) this.f95090a.f95061e).invoke(Integer.valueOf(R.dimen.a0a))).intValue(), ((Number) ((C52671b) this.f95090a.f95061e).invoke(Integer.valueOf(R.dimen.a0a))).intValue()), (C52682m) C37230c.m83506a().invoke(this.f95090a.f95058b), this.f95090a.f95060d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.a.c$m */
    static final class C37244m extends C52712l implements C52670a<C37235f> {

        /* renamed from: a */
        final /* synthetic */ C37227c f95091a;

        C37244m(C37227c cVar) {
            this.f95091a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            LayoutParams layoutParams = this.f95091a.f95063g.getLayoutParams();
            if (layoutParams != null) {
                return new C37235f(((MarginLayoutParams) layoutParams).bottomMargin, ((Number) ((C52671b) this.f95091a.f95061e).invoke(Integer.valueOf(R.dimen.a0d))).intValue(), (C52682m) C37227c.f95056i.invoke(this.f95091a.f95063g), this.f95091a.f95060d);
            }
            throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.a.c$n */
    static final class C37245n extends C52712l implements C52670a<C37238h> {

        /* renamed from: a */
        final /* synthetic */ C37227c f95092a;

        C37245n(C37227c cVar) {
            this.f95092a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C37238h(new C37237g(this.f95092a.f95063g.getMeasuredWidth(), this.f95092a.f95063g.getMeasuredHeight()), new C37237g(((Number) ((C52671b) this.f95092a.f95061e).invoke(Integer.valueOf(R.dimen.a0e))).intValue(), ((Number) ((C52671b) this.f95092a.f95061e).invoke(Integer.valueOf(R.dimen.a0c))).intValue()), (C52682m) C37230c.m83506a().invoke(this.f95092a.f95063g), this.f95092a.f95060d);
        }
    }

    /* renamed from: a */
    public final void mo55759a(C52670a<C52860x> aVar) {
        C52711k.m112240b(aVar, "callback");
        m83500a(1.0f, aVar);
    }

    /* renamed from: c */
    public final void mo55863c(C52670a<C52860x> aVar) {
        C52711k.m112240b(aVar, "callback");
        m83500a(0.0f, aVar);
    }

    /* renamed from: b */
    public final void mo55760b(C52670a<C52860x> aVar) {
        C52711k.m112240b(aVar, "callback");
        ValueAnimator valueAnimator = this.f95064k;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.pause();
        }
        aVar.invoke();
    }

    public C37227c(Context context, ViewGroup viewGroup) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(viewGroup, "viewGroup");
        this.f95062f = context;
        this.f95063g = viewGroup;
        View findViewById = this.f95063g.findViewById(R.id.csg);
        C52711k.m112236a((Object) findViewById, "this.viewGroup.findViewB…d.start_record_video_img)");
        this.f95058b = (ImageView) findViewById;
        View findViewById2 = this.f95063g.findViewById(R.id.csf);
        C52711k.m112236a((Object) findViewById2, "this.viewGroup.findViewB…(R.id.start_record_title)");
        this.f95059c = (TextView) findViewById2;
    }

    /* renamed from: a */
    private final void m83500a(float f, C52670a<C52860x> aVar) {
        float f2 = this.f95060d.f95073b;
        if (f2 != f) {
            ValueAnimator valueAnimator = this.f95064k;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                C37238h hVar = (C37238h) this.f95065l.getValue();
                C37238h hVar2 = (C37238h) this.f95067n.getValue();
                C37235f fVar = (C37235f) this.f95066m.getValue();
                this.f95064k = ValueAnimator.ofFloat(new float[]{f2, f});
                ValueAnimator valueAnimator2 = this.f95064k;
                if (valueAnimator2 != null) {
                    valueAnimator2.setRepeatCount(0);
                    valueAnimator2.setDuration(300);
                    valueAnimator2.setStartDelay(300);
                    valueAnimator2.setInterpolator(new AccelerateDecelerateInterpolator());
                    valueAnimator2.addUpdateListener(new C37240i(this, aVar, f));
                    valueAnimator2.addListener(new C37241j(valueAnimator2, this, aVar, f));
                    if (valueAnimator2 != null) {
                        valueAnimator2.start();
                    }
                }
            }
        }
    }
}
