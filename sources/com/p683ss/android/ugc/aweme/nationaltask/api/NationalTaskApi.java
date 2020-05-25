package com.p683ss.android.ugc.aweme.nationaltask.api;

import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.discover.model.NationalTask;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.nationaltask.api.NationalTaskApi */
public class NationalTaskApi {

    /* renamed from: a */
    private static INationalTaskApi f96158a;

    /* renamed from: com.ss.android.ugc.aweme.nationaltask.api.NationalTaskApi$INationalTaskApi */
    public interface INationalTaskApi {
        @C53075f(mo110603a = "/aweme/v1/commerce/national_task/detail/")
        C17832m<NationalTask> getNationalTask(@C53089t(mo110619a = "id") String str);
    }

    /* renamed from: a */
    public static INationalTaskApi m84228a() {
        if (f96158a == null) {
            synchronized (NationalTaskApi.class) {
                if (f96158a == null) {
                    f96158a = (INationalTaskApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit("https://aweme.snssdk.com").create(INationalTaskApi.class);
                }
            }
        }
        return f96158a;
    }
}
