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

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.c.a */
public final class C34225a extends C34854a<IMContact> {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f88406a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34225a.class), "mMemberListViewModel", "getMMemberListViewModel()Lcom/ss/android/ugc/aweme/im/sdk/group/viewmodel/GroupMemberListViewModel;"))};

    /* renamed from: j */
    private final C52668f f88407j;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.c.a$a */
    public static final class C34226a extends C52712l implements C52670a<GroupMemberListViewModel> {

        /* renamed from: a */
        final /* synthetic */ C52760c f88408a;

        /* renamed from: b */
        final /* synthetic */ C0184k f88409b;

        /* renamed from: c */
        final /* synthetic */ C52760c f88410c;

        public C34226a(C52760c cVar, C0184k kVar, C52760c cVar2) {
            this.f88408a = cVar;
            this.f88409b = kVar;
            this.f88410c = cVar2;
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
                com.ss.android.ugc.aweme.im.sdk.group.c.a$a$1 r0 = new com.ss.android.ugc.aweme.im.sdk.group.c.a$a$1
                r0.<init>(r4)
                android.arch.lifecycle.k r1 = r4.f88409b
                boolean r2 = r1 instanceof android.support.p030v4.app.Fragment
                r3 = 0
                if (r2 == 0) goto L_0x0017
                android.arch.lifecycle.k r1 = r4.f88409b
                android.support.v4.app.Fragment r1 = (android.support.p030v4.app.Fragment) r1
                android.arch.lifecycle.y$b r0 = (android.arch.lifecycle.C0210y.C0212b) r0
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m439a(r1, r0)
                goto L_0x0027
            L_0x0017:
                boolean r1 = r1 instanceof android.support.p030v4.app.FragmentActivity
                if (r1 == 0) goto L_0x0026
                android.arch.lifecycle.k r1 = r4.f88409b
                android.support.v4.app.FragmentActivity r1 = (android.support.p030v4.app.FragmentActivity) r1
                android.arch.lifecycle.y$b r0 = (android.arch.lifecycle.C0210y.C0212b) r0
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m441a(r1, r0)
                goto L_0x0027
            L_0x0026:
                r0 = r3
            L_0x0027:
                if (r0 == 0) goto L_0x0043
                d.k.c r1 = r4.f88410c
                java.lang.Class r1 = p2628d.p2639f.C52669a.m112219a(r1)
                java.lang.String r1 = r1.getName()
                java.lang.String r2 = "viewModelClass.java.name"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                d.k.c r2 = r4.f88408a
                java.lang.Class r2 = p2628d.p2639f.C52669a.m112219a(r2)
                android.arch.lifecycle.x r0 = r0.mo360a(r1, r2)
                return r0
            L_0x0043:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.group.p1839c.C34225a.C34226a.invoke():android.arch.lifecycle.x");
        }
    }

    /* renamed from: a */
    private final GroupMemberListViewModel m78071a() {
        return (GroupMemberListViewModel) this.f88407j.getValue();
    }

    public C34225a(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bd5, viewGroup, false);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(pare…er_select, parent, false)");
        super(inflate);
        Context context = viewGroup.getContext();
        if (context != null) {
            C0184k kVar = (C0184k) context;
            C52760c a = C52728w.m112245a(GroupMemberListViewModel.class);
            this.f88407j = C52732g.m112285a(new C34226a(a, kVar, a));
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.arch.lifecycle.LifecycleOwner");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0095, code lost:
        if (r13 == null) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x003a, code lost:
        if (r13 == null) goto L_0x003c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo72219a(java.lang.Object r11, java.lang.Object r12, int r13) {
        /*
            r10 = this;
            com.ss.android.ugc.aweme.im.service.model.IMContact r11 = (com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact) r11
            com.ss.android.ugc.aweme.im.service.model.IMContact r12 = (com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact) r12
            java.lang.String r13 = "item"
            p2628d.p2639f.p2641b.C52711k.m112240b(r11, r13)
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r13 = r10.f89784d
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r13 = (com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView) r13
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r11.getDisplayAvatar()
            com.p683ss.android.ugc.aweme.base.C23515d.m57669a(r13, r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r13 = r10.f89786f
            java.lang.String r0 = "mNameTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r13, r0)
            java.lang.String r0 = r11.getDisplayName()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r13.setText(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r13 = r10.f89787g
            java.lang.String r0 = "mDetailTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r13, r0)
            r0 = 8
            r13.setVisibility(r0)
            com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberListViewModel r13 = r10.m78071a()
            if (r13 == 0) goto L_0x003c
            java.util.List r13 = r13.mo73183o()
            if (r13 != 0) goto L_0x0040
        L_0x003c:
            java.util.List r13 = p2628d.p2629a.C52575l.m112097a()
        L_0x0040:
            com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberListViewModel r1 = r10.m78071a()
            r2 = 0
            if (r1 == 0) goto L_0x004c
            boolean r1 = r1.mo73181m()
            goto L_0x004d
        L_0x004c:
            r1 = 0
        L_0x004d:
            if (r1 == 0) goto L_0x0061
            r10.mo72973e()
            android.widget.ImageView r1 = r10.f89789i
            java.lang.String r3 = "mCheckBox"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            boolean r13 = r13.contains(r11)
            r1.setSelected(r13)
            goto L_0x006e
        L_0x0061:
            r10.mo72974f()
            android.widget.ImageView r13 = r10.f89789i
            java.lang.String r1 = "mCheckBox"
            p2628d.p2639f.p2641b.C52711k.m112236a(r13, r1)
            r13.setSelected(r2)
        L_0x006e:
            com.ss.android.ugc.aweme.im.service.model.IMUser r5 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77749a(r11)
            if (r12 == 0) goto L_0x0079
            com.ss.android.ugc.aweme.im.service.model.IMUser r11 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77749a(r12)
            goto L_0x007a
        L_0x0079:
            r11 = 0
        L_0x007a:
            java.lang.String r12 = "user"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r12)
            com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberListViewModel r12 = r10.m78071a()
            if (r12 == 0) goto L_0x008a
            boolean r12 = r12.mo73182n()
            goto L_0x008b
        L_0x008a:
            r12 = 0
        L_0x008b:
            com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberListViewModel r13 = r10.m78071a()
            if (r13 == 0) goto L_0x009a
            java.lang.String r13 = r13.mo73185q()
            if (r13 != 0) goto L_0x0098
            goto L_0x009a
        L_0x0098:
            r6 = r13
            goto L_0x009d
        L_0x009a:
            java.lang.String r13 = ""
            goto L_0x0098
        L_0x009d:
            com.ss.android.ugc.aweme.im.sdk.relations.b.e r13 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1875b.C34848e.f89771a
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r10.f89786f
            java.lang.String r3 = "mNameTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r13.mo72966a(r1, r5, r6)
            android.widget.ImageView r13 = r10.f89785e
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35231bg.m79631a(r13, r5)
            if (r12 != 0) goto L_0x00eb
            if (r11 == 0) goto L_0x00d0
            java.lang.String r11 = r11.getInitialLetter()
            java.lang.String r12 = r5.getInitialLetter()
            boolean r11 = p2628d.p2639f.p2641b.C52711k.m112239a(r11, r12)
            r11 = r11 ^ 1
            if (r11 == 0) goto L_0x00c5
            goto L_0x00d0
        L_0x00c5:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r11 = r10.f89788h
            java.lang.String r12 = "mIndexTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r12)
            r11.setVisibility(r0)
            return
        L_0x00d0:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r11 = r10.f89788h
            java.lang.String r12 = "mIndexTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r12)
            r11.setVisibility(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r11 = r10.f89788h
            java.lang.String r12 = "mIndexTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r12)
            java.lang.String r12 = r5.getInitialLetter()
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            r11.setText(r12)
            return
        L_0x00eb:
            com.ss.android.ugc.aweme.im.sdk.relations.b.e r3 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1875b.C34848e.f89771a
            com.bytedance.ies.dmt.ui.widget.DmtTextView r11 = r10.f89787g
            java.lang.String r12 = "mDetailTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r12)
            r4 = r11
            android.widget.TextView r4 = (android.widget.TextView) r4
            r7 = 0
            r8 = 8
            r9 = 0
            r3.m78927a(r4, r5, r6, false)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r11 = r10.f89788h
            java.lang.String r12 = "mIndexTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r12)
            r11.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.group.p1839c.C34225a.mo72219a(java.lang.Object, java.lang.Object, int):void");
    }
}
