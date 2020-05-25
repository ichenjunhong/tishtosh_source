package com.p683ss.android.ttve.monitor;

import android.content.Context;
import com.bytedance.p582g.p583a.p592d.C10009j;
import com.bytedance.p582g.p583a.p592d.C10009j.C10018a;
import com.bytedance.p582g.p583a.p592d.C10020k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ttve.monitor.d */
public final class C20108d {
    /* renamed from: a */
    private static C10009j m49626a() {
        try {
            return C10020k.m20166a("1357");
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m49627a(String str) {
        C10009j a = m49626a();
        if (a == null) {
            return null;
        }
        JSONObject c = a.mo17915c();
        if (c != null) {
            try {
                return c.getString(str);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m49628a(int i) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str = "1357";
        if (i == 0) {
            arrayList = new ArrayList(Arrays.asList(new String[]{"https://mon.byteoversea.com/monitor/appmonitor/v2/settings", "https://mon.isnssdk.com/monitor/appmonitor/v2/settings"}));
        } else {
            arrayList = new ArrayList(Arrays.asList(new String[]{"https://mon.byteoversea.com/monitor/appmonitor/v2/settings", "https://mon.isnssdk.com/monitor/appmonitor/v2/settings", "https://mon.isnssdk.com/monitor/appmonitor/v2/settings"}));
        }
        C10020k.m20168a(str, arrayList);
        String str2 = "1357";
        if (i == 0) {
            arrayList2 = new ArrayList(Arrays.asList(new String[]{"https://mon.byteoversea.com/monitor/collect/", "https://mon.sgsnssdk.com/monitor/collect/", "https://mon.sgsnssdk.com/monitor/collect/", "https://mon.sgsnssdk.com/monitor/collect/"}));
        } else {
            arrayList2 = new ArrayList(Arrays.asList(new String[]{"https://mon.byteoversea.com/monitor/collect/", "https://mon.sgsnssdk.com/monitor/collect/"}));
        }
        C10020k.m20169b(str2, arrayList2);
    }

    /* renamed from: a */
    public static void m49631a(String str, String str2) {
        C10009j a = m49626a();
        if (a != null) {
            JSONObject c = a.mo17915c();
            if (c != null) {
                try {
                    c.put(str, str2);
                } catch (JSONException unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m49630a(String str, int i, JSONObject jSONObject) {
        String language = Locale.getDefault().getLanguage();
        String country = Locale.getDefault().getCountry();
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (Exception unused) {
            }
        }
        jSONObject.put("te_language", language);
        jSONObject.put("te_region", country);
        if (m49626a() != null) {
            m49626a().mo17978a(str, i, jSONObject, (JSONObject) null);
        }
    }

    /* renamed from: a */
    public static void m49629a(Context context, String str, String str2, String str3) {
        C10020k.m20167a(context, "1357", C20110e.m49634a(context, str, str2, str3), new C10018a() {
            /* renamed from: a */
            public final String mo7396a() {
                return null;
            }
        });
    }
}
