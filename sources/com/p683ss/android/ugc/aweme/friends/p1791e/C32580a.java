package com.p683ss.android.ugc.aweme.friends.p1791e;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.friends.utils.C32781a;
import com.p683ss.android.ugc.aweme.friends.utils.C32783c;
import com.p683ss.android.ugc.aweme.friends.utils.C32783c.C32792i;
import com.p683ss.android.ugc.aweme.friends.utils.C32783c.C32793j;
import com.p683ss.android.ugc.aweme.friends.utils.C32795d;
import com.p683ss.android.ugc.aweme.friends.utils.FriendslistPermissionApi.C32780a;
import com.p683ss.android.ugc.aweme.lego.C35889c;
import com.p683ss.android.ugc.aweme.lego.C35897g;
import com.p683ss.android.ugc.aweme.utils.C47760cd;
import com.p683ss.android.ugc.trill.p2516b.p2517a.C50310a;
import org.json.JSONObject;
import p064c.p065a.p071d.C1710e;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.friends.e.a */
public final class C32580a implements C35889c {
    /* renamed from: a */
    public final C35897g mo46246a() {
        return C35897g.NORMAL;
    }

    /* renamed from: a */
    public final void mo46247a(Context context, boolean z) {
        C32781a aVar;
        C52711k.m112240b(context, "context");
        if (Keva.getRepo("friendslist_permission_keva_name").getLong("authorize_info_upload_next_time_key", 0) < System.currentTimeMillis()) {
            IAccountUserService g = C20854a.m53167g();
            C52711k.m112236a((Object) g, "AccountProxyService.userService()");
            if (g.isLogin() && C32795d.m75676a(C11010c.m22280a())) {
                C32781a aVar2 = new C32781a("contact_list", C32783c.m75667a() ? 1 : 0, null, 4, null);
                if (!TextUtils.isEmpty(C50310a.m108577b())) {
                    JSONObject jSONObject = new JSONObject();
                    Long c = C50310a.m108581c();
                    C52711k.m112236a((Object) c, "FriendSharePref.getFacebookAccessTokenExpDate()");
                    jSONObject.put("expired_time", c.longValue());
                    aVar = new C32781a("facebook_friend_list", 1, jSONObject.toString());
                } else {
                    aVar = new C32781a("facebook_friend_list", 0, null, 4, null);
                }
                C32780a.m75658a().uploadAuthInfo(C47760cd.m103385a(C52575l.m112099b((Object[]) new C32781a[]{aVar2, aVar}))).mo6152a((C1710e<? super T>) C32792i.f85387a, (C1710e<? super Throwable>) C32793j.f85388a);
            }
        }
    }
}
