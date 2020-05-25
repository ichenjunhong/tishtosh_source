package com.p683ss.android.ugc.aweme.protection.api;

import com.bytedance.retrofit2.p831b.C12724z;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.protection.model.AlgoFreeSettings;
import com.p683ss.android.ugc.aweme.protection.model.CmplRespForEncrypt;
import com.p683ss.android.ugc.aweme.protection.model.ComplianceSetting;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p064c.p065a.C2201v;
import p2628d.p2639f.p2641b.C52711k;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53084o;

/* renamed from: com.ss.android.ugc.aweme.protection.api.ComplianceApi */
public interface ComplianceApi {

    /* renamed from: a */
    public static final C40854a f104018a = C40854a.f104019a;

    /* renamed from: com.ss.android.ugc.aweme.protection.api.ComplianceApi$a */
    public static final class C40854a {

        /* renamed from: a */
        static final /* synthetic */ C40854a f104019a = new C40854a();

        private C40854a() {
        }

        /* renamed from: a */
        public static ComplianceApi m90347a() {
            Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(ComplianceApi.class);
            C52711k.m112236a(create, "ServiceManager.get().get…omplianceApi::class.java)");
            return (ComplianceApi) create;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.protection.api.ComplianceApi$b */
    public static final class C40855b {
    }

    @C53075f(mo110603a = "/aweme/v1/algo/free/settings/")
    C2201v<AlgoFreeSettings> getAlgoFreeSettings();

    @C53075f(mo110603a = "/aweme/v1/compliance/settings/")
    C2201v<ComplianceSetting> getComplianceSetting(@C12724z(mo23894a = "teen_mode_status") int i, @C12724z(mo23894a = "ftc_child_mode") int i2);

    @C53084o(mo110612a = "/aweme/v1/cmpl/set/settings/")
    C2201v<CmplRespForEncrypt> setComplianceSettings(@C12724z(mo23894a = "settings") String str);

    @C53075f(mo110603a = "/aweme/v1/user/set/settings/")
    C2201v<BaseResponse> setVPAContentChoice(@C12724z(mo23894a = "field") String str, @C12724z(mo23894a = "vpa_content_choice") int i);
}
