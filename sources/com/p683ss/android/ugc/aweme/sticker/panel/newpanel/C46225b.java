package com.p683ss.android.ugc.aweme.sticker.panel.newpanel;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.app.AppCompatActivity;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1337j;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.support.p043v7.widget.RecyclerView.C1341n;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewPropertyAnimator;
import com.bytedance.p780m.C12361b;
import com.p683ss.android.ugc.aweme.account.model.C22055c;
import com.p683ss.android.ugc.aweme.filter.CenterLayoutManager;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a.C37722a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.sticker.p2275a.C45814b;
import com.p683ss.android.ugc.aweme.sticker.p2283g.C45889c;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46059g;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46353k;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46354l;
import com.p683ss.android.ugc.aweme.sticker.viewmodel.EffectStickerViewModel;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtPanelRecyleView;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtTabLayout;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse;
import com.p683ss.android.ugc.tools.view.widget.AVStatusView;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.b */
public final class C46225b extends C46245g {

    /* renamed from: f */
    public static final C46226a f116624f = new C46226a(null);

    /* renamed from: a */
    public final C46354l f116625a = ((C46354l) this.f116631q.mo23373a(C46354l.class, (String) null));

    /* renamed from: b */
    public final String f116626b;

    /* renamed from: c */
    public final List<Effect> f116627c;

    /* renamed from: d */
    final AppCompatActivity f116628d;

    /* renamed from: e */
    final AVDmtTabLayout f116629e;

    /* renamed from: p */
    private final C0184k f116630p;

    /* renamed from: q */
    private final C12361b f116631q;

    /* renamed from: r */
    private final AVStatusView f116632r;

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.b$a */
    public static final class C46226a {
        private C46226a() {
        }

        public /* synthetic */ C46226a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.b$b */
    static final class C46227b extends C52712l implements C52671b<Effect, Boolean> {

        /* renamed from: a */
        public static final C46227b f116633a = new C46227b();

        C46227b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Effect effect = (Effect) obj;
            C52711k.m112240b(effect, "it");
            return Boolean.valueOf(effect.getTags().contains("douyin_card"));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.b$c */
    static final class C46228c extends C52712l implements C52671b<Effect, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C46225b f116634a;

        C46228c(C46225b bVar) {
            this.f116634a = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            boolean z;
            Effect effect = (Effect) obj;
            C52711k.m112240b(effect, "it");
            C0209x a = C0214z.m440a((FragmentActivity) this.f116634a.f116628d).mo359a(EffectStickerViewModel.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(mA…kerViewModel::class.java)");
            ShortVideoContext d = ((EffectStickerViewModel) a).mo93416a().mo91264d();
            boolean z2 = false;
            if (!d.mo86365f() && !d.mo86366g()) {
                C52711k.m112236a((Object) d, "shortVideoContext");
                if (!d.mo86362d()) {
                    z = false;
                    if (z && C46059g.m100095s(effect)) {
                        z2 = true;
                    }
                    return Boolean.valueOf(z2);
                }
            }
            z = true;
            z2 = true;
            return Boolean.valueOf(z2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.b$d */
    public static final class C46229d implements C0199s<C37721a<FetchFavoriteListResponse>> {

        /* renamed from: a */
        final /* synthetic */ C46225b f116635a;

        C46229d(C46225b bVar) {
            this.f116635a = bVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C37721a aVar = (C37721a) obj;
            if (aVar != null && ((FetchFavoriteListResponse) aVar.f96125a) != null) {
                FetchFavoriteListResponse fetchFavoriteListResponse = (FetchFavoriteListResponse) aVar.f96125a;
                if (fetchFavoriteListResponse != null) {
                    List effects = fetchFavoriteListResponse.getEffects();
                    if (effects != null) {
                        C46225b bVar = this.f116635a;
                        if (effects != null) {
                            C52575l.m112110a(effects, (C52671b) new C46228c(bVar));
                        }
                        if (effects != null) {
                            C22055c e = C39629l.m88232a().mo58593x().mo74285e();
                            if (e != null && !e.mo46166j()) {
                                C52575l.m112110a(effects, (C52671b) C46227b.f116633a);
                            }
                        }
                        this.f116635a.f116627c.clear();
                        this.f116635a.f116627c.addAll(effects);
                        C46225b bVar2 = this.f116635a;
                        C37722a aVar2 = aVar.f96126b;
                        C52711k.m112236a((Object) aVar2, "list.status");
                        bVar2.mo92940a(aVar2);
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.b$e */
    static final class C46230e<T> implements C0199s<C46353k> {

        /* renamed from: a */
        final /* synthetic */ C46225b f116636a;

        C46230e(C46225b bVar) {
            this.f116636a = bVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            C46353k kVar = (C46353k) obj;
            if (kVar != null) {
                Effect effect = kVar.f116947a;
                Effect effect2 = kVar.f116948b;
                C46236d dVar = this.f116636a.f116678m;
                int i2 = -1;
                if (dVar != null) {
                    i = dVar.mo92937a(this.f116636a.f116626b, effect);
                } else {
                    i = -1;
                }
                C46236d dVar2 = this.f116636a.f116678m;
                if (dVar2 != null) {
                    i2 = dVar2.mo92937a(this.f116636a.f116626b, effect2);
                }
                if (i >= 0) {
                    C46236d dVar3 = this.f116636a.f116678m;
                    if (dVar3 != null) {
                        dVar3.notifyItemChanged(i, this.f116636a.f116625a.mo92973a().mo92532d().mo92510a(effect, this.f116636a.f116626b));
                    }
                }
                if (i2 >= 0) {
                    C46236d dVar4 = this.f116636a.f116678m;
                    if (dVar4 != null) {
                        dVar4.notifyItemChanged(i2, this.f116636a.f116625a.mo92973a().mo92532d().mo92510a(effect2, this.f116636a.f116626b));
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.b$f */
    public static final class C46231f extends C1340m {

        /* renamed from: a */
        final /* synthetic */ C46225b f116637a;

        C46231f(C46225b bVar) {
            this.f116637a = bVar;
        }

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            C52711k.m112240b(recyclerView, "recyclerView");
            C1337j jVar = this.f116637a.f116680o;
            if (jVar != null) {
                AVDmtPanelRecyleView aVDmtPanelRecyleView = this.f116637a.f116677l;
                if (aVDmtPanelRecyleView != null) {
                    aVDmtPanelRecyleView.mo4816b(jVar);
                }
            }
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                this.f116637a.mo92943h();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.b$g */
    public static final class C46232g implements OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ C46225b f116638a;

        C46232g(C46225b bVar) {
            this.f116638a = bVar;
        }

        public final void onViewDetachedFromWindow(View view) {
            this.f116638a.mo92945j();
        }

        public final void onViewAttachedToWindow(View view) {
            if (this.f116638a.f116676k) {
                this.f116638a.mo92943h();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.b$h */
    public static final class C46233h implements C1337j {

        /* renamed from: a */
        final /* synthetic */ C46225b f116639a;

        /* renamed from: b */
        public final void mo5077b(View view) {
            C52711k.m112240b(view, "view");
        }

        C46233h(C46225b bVar) {
            this.f116639a = bVar;
        }

        /* renamed from: a */
        public final void mo5076a(View view) {
            int i;
            C52711k.m112240b(view, "view");
            if (this.f116639a.f116676k) {
                C46225b bVar = this.f116639a;
                if (this.f116639a.f116677l != null) {
                    i = AVDmtPanelRecyleView.m4275f(view);
                } else {
                    i = DynamicTabYellowPointVersion.DEFAULT;
                }
                bVar.mo92939a(i);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.b$i */
    static final class C46234i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AVDmtPanelRecyleView f116640a;

        /* renamed from: b */
        final /* synthetic */ float f116641b;

        /* renamed from: c */
        final /* synthetic */ float f116642c;

        /* renamed from: d */
        final /* synthetic */ long f116643d;

        /* renamed from: e */
        final /* synthetic */ boolean f116644e;

        C46234i(AVDmtPanelRecyleView aVDmtPanelRecyleView, float f, float f2, long j, boolean z) {
            this.f116640a = aVDmtPanelRecyleView;
            this.f116641b = f;
            this.f116642c = f2;
            this.f116643d = j;
            this.f116644e = z;
        }

        public final void run() {
            int i;
            AVDmtPanelRecyleView aVDmtPanelRecyleView = this.f116640a;
            if (this.f116644e) {
                i = 0;
            } else {
                i = 8;
            }
            aVDmtPanelRecyleView.setVisibility(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo92921c() {
        AVDmtPanelRecyleView aVDmtPanelRecyleView = this.f116677l;
        if (aVDmtPanelRecyleView != null) {
            aVDmtPanelRecyleView.setVisibility(8);
        }
        AVStatusView aVStatusView = this.f116632r;
        if (aVStatusView != null) {
            aVStatusView.setVisibility(0);
        }
        AVStatusView aVStatusView2 = this.f116632r;
        if (aVStatusView2 != null) {
            aVStatusView2.mo98094a(false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo92922d() {
        AVDmtPanelRecyleView aVDmtPanelRecyleView = this.f116677l;
        if (aVDmtPanelRecyleView != null) {
            aVDmtPanelRecyleView.setVisibility(8);
        }
        AVStatusView aVStatusView = this.f116632r;
        if (aVStatusView != null) {
            aVStatusView.setVisibility(0);
        }
        AVStatusView aVStatusView2 = this.f116632r;
        if (aVStatusView2 != null) {
            aVStatusView2.mo98095b();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (r0 == null) goto L_0x001b;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo92920b() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.themechange.base.AVDmtPanelRecyleView r0 = r5.f116677l
            if (r0 == 0) goto L_0x0008
            r1 = 0
            r0.setVisibility(r1)
        L_0x0008:
            com.ss.android.ugc.tools.view.widget.AVStatusView r0 = r5.f116632r
            if (r0 == 0) goto L_0x0011
            r1 = 8
            r0.setVisibility(r1)
        L_0x0011:
            com.ss.android.ugc.aweme.sticker.panel.newpanel.d r0 = r5.f116678m
            if (r0 == 0) goto L_0x001b
            java.util.List r0 = r0.mo92825b()
            if (r0 != 0) goto L_0x001f
        L_0x001b:
            java.util.List r0 = p2628d.p2629a.C52575l.m112097a()
        L_0x001f:
            java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> r1 = r5.f116627c
            java.lang.String r2 = r5.f116626b
            java.util.List r1 = com.p683ss.android.ugc.aweme.sticker.p2285i.p2297f.p2299b.C46036g.m100020a(r1, r2)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0062
            android.support.v7.app.AppCompatActivity r0 = r5.f116628d
            r1 = 2132542198(0x7f1c02f6, float:2.0737494E38)
            java.lang.String r0 = r0.getString(r1)
            com.ss.android.ugc.aweme.sticker.panel.newpanel.d r1 = r5.f116678m
            if (r1 == 0) goto L_0x0061
            java.lang.String r2 = "tips"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            java.lang.String r2 = "tips"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r2)
            com.ss.android.ugc.aweme.sticker.panel.newpanel.model.EmptyStickerWrapper r2 = new com.ss.android.ugc.aweme.sticker.panel.newpanel.model.EmptyStickerWrapper
            r2.<init>(r0)
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = new com.ss.android.ugc.effectmanager.effect.model.Effect
            r0.<init>()
            java.lang.String r3 = ""
            r0.setId(r3)
            java.lang.String r3 = ""
            r0.setEffectId(r3)
            r2.f115779a = r0
            java.util.List r0 = p2628d.p2629a.C52575l.m112092a(r2)
            r1.mo64318a(r0)
        L_0x0061:
            return
        L_0x0062:
            com.ss.android.ugc.aweme.sticker.panel.newpanel.d r2 = r5.f116678m
            if (r2 == 0) goto L_0x0087
            com.ss.android.ugc.aweme.sticker.panel.defaultpanel.l r3 = new com.ss.android.ugc.aweme.sticker.panel.defaultpanel.l
            com.ss.android.ugc.aweme.sticker.presenter.l r4 = r5.f116625a
            com.ss.android.ugc.effectmanager.effect.model.Effect r4 = r4.mo92985c()
            r3.<init>(r4, r0, r1)
            android.support.v7.e.c$a r3 = (android.support.p043v7.p051e.C1208c.C1210a) r3
            r0 = 1
            android.support.v7.e.c$b r0 = android.support.p043v7.p051e.C1208c.m3655a(r3, r0)
            java.lang.String r3 = "DiffUtil.calculateDiff(F… oldData, newData), true)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r3)
            r3 = r2
            android.support.v7.widget.RecyclerView$a r3 = (android.support.p043v7.widget.RecyclerView.C1322a) r3
            r0.mo3931a(r3)
            r2.mo64318a(r1)
            return
        L_0x0087:
            d.u r0 = new d.u
            java.lang.String r1 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.sticker.panel.newpanel.NewPanelStickerAdapter"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.sticker.panel.newpanel.C46225b.mo92920b():void");
    }

    /* renamed from: a */
    public final void mo92918a(String str, C52671b<? super String, ? extends Object> bVar) {
        C52711k.m112240b(str, "panel");
        if (C37722a.SUCCESS != this.f116673h) {
            mo92940a(C37722a.LOADING);
            this.f116625a.mo92973a().mo92533e().mo92500a().mo92503b().observe(this.f116630p, new C46229d(this));
        }
    }

    /* renamed from: a */
    public final void mo92931a(boolean z, long j) {
        float f;
        float f2;
        if (this.f116674i != z) {
            this.f116674i = z;
            if (z) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            AVDmtPanelRecyleView aVDmtPanelRecyleView = this.f116677l;
            if (aVDmtPanelRecyleView != null) {
                aVDmtPanelRecyleView.setAlpha(f);
                aVDmtPanelRecyleView.setVisibility(0);
                ViewPropertyAnimator duration = aVDmtPanelRecyleView.animate().alpha(f2).setDuration(250);
                C46234i iVar = new C46234i(aVDmtPanelRecyleView, f, f2, 250, z);
                duration.withEndAction(iVar).start();
            }
            if (this.f116675j) {
                mo92940a(C37722a.SUCCESS);
                this.f116675j = false;
            }
        }
    }

    /* renamed from: a */
    public final void mo92930a(String str, View view) {
        C52711k.m112240b(str, "panel");
        C52711k.m112240b(view, "root");
        C46236d dVar = new C46236d(this.f116625a, (C45814b) this.f116631q.mo23373a(C45814b.class, (String) null));
        dVar.mo97992c(false);
        this.f116678m = dVar;
        this.f116679n = new CenterLayoutManager(this.f116628d, 0, false);
        AVDmtPanelRecyleView aVDmtPanelRecyleView = (AVDmtPanelRecyleView) view.findViewById(R.id.b7m);
        if (aVDmtPanelRecyleView != null) {
            aVDmtPanelRecyleView.setAdapter(this.f116678m);
            aVDmtPanelRecyleView.setLayoutManager(this.f116679n);
            aVDmtPanelRecyleView.setItemViewCacheSize(5);
            aVDmtPanelRecyleView.setRecycledViewPool((C1341n) this.f116631q.mo23373a(C1341n.class, (String) null));
        } else {
            aVDmtPanelRecyleView = null;
        }
        this.f116677l = aVDmtPanelRecyleView;
        AVDmtPanelRecyleView aVDmtPanelRecyleView2 = this.f116677l;
        if (aVDmtPanelRecyleView2 != null) {
            aVDmtPanelRecyleView2.mo4801a((C1340m) new C46231f(this));
        }
        AVDmtPanelRecyleView aVDmtPanelRecyleView3 = this.f116677l;
        if (aVDmtPanelRecyleView3 != null) {
            aVDmtPanelRecyleView3.addOnAttachStateChangeListener(new C46232g(this));
        }
        this.f116680o = new C46233h(this);
        C1337j jVar = this.f116680o;
        if (jVar != null) {
            AVDmtPanelRecyleView aVDmtPanelRecyleView4 = this.f116677l;
            if (aVDmtPanelRecyleView4 != null) {
                aVDmtPanelRecyleView4.mo4799a(jVar);
            }
        }
        mo92941b(mo92944i());
        this.f116625a.mo92989g().mo93018d().observe(this.f116630p, new C46230e(this));
    }

    public C46225b(AppCompatActivity appCompatActivity, C0184k kVar, C12361b bVar, AVDmtTabLayout aVDmtTabLayout, AVStatusView aVStatusView) {
        C52711k.m112240b(appCompatActivity, "mActivity");
        C52711k.m112240b(kVar, "lifecycleOwner");
        C52711k.m112240b(bVar, "objectContainer");
        C52711k.m112240b(aVDmtTabLayout, "mTabLayout");
        super(appCompatActivity, (C46354l) bVar.mo23373a(C46354l.class, (String) null), (C45889c) bVar.mo23373a(C45889c.class, (String) null));
        this.f116628d = appCompatActivity;
        this.f116630p = kVar;
        this.f116631q = bVar;
        this.f116629e = aVDmtTabLayout;
        this.f116632r = aVStatusView;
        String string = this.f116628d.getString(R.string.drn);
        C52711k.m112236a((Object) string, "mActivity.getString(R.st…g.sticker_tab_collection)");
        this.f116626b = string;
        this.f116627c = new ArrayList();
    }
}
