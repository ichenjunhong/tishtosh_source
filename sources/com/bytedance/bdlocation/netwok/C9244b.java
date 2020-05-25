package com.bytedance.bdlocation.netwok;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.bdlocation.Util;
import com.bytedance.bdlocation.client.BDLocationConfig;
import com.bytedance.bdlocation.netwok.p511a.C9243l;
import com.bytedance.ttnet.p887e.C13333g;
import com.google.gson.C18082l;
import com.google.gson.C18085o;
import com.p683ss.p2544b.p2545a.C51151a;
import java.util.LinkedHashMap;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.bdlocation.netwok.b */
public final class C9244b {
    /* renamed from: a */
    public static String m18341a() {
        String baseUrl = BDLocationConfig.getBaseUrl();
        if (!TextUtils.isEmpty(baseUrl)) {
            return baseUrl;
        }
        return "https://i.snssdk.com";
    }

    /* renamed from: a */
    public static String m18342a(C18085o oVar) {
        try {
            byte[] bytes = oVar.toString().getBytes("utf-8");
            int length = bytes.length;
            for (int i = 0; i < length; i++) {
                bytes[i] = (byte) (bytes[i] ^ -99);
            }
            return Base64.encodeToString(bytes, 10);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m18343a(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(str, 2);
            int length = decode.length;
            for (int i = 0; i < length; i++) {
                decode[i] = (byte) (decode[i] ^ -99);
            }
            return new String(decode);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m18344a(Locale locale) {
        String language = locale.getLanguage();
        String country = locale.getCountry();
        if (TextUtils.isEmpty(country)) {
            return language;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(language);
        sb.append("-");
        sb.append(country);
        return sb.toString();
    }

    /* renamed from: a */
    public static boolean m18345a(Context context) throws Exception {
        Object obj;
        String str;
        String str2;
        C18085o oVar = new C18085o();
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager.getSimState() == 5) {
            obj = telephonyManager.getSimOperator();
        } else {
            obj = null;
        }
        oVar.mo35017a("MCCMNC", Util.sGson.mo34875a(obj));
        Locale locale = BDLocationConfig.getLocale();
        if (locale == null) {
            locale = Locale.getDefault();
        }
        oVar.mo35017a("locale", Util.sGson.mo34875a((Object) locale));
        oVar.mo35017a("permissionStatus", Util.sGson.mo34875a((Object) Integer.valueOf(Util.checkLocationPermissions(context))));
        C51151a.m110021c("BDLocation", Util.sGson.mo34886a((C18082l) oVar));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("settings", m18342a(oVar));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("sdk_version", "1.4.0-rc.5-fix");
        try {
            C9231a networkApi = BDLocationConfig.getNetworkApi();
            if (networkApi != null) {
                str = networkApi.mo16744a(m18341a(), "/location/settings/", linkedHashMap2, linkedHashMap, null, true);
            } else {
                str = (String) ((INetworkApiCopy) C13333g.m26861a(m18341a(), INetworkApiCopy.class)).doPost(-1, "/location/settings/", linkedHashMap2, linkedHashMap, null, null, true).execute().f33552b;
            }
            try {
                str2 = new JSONObject(str).getString("data");
            } catch (JSONException unused) {
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                if (((C9243l) Util.sGson.mo34884a(m18343a(str2), C9243l.class)).f25301a.f25220b == 0) {
                    C51151a.m110021c("BDLocation", "upload settings success");
                    return true;
                }
                C51151a.m110022d("BDLocation", "upload settings failed");
                return false;
            }
        } catch (Exception e) {
            C51151a.m110017a("BDLocation", (Throwable) e);
        }
        C51151a.m110022d("BDLocation", "upload settings failed");
        return false;
    }
}
