package com.p683ss.android.ugc.aweme.discover.alading;

import android.view.View;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.commercialize.model.C26110ae;
import com.p683ss.android.ugc.aweme.discover.model.SearchUser;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.p1487c.C24479b;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.alading.i */
public final class C28039i extends C28040j implements C24479b {

    /* renamed from: c */
    public SearchUser f73658c;

    /* renamed from: a */
    public final void mo50247a() {
    }

    /* renamed from: f */
    public final int mo56418f() {
        return 65458;
    }

    /* renamed from: e */
    public final String mo56417e() {
        List<Music> list;
        boolean z;
        SearchUser searchUser = this.f73658c;
        if (searchUser != null) {
            list = searchUser.musicCards;
        } else {
            list = null;
        }
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return "musician";
        }
        return "hot_user";
    }

    public final void aI_() {
        SearchUser searchUser = this.f73658c;
        if (searchUser != null) {
            User user = searchUser.user;
            if (user != null) {
                View view = this.f73648b.itemView;
                C52711k.m112236a((Object) view, "viewHolder.itemView");
                SmartRouter.buildRoute(view.getContext(), "aweme://user/profile/").withParam("uid", user.getUid()).withParam("sec_user_id", user.getSecUid()).withParam("enter_from", "general_search").withParam("enter_from_request_id", user.getRequestId()).withParam("extra_previous_page_position", "main_head").withParam("enter_method", "click_search_result").withParam("general_search_card_type", 1).open();
                Map d = mo56413d();
                if (d != null) {
                    d.put("aladdin_button_type", "click_see_all");
                    d.remove("list_result_type");
                } else {
                    d = null;
                }
                mo56411b(d);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0047  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.String, java.lang.String> mo56412c() {
        /*
            r4 = this;
            java.util.Map r0 = super.mo56412c()
            r1 = 0
            if (r0 == 0) goto L_0x0051
            java.lang.String r2 = "list_result_type"
            java.lang.String r3 = "video"
            r0.put(r2, r3)
            java.lang.String r2 = "user_name"
            com.ss.android.ugc.aweme.discover.model.SearchUser r3 = r4.f73658c
            if (r3 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.profile.model.User r3 = r3.user
            if (r3 == 0) goto L_0x001d
            java.lang.String r3 = r3.getUniqueId()
            goto L_0x001e
        L_0x001d:
            r3 = r1
        L_0x001e:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0.put(r2, r3)
            java.lang.String r2 = "search_result_id"
            com.ss.android.ugc.aweme.discover.model.SearchUser r3 = r4.f73658c
            if (r3 == 0) goto L_0x0033
            com.ss.android.ugc.aweme.profile.model.User r3 = r3.user
            if (r3 == 0) goto L_0x0033
            java.lang.String r1 = r3.getUid()
        L_0x0033:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.put(r2, r1)
            com.ss.android.ugc.aweme.discover.model.SearchUser r1 = r4.f73658c
            if (r1 != 0) goto L_0x0041
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0041:
            boolean r1 = r1.isAladdin()
            if (r1 == 0) goto L_0x0050
            java.lang.String r1 = "token_type"
            java.lang.String r2 = r4.mo56417e()
            r0.put(r1, r2)
        L_0x0050:
            return r0
        L_0x0051:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.alading.C28039i.mo56412c():java.util.Map");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.String, java.lang.String> mo56413d() {
        /*
            r4 = this;
            java.util.Map r0 = super.mo56413d()
            r1 = 0
            if (r0 == 0) goto L_0x0058
            java.lang.String r2 = "list_result_type"
            java.lang.String r3 = "video"
            r0.put(r2, r3)
            java.lang.String r2 = "aladdin_button_type"
            java.lang.String r3 = "click_video"
            r0.put(r2, r3)
            java.lang.String r2 = "search_result_id"
            com.ss.android.ugc.aweme.discover.model.SearchUser r3 = r4.f73658c
            if (r3 == 0) goto L_0x0024
            com.ss.android.ugc.aweme.profile.model.User r3 = r3.user
            if (r3 == 0) goto L_0x0024
            java.lang.String r3 = r3.getUid()
            goto L_0x0025
        L_0x0024:
            r3 = r1
        L_0x0025:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0.put(r2, r3)
            java.lang.String r2 = "user_name"
            com.ss.android.ugc.aweme.discover.model.SearchUser r3 = r4.f73658c
            if (r3 == 0) goto L_0x003a
            com.ss.android.ugc.aweme.profile.model.User r3 = r3.user
            if (r3 == 0) goto L_0x003a
            java.lang.String r1 = r3.getUniqueId()
        L_0x003a:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.put(r2, r1)
            com.ss.android.ugc.aweme.discover.model.SearchUser r1 = r4.f73658c
            if (r1 != 0) goto L_0x0048
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0048:
            boolean r1 = r1.isAladdin()
            if (r1 == 0) goto L_0x0057
            java.lang.String r1 = "token_type"
            java.lang.String r2 = r4.mo56417e()
            r0.put(r1, r2)
        L_0x0057:
            return r0
        L_0x0058:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.alading.C28039i.mo56413d():java.util.Map");
    }

    public C28039i(C28037g gVar) {
        C52711k.m112240b(gVar, "viewHolder");
        super(gVar);
    }

    /* renamed from: a */
    public final boolean mo50249a(SearchUser searchUser) {
        C52711k.m112240b(searchUser, "searchUser");
        if (searchUser.cardType() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo56411b(Map<String, String> map) {
        SearchUser searchUser = this.f73658c;
        if (searchUser == null) {
            C52711k.m112234a();
        }
        if (searchUser.isAladdin()) {
            super.mo56411b(map);
        }
    }

    /* renamed from: a */
    public final void mo56409a(Map<String, String> map) {
        SearchUser searchUser = this.f73658c;
        if (searchUser == null) {
            C52711k.m112234a();
        }
        if (searchUser.isAladdin()) {
            super.mo56409a(map);
        }
    }

    /* renamed from: a */
    public final void mo50248a(SearchUser searchUser, C26110ae aeVar) {
        C52711k.m112240b(searchUser, "data");
        this.f73658c = searchUser;
        SearchUser searchUser2 = this.f73658c;
        if (searchUser2 == null) {
            C52711k.m112234a();
        }
        List<Aweme> list = searchUser2.awemeCards;
        if (list == null) {
            list = Collections.emptyList();
            C52711k.m112236a((Object) list, "Collections.emptyList()");
        }
        mo56419a(list);
    }
}
