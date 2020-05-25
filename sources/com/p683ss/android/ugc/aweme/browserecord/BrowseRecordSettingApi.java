package com.p683ss.android.ugc.aweme.browserecord;

import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p064c.p065a.C2201v;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.browserecord.BrowseRecordSettingApi */
public final class BrowseRecordSettingApi {

    /* renamed from: a */
    public static final Api f63655a = ((Api) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(C18845b.f52040e).create(Api.class));

    /* renamed from: b */
    public static final BrowseRecordSettingApi f63656b = new BrowseRecordSettingApi();

    /* renamed from: com.ss.android.ugc.aweme.browserecord.BrowseRecordSettingApi$Api */
    public interface Api {
        @C53075f(mo110603a = "/aweme/v1/user/set/settings/")
        C2201v<BaseResponse> setSetting(@C53089t(mo110619a = "field") String str, @C53089t(mo110619a = "value") int i);
    }

    private BrowseRecordSettingApi() {
    }
}
