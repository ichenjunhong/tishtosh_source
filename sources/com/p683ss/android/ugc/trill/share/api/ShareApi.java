package com.p683ss.android.ugc.trill.share.api;

import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.p831b.C12694aa;
import com.bytedance.retrofit2.p831b.C12706h;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.Map;

/* renamed from: com.ss.android.ugc.trill.share.api.ShareApi */
public final class ShareApi {

    /* renamed from: a */
    static final ShareService f126403a = ((ShareService) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(ShareService.class));

    /* renamed from: com.ss.android.ugc.trill.share.api.ShareApi$ShareService */
    public interface ShareService {
        @C12706h(mo23876a = "/aweme/v1/thrid/platform/share/")
        C12690b<AutoShare> autoShare(@C12694aa Map<String, String> map);
    }
}
