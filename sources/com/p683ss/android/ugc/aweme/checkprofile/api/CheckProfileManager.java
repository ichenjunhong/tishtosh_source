package com.p683ss.android.ugc.aweme.checkprofile.api;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12724z;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: com.ss.android.ugc.aweme.checkprofile.api.CheckProfileManager */
public final class CheckProfileManager {

    /* renamed from: a */
    private static CheckProfileApi f65616a;

    /* renamed from: com.ss.android.ugc.aweme.checkprofile.api.CheckProfileManager$CheckProfileApi */
    interface CheckProfileApi {
        @C12706h(mo23876a = "/aweme/v1/profile/checked_userlist/")
        C17832m<Response> checkProfile(@C12724z(mo23894a = "cursor") int i, @C12724z(mo23894a = "count") int i2);
    }

    /* renamed from: com.ss.android.ugc.aweme.checkprofile.api.CheckProfileManager$Response */
    public static class Response {
        public int cursor;
        public boolean has_more;
        public int status_code;
        public List<User> users;
    }

    static {
        IRetrofitService createIRetrofitServicebyMonsterPlugin = RetrofitService.createIRetrofitServicebyMonsterPlugin();
        StringBuilder sb = new StringBuilder("https://");
        sb.append(C11010c.m22282b().f29547a);
        sb.append("/");
        f65616a = (CheckProfileApi) createIRetrofitServicebyMonsterPlugin.createNewRetrofit(sb.toString()).create(CheckProfileApi.class);
    }

    /* renamed from: a */
    public static Response m60327a(int i, int i2) throws Exception {
        try {
            return (Response) f65616a.checkProfile(i, i2).get();
        } catch (ExecutionException e) {
            throw RetrofitService.createIRetrofitServicebyMonsterPlugin().propagateCompatibleException(e);
        }
    }
}
