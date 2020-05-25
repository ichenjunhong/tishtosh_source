package com.p683ss.android.ugc.aweme.login.utils;

import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p683ss.android.ugc.aweme.login.model.C36304a;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.login.utils.BannedApi */
public final class BannedApi {

    /* renamed from: a */
    public static final IRetrofit f92961a = RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit("https://rc.tiktok.com");

    /* renamed from: com.ss.android.ugc.aweme.login.utils.BannedApi$RealApi */
    public interface RealApi {
        @C53075f(mo110603a = "https://rc.tiktok.com/punish/toast_info")
        C17832m<C36304a> getBannedToastInfo(@C53089t(mo110619a = "uid") String str);

        @C53075f(mo110603a = "https://rc.tiktok.com/punish/toast_info")
        C17832m<C36304a> getBannedToastInfoBySecUid(@C53089t(mo110619a = "sec_uid") String str);
    }
}
