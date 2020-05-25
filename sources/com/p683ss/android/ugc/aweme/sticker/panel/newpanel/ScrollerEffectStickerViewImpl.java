package com.p683ss.android.ugc.aweme.sticker.panel.newpanel;

import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.support.p030v4.app.C0654k;
import android.support.p043v7.app.AppCompatActivity;
import android.support.p043v7.widget.RecyclerView.C1341n;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.p780m.C12361b;
import com.bytedance.p780m.C12366c;
import com.p683ss.android.ugc.aweme.adaptation.C22452a;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C44703b;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C44704c;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C44709f;
import com.p683ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p683ss.android.ugc.aweme.sticker.p2275a.C45814b;
import com.p683ss.android.ugc.aweme.sticker.p2283g.C45889c;
import com.p683ss.android.ugc.aweme.sticker.p2285i.C45924b;
import com.p683ss.android.ugc.aweme.sticker.panel.C46255p;
import com.p683ss.android.ugc.aweme.sticker.panel.C46256q;
import com.p683ss.android.ugc.aweme.sticker.panel.EffectStickerViewImpl;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46354l;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtTabItemView;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtTabLayout;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtTabLayout.C46784a;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryIconsModel;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48710o;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48715t;
import com.p683ss.android.ugc.tools.view.widget.AVStatusView;
import com.p683ss.android.ugc.tools.view.widget.AVStatusView.C50243a;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.ScrollerEffectStickerViewImpl */
public final class ScrollerEffectStickerViewImpl extends EffectStickerViewImpl {

    /* renamed from: B */
    public static final C46200a f116565B = new C46200a(null);

    /* renamed from: y */
    static final /* synthetic */ C52767h[] f116566y = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(ScrollerEffectStickerViewImpl.class), "mViewPool", "getMViewPool()Landroid/support/v7/widget/RecyclerView$RecycledViewPool;"))};

    /* renamed from: A */
    public C46210a f116567A;

    /* renamed from: C */
    private final C52668f f116568C = C52732g.m112306a(new C1341n());

    /* renamed from: D */
    private AVStatusView f116569D;

    /* renamed from: E */
    private View f116570E;

    /* renamed from: F */
    private View f116571F;

    /* renamed from: G */
    private boolean f116572G;

    /* renamed from: H */
    private final C12361b f116573H;

    /* renamed from: z */
    public C46225b f116574z;

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.ScrollerEffectStickerViewImpl$a */
    public static final class C46200a {
        private C46200a() {
        }

        public /* synthetic */ C46200a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.ScrollerEffectStickerViewImpl$b */
    public static final class C46201b implements C44704c {

        /* renamed from: a */
        final /* synthetic */ ScrollerEffectStickerViewImpl f116575a;

        /* renamed from: b */
        public final void mo64264b(C44709f fVar) {
        }

        /* renamed from: c */
        public final void mo64265c(C44709f fVar) {
        }

        C46201b(ScrollerEffectStickerViewImpl scrollerEffectStickerViewImpl) {
            this.f116575a = scrollerEffectStickerViewImpl;
        }

        /* renamed from: a */
        public final void mo64263a(C44709f fVar) {
            if (fVar != null) {
                View view = fVar.f113162f;
                if (view != null) {
                    C52711k.m112236a((Object) view, "tab.customView ?: return");
                    if (view instanceof AVDmtTabItemView) {
                        ((AVDmtTabItemView) view).mo93989b(false);
                        this.f116575a.mo92909a((EffectCategoryModel) C45924b.m99852a(this.f116575a.f116268n.mo92973a().mo92537i()).get(fVar.f113161e));
                    }
                    ScrollerEffectStickerViewImpl scrollerEffectStickerViewImpl = this.f116575a;
                    int i = fVar.f113161e;
                    FaceStickerBean.sCurPropSource = ((EffectCategoryModel) C45924b.m99852a(scrollerEffectStickerViewImpl.f116268n.mo92973a().mo92537i()).get(i)).getName();
                    scrollerEffectStickerViewImpl.f116270p.mo92484a(((EffectCategoryModel) C45924b.m99852a(scrollerEffectStickerViewImpl.f116268n.mo92973a().mo92537i()).get(i)).getName());
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.ScrollerEffectStickerViewImpl$c */
    static final class C46202c implements C44703b {

        /* renamed from: a */
        public static final C46202c f116576a = new C46202c();

        C46202c() {
        }

        /* renamed from: a */
        public final void mo64479a(C44709f fVar) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.ScrollerEffectStickerViewImpl$d */
    static final class C46203d extends C52712l implements C52671b<String, C52860x> {

        /* renamed from: a */
        final /* synthetic */ ScrollerEffectStickerViewImpl f116577a;

        C46203d(ScrollerEffectStickerViewImpl scrollerEffectStickerViewImpl) {
            this.f116577a = scrollerEffectStickerViewImpl;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((String) obj, "<anonymous parameter 0>");
            this.f116577a.mo92911h();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.ScrollerEffectStickerViewImpl$e */
    static final class C46204e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ScrollerEffectStickerViewImpl f116578a;

        /* renamed from: b */
        final /* synthetic */ C0184k f116579b;

        /* renamed from: c */
        final /* synthetic */ String f116580c;

        C46204e(ScrollerEffectStickerViewImpl scrollerEffectStickerViewImpl, C0184k kVar, String str) {
            this.f116578a = scrollerEffectStickerViewImpl;
            this.f116579b = kVar;
            this.f116580c = str;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f116578a.mo92747a(this.f116579b, this.f116580c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.ScrollerEffectStickerViewImpl$f */
    static final class C46205f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ScrollerEffectStickerViewImpl f116581a;

        /* renamed from: b */
        final /* synthetic */ int f116582b;

        /* renamed from: c */
        final /* synthetic */ EffectCategoryModel f116583c;

        /* renamed from: d */
        final /* synthetic */ AVDmtTabItemView f116584d;

        C46205f(ScrollerEffectStickerViewImpl scrollerEffectStickerViewImpl, int i, EffectCategoryModel effectCategoryModel, AVDmtTabItemView aVDmtTabItemView) {
            this.f116581a = scrollerEffectStickerViewImpl;
            this.f116582b = i;
            this.f116583c = effectCategoryModel;
            this.f116584d = aVDmtTabItemView;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0074, code lost:
            if (r7 == null) goto L_0x0076;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r7) {
            /*
                r6 = this;
                com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r7)
                int r7 = r6.f116582b
                if (r7 != 0) goto L_0x0049
                com.ss.android.ugc.aweme.port.in.u r7 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
                com.ss.android.ugc.aweme.port.in.aa r7 = r7.mo58593x()
                boolean r7 = r7.mo74282b()
                if (r7 != 0) goto L_0x0049
                com.ss.android.ugc.aweme.port.in.u r7 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
                com.ss.android.ugc.aweme.port.in.aa r0 = r7.mo58593x()
                com.ss.android.ugc.aweme.sticker.panel.newpanel.ScrollerEffectStickerViewImpl r7 = r6.f116581a
                android.support.v7.app.AppCompatActivity r7 = r7.f116257c
                java.lang.String r1 = "mActivity"
                p2628d.p2639f.p2641b.C52711k.m112236a(r7, r1)
                r1 = r7
                android.app.Activity r1 = (android.app.Activity) r1
                java.lang.String r2 = ""
                java.lang.String r3 = "click_my_prop"
                com.ss.android.ugc.aweme.sticker.panel.newpanel.ScrollerEffectStickerViewImpl r7 = r6.f116581a
                com.bytedance.m.b r7 = r7.mo23370j()
                java.lang.Class<com.ss.android.ugc.aweme.sticker.a> r4 = com.p683ss.android.ugc.aweme.sticker.C45805a.class
                r5 = 0
                java.lang.Object r7 = r7.mo23375b(r4, r5)
                com.ss.android.ugc.aweme.sticker.a r7 = (com.p683ss.android.ugc.aweme.sticker.C45805a) r7
                r4 = 0
                com.ss.android.ugc.aweme.sticker.panel.newpanel.ScrollerEffectStickerViewImpl$f$1 r7 = new com.ss.android.ugc.aweme.sticker.panel.newpanel.ScrollerEffectStickerViewImpl$f$1
                r7.<init>(r6)
                r5 = r7
                com.ss.android.ugc.aweme.port.in.aa$a r5 = (com.p683ss.android.ugc.aweme.port.p2082in.C39527aa.C39528a) r5
                r0.mo74276a(r1, r2, r3, r4, r5)
                return
            L_0x0049:
                int r7 = r6.f116582b
                r0 = 0
                if (r7 != 0) goto L_0x00ae
                com.ss.android.ugc.aweme.sticker.panel.newpanel.ScrollerEffectStickerViewImpl r7 = r6.f116581a
                com.ss.android.ugc.aweme.sticker.presenter.l r7 = r7.f116268n
                com.ss.android.ugc.aweme.sticker.i.a.p r7 = r7.mo92973a()
                com.ss.android.ugc.aweme.sticker.i.a.e r7 = r7.mo92533e()
                com.ss.android.ugc.aweme.sticker.i.a.f r7 = r7.mo92500a()
                android.arch.lifecycle.LiveData r7 = r7.mo92503b()
                java.lang.Object r7 = r7.getValue()
                com.ss.android.ugc.aweme.mvp.b.a r7 = (com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a) r7
                if (r7 == 0) goto L_0x0076
                M r7 = r7.f96125a
                com.ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse r7 = (com.p683ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse) r7
                if (r7 == 0) goto L_0x0076
                java.util.List r7 = r7.getEffects()
                if (r7 != 0) goto L_0x007a
            L_0x0076:
                java.util.List r7 = p2628d.p2629a.C52575l.m112097a()
            L_0x007a:
                boolean r7 = r7.isEmpty()
                if (r7 == 0) goto L_0x0091
                com.ss.android.ugc.aweme.sticker.panel.newpanel.ScrollerEffectStickerViewImpl r7 = r6.f116581a
                android.support.v7.app.AppCompatActivity r7 = r7.f116257c
                android.content.Context r7 = (android.content.Context) r7
                r1 = 2132542198(0x7f1c02f6, float:2.0737494E38)
                com.ss.android.ugc.tools.view.widget.d r7 = com.p683ss.android.ugc.tools.view.widget.C50275d.m108530a(r7, r1)
                r7.mo98174a()
                goto L_0x00cd
            L_0x0091:
                com.ss.android.ugc.aweme.sticker.panel.newpanel.ScrollerEffectStickerViewImpl r7 = r6.f116581a
                r1 = 1
                r7.mo92910c(r1)
                com.ss.android.ugc.aweme.sticker.panel.newpanel.ScrollerEffectStickerViewImpl r7 = r6.f116581a
                com.ss.android.ugc.aweme.sticker.panel.newpanel.b r7 = r7.f116574z
                if (r7 == 0) goto L_0x00cd
                com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r2 = r7.f116629e
                r2.setHideIndicatorView(r1)
                com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r7 = r7.f116629e
                com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$f r7 = r7.mo90679a(r0)
                if (r7 == 0) goto L_0x00cd
                r7.mo90744a()
                goto L_0x00cd
            L_0x00ae:
                com.ss.android.ugc.aweme.sticker.panel.newpanel.ScrollerEffectStickerViewImpl r7 = r6.f116581a
                com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel r1 = r6.f116583c
                r7.mo92909a(r1)
                com.ss.android.ugc.aweme.sticker.panel.newpanel.ScrollerEffectStickerViewImpl r7 = r6.f116581a
                r7.mo92910c(r0)
                com.ss.android.ugc.aweme.sticker.panel.newpanel.ScrollerEffectStickerViewImpl r7 = r6.f116581a
                com.ss.android.ugc.aweme.sticker.panel.newpanel.a r7 = r7.f116567A
                if (r7 == 0) goto L_0x00cd
                com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel r1 = r6.f116583c
                java.lang.String r1 = r1.getKey()
                if (r1 != 0) goto L_0x00ca
                java.lang.String r1 = ""
            L_0x00ca:
                r7.mo92916a(r1)
            L_0x00cd:
                com.ss.android.ugc.aweme.themechange.base.AVDmtTabItemView r7 = r6.f116584d
                r7.mo93989b(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.sticker.panel.newpanel.ScrollerEffectStickerViewImpl.C46205f.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.ScrollerEffectStickerViewImpl$g */
    public static final class C46207g implements C48710o {

        /* renamed from: a */
        final /* synthetic */ ScrollerEffectStickerViewImpl f116586a;

        /* renamed from: b */
        final /* synthetic */ int f116587b;

        /* renamed from: c */
        final /* synthetic */ AVDmtTabItemView f116588c;

        /* renamed from: a */
        public final void mo8641a() {
        }

        /* renamed from: b */
        public final void mo8642b() {
            int i = this.f116587b;
            AVDmtTabLayout aVDmtTabLayout = this.f116586a.f116273s;
            C52711k.m112236a((Object) aVDmtTabLayout, "tabLayout");
            if (i != aVDmtTabLayout.getSelectedTabPosition()) {
                this.f116588c.mo93989b(true);
            }
        }

        C46207g(ScrollerEffectStickerViewImpl scrollerEffectStickerViewImpl, int i, AVDmtTabItemView aVDmtTabItemView) {
            this.f116586a = scrollerEffectStickerViewImpl;
            this.f116587b = i;
            this.f116588c = aVDmtTabItemView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.panel.newpanel.ScrollerEffectStickerViewImpl$h */
    static final class C46208h implements C48715t {

        /* renamed from: a */
        public static final C46208h f116589a = new C46208h();

        C46208h() {
        }

        /* renamed from: a */
        public final void mo8708a() {
        }
    }

    /* renamed from: c */
    public final int mo92757c() {
        return R.layout.a8x;
    }

    /* renamed from: j */
    public final C12361b mo23370j() {
        return this.f116573H;
    }

    /* renamed from: k */
    private final void m100348k() {
        this.f116273s.mo90683a(new C46201b(this));
    }

    /* renamed from: f */
    public final void mo92760f() {
        C46210a aVar = this.f116567A;
        if (aVar != null) {
            aVar.mo92942g();
        }
        C46225b bVar = this.f116574z;
        if (bVar != null) {
            bVar.mo92942g();
        }
    }

    /* renamed from: h */
    public final void mo92911h() {
        m100347i();
        C46256q qVar = this.f116276v;
        if (qVar != null) {
            qVar.cl_();
        }
    }

    /* renamed from: l */
    private final int m100349l() {
        int i;
        if (this.f116572G) {
            return -1;
        }
        if (this.f116266l) {
            i = 2;
        } else {
            i = 1;
        }
        AVDmtTabLayout aVDmtTabLayout = this.f116273s;
        C52711k.m112236a((Object) aVDmtTabLayout, "tabLayout");
        if (aVDmtTabLayout.getTabCount() >= i) {
            return i - 1;
        }
        return -1;
    }

    /* renamed from: e */
    public final void mo92759e() {
        if (this.f116572G) {
            C46225b bVar = this.f116574z;
            if (bVar != null) {
                bVar.mo92923e();
            }
        } else {
            C46210a aVar = this.f116567A;
            if (aVar != null) {
                aVar.mo92923e();
            }
        }
    }

    /* renamed from: g */
    public final void mo92761g() {
        super.mo92761g();
        C46210a aVar = this.f116567A;
        if (aVar != null) {
            aVar.mo92924f();
        }
        C46225b bVar = this.f116574z;
        if (bVar != null) {
            bVar.mo92924f();
        }
    }

    /* renamed from: i */
    private final void m100347i() {
        this.f116273s.mo90692b();
        Iterable a = C45924b.m99852a(this.f116268n.mo92973a().mo92537i());
        Collection arrayList = new ArrayList();
        int i = 0;
        for (Object next : a) {
            int i2 = i + 1;
            if (i < 0) {
                C52575l.m112100b();
            }
            View a2 = m100344a(i, (EffectCategoryModel) next);
            if (a2 != null) {
                arrayList.add(a2);
            }
            i = i2;
        }
        for (View a3 : (List) arrayList) {
            this.f116273s.mo90684a(this.f116273s.mo90678a().mo90742a(a3));
        }
        m100348k();
        this.f116273s.setOnTabClickListener(C46202c.f116576a);
        int l = m100349l();
        if (-1 != l) {
            C44709f a4 = this.f116273s.mo90679a(l);
            if (a4 != null) {
                a4.mo90744a();
            }
        }
    }

    /* renamed from: a */
    public final void mo92909a(EffectCategoryModel effectCategoryModel) {
        this.f116268n.mo92979a(effectCategoryModel.getId(), effectCategoryModel.getTagsUpdateTime(), (C48715t) C46208h.f116589a);
    }

    public ScrollerEffectStickerViewImpl(C12361b bVar) {
        C52711k.m112240b(bVar, "diContainer");
        super((C46255p) bVar.mo23373a(C46255p.class, (String) null), (C46354l) bVar.mo23373a(C46354l.class, (String) null), (C45814b) bVar.mo23373a(C45814b.class, (String) null), (C45889c) bVar.mo23373a(C45889c.class, (String) null));
        this.f116573H = bVar;
    }

    /* renamed from: b */
    private static String m100346b(EffectCategoryModel effectCategoryModel) {
        String str;
        EffectCategoryIconsModel icon = effectCategoryModel.getIcon();
        if (icon != null) {
            str = icon.getUri();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        EffectCategoryIconsModel icon2 = effectCategoryModel.getIcon();
        C52711k.m112236a((Object) icon2, "icon");
        String uri = icon2.getUri();
        C52711k.m112236a((Object) uri, "icon.uri");
        return uri;
    }

    /* renamed from: c */
    public final void mo92910c(boolean z) {
        this.f116572G = z;
        C46210a aVar = this.f116567A;
        if (aVar != null) {
            aVar.mo92919a(!this.f116572G, 250);
        }
        C46225b bVar = this.f116574z;
        if (bVar != null) {
            bVar.mo92931a(this.f116572G, 250);
        }
        if (this.f116572G) {
            C46210a aVar2 = this.f116567A;
            if (aVar2 != null) {
                aVar2.mo92942g();
            }
            C46225b bVar2 = this.f116574z;
            if (bVar2 != null) {
                bVar2.mo92923e();
            }
        } else {
            C46210a aVar3 = this.f116567A;
            if (aVar3 != null) {
                aVar3.mo92923e();
            }
            C46225b bVar3 = this.f116574z;
            if (bVar3 != null) {
                bVar3.mo92942g();
            }
        }
    }

    /* renamed from: a */
    private static void m100345a(View view, int i) {
        if (view != null) {
            LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = i;
            view.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    public final void mo92747a(C0184k kVar, String str) {
        C52711k.m112240b(kVar, "lifecycleOwner");
        C52711k.m112240b(str, "panel");
        C46225b bVar = this.f116574z;
        if (bVar != null) {
            bVar.mo92918a(str, null);
        }
        C46210a aVar = this.f116567A;
        if (aVar != null) {
            aVar.mo92918a(str, (C52671b<? super String, ? extends Object>) new C46203d<Object,Object>(this));
        }
    }

    /* renamed from: a */
    private final View m100344a(int i, EffectCategoryModel effectCategoryModel) {
        if (effectCategoryModel == null) {
            return null;
        }
        boolean z = true;
        AVDmtTabItemView a = C46784a.m101615a(this.f116257c, true);
        a.setOnClickListener(new C46205f(this, i, effectCategoryModel, a));
        String b = m100346b(effectCategoryModel);
        if (b.length() != 0) {
            z = false;
        }
        if (z) {
            a.setText(effectCategoryModel.getName());
        } else {
            a.mo93987a(b, R.drawable.d32);
        }
        this.f116268n.mo92980a(effectCategoryModel.getId(), effectCategoryModel.getTags(), effectCategoryModel.getTagsUpdateTime(), (C48710o) new C46207g(this, i, a));
        return a;
    }

    /* renamed from: a */
    public final void mo92746a(C0184k kVar, C0654k kVar2, String str, View view) {
        View view2;
        C52711k.m112240b(kVar, "lifecycleOwner");
        C52711k.m112240b(kVar2, "fragmentManager");
        C52711k.m112240b(str, "panel");
        C52711k.m112240b(view, "root");
        this.f116569D = (AVStatusView) view.findViewById(R.id.atx);
        LayoutInflater from = LayoutInflater.from(this.f116257c);
        if (!(view instanceof ViewGroup)) {
            view2 = null;
        } else {
            view2 = view;
        }
        View inflate = from.inflate(R.layout.fs, (ViewGroup) view2, false);
        inflate.findViewById(R.id.ox).setOnClickListener(new C46204e(this, kVar, str));
        AVStatusView aVStatusView = this.f116569D;
        boolean z = true;
        if (aVStatusView != null) {
            aVStatusView.setBuilder(C50243a.m108469a((Context) this.f116257c).mo98107b(inflate).mo98103a(R.string.bx4, R.string.f5x).mo98106b(1));
            aVStatusView.setVisibility(0);
            aVStatusView.requestDisallowInterceptTouchEvent(true);
        }
        this.f116570E = view.findViewById(R.id.arx);
        this.f116571F = view.findViewById(R.id.b_4);
        AppCompatActivity appCompatActivity = this.f116257c;
        C52711k.m112236a((Object) appCompatActivity, "mActivity");
        C52711k.m112240b(appCompatActivity, "context");
        if (C22452a.m55500f() < C22452a.m55497c()) {
            z = false;
        }
        if (z) {
            m100345a(view.findViewById(R.id.b_3), C22452a.m55497c() + ((int) C9432q.m18687b((Context) this.f116257c, 4.0f)));
            m100345a(view.findViewById(R.id.b_4), (int) C9432q.m18687b((Context) this.f116257c, 124.0f));
        }
        m100347i();
        C12366c cVar = new C12366c(mo23370j());
        C52711k.m112236a((Object) cVar.mo23380a(C1341n.class, (String) null, (C1341n) this.f116568C.getValue()), "this.registerInstance(T:…ass.java, null, instance)");
        C12361b a = cVar.mo23376a();
        C52711k.m112236a((Object) a, "ObjectContainerBuilder(d…ewPool)\n        }.build()");
        if (this.f116567A == null) {
            AppCompatActivity appCompatActivity2 = this.f116257c;
            C52711k.m112236a((Object) appCompatActivity2, "mActivity");
            AVDmtTabLayout aVDmtTabLayout = this.f116273s;
            C52711k.m112236a((Object) aVDmtTabLayout, "tabLayout");
            C46210a aVar = new C46210a(appCompatActivity2, kVar, a, aVDmtTabLayout, this.f116569D, this.f116570E);
            aVar.mo92917a(str, view);
            this.f116567A = aVar;
        }
        if (this.f116574z == null) {
            AppCompatActivity appCompatActivity3 = this.f116257c;
            C52711k.m112236a((Object) appCompatActivity3, "mActivity");
            AVDmtTabLayout aVDmtTabLayout2 = this.f116273s;
            C52711k.m112236a((Object) aVDmtTabLayout2, "tabLayout");
            C46225b bVar = new C46225b(appCompatActivity3, kVar, a, aVDmtTabLayout2, this.f116569D);
            bVar.mo92930a(str, view);
            this.f116574z = bVar;
        }
        mo92910c(false);
    }
}
