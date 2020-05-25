package com.bytedance.sdk.account.p859d;

import android.text.TextUtils;
import com.bytedance.sdk.account.p844a.p845a.C12995g;
import com.bytedance.sdk.account.p858c.C13073a.C13074a;
import com.bytedance.sdk.account.p861f.p862a.C13112k;
import com.bytedance.sdk.account.p861f.p862a.C13113l;
import com.bytedance.sdk.account.p861f.p862a.C13120s;
import com.bytedance.sdk.account.p876k.C13193a;
import com.bytedance.sdk.account.p876k.C13194b;
import com.bytedance.sdk.account.p876k.C13203g;
import com.bytedance.sdk.account.p877l.C13207b;
import com.p683ss.android.account.C18492b.C18493a;
import com.p683ss.android.account.C18495c;
import com.p683ss.android.account.p1100a.p1101a.C18491a;
import java.util.Map;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.d.b */
public final class C13078b {

    /* renamed from: com.bytedance.sdk.account.d.b$a */
    public static class C13079a {

        /* renamed from: a */
        private static C18493a f34154a = new C18493a();

        /* renamed from: a */
        public static C13207b m26266a(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
            C18491a c = C18495c.m44744c();
            if (c != null) {
                return c.mo37742a().mo24802a(jSONObject, jSONObject2);
            }
            return C18493a.m44736b(jSONObject, jSONObject2);
        }

        /* renamed from: a */
        public static void m26267a(C13203g gVar, JSONObject jSONObject) {
            if (jSONObject != null) {
                if (jSONObject.has("error_code")) {
                    gVar.f34442g = jSONObject.optInt("error_code", gVar.f34442g);
                } else if (jSONObject.has("code")) {
                    gVar.f34442g = jSONObject.optInt("code", gVar.f34442g);
                }
                gVar.f34443h = jSONObject.optString("description");
                String optString = jSONObject.optString(LeakCanaryFileProvider.f132049i);
                if ("connect_switch".equals(optString) || "connect_exist".equals(optString)) {
                    gVar.f34469d = jSONObject.optString("description");
                    gVar.f34470e = jSONObject.optString("dialog_tips");
                    gVar.f34471f = jSONObject.optString("auth_token");
                }
                if (gVar.f34442g == 1075) {
                    gVar.f34448m = jSONObject.optLong("apply_time");
                    gVar.f34451p = jSONObject.optString("avatar_url");
                    gVar.f34450o = jSONObject.optString("nick_name");
                    gVar.f34447l = jSONObject.optString("token");
                    gVar.f34449n = jSONObject.optLong("cancel_time");
                }
                if (gVar.f34442g == 1041) {
                    gVar.f34452q = new C13194b();
                    C13194b bVar = gVar.f34452q;
                    if (jSONObject != null) {
                        bVar.f34453a = jSONObject.optString("screen_name");
                        bVar.f34454b = jSONObject.optString("avatar_url");
                        bVar.f34455c = jSONObject.optString("last_login_time");
                        bVar.f34456d = jSONObject.optString("mobile");
                        bVar.f34457e = jSONObject.optString("platform_screen_name_current");
                        bVar.f34458f = jSONObject.optString("platform_screen_name_conflict");
                    }
                }
            }
        }

        /* renamed from: a */
        public static C12995g m26265a(C13203g gVar, boolean z, int i) {
            C12995g gVar2 = new C12995g(z, 0);
            gVar2.f34000c = gVar.f34442g;
            gVar2.f34001d = gVar.f34443h;
            gVar2.f34010i = gVar.f34469d;
            gVar2.f34011j = gVar.f34470e;
            gVar2.f34012k = gVar.f34471f;
            gVar2.f34009h = gVar.f34467b;
            return gVar2;
        }

        /* renamed from: a */
        public static void m26268a(JSONObject jSONObject, JSONObject jSONObject2, C13203g gVar) throws Exception {
            C13207b bVar;
            C18491a c = C18495c.m44744c();
            if (c != null) {
                bVar = c.mo37742a().mo24801a(jSONObject);
            } else {
                bVar = C18493a.m44735b(jSONObject);
            }
            if (bVar != null) {
                gVar.f34467b = bVar;
            }
        }
    }

    /* renamed from: a */
    public static void m26263a(C13112k kVar, JSONObject jSONObject) {
        if (jSONObject.has("error_code")) {
            kVar.f34275h = jSONObject.optInt("error_code", kVar.f34275h);
        } else if (jSONObject.has("code")) {
            kVar.f34275h = jSONObject.optInt("code", kVar.f34275h);
        }
        kVar.f34276i = jSONObject.optString("description");
        if (kVar instanceof C13112k) {
            kVar.f34277j = jSONObject.optString("captcha");
            kVar.f34278k = jSONObject.optString("alert_text");
        }
        if (kVar.f34275h == 1001 && (kVar instanceof C13120s)) {
            ((C13120s) kVar).f34316c = jSONObject.optString("dialog_tips");
        }
        if (kVar.f34275h == 1057 && (kVar instanceof C13120s)) {
            C13120s sVar = (C13120s) kVar;
            sVar.f34316c = jSONObject.optString("dialog_tips");
            sVar.f34317d = jSONObject.optString("next_url");
        }
        if (kVar.f34275h == 1057 && (kVar instanceof C13113l)) {
            C13113l lVar = (C13113l) kVar;
            lVar.f34287b = jSONObject.optString("dialog_tips");
            lVar.f34288c = jSONObject.optString("next_url");
        }
        if (kVar.f34275h == 1075) {
            kVar.f34281n = jSONObject.optLong("apply_time");
            kVar.f34284q = jSONObject.optString("avatar_url");
            kVar.f34283p = jSONObject.optString("nick_name");
            kVar.f34280m = jSONObject.optString("token");
            kVar.f34282o = jSONObject.optLong("cancel_time");
        }
    }

    /* renamed from: a */
    public static void m26264a(C13193a aVar, JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject.has("error_code")) {
            aVar.f34442g = jSONObject.optInt("error_code", aVar.f34442g);
        } else if (jSONObject.has("code")) {
            aVar.f34442g = jSONObject.optInt("code", aVar.f34442g);
        }
        aVar.f34443h = jSONObject.optString("description");
        if (aVar.f34442g == 1075) {
            aVar.f34448m = jSONObject.optLong("apply_time");
            aVar.f34451p = jSONObject.optString("avatar_url");
            aVar.f34450o = jSONObject.optString("nick_name");
            aVar.f34447l = jSONObject.optString("token");
            aVar.f34449n = jSONObject.optLong("cancel_time");
        }
    }

    /* renamed from: a */
    public static C13074a m26262a(String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map) {
        C13074a aVar = new C13074a();
        if (!TextUtils.isEmpty(str)) {
            aVar.mo24753a("platform", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            aVar.mo24753a("access_token", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            aVar.mo24753a("expires_in", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            aVar.mo24753a("code", str4);
        }
        if (!TextUtils.isEmpty(null)) {
            aVar.mo24753a("profile_key", (String) null);
        }
        if (!TextUtils.isEmpty(str6)) {
            aVar.mo24753a("platform_app_id", str6);
        }
        if (map != null && !map.isEmpty()) {
            for (String str7 : map.keySet()) {
                if (!TextUtils.isEmpty(str7)) {
                    aVar.mo24753a(str7, (String) map.get(str7));
                }
            }
        }
        return aVar;
    }
}
