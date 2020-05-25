package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C14963ax;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.og */
public final class C16127og {
    /* renamed from: a */
    public static List<String> m38183a(JSONObject jSONObject, String str) throws JSONException {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(optJSONArray.length());
        for (int i = 0; i < optJSONArray.length(); i++) {
            arrayList.add(optJSONArray.getString(i));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public static void m38184a(Context context, String str, abb abb, String str2, boolean z, List<String> list) {
        if (list != null && !list.isEmpty()) {
            String str3 = z ? "1" : "0";
            for (String a : list) {
                String a2 = m38182a(m38182a(m38182a(m38182a(m38182a(m38182a(m38182a(a, "@gw_adlocid@", str2), "@gw_adnetrefresh@", str3), "@gw_qdata@", abb.f40120r.f45302i), "@gw_sdkver@", str), "@gw_sessid@", caf.m37100e()), "@gw_seqnum@", abb.f40112j), "@gw_adnetstatus@", abb.f40122t);
                if (abb.f40117o != null) {
                    a2 = m38182a(m38182a(a2, "@gw_adnetid@", abb.f40117o.f45272b), "@gw_allocid@", abb.f40117o.f45274d);
                }
                acd.m32583a(context, str, aav.m32439a(a2, context, abb.f40097P));
            }
        }
    }

    /* renamed from: a */
    public static void m38185a(Context context, String str, List<String> list, String str2, String str3, zzbaz zzbaz) {
        if (list != null && !list.isEmpty()) {
            String a = m38181a(str2);
            String a2 = m38181a(str3);
            long a3 = C14963ax.m30837g().mo28523a();
            for (String a4 : list) {
                String a5 = m38182a(m38182a(m38182a(a4, "@gw_rwd_userid@", Uri.encode(a)), "@gw_rwd_custom_data@", Uri.encode(a2)), "@gw_tmstmp@", Long.toString(a3));
                if (zzbaz != null) {
                    a5 = m38182a(m38182a(a5, "@gw_rwd_itm@", Uri.encode(zzbaz.f46226a)), "@gw_rwd_amt@", Integer.toString(zzbaz.f46227b));
                }
                acd.m32583a(context, str, a5);
            }
        }
    }

    /* renamed from: a */
    private static String m38182a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    /* renamed from: a */
    private static String m38181a(String str) {
        return (TextUtils.isEmpty(str) || !aew.m32775b()) ? str : "fakeForAdDebugLog";
    }

    /* renamed from: a */
    public static boolean m38186a(String str, int[] iArr) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String[] split = str.split("x");
        if (split.length != 2) {
            return false;
        }
        try {
            iArr[0] = Integer.parseInt(split[0]);
            iArr[1] = Integer.parseInt(split[1]);
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
