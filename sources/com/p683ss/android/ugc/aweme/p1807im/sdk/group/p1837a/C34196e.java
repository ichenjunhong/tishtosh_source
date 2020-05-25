package com.p683ss.android.ugc.aweme.p1807im.sdk.group.p1837a;

import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.p1839c.C34228b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.viewmodel.GroupMemberFansViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a.C34799b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1876c.C34854a;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
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

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.a.e */
public final class C34196e extends C34799b<IMContact> {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f88350a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34196e.class), "fansViewModel", "getFansViewModel()Lcom/ss/android/ugc/aweme/im/sdk/group/viewmodel/GroupMemberFansViewModel;"))};

    /* renamed from: c */
    public static final C34199b f88351c = new C34199b(null);

    /* renamed from: b */
    public final Context f88352b;

    /* renamed from: e */
    private final C52668f f88353e;

    /* renamed from: f */
    private C52686q<? super Integer, ? super Integer, ? super View, C52860x> f88354f;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.a.e$a */
    public static final class C34197a extends C52712l implements C52670a<GroupMemberFansViewModel> {

        /* renamed from: a */
        final /* synthetic */ C52760c f88355a;

        /* renamed from: b */
        final /* synthetic */ C0184k f88356b;

        /* renamed from: c */
        final /* synthetic */ C52760c f88357c;

        public C34197a(C52760c cVar, C0184k kVar, C52760c cVar2) {
            this.f88355a = cVar;
            this.f88356b = kVar;
            this.f88357c = cVar2;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberFansViewModel, android.arch.lifecycle.x] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v2, types: [com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberFansViewModel, android.arch.lifecycle.x]
          assigns: [android.arch.lifecycle.x]
          uses: [com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberFansViewModel]
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
        public final com.p683ss.android.ugc.aweme.p1807im.sdk.group.viewmodel.GroupMemberFansViewModel invoke() {
            /*
                r4 = this;
                com.ss.android.ugc.aweme.im.sdk.group.a.e$a$1 r0 = new com.ss.android.ugc.aweme.im.sdk.group.a.e$a$1
                r0.<init>(r4)
                android.arch.lifecycle.k r1 = r4.f88356b
                boolean r2 = r1 instanceof android.support.p030v4.app.Fragment
                r3 = 0
                if (r2 == 0) goto L_0x0017
                android.arch.lifecycle.k r1 = r4.f88356b
                android.support.v4.app.Fragment r1 = (android.support.p030v4.app.Fragment) r1
                android.arch.lifecycle.y$b r0 = (android.arch.lifecycle.C0210y.C0212b) r0
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m439a(r1, r0)
                goto L_0x0027
            L_0x0017:
                boolean r1 = r1 instanceof android.support.p030v4.app.FragmentActivity
                if (r1 == 0) goto L_0x0026
                android.arch.lifecycle.k r1 = r4.f88356b
                android.support.v4.app.FragmentActivity r1 = (android.support.p030v4.app.FragmentActivity) r1
                android.arch.lifecycle.y$b r0 = (android.arch.lifecycle.C0210y.C0212b) r0
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m441a(r1, r0)
                goto L_0x0027
            L_0x0026:
                r0 = r3
            L_0x0027:
                if (r0 == 0) goto L_0x0043
                d.k.c r1 = r4.f88357c
                java.lang.Class r1 = p2628d.p2639f.C52669a.m112219a(r1)
                java.lang.String r1 = r1.getName()
                java.lang.String r2 = "viewModelClass.java.name"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                d.k.c r2 = r4.f88355a
                java.lang.Class r2 = p2628d.p2639f.C52669a.m112219a(r2)
                android.arch.lifecycle.x r0 = r0.mo360a(r1, r2)
                return r0
            L_0x0043:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.group.p1837a.C34196e.C34197a.invoke():android.arch.lifecycle.x");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.a.e$b */
    public static final class C34199b {
        private C34199b() {
        }

        public /* synthetic */ C34199b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.a.e$c */
    static final class C34200c extends C52712l implements C52686q<Integer, Integer, View, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C34196e f88359a;

        C34200c(C34196e eVar) {
            this.f88359a = eVar;
            super(3);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            int intValue = ((Number) obj).intValue();
            int intValue2 = ((Number) obj2).intValue();
            C52711k.m112240b((View) obj3, "<anonymous parameter 2>");
            switch (intValue) {
                case 0:
                case 1:
                case 2:
                    this.f88359a.mo72205c(intValue2);
                    break;
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: m */
    private final GroupMemberFansViewModel m78022m() {
        return (GroupMemberFansViewModel) this.f88353e.getValue();
    }

    /* renamed from: l */
    public final C52686q<Integer, Integer, View, C52860x> mo72199l() {
        return this.f88354f;
    }

    /* renamed from: c */
    public final int mo48636c() {
        int i;
        List list = this.f70670n;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        return i + mo70605j();
    }

    public final int getItemCount() {
        if (this.f70699x) {
            return mo48636c() + 1;
        }
        return mo48636c();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public IMContact mo70602b(int i) {
        if (i < mo70605j() || i >= getItemCount()) {
            return null;
        }
        List list = this.f70670n;
        if (list != null) {
            return (IMContact) list.get(i - mo70605j());
        }
        return null;
    }

    public C34196e(C0184k kVar) {
        C52711k.m112240b(kVar, "owner");
        super(kVar);
        this.f88352b = (Context) kVar;
        C52760c a = C52728w.m112245a(GroupMemberFansViewModel.class);
        this.f88353e = C52732g.m112285a(new C34197a(a, kVar, a));
        this.f88354f = new C34200c(this);
        this.f70699x = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        if (r1 == null) goto L_0x0013;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0092 A[SYNTHETIC, Splitter:B:34:0x0092] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c5  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo72205c(int r8) {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.im.service.model.IMContact r0 = r7.mo70602b(r8)
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberFansViewModel r1 = r7.m78022m()
            if (r1 == 0) goto L_0x0013
            java.util.List r1 = r1.mo73183o()
            if (r1 != 0) goto L_0x0017
        L_0x0013:
            java.util.List r1 = p2628d.p2629a.C52575l.m112097a()
        L_0x0017:
            com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberFansViewModel r2 = r7.m78022m()
            r3 = 0
            if (r2 == 0) goto L_0x0029
            java.util.List r2 = r2.mo73183o()
            if (r2 == 0) goto L_0x0029
            int r2 = r2.size()
            goto L_0x002a
        L_0x0029:
            r2 = 0
        L_0x002a:
            com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberFansViewModel r4 = r7.m78022m()
            if (r4 == 0) goto L_0x0039
            java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMContact> r4 = r4.f88693c
            if (r4 == 0) goto L_0x0039
            int r4 = r4.size()
            goto L_0x003a
        L_0x0039:
            r4 = 0
        L_0x003a:
            int r4 = r4 + r2
            boolean r5 = r1.contains(r0)
            r6 = 1
            if (r5 != 0) goto L_0x006b
            r5 = 10
            if (r2 < r5) goto L_0x006b
            android.content.Context r8 = r7.f88352b
            android.content.Context r0 = r7.f88352b
            r1 = 2132542749(0x7f1c051d, float:2.0738612E38)
            java.lang.Object[] r2 = new java.lang.Object[r6]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r2[r3] = r4
            java.lang.String r0 = r0.getString(r1, r2)
            com.bytedance.ies.dmt.ui.d.a r8 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21551c(r8, r0)
            r8.mo19066a()
            java.lang.String r8 = "add"
            java.lang.String r0 = "num_limit"
            r1 = 0
            java.lang.String r2 = ""
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79470a(r8, r0, r1, r2)
            return
        L_0x006b:
            boolean r1 = r1.contains(r0)
            if (r1 != 0) goto L_0x0088
            r1 = 100
            if (r4 < r1) goto L_0x0088
            android.content.Context r8 = r7.f88352b
            android.content.Context r0 = r7.f88352b
            r1 = 2132545357(0x7f1c0f4d, float:2.0743901E38)
            java.lang.String r0 = r0.getString(r1)
            com.bytedance.ies.dmt.ui.d.a r8 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21551c(r8, r0)
            r8.mo19066a()
            return
        L_0x0088:
            com.ss.android.ugc.aweme.im.sdk.utils.t r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35284t.m79782a()
            boolean r1 = r1.mo73449y()
            if (r1 != 0) goto L_0x00bf
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r1 = com.p683ss.android.ugc.aweme.global.config.settings.C32816h.m75716b()     // Catch:{ a -> 0x00a9 }
            java.lang.String r2 = "SettingsReader.get()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)     // Catch:{ a -> 0x00a9 }
            java.lang.Boolean r1 = r1.getGroupNewMemberCanPullOldMsg()     // Catch:{ a -> 0x00a9 }
            java.lang.String r2 = "SettingsReader.get().groupNewMemberCanPullOldMsg"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)     // Catch:{ a -> 0x00a9 }
            boolean r1 = r1.booleanValue()     // Catch:{ a -> 0x00a9 }
            goto L_0x00aa
        L_0x00a9:
            r1 = 0
        L_0x00aa:
            if (r1 == 0) goto L_0x00bf
            android.content.Context r1 = r7.f88352b
            r2 = 2132542760(0x7f1c0528, float:2.0738634E38)
            com.bytedance.ies.dmt.ui.d.a r1 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21548c(r1, r2)
            r1.mo19066a()
            com.ss.android.ugc.aweme.im.sdk.utils.t r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35284t.m79782a()
            r1.mo73407c(r6)
        L_0x00bf:
            com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberFansViewModel r1 = r7.m78022m()
            if (r1 == 0) goto L_0x00c8
            r1.mo73179a(r0)
        L_0x00c8:
            r7.notifyItemChanged(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.group.p1837a.C34196e.mo72205c(int):void");
    }

    /* renamed from: b */
    public final C34854a<IMContact> mo72198b(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        return new C34228b<>(viewGroup);
    }
}
