package com.p683ss.android.ugc.aweme.p1807im.sdk.group.p1839c;

import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.viewmodel.GroupListViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1876c.C34854a;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.ss.android.ugc.trill.R;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52760c;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.c.d */
public final class C34234d extends C34854a<IMContact> {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f88423a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34234d.class), "mMemberListViewModel", "getMMemberListViewModel()Lcom/ss/android/ugc/aweme/im/sdk/group/viewmodel/GroupListViewModel;"))};

    /* renamed from: j */
    private final C52668f f88424j;

    /* renamed from: k */
    private final DmtTextView f88425k;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.c.d$a */
    public static final class C34235a extends C52712l implements C52670a<GroupListViewModel> {

        /* renamed from: a */
        final /* synthetic */ C52760c f88426a;

        /* renamed from: b */
        final /* synthetic */ C0184k f88427b;

        /* renamed from: c */
        final /* synthetic */ C52760c f88428c;

        public C34235a(C52760c cVar, C0184k kVar, C52760c cVar2) {
            this.f88426a = cVar;
            this.f88427b = kVar;
            this.f88428c = cVar2;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupListViewModel, android.arch.lifecycle.x] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v2, types: [com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupListViewModel, android.arch.lifecycle.x]
          assigns: [android.arch.lifecycle.x]
          uses: [com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupListViewModel]
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
        public final com.p683ss.android.ugc.aweme.p1807im.sdk.group.viewmodel.GroupListViewModel invoke() {
            /*
                r4 = this;
                com.ss.android.ugc.aweme.im.sdk.group.c.d$a$1 r0 = new com.ss.android.ugc.aweme.im.sdk.group.c.d$a$1
                r0.<init>(r4)
                android.arch.lifecycle.k r1 = r4.f88427b
                boolean r2 = r1 instanceof android.support.p030v4.app.Fragment
                r3 = 0
                if (r2 == 0) goto L_0x0017
                android.arch.lifecycle.k r1 = r4.f88427b
                android.support.v4.app.Fragment r1 = (android.support.p030v4.app.Fragment) r1
                android.arch.lifecycle.y$b r0 = (android.arch.lifecycle.C0210y.C0212b) r0
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m439a(r1, r0)
                goto L_0x0027
            L_0x0017:
                boolean r1 = r1 instanceof android.support.p030v4.app.FragmentActivity
                if (r1 == 0) goto L_0x0026
                android.arch.lifecycle.k r1 = r4.f88427b
                android.support.v4.app.FragmentActivity r1 = (android.support.p030v4.app.FragmentActivity) r1
                android.arch.lifecycle.y$b r0 = (android.arch.lifecycle.C0210y.C0212b) r0
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m441a(r1, r0)
                goto L_0x0027
            L_0x0026:
                r0 = r3
            L_0x0027:
                if (r0 == 0) goto L_0x0043
                d.k.c r1 = r4.f88428c
                java.lang.Class r1 = p2628d.p2639f.C52669a.m112219a(r1)
                java.lang.String r1 = r1.getName()
                java.lang.String r2 = "viewModelClass.java.name"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                d.k.c r2 = r4.f88426a
                java.lang.Class r2 = p2628d.p2639f.C52669a.m112219a(r2)
                android.arch.lifecycle.x r0 = r0.mo360a(r1, r2)
                return r0
            L_0x0043:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.group.p1839c.C34234d.C34235a.invoke():android.arch.lifecycle.x");
        }
    }

    /* renamed from: a */
    private final GroupListViewModel m78080a() {
        return (GroupListViewModel) this.f88424j.getValue();
    }

    public C34234d(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bd6, viewGroup, false);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(pare…up_select, parent, false)");
        super(inflate);
        Context context = viewGroup.getContext();
        if (context != null) {
            C0184k kVar = (C0184k) context;
            C52760c a = C52728w.m112245a(GroupListViewModel.class);
            this.f88424j = C52732g.m112285a(new C34235a(a, kVar, a));
            View findViewById = this.itemView.findViewById(R.id.a1a);
            C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.count_tv)");
            this.f88425k = (DmtTextView) findViewById;
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.arch.lifecycle.LifecycleOwner");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0079, code lost:
        if (r6 == null) goto L_0x007b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo72219a(java.lang.Object r4, java.lang.Object r5, int r6) {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.im.service.model.IMContact r4 = (com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact) r4
            com.ss.android.ugc.aweme.im.service.model.IMContact r5 = (com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact) r5
            java.lang.String r5 = "item"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r5)
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r5 = r3.f89784d
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r5 = (com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView) r5
            com.ss.android.ugc.aweme.base.model.UrlModel r6 = r4.getDisplayAvatar()
            com.p683ss.android.ugc.aweme.base.C23515d.m57669a(r5, r6)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = r3.f89786f
            java.lang.String r6 = "mNameTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            java.lang.String r6 = r4.getDisplayName()
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r5.setText(r6)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = r3.f89787g
            java.lang.String r6 = "mDetailTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            r6 = 8
            r5.setVisibility(r6)
            com.ss.android.ugc.aweme.im.service.model.IMConversation r4 = (com.p683ss.android.ugc.aweme.p1807im.service.model.IMConversation) r4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = " "
            r5.append(r6)
            android.content.Context r6 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r1 = r4.getConversationMemberCount()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            r1 = 2132545355(0x7f1c0f4b, float:2.0743897E38)
            java.lang.String r6 = r6.getString(r1, r0)
            r5.append(r6)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = r3.f88425k
            java.lang.String r5 = r5.toString()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r6.setText(r5)
            com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupListViewModel r5 = r3.m78080a()
            if (r5 == 0) goto L_0x006e
            boolean r5 = r5.mo73181m()
            goto L_0x006f
        L_0x006e:
            r5 = 0
        L_0x006f:
            com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupListViewModel r6 = r3.m78080a()
            if (r6 == 0) goto L_0x007b
            java.util.List r6 = r6.mo73183o()
            if (r6 != 0) goto L_0x007f
        L_0x007b:
            java.util.List r6 = p2628d.p2629a.C52575l.m112097a()
        L_0x007f:
            if (r5 == 0) goto L_0x0093
            r3.mo72973e()
            android.widget.ImageView r5 = r3.f89789i
            java.lang.String r0 = "mCheckBox"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r0)
            boolean r4 = r6.contains(r4)
            r5.setSelected(r4)
            return
        L_0x0093:
            r3.mo72974f()
            android.widget.ImageView r4 = r3.f89789i
            java.lang.String r5 = "mCheckBox"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            r4.setSelected(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.group.p1839c.C34234d.mo72219a(java.lang.Object, java.lang.Object, int):void");
    }
}
