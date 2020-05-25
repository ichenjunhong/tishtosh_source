package com.p683ss.android.ugc.aweme.qrcode.api;

import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p683ss.android.ugc.aweme.qrcode.p2104b.C40939a;
import com.p683ss.android.ugc.aweme.qrcode.p2104b.C40945e;
import com.p683ss.android.ugc.aweme.qrcode.p2104b.C40950h;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.concurrent.ExecutionException;
import p2666g.p2672c.C53072c;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53084o;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.qrcode.api.QRCodeApi */
public final class QRCodeApi {

    /* renamed from: a */
    static final IRetrofit f104159a = RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(C18845b.f52040e);

    /* renamed from: b */
    private static IRetrofitService f104160b = RetrofitService.createIRetrofitServicebyMonsterPlugin();

    /* renamed from: com.ss.android.ugc.aweme.qrcode.api.QRCodeApi$RealApi */
    interface RealApi {
        @C53084o(mo110612a = "/aweme/v1/qrcode/info/")
        @C53074e
        C17832m<C40939a> getQRCodeInfo(@C53072c(mo110600a = "schema_type") int i, @C53072c(mo110600a = "object_id") String str, @C53072c(mo110600a = "edition_uid") String str2);

        @C53084o(mo110612a = "/aweme/v1/fancy/qrcode/info/")
        @C53074e
        C17832m<C40939a> getQRCodeInfoV2(@C53072c(mo110600a = "schema_type") int i, @C53072c(mo110600a = "object_id") String str, @C53072c(mo110600a = "meta_params") String str2);

        @C53075f(mo110603a = "/aweme/v1/commerce/scan/guide/")
        C17832m<C40945e> getScanGuideInfo();

        @C53075f(mo110603a = "/aweme/v1/commerce/scan/material/")
        C17832m<C40950h> scanMaterialResult(@C53089t(mo110619a = "target_id") String str);
    }

    /* renamed from: a */
    public static C40945e m90525a() throws Exception {
        try {
            return (C40945e) ((RealApi) f104159a.create(RealApi.class)).getScanGuideInfo().get();
        } catch (ExecutionException e) {
            throw f104160b.propagateCompatibleException(e);
        }
    }

    /* renamed from: a */
    public static C40950h m90526a(String str) throws Exception {
        try {
            return (C40950h) ((RealApi) f104159a.create(RealApi.class)).scanMaterialResult(str).get();
        } catch (ExecutionException e) {
            throw f104160b.propagateCompatibleException(e);
        }
    }

    /* renamed from: a */
    public static C40939a m90524a(int i, String str, String str2) throws Exception {
        try {
            return (C40939a) ((RealApi) f104159a.create(RealApi.class)).getQRCodeInfoV2(i, str, str2).get();
        } catch (ExecutionException e) {
            throw f104160b.propagateCompatibleException(e);
        }
    }
}
