package com.p683ss.android.ugc.aweme.p1807im.sdk.group.p1839c;

import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.viewmodel.GroupMemberFansViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1876c.C34868g;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.select.BaseMemberListViewModel;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import java.util.List;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52718r;
import p2628d.p2639f.p2641b.C52719s;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52760c;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.c.b */
public final class C34228b extends C34868g {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f88412a = {C52728w.m112248a((C52718r) new C52719s(C52728w.m112245a(C34228b.class), "viewModel", "<v#0>"))};

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.c.b$a */
    public static final class C34229a extends C52712l implements C52670a<GroupMemberFansViewModel> {

        /* renamed from: a */
        final /* synthetic */ C52760c f88413a;

        /* renamed from: b */
        final /* synthetic */ C0184k f88414b;

        /* renamed from: c */
        final /* synthetic */ C52760c f88415c;

        public C34229a(C52760c cVar, C0184k kVar, C52760c cVar2) {
            this.f88413a = cVar;
            this.f88414b = kVar;
            this.f88415c = cVar2;
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
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p683ss.android.ugc.aweme.p1807im.sdk.group.viewmodel.GroupMemberFansViewModel invoke() {
            /*
                r4 = this;
                com.ss.android.ugc.aweme.im.sdk.group.c.b$a$1 r0 = new com.ss.android.ugc.aweme.im.sdk.group.c.b$a$1
                r0.<init>(r4)
                android.arch.lifecycle.k r1 = r4.f88414b
                boolean r2 = r1 instanceof android.support.p030v4.app.Fragment
                r3 = 0
                if (r2 == 0) goto L_0x0017
                android.arch.lifecycle.k r1 = r4.f88414b
                android.support.v4.app.Fragment r1 = (android.support.p030v4.app.Fragment) r1
                android.arch.lifecycle.y$b r0 = (android.arch.lifecycle.C0210y.C0212b) r0
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m439a(r1, r0)
                goto L_0x0027
            L_0x0017:
                boolean r1 = r1 instanceof android.support.p030v4.app.FragmentActivity
                if (r1 == 0) goto L_0x0026
                android.arch.lifecycle.k r1 = r4.f88414b
                android.support.v4.app.FragmentActivity r1 = (android.support.p030v4.app.FragmentActivity) r1
                android.arch.lifecycle.y$b r0 = (android.arch.lifecycle.C0210y.C0212b) r0
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m441a(r1, r0)
                goto L_0x0027
            L_0x0026:
                r0 = r3
            L_0x0027:
                if (r0 == 0) goto L_0x0043
                d.k.c r1 = r4.f88415c
                java.lang.Class r1 = p2628d.p2639f.C52669a.m112219a(r1)
                java.lang.String r1 = r1.getName()
                java.lang.String r2 = "viewModelClass.java.name"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                d.k.c r2 = r4.f88413a
                java.lang.Class r2 = p2628d.p2639f.C52669a.m112219a(r2)
                android.arch.lifecycle.x r0 = r0.mo360a(r1, r2)
                return r0
            L_0x0043:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.group.p1839c.C34228b.C34229a.invoke():android.arch.lifecycle.x");
        }
    }

    /* renamed from: b */
    public final List<IMContact> mo72221b() {
        BaseMemberListViewModel<?> baseMemberListViewModel = this.f89820k;
        if (!(baseMemberListViewModel instanceof GroupMemberFansViewModel)) {
            baseMemberListViewModel = null;
        }
        GroupMemberFansViewModel groupMemberFansViewModel = (GroupMemberFansViewModel) baseMemberListViewModel;
        if (groupMemberFansViewModel != null) {
            return groupMemberFansViewModel.f88693c;
        }
        return null;
    }

    /* renamed from: a */
    public final BaseMemberListViewModel<?> mo72220a() {
        Context context = this.f89821l.getContext();
        if (context != null) {
            C0184k kVar = (C0184k) context;
            C52760c a = C52728w.m112245a(GroupMemberFansViewModel.class);
            return (BaseMemberListViewModel) C52732g.m112285a(new C34229a(a, kVar, a)).getValue();
        }
        throw new C52857u("null cannot be cast to non-null type android.arch.lifecycle.LifecycleOwner");
    }

    public C34228b(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parent");
        super(viewGroup);
    }
}
