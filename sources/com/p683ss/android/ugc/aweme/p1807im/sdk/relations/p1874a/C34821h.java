package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a;

import android.arch.lifecycle.C0184k;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.model.C34979a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.model.MTRelationMemberListViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1876c.C34854a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1876c.C34861c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1876c.C34862d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1876c.C34865f;
import com.p683ss.android.ugc.aweme.p1807im.service.experiment.RefineShareInSiteExperiment;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import java.util.Collection;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52760c;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.h */
public final class C34821h extends C34799b<IMContact> {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f89716a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34821h.class), "mMemberListViewModel", "getMMemberListViewModel()Lcom/ss/android/ugc/aweme/im/sdk/relations/model/MTRelationMemberListViewModel;"))};

    /* renamed from: c */
    public static final C34824b f89717c = new C34824b(null);

    /* renamed from: b */
    public final C0184k f89718b;

    /* renamed from: e */
    private final C52668f f89719e;

    /* renamed from: f */
    private C52686q<? super Integer, ? super Integer, ? super View, C52860x> f89720f = new C34825c(this);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.h$a */
    public static final class C34822a extends C52712l implements C52670a<MTRelationMemberListViewModel> {

        /* renamed from: a */
        final /* synthetic */ C52760c f89721a;

        /* renamed from: b */
        final /* synthetic */ C0184k f89722b;

        /* renamed from: c */
        final /* synthetic */ C52760c f89723c;

        public C34822a(C52760c cVar, C0184k kVar, C52760c cVar2) {
            this.f89721a = cVar;
            this.f89722b = kVar;
            this.f89723c = cVar2;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.im.sdk.relations.model.MTRelationMemberListViewModel, android.arch.lifecycle.x] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v2, types: [com.ss.android.ugc.aweme.im.sdk.relations.model.MTRelationMemberListViewModel, android.arch.lifecycle.x]
          assigns: [android.arch.lifecycle.x]
          uses: [com.ss.android.ugc.aweme.im.sdk.relations.model.MTRelationMemberListViewModel]
          mth insns count: 26
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p683ss.android.ugc.aweme.p1807im.sdk.relations.model.MTRelationMemberListViewModel invoke() {
            /*
                r4 = this;
                com.ss.android.ugc.aweme.im.sdk.relations.a.h$a$1 r0 = new com.ss.android.ugc.aweme.im.sdk.relations.a.h$a$1
                r0.<init>(r4)
                android.arch.lifecycle.k r1 = r4.f89722b
                boolean r2 = r1 instanceof android.support.p030v4.app.Fragment
                r3 = 0
                if (r2 == 0) goto L_0x0017
                android.arch.lifecycle.k r1 = r4.f89722b
                android.support.v4.app.Fragment r1 = (android.support.p030v4.app.Fragment) r1
                android.arch.lifecycle.y$b r0 = (android.arch.lifecycle.C0210y.C0212b) r0
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m439a(r1, r0)
                goto L_0x0027
            L_0x0017:
                boolean r1 = r1 instanceof android.support.p030v4.app.FragmentActivity
                if (r1 == 0) goto L_0x0026
                android.arch.lifecycle.k r1 = r4.f89722b
                android.support.v4.app.FragmentActivity r1 = (android.support.p030v4.app.FragmentActivity) r1
                android.arch.lifecycle.y$b r0 = (android.arch.lifecycle.C0210y.C0212b) r0
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m441a(r1, r0)
                goto L_0x0027
            L_0x0026:
                r0 = r3
            L_0x0027:
                if (r0 == 0) goto L_0x0043
                d.k.c r1 = r4.f89723c
                java.lang.Class r1 = p2628d.p2639f.C52669a.m112219a(r1)
                java.lang.String r1 = r1.getName()
                java.lang.String r2 = "viewModelClass.java.name"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                d.k.c r2 = r4.f89721a
                java.lang.Class r2 = p2628d.p2639f.C52669a.m112219a(r2)
                android.arch.lifecycle.x r0 = r0.mo360a(r1, r2)
                return r0
            L_0x0043:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a.C34821h.C34822a.invoke():android.arch.lifecycle.x");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.h$b */
    public static final class C34824b {
        private C34824b() {
        }

        public /* synthetic */ C34824b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.h$c */
    static final class C34825c extends C52712l implements C52686q<Integer, Integer, View, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C34821h f89725a;

        C34825c(C34821h hVar) {
            this.f89725a = hVar;
            super(3);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00bf, code lost:
            if (r8 == null) goto L_0x00c1;
         */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00a3  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r6, java.lang.Object r7, java.lang.Object r8) {
            /*
                r5 = this;
                java.lang.Number r6 = (java.lang.Number) r6
                int r6 = r6.intValue()
                java.lang.Number r7 = (java.lang.Number) r7
                int r7 = r7.intValue()
                android.view.View r8 = (android.view.View) r8
                java.lang.String r0 = "view"
                p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
                switch(r6) {
                    case 0: goto L_0x0018;
                    case 1: goto L_0x0018;
                    case 2: goto L_0x0018;
                    default: goto L_0x0016;
                }
            L_0x0016:
                goto L_0x010e
            L_0x0018:
                com.ss.android.ugc.aweme.im.sdk.relations.a.h r6 = r5.f89725a
                java.lang.Object r6 = r6.mo70602b(r7)
                com.ss.android.ugc.aweme.im.service.model.IMContact r6 = (com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact) r6
                if (r6 == 0) goto L_0x010e
                com.ss.android.ugc.aweme.im.sdk.relations.a.h r8 = r5.f89725a
                com.ss.android.ugc.aweme.im.service.model.IMUser r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77749a(r6)
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x00a0
                java.lang.String r3 = r0.getUid()
                java.lang.CharSequence r4 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e.m79730b()
                java.lang.String r4 = r4.toString()
                boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r3, r4)
                if (r3 != 0) goto L_0x00a0
                int r0 = r0.getFollowStatus()
                r3 = 2
                if (r0 == r3) goto L_0x00a0
                com.ss.android.ugc.aweme.im.sdk.relations.model.MTRelationMemberListViewModel r8 = r8.mo72944m()
                if (r8 == 0) goto L_0x009e
                com.ss.android.ugc.aweme.sharer.ui.SharePackage r8 = r8.f90178c
                if (r8 != 0) goto L_0x0050
                goto L_0x009e
            L_0x0050:
                java.lang.String r8 = r8.f106895d
                int r0 = r8.hashCode()
                r3 = -913038159(0xffffffffc99424b1, float:-1213590.1)
                if (r0 == r3) goto L_0x008c
                r3 = 102340(0x18fc4, float:1.43409E-40)
                if (r0 == r3) goto L_0x0079
                r3 = 110986(0x1b18a, float:1.55525E-40)
                if (r0 == r3) goto L_0x0066
                goto L_0x00a0
            L_0x0066:
                java.lang.String r0 = "pic"
                boolean r8 = r8.equals(r0)
                if (r8 == 0) goto L_0x00a0
                android.content.Context r8 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
                r0 = 2132545465(0x7f1c0fb9, float:2.074412E38)
                com.bytedance.common.utility.C9432q.m18672a(r8, r0)
                goto L_0x009e
            L_0x0079:
                java.lang.String r0 = "gif"
                boolean r8 = r8.equals(r0)
                if (r8 == 0) goto L_0x00a0
                android.content.Context r8 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
                r0 = 2132545295(0x7f1c0f0f, float:2.0743776E38)
                com.bytedance.common.utility.C9432q.m18672a(r8, r0)
                goto L_0x009e
            L_0x008c:
                java.lang.String r0 = "story_video"
                boolean r8 = r8.equals(r0)
                if (r8 == 0) goto L_0x00a0
                android.content.Context r8 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
                r0 = 2132545466(0x7f1c0fba, float:2.0744122E38)
                com.bytedance.common.utility.C9432q.m18672a(r8, r0)
            L_0x009e:
                r8 = 0
                goto L_0x00a1
            L_0x00a0:
                r8 = 1
            L_0x00a1:
                if (r8 == 0) goto L_0x010e
                com.ss.android.ugc.aweme.im.sdk.relations.a.h r8 = r5.f89725a
                com.ss.android.ugc.aweme.im.sdk.relations.model.MTRelationMemberListViewModel r8 = r8.mo72944m()
                if (r8 == 0) goto L_0x00b0
                boolean r8 = r8.mo73181m()
                goto L_0x00b1
            L_0x00b0:
                r8 = 0
            L_0x00b1:
                if (r8 == 0) goto L_0x0103
                com.ss.android.ugc.aweme.im.sdk.relations.a.h r8 = r5.f89725a
                com.ss.android.ugc.aweme.im.sdk.relations.model.MTRelationMemberListViewModel r8 = r8.mo72944m()
                if (r8 == 0) goto L_0x00c1
                java.util.List r8 = r8.mo73183o()
                if (r8 != 0) goto L_0x00c5
            L_0x00c1:
                java.util.List r8 = p2628d.p2629a.C52575l.m112097a()
            L_0x00c5:
                boolean r0 = r8.contains(r6)
                if (r0 != 0) goto L_0x00f2
                int r8 = r8.size()
                r0 = 10
                if (r8 < r0) goto L_0x00f2
                android.content.Context r6 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
                android.content.Context r7 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
                r8 = 2132545598(0x7f1c103e, float:2.074439E38)
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r1[r2] = r0
                java.lang.String r7 = r7.getString(r8, r1)
                com.bytedance.ies.dmt.ui.d.a r6 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21551c(r6, r7)
                r6.mo19066a()
                goto L_0x010e
            L_0x00f2:
                com.ss.android.ugc.aweme.im.sdk.relations.a.h r8 = r5.f89725a
                com.ss.android.ugc.aweme.im.sdk.relations.model.MTRelationMemberListViewModel r8 = r8.mo72944m()
                if (r8 == 0) goto L_0x00fd
                r8.mo73179a(r6)
            L_0x00fd:
                com.ss.android.ugc.aweme.im.sdk.relations.a.h r6 = r5.f89725a
                r6.notifyItemChanged(r7)
                goto L_0x010e
            L_0x0103:
                com.ss.android.ugc.aweme.im.sdk.relations.a.h r7 = r5.f89725a
                com.ss.android.ugc.aweme.im.sdk.relations.model.MTRelationMemberListViewModel r7 = r7.mo72944m()
                if (r7 == 0) goto L_0x010e
                r7.mo73179a(r6)
            L_0x010e:
                d.x r6 = p2628d.C52860x.f131107a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a.C34821h.C34825c.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final C52686q<Integer, Integer, View, C52860x> mo72199l() {
        return this.f89720f;
    }

    /* renamed from: m */
    public final MTRelationMemberListViewModel mo72944m() {
        return (MTRelationMemberListViewModel) this.f89719e.getValue();
    }

    public C34821h(C0184k kVar) {
        C52711k.m112240b(kVar, "owner");
        super(kVar);
        this.f89718b = kVar;
        C0184k kVar2 = this.f89718b;
        C52760c a = C52728w.m112245a(MTRelationMemberListViewModel.class);
        this.f89719e = C52732g.m112285a(new C34822a(a, kVar2, a));
    }

    /* renamed from: a */
    public final int mo48641a(int i) {
        boolean z;
        boolean z2;
        List k = mo70606k();
        Collection collection = k;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z || i < mo70605j()) {
            return super.mo48641a(i);
        }
        Integer valueOf = Integer.valueOf(i - mo70605j());
        int intValue = valueOf.intValue();
        if (intValue < 0 || intValue >= k.size()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            valueOf = null;
        }
        if (valueOf == null) {
            return super.mo48641a(i);
        }
        if (((IMContact) k.get(valueOf.intValue())) instanceof C34979a) {
            return 1;
        }
        return 0;
    }

    /* renamed from: b */
    public final C34854a<IMContact> mo72198b(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        if (i == 1) {
            return new C34861c<>(viewGroup);
        }
        if (RefineShareInSiteExperiment.INSTANCE.mo73739d()) {
            return new C34862d<>(viewGroup, this.f89718b);
        }
        return new C34865f<>(viewGroup);
    }
}
