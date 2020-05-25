package com.p683ss.android.ugc.aweme.pendant;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.lighten.loader.SmartImageView;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.ss.android.ugc.trill.R;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.pendant.q */
public final class C38645q extends FrameLayout implements C38632o {

    /* renamed from: c */
    public static final C38646a f98298c = new C38646a(null);

    /* renamed from: a */
    public C38571a f98299a;

    /* renamed from: b */
    public boolean f98300b;

    /* renamed from: d */
    private final View f98301d;

    /* renamed from: e */
    private final FrameLayout f98302e;

    /* renamed from: f */
    private final SmartImageView f98303f;

    /* renamed from: g */
    private final SmartImageView f98304g;

    /* renamed from: h */
    private final OptimizedLottieAnimationView f98305h;

    /* renamed from: i */
    private final OptimizedLottieAnimationView f98306i;

    /* renamed from: j */
    private final ImageView f98307j;

    /* renamed from: k */
    private final C52670a<C52860x> f98308k;

    /* renamed from: com.ss.android.ugc.aweme.pendant.q$a */
    public static final class C38646a {
        private C38646a() {
        }

        public /* synthetic */ C38646a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.q$b */
    static final class C38647b extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C38645q f98309a;

        C38647b(C38645q qVar) {
            this.f98309a = qVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if (this.f98309a.f98300b) {
                C38571a aVar = this.f98309a.f98299a;
                if (aVar != null) {
                    aVar.mo78501c();
                }
                this.f98309a.f98300b = false;
            }
            return C52860x.f131107a;
        }
    }

    private final boolean getCollapsing() {
        C38571a aVar = this.f98299a;
        if (aVar != null) {
            return aVar.f98090h;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo78555a() {
        C38571a aVar = this.f98299a;
        if (aVar != null) {
            aVar.mo78499b();
        }
    }

    /* renamed from: b */
    public final void mo78556b() {
        C38571a aVar = this.f98299a;
        if (aVar != null) {
            aVar.mo78503d();
        }
    }

    /* renamed from: c */
    public final void mo78557c() {
        C38571a aVar = this.f98299a;
        if (aVar != null) {
            aVar.mo78505f();
        }
    }

    public final boolean getClosed() {
        C38571a aVar = this.f98299a;
        if (aVar != null) {
            return aVar.f98085c;
        }
        return false;
    }

    public final boolean getCollapsed() {
        C38571a aVar = this.f98299a;
        if (aVar != null) {
            return aVar.f98086d;
        }
        return false;
    }

    /* renamed from: d */
    public final void mo78558d() {
        if (getCollapsing()) {
            this.f98300b = true;
            return;
        }
        C38571a aVar = this.f98299a;
        if (aVar != null) {
            aVar.mo78501c();
        }
    }

    /* renamed from: a */
    public final void mo78531a(C38622k kVar) {
        C52711k.m112240b(kVar, "resConfig");
        C38571a aVar = this.f98299a;
        if (aVar != null) {
            aVar.mo78531a(kVar);
        }
    }

    private final void setPendantType(int i) {
        if (i == 2) {
            OptimizedLottieAnimationView optimizedLottieAnimationView = this.f98305h;
            C52711k.m112236a((Object) optimizedLottieAnimationView, "bigLottie");
            optimizedLottieAnimationView.setVisibility(0);
            OptimizedLottieAnimationView optimizedLottieAnimationView2 = this.f98306i;
            C52711k.m112236a((Object) optimizedLottieAnimationView2, "smallLottie");
            optimizedLottieAnimationView2.setVisibility(8);
            SmartImageView smartImageView = this.f98304g;
            C52711k.m112236a((Object) smartImageView, "smallImage");
            smartImageView.setVisibility(8);
            SmartImageView smartImageView2 = this.f98303f;
            C52711k.m112236a((Object) smartImageView2, "bigImage");
            smartImageView2.setVisibility(8);
            return;
        }
        SmartImageView smartImageView3 = this.f98303f;
        C52711k.m112236a((Object) smartImageView3, "bigImage");
        smartImageView3.setVisibility(0);
        SmartImageView smartImageView4 = this.f98304g;
        C52711k.m112236a((Object) smartImageView4, "smallImage");
        smartImageView4.setVisibility(8);
        OptimizedLottieAnimationView optimizedLottieAnimationView3 = this.f98305h;
        C52711k.m112236a((Object) optimizedLottieAnimationView3, "bigLottie");
        optimizedLottieAnimationView3.setVisibility(8);
        OptimizedLottieAnimationView optimizedLottieAnimationView4 = this.f98306i;
        C52711k.m112236a((Object) optimizedLottieAnimationView4, "smallLottie");
        optimizedLottieAnimationView4.setVisibility(8);
    }

    private C38645q(int i, C38609g gVar, Context context, AttributeSet attributeSet, int i2) {
        C38571a aVar;
        C52711k.m112240b(gVar, "configure");
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i2);
        this.f98301d = LayoutInflater.from(context).inflate(R.layout.b4q, this, true);
        this.f98302e = (FrameLayout) this.f98301d.findViewById(R.id.bwz);
        this.f98303f = (SmartImageView) this.f98302e.findViewById(R.id.ks);
        this.f98304g = (SmartImageView) this.f98302e.findViewById(R.id.cpj);
        this.f98305h = (OptimizedLottieAnimationView) this.f98302e.findViewById(R.id.dza);
        this.f98306i = (OptimizedLottieAnimationView) this.f98302e.findViewById(R.id.ewc);
        this.f98307j = (ImageView) this.f98302e.findViewById(R.id.ui);
        this.f98308k = new C38647b(this);
        setPendantType(i);
        gVar.f98200g = this.f98308k;
        switch (i) {
            case 0:
                FrameLayout frameLayout = this.f98302e;
                C52711k.m112236a((Object) frameLayout, C42311c.f106865i);
                View view = frameLayout;
                SmartImageView smartImageView = this.f98303f;
                C52711k.m112236a((Object) smartImageView, "bigImage");
                SmartImageView smartImageView2 = this.f98304g;
                C52711k.m112236a((Object) smartImageView2, "smallImage");
                ImageView imageView = this.f98307j;
                C52711k.m112236a((Object) imageView, "closeBtn");
                C38625m mVar = new C38625m(context, view, smartImageView, smartImageView2, imageView, gVar);
                aVar = mVar;
                break;
            case 1:
                FrameLayout frameLayout2 = this.f98302e;
                C52711k.m112236a((Object) frameLayout2, C42311c.f106865i);
                View view2 = frameLayout2;
                SmartImageView smartImageView3 = this.f98303f;
                C52711k.m112236a((Object) smartImageView3, "bigImage");
                SmartImageView smartImageView4 = this.f98304g;
                C52711k.m112236a((Object) smartImageView4, "smallImage");
                ImageView imageView2 = this.f98307j;
                C52711k.m112236a((Object) imageView2, "closeBtn");
                C38648r rVar = new C38648r(context, view2, smartImageView3, smartImageView4, imageView2, gVar);
                aVar = rVar;
                break;
            case 2:
                FrameLayout frameLayout3 = this.f98302e;
                C52711k.m112236a((Object) frameLayout3, C42311c.f106865i);
                View view3 = frameLayout3;
                OptimizedLottieAnimationView optimizedLottieAnimationView = this.f98305h;
                C52711k.m112236a((Object) optimizedLottieAnimationView, "bigLottie");
                LottieAnimationView lottieAnimationView = optimizedLottieAnimationView;
                OptimizedLottieAnimationView optimizedLottieAnimationView2 = this.f98306i;
                C52711k.m112236a((Object) optimizedLottieAnimationView2, "smallLottie");
                LottieAnimationView lottieAnimationView2 = optimizedLottieAnimationView2;
                ImageView imageView3 = this.f98307j;
                C52711k.m112236a((Object) imageView3, "closeBtn");
                C38593e eVar = new C38593e(context, view3, lottieAnimationView, lottieAnimationView2, imageView3, gVar);
                aVar = eVar;
                break;
            default:
                aVar = null;
                break;
        }
        this.f98299a = aVar;
    }

    public /* synthetic */ C38645q(int i, C38609g gVar, Context context, AttributeSet attributeSet, int i2, int i3, C52707g gVar2) {
        this(i, gVar, context, null, 0);
    }
}
