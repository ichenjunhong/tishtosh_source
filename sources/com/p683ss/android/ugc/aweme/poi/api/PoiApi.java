package com.p683ss.android.ugc.aweme.poi.api;

import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12724z;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.poi.model.C39126j;
import com.p683ss.android.ugc.aweme.poi.model.PoiDetail;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p064c.p065a.C2201v;

/* renamed from: com.ss.android.ugc.aweme.poi.api.PoiApi */
public final class PoiApi {

    /* renamed from: a */
    private static final PoiService f99531a = ((PoiService) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(C18845b.f52040e).create(PoiService.class));

    /* renamed from: com.ss.android.ugc.aweme.poi.api.PoiApi$PoiService */
    public interface PoiService {
        @C12706h(mo23876a = "/aweme/v1/poi/aweme/")
        C17832m<C39126j> queryPoiAwemeList(@C12724z(mo23894a = "poiId") String str, @C12724z(mo23894a = "count") int i, @C12724z(mo23894a = "cursor") int i2, @C12724z(mo23894a = "aweme_type") int i3);

        @C12706h(mo23876a = "/aweme/v1/poi/detail/")
        C17832m<PoiDetail> queryPoiDetail(@C12724z(mo23894a = "poi_id") String str, @C12724z(mo23894a = "longitude") String str2, @C12724z(mo23894a = "latitude") String str3, @C12724z(mo23894a = "extensions") String str4, @C12724z(mo23894a = "scene_type") int i);

        @C12706h(mo23876a = "/aweme/v1/poi/detail/")
        C2201v<PoiDetail> queryPoiDetailForLive(@C12724z(mo23894a = "poi_id") String str, @C12724z(mo23894a = "longitude") String str2, @C12724z(mo23894a = "latitude") String str3, @C12724z(mo23894a = "extensions") String str4, @C12724z(mo23894a = "scene_type") int i);
    }
}
