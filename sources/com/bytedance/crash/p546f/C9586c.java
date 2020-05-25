package com.bytedance.crash.p546f;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.bytedance.crash.C9616k;
import com.bytedance.crash.p551k.C9652h;
import com.bytedance.crash.p555n.C9691d;
import com.bytedance.crash.p555n.C9711r;
import com.taobao.android.dexposed.ClassUtils;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.f.c */
public final class C9586c {

    /* renamed from: b */
    private static final String[] f26145b = {"version_code", "manifest_version_code", "aid", "update_version_code"};

    /* renamed from: d */
    private static String f26146d;

    /* renamed from: e */
    private static int f26147e = -1;

    /* renamed from: f */
    private static int f26148f = -1;

    /* renamed from: a */
    public JSONObject f26149a = new JSONObject();

    /* renamed from: c */
    private Context f26150c;

    /* renamed from: b */
    public static boolean m19053b() {
        if (f26148f == -1) {
            f26148f = m19054c().contains("86") ? 1 : 0;
        }
        if (f26148f == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static String m19056d() {
        String str = VERSION.RELEASE;
        if (str.contains(ClassUtils.PACKAGE_SEPARATOR)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        return sb.toString();
    }

    /* renamed from: c */
    private static String m19054c() {
        if (f26146d == null) {
            try {
                StringBuilder sb = new StringBuilder();
                if (VERSION.SDK_INT < 21 || Build.SUPPORTED_ABIS.length <= 0) {
                    sb = new StringBuilder(Build.CPU_ABI);
                } else {
                    for (int i = 0; i < Build.SUPPORTED_ABIS.length; i++) {
                        sb.append(Build.SUPPORTED_ABIS[i]);
                        if (i != Build.SUPPORTED_ABIS.length - 1) {
                            sb.append(", ");
                        }
                    }
                }
                if (TextUtils.isEmpty(sb.toString())) {
                    f26146d = "unknown";
                }
                f26146d = sb.toString();
            } catch (Exception unused) {
                f26146d = "unknown";
            }
        }
        return f26146d;
    }

    /* renamed from: a */
    public static boolean m19051a() {
        if (f26147e == -1) {
            f26147e = m19054c().contains("64") ? 1 : 0;
        }
        if (f26147e == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static String m19057d(JSONObject jSONObject) {
        return jSONObject.optString("dex_err_manifest", null);
    }

    public C9586c(Context context) {
        this.f26150c = context;
    }

    /* renamed from: b */
    public static void m19052b(C9586c cVar) {
        if (cVar != null) {
            m19050a(cVar.f26149a);
        }
    }

    /* renamed from: c */
    public static boolean m19055c(JSONObject jSONObject) {
        if (jSONObject.optInt("unauthentic_version", 0) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final JSONObject mo17408a(long j) {
        if (j > 0) {
            try {
                this.f26149a.put("user_id", j);
            } catch (JSONException unused) {
            }
        }
        return this.f26149a;
    }

    /* renamed from: a */
    public static C9586c m19047a(Context context) {
        C9586c cVar = new C9586c(context);
        JSONObject jSONObject = cVar.f26149a;
        try {
            jSONObject.put("sdk_version", 3121);
            jSONObject.put("sdk_version_name", "3.1.2-rc.1-oversea");
        } catch (Exception unused) {
        }
        return cVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:0|1|2|3|4|(4:6|(1:8)|9|(1:11))|12) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0011 */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x001d A[Catch:{ Exception -> 0x003b }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.crash.p546f.C9586c m19049a(com.bytedance.crash.p546f.C9586c r4) {
        /*
            org.json.JSONObject r0 = r4.f26149a
            java.lang.String r1 = "access"
            android.content.Context r2 = r4.f26150c     // Catch:{ JSONException -> 0x0011 }
            com.bytedance.crash.m.b$b r2 = com.bytedance.crash.p555n.C9706n.m19410a(r2)     // Catch:{ JSONException -> 0x0011 }
            java.lang.String r2 = com.bytedance.crash.p555n.C9706n.m19411a(r2)     // Catch:{ JSONException -> 0x0011 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0011 }
        L_0x0011:
            android.content.Context r1 = r4.f26150c     // Catch:{ Exception -> 0x003b }
            java.lang.String r2 = "phone"
            java.lang.Object r1 = r1.getSystemService(r2)     // Catch:{ Exception -> 0x003b }
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1     // Catch:{ Exception -> 0x003b }
            if (r1 == 0) goto L_0x003b
            java.lang.String r2 = r1.getNetworkOperatorName()     // Catch:{ Exception -> 0x003b }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x003b }
            if (r3 != 0) goto L_0x002c
            java.lang.String r3 = "carrier"
            r0.put(r3, r2)     // Catch:{ Exception -> 0x003b }
        L_0x002c:
            java.lang.String r1 = r1.getNetworkOperator()     // Catch:{ Exception -> 0x003b }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x003b }
            if (r2 != 0) goto L_0x003b
            java.lang.String r2 = "mcc_mnc"
            r0.put(r2, r1)     // Catch:{ Exception -> 0x003b }
        L_0x003b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p546f.C9586c.m19049a(com.bytedance.crash.f.c):com.bytedance.crash.f.c");
    }

    /* renamed from: e */
    public static boolean m19058e(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0 || ((jSONObject.opt("app_version") == null && jSONObject.opt("version_name") == null) || jSONObject.opt("version_code") == null || jSONObject.opt("update_version_code") == null)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m19059f(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return true;
        }
        String optString = jSONObject.optString("aid");
        if (TextUtils.isEmpty(optString)) {
            return true;
        }
        try {
            if (Integer.parseInt(optString) <= 0) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: b */
    public final JSONObject mo17411b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return this.f26149a;
        }
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            try {
                this.f26149a.put(str, jSONObject.opt(str));
            } catch (JSONException unused) {
            }
        }
        return this.f26149a;
    }

    /* renamed from: g */
    private static void m19060g(JSONObject jSONObject) {
        String str;
        try {
            DisplayMetrics displayMetrics = C9616k.m19154f().getResources().getDisplayMetrics();
            int i = displayMetrics.densityDpi;
            if (i == 120) {
                str = "ldpi";
            } else if (i == 240) {
                str = "hdpi";
            } else if (i != 320) {
                str = "mdpi";
            } else {
                str = "xhdpi";
            }
            jSONObject.put("density_dpi", i);
            jSONObject.put("display_density", str);
            StringBuilder sb = new StringBuilder();
            sb.append(displayMetrics.heightPixels);
            sb.append("x");
            sb.append(displayMetrics.widthPixels);
            jSONObject.put("resolution", sb.toString());
        } catch (Exception unused) {
        }
    }

    /* renamed from: h */
    private static void m19061h(JSONObject jSONObject) {
        try {
            String language = C9616k.m19154f().getResources().getConfiguration().locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                jSONObject.put("language", language);
            }
            String country = Locale.getDefault().getCountry();
            if (!TextUtils.isEmpty(country)) {
                jSONObject.put("region", country);
            }
            int rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
            if (rawOffset < -12) {
                rawOffset = -12;
            }
            if (rawOffset > 12) {
                rawOffset = 12;
            }
            jSONObject.put("timezone", rawOffset);
        } catch (Exception unused) {
        }
    }

    /* renamed from: i */
    private static void m19062i(JSONObject jSONObject) {
        StringBuilder sb = new StringBuilder();
        try {
            if (C9691d.m19335b()) {
                sb.append("MIUI-");
            } else if (C9691d.m19337c()) {
                sb.append("FLYME-");
            } else {
                String a = C9691d.m19332a();
                if (C9691d.m19333a(a)) {
                    sb.append("EMUI-");
                }
                if (!TextUtils.isEmpty(a)) {
                    sb.append(a);
                    sb.append("-");
                }
            }
            sb.append(VERSION.INCREMENTAL);
            if (sb.length() > 0) {
                jSONObject.put("rom", sb.toString());
            }
            jSONObject.put("rom_version", C9711r.m19418a());
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m19050a(JSONObject jSONObject) {
        if (jSONObject != null) {
            m19062i(jSONObject);
            m19060g(jSONObject);
            m19061h(jSONObject);
            try {
                jSONObject.put("os", "Android");
                jSONObject.put("device_id", C9616k.m19151c().mo17507a());
                jSONObject.put("os_version", m19056d());
                jSONObject.put("os_api", VERSION.SDK_INT);
                String str = Build.MODEL;
                String str2 = Build.BRAND;
                if (str == null) {
                    str = str2;
                } else if (str2 != null && !str.contains(str2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(' ');
                    sb.append(str);
                    str = sb.toString();
                }
                jSONObject.put("device_model", str);
                jSONObject.put("device_brand", Build.BRAND);
                jSONObject.put("device_manufacturer", Build.MANUFACTURER);
                jSONObject.put("cpu_abi", m19054c());
                Context f = C9616k.m19154f();
                String packageName = f.getPackageName();
                jSONObject.put("package", packageName);
                PackageInfo packageInfo = f.getPackageManager().getPackageInfo(packageName, 0);
                if (packageInfo.applicationInfo != null) {
                    int i = packageInfo.applicationInfo.labelRes;
                    if (i > 0) {
                        jSONObject.put("display_name", f.getString(i));
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final JSONObject mo17409a(String str) {
        try {
            this.f26149a.put("device_id", str);
        } catch (JSONException unused) {
        }
        return this.f26149a;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:14|15|16|17|43) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0057 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject mo17410a(java.util.Map<java.lang.String, java.lang.Object> r7) {
        /*
            r6 = this;
            if (r7 != 0) goto L_0x0005
            org.json.JSONObject r7 = r6.f26149a     // Catch:{ Throwable -> 0x00c0 }
            return r7
        L_0x0005:
            java.util.Set r0 = r7.entrySet()     // Catch:{ Throwable -> 0x00c0 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Throwable -> 0x00c0 }
        L_0x000d:
            boolean r1 = r0.hasNext()     // Catch:{ Throwable -> 0x00c0 }
            if (r1 == 0) goto L_0x0037
            java.lang.Object r1 = r0.next()     // Catch:{ Throwable -> 0x00c0 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ Throwable -> 0x00c0 }
            org.json.JSONObject r2 = r6.f26149a     // Catch:{ Throwable -> 0x00c0 }
            java.lang.Object r3 = r1.getKey()     // Catch:{ Throwable -> 0x00c0 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Throwable -> 0x00c0 }
            boolean r2 = r2.has(r3)     // Catch:{ Throwable -> 0x00c0 }
            if (r2 != 0) goto L_0x000d
            org.json.JSONObject r2 = r6.f26149a     // Catch:{ Throwable -> 0x00c0 }
            java.lang.Object r3 = r1.getKey()     // Catch:{ Throwable -> 0x00c0 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Throwable -> 0x00c0 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ Throwable -> 0x00c0 }
            r2.put(r3, r1)     // Catch:{ Throwable -> 0x00c0 }
            goto L_0x000d
        L_0x0037:
            java.lang.String[] r0 = f26145b     // Catch:{ Throwable -> 0x00c0 }
            int r1 = r0.length     // Catch:{ Throwable -> 0x00c0 }
            r2 = 0
        L_0x003b:
            if (r2 >= r1) goto L_0x0063
            r3 = r0[r2]     // Catch:{ Throwable -> 0x00c0 }
            boolean r4 = r7.containsKey(r3)     // Catch:{ Throwable -> 0x00c0 }
            if (r4 == 0) goto L_0x0060
            java.lang.Object r4 = r7.get(r3)     // Catch:{ Throwable -> 0x0057 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Throwable -> 0x0057 }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ Throwable -> 0x0057 }
            org.json.JSONObject r5 = r6.f26149a     // Catch:{ Throwable -> 0x0057 }
            r5.put(r3, r4)     // Catch:{ Throwable -> 0x0057 }
            goto L_0x0060
        L_0x0057:
            org.json.JSONObject r4 = r6.f26149a     // Catch:{ Throwable -> 0x00c0 }
            java.lang.Object r5 = r7.get(r3)     // Catch:{ Throwable -> 0x00c0 }
            r4.put(r3, r5)     // Catch:{ Throwable -> 0x00c0 }
        L_0x0060:
            int r2 = r2 + 1
            goto L_0x003b
        L_0x0063:
            java.lang.String r0 = "version_code"
            boolean r0 = r7.containsKey(r0)     // Catch:{ Throwable -> 0x00c0 }
            if (r0 == 0) goto L_0x0088
            java.lang.String r0 = "manifest_version_code"
            boolean r0 = r7.containsKey(r0)     // Catch:{ Throwable -> 0x00c0 }
            if (r0 != 0) goto L_0x0088
            java.lang.String r0 = "version_code"
            java.lang.Object r0 = r7.get(r0)     // Catch:{ Throwable -> 0x0088 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Throwable -> 0x0088 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Throwable -> 0x0088 }
            org.json.JSONObject r1 = r6.f26149a     // Catch:{ Throwable -> 0x0088 }
            java.lang.String r2 = "manifest_version_code"
            r1.put(r2, r0)     // Catch:{ Throwable -> 0x0088 }
        L_0x0088:
            java.lang.String r0 = "iid"
            boolean r0 = r7.containsKey(r0)     // Catch:{ Throwable -> 0x00c0 }
            if (r0 == 0) goto L_0x00a4
            org.json.JSONObject r0 = r6.f26149a     // Catch:{ Throwable -> 0x00c0 }
            java.lang.String r1 = "udid"
            java.lang.String r2 = "iid"
            java.lang.Object r2 = r7.get(r2)     // Catch:{ Throwable -> 0x00c0 }
            r0.put(r1, r2)     // Catch:{ Throwable -> 0x00c0 }
            org.json.JSONObject r0 = r6.f26149a     // Catch:{ Throwable -> 0x00c0 }
            java.lang.String r1 = "iid"
            r0.remove(r1)     // Catch:{ Throwable -> 0x00c0 }
        L_0x00a4:
            java.lang.String r0 = "version_name"
            boolean r0 = r7.containsKey(r0)     // Catch:{ Throwable -> 0x00c0 }
            if (r0 == 0) goto L_0x00c0
            org.json.JSONObject r0 = r6.f26149a     // Catch:{ Throwable -> 0x00c0 }
            java.lang.String r1 = "app_version"
            java.lang.String r2 = "version_name"
            java.lang.Object r7 = r7.get(r2)     // Catch:{ Throwable -> 0x00c0 }
            r0.put(r1, r7)     // Catch:{ Throwable -> 0x00c0 }
            org.json.JSONObject r7 = r6.f26149a     // Catch:{ Throwable -> 0x00c0 }
            java.lang.String r0 = "version_name"
            r7.remove(r0)     // Catch:{ Throwable -> 0x00c0 }
        L_0x00c0:
            org.json.JSONObject r7 = r6.f26149a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p546f.C9586c.mo17410a(java.util.Map):org.json.JSONObject");
    }

    /* renamed from: a */
    public static C9586c m19048a(Context context, long j) {
        C9586c cVar;
        C9652h a = C9652h.m19252a();
        if (j == 0) {
            j = System.currentTimeMillis();
        }
        JSONObject a2 = a.mo17502a(j);
        if (a2 == null || a2.length() == 0) {
            cVar = m19047a(C9616k.m19154f());
            cVar.mo17410a(C9616k.m19147a().mo17446a());
            try {
                cVar.f26149a.put("errHeader", 1);
            } catch (Throwable unused) {
            }
        } else {
            cVar = new C9586c(C9616k.m19154f());
        }
        m19052b(cVar);
        cVar.mo17411b(a2);
        return cVar;
    }
}
