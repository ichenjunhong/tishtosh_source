package com.p683ss.android.ugc.aweme.friends.p1792ui;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12203q;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23608p;
import com.p683ss.android.ugc.aweme.base.activity.C23452y;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.base.widget.C23751c;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.follow.widet.C31980a;
import com.p683ss.android.ugc.aweme.follow.widet.C31980a.C31985b;
import com.p683ss.android.ugc.aweme.follow.widet.C31980a.C31988e;
import com.p683ss.android.ugc.aweme.friends.p1792ui.RecommendFriendsItemView.C32667a;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.utils.C47916gh;
import com.ss.android.ugc.trill.R;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.ao */
public final class C32734ao extends C23751c<User> {

    /* renamed from: i */
    public static final C32735a f85270i = new C32735a(null);

    /* renamed from: e */
    C23452y<User> f85271e;

    /* renamed from: f */
    boolean f85272f;

    /* renamed from: g */
    String f85273g = "";

    /* renamed from: h */
    public final Context f85274h;

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.ao$a */
    public static final class C32735a {
        private C32735a() {
        }

        public /* synthetic */ C32735a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.ao$b */
    public static final class C32736b extends C1352v {

        /* renamed from: a */
        public RecommendFriendsItemView f85275a;

        /* renamed from: b */
        FansFollowUserBtn f85276b = this.f85275a.getMFollowUserBtn();

        /* renamed from: c */
        C31980a f85277c;

        /* renamed from: d */
        User f85278d;

        /* renamed from: e */
        public boolean f85279e;

        /* renamed from: f */
        public String f85280f = "";

        /* renamed from: com.ss.android.ugc.aweme.friends.ui.ao$b$a */
        public static final class C32737a extends C31988e {

            /* renamed from: a */
            final /* synthetic */ C32736b f85281a;

            /* renamed from: b */
            final /* synthetic */ int f85282b;

            C32737a(C32736b bVar, int i) {
                this.f85281a = bVar;
                this.f85282b = i;
            }

            /* renamed from: a */
            public final void mo49741a(int i, User user) {
                String str;
                String str2;
                if (user != null) {
                    boolean z = this.f85281a.f85279e;
                    String uid = user.getUid();
                    C52711k.m112236a((Object) uid, "user.uid");
                    String str3 = this.f85281a.f85280f;
                    int i2 = this.f85282b;
                    C52711k.m112240b(uid, "rec_uid");
                    C52711k.m112240b(str3, "source");
                    if (i == 0) {
                        str = "follow_cancel";
                    } else {
                        str = "follow";
                    }
                    C23089d a = C23089d.m56640a().mo47829a("enter_from", "discover_people_page");
                    String str4 = "previous_page";
                    if (z) {
                        str2 = "sign_up";
                    } else {
                        str2 = "login";
                    }
                    C26890h.m65011a(str, a.mo47829a(str4, str2).mo47829a("source", str3).mo47829a("rec_uid", uid).mo47826a("impr_order", i2).f61491a);
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.friends.ui.ao$b$b */
        public static final class C32738b implements C31985b {

            /* renamed from: a */
            final /* synthetic */ C32736b f85283a;

            /* renamed from: b */
            final /* synthetic */ C23452y f85284b;

            /* renamed from: c */
            final /* synthetic */ User f85285c;

            /* renamed from: d */
            final /* synthetic */ int f85286d;

            /* renamed from: a */
            public final void mo65178a(Exception exc) {
            }

            /* renamed from: a */
            public final void mo65177a(FollowStatus followStatus) {
                C23452y yVar = this.f85284b;
                if (yVar != null) {
                    yVar.mo48614a(C32667a.m75524a(), this.f85285c, this.f85286d, this.f85283a.f85275a, null);
                }
            }

            C32738b(C32736b bVar, C23452y yVar, User user, int i) {
                this.f85283a = bVar;
                this.f85284b = yVar;
                this.f85285c = user;
                this.f85286d = i;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.friends.ui.ao$b$c */
        static final class C32739c extends C52712l implements C52682m<Integer, String, C52860x> {

            /* renamed from: a */
            final /* synthetic */ C32736b f85287a;

            /* renamed from: b */
            final /* synthetic */ C23452y f85288b;

            /* renamed from: c */
            final /* synthetic */ User f85289c;

            /* renamed from: d */
            final /* synthetic */ int f85290d;

            C32739c(C32736b bVar, C23452y yVar, User user, int i) {
                this.f85287a = bVar;
                this.f85288b = yVar;
                this.f85289c = user;
                this.f85290d = i;
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                int intValue = ((Number) obj).intValue();
                C52711k.m112240b((String) obj2, "extra");
                C23452y yVar = this.f85288b;
                if (yVar != null) {
                    yVar.mo48614a(intValue, this.f85289c, this.f85290d, this.f85287a.f85275a, null);
                }
                return C52860x.f131107a;
            }
        }

        public C32736b(View view) {
            C52711k.m112240b(view, "itemView");
            super(view);
            View findViewById = view.findViewById(R.id.c_9);
            C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.recommend_view)");
            this.f85275a = (RecommendFriendsItemView) findViewById;
        }
    }

    public C32734ao(Context context) {
        C52711k.m112240b(context, "context");
        this.f85274h = context;
    }

    public final void onViewAttachedToWindow(C1352v vVar) {
        String str;
        C52711k.m112240b(vVar, "holder");
        super.onViewAttachedToWindow(vVar);
        if (vVar instanceof C32736b) {
            C32736b bVar = (C32736b) vVar;
            User user = bVar.f85278d;
            if (user == null) {
                C52711k.m112237a("mUser");
            }
            boolean z = this.f85272f;
            String uid = user.getUid();
            C52711k.m112236a((Object) uid, "user.uid");
            String str2 = this.f85273g;
            int layoutPosition = bVar.getLayoutPosition();
            C52711k.m112240b(uid, "rec_uid");
            C52711k.m112240b(str2, "source");
            String str3 = "show_recommend_user_cell";
            C23089d a = C23089d.m56640a().mo47829a("enter_from", "discover_people_page");
            String str4 = "previous_page";
            if (z) {
                str = "sign_up";
            } else {
                str = "login";
            }
            C26890h.m65011a(str3, a.mo47829a(str4, str).mo47829a("source", str2).mo47829a("rec_uid", uid).mo47826a("impr_order", layoutPosition).f61491a);
        }
    }

    /* renamed from: b */
    public final C1352v mo49206b(ViewGroup viewGroup, int i) {
        Context context;
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.bbg, viewGroup, false);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(pare…hirdparty, parent, false)");
        return new C32736b(inflate);
    }

    /* renamed from: b */
    public final void mo49207b(C1352v vVar, int i) {
        if (vVar instanceof C32736b) {
            C32736b bVar = (C32736b) vVar;
            Object obj = this.f70670n.get(i);
            C52711k.m112236a(obj, "mItems[position]");
            User user = (User) obj;
            C23452y<User> yVar = this.f85271e;
            C52711k.m112240b(user, "user");
            bVar.f85278d = user;
            RecommendFriendsItemView recommendFriendsItemView = bVar.f85275a;
            if (user != null) {
                recommendFriendsItemView.f85080a.setOnClickListener(new C32668b(recommendFriendsItemView));
                if (!TextUtils.isEmpty(user.getUniqueId())) {
                    recommendFriendsItemView.f85081b.setText(user.getUniqueId());
                }
                recommendFriendsItemView.f85081b.setOnClickListener(new C32669c(recommendFriendsItemView));
                if (!TextUtils.isEmpty(user.getRecommendReason())) {
                    recommendFriendsItemView.f85085f.setText(user.getRecommendReason());
                }
                if (!TextUtils.isEmpty(user.getNickname())) {
                    recommendFriendsItemView.f85083d.setText(user.getNickname());
                }
                int followStatus = user.getFollowStatus();
                int followerStatus = user.getFollowerStatus();
                if (C47915gg.m103651b()) {
                    recommendFriendsItemView.f85084e.setVisibility(8);
                }
                recommendFriendsItemView.f85084e.mo65360a(followStatus, followerStatus);
                LayoutParams buttonLayoutParams = recommendFriendsItemView.f85084e.getButtonLayoutParams();
                buttonLayoutParams.height = C23728o.m58241a(28.0d);
                buttonLayoutParams.width = C23728o.m58241a(88.0d);
                recommendFriendsItemView.f85084e.setButtonLayoutParams(buttonLayoutParams);
                recommendFriendsItemView.requestLayout();
                C12203q.m24645a((Object) C23608p.m57874a(user.getAvatarThumb())).mo23116a((C12197k) recommendFriendsItemView.f85082c).mo23118a("RecommendFriendsItemView").mo23121a();
                recommendFriendsItemView.f85084e.setOnClickListener(new C32670d(recommendFriendsItemView));
                C47916gh.m103675a(recommendFriendsItemView.getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), recommendFriendsItemView.f85081b);
            }
            bVar.f85277c = new C31980a(bVar.f85276b, new C32737a(bVar, i));
            C31980a aVar = bVar.f85277c;
            if (aVar == null) {
                C52711k.m112237a("mFollowBlock");
            }
            aVar.mo65173a(user);
            C31980a aVar2 = bVar.f85277c;
            if (aVar2 == null) {
                C52711k.m112237a("mFollowBlock");
            }
            aVar2.f83489d = new C32738b(bVar, yVar, user, i);
            bVar.f85275a.setActionEventListener(new C32739c(bVar, yVar, user, i));
            boolean z = this.f85272f;
            String str = this.f85273g;
            C52711k.m112240b(str, "source");
            bVar.f85279e = z;
            bVar.f85280f = str;
        }
    }
}
