package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1876c;

import android.arch.lifecycle.C0184k;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.model.MTRelationMemberListViewModel;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.c.d */
public final class C34862d extends C34854a<IMContact> {

    /* renamed from: a */
    public final DmtTextView f89797a = ((DmtTextView) this.itemView.findViewById(R.id.eur));

    /* renamed from: j */
    public IMContact f89798j;

    /* renamed from: k */
    public int f89799k = -1;

    /* renamed from: l */
    public MTRelationMemberListViewModel f89800l;

    /* renamed from: m */
    public final C0184k f89801m;

    /* renamed from: n */
    private final View f89802n = this.itemView.findViewById(R.id.d1b);

    /* renamed from: o */
    private final DmtTextView f89803o = ((DmtTextView) this.itemView.findViewById(R.id.d1l));

    /* renamed from: p */
    private final ImageView f89804p = ((ImageView) this.itemView.findViewById(R.id.atf));

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.c.d$a */
    static final class C34863a extends C52712l implements C52671b<View, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C34862d f89805a;

        /* renamed from: b */
        final /* synthetic */ IMContact f89806b;

        C34863a(C34862d dVar, IMContact iMContact) {
            this.f89805a = dVar;
            this.f89806b = iMContact;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            List<IMContact> list;
            C52711k.m112240b((View) obj, "it");
            MTRelationMemberListViewModel a = C34862d.m78948a(this.f89805a);
            if (a != null) {
                list = a.f90202s;
            } else {
                list = null;
            }
            if (list == null) {
                C52711k.m112234a();
            }
            if (!list.contains(this.f89806b)) {
                MTRelationMemberListViewModel a2 = C34862d.m78948a(this.f89805a);
                if (a2 != null) {
                    IMContact iMContact = this.f89806b;
                    C52711k.m112240b(iMContact, "imContact");
                    a2.f90201r.postValue(iMContact);
                    a2.f90202s.add(iMContact);
                }
                DmtTextView dmtTextView = this.f89805a.f89797a;
                C52711k.m112236a((Object) dmtTextView, "mSendButton");
                DmtTextView dmtTextView2 = this.f89805a.f89797a;
                C52711k.m112236a((Object) dmtTextView2, "mSendButton");
                dmtTextView.setText(dmtTextView2.getContext().getString(R.string.hf8));
                DmtTextView dmtTextView3 = this.f89805a.f89797a;
                DmtTextView dmtTextView4 = this.f89805a.f89797a;
                C52711k.m112236a((Object) dmtTextView4, "mSendButton");
                dmtTextView3.setTextColor(dmtTextView4.getResources().getColor(R.color.azb));
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ MTRelationMemberListViewModel m78948a(C34862d dVar) {
        MTRelationMemberListViewModel mTRelationMemberListViewModel = dVar.f89800l;
        if (mTRelationMemberListViewModel == null) {
            C52711k.m112237a("mMemberListViewModel");
        }
        return mTRelationMemberListViewModel;
    }

    public C34862d(ViewGroup viewGroup, C0184k kVar) {
        C52711k.m112240b(viewGroup, "parent");
        C52711k.m112240b(kVar, "owner");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bgy, viewGroup, false);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(pare…on_select, parent, false)");
        super(inflate);
        this.f89801m = kVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x01ff, code lost:
        if (r15 == null) goto L_0x0204;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x006c, code lost:
        if (r15 == null) goto L_0x006e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo72219a(java.lang.Object r13, java.lang.Object r14, int r15) {
        /*
            r12 = this;
            com.ss.android.ugc.aweme.im.service.model.IMContact r13 = (com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact) r13
            com.ss.android.ugc.aweme.im.service.model.IMContact r14 = (com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact) r14
            java.lang.String r0 = "item"
            p2628d.p2639f.p2641b.C52711k.m112240b(r13, r0)
            r12.f89798j = r13
            r12.f89799k = r15
            android.arch.lifecycle.k r15 = r12.f89801m
            if (r15 == 0) goto L_0x02a7
            com.ss.android.ugc.aweme.im.sdk.relations.select.a r15 = (com.p683ss.android.ugc.aweme.p1807im.sdk.relations.select.C35057a) r15
            com.ss.android.ugc.aweme.im.sdk.relations.select.BaseMemberListViewModel r15 = r15.mo73192k()
            if (r15 == 0) goto L_0x029f
            com.ss.android.ugc.aweme.im.sdk.relations.model.MTRelationMemberListViewModel r15 = (com.p683ss.android.ugc.aweme.p1807im.sdk.relations.model.MTRelationMemberListViewModel) r15
            r12.f89800l = r15
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r15 = r12.f89784d
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r15 = (com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView) r15
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r13.getDisplayAvatar()
            com.p683ss.android.ugc.aweme.base.C23515d.m57669a(r15, r0)
            com.ss.android.ugc.aweme.im.service.model.IMUser r15 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77749a(r13)
            android.widget.ImageView r0 = r12.f89785e
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35231bg.m79631a(r0, r15)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r15 = r12.f89786f
            java.lang.String r0 = "mNameTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r15, r0)
            java.lang.String r0 = r13.getDisplayName()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r15.setText(r0)
            com.ss.android.ugc.aweme.im.service.model.IMUser r15 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77749a(r13)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r12.f89787g
            java.lang.String r1 = "mDetailTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            java.lang.String r1 = "user"
            p2628d.p2639f.p2641b.C52711k.m112236a(r15, r1)
            java.lang.String r15 = r15.getUniqueId()
            java.lang.CharSequence r15 = (java.lang.CharSequence) r15
            r0.setText(r15)
            r12.mo72973e()
            com.ss.android.ugc.aweme.im.sdk.relations.model.MTRelationMemberListViewModel r15 = r12.f89800l
            if (r15 != 0) goto L_0x0066
            java.lang.String r0 = "mMemberListViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0066:
            if (r15 == 0) goto L_0x006e
            java.util.List r15 = r15.mo73183o()
            if (r15 != 0) goto L_0x0072
        L_0x006e:
            java.util.List r15 = p2628d.p2629a.C52575l.m112097a()
        L_0x0072:
            android.widget.ImageView r0 = r12.f89789i
            java.lang.String r1 = "mCheckBox"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            boolean r15 = r15.contains(r13)
            r0.setSelected(r15)
            com.ss.android.ugc.aweme.im.service.experiment.RefineShareInSiteExperiment r15 = com.p683ss.android.ugc.aweme.p1807im.service.experiment.RefineShareInSiteExperiment.INSTANCE
            boolean r15 = r15.mo73740e()
            r0 = 0
            r1 = 8
            if (r15 == 0) goto L_0x00ca
            com.bytedance.ies.dmt.ui.widget.DmtTextView r15 = r12.f89797a
            java.lang.String r2 = "mSendButton"
            p2628d.p2639f.p2641b.C52711k.m112236a(r15, r2)
            r15.setVisibility(r0)
            android.widget.ImageView r15 = r12.f89789i
            java.lang.String r2 = "mCheckBox"
            p2628d.p2639f.p2641b.C52711k.m112236a(r15, r2)
            r15.setVisibility(r1)
            com.ss.android.ugc.aweme.im.sdk.relations.c.d$a r15 = new com.ss.android.ugc.aweme.im.sdk.relations.c.d$a
            r15.<init>(r12, r13)
            d.f.a.b r15 = (p2628d.p2639f.p2640a.C52671b) r15
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r12.f89797a
            com.ss.android.ugc.aweme.im.sdk.relations.c.e r3 = new com.ss.android.ugc.aweme.im.sdk.relations.c.e
            r3.<init>(r15)
            android.view.View$OnClickListener r3 = (android.view.View.OnClickListener) r3
            r2.setOnClickListener(r3)
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r2 = r12.f89784d
            com.ss.android.ugc.aweme.im.sdk.relations.c.e r3 = new com.ss.android.ugc.aweme.im.sdk.relations.c.e
            r3.<init>(r15)
            android.view.View$OnClickListener r3 = (android.view.View.OnClickListener) r3
            r2.setOnClickListener(r3)
            android.view.View r2 = r12.f89783c
            com.ss.android.ugc.aweme.im.sdk.relations.c.e r3 = new com.ss.android.ugc.aweme.im.sdk.relations.c.e
            r3.<init>(r15)
            android.view.View$OnClickListener r3 = (android.view.View.OnClickListener) r3
            r2.setOnClickListener(r3)
        L_0x00ca:
            com.ss.android.ugc.aweme.im.service.experiment.RefineShareInSiteExperiment r15 = com.p683ss.android.ugc.aweme.p1807im.service.experiment.RefineShareInSiteExperiment.INSTANCE
            boolean r15 = r15.mo73738c()
            r2 = 2132544750(0x7f1c0cee, float:2.074267E38)
            r3 = 1
            r4 = 3
            if (r15 != 0) goto L_0x019a
            com.ss.android.ugc.aweme.im.sdk.abtest.c r15 = com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33229c.f86227e
            int r15 = r15.mo70574g()
            if (r15 == r3) goto L_0x019a
            com.ss.android.ugc.aweme.im.sdk.abtest.c r15 = com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33229c.f86227e
            int r15 = r15.mo70574g()
            r5 = 2
            if (r15 == r5) goto L_0x019a
            int r15 = r13.getType()
            if (r15 != r5) goto L_0x010c
            android.view.View r15 = r12.f89802n
            java.lang.String r2 = "mTitleLayout"
            p2628d.p2639f.p2641b.C52711k.m112236a(r15, r2)
            r15.setVisibility(r0)
            android.widget.ImageView r15 = r12.f89804p
            java.lang.String r2 = "mFriendIcon"
            p2628d.p2639f.p2641b.C52711k.m112236a(r15, r2)
            r15.setVisibility(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r15 = r12.f89803o
            r2 = 2132545494(0x7f1c0fd6, float:2.074418E38)
            r15.setText(r2)
            goto L_0x01e3
        L_0x010c:
            int r15 = r13.getType()
            r5 = 5
            if (r15 != r5) goto L_0x0150
            android.view.View r15 = r12.f89802n
            java.lang.String r2 = "mTitleLayout"
            p2628d.p2639f.p2641b.C52711k.m112236a(r15, r2)
            r15.setVisibility(r0)
            android.widget.ImageView r15 = r12.f89804p
            java.lang.String r2 = "mFriendIcon"
            p2628d.p2639f.p2641b.C52711k.m112236a(r15, r2)
            r15.setVisibility(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r15 = r12.f89803o
            java.lang.String r2 = "mTitleTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r15, r2)
            android.view.View r2 = r12.itemView
            java.lang.String r5 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r5)
            android.content.Context r2 = r2.getContext()
            java.lang.String r5 = "itemView.context"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r5)
            android.content.res.Resources r2 = r2.getResources()
            r5 = 2132545455(0x7f1c0faf, float:2.07441E38)
            java.lang.String r2 = r2.getString(r5)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r15.setText(r2)
            goto L_0x01e3
        L_0x0150:
            int r15 = r13.getType()
            if (r15 != r4) goto L_0x018f
            android.view.View r15 = r12.f89802n
            java.lang.String r5 = "mTitleLayout"
            p2628d.p2639f.p2641b.C52711k.m112236a(r15, r5)
            r15.setVisibility(r0)
            android.widget.ImageView r15 = r12.f89804p
            java.lang.String r5 = "mFriendIcon"
            p2628d.p2639f.p2641b.C52711k.m112236a(r15, r5)
            r15.setVisibility(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r15 = r12.f89803o
            java.lang.String r5 = "mTitleTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r15, r5)
            android.view.View r5 = r12.itemView
            java.lang.String r6 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            android.content.Context r5 = r5.getContext()
            java.lang.String r6 = "itemView.context"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            android.content.res.Resources r5 = r5.getResources()
            java.lang.String r2 = r5.getString(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r15.setText(r2)
            goto L_0x01e3
        L_0x018f:
            android.view.View r15 = r12.f89802n
            java.lang.String r2 = "mTitleLayout"
            p2628d.p2639f.p2641b.C52711k.m112236a(r15, r2)
            r15.setVisibility(r1)
            goto L_0x01e3
        L_0x019a:
            int r15 = r13.getType()
            if (r15 != r4) goto L_0x01d9
            android.view.View r15 = r12.f89802n
            java.lang.String r5 = "mTitleLayout"
            p2628d.p2639f.p2641b.C52711k.m112236a(r15, r5)
            r15.setVisibility(r0)
            android.widget.ImageView r15 = r12.f89804p
            java.lang.String r5 = "mFriendIcon"
            p2628d.p2639f.p2641b.C52711k.m112236a(r15, r5)
            r15.setVisibility(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r15 = r12.f89803o
            java.lang.String r5 = "mTitleTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r15, r5)
            android.view.View r5 = r12.itemView
            java.lang.String r6 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            android.content.Context r5 = r5.getContext()
            java.lang.String r6 = "itemView.context"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            android.content.res.Resources r5 = r5.getResources()
            java.lang.String r2 = r5.getString(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r15.setText(r2)
            goto L_0x01e3
        L_0x01d9:
            android.view.View r15 = r12.f89802n
            java.lang.String r2 = "mTitleLayout"
            p2628d.p2639f.p2641b.C52711k.m112236a(r15, r2)
            r15.setVisibility(r1)
        L_0x01e3:
            com.ss.android.ugc.aweme.im.service.model.IMUser r7 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77749a(r13)
            r13 = 0
            if (r14 == 0) goto L_0x01ef
            com.ss.android.ugc.aweme.im.service.model.IMUser r14 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77749a(r14)
            goto L_0x01f0
        L_0x01ef:
            r14 = r13
        L_0x01f0:
            com.ss.android.ugc.aweme.im.sdk.relations.model.MTRelationMemberListViewModel r15 = r12.f89800l
            if (r15 != 0) goto L_0x01f9
            java.lang.String r2 = "mMemberListViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x01f9:
            if (r15 == 0) goto L_0x0204
            java.lang.String r15 = r15.mo73185q()
            if (r15 != 0) goto L_0x0202
            goto L_0x0204
        L_0x0202:
            r8 = r15
            goto L_0x0207
        L_0x0204:
            java.lang.String r15 = ""
            goto L_0x0202
        L_0x0207:
            com.ss.android.ugc.aweme.im.sdk.relations.b.e r15 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1875b.C34848e.f89771a
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r12.f89786f
            java.lang.String r5 = "mNameTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r5)
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.String r5 = "user"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r5)
            r15.mo72966a(r2, r7, r8)
            com.ss.android.ugc.aweme.im.sdk.relations.model.MTRelationMemberListViewModel r15 = r12.f89800l
            if (r15 != 0) goto L_0x0223
            java.lang.String r2 = "mMemberListViewModel"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0223:
            if (r15 == 0) goto L_0x022d
            boolean r13 = r15.mo73182n()
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
        L_0x022d:
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L_0x0277
            int r13 = r7.getType()
            if (r13 == r4) goto L_0x023f
            int r13 = r7.getType()
            if (r13 != 0) goto L_0x0251
        L_0x023f:
            if (r14 == 0) goto L_0x025c
            java.lang.String r13 = r14.getInitialLetter()
            java.lang.String r14 = r7.getInitialLetter()
            boolean r13 = p2628d.p2639f.p2641b.C52711k.m112239a(r13, r14)
            r13 = r13 ^ r3
            if (r13 == 0) goto L_0x0251
            goto L_0x025c
        L_0x0251:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r13 = r12.f89788h
            java.lang.String r14 = "mIndexTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r13, r14)
            r13.setVisibility(r1)
            return
        L_0x025c:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r13 = r12.f89788h
            java.lang.String r14 = "mIndexTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r13, r14)
            r13.setVisibility(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r13 = r12.f89788h
            java.lang.String r14 = "mIndexTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r13, r14)
            java.lang.String r14 = r7.getInitialLetter()
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            r13.setText(r14)
            return
        L_0x0277:
            com.ss.android.ugc.aweme.im.sdk.relations.b.e r5 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1875b.C34848e.f89771a
            com.bytedance.ies.dmt.ui.widget.DmtTextView r13 = r12.f89787g
            java.lang.String r14 = "mDetailTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r13, r14)
            r6 = r13
            android.widget.TextView r6 = (android.widget.TextView) r6
            r9 = 0
            r10 = 8
            r11 = 0
            r5.m78927a(r6, r7, r8, false)
            android.view.View r13 = r12.f89802n
            java.lang.String r14 = "mTitleLayout"
            p2628d.p2639f.p2641b.C52711k.m112236a(r13, r14)
            r13.setVisibility(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r13 = r12.f89788h
            java.lang.String r14 = "mIndexTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r13, r14)
            r13.setVisibility(r1)
            return
        L_0x029f:
            d.u r13 = new d.u
            java.lang.String r14 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.relations.model.MTRelationMemberListViewModel"
            r13.<init>(r14)
            throw r13
        L_0x02a7:
            d.u r13 = new d.u
            java.lang.String r14 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.relations.select.BaseSelectDialog<*>"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1876c.C34862d.mo72219a(java.lang.Object, java.lang.Object, int):void");
    }
}
