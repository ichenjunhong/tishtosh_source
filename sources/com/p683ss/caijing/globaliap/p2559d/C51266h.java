package com.p683ss.caijing.globaliap.p2559d;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.p683ss.base.p2547b.C51160c;
import com.p683ss.caijing.globaliap.p2559d.C51268j.C51269a;
import com.p683ss.caijing.globaliap.pay.C51294e;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.caijing.globaliap.d.h */
public final class C51266h {
    /* renamed from: a */
    private static JSONObject m110209a(String str) {
        try {
            return new JSONObject(C51160c.m110050b(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static String m110210b(JSONObject jSONObject) {
        try {
            return jSONObject.getString("app_id");
        } catch (JSONException e) {
            throw new C51237c((Exception) e);
        }
    }

    /* renamed from: a */
    public static Bundle m110205a(C51268j jVar) {
        Bundle bundle = new Bundle();
        bundle.putString("purchaseData", jVar.f128028e);
        bundle.putString("signature", jVar.f128027d);
        return C51294e.m110285a("no order matched", bundle);
    }

    /* renamed from: c */
    private static boolean m110211c(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        try {
            if (!TextUtils.isEmpty(jSONObject.getString("cj_sdk"))) {
                return true;
            }
            return false;
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static String m110208a(JSONObject jSONObject) {
        try {
            return new JSONObject(URLDecoder.decode(jSONObject.getString("biz_content"), "UTF-8")).getJSONObject("iap_info").getString("token");
        } catch (JSONException e) {
            throw new C51237c((Exception) e);
        } catch (UnsupportedEncodingException e2) {
            throw new C51237c((Exception) e2);
        }
    }

    /* renamed from: a */
    static C51268j m110206a(String str, String str2) {
        boolean z;
        String str3;
        long j;
        String str4;
        String str5;
        String str6 = str;
        try {
            JSONObject jSONObject = new JSONObject(str6);
            JSONObject a = m110209a(jSONObject.optString("developerPayload"));
            String str7 = null;
            if (m110211c(a)) {
                str7 = a.optString("trade_no");
                str4 = a.optString("merchant_id");
                j = a.optLong("trade_amount");
                str3 = a.optString("app_id");
                str5 = a.optString("uid");
                z = true;
            } else {
                j = -1;
                str5 = null;
                str4 = null;
                str3 = null;
                z = false;
            }
            String string = jSONObject.getString("purchaseToken");
            String optString = jSONObject.optString("orderId");
            long optLong = jSONObject.optLong("purchaseTime");
            String optString2 = jSONObject.optString("productId");
            C51269a aVar = new C51269a();
            aVar.f128037a.f128025b = str7;
            aVar.f128037a.f128032i = str4;
            aVar.f128037a.f128033j = j;
            aVar.f128037a.f128026c = string;
            aVar.f128037a.f128028e = str6;
            aVar.f128037a.f128027d = str2;
            C51269a a2 = aVar.mo101795a(0);
            a2.f128037a.f128029f = optString;
            a2.f128037a.f128031h = optString2;
            a2.f128037a.f128030g = optLong;
            a2.f128037a.f128034k = z;
            a2.f128037a.f128035l = str3;
            a2.f128037a.f128036m = str5;
            return a2.f128037a;
        } catch (JSONException e) {
            throw new C51237c((Exception) e);
        }
    }

    /* renamed from: a */
    public static String m110207a(String str, String str2, String str3, String str4, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cj_sdk", "1.0");
            jSONObject.put("trade_no", str3);
            jSONObject.put("merchant_id", str4);
            jSONObject.put("trade_amount", j);
            jSONObject.put("app_id", str);
            jSONObject.put("uid", str2);
            return Base64.encodeToString(jSONObject.toString().getBytes(), 2);
        } catch (JSONException unused) {
            return null;
        }
    }
}
