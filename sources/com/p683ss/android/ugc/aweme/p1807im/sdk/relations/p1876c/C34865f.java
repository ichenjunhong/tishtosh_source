package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1876c;

import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.model.MTRelationMemberListViewModel;
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

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.c.f */
public final class C34865f extends C34854a<IMContact> {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f89808a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34865f.class), "mMemberListViewModel", "getMMemberListViewModel()Lcom/ss/android/ugc/aweme/im/sdk/relations/model/MTRelationMemberListViewModel;"))};

    /* renamed from: j */
    private final View f89809j = this.itemView.findViewById(R.id.d1b);

    /* renamed from: k */
    private final DmtTextView f89810k = ((DmtTextView) this.itemView.findViewById(R.id.d1l));

    /* renamed from: l */
    private final ImageView f89811l = ((ImageView) this.itemView.findViewById(R.id.atf));

    /* renamed from: m */
    private final int f89812m;

    /* renamed from: n */
    private final C52668f f89813n;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.c.f$a */
    public static final class C34866a extends C52712l implements C52670a<MTRelationMemberListViewModel> {

        /* renamed from: a */
        final /* synthetic */ C52760c f89814a;

        /* renamed from: b */
        final /* synthetic */ C0184k f89815b;

        /* renamed from: c */
        final /* synthetic */ C52760c f89816c;

        public C34866a(C52760c cVar, C0184k kVar, C52760c cVar2) {
            this.f89814a = cVar;
            this.f89815b = kVar;
            this.f89816c = cVar2;
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
        public final com.p683ss.android.ugc.aweme.p1807im.sdk.relations.model.MTRelationMemberListViewModel invoke() {
            /*
                r4 = this;
                com.ss.android.ugc.aweme.im.sdk.relations.c.f$a$1 r0 = new com.ss.android.ugc.aweme.im.sdk.relations.c.f$a$1
                r0.<init>(r4)
                android.arch.lifecycle.k r1 = r4.f89815b
                boolean r2 = r1 instanceof android.support.p030v4.app.Fragment
                r3 = 0
                if (r2 == 0) goto L_0x0017
                android.arch.lifecycle.k r1 = r4.f89815b
                android.support.v4.app.Fragment r1 = (android.support.p030v4.app.Fragment) r1
                android.arch.lifecycle.y$b r0 = (android.arch.lifecycle.C0210y.C0212b) r0
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m439a(r1, r0)
                goto L_0x0027
            L_0x0017:
                boolean r1 = r1 instanceof android.support.p030v4.app.FragmentActivity
                if (r1 == 0) goto L_0x0026
                android.arch.lifecycle.k r1 = r4.f89815b
                android.support.v4.app.FragmentActivity r1 = (android.support.p030v4.app.FragmentActivity) r1
                android.arch.lifecycle.y$b r0 = (android.arch.lifecycle.C0210y.C0212b) r0
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m441a(r1, r0)
                goto L_0x0027
            L_0x0026:
                r0 = r3
            L_0x0027:
                if (r0 == 0) goto L_0x0043
                d.k.c r1 = r4.f89816c
                java.lang.Class r1 = p2628d.p2639f.C52669a.m112219a(r1)
                java.lang.String r1 = r1.getName()
                java.lang.String r2 = "viewModelClass.java.name"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                d.k.c r2 = r4.f89814a
                java.lang.Class r2 = p2628d.p2639f.C52669a.m112219a(r2)
                android.arch.lifecycle.x r0 = r0.mo360a(r1, r2)
                return r0
            L_0x0043:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1876c.C34865f.C34866a.invoke():android.arch.lifecycle.x");
        }
    }

    /* renamed from: a */
    private final MTRelationMemberListViewModel m78950a() {
        return (MTRelationMemberListViewModel) this.f89813n.getValue();
    }

    public C34865f(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bfb, viewGroup, false);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(pare…on_select, parent, false)");
        super(inflate);
        View view = this.itemView;
        C52711k.m112236a((Object) view, "itemView");
        Context context = view.getContext();
        C52711k.m112236a((Object) context, "itemView.context");
        this.f89812m = context.getResources().getColor(R.color.ars);
        Context context2 = viewGroup.getContext();
        if (context2 != null) {
            C0184k kVar = (C0184k) context2;
            C52760c a = C52728w.m112245a(MTRelationMemberListViewModel.class);
            this.f89813n = C52732g.m112285a(new C34866a(a, kVar, a));
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.arch.lifecycle.LifecycleOwner");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00b5, code lost:
        if (r8 == null) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x01bc, code lost:
        if (r2 == null) goto L_0x01c1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo72219a(java.lang.Object r18, java.lang.Object r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            com.ss.android.ugc.aweme.im.service.model.IMContact r1 = (com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact) r1
            r2 = r19
            com.ss.android.ugc.aweme.im.service.model.IMContact r2 = (com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact) r2
            java.lang.String r3 = "item"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r3)
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r3 = r0.f89784d
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r3 = (com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView) r3
            com.ss.android.ugc.aweme.base.model.UrlModel r4 = r1.getDisplayAvatar()
            com.p683ss.android.ugc.aweme.base.C23515d.m57669a(r3, r4)
            boolean r3 = r1 instanceof com.p683ss.android.ugc.aweme.p1807im.service.model.IMConversation
            r4 = 1
            r5 = 0
            r6 = 0
            if (r3 == 0) goto L_0x007e
            com.bytedance.ies.uikit.textview.a r3 = new com.bytedance.ies.uikit.textview.a
            android.view.View r7 = r0.itemView
            java.lang.String r8 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)
            android.content.Context r7 = r7.getContext()
            r3.<init>(r7)
            r7 = 1097859072(0x41700000, float:15.0)
            r3.mo20477a(r7)
            int r7 = r0.f89812m
            r3.mo20478a(r7)
            java.lang.String r7 = " "
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            android.content.Context r7 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            r9 = 2132545355(0x7f1c0f4b, float:2.0743897E38)
            java.lang.Object[] r10 = new java.lang.Object[r4]
            r11 = r1
            com.ss.android.ugc.aweme.im.service.model.IMConversation r11 = (com.p683ss.android.ugc.aweme.p1807im.service.model.IMConversation) r11
            int r11 = r11.getConversationMemberCount()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r10[r6] = r11
            java.lang.String r7 = r7.getString(r9, r10)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r3.mo20479a(r7)
            int r7 = r3.getIntrinsicWidth()
            int r8 = r3.getIntrinsicHeight()
            r3.setBounds(r6, r6, r7, r8)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r7 = r0.f89786f
            android.graphics.drawable.Drawable r3 = (android.graphics.drawable.Drawable) r3
            r7.setCompoundDrawables(r5, r5, r3, r5)
            goto L_0x0083
        L_0x007e:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r0.f89786f
            r3.setCompoundDrawables(r5, r5, r5, r5)
        L_0x0083:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r0.f89786f
            java.lang.String r7 = "mNameTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r7)
            java.lang.String r7 = r1.getDisplayName()
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r3.setText(r7)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r0.f89787g
            java.lang.String r7 = "mDetailTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r7)
            r7 = 8
            r3.setVisibility(r7)
            com.ss.android.ugc.aweme.im.sdk.relations.model.MTRelationMemberListViewModel r3 = r17.m78950a()
            if (r3 == 0) goto L_0x00aa
            boolean r3 = r3.mo73181m()
            goto L_0x00ab
        L_0x00aa:
            r3 = 0
        L_0x00ab:
            com.ss.android.ugc.aweme.im.sdk.relations.model.MTRelationMemberListViewModel r8 = r17.m78950a()
            if (r8 == 0) goto L_0x00b7
            java.util.List r8 = r8.mo73183o()
            if (r8 != 0) goto L_0x00bb
        L_0x00b7:
            java.util.List r8 = p2628d.p2629a.C52575l.m112097a()
        L_0x00bb:
            com.ss.android.ugc.aweme.im.sdk.relations.model.MTRelationMemberListViewModel r9 = r17.m78950a()
            if (r9 == 0) goto L_0x00c4
            r9.mo73182n()
        L_0x00c4:
            if (r3 == 0) goto L_0x00d8
            r17.mo72973e()
            android.widget.ImageView r3 = r0.f89789i
            java.lang.String r9 = "mCheckBox"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r9)
            boolean r8 = r8.contains(r1)
            r3.setSelected(r8)
            goto L_0x00e5
        L_0x00d8:
            r17.mo72974f()
            android.widget.ImageView r3 = r0.f89789i
            java.lang.String r8 = "mCheckBox"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r8)
            r3.setSelected(r6)
        L_0x00e5:
            int r3 = r1.getType()
            r8 = 2
            r9 = 3
            if (r3 != r8) goto L_0x010b
            android.view.View r3 = r0.f89809j
            java.lang.String r8 = "mTitleLayout"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r8)
            r3.setVisibility(r6)
            android.widget.ImageView r3 = r0.f89811l
            java.lang.String r8 = "mFriendIcon"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r8)
            r3.setVisibility(r7)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r0.f89810k
            r8 = 2132545493(0x7f1c0fd5, float:2.0744177E38)
            r3.setText(r8)
            goto L_0x019a
        L_0x010b:
            int r3 = r1.getType()
            r8 = 5
            if (r3 != r8) goto L_0x014e
            android.view.View r3 = r0.f89809j
            java.lang.String r8 = "mTitleLayout"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r8)
            r3.setVisibility(r6)
            android.widget.ImageView r3 = r0.f89811l
            java.lang.String r8 = "mFriendIcon"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r8)
            r3.setVisibility(r7)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r0.f89810k
            java.lang.String r8 = "mTitleTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r8)
            android.view.View r8 = r0.itemView
            java.lang.String r10 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r10)
            android.content.Context r8 = r8.getContext()
            java.lang.String r10 = "itemView.context"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r10)
            android.content.res.Resources r8 = r8.getResources()
            r10 = 2132545311(0x7f1c0f1f, float:2.0743808E38)
            java.lang.String r8 = r8.getString(r10)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r3.setText(r8)
            goto L_0x019a
        L_0x014e:
            int r3 = r1.getType()
            if (r3 != r9) goto L_0x0190
            android.view.View r3 = r0.f89809j
            java.lang.String r8 = "mTitleLayout"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r8)
            r3.setVisibility(r6)
            android.widget.ImageView r3 = r0.f89811l
            java.lang.String r8 = "mFriendIcon"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r8)
            r3.setVisibility(r7)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r0.f89810k
            java.lang.String r8 = "mTitleTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r8)
            android.view.View r8 = r0.itemView
            java.lang.String r10 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r10)
            android.content.Context r8 = r8.getContext()
            java.lang.String r10 = "itemView.context"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r10)
            android.content.res.Resources r8 = r8.getResources()
            r10 = 2132545454(0x7f1c0fae, float:2.0744098E38)
            java.lang.String r8 = r8.getString(r10)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r3.setText(r8)
            goto L_0x019a
        L_0x0190:
            android.view.View r3 = r0.f89809j
            java.lang.String r8 = "mTitleLayout"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r8)
            r3.setVisibility(r7)
        L_0x019a:
            com.ss.android.ugc.aweme.im.service.model.IMUser r12 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77749a(r1)
            if (r2 == 0) goto L_0x01a4
            com.ss.android.ugc.aweme.im.service.model.IMUser r5 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77749a(r2)
        L_0x01a4:
            if (r12 == 0) goto L_0x0245
            com.ss.android.ugc.aweme.im.sdk.relations.model.MTRelationMemberListViewModel r1 = r17.m78950a()
            if (r1 == 0) goto L_0x01b1
            boolean r1 = r1.mo73182n()
            goto L_0x01b2
        L_0x01b1:
            r1 = 0
        L_0x01b2:
            com.ss.android.ugc.aweme.im.sdk.relations.model.MTRelationMemberListViewModel r2 = r17.m78950a()
            if (r2 == 0) goto L_0x01c1
            java.lang.String r2 = r2.mo73185q()
            if (r2 != 0) goto L_0x01bf
            goto L_0x01c1
        L_0x01bf:
            r13 = r2
            goto L_0x01c4
        L_0x01c1:
            java.lang.String r2 = ""
            goto L_0x01bf
        L_0x01c4:
            com.ss.android.ugc.aweme.im.sdk.relations.b.e r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1875b.C34848e.f89771a
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r0.f89786f
            java.lang.String r8 = "mNameTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r8)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.mo72966a(r3, r12, r13)
            android.widget.ImageView r2 = r0.f89785e
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35231bg.m79631a(r2, r12)
            if (r1 != 0) goto L_0x021d
            int r1 = r12.getType()
            if (r1 == r9) goto L_0x01e5
            int r1 = r12.getType()
            if (r1 != 0) goto L_0x01f7
        L_0x01e5:
            if (r5 == 0) goto L_0x0202
            java.lang.String r1 = r5.getInitialLetter()
            java.lang.String r2 = r12.getInitialLetter()
            boolean r1 = p2628d.p2639f.p2641b.C52711k.m112239a(r1, r2)
            r1 = r1 ^ r4
            if (r1 == 0) goto L_0x01f7
            goto L_0x0202
        L_0x01f7:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r0.f89788h
            java.lang.String r2 = "mIndexTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            r1.setVisibility(r7)
            return
        L_0x0202:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r0.f89788h
            java.lang.String r2 = "mIndexTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            r1.setVisibility(r6)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r0.f89788h
            java.lang.String r2 = "mIndexTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            java.lang.String r2 = r12.getInitialLetter()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.setText(r2)
            return
        L_0x021d:
            com.ss.android.ugc.aweme.im.sdk.relations.b.e r10 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1875b.C34848e.f89771a
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r0.f89787g
            java.lang.String r2 = "mDetailTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            r11 = r1
            android.widget.TextView r11 = (android.widget.TextView) r11
            r14 = 0
            r15 = 8
            r16 = 0
            r10.m78927a(r11, r12, r13, false)
            android.view.View r1 = r0.f89809j
            java.lang.String r2 = "mTitleLayout"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            r1.setVisibility(r7)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r0.f89788h
            java.lang.String r2 = "mIndexTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            r1.setVisibility(r7)
        L_0x0245:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1876c.C34865f.mo72219a(java.lang.Object, java.lang.Object, int):void");
    }
}
