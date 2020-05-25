package com.bytedance.crash.p551k;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.bytedance.crash.C9588g;
import com.bytedance.crash.p555n.C9685a;
import com.bytedance.crash.p555n.C9713t;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.crash.k.a */
public final class C9617a {

    /* renamed from: a */
    public C9588g f26242a;

    /* renamed from: b */
    private Context f26243b;

    /* renamed from: c */
    public final String mo17448c() {
        try {
            return this.f26242a.mo17413b();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: e */
    public final String mo17450e() {
        try {
            return this.f26242a.mo17415d();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: f */
    public final long mo17451f() {
        try {
            return this.f26242a.mo17414c();
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public final Map<String, Object> mo17446a() {
        Map<String, Object> b = mo17447b();
        if (m19160a(b, "aid") == null) {
            b.put("aid", Integer.valueOf(4444));
        }
        return b;
    }

    /* renamed from: d */
    public final String mo17449d() {
        try {
            return String.valueOf(this.f26242a.mo17412a().get("aid"));
        } catch (Throwable unused) {
            return "4444";
        }
    }

    /* renamed from: b */
    public final Map<String, Object> mo17447b() {
        Throwable th;
        Map<String, Object> map;
        PackageInfo packageInfo;
        Object obj = null;
        try {
            map = this.f26242a.mo17412a();
            th = null;
        } catch (Throwable th2) {
            th = th2;
            map = null;
        }
        if (map == null) {
            map = new HashMap<>(4);
            if (th != null) {
                try {
                    map.put("err_info", C9713t.m19435a(th));
                } catch (Throwable unused) {
                }
            }
        }
        if (m19161a(map)) {
            try {
                packageInfo = this.f26243b.getPackageManager().getPackageInfo(this.f26243b.getPackageName(), 128);
                map.put("version_name", packageInfo.versionName);
                map.put("version_code", Integer.valueOf(packageInfo.versionCode));
                StringBuilder sb = new StringBuilder();
                sb.append(this.f26243b.getPackageName());
                sb.append(".BuildConfig");
                String str = (String) Class.forName(sb.toString()).getDeclaredField("VERSION_NAME").get(null);
                if (packageInfo.versionName != null && !packageInfo.versionName.equals(str)) {
                    map.put("dex_err_manifest", "true");
                    map.put("dex_version", str);
                }
            } catch (Throwable unused2) {
                map.put("version_name", C9685a.m19319d(this.f26243b));
                map.put("version_code", Integer.valueOf(C9685a.m19320e(this.f26243b)));
                if (map.get("update_version_code") == null) {
                    map.put("update_version_code", map.get("version_code"));
                }
            }
            if (map.get("update_version_code") == null) {
                if (packageInfo.applicationInfo.metaData != null) {
                    obj = packageInfo.applicationInfo.metaData.get("UPDATE_VERSION_CODE");
                }
                if (obj == null) {
                    obj = map.get("version_code");
                }
                map.put("update_version_code", obj);
            }
        } else {
            try {
                String str2 = this.f26243b.getPackageManager().getPackageInfo(this.f26243b.getPackageName(), 128).versionName;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f26243b.getPackageName());
                sb2.append(".BuildConfig");
                String str3 = (String) Class.forName(sb2.toString()).getDeclaredField("VERSION_NAME").get(null);
                if (str2 != null && !str2.equals(str3)) {
                    map.put("dex_err_manifest", "true");
                    map.put("dex_version", str3);
                    map.put("manifest_version", str2);
                }
            } catch (Throwable th3) {
                map.put("dex_err_manifest", th3.getMessage());
            }
        }
        return map;
    }

    /* renamed from: a */
    public static boolean m19161a(Map<String, Object> map) {
        if (map == null || map.isEmpty() || ((!map.containsKey("app_version") && !map.containsKey("version_name")) || !map.containsKey("version_code") || !map.containsKey("update_version_code"))) {
            return true;
        }
        return false;
    }

    public C9617a(Context context, C9588g gVar) {
        this.f26243b = context;
        this.f26242a = gVar;
    }

    /* renamed from: a */
    private static String m19160a(Map<String, Object> map, String str) {
        if (map != null) {
            Object obj = map.get(str);
            if (obj != null) {
                return String.valueOf(obj);
            }
        }
        return null;
    }
}
