package com.facebook.login;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.login.LoginClient.Request;
import com.facebook.p909a.C13589l;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.login.f */
final class C14525f {

    /* renamed from: a */
    public String f37736a;

    /* renamed from: b */
    private final C13589l f37737b;

    /* renamed from: c */
    private String f37738c;

    /* renamed from: a */
    private static Bundle m29742a(String str) {
        Bundle bundle = new Bundle();
        bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
        bundle.putString("0_auth_logger_id", str);
        bundle.putString("3_method", "");
        bundle.putString("2_result", "");
        bundle.putString("5_error_message", "");
        bundle.putString("4_error_code", "");
        bundle.putString("6_extras", "");
        return bundle;
    }

    /* renamed from: a */
    public final void mo26771a(Request request) {
        Bundle a = m29742a(request.f37642e);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("login_behavior", request.f37638a.toString());
            jSONObject.put("request_code", LoginClient.m29642b());
            jSONObject.put("permissions", TextUtils.join(",", request.f37639b));
            jSONObject.put("default_audience", request.f37640c.toString());
            jSONObject.put("isReauthorize", request.f37643f);
            if (this.f37738c != null) {
                jSONObject.put("facebookVersion", this.f37738c);
            }
            a.putString("6_extras", jSONObject.toString());
        } catch (JSONException unused) {
        }
        this.f37737b.mo25409a("fb_mobile_login_start", (Double) null, a);
    }

    /* renamed from: c */
    public final void mo26777c(String str, String str2) {
        mo26773a(str, str2, "");
    }

    /* renamed from: a */
    public final void mo26772a(String str, String str2) {
        Bundle a = m29742a(str);
        a.putString("3_method", str2);
        this.f37737b.mo25411b("fb_mobile_login_method_start", a);
    }

    /* renamed from: b */
    public final void mo26776b(String str, String str2) {
        Bundle a = m29742a(str);
        a.putString("3_method", str2);
        this.f37737b.mo25411b("fb_mobile_login_method_not_tried", a);
    }

    C14525f(Context context, String str) {
        this.f37736a = str;
        this.f37737b = new C13589l(context, str);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                PackageInfo packageInfo = packageManager.getPackageInfo("com.facebook.katana", 0);
                if (packageInfo != null) {
                    this.f37738c = packageInfo.versionName;
                }
            }
        } catch (NameNotFoundException unused) {
        }
    }

    /* renamed from: a */
    public final void mo26773a(String str, String str2, String str3) {
        Bundle a = m29742a("");
        a.putString("2_result", C14491a.ERROR.f37658d);
        a.putString("5_error_message", str2);
        a.putString("3_method", str3);
        this.f37737b.mo25411b(str, a);
    }

    /* renamed from: a */
    public final void mo26775a(String str, Map<String, String> map, C14491a aVar, Map<String, String> map2, Exception exc) {
        Bundle a = m29742a(str);
        if (aVar != null) {
            a.putString("2_result", aVar.f37658d);
        }
        if (!(exc == null || exc.getMessage() == null)) {
            a.putString("5_error_message", exc.getMessage());
        }
        JSONObject jSONObject = null;
        if (!map.isEmpty()) {
            jSONObject = new JSONObject(map);
        }
        if (map2 != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                for (Entry entry : map2.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            } catch (JSONException unused) {
            }
        }
        if (jSONObject != null) {
            a.putString("6_extras", jSONObject.toString());
        }
        this.f37737b.mo25411b("fb_mobile_login_complete", a);
    }

    /* renamed from: a */
    public final void mo26774a(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        Bundle a = m29742a(str);
        if (str3 != null) {
            a.putString("2_result", str3);
        }
        if (str4 != null) {
            a.putString("5_error_message", str4);
        }
        if (str5 != null) {
            a.putString("4_error_code", str5);
        }
        if (map != null && !map.isEmpty()) {
            a.putString("6_extras", new JSONObject(map).toString());
        }
        a.putString("3_method", str2);
        this.f37737b.mo25411b("fb_mobile_login_method_complete", a);
    }
}
