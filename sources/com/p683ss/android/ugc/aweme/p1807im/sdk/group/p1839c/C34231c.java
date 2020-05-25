package com.p683ss.android.ugc.aweme.p1807im.sdk.group.p1839c;

import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.viewmodel.GroupMemberListViewModel;
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

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.c.c */
public final class C34231c extends C34854a<IMContact> {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f88417a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34231c.class), "mMemberListViewModel", "getMMemberListViewModel()Lcom/ss/android/ugc/aweme/im/sdk/group/viewmodel/GroupMemberListViewModel;"))};

    /* renamed from: j */
    private final C52668f f88418j;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.c.c$a */
    public static final class C34232a extends C52712l implements C52670a<GroupMemberListViewModel> {

        /* renamed from: a */
        final /* synthetic */ C52760c f88419a;

        /* renamed from: b */
        final /* synthetic */ C0184k f88420b;

        /* renamed from: c */
        final /* synthetic */ C52760c f88421c;

        public C34232a(C52760c cVar, C0184k kVar, C52760c cVar2) {
            this.f88419a = cVar;
            this.f88420b = kVar;
            this.f88421c = cVar2;
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
        public final com.p683ss.android.ugc.aweme.p1807im.sdk.group.viewmodel.GroupMemberListViewModel invoke() {
            /*
                r4 = this;
                com.ss.android.ugc.aweme.im.sdk.group.c.c$a$1 r0 = new com.ss.android.ugc.aweme.im.sdk.group.c.c$a$1
                r0.<init>(r4)
                android.arch.lifecycle.k r1 = r4.f88420b
                boolean r2 = r1 instanceof android.support.p030v4.app.Fragment
                r3 = 0
                if (r2 == 0) goto L_0x0017
                android.arch.lifecycle.k r1 = r4.f88420b
                android.support.v4.app.Fragment r1 = (android.support.p030v4.app.Fragment) r1
                android.arch.lifecycle.y$b r0 = (android.arch.lifecycle.C0210y.C0212b) r0
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m439a(r1, r0)
                goto L_0x0027
            L_0x0017:
                boolean r1 = r1 instanceof android.support.p030v4.app.FragmentActivity
                if (r1 == 0) goto L_0x0026
                android.arch.lifecycle.k r1 = r4.f88420b
                android.support.v4.app.FragmentActivity r1 = (android.support.p030v4.app.FragmentActivity) r1
                android.arch.lifecycle.y$b r0 = (android.arch.lifecycle.C0210y.C0212b) r0
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m441a(r1, r0)
                goto L_0x0027
            L_0x0026:
                r0 = r3
            L_0x0027:
                if (r0 == 0) goto L_0x0043
                d.k.c r1 = r4.f88421c
                java.lang.Class r1 = p2628d.p2639f.C52669a.m112219a(r1)
                java.lang.String r1 = r1.getName()
                java.lang.String r2 = "viewModelClass.java.name"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                d.k.c r2 = r4.f88419a
                java.lang.Class r2 = p2628d.p2639f.C52669a.m112219a(r2)
                android.arch.lifecycle.x r0 = r0.mo360a(r1, r2)
                return r0
            L_0x0043:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.group.p1839c.C34231c.C34232a.invoke():android.arch.lifecycle.x");
        }
    }

    /* renamed from: a */
    private final GroupMemberListViewModel m78077a() {
        return (GroupMemberListViewModel) this.f88418j.getValue();
    }

    public C34231c(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bd5, viewGroup, false);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(pare…er_select, parent, false)");
        super(inflate);
        Context context = viewGroup.getContext();
        if (context != null) {
            C0184k kVar = (C0184k) context;
            C52760c a = C52728w.m112245a(GroupMemberListViewModel.class);
            this.f88418j = C52732g.m112285a(new C34232a(a, kVar, a));
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.arch.lifecycle.LifecycleOwner");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0075, code lost:
        if (r5 == null) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004c, code lost:
        if (r14 == null) goto L_0x004e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo72219a(java.lang.Object r12, java.lang.Object r13, int r14) {
        /*
            r11 = this;
            com.ss.android.ugc.aweme.im.service.model.IMContact r12 = (com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact) r12
            com.ss.android.ugc.aweme.im.service.model.IMContact r13 = (com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact) r13
            java.lang.String r14 = "item"
            p2628d.p2639f.p2641b.C52711k.m112240b(r12, r14)
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r14 = r11.f89784d
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r14 = (com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView) r14
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r12.getDisplayAvatar()
            com.p683ss.android.ugc.aweme.base.C23515d.m57669a(r14, r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r14 = r11.f89786f
            java.lang.String r0 = "mNameTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r14, r0)
            java.lang.String r0 = r12.getDisplayName()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r14.setText(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r14 = r11.f89787g
            java.lang.String r0 = "mDetailTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r14, r0)
            r0 = 8
            r14.setVisibility(r0)
            com.ss.android.ugc.aweme.im.service.model.IMUser r3 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77749a(r12)
            r12 = 0
            if (r13 == 0) goto L_0x003c
            com.ss.android.ugc.aweme.im.service.model.IMUser r13 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77749a(r13)
            goto L_0x003d
        L_0x003c:
            r13 = r12
        L_0x003d:
            java.lang.String r14 = "user"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r14)
            com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberListViewModel r14 = r11.m78077a()
            if (r14 == 0) goto L_0x004e
            java.util.List r14 = r14.mo73183o()
            if (r14 != 0) goto L_0x0052
        L_0x004e:
            java.util.List r14 = p2628d.p2629a.C52575l.m112097a()
        L_0x0052:
            com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberListViewModel r1 = r11.m78077a()
            r2 = 0
            if (r1 == 0) goto L_0x005e
            boolean r1 = r1.mo73181m()
            goto L_0x005f
        L_0x005e:
            r1 = 0
        L_0x005f:
            com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberListViewModel r4 = r11.m78077a()
            if (r4 == 0) goto L_0x006a
            boolean r4 = r4.mo73182n()
            goto L_0x006b
        L_0x006a:
            r4 = 0
        L_0x006b:
            com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberListViewModel r5 = r11.m78077a()
            if (r5 == 0) goto L_0x0077
            java.lang.String r5 = r5.mo73185q()
            if (r5 != 0) goto L_0x0079
        L_0x0077:
            java.lang.String r5 = ""
        L_0x0079:
            com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberListViewModel r6 = r11.m78077a()
            r7 = 1
            if (r6 == 0) goto L_0x0127
            int r6 = r6.f90193j
            r8 = 5
            if (r6 != r8) goto L_0x0127
            com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberListViewModel r6 = r11.m78077a()
            if (r6 == 0) goto L_0x0127
            java.lang.String r6 = r6.f88727a
            if (r6 == 0) goto L_0x0127
            com.ss.android.ugc.aweme.im.sdk.group.d r6 = com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34237d.C34238a.m78110a()
            com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberListViewModel r8 = r11.m78077a()
            if (r8 != 0) goto L_0x009c
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x009c:
            java.lang.String r8 = r8.f88727a
            if (r8 != 0) goto L_0x00a3
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00a3:
            java.util.List r6 = r6.mo72231b(r8)
            if (r6 == 0) goto L_0x00d5
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Collection r8 = (java.util.Collection) r8
            java.util.Iterator r6 = r6.iterator()
        L_0x00b6:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x00d1
            java.lang.Object r9 = r6.next()
            r10 = r9
            com.ss.android.ugc.aweme.im.sdk.chat.b.a.a r10 = (com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1814b.p1815a.C33367a) r10
            com.ss.android.ugc.aweme.im.service.model.IMUser r10 = r10.getUser()
            boolean r10 = p2628d.p2639f.p2641b.C52711k.m112239a(r3, r10)
            if (r10 == 0) goto L_0x00b6
            r8.add(r9)
            goto L_0x00b6
        L_0x00d1:
            r6 = r8
            java.util.List r6 = (java.util.List) r6
            goto L_0x00d6
        L_0x00d5:
            r6 = r12
        L_0x00d6:
            r8 = 2132017163(0x7f14000b, float:1.9672597E38)
            if (r6 == 0) goto L_0x0116
            int r9 = r6.size()
            if (r9 != r7) goto L_0x0116
            java.lang.Object r6 = r6.get(r2)
            com.ss.android.ugc.aweme.im.sdk.chat.b.a.a r6 = (com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1814b.p1815a.C33367a) r6
            com.bytedance.im.core.c.o r6 = r6.getMember()
            if (r6 == 0) goto L_0x0116
            int r6 = r6.getRole()
            com.bytedance.im.core.proto.GroupRole r9 = com.bytedance.p702im.core.proto.GroupRole.OWNER
            int r9 = r9.getValue()
            if (r6 != r9) goto L_0x0116
            android.view.View r12 = r11.f89783c
            com.bytedance.im.core.proto.GroupRole r6 = com.bytedance.p702im.core.proto.GroupRole.OWNER
            int r6 = r6.getValue()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r12.setTag(r8, r6)
            android.view.View r12 = r11.f89783c
            java.lang.String r6 = "mContentView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r6)
            r6 = 1051595899(0x3eae147b, float:0.34)
            r12.setAlpha(r6)
            goto L_0x0127
        L_0x0116:
            android.view.View r6 = r11.f89783c
            r6.setTag(r8, r12)
            android.view.View r12 = r11.f89783c
            java.lang.String r6 = "mContentView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r6)
            r6 = 1065353216(0x3f800000, float:1.0)
            r12.setAlpha(r6)
        L_0x0127:
            if (r1 == 0) goto L_0x013b
            r11.mo72973e()
            android.widget.ImageView r12 = r11.f89789i
            java.lang.String r1 = "mCheckBox"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r1)
            boolean r14 = r14.contains(r3)
            r12.setSelected(r14)
            goto L_0x0148
        L_0x013b:
            r11.mo72974f()
            android.widget.ImageView r12 = r11.f89789i
            java.lang.String r14 = "mCheckBox"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r14)
            r12.setSelected(r2)
        L_0x0148:
            com.ss.android.ugc.aweme.im.sdk.relations.b.e r12 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1875b.C34848e.f89771a
            com.bytedance.ies.dmt.ui.widget.DmtTextView r14 = r11.f89786f
            java.lang.String r1 = "mNameTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r14, r1)
            android.widget.TextView r14 = (android.widget.TextView) r14
            r12.mo72966a(r14, r3, r5)
            android.widget.ImageView r12 = r11.f89785e
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35231bg.m79631a(r12, r3)
            if (r4 != 0) goto L_0x0195
            if (r13 == 0) goto L_0x017a
            java.lang.String r12 = r13.getInitialLetter()
            java.lang.String r13 = r3.getInitialLetter()
            boolean r12 = p2628d.p2639f.p2641b.C52711k.m112239a(r12, r13)
            r12 = r12 ^ r7
            if (r12 == 0) goto L_0x016f
            goto L_0x017a
        L_0x016f:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r11.f89788h
            java.lang.String r13 = "mIndexTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r13)
            r12.setVisibility(r0)
            return
        L_0x017a:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r11.f89788h
            java.lang.String r13 = "mIndexTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r13)
            r12.setVisibility(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r11.f89788h
            java.lang.String r13 = "mIndexTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r13)
            java.lang.String r13 = r3.getInitialLetter()
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            r12.setText(r13)
            return
        L_0x0195:
            com.ss.android.ugc.aweme.im.sdk.relations.b.e r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1875b.C34848e.f89771a
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r11.f89787g
            java.lang.String r13 = "mDetailTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r13)
            r2 = r12
            android.widget.TextView r2 = (android.widget.TextView) r2
            r12 = 0
            r6 = 8
            r7 = 0
            r4 = r5
            r5 = r12
            r1.m78927a(r2, r3, r4, false)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r11.f89788h
            java.lang.String r13 = "mIndexTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r13)
            r12.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.group.p1839c.C34231c.mo72219a(java.lang.Object, java.lang.Object, int):void");
    }
}
