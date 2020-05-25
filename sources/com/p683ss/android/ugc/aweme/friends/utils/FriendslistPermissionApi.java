package com.p683ss.android.ugc.aweme.friends.utils;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import p064c.p065a.C1680ad;
import p2628d.p2639f.p2641b.C52711k;
import p2666g.p2672c.C53072c;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53084o;

/* renamed from: com.ss.android.ugc.aweme.friends.utils.FriendslistPermissionApi */
public interface FriendslistPermissionApi {

    /* renamed from: a */
    public static final C32780a f85362a = C32780a.f85363a;

    /* renamed from: com.ss.android.ugc.aweme.friends.utils.FriendslistPermissionApi$a */
    public static final class C32780a {

        /* renamed from: a */
        static final /* synthetic */ C32780a f85363a = new C32780a();

        private C32780a() {
        }

        /* renamed from: a */
        public static FriendslistPermissionApi m75658a() {
            Object a = RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().createBuilder(Api.f61282b).mo19925a().mo19930a(FriendslistPermissionApi.class);
            C52711k.m112236a(a, "ServiceManager.get().get…ermissionApi::class.java)");
            return (FriendslistPermissionApi) a;
        }
    }

    @C53084o(mo110612a = "/aweme/v1/user/preferences/set/")
    @C53074e
    C1680ad<BaseResponse> uploadAuthInfo(@C53072c(mo110600a = "auth_infos") String str);
}
