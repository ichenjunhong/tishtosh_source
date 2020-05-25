package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a;

import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.model.MTRelationMemberListViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1876c.C34854a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1876c.C34868g;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
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

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.g */
public final class C34816g extends C34799b<IMContact> {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f89706a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34816g.class), "mMemberListViewModel", "getMMemberListViewModel()Lcom/ss/android/ugc/aweme/im/sdk/relations/model/MTRelationMemberListViewModel;"))};

    /* renamed from: c */
    public static final C34819b f89707c = new C34819b(null);

    /* renamed from: b */
    public final Context f89708b;

    /* renamed from: e */
    private final C52668f f89709e;

    /* renamed from: f */
    private C52686q<? super Integer, ? super Integer, ? super View, C52860x> f89710f = new C34820c(this);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.g$a */
    public static final class C34817a extends C52712l implements C52670a<MTRelationMemberListViewModel> {

        /* renamed from: a */
        final /* synthetic */ C52760c f89711a;

        /* renamed from: b */
        final /* synthetic */ C0184k f89712b;

        /* renamed from: c */
        final /* synthetic */ C52760c f89713c;

        public C34817a(C52760c cVar, C0184k kVar, C52760c cVar2) {
            this.f89711a = cVar;
            this.f89712b = kVar;
            this.f89713c = cVar2;
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
                com.ss.android.ugc.aweme.im.sdk.relations.a.g$a$1 r0 = new com.ss.android.ugc.aweme.im.sdk.relations.a.g$a$1
                r0.<init>(r4)
                android.arch.lifecycle.k r1 = r4.f89712b
                boolean r2 = r1 instanceof android.support.p030v4.app.Fragment
                r3 = 0
                if (r2 == 0) goto L_0x0017
                android.arch.lifecycle.k r1 = r4.f89712b
                android.support.v4.app.Fragment r1 = (android.support.p030v4.app.Fragment) r1
                android.arch.lifecycle.y$b r0 = (android.arch.lifecycle.C0210y.C0212b) r0
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m439a(r1, r0)
                goto L_0x0027
            L_0x0017:
                boolean r1 = r1 instanceof android.support.p030v4.app.FragmentActivity
                if (r1 == 0) goto L_0x0026
                android.arch.lifecycle.k r1 = r4.f89712b
                android.support.v4.app.FragmentActivity r1 = (android.support.p030v4.app.FragmentActivity) r1
                android.arch.lifecycle.y$b r0 = (android.arch.lifecycle.C0210y.C0212b) r0
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m441a(r1, r0)
                goto L_0x0027
            L_0x0026:
                r0 = r3
            L_0x0027:
                if (r0 == 0) goto L_0x0043
                d.k.c r1 = r4.f89713c
                java.lang.Class r1 = p2628d.p2639f.C52669a.m112219a(r1)
                java.lang.String r1 = r1.getName()
                java.lang.String r2 = "viewModelClass.java.name"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                d.k.c r2 = r4.f89711a
                java.lang.Class r2 = p2628d.p2639f.C52669a.m112219a(r2)
                android.arch.lifecycle.x r0 = r0.mo360a(r1, r2)
                return r0
            L_0x0043:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a.C34816g.C34817a.invoke():android.arch.lifecycle.x");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.g$b */
    public static final class C34819b {
        private C34819b() {
        }

        public /* synthetic */ C34819b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.g$c */
    static final class C34820c extends C52712l implements C52686q<Integer, Integer, View, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C34816g f89715a;

        C34820c(C34816g gVar) {
            this.f89715a = gVar;
            super(3);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            int intValue = ((Number) obj).intValue();
            int intValue2 = ((Number) obj2).intValue();
            C52711k.m112240b((View) obj3, "view");
            switch (intValue) {
                case 0:
                case 1:
                case 2:
                    this.f89715a.mo72943c(intValue2);
                    break;
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: m */
    private final MTRelationMemberListViewModel m78877m() {
        return (MTRelationMemberListViewModel) this.f89709e.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final C52686q<Integer, Integer, View, C52860x> mo72199l() {
        return this.f89710f;
    }

    public C34816g(C0184k kVar) {
        C52711k.m112240b(kVar, "owner");
        super(kVar);
        this.f89708b = (Context) kVar;
        C52760c a = C52728w.m112245a(MTRelationMemberListViewModel.class);
        this.f89709e = C52732g.m112285a(new C34817a(a, kVar, a));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004e, code lost:
        if (r8.contains(r0) == true) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0084, code lost:
        if (r1.contains(r0) == true) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e7, code lost:
        if (r1 == null) goto L_0x00e9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c6  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo72943c(int r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.mo70602b(r10)
            com.ss.android.ugc.aweme.im.service.model.IMContact r0 = (com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact) r0
            if (r0 == 0) goto L_0x011e
            com.ss.android.ugc.aweme.im.sdk.relations.model.MTRelationMemberListViewModel r1 = r9.m78877m()
            r2 = 0
            r3 = 2132545522(0x7f1c0ff2, float:2.0744236E38)
            r4 = 10
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L_0x00dd
            int r1 = r1.f90193j
            r7 = 4
            if (r1 != r7) goto L_0x00dd
            com.ss.android.ugc.aweme.im.sdk.relations.model.MTRelationMemberListViewModel r1 = r9.m78877m()
            if (r1 == 0) goto L_0x002c
            java.util.List r1 = r1.mo73183o()
            if (r1 == 0) goto L_0x002c
            int r1 = r1.size()
            goto L_0x002d
        L_0x002c:
            r1 = 0
        L_0x002d:
            com.ss.android.ugc.aweme.im.sdk.relations.model.MTRelationMemberListViewModel r7 = r9.m78877m()
            if (r7 == 0) goto L_0x003c
            java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMContact> r7 = r7.f90180f
            if (r7 == 0) goto L_0x003c
            int r7 = r7.size()
            goto L_0x003d
        L_0x003c:
            r7 = 0
        L_0x003d:
            int r7 = r7 + r1
            com.ss.android.ugc.aweme.im.sdk.relations.model.MTRelationMemberListViewModel r8 = r9.m78877m()
            if (r8 == 0) goto L_0x0050
            java.util.List r8 = r8.mo73183o()
            if (r8 == 0) goto L_0x0050
            boolean r8 = r8.contains(r0)
            if (r8 == r5) goto L_0x0074
        L_0x0050:
            if (r1 < r4) goto L_0x0074
            android.content.Context r10 = r9.f89708b
            android.content.Context r0 = r9.f89708b
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1[r6] = r4
            java.lang.String r0 = r0.getString(r3, r1)
            com.bytedance.ies.dmt.ui.d.a r10 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21551c(r10, r0)
            r10.mo19066a()
            java.lang.String r10 = "add"
            java.lang.String r0 = "num_limit"
            java.lang.String r1 = ""
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79470a(r10, r0, r2, r1)
            goto L_0x011e
        L_0x0074:
            com.ss.android.ugc.aweme.im.sdk.relations.model.MTRelationMemberListViewModel r1 = r9.m78877m()
            if (r1 == 0) goto L_0x0086
            java.util.List r1 = r1.mo73183o()
            if (r1 == 0) goto L_0x0086
            boolean r1 = r1.contains(r0)
            if (r1 == r5) goto L_0x009e
        L_0x0086:
            r1 = 100
            if (r7 < r1) goto L_0x009e
            android.content.Context r10 = r9.f89708b
            android.content.Context r0 = r9.f89708b
            r1 = 2132545357(0x7f1c0f4d, float:2.0743901E38)
            java.lang.String r0 = r0.getString(r1)
            com.bytedance.ies.dmt.ui.d.a r10 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21551c(r10, r0)
            r10.mo19066a()
            goto L_0x011e
        L_0x009e:
            com.ss.android.ugc.aweme.im.sdk.utils.t r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35284t.m79782a()
            boolean r1 = r1.mo73449y()
            if (r1 != 0) goto L_0x00d9
            android.content.Context r1 = r9.f89708b
            if (r1 == 0) goto L_0x00d9
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r1 = com.p683ss.android.ugc.aweme.global.config.settings.C32816h.m75716b()     // Catch:{ a -> 0x00c3 }
            java.lang.String r2 = "SettingsReader.get()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)     // Catch:{ a -> 0x00c3 }
            java.lang.Boolean r1 = r1.getGroupNewMemberCanPullOldMsg()     // Catch:{ a -> 0x00c3 }
            java.lang.String r2 = "SettingsReader.get().groupNewMemberCanPullOldMsg"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)     // Catch:{ a -> 0x00c3 }
            boolean r1 = r1.booleanValue()     // Catch:{ a -> 0x00c3 }
            goto L_0x00c4
        L_0x00c3:
            r1 = 0
        L_0x00c4:
            if (r1 == 0) goto L_0x00d9
            android.content.Context r1 = r9.f89708b
            r2 = 2132542760(0x7f1c0528, float:2.0738634E38)
            com.bytedance.ies.dmt.ui.d.a r1 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21548c(r1, r2)
            r1.mo19066a()
            com.ss.android.ugc.aweme.im.sdk.utils.t r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35284t.m79782a()
            r1.mo73407c(r5)
        L_0x00d9:
            r9.m78876a(r0, r10)
            goto L_0x011e
        L_0x00dd:
            com.ss.android.ugc.aweme.im.sdk.relations.model.MTRelationMemberListViewModel r1 = r9.m78877m()
            if (r1 == 0) goto L_0x00e9
            java.util.List r1 = r1.mo73183o()
            if (r1 != 0) goto L_0x00ed
        L_0x00e9:
            java.util.List r1 = p2628d.p2629a.C52575l.m112097a()
        L_0x00ed:
            boolean r7 = r1.contains(r0)
            if (r7 != 0) goto L_0x011a
            int r1 = r1.size()
            if (r1 != r4) goto L_0x011a
            android.content.Context r10 = r9.f89708b
            android.content.Context r0 = r9.f89708b
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1[r6] = r4
            java.lang.String r0 = r0.getString(r3, r1)
            com.bytedance.ies.dmt.ui.d.a r10 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21551c(r10, r0)
            r10.mo19066a()
            java.lang.String r10 = "start"
            java.lang.String r0 = "num_limit"
            java.lang.String r1 = ""
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79470a(r10, r0, r2, r1)
            goto L_0x011e
        L_0x011a:
            r9.m78876a(r0, r10)
            return
        L_0x011e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a.C34816g.mo72943c(int):void");
    }

    /* renamed from: a */
    private final void m78876a(IMContact iMContact, int i) {
        MTRelationMemberListViewModel m = m78877m();
        if (m != null) {
            m.mo73179a(iMContact);
        }
        notifyItemChanged(i);
    }

    /* renamed from: b */
    public final C34854a<IMContact> mo72198b(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        return new C34868g<>(viewGroup);
    }
}
