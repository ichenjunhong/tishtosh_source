package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1876c;

import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.model.MTRelationMemberListViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.select.BaseMemberListViewModel;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.ss.android.ugc.trill.R;
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

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.c.g */
public class C34868g extends C34854a<IMContact> {

    /* renamed from: j */
    static final /* synthetic */ C52767h[] f89818j = {C52728w.m112248a((C52718r) new C52719s(C52728w.m112245a(C34868g.class), "viewModel", "<v#0>"))};

    /* renamed from: a */
    private final View f89819a = this.itemView.findViewById(R.id.d1b);

    /* renamed from: k */
    public final BaseMemberListViewModel<?> f89820k = mo72220a();

    /* renamed from: l */
    public final ViewGroup f89821l;

    /* renamed from: m */
    private final DmtTextView f89822m = ((DmtTextView) this.itemView.findViewById(R.id.d1l));

    /* renamed from: n */
    private final ImageView f89823n = ((ImageView) this.itemView.findViewById(R.id.atf));

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.c.g$a */
    public static final class C34869a extends C52712l implements C52670a<MTRelationMemberListViewModel> {

        /* renamed from: a */
        final /* synthetic */ C52760c f89824a;

        /* renamed from: b */
        final /* synthetic */ C0184k f89825b;

        /* renamed from: c */
        final /* synthetic */ C52760c f89826c;

        public C34869a(C52760c cVar, C0184k kVar, C52760c cVar2) {
            this.f89824a = cVar;
            this.f89825b = kVar;
            this.f89826c = cVar2;
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
                com.ss.android.ugc.aweme.im.sdk.relations.c.g$a$1 r0 = new com.ss.android.ugc.aweme.im.sdk.relations.c.g$a$1
                r0.<init>(r4)
                android.arch.lifecycle.k r1 = r4.f89825b
                boolean r2 = r1 instanceof android.support.p030v4.app.Fragment
                r3 = 0
                if (r2 == 0) goto L_0x0017
                android.arch.lifecycle.k r1 = r4.f89825b
                android.support.v4.app.Fragment r1 = (android.support.p030v4.app.Fragment) r1
                android.arch.lifecycle.y$b r0 = (android.arch.lifecycle.C0210y.C0212b) r0
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m439a(r1, r0)
                goto L_0x0027
            L_0x0017:
                boolean r1 = r1 instanceof android.support.p030v4.app.FragmentActivity
                if (r1 == 0) goto L_0x0026
                android.arch.lifecycle.k r1 = r4.f89825b
                android.support.v4.app.FragmentActivity r1 = (android.support.p030v4.app.FragmentActivity) r1
                android.arch.lifecycle.y$b r0 = (android.arch.lifecycle.C0210y.C0212b) r0
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m441a(r1, r0)
                goto L_0x0027
            L_0x0026:
                r0 = r3
            L_0x0027:
                if (r0 == 0) goto L_0x0043
                d.k.c r1 = r4.f89826c
                java.lang.Class r1 = p2628d.p2639f.C52669a.m112219a(r1)
                java.lang.String r1 = r1.getName()
                java.lang.String r2 = "viewModelClass.java.name"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                d.k.c r2 = r4.f89824a
                java.lang.Class r2 = p2628d.p2639f.C52669a.m112219a(r2)
                android.arch.lifecycle.x r0 = r0.mo360a(r1, r2)
                return r0
            L_0x0043:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1876c.C34868g.C34869a.invoke():android.arch.lifecycle.x");
        }
    }

    /* renamed from: b */
    public List<IMContact> mo72221b() {
        BaseMemberListViewModel<?> baseMemberListViewModel = this.f89820k;
        if (!(baseMemberListViewModel instanceof MTRelationMemberListViewModel)) {
            baseMemberListViewModel = null;
        }
        MTRelationMemberListViewModel mTRelationMemberListViewModel = (MTRelationMemberListViewModel) baseMemberListViewModel;
        if (mTRelationMemberListViewModel != null) {
            return mTRelationMemberListViewModel.f90180f;
        }
        return null;
    }

    /* renamed from: a */
    public BaseMemberListViewModel<?> mo72220a() {
        Context context = this.f89821l.getContext();
        if (context != null) {
            C0184k kVar = (C0184k) context;
            C52760c a = C52728w.m112245a(MTRelationMemberListViewModel.class);
            return (BaseMemberListViewModel) C52732g.m112285a(new C34869a(a, kVar, a)).getValue();
        }
        throw new C52857u("null cannot be cast to non-null type android.arch.lifecycle.LifecycleOwner");
    }

    public C34868g(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bfb, viewGroup, false);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(pare…on_select, parent, false)");
        super(inflate);
        this.f89821l = viewGroup;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00fa, code lost:
        if (r1 == null) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0037, code lost:
        if (r1 == null) goto L_0x0039;
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
            com.ss.android.ugc.aweme.im.sdk.relations.select.BaseMemberListViewModel<?> r13 = r10.f89820k
            r0 = 0
            if (r13 == 0) goto L_0x002e
            boolean r13 = r13.mo73181m()
            goto L_0x002f
        L_0x002e:
            r13 = 0
        L_0x002f:
            com.ss.android.ugc.aweme.im.sdk.relations.select.BaseMemberListViewModel<?> r1 = r10.f89820k
            if (r1 == 0) goto L_0x0039
            java.util.List r1 = r1.mo73183o()
            if (r1 != 0) goto L_0x003d
        L_0x0039:
            java.util.List r1 = p2628d.p2629a.C52575l.m112097a()
        L_0x003d:
            java.util.List r2 = r10.mo72221b()
            if (r13 == 0) goto L_0x0055
            r10.mo72973e()
            android.widget.ImageView r13 = r10.f89789i
            java.lang.String r3 = "mCheckBox"
            p2628d.p2639f.p2641b.C52711k.m112236a(r13, r3)
            boolean r1 = r1.contains(r11)
            r13.setSelected(r1)
            goto L_0x0062
        L_0x0055:
            r10.mo72974f()
            android.widget.ImageView r13 = r10.f89789i
            java.lang.String r1 = "mCheckBox"
            p2628d.p2639f.p2641b.C52711k.m112236a(r13, r1)
            r13.setSelected(r0)
        L_0x0062:
            r13 = 1
            if (r2 == 0) goto L_0x00a1
            boolean r1 = r2.contains(r11)
            if (r1 != r13) goto L_0x00a1
            android.view.View r1 = r10.f89783c
            java.lang.String r2 = "mContentView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            r1.setEnabled(r0)
            android.widget.ImageView r1 = r10.f89789i
            java.lang.String r2 = "mCheckBox"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            r1.setSelected(r13)
            android.widget.ImageView r1 = r10.f89789i
            java.lang.String r2 = "mCheckBox"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            r1.setEnabled(r0)
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r1 = r10.f89784d
            java.lang.String r2 = "mAvatarIv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            r1.setEnabled(r0)
            android.view.View r1 = r10.f89783c
            java.lang.String r2 = "mContentView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            r2 = 1051595899(0x3eae147b, float:0.34)
            r1.setAlpha(r2)
            goto L_0x00cb
        L_0x00a1:
            android.view.View r1 = r10.f89783c
            java.lang.String r2 = "mContentView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            r1.setEnabled(r13)
            android.widget.ImageView r1 = r10.f89789i
            java.lang.String r2 = "mCheckBox"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            r1.setEnabled(r13)
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r1 = r10.f89784d
            java.lang.String r2 = "mAvatarIv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            r1.setEnabled(r13)
            android.view.View r1 = r10.f89783c
            java.lang.String r2 = "mContentView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r2)
        L_0x00cb:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r10.f89787g
            java.lang.String r2 = "mDetailTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            r2 = 8
            r1.setVisibility(r2)
            if (r12 == 0) goto L_0x00de
            com.ss.android.ugc.aweme.im.service.model.IMUser r12 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77749a(r12)
            goto L_0x00df
        L_0x00de:
            r12 = 0
        L_0x00df:
            com.ss.android.ugc.aweme.im.service.model.IMUser r5 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77749a(r11)
            java.lang.String r11 = "this"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r11)
            com.ss.android.ugc.aweme.im.sdk.relations.select.BaseMemberListViewModel<?> r11 = r10.f89820k
            if (r11 == 0) goto L_0x00f1
            boolean r11 = r11.mo73182n()
            goto L_0x00f2
        L_0x00f1:
            r11 = 0
        L_0x00f2:
            com.ss.android.ugc.aweme.im.sdk.relations.select.BaseMemberListViewModel<?> r1 = r10.f89820k
            if (r1 == 0) goto L_0x00ff
            java.lang.String r1 = r1.mo73185q()
            if (r1 != 0) goto L_0x00fd
            goto L_0x00ff
        L_0x00fd:
            r6 = r1
            goto L_0x0102
        L_0x00ff:
            java.lang.String r1 = ""
            goto L_0x00fd
        L_0x0102:
            com.ss.android.ugc.aweme.im.sdk.relations.b.e r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1875b.C34848e.f89771a
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r10.f89786f
            java.lang.String r4 = "mNameTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r1.mo72966a(r3, r5, r6)
            android.widget.ImageView r1 = r10.f89785e
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35231bg.m79631a(r1, r5)
            if (r11 != 0) goto L_0x01cd
            int r11 = r5.getType()
            r1 = 2
            r3 = 5
            if (r11 != r1) goto L_0x013c
            android.view.View r11 = r10.f89819a
            java.lang.String r1 = "mTitleLayout"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r1)
            r11.setVisibility(r0)
            android.widget.ImageView r11 = r10.f89823n
            java.lang.String r1 = "mFriendIcon"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r1)
            r11.setVisibility(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r11 = r10.f89822m
            r1 = 2132545493(0x7f1c0fd5, float:2.0744177E38)
            r11.setText(r1)
            goto L_0x0188
        L_0x013c:
            int r11 = r5.getType()
            if (r11 != r3) goto L_0x017e
            android.view.View r11 = r10.f89819a
            java.lang.String r1 = "mTitleLayout"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r1)
            r11.setVisibility(r0)
            android.widget.ImageView r11 = r10.f89823n
            java.lang.String r1 = "mFriendIcon"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r1)
            r11.setVisibility(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r11 = r10.f89822m
            java.lang.String r1 = "mTitleTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r1)
            android.view.View r1 = r10.itemView
            java.lang.String r4 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r4)
            android.content.Context r1 = r1.getContext()
            java.lang.String r4 = "itemView.context"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r4)
            android.content.res.Resources r1 = r1.getResources()
            r4 = 2132545311(0x7f1c0f1f, float:2.0743808E38)
            java.lang.String r1 = r1.getString(r4)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r11.setText(r1)
            goto L_0x0188
        L_0x017e:
            android.view.View r11 = r10.f89819a
            java.lang.String r1 = "mTitleLayout"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r1)
            r11.setVisibility(r2)
        L_0x0188:
            int r11 = r5.getType()
            if (r11 == r3) goto L_0x0195
            int r11 = r5.getType()
            r1 = 6
            if (r11 != r1) goto L_0x01a7
        L_0x0195:
            if (r12 == 0) goto L_0x01b2
            java.lang.String r11 = r12.getInitialLetter()
            java.lang.String r12 = r5.getInitialLetter()
            boolean r11 = p2628d.p2639f.p2641b.C52711k.m112239a(r11, r12)
            r11 = r11 ^ r13
            if (r11 == 0) goto L_0x01a7
            goto L_0x01b2
        L_0x01a7:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r11 = r10.f89788h
            java.lang.String r12 = "mIndexTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r12)
            r11.setVisibility(r2)
            return
        L_0x01b2:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r11 = r10.f89788h
            java.lang.String r12 = "mIndexTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r12)
            r11.setVisibility(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r11 = r10.f89788h
            java.lang.String r12 = "mIndexTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r12)
            java.lang.String r12 = r5.getInitialLetter()
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            r11.setText(r12)
            return
        L_0x01cd:
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
            android.view.View r11 = r10.f89819a
            java.lang.String r12 = "mTitleLayout"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r12)
            r11.setVisibility(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r11 = r10.f89788h
            java.lang.String r12 = "mIndexTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r12)
            r11.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1876c.C34868g.mo72219a(java.lang.Object, java.lang.Object, int):void");
    }
}
