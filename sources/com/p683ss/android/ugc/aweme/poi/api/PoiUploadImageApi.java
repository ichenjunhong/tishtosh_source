package com.p683ss.android.ugc.aweme.poi.api;

import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.poi.model.C39115au;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p001a.C0013i;
import p2666g.p2672c.C53072c;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53084o;

/* renamed from: com.ss.android.ugc.aweme.poi.api.PoiUploadImageApi */
public final class PoiUploadImageApi {

    /* renamed from: a */
    public static final C53905PoiUploadImageApi f99534a = ((C53905PoiUploadImageApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(C18845b.f52040e).create(C53905PoiUploadImageApi.class));

    /* renamed from: b */
    public static final PoiUploadImageApi f99535b = new PoiUploadImageApi();

    /* renamed from: com.ss.android.ugc.aweme.poi.api.PoiUploadImageApi$PoiUploadImageApi reason: collision with other inner class name */
    public interface C53905PoiUploadImageApi {
        @C53084o(mo110612a = "/aweme/v1/poi/upload/head/image/")
        @C53074e
        C0013i<C39115au> uploadPoiImgRequest(@C53072c(mo110600a = "poi_id") String str, @C53072c(mo110600a = "urilist") String str2, @C53072c(mo110600a = "watermark") String str3);
    }

    private PoiUploadImageApi() {
    }
}
