package com.p683ss.android.ugc.aweme.discover.p1640c.p1641a;

import android.app.Activity;
import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.ViewGroup;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.discover.adapter.C27859bf;
import com.p683ss.android.ugc.aweme.discover.adapter.SearchUserViewHolder;
import com.p683ss.android.ugc.aweme.discover.mob.C28390aj;
import com.p683ss.android.ugc.aweme.discover.model.SearchUser;
import com.p683ss.android.ugc.aweme.discover.model.suggest.SuggestUser;
import com.p683ss.android.ugc.aweme.discover.p1640c.p1641a.C28082h.C28083a;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.following.p1770ui.adapter.C32112c;
import com.p683ss.android.ugc.aweme.p1382aq.C23253w;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.c.a.j */
public final class C28087j extends C28083a implements C32112c {

    /* renamed from: d */
    private Activity f73773d;

    public C28087j(C27859bf<?> bfVar) {
        C52711k.m112240b(bfVar, "adapter");
        super(bfVar);
    }

    /* renamed from: a */
    public final C1352v mo56493a(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parent");
        this.f73773d = C23729p.m58270d(viewGroup);
        SearchUserViewHolder a = SearchUserViewHolder.m66490a(viewGroup, this);
        C52711k.m112236a((Object) a, "SearchUserViewHolder.create(parent, this)");
        return a;
    }

    /* renamed from: a */
    public final boolean mo56498a(User user) {
        String str;
        C52711k.m112240b(user, "user");
        if (user.getFollowStatus() == 0) {
            new C23253w("follow").mo48161b("search_for_you_list").mo48166f(user.getUid()).mo48076e();
        } else {
            new C23253w("follow_cancel").mo48161b("search_for_you_list").mo48166f(user.getUid()).mo48076e();
        }
        if (user.getFollowStatus() == 0) {
            str = "search_follow";
        } else {
            str = "search_follow_cancel";
        }
        String str2 = str;
        C28390aj ajVar = C28390aj.f74551a;
        String uid = user.getUid();
        C52711k.m112236a((Object) uid, "user.uid");
        ajVar.mo56824a(str2, uid, "search_for_you_list", true, "");
        return true;
    }

    /* renamed from: a */
    public final void mo56497a(User user, int i) {
        C52711k.m112240b(user, "user");
        if (this.f73773d != null) {
            C26890h.m65011a("enter_personal_detail", C23089d.m56640a().mo47829a("enter_from", "search_for_you_list").mo47829a("to_user_id", user.getUid()).mo47829a("log_pb", C29981aa.m70153a().mo60161a(user.getRequestId())).mo47826a("order", mo56496a((Object) user)).f61491a);
            SmartRouter.buildRoute((Context) this.f73773d, "//user/profile").withParam("uid", user.getUid()).withParam("sec_user_id", user.getSecUid()).withParam("enter_from", "search_for_you_list").withParam("profile_enterprise_type", user.getCommerceUserLevel()).withParam("extra_previous_page_position", "main_head").open();
        }
    }

    /* renamed from: a */
    public final void mo56494a(List<? extends Object> list, int i, C1352v vVar, List<Object> list2) {
        C52711k.m112240b(list, "items");
        C52711k.m112240b(vVar, "holder");
        C52711k.m112240b(list2, "payloads");
        Object obj = list.get(i);
        if (obj != null) {
            SuggestUser suggestUser = (SuggestUser) obj;
            SearchUserViewHolder searchUserViewHolder = (SearchUserViewHolder) vVar;
            if (suggestUser != null && suggestUser.user != null) {
                searchUserViewHolder.mo56217a(new SearchUser().setUser(suggestUser.user));
                return;
            }
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.model.suggest.SuggestUser");
    }
}
