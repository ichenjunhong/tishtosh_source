package com.p683ss.android.ugc.aweme.digg;

import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.digg.p1633a.C27686a;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.digg.a */
public final class C27685a {

    /* renamed from: a */
    public static final C27685a f72672a = new C27685a();

    /* renamed from: b */
    private static final LikeUsersApi f72673b;

    private C27685a() {
    }

    static {
        LikeUsersApi likeUsersApi;
        IRetrofitService createIRetrofitServicebyMonsterPlugin = RetrofitService.createIRetrofitServicebyMonsterPlugin();
        if (createIRetrofitServicebyMonsterPlugin != null) {
            IRetrofit createNewRetrofit = createIRetrofitServicebyMonsterPlugin.createNewRetrofit(C18845b.f52040e);
            if (createNewRetrofit != null) {
                likeUsersApi = (LikeUsersApi) createNewRetrofit.create(LikeUsersApi.class);
                f72673b = likeUsersApi;
            }
        }
        likeUsersApi = null;
        f72673b = likeUsersApi;
    }

    /* renamed from: a */
    public static C0013i<C27686a> m66330a(String str, int i, long j, long j2, int i2, String str2, int i3, int i4, int i5) {
        String str3 = str;
        C52711k.m112240b(str, "itemId");
        C52711k.m112240b(str2, "insertIds");
        LikeUsersApi likeUsersApi = f72673b;
        if (likeUsersApi != null) {
            return likeUsersApi.getFavoriteList(str, i, j, j2, i2, str2, i3, i4, i5);
        }
        return null;
    }
}
