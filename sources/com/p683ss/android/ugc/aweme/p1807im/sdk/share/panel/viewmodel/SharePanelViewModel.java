package com.p683ss.android.ugc.aweme.p1807im.sdk.share.panel.viewmodel;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.C34983g;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1877a.C34886b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1877a.p1878a.C34883a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1877a.p1878a.C34884b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1881b.C34920d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1881b.C34920d.C34921a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.p1887a.C35102b;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel */
public final class SharePanelViewModel implements C0183j, C34883a, C34920d<IMContact> {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f90440a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SharePanelViewModel.class), "contactList", "getContactList()Ljava/util/List;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SharePanelViewModel.class), "selectContactList", "getSelectContactList()Ljava/util/Set;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SharePanelViewModel.class), "userActiveStatusMap", "getUserActiveStatusMap()Ljava/util/Map;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SharePanelViewModel.class), "hasMobActiveStatusUserIdList", "getHasMobActiveStatusUserIdList()Ljava/util/Set;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SharePanelViewModel.class), "hasMobHeaderShow", "getHasMobHeaderShow()Ljava/util/Set;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SharePanelViewModel.class), "userActiveStatusObservers", "getUserActiveStatusObservers()Ljava/util/Set;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SharePanelViewModel.class), "relationModel", "getRelationModel()Lcom/ss/android/ugc/aweme/im/sdk/relations/core/SharePanelRelationModel;"))};

    /* renamed from: d */
    public static final C35168a f90441d = new C35168a(null);

    /* renamed from: b */
    public C35176a f90442b;

    /* renamed from: c */
    public SharePackage f90443c;

    /* renamed from: e */
    private final C52668f f90444e = C52732g.m112285a(C35169b.f90451a);

    /* renamed from: f */
    private final C52668f f90445f = C52732g.m112285a(C35173f.f90455a);

    /* renamed from: g */
    private final C52668f f90446g = C52732g.m112285a(C35174g.f90456a);

    /* renamed from: h */
    private final C52668f f90447h = C52732g.m112285a(C35170c.f90452a);

    /* renamed from: i */
    private final C52668f f90448i = C52732g.m112285a(C35171d.f90453a);

    /* renamed from: j */
    private final C52668f f90449j = C52732g.m112285a(C35175h.f90457a);

    /* renamed from: k */
    private final C52668f f90450k = C52732g.m112285a(new C35172e(this));

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel$a */
    public static final class C35168a {
        private C35168a() {
        }

        public /* synthetic */ C35168a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel$b */
    static final class C35169b extends C52712l implements C52670a<List<IMContact>> {

        /* renamed from: a */
        public static final C35169b f90451a = new C35169b();

        C35169b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel$c */
    static final class C35170c extends C52712l implements C52670a<Set<String>> {

        /* renamed from: a */
        public static final C35170c f90452a = new C35170c();

        C35170c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new LinkedHashSet();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel$d */
    static final class C35171d extends C52712l implements C52670a<Set<String>> {

        /* renamed from: a */
        public static final C35171d f90453a = new C35171d();

        C35171d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new LinkedHashSet();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel$e */
    static final class C35172e extends C52712l implements C52670a<C34983g> {

        /* renamed from: a */
        final /* synthetic */ SharePanelViewModel f90454a;

        C35172e(SharePanelViewModel sharePanelViewModel) {
            this.f90454a = sharePanelViewModel;
            super(0);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x003c, code lost:
            if (r1 == false) goto L_0x003f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke() {
            /*
                r5 = this;
                com.ss.android.ugc.aweme.im.sdk.relations.core.e.a r0 = new com.ss.android.ugc.aweme.im.sdk.relations.core.e.a
                com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel r1 = r5.f90454a
                com.ss.android.ugc.aweme.sharer.ui.SharePackage r1 = r1.f90443c
                boolean r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35276n.m79758a(r1)
                r2 = 1
                r0.<init>(r2, r1)
                com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel r1 = r5.f90454a
                com.ss.android.ugc.aweme.sharer.ui.SharePackage r1 = r1.f90443c
                if (r1 == 0) goto L_0x0017
                java.lang.String r1 = r1.f106895d
                goto L_0x0018
            L_0x0017:
                r1 = 0
            L_0x0018:
                java.lang.String r3 = "aweme"
                boolean r1 = p2628d.p2639f.p2641b.C52711k.m112239a(r1, r3)
                r3 = 0
                if (r1 == 0) goto L_0x003f
                com.ss.android.ugc.aweme.im.sdk.d.b r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b.m77717a()
                java.lang.String r4 = "AwemeImManager.instance()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r4)
                com.ss.android.ugc.aweme.im.service.j r1 = r1.mo71949f()
                if (r1 == 0) goto L_0x003b
                com.ss.android.ugc.aweme.im.service.h r1 = r1.getFamiliarProxy()
                if (r1 == 0) goto L_0x003b
                boolean r1 = r1.mo73748a()
                goto L_0x003c
            L_0x003b:
                r1 = 0
            L_0x003c:
                if (r1 == 0) goto L_0x003f
                goto L_0x0040
            L_0x003f:
                r2 = 0
            L_0x0040:
                r0.f89968d = r2
                com.ss.android.ugc.aweme.im.sdk.relations.core.g r1 = new com.ss.android.ugc.aweme.im.sdk.relations.core.g
                r1.<init>(r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.share.panel.viewmodel.SharePanelViewModel.C35172e.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel$f */
    static final class C35173f extends C52712l implements C52670a<Set<IMContact>> {

        /* renamed from: a */
        public static final C35173f f90455a = new C35173f();

        C35173f() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new LinkedHashSet();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel$g */
    static final class C35174g extends C52712l implements C52670a<Map<String, Long>> {

        /* renamed from: a */
        public static final C35174g f90456a = new C35174g();

        C35174g() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new LinkedHashMap();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel$h */
    static final class C35175h extends C52712l implements C52670a<Set<C52670a<? extends C52860x>>> {

        /* renamed from: a */
        public static final C35175h f90457a = new C35175h();

        C35175h() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new LinkedHashSet();
        }
    }

    /* renamed from: g */
    private List<IMContact> m79405g() {
        return (List) this.f90444e.getValue();
    }

    /* renamed from: a */
    public final Set<IMContact> mo73280a() {
        return (Set) this.f90445f.getValue();
    }

    /* renamed from: b */
    public final Map<String, Long> mo73282b() {
        return (Map) this.f90446g.getValue();
    }

    /* renamed from: c */
    public final Set<String> mo73283c() {
        return (Set) this.f90447h.getValue();
    }

    /* renamed from: d */
    public final Set<String> mo73284d() {
        return (Set) this.f90448i.getValue();
    }

    /* renamed from: e */
    public final Set<C52670a<C52860x>> mo73285e() {
        return (Set) this.f90449j.getValue();
    }

    /* renamed from: f */
    public final C34983g mo73286f() {
        return (C34983g) this.f90450k.getValue();
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void onDestroy() {
        mo73286f().mo72988c();
        this.f90442b = null;
        this.f90443c = null;
        mo73285e().clear();
    }

    /* renamed from: a */
    public final void mo72983a(Throwable th) {
        C52711k.m112240b(th, "t");
        m79405g().clear();
        C35176a aVar = this.f90442b;
        if (aVar != null) {
            aVar.mo73252b(m79405g());
        }
    }

    /* renamed from: b */
    public final void mo72986b(Throwable th) {
        C52711k.m112240b(th, "t");
        C34921a.m79039a(this, th);
    }

    /* renamed from: c_ */
    public final void mo70689c_(Throwable th) {
        StringBuilder sb = new StringBuilder("SharePanelViewModel onUserActiveStatusFetchError: ");
        sb.append(th.getMessage());
        C32458a.m75144a(sb.toString());
    }

    public SharePanelViewModel(SharePackage sharePackage) {
        this.f90443c = sharePackage;
    }

    /* renamed from: a */
    private final void m79404a(List<IMContact> list) {
        Set linkedHashSet = new LinkedHashSet();
        for (IMContact iMContact : list) {
            if ((iMContact instanceof IMUser) && ((IMUser) iMContact).getFollowStatus() == 2) {
                linkedHashSet.add(iMContact);
            }
        }
        StringBuilder sb = new StringBuilder("SharePanelViewModel fetchUserActiveStatus: ");
        sb.append(list.size());
        sb.append(", ");
        sb.append(linkedHashSet.size());
        C32458a.m75144a(sb.toString());
        if (!linkedHashSet.isEmpty()) {
            C34886b.m78987a(C34884b.SHARE_PULL, linkedHashSet, this);
        }
    }

    /* renamed from: a */
    public final boolean mo73281a(IMContact iMContact, boolean z) {
        C52711k.m112240b(iMContact, "contact");
        C35176a aVar = this.f90442b;
        if (aVar != null) {
            return aVar.mo73251a(iMContact, z);
        }
        return false;
    }

    /* renamed from: b */
    public final void mo72987b(List<IMContact> list, boolean z) {
        C52711k.m112240b(list, "list");
        C34921a.m79040a(this, list, z);
    }

    /* renamed from: a */
    public final void mo72984a(List<IMContact> list, boolean z) {
        C52711k.m112240b(list, "list");
        new StringBuilder("onLoadSuccess: ");
        Iterable<IMContact> iterable = list;
        Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
        for (IMContact displayName : iterable) {
            arrayList.add(displayName.getDisplayName());
        }
        List a = C35102b.f90276c.mo73227a(list);
        m79405g().clear();
        m79405g().addAll(a);
        m79404a(m79405g());
        C35176a aVar = this.f90442b;
        if (aVar != null) {
            aVar.mo73252b(m79405g());
        }
    }
}
