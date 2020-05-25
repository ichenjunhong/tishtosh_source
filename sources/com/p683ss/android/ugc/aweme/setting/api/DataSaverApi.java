package com.p683ss.android.ugc.aweme.setting.api;

import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p001a.C0013i;
import p2666g.p2672c.C53084o;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.setting.api.DataSaverApi */
public interface DataSaverApi {

    /* renamed from: a */
    public static final C41545a f105239a = C41545a.f105241b;

    /* renamed from: com.ss.android.ugc.aweme.setting.api.DataSaverApi$a */
    public static final class C41545a {

        /* renamed from: a */
        public static final DataSaverApi f105240a = ((DataSaverApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(DataSaverApi.class));

        /* renamed from: b */
        static final /* synthetic */ C41545a f105241b = new C41545a();

        private C41545a() {
        }
    }

    @C53084o(mo110612a = "/aweme/v1/set/data-saver-setting/")
    C0013i<BaseResponse> setDataSaverSetting(@C53089t(mo110619a = "data_saver_setting") int i);
}
