package com.p683ss.android.ugc.aweme.p1807im.sdk.group.p1837a;

import android.arch.lifecycle.C0184k;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.viewmodel.GroupFollowMemberViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35233bh;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.ss.android.ugc.trill.R;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52760c;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.a.c */
public final class C34186c extends C1352v {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f88328a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34186c.class), "mMemberListViewModel", "getMMemberListViewModel()Lcom/ss/android/ugc/aweme/im/sdk/group/viewmodel/GroupFollowMemberViewModel;"))};

    /* renamed from: b */
    final AvatarImageView f88329b;

    /* renamed from: c */
    final ImageView f88330c;

    /* renamed from: d */
    final DmtTextView f88331d;

    /* renamed from: e */
    public IMUser f88332e;

    /* renamed from: f */
    private final C52668f f88333f;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.a.c$a */
    public static final class C34189a extends C52712l implements C52670a<GroupFollowMemberViewModel> {

        /* renamed from: a */
        final /* synthetic */ C52760c f88336a;

        /* renamed from: b */
        final /* synthetic */ C0184k f88337b;

        /* renamed from: c */
        final /* synthetic */ C52760c f88338c;

        public C34189a(C52760c cVar, C0184k kVar, C52760c cVar2) {
            this.f88336a = cVar;
            this.f88337b = kVar;
            this.f88338c = cVar2;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupFollowMemberViewModel, android.arch.lifecycle.x] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v2, types: [com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupFollowMemberViewModel, android.arch.lifecycle.x]
          assigns: [android.arch.lifecycle.x]
          uses: [com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupFollowMemberViewModel]
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
        public final com.p683ss.android.ugc.aweme.p1807im.sdk.group.viewmodel.GroupFollowMemberViewModel invoke() {
            /*
                r4 = this;
                com.ss.android.ugc.aweme.im.sdk.group.a.c$a$1 r0 = new com.ss.android.ugc.aweme.im.sdk.group.a.c$a$1
                r0.<init>(r4)
                android.arch.lifecycle.k r1 = r4.f88337b
                boolean r2 = r1 instanceof android.support.p030v4.app.Fragment
                r3 = 0
                if (r2 == 0) goto L_0x0017
                android.arch.lifecycle.k r1 = r4.f88337b
                android.support.v4.app.Fragment r1 = (android.support.p030v4.app.Fragment) r1
                android.arch.lifecycle.y$b r0 = (android.arch.lifecycle.C0210y.C0212b) r0
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m439a(r1, r0)
                goto L_0x0027
            L_0x0017:
                boolean r1 = r1 instanceof android.support.p030v4.app.FragmentActivity
                if (r1 == 0) goto L_0x0026
                android.arch.lifecycle.k r1 = r4.f88337b
                android.support.v4.app.FragmentActivity r1 = (android.support.p030v4.app.FragmentActivity) r1
                android.arch.lifecycle.y$b r0 = (android.arch.lifecycle.C0210y.C0212b) r0
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m441a(r1, r0)
                goto L_0x0027
            L_0x0026:
                r0 = r3
            L_0x0027:
                if (r0 == 0) goto L_0x0043
                d.k.c r1 = r4.f88338c
                java.lang.Class r1 = p2628d.p2639f.C52669a.m112219a(r1)
                java.lang.String r1 = r1.getName()
                java.lang.String r2 = "viewModelClass.java.name"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                d.k.c r2 = r4.f88336a
                java.lang.Class r2 = p2628d.p2639f.C52669a.m112219a(r2)
                android.arch.lifecycle.x r0 = r0.mo360a(r1, r2)
                return r0
            L_0x0043:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.group.p1837a.C34186c.C34189a.invoke():android.arch.lifecycle.x");
        }
    }

    /* renamed from: a */
    public final GroupFollowMemberViewModel mo72200a() {
        return (GroupFollowMemberViewModel) this.f88333f.getValue();
    }

    public C34186c(C0184k kVar, ViewGroup viewGroup) {
        C52711k.m112240b(kVar, "owner");
        C52711k.m112240b(viewGroup, "parent");
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bd4, viewGroup, false));
        View findViewById = this.itemView.findViewById(R.id.ay2);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.iv_avatar)");
        this.f88329b = (AvatarImageView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.sy);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.checkbox_iv)");
        this.f88330c = (ImageView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.bpu);
        C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.id.name_tv)");
        this.f88331d = (DmtTextView) findViewById3;
        C52760c a = C52728w.m112245a(GroupFollowMemberViewModel.class);
        this.f88333f = C52732g.m112285a(new C34189a(a, kVar, a));
        this.itemView.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C34186c f88334a;

            {
                this.f88334a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                IMUser iMUser = this.f88334a.f88332e;
                if (iMUser != null) {
                    C35190af.m79442a();
                    C35190af.m79485b(iMUser.getUid(), "group_inflow_layer", "");
                    C35233bh.f90533a.mo73336a(iMUser.getUid(), iMUser.getSecUid());
                }
            }
        });
        this.f88330c.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C34186c f88335a;

            {
                this.f88335a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                IMUser iMUser = this.f88335a.f88332e;
                if (iMUser != null) {
                    GroupFollowMemberViewModel a = this.f88335a.mo72200a();
                    if (a != null) {
                        a.mo73179a((IMContact) iMUser);
                    }
                }
            }
        });
    }
}
