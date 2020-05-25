package com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a;

import android.content.Context;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.sdk.account.p877l.C13207b;
import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21829b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21841f;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.account.p1279l.C21021e;
import com.p683ss.android.ugc.aweme.common.C26890h;
import java.io.Serializable;
import java.util.Map;
import java.util.Map.Entry;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.q */
public final class C21674q {

    /* renamed from: a */
    public static final C21674q f58706a = new C21674q();

    private C21674q() {
    }

    /* renamed from: a */
    public final void mo45930a(Boolean bool, String str, C21841f fVar, boolean z) {
        C52711k.m112240b(str, "platform");
        C52711k.m112240b(fVar, "provider");
        C20856a aVar = new C20856a();
        Bundle d = fVar.mo45075d();
        Serializable serializable = d != null ? d.getSerializable("extra_param") : null;
        if (serializable != null) {
            m54386a(aVar, (Map) serializable);
        }
        aVar.mo44776a("enter_method", fVar.mo45072b()).mo44776a("enter_from", fVar.mo45068a()).mo44776a("enter_type", fVar.mo45073c()).mo44776a("platform", str).mo44776a("log_pb", C21021e.m53412b(fVar.mo45075d()));
        if (bool != null) {
            aVar.mo44774a("is_register", bool.booleanValue() ? 1 : 0);
        }
        if (z) {
            aVar.mo44776a("login_from", "reset_password");
        }
        C26890h.m65011a("login_submit", aVar.f56798a);
    }

    /* renamed from: a */
    public final void mo45932a(boolean z, String str, C21841f fVar, C13207b bVar) {
        C52711k.m112240b(str, "platform");
        C52711k.m112240b(fVar, "provider");
        C52711k.m112240b(bVar, "userInfo");
        C20856a aVar = new C20856a();
        Bundle d = fVar.mo45075d();
        Serializable serializable = d != null ? d.getSerializable("extra_param") : null;
        if (serializable != null) {
            m54386a(aVar, (Map) serializable);
        }
        aVar.mo44776a("enter_method", fVar.mo45072b()).mo44776a("enter_from", fVar.mo45068a()).mo44776a("enter_type", fVar.mo45073c()).mo44774a("is_register", z ? 1 : 0).mo44774a("error_code", 0).mo44775a("user_id", bVar.f34473a).mo44776a("platform", str);
        C26890h.m65011a("login_success", aVar.f56798a);
    }

    /* renamed from: a */
    public final void mo45931a(boolean z, int i, String str, C21841f fVar) {
        C52711k.m112240b(str, "platform");
        C52711k.m112240b(fVar, "provider");
        C20856a aVar = new C20856a();
        Bundle d = fVar.mo45075d();
        Serializable serializable = d != null ? d.getSerializable("extra_param") : null;
        if (serializable != null) {
            m54386a(aVar, (Map) serializable);
        }
        aVar.mo44776a("enter_method", fVar.mo45072b()).mo44776a("enter_from", fVar.mo45068a()).mo44776a("enter_type", fVar.mo45073c()).mo44774a("is_register", z ? 1 : 0).mo44774a("error_code", i).mo44776a("platform", str);
        C26890h.m65011a("login_failure", aVar.f56798a);
    }

    /* renamed from: a */
    private static String m54384a(Context context) {
        if (context == null) {
            return "";
        }
        try {
            Object systemService = context.getSystemService("phone");
            if (systemService != null) {
                String simOperatorName = ((TelephonyManager) systemService).getSimOperatorName();
                C52711k.m112236a((Object) simOperatorName, "telephonyMgr.simOperatorName");
                return simOperatorName;
            }
            throw new C52857u("null cannot be cast to non-null type android.telephony.TelephonyManager");
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static void m54386a(C20856a aVar, Map<String, String> map) {
        if (aVar != null && map != null && !map.isEmpty()) {
            for (Entry entry : map.entrySet()) {
                aVar.mo44776a((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    /* renamed from: a */
    public static void m54389a(boolean z, C21829b bVar) {
        int i;
        C52711k.m112240b(bVar, "fragment");
        String str = "verify_sms_code";
        C20856a a = new C20856a().mo44776a("enter_from", bVar.mo45966l()).mo44776a("enter_method", bVar.mo45967m());
        String str2 = "status";
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        C26890h.m65011a(str, a.mo44774a(str2, i).f56798a);
    }

    /* renamed from: a */
    public static void m54385a(int i, String str, String str2) {
        int i2;
        C52711k.m112240b(str, "enterFrom");
        C52711k.m112240b(str2, "enterMethod");
        C20856a a = new C20856a().mo44776a("enter_from", str).mo44776a("enter_method", str2);
        String str3 = "is_success";
        if (i == 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        C26890h.m65011a("email_code_verification_result", a.mo44774a(str3, i2).mo44774a("error_code", i).f56798a);
    }

    /* renamed from: a */
    public static void m54390a(boolean z, String str, String str2, String str3, int i) {
        C52711k.m112240b(str, "platform");
        C52711k.m112240b(str2, "enterFrom");
        C52711k.m112240b(str3, "enterMethod");
        C26890h.m65011a("set_password_response", new C20856a().mo44776a("platform", str).mo44776a("enter_from", str2).mo44776a("enter_method", str3).mo44774a("is_success", z ? 1 : 0).mo44774a("error_code", i).f56798a);
    }

    /* renamed from: a */
    public final void mo45929a(int i, String str, int i2, String str2, String str3, String str4) {
        String str5;
        C52711k.m112240b(str, "sendMethod");
        C52711k.m112240b(str2, "sendType");
        C20856a a = new C20856a().mo44776a("send_method", str).mo44774a("send_reason", i2).mo44776a("send_type", str2);
        String str6 = "status";
        if (i == 0) {
            str5 = "success";
        } else {
            str5 = "fail";
        }
        C20856a a2 = a.mo44776a(str6, str5).mo44774a("error_code", i).mo44776a("fail_info", str3).mo44776a("params_for_special", "uc_login").mo44776a("carrier", m54384a(C11010c.m22280a()));
        if (!TextUtils.isEmpty(str4)) {
            try {
                PhoneNumber parse = PhoneNumberUtil.getInstance().parse(str4, null);
                C52711k.m112236a((Object) parse, "phoneNumber");
                a2.mo44774a("phone_country", parse.getCountryCode());
                a2.mo44774a("phone_number_cnt", String.valueOf(parse.getNationalNumber()).length());
            } catch (NumberParseException unused) {
            }
        }
        C26890h.m65011a("uc_send_sms", a2.f56798a);
    }
}
