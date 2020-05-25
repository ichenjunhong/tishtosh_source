package com.p992g.p993a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.bytedance.p582g.p583a.p584a.C9951d;
import org.json.JSONObject;

/* renamed from: com.g.a.b */
public final class C14709b {

    /* renamed from: a */
    public static C14719f f38108a = null;

    /* renamed from: b */
    public static boolean f38109b = false;

    /* renamed from: c */
    public static boolean f38110c = false;

    /* renamed from: d */
    public static boolean f38111d = true;

    /* renamed from: e */
    public static Context f38112e;

    /* renamed from: a */
    static boolean m30084a() {
        return f38109b;
    }

    /* renamed from: b */
    public static boolean m30086b() {
        return f38111d;
    }

    /* renamed from: a */
    private static boolean m30085a(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                NetworkInfo a = C14710c.m30087a(connectivityManager);
                if (a == null || !a.isAvailable()) {
                    return false;
                }
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: a */
    static void m30083a(boolean z, String str, JSONObject jSONObject) {
        if (!z) {
            if (f38112e != null && !m30085a(f38112e)) {
                return;
            }
            if (C9951d.m20000a("image_monitor_error_v2")) {
                C9951d.m19997a("image_monitor_error_v2", jSONObject);
            }
        }
        if (f38108a != null) {
            f38108a.mo23185a(z, str, jSONObject);
        }
    }
}
