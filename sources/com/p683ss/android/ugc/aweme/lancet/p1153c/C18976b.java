package com.p683ss.android.ugc.aweme.lancet.p1153c;

import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.p582g.p583a.p584a.C9951d;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import okhttp3.C53498ab;
import okhttp3.C53504ad;
import okhttp3.C53673t;
import org.json.JSONObject;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.lancet.c.b */
public final class C18976b {
    /* renamed from: b */
    private static void m46153b(String str, String str2, boolean z, String str3, boolean z2, String str4) {
    }

    /* renamed from: a */
    public static void m46152a(C53504ad adVar) {
        boolean z;
        if (adVar != null) {
            C53498ab abVar = adVar.f132398a;
            if (abVar != null) {
                try {
                    C53673t tVar = abVar.f132378a;
                    if (tVar != null) {
                        String str = tVar.f133143d;
                        String f = tVar.mo111619f();
                        boolean c = tVar.mo111613c();
                        if (abVar.mo111255a("cookie") != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        m46150a(str, f, z, c, adVar.mo111276b("content-type"), "4", tVar.toString());
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m46151a(URL url, String str, String str2, String str3) {
        if (url != null) {
            try {
                String str4 = str3;
                m46150a(url.getHost(), url.getPath(), "cookie".equalsIgnoreCase(str), WebKitApi.SCHEME_HTTPS.equals(url.getProtocol()), str4, "3", url.toString());
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private static void m46149a(String str, String str2, boolean z, String str3, boolean z2, String str4) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("host", str);
            jSONObject.put("uri", str2);
            jSONObject.put("cookie", String.valueOf(z));
            jSONObject.put("item_type", str3);
            jSONObject.put("data_protocol", String.valueOf(z2));
            jSONObject.put("netClientType", str4);
            C9951d.m19997a("native_network_api_log", jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static void m46150a(String str, String str2, boolean z, boolean z2, String str3, String str4, String str5) {
        C18977c cVar = new C18977c(str3, z2, z, str, str5, str4, str2);
        C0013i.m18a((Callable<TResult>) cVar, (Executor) C24076h.m58904e());
    }

    /* renamed from: a */
    static final /* synthetic */ Object m46148a(String str, boolean z, boolean z2, String str2, String str3, String str4, String str5) throws Exception {
        boolean z3;
        if (str.contains("video") || str.contains("audio") || str.contains("image")) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z) {
            if (!z3 || (z3 && z2)) {
                String str6 = str2;
                boolean z4 = z2;
                String str7 = str;
                boolean z5 = z;
                String str8 = str4;
                m46149a(str6, str3, z4, str7, z5, str8);
                m46153b(str6, str5, z4, str7, z5, str8);
            }
        } else if ((!z3 && str5 != null && !str5.contains("v1/play")) || (z2 && z3)) {
            String str9 = str2;
            boolean z6 = z2;
            String str10 = str;
            boolean z7 = z;
            String str11 = str4;
            m46149a(str9, str3, z6, str10, z7, str11);
            m46153b(str9, str5, z6, str10, z7, str11);
        }
        return null;
    }
}
