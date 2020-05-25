package com.p683ss.android.ttve.monitor;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.text.TextUtils;
import com.p683ss.android.vesdk.p2534d.C50660a;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ttve.monitor.e */
public final class C20110e {

    /* renamed from: a */
    public static boolean f55307a = true;

    /* renamed from: b */
    public static Thread f55308b;

    /* renamed from: c */
    public static volatile boolean f55309c;

    /* renamed from: d */
    public static final Object f55310d = new Object();

    /* renamed from: e */
    public static boolean f55311e = false;

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000b */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x000b A[LOOP:0: B:6:0x000b->B:18:0x000b, LOOP_START, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m49635a() {
        /*
            boolean r0 = f55311e
            if (r0 == 0) goto L_0x001d
            boolean r0 = f55309c
            if (r0 != 0) goto L_0x001d
            java.lang.Object r0 = f55310d
            monitor-enter(r0)
        L_0x000b:
            boolean r1 = f55309c     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0018
            java.lang.System.currentTimeMillis()     // Catch:{ InterruptedException -> 0x000b }
            java.lang.Object r1 = f55310d     // Catch:{ InterruptedException -> 0x000b }
            r1.wait()     // Catch:{ InterruptedException -> 0x000b }
            goto L_0x000b
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return
        L_0x001a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r1
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ttve.monitor.C20110e.m49635a():void");
    }

    /* renamed from: a */
    public static void m49636a(int i) {
        C20108d.m49628a(i);
    }

    /* renamed from: a */
    static String m49633a(String str) {
        if (!f55307a) {
            return null;
        }
        m49635a();
        return C20108d.m49627a(str);
    }

    /* renamed from: a */
    public static void m49639a(String str, String str2) {
        if (f55307a) {
            m49635a();
            C20108d.m49631a(str, str2);
        }
    }

    /* renamed from: a */
    public static void m49637a(String str, int i, C50660a aVar) {
        JSONObject jSONObject;
        if (f55307a) {
            m49635a();
            if (aVar == null) {
                jSONObject = null;
            } else {
                jSONObject = aVar.mo99063a();
            }
            C20108d.m49630a(str, i, jSONObject);
        }
    }

    /* renamed from: a */
    public static void m49638a(String str, int i, JSONObject jSONObject) {
        if (f55307a && jSONObject != null) {
            m49635a();
            if (TextUtils.isEmpty(m49633a("device_id"))) {
                m49639a("device_id", "Unknown");
            }
            if (TextUtils.isEmpty(m49633a("user_id"))) {
                m49639a("user_id", "Unknown");
            }
            if (TextUtils.isEmpty(m49633a("app_version"))) {
                m49639a("app_version", "Unknown");
            }
            try {
                for (Entry entry : C20104b.m49614a().entrySet()) {
                    String str2 = (String) entry.getValue();
                    if (!C20104b.f55284a.contains(entry.getKey())) {
                        StringBuilder sb = new StringBuilder("te_device_info_");
                        sb.append((String) entry.getKey());
                        jSONObject.put(sb.toString(), str2);
                    } else if (!TextUtils.isEmpty(str2)) {
                        try {
                            float parseFloat = Float.parseFloat(str2);
                            StringBuilder sb2 = new StringBuilder("te_device_info_");
                            sb2.append((String) entry.getKey());
                            jSONObject.put(sb2.toString(), (double) parseFloat);
                        } catch (Exception unused) {
                        }
                    }
                }
            } catch (JSONException unused2) {
            }
            C20108d.m49630a(str, i, jSONObject);
        }
    }

    /* renamed from: a */
    static JSONObject m49634a(Context context, String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_id", str);
            try {
                jSONObject.put("app_version", context.getPackageManager().getPackageInfo(context.getPackageName(), 128).versionName);
            } catch (NameNotFoundException unused) {
                jSONObject.put("app_version", "vesdk:6.7.0.110");
            }
            jSONObject.put("ve_version", "6.7.0.110");
            jSONObject.put("effect_version", "6.7.0_rel_13_MT_202005061117_907c653ac2");
            jSONObject.put("model", Build.MODEL);
            String str4 = "6.7.0.110";
            if (!"mt".equals("common")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str4);
                sb.append("-mt");
                str4 = sb.toString();
            }
            jSONObject.put("channel", str4);
            jSONObject.put("package_name", context.getPackageName());
            jSONObject.put("user_id", str2);
            jSONObject.put("version_code", str3);
        } catch (JSONException unused2) {
        }
        return jSONObject;
    }
}
