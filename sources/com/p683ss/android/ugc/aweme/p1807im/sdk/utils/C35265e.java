package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p582g.p583a.p584a.C9951d;
import com.p683ss.android.ugc.aweme.framework.services.IUserService;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.services.BaseUserService;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.e */
public final class C35265e {
    /* renamed from: b */
    public static CharSequence m79730b() {
        IUserService baseUserService_Monster = BaseUserService.getBaseUserService_Monster();
        if (baseUserService_Monster == null) {
            return "-1";
        }
        return baseUserService_Monster.getCurrentUserID();
    }

    /* renamed from: c */
    public static User m79732c() {
        IUserService baseUserService_Monster = BaseUserService.getBaseUserService_Monster();
        if (baseUserService_Monster == null) {
            return null;
        }
        return baseUserService_Monster.getCurrentUser();
    }

    /* renamed from: d */
    public static long m79733d() {
        return Long.parseLong(m79730b().toString());
    }

    /* renamed from: a */
    public static boolean m79727a() {
        IUserService baseUserService_Monster = BaseUserService.getBaseUserService_Monster();
        if (baseUserService_Monster == null || !baseUserService_Monster.isLogin()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static String m79734e() {
        String str = "";
        try {
            TelephonyManager telephonyManager = (TelephonyManager) C11010c.m22280a().getSystemService("phone");
            if (telephonyManager == null) {
                return str;
            }
            str = telephonyManager.getNetworkOperator();
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            return "";
        } catch (Exception unused) {
        }
    }

    /* renamed from: f */
    public static String m79735f() {
        String str = "";
        try {
            TelephonyManager telephonyManager = (TelephonyManager) C11010c.m22280a().getSystemService("phone");
            if (telephonyManager == null) {
                return str;
            }
            str = telephonyManager.getSimOperator();
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            return "";
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static boolean m79728a(IMUser iMUser) {
        if (iMUser == null || !m79730b().equals(iMUser.getUid())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m79729a(String str) {
        return m79730b().equals(str);
    }

    /* renamed from: b */
    public static void m79731b(String str, Map<String, Object> map) {
        m79725a(str, null, map, "im_error_event");
    }

    /* renamed from: a */
    public static void m79726a(String str, Map<String, Object> map) {
        m79724a(str, null, map);
    }

    /* renamed from: a */
    public static void m79724a(String str, String str2, Map<String, Object> map) {
        m79725a(str, str2, map, "im_event");
    }

    /* renamed from: a */
    private static void m79725a(String str, String str2, Map<String, Object> map, String str3) {
        JSONObject jSONObject = new JSONObject();
        if (map != null && !map.isEmpty()) {
            try {
                if (TextUtils.isEmpty(str2)) {
                    jSONObject.put("service", str);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append("_");
                    sb.append(str2);
                    jSONObject.put("service", sb.toString());
                }
                for (Entry entry : map.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
                C9951d.m19997a(str3, jSONObject);
            } catch (JSONException unused) {
            }
        }
    }
}
