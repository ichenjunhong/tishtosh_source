package com.p683ss.android.ugc.aweme.p1807im.sdk.group.p1837a;

import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.p1839c.C34231c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.viewmodel.GroupMemberListViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a.C34799b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1876c.C34854a;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.ss.android.ugc.trill.R;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52760c;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.a.f */
public final class C34201f extends C34799b<IMContact> {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f88360a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34201f.class), "mMemberListViewModel", "getMMemberListViewModel()Lcom/ss/android/ugc/aweme/im/sdk/group/viewmodel/GroupMemberListViewModel;"))};

    /* renamed from: b */
    public final Context f88361b;

    /* renamed from: c */
    private final C52668f f88362c;

    /* renamed from: e */
    private C52686q<? super Integer, ? super Integer, ? super View, C52860x> f88363e = new C34204b(this);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.a.f$a */
    public static final class C34202a extends C52712l implements C52670a<GroupMemberListViewModel> {

        /* renamed from: a */
        final /* synthetic */ C52760c f88364a;

        /* renamed from: b */
        final /* synthetic */ C0184k f88365b;

        /* renamed from: c */
        final /* synthetic */ C52760c f88366c;

        public C34202a(C52760c cVar, C0184k kVar, C52760c cVar2) {
            this.f88364a = cVar;
            this.f88365b = kVar;
            this.f88366c = cVar2;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberListViewModel, android.arch.lifecycle.x] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v2, types: [com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberListViewModel, android.arch.lifecycle.x]
          assigns: [android.arch.lifecycle.x]
          uses: [com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberListViewModel]
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
        public final com.p683ss.android.ugc.aweme.p1807im.sdk.group.viewmodel.GroupMemberListViewModel invoke() {
            /*
                r4 = this;
                com.ss.android.ugc.aweme.im.sdk.group.a.f$a$1 r0 = new com.ss.android.ugc.aweme.im.sdk.group.a.f$a$1
                r0.<init>(r4)
                android.arch.lifecycle.k r1 = r4.f88365b
                boolean r2 = r1 instanceof android.support.p030v4.app.Fragment
                r3 = 0
                if (r2 == 0) goto L_0x0017
                android.arch.lifecycle.k r1 = r4.f88365b
                android.support.v4.app.Fragment r1 = (android.support.p030v4.app.Fragment) r1
                android.arch.lifecycle.y$b r0 = (android.arch.lifecycle.C0210y.C0212b) r0
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m439a(r1, r0)
                goto L_0x0027
            L_0x0017:
                boolean r1 = r1 instanceof android.support.p030v4.app.FragmentActivity
                if (r1 == 0) goto L_0x0026
                android.arch.lifecycle.k r1 = r4.f88365b
                android.support.v4.app.FragmentActivity r1 = (android.support.p030v4.app.FragmentActivity) r1
                android.arch.lifecycle.y$b r0 = (android.arch.lifecycle.C0210y.C0212b) r0
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m441a(r1, r0)
                goto L_0x0027
            L_0x0026:
                r0 = r3
            L_0x0027:
                if (r0 == 0) goto L_0x0043
                d.k.c r1 = r4.f88366c
                java.lang.Class r1 = p2628d.p2639f.C52669a.m112219a(r1)
                java.lang.String r1 = r1.getName()
                java.lang.String r2 = "viewModelClass.java.name"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                d.k.c r2 = r4.f88364a
                java.lang.Class r2 = p2628d.p2639f.C52669a.m112219a(r2)
                android.arch.lifecycle.x r0 = r0.mo360a(r1, r2)
                return r0
            L_0x0043:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.group.p1837a.C34201f.C34202a.invoke():android.arch.lifecycle.x");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.a.f$b */
    static final class C34204b extends C52712l implements C52686q<Integer, Integer, View, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C34201f f88368a;

        C34204b(C34201f fVar) {
            this.f88368a = fVar;
            super(3);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            int intValue = ((Number) obj).intValue();
            int intValue2 = ((Number) obj2).intValue();
            View view = (View) obj3;
            C52711k.m112240b(view, "view");
            switch (intValue) {
                case 0:
                case 1:
                case 2:
                    GroupMemberListViewModel m = this.f88368a.mo72206m();
                    if (m != null && m.f90193j == 5 && view.getTag(R.id.l) != null) {
                        C10691a.m21533a(view.getContext(), (int) R.string.bfe).mo19066a();
                        break;
                    } else {
                        IMContact iMContact = (IMContact) this.f88368a.mo70602b(intValue2);
                        if (iMContact != null) {
                            GroupMemberListViewModel m2 = this.f88368a.mo72206m();
                            if (m2 != null) {
                                m2.mo73179a(iMContact);
                            }
                            this.f88368a.notifyItemChanged(intValue2);
                            break;
                        }
                    }
                    break;
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: l */
    public final C52686q<Integer, Integer, View, C52860x> mo72199l() {
        return this.f88363e;
    }

    /* renamed from: m */
    public final GroupMemberListViewModel mo72206m() {
        return (GroupMemberListViewModel) this.f88362c.getValue();
    }

    public C34201f(C0184k kVar) {
        C52711k.m112240b(kVar, "owner");
        super(kVar);
        this.f88361b = (Context) kVar;
        C52760c a = C52728w.m112245a(GroupMemberListViewModel.class);
        this.f88362c = C52732g.m112285a(new C34202a(a, kVar, a));
    }

    /* renamed from: b */
    public final C34854a<IMContact> mo72198b(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        return new C34231c<>(viewGroup);
    }
}
