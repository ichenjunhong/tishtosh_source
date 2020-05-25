package com.p683ss.android.ugc.aweme.detail.api;

import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.p831b.C12703e;
import com.bytedance.retrofit2.p831b.C12705g;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12718t;
import com.bytedance.retrofit2.p831b.C12724z;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.detail.p1625g.C27337a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.utils.C47759cc;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.detail.api.DetailApi */
public final class DetailApi {

    /* renamed from: a */
    public static final IDetailApi f72065a = ((IDetailApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(C18845b.f52040e).create(IDetailApi.class));

    /* renamed from: b */
    private static final String f72066b;

    /* renamed from: com.ss.android.ugc.aweme.detail.api.DetailApi$IDetailApi */
    public interface IDetailApi {
        @C12706h(mo23876a = "/aweme/v1/aweme/detail/")
        C12690b<String> queryAweme(@C12724z(mo23894a = "aweme_id") String str, @C12724z(mo23894a = "origin_type") String str2, @C12724z(mo23894a = "request_source") int i);

        @C12718t(mo23886a = "/aweme/v1/multi/aweme/detail/")
        @C12705g
        C12690b<C27337a> queryBatchAweme(@C12703e(mo23873a = "aweme_ids") String str, @C12703e(mo23873a = "origin_type") String str2, @C12703e(mo23873a = "push_params") String str3);
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(C18845b.f52040e);
        sb.append("/aweme/v1/aweme/detail/");
        f72066b = sb.toString();
    }

    /* renamed from: a */
    public static Aweme m65845a(String str, String str2) throws Exception {
        String str3 = (String) f72065a.queryAweme(str, str2, "message".equals(str2) ? 1 : 0).execute().f33552b;
        JSONObject jSONObject = new JSONObject(str3);
        Api.m56469a(jSONObject, str3, f72066b);
        return (Aweme) C47759cc.m103382a().getGson().mo34884a(jSONObject.optString("aweme_detail"), Aweme.class);
    }
}
