package com.p683ss.android.ugc.aweme.p1807im.sdk.module.session;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.base.C23371a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.model.C34544a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.model.C34545b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.model.C34546c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.model.C34551h;
import com.p683ss.android.ugc.aweme.p1807im.sdk.model.C34552i;
import com.p683ss.android.ugc.aweme.p1807im.sdk.model.XPlanAwemeBannerConfig;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1811b.C33266a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1811b.C33266a.C33267a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1811b.C33268b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1811b.C33273c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1811b.C33289d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35243bl;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35284t;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35286u;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.l */
public final class C34628l {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f89207a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34628l.class), "container", "getContainer()Landroid/widget/LinearLayout;"))};

    /* renamed from: b */
    final List<C33266a> f89208b = new ArrayList();

    /* renamed from: c */
    public boolean f89209c = true;

    /* renamed from: d */
    public final Activity f89210d;

    /* renamed from: e */
    public final ViewGroup f89211e;

    /* renamed from: f */
    private final C52668f f89212f = C52732g.m112285a(new C34630b(this));

    /* renamed from: g */
    private final C33267a f89213g = new C34629a(this);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.l$a */
    public static final class C34629a implements C33267a {

        /* renamed from: a */
        final /* synthetic */ C34628l f89214a;

        C34629a(C34628l lVar) {
            this.f89214a = lVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.l$b */
    static final class C34630b extends C52712l implements C52670a<LinearLayout> {

        /* renamed from: a */
        final /* synthetic */ C34628l f89215a;

        C34630b(C34628l lVar) {
            this.f89215a = lVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (LinearLayout) this.f89215a.f89211e.findViewById(R.id.eii);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.l$c */
    static final class C34631c<T> implements C23371a<C34551h> {

        /* renamed from: a */
        final /* synthetic */ C34628l f89216a;

        /* renamed from: b */
        final /* synthetic */ Activity f89217b;

        C34631c(C34628l lVar, Activity activity) {
            this.f89216a = lVar;
            this.f89217b = activity;
        }

        public final /* synthetic */ void run(Object obj) {
            C34551h hVar = (C34551h) obj;
            if (hVar == null) {
                C35284t a = C35284t.m79782a();
                C52711k.m112236a((Object) a, "IMSPUtils.get()");
                hVar = a.mo73434l();
            }
            this.f89216a.mo72678a(this.f89217b, hVar);
        }
    }

    /* renamed from: a */
    private final LinearLayout m78578a() {
        return (LinearLayout) this.f89212f.getValue();
    }

    /* renamed from: b */
    private void m78579b() {
        LinearLayout a = m78578a();
        if (a != null) {
            a.removeAllViews();
        }
    }

    /* renamed from: a */
    public final void mo72677a(Activity activity) {
        C52711k.m112240b(activity, "activity");
        C35286u.m79872a((C23371a<C34551h>) new C34631c<C34551h>(this, activity));
    }

    /* renamed from: b */
    public final void mo72679b(Activity activity) {
        C35284t a = C35284t.m79782a();
        C52711k.m112236a((Object) a, "IMSPUtils.get()");
        XPlanAwemeBannerConfig m = a.mo73436m();
        if (m == null || !C35243bl.m79712b()) {
            if (activity == null) {
                C52711k.m112234a();
            }
            C35284t a2 = C35284t.m79782a();
            C52711k.m112236a((Object) a2, "IMSPUtils.get()");
            mo72678a(activity, a2.mo73434l());
            return;
        }
        C34546c a3 = C34546c.m78481a(m);
        C52711k.m112236a((Object) a3, "DxBannerData.transOldCon…dSessionListBannerConfig)");
        this.f89208b.clear();
        m78579b();
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(activity).inflate(R.layout.bgi, m78578a(), true).findViewById(R.id.et6);
        C52711k.m112236a((Object) viewGroup, "vg");
        C33273c cVar = new C33273c(viewGroup);
        cVar.f86292c.setVisibility(0);
        cVar.mo70614a(a3, this.f89209c);
        cVar.f86291b = this.f89213g;
        this.f89208b.add(cVar);
    }

    public C34628l(Activity activity, ViewGroup viewGroup) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(viewGroup, "headView");
        this.f89210d = activity;
        this.f89211e = viewGroup;
    }

    /* renamed from: a */
    public final void mo72678a(Activity activity, C34551h hVar) {
        if (hVar != null) {
            List<C34552i> list = hVar.f89076a;
            if (C9376b.m18558a((Collection<T>) list)) {
                C35284t a = C35284t.m79782a();
                C52711k.m112236a((Object) a, "IMSPUtils.get()");
                if (a.mo73436m() == null) {
                    m78579b();
                }
                return;
            }
            m78579b();
            this.f89208b.clear();
            C35284t.m79782a().mo73438n();
            for (C34552i iVar : list) {
                C52711k.m112236a((Object) iVar, "bannerData");
                int i = iVar.f89077a;
                C33266a aVar = null;
                if (i == C34545b.f89054a && C35243bl.m79712b()) {
                    View inflate = LayoutInflater.from(activity).inflate(R.layout.bgi, null, false);
                    if (inflate != null) {
                        ViewGroup viewGroup = (ViewGroup) inflate;
                        aVar = new C33273c(viewGroup);
                        m78578a().addView(viewGroup, new LayoutParams(-1, -2));
                        aVar.f86291b = this.f89213g;
                        C34546c cVar = iVar.f89078b;
                        C52711k.m112236a((Object) cVar, "bannerData.dxBannerData");
                        aVar.mo70614a(cVar, this.f89209c);
                    } else {
                        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
                    }
                } else if (i == C34545b.f89055b) {
                    View inflate2 = LayoutInflater.from(activity).inflate(R.layout.bga, null, false);
                    if (inflate2 != null) {
                        ViewGroup viewGroup2 = (ViewGroup) inflate2;
                        aVar = new C33268b(viewGroup2);
                        m78578a().addView(viewGroup2, new LayoutParams(-1, -2));
                        aVar.f86291b = this.f89213g;
                        C34544a aVar2 = iVar.f89079c;
                        C52711k.m112236a((Object) aVar2, "bannerData.activityBannerData");
                        aVar.mo70613a(aVar2, this.f89209c);
                    } else {
                        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
                    }
                } else if (i == C34545b.f89056c) {
                    View inflate3 = LayoutInflater.from(activity).inflate(R.layout.bg8, null, false);
                    if (inflate3 != null) {
                        ViewGroup viewGroup3 = (ViewGroup) inflate3;
                        aVar = new C33289d(viewGroup3);
                        m78578a().addView(viewGroup3, new LayoutParams(-1, -2));
                        aVar.f86291b = this.f89213g;
                        C34544a aVar3 = iVar.f89080d;
                        C52711k.m112236a((Object) aVar3, "bannerData.hProjectBannerData");
                        aVar.mo70613a(aVar3, this.f89209c);
                    } else {
                        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
                    }
                }
                if (aVar != null) {
                    this.f89208b.add(aVar);
                }
            }
        }
    }
}
