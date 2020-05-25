package com.p683ss.android.ugc.aweme.filter.view.internal.main;

import android.view.KeyEvent;
import com.p683ss.android.ugc.aweme.filter.view.internal.C31660h;
import com.p683ss.android.ugc.aweme.filter.view.p1750a.C31607c;
import com.p683ss.android.ugc.aweme.filter.view.p1750a.C31608d;
import com.p683ss.android.ugc.aweme.filter.view.p1750a.C31610f;
import com.p683ss.android.ugc.aweme.filter.view.p1750a.C31615j;
import com.p683ss.android.ugc.tools.view.p2508a.C50206a;
import com.p683ss.android.ugc.tools.view.p2508a.C50207b;
import p064c.p065a.C2201v;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p072e.p074b.C1723a;
import p064c.p065a.p094l.C2180b;
import p064c.p065a.p094l.C2189f;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.k */
public class C31711k implements C31660h {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f82829a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C31711k.class), "filterView", "getFilterView()Lcom/ss/android/ugc/aweme/filter/view/api/IFilterView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C31711k.class), "filterBoxView", "getFilterBoxView()Lcom/ss/android/ugc/aweme/filter/view/api/IFilterBoxView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C31711k.class), "onKeyDownListener", "getOnKeyDownListener()Lcom/ss/android/ugc/tools/view/activity/AVActivityOnKeyDownListener;"))};

    /* renamed from: b */
    public final C1689b f82830b = new C1689b();

    /* renamed from: c */
    public C31712a f82831c = C31712a.HIDE;

    /* renamed from: d */
    public final C52670a<C31615j> f82832d;

    /* renamed from: e */
    public final C52670a<C31610f> f82833e;

    /* renamed from: f */
    public final C52670a<C52860x> f82834f;

    /* renamed from: g */
    private final C2189f<Boolean> f82835g;

    /* renamed from: h */
    private final C52668f f82836h = C52732g.m112285a(new C31715c(this));

    /* renamed from: i */
    private final C52668f f82837i = C52732g.m112285a(new C31713b(this));

    /* renamed from: j */
    private final C52668f f82838j = C52732g.m112285a(new C31717d(this));

    /* renamed from: k */
    private final C50207b f82839k;

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.k$a */
    enum C31712a {
        FILTER_BOX_SHOW,
        FILTER_VIEW_SHOW,
        HIDE
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.k$b */
    static final class C31713b extends C52712l implements C52670a<C31610f> {

        /* renamed from: a */
        final /* synthetic */ C31711k f82844a;

        C31713b(C31711k kVar) {
            this.f82844a = kVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C31610f fVar = (C31610f) this.f82844a.f82833e.invoke();
            this.f82844a.f82830b.mo6181a(fVar.mo64490e().mo6505a((C1710e<? super T>) new C1710e<C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C31713b f82845a;

                {
                    this.f82845a = r1;
                }

                public final /* synthetic */ void accept(Object obj) {
                    C52860x xVar = (C52860x) obj;
                    if (this.f82845a.f82844a.f82831c == C31712a.FILTER_BOX_SHOW) {
                        this.f82845a.f82844a.mo64603a(C31712a.FILTER_VIEW_SHOW, true);
                    }
                }
            }, C1723a.f5846e));
            return fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.k$c */
    static final class C31715c extends C52712l implements C52670a<C31615j> {

        /* renamed from: a */
        final /* synthetic */ C31711k f82846a;

        C31715c(C31711k kVar) {
            this.f82846a = kVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C31615j jVar = (C31615j) this.f82846a.f82832d.invoke();
            this.f82846a.f82830b.mo6181a(jVar.mo64512h().mo6505a((C1710e<? super T>) new C1710e<C31607c>(this) {

                /* renamed from: a */
                final /* synthetic */ C31715c f82847a;

                {
                    this.f82847a = r1;
                }

                public final /* synthetic */ void accept(Object obj) {
                    C31607c cVar = (C31607c) obj;
                    if (cVar.f82613a == C31608d.FILTER_BOX_ENTRANCE_CLICK && this.f82847a.f82846a.f82831c == C31712a.FILTER_VIEW_SHOW) {
                        C52670a<C52860x> aVar = this.f82847a.f82846a.f82834f;
                        if (aVar == null || ((C52860x) aVar.invoke()) == null) {
                            this.f82847a.f82846a.mo64603a(C31712a.FILTER_BOX_SHOW, true);
                        }
                    }
                    if (cVar.f82613a == C31608d.OUTSIDE_TOUCH && this.f82847a.f82846a.f82831c == C31712a.FILTER_VIEW_SHOW) {
                        this.f82847a.f82846a.mo64603a(C31712a.HIDE, true);
                    }
                }
            }, C1723a.f5846e));
            return jVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.k$d */
    static final class C31717d extends C52712l implements C52670a<C50206a> {

        /* renamed from: a */
        final /* synthetic */ C31711k f82848a;

        C31717d(C31711k kVar) {
            this.f82848a = kVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C50206a(this) {

                /* renamed from: a */
                final /* synthetic */ C31717d f82849a;

                {
                    this.f82849a = r1;
                }

                /* renamed from: a */
                public final boolean mo58985a(int i, KeyEvent keyEvent) {
                    if (i != 4) {
                        return false;
                    }
                    if (this.f82849a.f82848a.f82831c == C31712a.FILTER_BOX_SHOW) {
                        this.f82849a.f82848a.mo64603a(C31712a.FILTER_VIEW_SHOW, true);
                    } else if (this.f82849a.f82848a.f82831c == C31712a.FILTER_VIEW_SHOW) {
                        this.f82849a.f82848a.mo64603a(C31712a.HIDE, true);
                    }
                    return true;
                }
            };
        }
    }

    /* renamed from: e */
    private C31615j m73660e() {
        return (C31615j) this.f82836h.getValue();
    }

    /* renamed from: f */
    private C31610f m73661f() {
        return (C31610f) this.f82837i.getValue();
    }

    /* renamed from: g */
    private final C50206a m73662g() {
        return (C50206a) this.f82838j.getValue();
    }

    /* renamed from: a */
    public final void mo64570a() {
        mo64603a(C31712a.FILTER_VIEW_SHOW, false);
    }

    /* renamed from: b */
    public final void mo64571b() {
        mo64603a(C31712a.FILTER_BOX_SHOW, false);
    }

    /* renamed from: c */
    public final void mo64572c() {
        mo64603a(C31712a.HIDE, false);
    }

    /* renamed from: d */
    public final C2201v<Boolean> mo64573d() {
        C2201v<Boolean> e = this.f82835g.mo6542e();
        C52711k.m112236a((Object) e, "showHideSubject.hide()");
        return e;
    }

    /* renamed from: a */
    public final void mo64603a(C31712a aVar, boolean z) {
        C31712a aVar2 = this.f82831c;
        if (aVar2 != aVar) {
            switch (C31719l.f82850a[aVar.ordinal()]) {
                case 1:
                    m73661f().mo64486a();
                    if (aVar2 == C31712a.FILTER_VIEW_SHOW) {
                        m73660e().mo64507c();
                        break;
                    }
                    break;
                case 2:
                    m73660e().mo64506b();
                    if (aVar2 == C31712a.FILTER_BOX_SHOW) {
                        m73661f().mo64487b();
                        break;
                    }
                    break;
                case 3:
                    if (aVar2 == C31712a.FILTER_VIEW_SHOW) {
                        m73660e().mo64507c();
                    }
                    if (aVar2 == C31712a.FILTER_BOX_SHOW) {
                        m73661f().mo64487b();
                        break;
                    }
                    break;
            }
            this.f82831c = aVar;
            if (aVar2 == C31712a.HIDE) {
                C50207b bVar = this.f82839k;
                if (bVar != null) {
                    bVar.mo94977a(m73662g());
                }
                this.f82835g.onNext(Boolean.valueOf(true));
                return;
            }
            if (aVar == C31712a.HIDE) {
                C50207b bVar2 = this.f82839k;
                if (bVar2 != null) {
                    bVar2.mo94978b(m73662g());
                }
                this.f82835g.onNext(Boolean.valueOf(false));
            }
        }
    }

    public C31711k(C52670a<? extends C31615j> aVar, C52670a<? extends C31610f> aVar2, C50207b bVar, C52670a<C52860x> aVar3) {
        C52711k.m112240b(aVar, "filterViewProvider");
        C52711k.m112240b(aVar2, "filterBoxViewProvider");
        this.f82832d = aVar;
        this.f82833e = aVar2;
        this.f82839k = bVar;
        this.f82834f = aVar3;
        C2180b l = C2180b.m6534l();
        C52711k.m112236a((Object) l, "PublishSubject.create()");
        this.f82835g = l;
    }
}
