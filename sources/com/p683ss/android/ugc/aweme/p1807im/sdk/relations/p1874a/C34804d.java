package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a;

import android.arch.lifecycle.C0184k;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33229c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.model.C34979a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.model.MTRelationMemberListViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1876c.C34854a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1876c.C34861c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1876c.C34862d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1876c.C34865f;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.select.BaseMemberListViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.select.C35057a;
import com.p683ss.android.ugc.aweme.p1807im.service.C35460j;
import com.p683ss.android.ugc.aweme.p1807im.service.experiment.RefineShareInSiteExperiment;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.d */
public final class C34804d extends C34799b<IMContact> {

    /* renamed from: c */
    public static final C34805a f89672c = new C34805a(null);

    /* renamed from: a */
    public final MTRelationMemberListViewModel f89673a;

    /* renamed from: b */
    public final C0184k f89674b;

    /* renamed from: e */
    private C52686q<? super Integer, ? super Integer, ? super View, C52860x> f89675e;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.d$a */
    public static final class C34805a {
        private C34805a() {
        }

        public /* synthetic */ C34805a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.d$b */
    static final class C34806b extends C52712l implements C52686q<Integer, Integer, View, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C34804d f89676a;

        C34806b(C34804d dVar) {
            this.f89676a = dVar;
            super(3);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c1, code lost:
            if (r8 == null) goto L_0x00c3;
         */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00a9  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r6, java.lang.Object r7, java.lang.Object r8) {
            /*
                r5 = this;
                java.lang.Number r6 = (java.lang.Number) r6
                int r6 = r6.intValue()
                java.lang.Number r7 = (java.lang.Number) r7
                int r7 = r7.intValue()
                android.view.View r8 = (android.view.View) r8
                java.lang.String r0 = "view"
                p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
                switch(r6) {
                    case 0: goto L_0x0018;
                    case 1: goto L_0x0018;
                    case 2: goto L_0x0018;
                    default: goto L_0x0016;
                }
            L_0x0016:
                goto L_0x010c
            L_0x0018:
                com.ss.android.ugc.aweme.im.service.experiment.RefineShareInSiteExperiment r6 = com.p683ss.android.ugc.aweme.p1807im.service.experiment.RefineShareInSiteExperiment.INSTANCE
                boolean r6 = r6.mo73740e()
                if (r6 != 0) goto L_0x010c
                com.ss.android.ugc.aweme.im.sdk.relations.a.d r6 = r5.f89676a
                java.lang.Object r6 = r6.mo70602b(r7)
                com.ss.android.ugc.aweme.im.service.model.IMContact r6 = (com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact) r6
                if (r6 == 0) goto L_0x010c
                com.ss.android.ugc.aweme.im.sdk.relations.a.d r8 = r5.f89676a
                com.ss.android.ugc.aweme.im.service.model.IMUser r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77749a(r6)
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x00a6
                java.lang.String r3 = r0.getUid()
                java.lang.CharSequence r4 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e.m79730b()
                java.lang.String r4 = r4.toString()
                boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r3, r4)
                if (r3 != 0) goto L_0x00a6
                int r0 = r0.getFollowStatus()
                r3 = 2
                if (r0 == r3) goto L_0x00a6
                com.ss.android.ugc.aweme.im.sdk.relations.model.MTRelationMemberListViewModel r8 = r8.f89673a
                if (r8 == 0) goto L_0x00a4
                com.ss.android.ugc.aweme.sharer.ui.SharePackage r8 = r8.f90178c
                if (r8 != 0) goto L_0x0056
                goto L_0x00a4
            L_0x0056:
                java.lang.String r8 = r8.f106895d
                int r0 = r8.hashCode()
                r3 = -913038159(0xffffffffc99424b1, float:-1213590.1)
                if (r0 == r3) goto L_0x0092
                r3 = 102340(0x18fc4, float:1.43409E-40)
                if (r0 == r3) goto L_0x007f
                r3 = 110986(0x1b18a, float:1.55525E-40)
                if (r0 == r3) goto L_0x006c
                goto L_0x00a6
            L_0x006c:
                java.lang.String r0 = "pic"
                boolean r8 = r8.equals(r0)
                if (r8 == 0) goto L_0x00a6
                android.content.Context r8 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
                r0 = 2132545465(0x7f1c0fb9, float:2.074412E38)
                com.bytedance.common.utility.C9432q.m18672a(r8, r0)
                goto L_0x00a4
            L_0x007f:
                java.lang.String r0 = "gif"
                boolean r8 = r8.equals(r0)
                if (r8 == 0) goto L_0x00a6
                android.content.Context r8 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
                r0 = 2132545295(0x7f1c0f0f, float:2.0743776E38)
                com.bytedance.common.utility.C9432q.m18672a(r8, r0)
                goto L_0x00a4
            L_0x0092:
                java.lang.String r0 = "story_video"
                boolean r8 = r8.equals(r0)
                if (r8 == 0) goto L_0x00a6
                android.content.Context r8 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
                r0 = 2132545466(0x7f1c0fba, float:2.0744122E38)
                com.bytedance.common.utility.C9432q.m18672a(r8, r0)
            L_0x00a4:
                r8 = 0
                goto L_0x00a7
            L_0x00a6:
                r8 = 1
            L_0x00a7:
                if (r8 == 0) goto L_0x010c
                com.ss.android.ugc.aweme.im.sdk.relations.a.d r8 = r5.f89676a
                com.ss.android.ugc.aweme.im.sdk.relations.model.MTRelationMemberListViewModel r8 = r8.f89673a
                if (r8 == 0) goto L_0x00b4
                boolean r8 = r8.mo73181m()
                goto L_0x00b5
            L_0x00b4:
                r8 = 0
            L_0x00b5:
                if (r8 == 0) goto L_0x0103
                com.ss.android.ugc.aweme.im.sdk.relations.a.d r8 = r5.f89676a
                com.ss.android.ugc.aweme.im.sdk.relations.model.MTRelationMemberListViewModel r8 = r8.f89673a
                if (r8 == 0) goto L_0x00c3
                java.util.List r8 = r8.mo73183o()
                if (r8 != 0) goto L_0x00c7
            L_0x00c3:
                java.util.List r8 = p2628d.p2629a.C52575l.m112097a()
            L_0x00c7:
                boolean r0 = r8.contains(r6)
                if (r0 != 0) goto L_0x00f4
                int r8 = r8.size()
                r0 = 15
                if (r8 < r0) goto L_0x00f4
                android.content.Context r6 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
                android.content.Context r7 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
                r8 = 2132545598(0x7f1c103e, float:2.074439E38)
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r1[r2] = r0
                java.lang.String r7 = r7.getString(r8, r1)
                com.bytedance.ies.dmt.ui.d.a r6 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21551c(r6, r7)
                r6.mo19066a()
                goto L_0x010c
            L_0x00f4:
                com.ss.android.ugc.aweme.im.sdk.relations.a.d r8 = r5.f89676a
                com.ss.android.ugc.aweme.im.sdk.relations.model.MTRelationMemberListViewModel r8 = r8.f89673a
                if (r8 == 0) goto L_0x00fd
                r8.mo73179a(r6)
            L_0x00fd:
                com.ss.android.ugc.aweme.im.sdk.relations.a.d r6 = r5.f89676a
                r6.notifyItemChanged(r7)
                goto L_0x010c
            L_0x0103:
                com.ss.android.ugc.aweme.im.sdk.relations.a.d r7 = r5.f89676a
                com.ss.android.ugc.aweme.im.sdk.relations.model.MTRelationMemberListViewModel r7 = r7.f89673a
                if (r7 == 0) goto L_0x010c
                r7.mo73179a(r6)
            L_0x010c:
                d.x r6 = p2628d.C52860x.f131107a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a.C34804d.C34806b.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final C52686q<Integer, Integer, View, C52860x> mo72199l() {
        return this.f89675e;
    }

    public C34804d(C0184k kVar) {
        C52711k.m112240b(kVar, "owner");
        super(kVar);
        this.f89674b = kVar;
        C0184k kVar2 = this.f89674b;
        if (kVar2 != null) {
            BaseMemberListViewModel k = ((C35057a) kVar2).mo73192k();
            if (k != null) {
                this.f89673a = (MTRelationMemberListViewModel) k;
                this.f89675e = new C34806b(this);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.relations.model.MTRelationMemberListViewModel");
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.relations.select.BaseSelectDialog<*>");
    }

    /* renamed from: a */
    public final int mo48641a(int i) {
        boolean z;
        boolean z2;
        List k = mo70606k();
        Collection collection = k;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z || i < mo70605j()) {
            return super.mo48641a(i);
        }
        Integer valueOf = Integer.valueOf(i - mo70605j());
        int intValue = valueOf.intValue();
        if (intValue < 0 || intValue >= k.size()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            valueOf = null;
        }
        if (valueOf == null) {
            return super.mo48641a(i);
        }
        if (((IMContact) k.get(valueOf.intValue())) instanceof C34979a) {
            return 1;
        }
        return 0;
    }

    public final void onViewAttachedToWindow(C1352v vVar) {
        C52711k.m112240b(vVar, "holder");
        super.onViewAttachedToWindow(vVar);
        if (!(vVar instanceof C34862d)) {
            vVar = null;
        }
        C34862d dVar = (C34862d) vVar;
        if (dVar != null && RefineShareInSiteExperiment.INSTANCE.mo73738c()) {
            IMContact iMContact = dVar.f89798j;
            if (!(iMContact instanceof IMUser)) {
                iMContact = null;
            }
            IMUser iMUser = (IMUser) iMContact;
            if (iMUser != null) {
                String uid = iMUser.getUid();
                MTRelationMemberListViewModel mTRelationMemberListViewModel = dVar.f89800l;
                if (mTRelationMemberListViewModel == null) {
                    C52711k.m112237a("mMemberListViewModel");
                }
                if (!mTRelationMemberListViewModel.mo73164e().contains(uid)) {
                    Map linkedHashMap = new LinkedHashMap();
                    String recType = iMUser.getRecType();
                    C52711k.m112236a((Object) recType, "it.recType");
                    linkedHashMap.put("rec_type", recType);
                    linkedHashMap.put("is_recent_contact", String.valueOf(iMUser.getIsRecentContact()));
                    linkedHashMap.put("rank_index", String.valueOf(dVar.f89799k));
                    String uid2 = iMUser.getUid();
                    C52711k.m112236a((Object) uid2, "it.uid");
                    linkedHashMap.put("to_user_id", uid2);
                    C34004b a = C34004b.m77717a();
                    C52711k.m112236a((Object) a, "AwemeImManager.instance()");
                    C35460j f = a.mo71949f();
                    if (f != null) {
                        f.logIMShareHeadShow(linkedHashMap);
                    }
                    MTRelationMemberListViewModel mTRelationMemberListViewModel2 = dVar.f89800l;
                    if (mTRelationMemberListViewModel2 == null) {
                        C52711k.m112237a("mMemberListViewModel");
                    }
                    Set e = mTRelationMemberListViewModel2.mo73164e();
                    String uid3 = iMUser.getUid();
                    C52711k.m112236a((Object) uid3, "it.uid");
                    e.add(uid3);
                }
            }
        }
    }

    /* renamed from: b */
    public final C34854a<IMContact> mo72198b(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        if (i == 1) {
            return new C34861c<>(viewGroup);
        }
        if (RefineShareInSiteExperiment.INSTANCE.mo73739d() || C33229c.f86227e.mo70574g() == 1 || C33229c.f86227e.mo70574g() == 2) {
            return new C34862d<>(viewGroup, this.f89674b);
        }
        return new C34865f<>(viewGroup);
    }
}
