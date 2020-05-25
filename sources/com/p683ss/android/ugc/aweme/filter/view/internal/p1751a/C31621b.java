package com.p683ss.android.ugc.aweme.filter.view.internal.p1751a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.support.p043v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.jedi.p725a.p728c.C11575f;
import com.p683ss.android.ugc.aweme.filter.C31405ah;
import com.p683ss.android.ugc.aweme.filter.C31406ai;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.filter.C31460h;
import com.p683ss.android.ugc.aweme.filter.EffectCenterLayoutManager;
import com.p683ss.android.ugc.aweme.filter.view.p1750a.C31613h;
import com.p683ss.android.ugc.aweme.filter.view.p1750a.C31616k;
import com.p683ss.android.ugc.aweme.filter.view.p1750a.C31616k.C31617a;
import com.p683ss.android.ugc.aweme.filter.view.p1750a.C31618l;
import com.p683ss.android.ugc.aweme.filter.widget.FilterBeautySeekBar;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.trill.R;
import java.util.List;
import java.util.Map;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p071d.C1707b;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p072e.p074b.C1723a;
import p2628d.C52847n;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.view.internal.a.b */
public final class C31621b implements C31616k {

    /* renamed from: a */
    FilterBeautySeekBar f82622a;

    /* renamed from: b */
    RecyclerView f82623b;

    /* renamed from: c */
    View f82624c;

    /* renamed from: d */
    C31459g f82625d;

    /* renamed from: e */
    float f82626e;

    /* renamed from: f */
    C31459g f82627f;

    /* renamed from: g */
    float f82628g;

    /* renamed from: h */
    final boolean f82629h;

    /* renamed from: i */
    final C52847n<C31406ai, C31405ah> f82630i;

    /* renamed from: j */
    final float f82631j;

    /* renamed from: k */
    private C31613h f82632k;

    /* renamed from: l */
    private C31618l f82633l;

    /* renamed from: m */
    private final C1689b f82634m;

    /* renamed from: n */
    private final C31629h f82635n;

    /* renamed from: o */
    private final ViewGroup f82636o;

    /* renamed from: p */
    private final C1707b<TabLayout, RecyclerView, C31613h> f82637p;

    /* renamed from: q */
    private final int f82638q;

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.a.b$a */
    public static final class C31622a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ View f82639a;

        C31622a(View view) {
            this.f82639a = view;
        }

        public final void onAnimationEnd(Animator animator) {
            C52711k.m112240b(animator, "animation");
            this.f82639a.setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.a.b$b */
    static final class C31623b<T> implements C1710e<C31459g> {

        /* renamed from: a */
        final /* synthetic */ C31621b f82640a;

        C31623b(C31621b bVar) {
            this.f82640a = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C31459g gVar = (C31459g) obj;
            C31621b bVar = this.f82640a;
            C52711k.m112236a((Object) gVar, "it");
            if (!bVar.f82629h) {
                C31459g gVar2 = bVar.f82625d;
                if (gVar2 != null && gVar2.equals(gVar)) {
                    View view = bVar.f82624c;
                    if (view != null) {
                        view.setVisibility(0);
                        ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 1.0f}).setDuration(150).start();
                        FilterBeautySeekBar filterBeautySeekBar = bVar.f82622a;
                        if (filterBeautySeekBar == null) {
                            C52711k.m112237a("seekBar");
                        }
                        filterBeautySeekBar.setProgress(bVar.mo64522a(bVar.f82626e, bVar.f82625d));
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.a.b$c */
    static final class C31624c<T> implements C1710e<C11575f<? extends C31459g>> {

        /* renamed from: a */
        final /* synthetic */ C31621b f82641a;

        C31624c(C31621b bVar) {
            this.f82641a = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            float f;
            C31459g gVar = (C31459g) ((C11575f) obj).mo22313a();
            if (gVar != null) {
                C31621b bVar = this.f82641a;
                bVar.f82625d = gVar;
                C52847n<C31406ai, C31405ah> nVar = bVar.f82630i;
                if (nVar != null) {
                    f = C31460h.m73279a(gVar, (C31405ah) nVar.getSecond(), (C31406ai) nVar.getFirst());
                } else {
                    f = bVar.f82631j;
                }
                bVar.f82626e = f;
                if (bVar.f82629h) {
                    FilterBeautySeekBar filterBeautySeekBar = bVar.f82622a;
                    if (filterBeautySeekBar == null) {
                        C52711k.m112237a("seekBar");
                    }
                    filterBeautySeekBar.setProgress(bVar.mo64522a(bVar.f82626e, bVar.f82625d));
                }
                C52847n<C31406ai, C31405ah> nVar2 = bVar.f82630i;
                if (nVar2 != null) {
                    int a = C31460h.m73280a(gVar, gVar.f82334k, (C31406ai) nVar2.getFirst());
                    if (a == 0 || a == 100) {
                        FilterBeautySeekBar filterBeautySeekBar2 = bVar.f82622a;
                        if (filterBeautySeekBar2 == null) {
                            C52711k.m112237a("seekBar");
                        }
                        filterBeautySeekBar2.setDefaultDotProgress(-1);
                    } else {
                        FilterBeautySeekBar filterBeautySeekBar3 = bVar.f82622a;
                        if (filterBeautySeekBar3 == null) {
                            C52711k.m112237a("seekBar");
                        }
                        filterBeautySeekBar3.setDefaultDotProgress(a);
                    }
                    if (C31460h.m73283b(gVar, (C31406ai) nVar2.getFirst()) == 0.0f) {
                        FilterBeautySeekBar filterBeautySeekBar4 = bVar.f82622a;
                        if (filterBeautySeekBar4 == null) {
                            C52711k.m112237a("seekBar");
                        }
                        filterBeautySeekBar4.setVisibility(8);
                    } else {
                        FilterBeautySeekBar filterBeautySeekBar5 = bVar.f82622a;
                        if (filterBeautySeekBar5 == null) {
                            C52711k.m112237a("seekBar");
                        }
                        filterBeautySeekBar5.setVisibility(0);
                    }
                }
                bVar.mo64524a(C31617a.FILTER_SELECTED_CHANGE);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.a.b$d */
    static final class C31625d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31621b f82642a;

        C31625d(C31621b bVar) {
            this.f82642a = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f82642a.mo64524a(C31617a.FILTER_CONFIRM);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.a.b$e */
    static final class C31626e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31621b f82643a;

        C31626e(C31621b bVar) {
            this.f82643a = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C31621b bVar = this.f82643a;
            RecyclerView recyclerView = bVar.f82623b;
            if (recyclerView == null) {
                C52711k.m112237a("recyclerView");
            }
            recyclerView.mo4848f();
            bVar.mo64524a(C31617a.FILTER_CANCEL);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.a.b$f */
    static final class C31627f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31621b f82644a;

        C31627f(C31621b bVar) {
            this.f82644a = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C31621b bVar = this.f82644a;
            bVar.mo64524a(C31617a.FILTER_RATE_CONFIRM);
            if (!bVar.f82629h) {
                bVar.mo64523a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.a.b$g */
    static final class C31628g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31621b f82645a;

        C31628g(C31621b bVar) {
            this.f82645a = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C31621b bVar = this.f82645a;
            bVar.f82626e = bVar.f82631j;
            C31459g gVar = bVar.f82625d;
            if (gVar != null && gVar.equals(bVar.f82627f)) {
                bVar.f82626e = bVar.f82628g;
            }
            bVar.mo64524a(C31617a.FILTER_RATE_CANCEL);
            if (!bVar.f82629h) {
                bVar.mo64523a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.a.b$h */
    public static final class C31629h implements OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ C31621b f82646a;

        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
        }

        C31629h(C31621b bVar) {
            this.f82646a = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x004c A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onProgressChanged(android.widget.SeekBar r2, int r3, boolean r4) {
            /*
                r1 = this;
                com.ss.android.ugc.aweme.filter.view.internal.a.b r2 = r1.f82646a
                com.ss.android.ugc.aweme.filter.g r4 = r2.f82625d
                if (r4 == 0) goto L_0x004d
                d.n<com.ss.android.ugc.aweme.filter.ai, com.ss.android.ugc.aweme.filter.ah> r0 = r2.f82630i
                if (r0 == 0) goto L_0x0023
                if (r4 == 0) goto L_0x001b
                java.lang.Object r0 = r0.getFirst()
                com.ss.android.ugc.aweme.filter.ai r0 = (com.p683ss.android.ugc.aweme.filter.C31406ai) r0
                float r0 = com.p683ss.android.ugc.aweme.filter.C31460h.m73278a(r4, r3, r0)
                java.lang.Float r0 = java.lang.Float.valueOf(r0)
                goto L_0x001c
            L_0x001b:
                r0 = 0
            L_0x001c:
                if (r0 == 0) goto L_0x0023
                float r3 = r0.floatValue()
                goto L_0x002b
            L_0x0023:
                r0 = 1065353216(0x3f800000, float:1.0)
                float r3 = (float) r3
                float r3 = r3 * r0
                r0 = 1120403456(0x42c80000, float:100.0)
                float r3 = r3 / r0
            L_0x002b:
                r2.f82626e = r3
                com.ss.android.ugc.aweme.filter.view.a.k$a r3 = com.p683ss.android.ugc.aweme.filter.view.p1750a.C31616k.C31617a.FILTER_RATE_CHANGING
                r2.mo64524a(r3)
                d.n<com.ss.android.ugc.aweme.filter.ai, com.ss.android.ugc.aweme.filter.ah> r3 = r2.f82630i
                if (r3 == 0) goto L_0x004c
                java.lang.Object r0 = r3.getSecond()
                com.ss.android.ugc.aweme.filter.ah r0 = (com.p683ss.android.ugc.aweme.filter.C31405ah) r0
                float r2 = r2.f82626e
                java.lang.Object r3 = r3.getFirst()
                com.ss.android.ugc.aweme.filter.ai r3 = (com.p683ss.android.ugc.aweme.filter.C31406ai) r3
                int r2 = com.p683ss.android.ugc.aweme.filter.C31460h.m73280a(r4, r2, r3)
                r0.mo64305a(r4, r2)
                goto L_0x004d
            L_0x004c:
                return
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.filter.view.internal.p1751a.C31621b.C31629h.onProgressChanged(android.widget.SeekBar, int, boolean):void");
        }
    }

    public C31621b(ViewGroup viewGroup, C1707b<TabLayout, RecyclerView, C31613h> bVar, int i, boolean z, C52847n<? extends C31406ai, ? extends C31405ah> nVar) {
        this(viewGroup, bVar, i, z, nVar, 0.0f, 32, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo64523a() {
        View view = this.f82624c;
        if (view != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.0f});
            ofFloat.addListener(new C31622a(view));
            C52711k.m112236a((Object) ofFloat, "animator");
            ofFloat.setDuration(150);
            ofFloat.start();
        }
    }

    /* renamed from: a */
    public final void mo64515a(C31618l lVar) {
        this.f82633l = lVar;
    }

    /* renamed from: a */
    public final void mo64513a(C31459g gVar) {
        C31613h hVar = this.f82632k;
        if (hVar == null) {
            C52711k.m112237a("filterListView");
        }
        hVar.mo64493a(gVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo64524a(C31617a aVar) {
        C31618l lVar = this.f82633l;
        if (lVar != null) {
            lVar.mo64517a(this.f82625d, this.f82626e, this.f82627f, this.f82628g, aVar);
        }
    }

    /* renamed from: a */
    public final void mo64491a(Map<EffectCategoryResponse, ? extends List<? extends C31459g>> map) {
        C52711k.m112240b(map, "filterList");
        C31613h hVar = this.f82632k;
        if (hVar == null) {
            C52711k.m112237a("filterListView");
        }
        hVar.mo64491a(map);
    }

    /* renamed from: a */
    public final void mo64514a(C31459g gVar, float f) {
        C52711k.m112240b(gVar, "filterBean");
        this.f82627f = gVar;
        this.f82628g = f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo64522a(float f, C31459g gVar) {
        Integer num;
        C52847n<C31406ai, C31405ah> nVar = this.f82630i;
        if (nVar != null) {
            if (gVar != null) {
                num = Integer.valueOf(C31460h.m73280a(gVar, f, (C31406ai) nVar.getFirst()));
            } else {
                num = null;
            }
            if (num != null) {
                return num.intValue();
            }
        }
        return (int) (f * 100.0f);
    }

    private C31621b(ViewGroup viewGroup, C1707b<TabLayout, RecyclerView, C31613h> bVar, int i, boolean z, C52847n<? extends C31406ai, ? extends C31405ah> nVar, float f) {
        C52711k.m112240b(viewGroup, "root");
        C52711k.m112240b(bVar, "listViewProvider");
        this.f82636o = viewGroup;
        this.f82637p = bVar;
        this.f82638q = i;
        this.f82629h = z;
        this.f82630i = nVar;
        this.f82631j = f;
        this.f82626e = this.f82631j;
        this.f82628g = this.f82631j;
        this.f82634m = new C1689b();
        this.f82635n = new C31629h(this);
        View inflate = LayoutInflater.from(this.f82636o.getContext()).inflate(this.f82638q, this.f82636o, true);
        View findViewById = inflate.findViewById(R.id.afj);
        C52711k.m112236a((Object) findViewById, "view.findViewById(R.id.filter_recyclerView)");
        this.f82623b = (RecyclerView) findViewById;
        RecyclerView recyclerView = this.f82623b;
        if (recyclerView == null) {
            C52711k.m112237a("recyclerView");
        }
        recyclerView.setLayoutManager(new EffectCenterLayoutManager(this.f82636o.getContext(), 0, false));
        TabLayout tabLayout = (TabLayout) inflate.findViewById(R.id.afm);
        C1707b<TabLayout, RecyclerView, C31613h> bVar2 = this.f82637p;
        RecyclerView recyclerView2 = this.f82623b;
        if (recyclerView2 == null) {
            C52711k.m112237a("recyclerView");
        }
        Object a = bVar2.mo6200a(tabLayout, recyclerView2);
        C52711k.m112236a(a, "listViewProvider.apply(tabLayout, recyclerView)");
        this.f82632k = (C31613h) a;
        View findViewById2 = inflate.findViewById(R.id.ckb);
        C52711k.m112236a((Object) findViewById2, "view.findViewById(R.id.seekbar)");
        this.f82622a = (FilterBeautySeekBar) findViewById2;
        this.f82624c = inflate.findViewById(R.id.afi);
        if (!this.f82629h) {
            View view = this.f82624c;
            if (view != null) {
                view.setVisibility(8);
            }
        }
        C1689b bVar3 = this.f82634m;
        C31613h hVar = this.f82632k;
        if (hVar == null) {
            C52711k.m112237a("filterListView");
        }
        bVar3.mo6181a(hVar.mo64495b().mo6505a((C1710e<? super T>) new C31623b<Object>(this), C1723a.f5846e));
        C1689b bVar4 = this.f82634m;
        C31613h hVar2 = this.f82632k;
        if (hVar2 == null) {
            C52711k.m112237a("filterListView");
        }
        bVar4.mo6181a(hVar2.mo64497c().mo6505a((C1710e<? super T>) new C31624c<Object>(this), C1723a.f5846e));
        FilterBeautySeekBar filterBeautySeekBar = this.f82622a;
        if (filterBeautySeekBar == null) {
            C52711k.m112237a("seekBar");
        }
        filterBeautySeekBar.setOnSeekBarChangeListener(this.f82635n);
        View findViewById3 = inflate.findViewById(R.id.af6);
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(new C31625d(this));
        }
        View findViewById4 = inflate.findViewById(R.id.af4);
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(new C31626e(this));
        }
        View findViewById5 = inflate.findViewById(R.id.afh);
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(new C31627f(this));
        }
        View findViewById6 = inflate.findViewById(R.id.afg);
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(new C31628g(this));
        }
    }

    private /* synthetic */ C31621b(ViewGroup viewGroup, C1707b bVar, int i, boolean z, C52847n nVar, float f, int i2, C52707g gVar) {
        this(viewGroup, bVar, i, z, nVar, 0.8f);
    }
}
