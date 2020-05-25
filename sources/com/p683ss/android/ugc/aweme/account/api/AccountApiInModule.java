package com.p683ss.android.ugc.aweme.account.api;

import com.bytedance.retrofit2.C12690b;
import com.google.p1057b.p1065h.p1066a.C17824h;
import com.google.p1057b.p1065h.p1066a.C17825i;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.api.p1265a.C20895a;
import com.p683ss.android.ugc.aweme.account.base.C20916a;
import com.p683ss.android.ugc.aweme.account.loginsetting.C22045b;
import com.p683ss.android.ugc.aweme.account.util.C22266h;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.buildconfigdiff.C24095a;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofitService;
import p001a.C0013i;
import p2666g.p2672c.C53072c;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53084o;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.account.api.AccountApiInModule */
public final class AccountApiInModule {

    /* renamed from: a */
    public static final String f56868a;

    /* renamed from: b */
    public static Api f56869b = ((Api) ((IRetrofitService) C23826bi.m58450a(IRetrofitService.class)).createNewRetrofit(f56868a).create(Api.class));

    /* renamed from: c */
    private static final boolean f56870c = false;

    /* renamed from: com.ss.android.ugc.aweme.account.api.AccountApiInModule$Api */
    public interface Api {
        @C53075f(mo110603a = "/passport/mobile/can_check_unusable/")
        C17832m<Object> canCheckPhoneNumberUnusable(@C53089t(mo110619a = "mix_mode") String str, @C53089t(mo110619a = "mobile") String str2);

        @C53084o(mo110612a = "/passport/mobile/change/v1/")
        @C53074e
        C17832m<String> changeMobile(@C53072c(mo110600a = "mix_mode") String str, @C53072c(mo110600a = "mobile") String str2, @C53072c(mo110600a = "code") String str3, @C53072c(mo110600a = "captcha") String str4, @C53072c(mo110600a = "ticket") String str5, @C53072c(mo110600a = "unusable_mobile_ticket") String str6);

        @C53075f(mo110603a = "/passport/password/has_set/")
        C17832m<Object> checkPasswordSet();

        @C53075f(mo110603a = "/passport/mobile/check_unusable/")
        C17832m<Object> checkPhoneNumberUnusable(@C53089t(mo110619a = "mix_mode") String str, @C53089t(mo110619a = "mobile") String str2);

        @C53075f(mo110603a = "/passport/mobile/can_send_voice_code/")
        C0013i<C22045b> checkVoiceCodeAvailability(@C53089t(mo110619a = "mobile") String str, @C53089t(mo110619a = "mix_mode") String str2);

        @C53075f(mo110603a = "https://rc.snssdk.com/verify/get_info")
        C17832m<C20895a> getVerifyInfo(@C53089t(mo110619a = "uid") String str, @C53089t(mo110619a = "verify_type") String str2, @C53089t(mo110619a = "shark_ticket") String str3);

        @C53084o(mo110612a = "/passport/user/login_by_verify_ticket/")
        @C53074e
        C17832m<String> loginByTicket(@C53072c(mo110600a = "verify_ticket") String str);

        @C53084o(mo110612a = "/passport/cancel/login/")
        @C53074e
        C0013i<String> loginDuringAccountRemoval(@C53072c(mo110600a = "token") String str);

        @C53084o(mo110612a = "/passport/cancel/login/")
        @C53074e
        C12690b<String> loginDuringRemoval(@C53072c(mo110600a = "token") String str);

        @C53084o(mo110612a = "/aweme/v1/user/proaccount/setting/")
        @C53074e
        C17832m<BaseResponse> switchProAccount(@C53072c(mo110600a = "action_type") int i, @C53072c(mo110600a = "category_name") String str, @C53072c(mo110600a = "category_id") String str2, @C53072c(mo110600a = "gender") int i2);

        @C53075f(mo110603a = "/passport/upsms/login/")
        C17832m<String> upSmsLogin(@C53089t(mo110619a = "verify_ticket") String str);

        @C53075f(mo110603a = "/passport/upsms/query_verify/")
        C17832m<Object> upSmsVerify(@C53089t(mo110619a = "verify_ticket") String str, @C53089t(mo110619a = "upstream_verify_type") int i);

        @C53084o(mo110612a = "https://rc.snssdk.com/verify/verify_info")
        @C53074e
        C17832m<String> verifyVerifyInfo(@C53072c(mo110600a = "uid") String str, @C53072c(mo110600a = "verify_type") String str2, @C53072c(mo110600a = "verify_data") String str3, @C53072c(mo110600a = "shark_ticket") String str4);
    }

    static {
        StringBuilder sb = new StringBuilder("https://");
        sb.append(C24095a.m58955l());
        f56868a = sb.toString();
    }

    /* renamed from: a */
    public static C0013i<C22045b> m53226a(String str) {
        try {
            return f56869b.checkVoiceCodeAvailability(C22266h.m55115a(str), "1");
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static C0013i<String> m53228b(String str) {
        try {
            return f56869b.loginDuringAccountRemoval(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m53227a(String str, String str2, C17824h<C20895a> hVar) {
        C17825i.m43740a(f56869b.getVerifyInfo(str, "id_number", str2), hVar, C20916a.f56902a);
    }
}
