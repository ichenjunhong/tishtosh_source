package com.p683ss.android.account.token;

import android.text.TextUtils;
import com.bytedance.retrofit2.p830a.C12685b;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.account.token.e */
public final class C18507e {
    /* renamed from: a */
    public static void m44792a(String str) {
        C18509g c = C18503c.m44773a().mo37768c();
        if (c != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", str);
                c.mo37770a("x_tt_token_lost", jSONObject, null);
                c.mo37769a("x_tt_token_lost", jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m44795a(String str, List list, boolean z) {
        String str2;
        C18509g c = C18503c.m44773a().mo37768c();
        if (c != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", str);
                String str3 = "";
                StringBuilder sb = new StringBuilder();
                if (list != null) {
                    for (Object next : list) {
                        if (next instanceof C12685b) {
                            if ("X-TT-LOGID".equalsIgnoreCase(((C12685b) next).f33318a)) {
                                str3 = ((C12685b) next).f33319b;
                            }
                            jSONObject.put(((C12685b) next).f33318a, ((C12685b) next).f33319b);
                        } else if (next != null) {
                            sb.append(next.toString());
                            sb.append(";");
                        }
                    }
                }
                String sb2 = sb.toString();
                jSONObject.put("extra", sb2);
                JSONObject jSONObject2 = new JSONObject();
                if (!TextUtils.isEmpty(str3)) {
                    jSONObject2.put("logid", str3);
                }
                if (!TextUtils.isEmpty(str)) {
                    jSONObject2.put("urlpath", str);
                }
                if (!TextUtils.isEmpty(sb2)) {
                    jSONObject2.put("extra", sb2);
                }
                String str4 = "user_was_login";
                if (z) {
                    str2 = "1";
                } else {
                    str2 = "0";
                }
                jSONObject2.put(str4, str2);
                c.mo37770a("tt_token_logout", jSONObject, null);
                c.mo37769a("tt_token_logout", jSONObject2);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m44793a(String str, String str2, String str3, String str4) {
        C18509g c = C18503c.m44773a().mo37768c();
        if (c != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", str);
                jSONObject.put("tokenSign", str2);
                jSONObject.put("token", str3);
                if (!TextUtils.isEmpty(str4)) {
                    jSONObject.put("errorMsg", str4);
                }
                c.mo37770a("tt_token_decrypt_err", jSONObject, null);
                c.mo37769a("tt_token_decrypt_err", jSONObject);
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m44794a(String str, List list, int i, String str2) {
        C18509g c = C18503c.m44773a().mo37768c();
        if (c != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("error_code", i);
                jSONObject.put("error_code_msg", str2);
                StringBuilder sb = new StringBuilder();
                if (list != null) {
                    for (Object next : list) {
                        if (next instanceof C12685b) {
                            jSONObject.put(((C12685b) next).f33318a, ((C12685b) next).f33319b);
                        } else if (next != null) {
                            sb.append(next.toString());
                            sb.append(";");
                        }
                    }
                }
                jSONObject.put("extra", sb.toString());
                c.mo37770a(str, jSONObject, null);
                c.mo37769a(str, jSONObject);
            } catch (Exception unused) {
            }
        }
    }
}
