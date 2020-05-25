package com.p683ss.android.ugc.aweme.p1807im.sdk.share.panel.p1889a;

import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.panel.p1891c.C35148a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.panel.p1892d.C35150a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.panel.p1892d.C35153b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35193ai;
import com.p683ss.android.ugc.aweme.p1807im.service.C35460j;
import com.p683ss.android.ugc.aweme.p1807im.service.experiment.RefineShareInSiteExperiment;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52847n;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.a.a */
public final class C35139a extends C1322a<C1352v> {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f90371a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C35139a.class), "data", "getData()Ljava/util/List;"))};

    /* renamed from: b */
    public static final C35140a f90372b = new C35140a(null);

    /* renamed from: c */
    private final C52668f f90373c = C52732g.m112285a(C35141b.f90375a);

    /* renamed from: d */
    private final SharePanelViewModel f90374d;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.a.a$a */
    public static final class C35140a {
        private C35140a() {
        }

        public /* synthetic */ C35140a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.a.a$b */
    static final class C35141b extends C52712l implements C52670a<List<IMContact>> {

        /* renamed from: a */
        public static final C35141b f90375a = new C35141b();

        C35141b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: a */
    public final List<IMContact> mo73258a() {
        return (List) this.f90373c.getValue();
    }

    public final int getItemCount() {
        return mo73258a().size();
    }

    public final int getItemViewType(int i) {
        if (mo73258a().get(i) instanceof C35148a) {
            return 2;
        }
        return 1;
    }

    public C35139a(SharePanelViewModel sharePanelViewModel) {
        C52711k.m112240b(sharePanelViewModel, "viewModel");
        this.f90374d = sharePanelViewModel;
    }

    public final void onViewDetachedFromWindow(C1352v vVar) {
        C52711k.m112240b(vVar, "holder");
        super.onViewDetachedFromWindow(vVar);
        if (!(vVar instanceof C35153b)) {
            vVar = null;
        }
        C35153b bVar = (C35153b) vVar;
        if (bVar != null) {
            bVar.f90417g = false;
        }
    }

    public final void onViewAttachedToWindow(C1352v vVar) {
        boolean z;
        C52711k.m112240b(vVar, "holder");
        super.onViewAttachedToWindow(vVar);
        if (!(vVar instanceof C35153b)) {
            vVar = null;
        }
        C35153b bVar = (C35153b) vVar;
        if (bVar != null) {
            bVar.f90417g = true;
            C52847n<Boolean, String> nVar = bVar.f90418h;
            if (nVar != null) {
                CharSequence charSequence = (CharSequence) nVar.getSecond();
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!(true ^ z)) {
                    nVar = null;
                }
                if (nVar != null) {
                    IMContact iMContact = bVar.f90414d;
                    if (!(iMContact instanceof IMUser)) {
                        iMContact = null;
                    }
                    IMUser iMUser = (IMUser) iMContact;
                    if (iMUser != null) {
                        String uid = iMUser.getUid();
                        if (uid != null && !bVar.f90419i.mo73283c().contains(uid)) {
                            C35193ai.m79546a("share_head_online_status_show", ((Boolean) nVar.getFirst()).booleanValue(), (String) nVar.getSecond(), uid);
                            bVar.f90419i.mo73283c().add(uid);
                        }
                    }
                }
            }
            IMContact iMContact2 = bVar.f90414d;
            if (!(iMContact2 instanceof IMUser)) {
                iMContact2 = null;
            }
            IMUser iMUser2 = (IMUser) iMContact2;
            if (iMUser2 != null) {
                if (!bVar.f90419i.mo73284d().contains(iMUser2.getUid())) {
                    Map linkedHashMap = new LinkedHashMap();
                    String recType = iMUser2.getRecType();
                    C52711k.m112236a((Object) recType, "it.recType");
                    linkedHashMap.put("rec_type", recType);
                    linkedHashMap.put("is_recent_contact", String.valueOf(iMUser2.getIsRecentContact()));
                    linkedHashMap.put("rank_index", String.valueOf(bVar.f90415e));
                    String uid2 = iMUser2.getUid();
                    C52711k.m112236a((Object) uid2, "it.uid");
                    linkedHashMap.put("to_user_id", uid2);
                    C34004b a = C34004b.m77717a();
                    C52711k.m112236a((Object) a, "AwemeImManager.instance()");
                    C35460j f = a.mo71949f();
                    if (f != null) {
                        f.logIMShareHeadShow(linkedHashMap);
                    }
                    Set d = bVar.f90419i.mo73284d();
                    String uid3 = iMUser2.getUid();
                    C52711k.m112236a((Object) uid3, "it.uid");
                    d.add(uid3);
                }
            }
        }
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        C52711k.m112240b(viewGroup, "parent");
        if (i != 2) {
            SharePanelViewModel sharePanelViewModel = this.f90374d;
            C52711k.m112240b(viewGroup, "parent");
            C52711k.m112240b(sharePanelViewModel, "viewModel");
            if (RefineShareInSiteExperiment.m80104a() != 5) {
                i2 = R.layout.bfo;
            } else {
                i2 = R.layout.bgx;
            }
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i2, viewGroup, false);
            C52711k.m112236a((Object) inflate, "itemView");
            return new C35153b(inflate, sharePanelViewModel);
        }
        SharePanelViewModel sharePanelViewModel2 = this.f90374d;
        C52711k.m112240b(viewGroup, "parent");
        C52711k.m112240b(sharePanelViewModel2, "viewModel");
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bdl, viewGroup, false);
        C52711k.m112236a((Object) inflate2, "itemView");
        return new C35150a(inflate2, sharePanelViewModel2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBindViewHolder(android.support.p043v7.widget.RecyclerView.C1352v r8, int r9) {
        /*
            r7 = this;
            java.lang.String r0 = "viewHolder"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
            boolean r0 = r8 instanceof com.p683ss.android.ugc.aweme.p1807im.sdk.share.panel.p1892d.C35150a
            r1 = 1
            if (r0 == 0) goto L_0x003f
            com.ss.android.ugc.aweme.im.sdk.share.panel.d.a r8 = (com.p683ss.android.ugc.aweme.p1807im.sdk.share.panel.p1892d.C35150a) r8
            java.util.List r0 = r7.mo73258a()
            java.lang.Object r9 = r0.get(r9)
            com.ss.android.ugc.aweme.im.service.model.IMContact r9 = (com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact) r9
            java.lang.String r0 = "contact"
            p2628d.p2639f.p2641b.C52711k.m112240b(r9, r0)
            r8.f90406c = r9
            android.content.Context r9 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            android.content.res.Resources r9 = r9.getResources()
            int r0 = r8.f90405b
            android.graphics.drawable.Drawable r9 = r9.getDrawable(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 19
            if (r0 < r2) goto L_0x0039
            java.lang.String r0 = "drawable"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r0)
            r9.setAutoMirrored(r1)
        L_0x0039:
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r8 = r8.f90404a
            r8.setImageDrawable(r9)
            return
        L_0x003f:
            boolean r0 = r8 instanceof com.p683ss.android.ugc.aweme.p1807im.sdk.share.panel.p1892d.C35153b
            if (r0 == 0) goto L_0x014c
            com.ss.android.ugc.aweme.im.sdk.share.panel.d.b r8 = (com.p683ss.android.ugc.aweme.p1807im.sdk.share.panel.p1892d.C35153b) r8
            java.util.List r0 = r7.mo73258a()
            java.lang.Object r0 = r0.get(r9)
            com.ss.android.ugc.aweme.im.service.model.IMContact r0 = (com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact) r0
            java.lang.String r2 = "contact"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r2)
            r8.f90414d = r0
            r8.f90415e = r9
            r9 = 0
            r8.f90418h = r9
            com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel r2 = r8.f90419i
            java.util.Set r2 = r2.mo73280a()
            boolean r2 = r2.contains(r0)
            r8.mo73273a(r2)
            r8.mo73270a()
            boolean r2 = r0 instanceof com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser
            r3 = 0
            if (r2 == 0) goto L_0x0081
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = (com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser) r0
            r8.mo73272a(r0)
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r2 = r8.f90412b
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r2 = (com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView) r2
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getDisplayAvatar()
            com.p683ss.android.ugc.aweme.base.C23515d.m57669a(r2, r0)
            goto L_0x00bf
        L_0x0081:
            boolean r2 = r0 instanceof com.p683ss.android.ugc.aweme.p1807im.service.model.IMConversation
            if (r2 == 0) goto L_0x00bf
            com.ss.android.ugc.aweme.im.service.model.IMConversation r0 = (com.p683ss.android.ugc.aweme.p1807im.service.model.IMConversation) r0
            r8.mo73271a(r0)
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getDisplayAvatar()
            if (r0 == 0) goto L_0x00a6
            java.util.List r2 = r0.getUrlList()
            java.util.Collection r2 = (java.util.Collection) r2
            if (r2 == 0) goto L_0x00a1
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x009f
            goto L_0x00a1
        L_0x009f:
            r2 = 0
            goto L_0x00a2
        L_0x00a1:
            r2 = 1
        L_0x00a2:
            if (r2 != 0) goto L_0x00a6
            r2 = 1
            goto L_0x00a7
        L_0x00a6:
            r2 = 0
        L_0x00a7:
            if (r2 == 0) goto L_0x00aa
            goto L_0x00ab
        L_0x00aa:
            r0 = r9
        L_0x00ab:
            if (r0 == 0) goto L_0x00b5
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r2 = r8.f90412b
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r2 = (com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView) r2
            com.p683ss.android.ugc.aweme.base.C23515d.m57669a(r2, r0)
            goto L_0x00bf
        L_0x00b5:
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r0 = r8.f90412b
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = (com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView) r0
            r2 = 2131954213(0x7f130a25, float:1.9544919E38)
            com.p683ss.android.ugc.aweme.base.C23515d.m57668a(r0, r2)
        L_0x00bf:
            android.widget.ImageView r0 = r8.f90413c
            r2 = 8
            r0.setVisibility(r2)
            int r0 = com.p683ss.android.ugc.aweme.p1807im.service.experiment.RefineShareInSiteExperiment.m80104a()
            r2 = 5
            if (r0 == r2) goto L_0x00e0
            com.ss.android.ugc.aweme.im.service.model.IMContact r0 = r8.f90414d
            boolean r1 = r0 instanceof com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser
            if (r1 != 0) goto L_0x00d4
            goto L_0x00d5
        L_0x00d4:
            r9 = r0
        L_0x00d5:
            com.ss.android.ugc.aweme.im.service.model.IMUser r9 = (com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser) r9
            if (r9 == 0) goto L_0x00df
            android.widget.ImageView r8 = r8.f90413c
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35231bg.m79631a(r8, r9)
            goto L_0x014c
        L_0x00df:
            return
        L_0x00e0:
            com.ss.android.ugc.aweme.im.service.model.IMContact r0 = r8.f90414d
            boolean r2 = r0 instanceof com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser
            if (r2 != 0) goto L_0x00e7
            goto L_0x00e8
        L_0x00e7:
            r9 = r0
        L_0x00e8:
            com.ss.android.ugc.aweme.im.service.model.IMUser r9 = (com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser) r9
            if (r9 == 0) goto L_0x014c
            int r9 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35231bg.m79630a(r9)
            r0 = -1
            if (r9 == r0) goto L_0x014b
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r8.f90411a
            java.lang.CharSequence r2 = r2.getText()
            r0.<init>(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r8.f90411a
            android.content.res.Resources r2 = r2.getResources()
            android.graphics.drawable.Drawable r9 = r2.getDrawable(r9)
            android.content.Context r2 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            r4 = 1073741824(0x40000000, float:2.0)
            float r2 = com.bytedance.common.utility.C9432q.m18687b(r2, r4)
            int r2 = (int) r2
            android.content.Context r4 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            r5 = 1094713344(0x41400000, float:12.0)
            float r4 = com.bytedance.common.utility.C9432q.m18687b(r4, r5)
            int r4 = (int) r4
            android.content.Context r5 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            r6 = 1092616192(0x41200000, float:10.0)
            float r5 = com.bytedance.common.utility.C9432q.m18687b(r5, r6)
            int r5 = (int) r5
            r9.setBounds(r2, r3, r4, r5)
            com.ss.android.ugc.aweme.im.sdk.chat.c r2 = new com.ss.android.ugc.aweme.im.sdk.chat.c
            java.lang.String r3 = "drawable"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r3)
            r2.<init>(r9)
            int r9 = r0.length()
            int r9 = r9 - r1
            int r1 = r0.length()
            r3 = 17
            r0.setSpan(r2, r9, r1, r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = r8.f90411a
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r8.setText(r0)
        L_0x014b:
            return
        L_0x014c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.share.panel.p1889a.C35139a.onBindViewHolder(android.support.v7.widget.RecyclerView$v, int):void");
    }
}
