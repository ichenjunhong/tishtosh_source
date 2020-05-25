package com.p683ss.android.ugc.gamora.recorder.p2465b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.als.C2763g;
import com.bytedance.als.C2767k;
import com.bytedance.common.utility.C9432q;
import com.bytedance.jedi.arch.C11787a;
import com.bytedance.jedi.arch.C11788aa;
import com.bytedance.jedi.arch.C11796d;
import com.bytedance.jedi.arch.C11866f;
import com.bytedance.jedi.arch.C11910j;
import com.bytedance.jedi.arch.C11931r;
import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.C11934u;
import com.bytedance.jedi.arch.C11937x;
import com.bytedance.jedi.arch.C11938y;
import com.bytedance.jedi.arch.C11939z;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.C12924i;
import com.p683ss.android.ugc.aweme.adaptation.C22452a;
import com.p683ss.android.ugc.aweme.shortvideo.C43225dr;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.p2217n.C44330b;
import com.p683ss.android.ugc.aweme.shortvideo.widget.TabHost;
import com.p683ss.android.ugc.aweme.shortvideo.widget.TabHost.C45587a;
import com.p683ss.android.ugc.aweme.shortvideo.widget.TabItemView;
import com.p683ss.android.ugc.aweme.views.EdgeTransparentView;
import com.p683ss.android.ugc.gamora.jedi.C49548a;
import com.p683ss.android.ugc.gamora.jedi.C49548a.C49549a;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.jedi.C49562i;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p069b.C1690c;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2640a.C52688s;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.gamora.recorder.b.h */
public final class C49596h extends C12924i implements C49548a {

    /* renamed from: i */
    static final /* synthetic */ C52767h[] f124417i = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49596h.class), "tabContainer", "getTabContainer()Landroid/widget/LinearLayout;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49596h.class), "bottomDot", "getBottomDot()Landroid/view/View;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49596h.class), "tabTextLayout", "getTabTextLayout()Lcom/ss/android/ugc/aweme/views/EdgeTransparentView;"))};

    /* renamed from: r */
    public static final C49597a f124418r = new C49597a(null);

    /* renamed from: j */
    ShortVideoContext f124419j;

    /* renamed from: k */
    public TabHost f124420k;

    /* renamed from: l */
    ObjectAnimator f124421l;

    /* renamed from: m */
    ObjectAnimator f124422m;

    /* renamed from: n */
    public int f124423n = 1;

    /* renamed from: o */
    boolean f124424o = true;

    /* renamed from: p */
    public boolean f124425p = true;

    /* renamed from: q */
    public final C49580e f124426q;

    /* renamed from: s */
    private C43225dr f124427s;

    /* renamed from: t */
    private final C52668f f124428t = C52732g.m112285a(new C49602f(this));

    /* renamed from: u */
    private final C52668f f124429u = C52732g.m112285a(new C49598b(this));

    /* renamed from: v */
    private final C52668f f124430v = C52732g.m112285a(new C49603g(this));

    /* renamed from: w */
    private final C2763g<Boolean> f124431w;

    /* renamed from: com.ss.android.ugc.gamora.recorder.b.h$a */
    public static final class C49597a {
        private C49597a() {
        }

        public /* synthetic */ C49597a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.b.h$b */
    static final class C49598b extends C52712l implements C52670a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ C49596h f124432a;

        C49598b(C49596h hVar) {
            this.f124432a = hVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ImageView) C49596h.m107025a(this.f124432a).findViewById(R.id.c_o);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.b.h$c */
    public static final class C49599c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C49596h f124433a;

        C49599c(C49596h hVar) {
            this.f124433a = hVar;
        }

        public final void onAnimationEnd(Animator animator) {
            if (this.f124433a.f124423n == 0) {
                C49596h.m107025a(this.f124433a).setVisibility(8);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.b.h$d */
    static final class C49600d implements C45587a {

        /* renamed from: a */
        final /* synthetic */ C49596h f124434a;

        C49600d(C49596h hVar) {
            this.f124434a = hVar;
        }

        /* renamed from: a */
        public final boolean mo91952a() {
            boolean z;
            boolean z2;
            C49596h hVar = this.f124434a;
            ObjectAnimator objectAnimator = hVar.f124422m;
            if (objectAnimator == null || !objectAnimator.isRunning()) {
                z = false;
            } else {
                z = true;
            }
            ObjectAnimator objectAnimator2 = hVar.f124421l;
            if (objectAnimator2 == null || !objectAnimator2.isRunning()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z || z2 || hVar.f124423n == 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.b.h$e */
    static final class C49601e<T> implements C2767k<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C49596h f124435a;

        C49601e(C49596h hVar) {
            this.f124435a = hVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Boolean bool = (Boolean) obj;
            LayoutParams layoutParams = C49596h.m107025a(this.f124435a).getLayoutParams();
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                C52711k.m112236a((Object) bool, "it");
                if (bool.booleanValue()) {
                    i = (C22452a.m55497c() - ((int) C9432q.m18687b((Context) this.f124435a.mo24477v(), 40.0f))) / 2;
                } else {
                    i = 0;
                }
                marginLayoutParams.bottomMargin = i;
                C49596h.m107025a(this.f124435a).setLayoutParams(marginLayoutParams);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.b.h$f */
    static final class C49602f extends C52712l implements C52670a<LinearLayout> {

        /* renamed from: a */
        final /* synthetic */ C49596h f124436a;

        C49602f(C49596h hVar) {
            this.f124436a = hVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (LinearLayout) C49596h.m107025a(this.f124436a).findViewById(R.id.yw);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.b.h$g */
    static final class C49603g extends C52712l implements C52670a<EdgeTransparentView> {

        /* renamed from: a */
        final /* synthetic */ C49596h f124437a;

        C49603g(C49596h hVar) {
            this.f124437a = hVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (EdgeTransparentView) C49596h.m107025a(this.f124437a).findViewById(R.id.ez6);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: F */
    public final LinearLayout mo97500F() {
        return (LinearLayout) this.f124428t.getValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: G */
    public final View mo97501G() {
        return (View) this.f124429u.getValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: H */
    public final EdgeTransparentView mo97502H() {
        return (EdgeTransparentView) this.f124430v.getValue();
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11932s, R> R mo22552a(VM1 vm1, C52671b<? super S1, ? extends R> bVar) {
        C52711k.m112240b(vm1, "viewModel1");
        C52711k.m112240b(bVar, "block");
        return C49549a.m106924a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final void mo97506a(int i, boolean z, boolean z2) {
        if (z) {
            TabHost tabHost = this.f124420k;
            if (tabHost == null) {
                C52711k.m112237a("tabHost");
            }
            tabHost.mo91935a(i, z2);
            return;
        }
        TabHost tabHost2 = this.f124420k;
        if (tabHost2 == null) {
            C52711k.m112237a("tabHost");
        }
        tabHost2.mo91936b(i, z2);
    }

    /* renamed from: a */
    public final void mo97507a(Animation animation) {
        C52711k.m112240b(animation, "animation");
        TabHost tabHost = this.f124420k;
        if (tabHost == null) {
            C52711k.m112237a("tabHost");
        }
        tabHost.clearAnimation();
        TabHost tabHost2 = this.f124420k;
        if (tabHost2 == null) {
            C52711k.m112237a("tabHost");
        }
        tabHost2.startAnimation(animation);
    }

    /* renamed from: a */
    public final void mo97508a(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            LinearLayout F = mo97500F();
            C52711k.m112236a((Object) F, "tabContainer");
            if (F.getChildCount() > 0) {
                int i = 0;
                LinearLayout F2 = mo97500F();
                C52711k.m112236a((Object) F2, "tabContainer");
                int childCount = F2.getChildCount();
                while (i < childCount) {
                    View childAt = mo97500F().getChildAt(i);
                    if (childAt != null && (childAt instanceof TabItemView)) {
                        TabItemView tabItemView = (TabItemView) childAt;
                        if (C52711k.m112239a((Object) str, tabItemView.getTag())) {
                            tabItemView.mo91954a(str2);
                            ShortVideoContext shortVideoContext = this.f124419j;
                            if (shortVideoContext == null) {
                                C52711k.m112237a("shortVideoContext");
                            }
                            C44330b.m97097a(shortVideoContext.f107132y);
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: I */
    public final boolean mo97503I() {
        if (this.f124423n == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final C11910j mo22553c() {
        return C49549a.m106927b(this);
    }

    /* renamed from: d */
    public final C11931r<C11866f> mo22554d() {
        return C49549a.m106934d(this);
    }

    /* renamed from: f */
    public final boolean mo22555f() {
        return C49549a.m106935e(this);
    }

    /* renamed from: h */
    public final C0184k mo22626h() {
        return C49549a.m106918a(this);
    }

    /* renamed from: i */
    public final /* synthetic */ C11796d mo22645i() {
        return C49549a.m106930c(this);
    }

    /* renamed from: J */
    public final Object mo97504J() {
        TabHost tabHost = this.f124420k;
        if (tabHost == null) {
            C52711k.m112237a("tabHost");
        }
        TabHost tabHost2 = this.f124420k;
        if (tabHost2 == null) {
            C52711k.m112237a("tabHost");
        }
        return tabHost.mo91934a(tabHost2.getCurrentIndex());
    }

    /* renamed from: a */
    public static final /* synthetic */ TabHost m107025a(C49596h hVar) {
        TabHost tabHost = hVar.f124420k;
        if (tabHost == null) {
            C52711k.m112237a("tabHost");
        }
        return tabHost;
    }

    /* renamed from: a */
    public final int mo97505a(Object obj) {
        C52711k.m112240b(obj, "tag");
        TabHost tabHost = this.f124420k;
        if (tabHost == null) {
            C52711k.m112237a("tabHost");
        }
        int tabCount = tabHost.getTabCount();
        for (int i = 0; i < tabCount; i++) {
            TabHost tabHost2 = this.f124420k;
            if (tabHost2 == null) {
                C52711k.m112237a("tabHost");
            }
            if (C52711k.m112239a(obj, tabHost2.mo91934a(i))) {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0102, code lost:
        if (r7.isXsSupport() == false) goto L_0x0104;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24448e(android.os.Bundle r7) {
        /*
            r6 = this;
            super.mo24448e(r7)
            com.bytedance.scene.t r7 = r6.mo24460E()
            java.lang.String r0 = "owner"
            java.lang.Object r7 = r7.mo24560a(r0)
            if (r7 != 0) goto L_0x0012
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0012:
            com.ss.android.ugc.aweme.shortvideo.dr r7 = (com.p683ss.android.ugc.aweme.shortvideo.C43225dr) r7
            r6.f124427s = r7
            android.app.Activity r7 = r6.mo24477v()
            if (r7 == 0) goto L_0x0120
            android.support.v4.app.FragmentActivity r7 = (android.support.p030v4.app.FragmentActivity) r7
            android.arch.lifecycle.y r7 = android.arch.lifecycle.C0214z.m440a(r7)
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel> r0 = com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel.class
            android.arch.lifecycle.x r7 = r7.mo359a(r0)
            java.lang.String r0 = "ViewModelProviders.of(re…extViewModel::class.java)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r0)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel r7 = (com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel) r7
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r7 = r7.f107134a
            java.lang.String r0 = "ViewModelProviders.of(re…s.java).shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r0)
            r6.f124419j = r7
            r7 = 2132017735(0x7f140247, float:1.9673757E38)
            android.view.View r7 = r6.mo24467j_(r7)
            java.lang.String r0 = "requireViewById(R.id.bottom_tab_host)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r0)
            com.ss.android.ugc.aweme.shortvideo.widget.TabHost r7 = (com.p683ss.android.ugc.aweme.shortvideo.widget.TabHost) r7
            r6.f124420k = r7
            com.ss.android.ugc.aweme.shortvideo.widget.TabHost r7 = r6.f124420k
            if (r7 != 0) goto L_0x0051
            java.lang.String r0 = "tabHost"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0051:
            com.ss.android.ugc.gamora.recorder.b.h$d r0 = new com.ss.android.ugc.gamora.recorder.b.h$d
            r0.<init>(r6)
            com.ss.android.ugc.aweme.shortvideo.widget.TabHost$a r0 = (com.p683ss.android.ugc.aweme.shortvideo.widget.TabHost.C45587a) r0
            r7.setOnAnimationRunningLisntener(r0)
            com.ss.android.ugc.gamora.recorder.b.e r7 = r6.f124426q
            com.ss.android.ugc.aweme.shortvideo.dr r0 = r6.f124427s
            if (r0 != 0) goto L_0x0066
            java.lang.String r1 = "ownerHost"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0066:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r6.f124419j
            if (r1 != 0) goto L_0x006f
            java.lang.String r2 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x006f:
            com.ss.android.ugc.aweme.shortvideo.widget.TabHost r2 = r6.f124420k
            if (r2 != 0) goto L_0x0078
            java.lang.String r3 = "tabHost"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0078:
            java.lang.String r3 = "mOwner"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r3)
            java.lang.String r0 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r0)
            java.lang.String r0 = "bottomTabHost"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r0)
            r7.f124370g = r1
            r7.f124369f = r2
            com.ss.android.ugc.aweme.shortvideo.record.b r0 = new com.ss.android.ugc.aweme.shortvideo.record.b
            com.ss.android.ugc.aweme.shortvideo.widget.TabHost r1 = r7.f124369f
            if (r1 != 0) goto L_0x0096
            java.lang.String r2 = "bottomTabHost"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0096:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r7.f124370g
            if (r2 != 0) goto L_0x009f
            java.lang.String r3 = "shortVideoContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x009f:
            r0.<init>(r1, r2)
            java.util.List<com.ss.android.ugc.gamora.recorder.b.f> r1 = r7.f124364a
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x00aa:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00c7
            java.lang.Object r2 = r1.next()
            com.ss.android.ugc.gamora.recorder.b.f r2 = (com.p683ss.android.ugc.gamora.recorder.p2465b.C49582f) r2
            r3 = -1
            com.ss.android.ugc.gamora.recorder.b.d r4 = r2.f124373b
            java.lang.String r4 = r4.f124359b
            com.ss.android.ugc.gamora.recorder.b.d r5 = r2.f124373b
            int r5 = r5.f124358a
            com.ss.android.ugc.gamora.recorder.b.d r2 = r2.f124373b
            java.lang.String r2 = r2.f124360c
            r0.mo90336a(r3, r4, r5, r2)
            goto L_0x00aa
        L_0x00c7:
            r7.f124368e = r0
            com.ss.android.ugc.aweme.shortvideo.widget.TabHost r0 = r7.f124369f
            if (r0 != 0) goto L_0x00d2
            java.lang.String r1 = "bottomTabHost"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x00d2:
            com.ss.android.ugc.gamora.recorder.b.e$a r1 = new com.ss.android.ugc.gamora.recorder.b.e$a
            r1.<init>(r7)
            com.ss.android.ugc.aweme.shortvideo.widget.TabHost$b r1 = (com.p683ss.android.ugc.aweme.shortvideo.widget.TabHost.C45588b) r1
            r0.setOnIndexChangedListener(r1)
            com.bytedance.als.g<java.lang.Boolean> r7 = r6.f124431w
            r0 = r6
            android.arch.lifecycle.k r0 = (android.arch.lifecycle.C0184k) r0
            com.ss.android.ugc.gamora.recorder.b.h$e r1 = new com.ss.android.ugc.gamora.recorder.b.h$e
            r1.<init>(r6)
            com.bytedance.als.k r1 = (com.bytedance.als.C2767k) r1
            r7.mo7352a(r0, r1)
            boolean r7 = r6.f124425p
            if (r7 == 0) goto L_0x0104
            com.ss.android.ugc.aweme.services.IInternalAVService r7 = com.p683ss.android.ugc.aweme.out.AVServiceImpl.createIInternalAVServicebyMonsterPlugin()
            com.ss.android.ugc.aweme.services.IInternalAVService r7 = (com.p683ss.android.ugc.aweme.services.IInternalAVService) r7
            com.ss.android.ugc.aweme.services.settings.IAVSettingsService r7 = r7.avSettingsService()
            java.lang.String r0 = "ServiceManager.get().get…java).avSettingsService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r0)
            boolean r7 = r7.isXsSupport()
            if (r7 != 0) goto L_0x010c
        L_0x0104:
            com.ss.android.ugc.aweme.views.EdgeTransparentView r7 = r6.mo97502H()
            r0 = 0
            r7.setDrawSize(r0)
        L_0x010c:
            com.ss.android.ugc.aweme.views.EdgeTransparentView r7 = r6.mo97502H()
            android.app.Activity r0 = r6.mo24477v()
            android.content.Context r0 = (android.content.Context) r0
            r1 = 1113587712(0x42600000, float:56.0)
            float r0 = com.bytedance.common.utility.C9432q.m18687b(r0, r1)
            r7.setPivotX(r0)
            return
        L_0x0120:
            d.u r7 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.recorder.p2465b.C49596h.mo24448e(android.os.Bundle):void");
    }

    public C49596h(C49580e eVar, C2763g<Boolean> gVar) {
        C52711k.m112240b(eVar, "bottomTabManager");
        C52711k.m112240b(gVar, "relayoutEvent");
        this.f124426q = eVar;
        this.f124431w = gVar;
    }

    /* renamed from: a */
    public final View mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.atn, viewGroup, false);
        C52711k.m112236a((Object) inflate, "inflater.inflate(R.layou…_scene, container, false)");
        return inflate;
    }

    /* renamed from: a */
    public final <S extends C11932s> C1690c mo22546a(JediViewModel<S> jediViewModel, C11934u<S> uVar, C52682m<? super C11866f, ? super S, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribe");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C49549a.m106919a(this, jediViewModel, uVar, mVar);
    }

    /* renamed from: b */
    public final <S extends C11932s, A> void mo49443b(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C11934u<C11937x<A>> uVar, C52682m<? super C49548a, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$selectNonNullSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        C49549a.m106925a(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: c */
    public final <S extends C11932s, A> void mo49444c(JediViewModel<S> jediViewModel, C52771j<S, ? extends C49555b<? extends A>> jVar, C11934u<C11937x<C49555b<A>>> uVar, C52682m<? super C49548a, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribeEvent");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        C49549a.m106928b(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: d */
    public final <S extends C11932s, A> void mo49445d(JediViewModel<S> jediViewModel, C52771j<S, ? extends C49562i<? extends A>> jVar, C11934u<C11937x<C49562i<A>>> uVar, C52682m<? super C49548a, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribeMultiEvent");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        C49549a.m106931c(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A> C1690c mo22547a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C11934u<C11937x<A>> uVar, C52682m<? super C11866f, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C49549a.m106933d(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B> C1690c mo22549a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C11934u<C11938y<A, B>> uVar, C52686q<? super C11866f, ? super A, ? super B, C52860x> qVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(qVar, "subscriber");
        return C49549a.m106921a(this, jediViewModel, jVar, jVar2, uVar, qVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, T> C1690c mo22548a(JediViewModel<S> jediViewModel, C52771j<S, ? extends C11787a<? extends T>> jVar, C11934u<C11937x<C11787a<T>>> uVar, C52682m<? super C11866f, ? super Throwable, C52860x> mVar, C52671b<? super C11866f, C52860x> bVar, C52682m<? super C11866f, ? super T, C52860x> mVar2) {
        C52711k.m112240b(jediViewModel, "$this$asyncSubscribe");
        C52711k.m112240b(jVar, "prop");
        C52711k.m112240b(uVar, "config");
        return C49549a.m106920a((C49548a) this, jediViewModel, jVar, uVar, mVar, bVar, mVar2);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B, C> C1690c mo22550a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C52771j<S, ? extends C> jVar3, C11934u<C11939z<A, B, C>> uVar, C52687r<? super C11866f, ? super A, ? super B, ? super C, C52860x> rVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(jVar3, "prop3");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(rVar, "subscriber");
        return C49549a.m106922a((C49548a) this, jediViewModel, jVar, jVar2, jVar3, uVar, rVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B, C, D> C1690c mo22551a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C52771j<S, ? extends C> jVar3, C52771j<S, ? extends D> jVar4, C11934u<C11788aa<A, B, C, D>> uVar, C52688s<? super C11866f, ? super A, ? super B, ? super C, ? super D, C52860x> sVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(jVar3, "prop3");
        C52711k.m112240b(jVar4, "prop4");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(sVar, "subscriber");
        return C49549a.m106923a(this, jediViewModel, jVar, jVar2, jVar3, jVar4, uVar, sVar);
    }
}
