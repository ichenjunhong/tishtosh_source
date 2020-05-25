package com.p683ss.caijing.globaliap.p2559d;

import android.content.Context;
import android.text.TextUtils;
import com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.base.p2547b.C51158a;
import com.p683ss.base.p2547b.C51159b;
import com.p683ss.base.p2547b.C51160c;
import com.p683ss.caijing.globaliap.p2563f.C51283b;
import com.p683ss.caijing.globaliap.p2563f.C51284c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.caijing.globaliap.d.i */
public final class C51267i {
    /* renamed from: a */
    public static String m110212a(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str : map.keySet()) {
                jSONObject.put(str, map.get(str));
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            C17840a.m43754b(e);
            return "";
        }
    }

    /* renamed from: a */
    public static Map<String, JSONObject> m110213a(Context context) {
        HashMap hashMap = new HashMap();
        for (Entry entry : C35807d.m80935a(context, "gpay_ords", 0).getAll().entrySet()) {
            String str = (String) entry.getValue();
            StringBuilder sb = new StringBuilder();
            sb.append((String) entry.getKey());
            sb.append(":");
            sb.append(str);
            String b = C51158a.m110041b(str, "KAMQNNABCVBNM027");
            if (TextUtils.isEmpty(b)) {
                C51284c.m110260a("caijing_iap_decrypt_failed", new HashMap());
            }
            try {
                hashMap.put(entry.getKey(), new JSONObject(b));
            } catch (JSONException unused) {
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static Map<String, String> m110214a(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                hashMap.put(str2, jSONObject.getString(str2));
            }
            return hashMap;
        } catch (JSONException e) {
            C17840a.m43754b(e);
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m110216a(Context context, String str) {
        String a = C51160c.m110047a(str);
        if (!C51159b.m110045c(context, "gpay_ords", a)) {
            return false;
        }
        C51159b.m110044b(context, "gpay_ords", a);
        return true;
    }

    /* renamed from: a */
    public static void m110215a(Context context, String str, String str2) {
        String str3;
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            String a = C51160c.m110047a(str);
            if (!C51159b.m110045c(context, "gpay_ords", a)) {
                try {
                    str3 = C51158a.m110040a(str2, "KAMQNNABCVBNM027");
                } catch (Exception unused) {
                    C51283b.m110244a();
                    str3 = null;
                }
                C51159b.m110043a(context, "gpay_ords", a, str3);
            }
        }
    }
}
