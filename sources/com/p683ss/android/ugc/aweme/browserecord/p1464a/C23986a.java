package com.p683ss.android.ugc.aweme.browserecord.p1464a;

import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.support.p030v4.content.C0726c;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.activity.C23452y;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.friends.p1792ui.C32774u;
import com.p683ss.android.ugc.aweme.friends.p1792ui.IRecommendFriendItemViewV2;
import com.p683ss.android.ugc.aweme.friends.service.C32616c;
import com.p683ss.android.ugc.aweme.newfollow.util.C37940g;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.browserecord.a.a */
public final class C23986a extends C26840g<C23988b> {

    /* renamed from: a */
    public static final C23987a f63670a = new C23987a(null);

    /* renamed from: b */
    private final int f63671b = C23728o.m58241a(16.0d);

    /* renamed from: c */
    private final Set<String> f63672c = new HashSet();

    /* renamed from: d */
    private final C0184k f63673d;

    /* renamed from: e */
    private final String f63674e;

    /* renamed from: f */
    private final HashMap<String, Boolean> f63675f;

    /* renamed from: g */
    private final C23452y<User> f63676g;

    /* renamed from: com.ss.android.ugc.aweme.browserecord.a.a$a */
    public static final class C23987a {
        private C23987a() {
        }

        public /* synthetic */ C23987a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo48641a(int i) {
        return ((C23988b) this.f70670n.get(i)).getType();
    }

    /* renamed from: a_ */
    public final C1352v mo49730a_(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parent");
        int c = C0726c.m2098c(viewGroup.getContext(), R.color.arn);
        this.f70682s = c;
        C1352v a_ = super.mo49730a_(viewGroup);
        View view = a_.itemView;
        if (view != null) {
            DmtStatusView dmtStatusView = (DmtStatusView) view;
            C10719a c2 = dmtStatusView.mo19207c().mo19233c(0);
            DmtTextView dmtTextView = new DmtTextView(viewGroup.getContext());
            dmtTextView.setGravity(17);
            dmtTextView.setTextColor(c);
            dmtTextView.setTextSize(13.0f);
            dmtTextView.setText("");
            dmtStatusView.setBuilder(c2.mo19231b((View) dmtTextView));
            C52711k.m112236a((Object) a_, "superFooterHolder");
            return a_;
        }
        throw new C52857u("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtStatusView");
    }

    public final void onViewAttachedToWindow(C1352v vVar) {
        C52711k.m112240b(vVar, "holder");
        super.onViewAttachedToWindow(vVar);
        if (vVar instanceof C32774u) {
            C32774u uVar = (C32774u) vVar;
            User a = uVar.mo66319a();
            if (a != null && !this.f63672c.contains(a.getUid())) {
                Set<String> set = this.f63672c;
                String uid = a.getUid();
                C52711k.m112236a((Object) uid, "uid");
                set.add(uid);
                this.f63676g.mo48614a(103, a, uVar.getAdapterPosition(), vVar.itemView, "");
                C37940g.m84832a().mo77415a(3, a.getUid());
            }
        }
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        switch (i) {
            case 1:
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b8w, viewGroup, false);
                C52711k.m112236a((Object) inflate, "view");
                return new C23995d(inflate, this.f63674e);
            case 2:
                C32616c cVar = C32616c.f84865a;
                Context context = viewGroup.getContext();
                C52711k.m112236a((Object) context, "parent.context");
                IRecommendFriendItemViewV2 createRecommendUserModalDialogItemView = cVar.createRecommendUserModalDialogItemView(context, this.f63675f, true, false);
                if (createRecommendUserModalDialogItemView == null) {
                    C52711k.m112234a();
                }
                createRecommendUserModalDialogItemView.setEnterFrom("others_homepage");
                createRecommendUserModalDialogItemView.setListener(this.f63676g);
                C32774u createRecommendFriendItemViewV2Holder = C32616c.f84865a.createRecommendFriendItemViewV2Holder(createRecommendUserModalDialogItemView);
                if (createRecommendFriendItemViewV2Holder == null) {
                    C52711k.m112234a();
                }
                return createRecommendFriendItemViewV2Holder;
            default:
                View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b8v, viewGroup, false);
                TextView textView = (TextView) inflate2.findViewById(R.id.ns);
                if (textView != null) {
                    textView.setTypeface(textView.getTypeface(), 1);
                }
                C0184k kVar = this.f63673d;
                C52711k.m112236a((Object) inflate2, "view");
                return new C23989c(kVar, inflate2, this.f63674e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b7, code lost:
        if (r1 == null) goto L_0x00b9;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo48222a(android.support.p043v7.widget.RecyclerView.C1352v r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.mo48641a(r7)
            r1 = 0
            r2 = 0
            switch(r0) {
                case 1: goto L_0x005b;
                case 2: goto L_0x001d;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.util.List r0 = r5.f70670n
            java.lang.Object r7 = r0.get(r7)
            com.ss.android.ugc.aweme.browserecord.a.b r7 = (com.p683ss.android.ugc.aweme.browserecord.p1464a.C23988b) r7
            com.ss.android.ugc.aweme.browserecord.model.a r7 = r7.getMBrowseItem()
            if (r7 == 0) goto L_0x0135
            boolean r0 = r6 instanceof com.p683ss.android.ugc.aweme.browserecord.p1464a.C23989c
            if (r0 != 0) goto L_0x005c
            r6 = r1
            goto L_0x005c
        L_0x001d:
            java.util.List r0 = r5.f70670n
            java.lang.Object r0 = r0.get(r7)
            com.ss.android.ugc.aweme.browserecord.a.b r0 = (com.p683ss.android.ugc.aweme.browserecord.p1464a.C23988b) r0
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getMRecommendUser()
            if (r0 == 0) goto L_0x003a
            boolean r3 = r6 instanceof com.p683ss.android.ugc.aweme.friends.p1792ui.C32774u
            if (r3 != 0) goto L_0x0030
            goto L_0x0031
        L_0x0030:
            r1 = r6
        L_0x0031:
            com.ss.android.ugc.aweme.friends.ui.u r1 = (com.p683ss.android.ugc.aweme.friends.p1792ui.C32774u) r1
            if (r1 == 0) goto L_0x003a
            r3 = 18
            r1.mo66320a(r0, r7, r2, r3)
        L_0x003a:
            if (r6 == 0) goto L_0x005a
            android.view.View r6 = r6.itemView
            if (r6 == 0) goto L_0x005a
            r7 = 2132020497(0x7f140d11, float:1.9679359E38)
            android.view.View r6 = r6.findViewById(r7)
            if (r6 == 0) goto L_0x005a
            int r7 = r5.f63671b
            int r0 = r6.getPaddingTop()
            int r1 = r5.f63671b
            int r2 = r6.getPaddingBottom()
            r6.setPadding(r7, r0, r1, r2)
            goto L_0x0135
        L_0x005a:
            return
        L_0x005b:
            return
        L_0x005c:
            com.ss.android.ugc.aweme.browserecord.a.c r6 = (com.p683ss.android.ugc.aweme.browserecord.p1464a.C23989c) r6
            if (r6 == 0) goto L_0x0134
            java.lang.String r0 = "browseItem"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
            com.ss.android.ugc.aweme.profile.model.User r0 = r7.getUser()
            if (r0 == 0) goto L_0x00f8
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r1 = r6.f63683c
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = (com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView) r1
            com.ss.android.ugc.aweme.base.model.UrlModel r3 = r0.getAvatarLarger()
            com.p683ss.android.ugc.aweme.base.C23515d.m57669a(r1, r3)
            android.view.View r1 = r6.itemView
            com.ss.android.ugc.aweme.browserecord.a.c$b r3 = new com.ss.android.ugc.aweme.browserecord.a.c$b
            r3.<init>(r0, r6, r7)
            android.view.View$OnClickListener r3 = (android.view.View.OnClickListener) r3
            r1.setOnClickListener(r3)
            android.widget.TextView r1 = r6.f63684d
            java.lang.String r3 = "mUserName"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            java.lang.String r3 = r0.getRemarkName()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r4 = 1
            if (r3 == 0) goto L_0x009b
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0099
            goto L_0x009b
        L_0x0099:
            r3 = 0
            goto L_0x009c
        L_0x009b:
            r3 = 1
        L_0x009c:
            if (r3 != 0) goto L_0x00a5
            java.lang.String r3 = r0.getRemarkName()
        L_0x00a2:
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            goto L_0x00aa
        L_0x00a5:
            java.lang.String r3 = r0.getNickname()
            goto L_0x00a2
        L_0x00aa:
            r1.setText(r3)
            com.ss.android.ugc.aweme.profile.model.User r1 = r7.getUser()
            if (r1 == 0) goto L_0x00b9
            java.lang.String r1 = r1.getRecommendReason()
            if (r1 != 0) goto L_0x00bd
        L_0x00b9:
            java.lang.String r1 = r7.getSourceLabel()
        L_0x00bd:
            if (r1 != 0) goto L_0x00c1
            java.lang.String r1 = ""
        L_0x00c1:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r7 = r1.length()
            if (r7 != 0) goto L_0x00ca
            goto L_0x00cb
        L_0x00ca:
            r4 = 0
        L_0x00cb:
            r7 = 8
            if (r4 == 0) goto L_0x00da
            android.widget.TextView r1 = r6.f63685e
            java.lang.String r2 = "mDescription"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            r1.setVisibility(r7)
            goto L_0x00ee
        L_0x00da:
            android.widget.TextView r3 = r6.f63685e
            java.lang.String r4 = "mDescription"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            r3.setVisibility(r2)
            android.widget.TextView r2 = r6.f63685e
            java.lang.String r3 = "mDescription"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            r2.setText(r1)
        L_0x00ee:
            com.ss.android.ugc.aweme.follow.widet.a r1 = r6.f63688h
            r1.mo65173a(r0)
            com.ss.android.ugc.aweme.unread.UnReadCircleView r0 = r6.f63687g
            r0.setVisibility(r7)
        L_0x00f8:
            com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn r7 = r6.f63686f
            java.lang.String r0 = "mFollowBtn"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r0)
            android.view.ViewGroup$LayoutParams r7 = r7.getButtonLayoutParams()
            if (r7 != 0) goto L_0x0106
            goto L_0x0134
        L_0x0106:
            com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn r0 = r6.f63686f
            java.lang.String r1 = "mFollowBtn"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            if (r0 != 0) goto L_0x0114
            goto L_0x0134
        L_0x0114:
            int r1 = r6.f63682b
            r7.width = r1
            r0.width = r1
            com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn r2 = r6.f63686f
            r2.setForceWidth(r1)
            com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn r1 = r6.f63686f
            java.lang.String r2 = "mFollowBtn"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            r1.setButtonLayoutParams(r7)
            com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn r6 = r6.f63686f
            java.lang.String r7 = "mFollowBtn"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
            r6.setLayoutParams(r0)
            goto L_0x0135
        L_0x0134:
            return
        L_0x0135:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.browserecord.p1464a.C23986a.mo48222a(android.support.v7.widget.RecyclerView$v, int):void");
    }

    public C23986a(C0184k kVar, String str, HashMap<String, Boolean> hashMap, C23452y<User> yVar) {
        C52711k.m112240b(kVar, "owner");
        C52711k.m112240b(str, "mPreviousPage");
        C52711k.m112240b(hashMap, "followClickMap");
        C52711k.m112240b(yVar, "listener");
        this.f63673d = kVar;
        this.f63674e = str;
        this.f63675f = hashMap;
        this.f63676g = yVar;
    }
}
