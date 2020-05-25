package com.bytedance.apm;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.apm.core.C8988a;
import com.bytedance.apm.core.C8989b;
import com.bytedance.apm.net.DefaultHttpServiceImpl;
import com.bytedance.apm.p501q.C9179a;
import com.bytedance.services.apm.api.C13219b;
import com.bytedance.services.apm.api.IHttpService;
import com.p683ss.android.common.util.C18920g;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.c */
public final class C8976c {

    /* renamed from: a */
    public static Context f24423a;

    /* renamed from: b */
    public static boolean f24424b;

    /* renamed from: c */
    public static JSONObject f24425c = new JSONObject();

    /* renamed from: d */
    public static IHttpService f24426d = new DefaultHttpServiceImpl();

    /* renamed from: e */
    public static boolean f24427e;

    /* renamed from: f */
    public static long f24428f;

    /* renamed from: g */
    private static C8989b f24429g = new C8988a();

    /* renamed from: h */
    private static Map<String, String> f24430h = Collections.emptyMap();

    /* renamed from: i */
    private static long f24431i = -1;

    /* renamed from: j */
    private static volatile int f24432j = -1;

    /* renamed from: k */
    private static boolean f24433k = false;

    /* renamed from: l */
    private static long f24434l;

    /* renamed from: m */
    private static long f24435m;

    /* renamed from: n */
    private static String f24436n;

    /* renamed from: o */
    private static boolean f24437o;

    /* renamed from: a */
    public static Context m17736a() {
        return f24423a;
    }

    /* renamed from: d */
    public static boolean m17748d() {
        return f24433k;
    }

    /* renamed from: f */
    public static int m17750f() {
        return f24432j;
    }

    /* renamed from: g */
    public static boolean m17751g() {
        return f24424b;
    }

    /* renamed from: i */
    public static JSONObject m17753i() {
        return f24425c;
    }

    /* renamed from: j */
    public static C8989b m17754j() {
        return f24429g;
    }

    /* renamed from: k */
    public static long m17755k() {
        return f24435m;
    }

    /* renamed from: l */
    public static long m17756l() {
        return f24428f;
    }

    /* renamed from: m */
    public static long m17757m() {
        return f24434l;
    }

    /* renamed from: h */
    public static synchronized Map<String, String> m17752h() {
        Map<String, String> map;
        synchronized (C8976c.class) {
            map = f24430h;
        }
        return map;
    }

    /* renamed from: b */
    public static String m17745b() {
        if (TextUtils.isEmpty(f24436n)) {
            f24436n = C18920g.m46051b(f24423a);
        }
        return f24436n;
    }

    /* renamed from: e */
    public static long m17749e() {
        if (f24431i == -1) {
            f24431i = System.currentTimeMillis();
        }
        return f24431i;
    }

    /* renamed from: c */
    public static boolean m17747c() {
        boolean z = true;
        if (f24437o) {
            return true;
        }
        String b = m17745b();
        if ((b != null && b.contains(":")) || b == null || !b.equals(f24423a.getPackageName())) {
            z = false;
        }
        f24437o = z;
        return z;
    }

    /* renamed from: a */
    public static void m17738a(int i) {
        f24432j = i;
    }

    /* renamed from: a */
    public static void m17739a(long j) {
        f24435m = j;
    }

    /* renamed from: a */
    public static void m17740a(Context context) {
        if (context != null) {
            f24423a = C9179a.m18206a(context);
        }
    }

    /* renamed from: b */
    public static void m17746b(long j) {
        if (j > 0) {
            if (f24434l == 0 || j < f24434l) {
                f24434l = j;
            }
        }
    }

    /* renamed from: a */
    public static void m17742a(String str) {
        f24436n = str;
    }

    /* renamed from: a */
    public static synchronized void m17741a(C8989b bVar) {
        synchronized (C8976c.class) {
            f24429g = bVar;
            Map<String, String> a = bVar.mo16301a();
            f24430h = a;
            if (a == null) {
                f24430h = new HashMap();
            }
            if (!f24430h.containsKey("aid")) {
                f24430h.put("aid", f24425c.optString("aid"));
            }
            if (!f24430h.containsKey("device_id")) {
                f24430h.put("device_id", f24425c.optString("device_id"));
            }
            if (!f24430h.containsKey("device_platform")) {
                f24430h.put("device_platform", "android");
            }
            f24430h.put("os", "Android");
            if (!f24430h.containsKey("update_version_code")) {
                f24430h.put("update_version_code", f24425c.optString("update_version_code"));
            }
            if (!f24430h.containsKey("version_code")) {
                f24430h.put("version_code", f24425c.optString("version_code"));
            }
            if (!f24430h.containsKey("channel")) {
                f24430h.put("channel", f24425c.optString("channel"));
            }
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:101:0x02e7 */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a8 A[Catch:{ Exception -> 0x02e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c2 A[Catch:{ Exception -> 0x02e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01ec A[Catch:{ Exception -> 0x02e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0209 A[Catch:{ Exception -> 0x02e7 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m17743a(org.json.JSONObject r7) {
        /*
            java.lang.Class<com.bytedance.apm.c> r0 = com.bytedance.apm.C8976c.class
            monitor-enter(r0)
            java.lang.String r1 = "os"
            java.lang.String r2 = "Android"
            r7.put(r1, r2)     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r1 = "device_platform"
            java.lang.String r2 = "android"
            r7.put(r1, r2)     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r1 = "os_version"
            java.lang.String r2 = android.os.Build.VERSION.RELEASE     // Catch:{ Exception -> 0x02e7 }
            r7.put(r1, r2)     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r1 = "os_api"
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x02e7 }
            r7.put(r1, r2)     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r1 = "device_model"
            java.lang.String r2 = android.os.Build.MODEL     // Catch:{ Exception -> 0x02e7 }
            r7.put(r1, r2)     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r1 = "device_brand"
            java.lang.String r2 = android.os.Build.BRAND     // Catch:{ Exception -> 0x02e7 }
            r7.put(r1, r2)     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r1 = "device_manufacturer"
            java.lang.String r2 = android.os.Build.MANUFACTURER     // Catch:{ Exception -> 0x02e7 }
            r7.put(r1, r2)     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r1 = "process_name"
            android.content.Context r2 = m17736a()     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r2 = com.p683ss.android.common.util.C18920g.m46051b(r2)     // Catch:{ Exception -> 0x02e7 }
            r7.put(r1, r2)     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r1 = "sid"
            long r2 = m17749e()     // Catch:{ Exception -> 0x02e7 }
            r7.put(r1, r2)     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r1 = "rom_version"
            boolean r2 = com.bytedance.apm.p501q.C9197n.f25167d     // Catch:{ Exception -> 0x02e7 }
            r3 = 0
            if (r2 == 0) goto L_0x005d
            java.lang.String r2 = com.bytedance.apm.p501q.C9197n.f25168e     // Catch:{ Exception -> 0x02e7 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x02e7 }
            if (r2 != 0) goto L_0x005d
            java.lang.String r2 = com.bytedance.apm.p501q.C9197n.f25168e     // Catch:{ Exception -> 0x02e7 }
            goto L_0x0244
        L_0x005d:
            boolean r2 = com.bytedance.apm.p501q.C9197n.m18274c()     // Catch:{ Exception -> 0x02e7 }
            if (r2 == 0) goto L_0x008d
            boolean r2 = com.bytedance.apm.p501q.C9197n.m18274c()     // Catch:{ Exception -> 0x02e7 }
            if (r2 == 0) goto L_0x0089
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r4 = "miui_"
            r2.<init>(r4)     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r4 = "ro.miui.ui.version.name"
            java.lang.String r4 = com.bytedance.apm.p501q.C9197n.m18271a(r4)     // Catch:{ Exception -> 0x02e7 }
            r2.append(r4)     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r4 = "_"
            r2.append(r4)     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r4 = android.os.Build.VERSION.INCREMENTAL     // Catch:{ Exception -> 0x02e7 }
            r2.append(r4)     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x02e7 }
            goto L_0x0242
        L_0x0089:
            java.lang.String r2 = ""
            goto L_0x0242
        L_0x008d:
            java.lang.String r2 = android.os.Build.DISPLAY     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r4 = "Flyme"
            boolean r2 = r2.contains(r4)     // Catch:{ Exception -> 0x02e7 }
            r4 = 1
            if (r2 != 0) goto L_0x00a5
            java.lang.String r2 = "flyme"
            java.lang.String r5 = android.os.Build.USER     // Catch:{ Exception -> 0x02e7 }
            boolean r2 = r2.equals(r5)     // Catch:{ Exception -> 0x02e7 }
            if (r2 == 0) goto L_0x00a3
            goto L_0x00a5
        L_0x00a3:
            r2 = 0
            goto L_0x00a6
        L_0x00a5:
            r2 = 1
        L_0x00a6:
            if (r2 == 0) goto L_0x00c2
            java.lang.String r2 = android.os.Build.DISPLAY     // Catch:{ Exception -> 0x02e7 }
            if (r2 == 0) goto L_0x00be
            java.util.Locale r4 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r4 = r2.toLowerCase(r4)     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r5 = "flyme"
            boolean r4 = r4.contains(r5)     // Catch:{ Exception -> 0x02e7 }
            if (r4 == 0) goto L_0x00be
            goto L_0x0242
        L_0x00be:
            java.lang.String r2 = ""
            goto L_0x0242
        L_0x00c2:
            boolean r2 = com.bytedance.apm.p501q.C9197n.m18272a()     // Catch:{ Exception -> 0x02e7 }
            if (r2 == 0) goto L_0x00f2
            boolean r2 = com.bytedance.apm.p501q.C9197n.m18272a()     // Catch:{ Exception -> 0x02e7 }
            if (r2 == 0) goto L_0x00ee
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r4 = "coloros_"
            r2.<init>(r4)     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r4 = "ro.build.version.opporom"
            java.lang.String r4 = com.bytedance.apm.p501q.C9197n.m18271a(r4)     // Catch:{ Exception -> 0x02e7 }
            r2.append(r4)     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r4 = "_"
            r2.append(r4)     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r4 = android.os.Build.DISPLAY     // Catch:{ Exception -> 0x02e7 }
            r2.append(r4)     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x02e7 }
            goto L_0x0242
        L_0x00ee:
            java.lang.String r2 = ""
            goto L_0x0242
        L_0x00f2:
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x02e7 }
            r5 = 21
            if (r2 < r5) goto L_0x00ff
            java.lang.String r2 = "ro.build.version.emui"
            java.lang.String r2 = com.bytedance.apm.p501q.C9197n.m18271a(r2)     // Catch:{ Exception -> 0x02e7 }
            goto L_0x0103
        L_0x00ff:
            java.lang.String r2 = com.bytedance.apm.p501q.C9197n.m18273b()     // Catch:{ Exception -> 0x02e7 }
        L_0x0103:
            if (r2 == 0) goto L_0x012c
            java.util.Locale r5 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r5 = r2.toLowerCase(r5)     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r6 = "emotionui"
            boolean r5 = r5.contains(r6)     // Catch:{ Exception -> 0x02e7 }
            if (r5 == 0) goto L_0x012c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02e7 }
            r5.<init>()     // Catch:{ Exception -> 0x02e7 }
            r5.append(r2)     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r2 = "_"
            r5.append(r2)     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r2 = android.os.Build.DISPLAY     // Catch:{ Exception -> 0x02e7 }
            r5.append(r2)     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r2 = r5.toString()     // Catch:{ Exception -> 0x02e7 }
            goto L_0x012e
        L_0x012c:
            java.lang.String r2 = ""
        L_0x012e:
            boolean r5 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x02e7 }
            if (r5 != 0) goto L_0x0136
            goto L_0x0242
        L_0x0136:
            java.lang.String r2 = "ro.vivo.os.build.display.id"
            java.lang.String r2 = com.bytedance.apm.p501q.C9197n.m18271a(r2)     // Catch:{ Exception -> 0x02e7 }
            boolean r5 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x02e7 }
            if (r5 != 0) goto L_0x0154
            java.util.Locale r5 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r2 = r2.toLowerCase(r5)     // Catch:{ Exception -> 0x02e7 }
            java.lang.CharSequence r5 = com.bytedance.apm.p501q.C9197n.f25165b     // Catch:{ Exception -> 0x02e7 }
            boolean r2 = r2.contains(r5)     // Catch:{ Exception -> 0x02e7 }
            if (r2 == 0) goto L_0x0154
            r2 = 1
            goto L_0x0155
        L_0x0154:
            r2 = 0
        L_0x0155:
            if (r2 == 0) goto L_0x0179
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02e7 }
            r2.<init>()     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r4 = "ro.vivo.os.build.display.id"
            java.lang.String r4 = com.bytedance.apm.p501q.C9197n.m18271a(r4)     // Catch:{ Exception -> 0x02e7 }
            r2.append(r4)     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r4 = "_"
            r2.append(r4)     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r4 = "ro.vivo.product.version"
            java.lang.String r4 = com.bytedance.apm.p501q.C9197n.m18271a(r4)     // Catch:{ Exception -> 0x02e7 }
            r2.append(r4)     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x02e7 }
            goto L_0x0242
        L_0x0179:
            java.lang.String r2 = android.os.Build.DISPLAY     // Catch:{ Exception -> 0x02e7 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x02e7 }
            if (r2 != 0) goto L_0x0195
            java.lang.String r2 = android.os.Build.DISPLAY     // Catch:{ Exception -> 0x02e7 }
            java.util.Locale r5 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r2 = r2.toLowerCase(r5)     // Catch:{ Exception -> 0x02e7 }
            java.lang.CharSequence r5 = com.bytedance.apm.p501q.C9197n.f25164a     // Catch:{ Exception -> 0x02e7 }
            boolean r2 = r2.contains(r5)     // Catch:{ Exception -> 0x02e7 }
            if (r2 == 0) goto L_0x0195
            r2 = 1
            goto L_0x0196
        L_0x0195:
            r2 = 0
        L_0x0196:
            if (r2 == 0) goto L_0x01b6
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02e7 }
            r2.<init>()     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r4 = android.os.Build.DISPLAY     // Catch:{ Exception -> 0x02e7 }
            r2.append(r4)     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r4 = "_"
            r2.append(r4)     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r4 = "ro.gn.sv.version"
            java.lang.String r4 = com.bytedance.apm.p501q.C9197n.m18271a(r4)     // Catch:{ Exception -> 0x02e7 }
            r2.append(r4)     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x02e7 }
            goto L_0x0242
        L_0x01b6:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02e7 }
            r2.<init>()     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r5 = android.os.Build.MANUFACTURER     // Catch:{ Exception -> 0x02e7 }
            r2.append(r5)     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r5 = android.os.Build.BRAND     // Catch:{ Exception -> 0x02e7 }
            r2.append(r5)     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x02e7 }
            boolean r5 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x02e7 }
            if (r5 != 0) goto L_0x01e9
            java.util.Locale r5 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r2 = r2.toLowerCase(r5)     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r5 = "360"
            boolean r5 = r2.contains(r5)     // Catch:{ Exception -> 0x02e7 }
            if (r5 != 0) goto L_0x01e7
            java.lang.String r5 = "qiku"
            boolean r2 = r2.contains(r5)     // Catch:{ Exception -> 0x02e7 }
            if (r2 == 0) goto L_0x01e9
        L_0x01e7:
            r2 = 1
            goto L_0x01ea
        L_0x01e9:
            r2 = 0
        L_0x01ea:
            if (r2 == 0) goto L_0x0209
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02e7 }
            r2.<init>()     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r4 = "ro.build.uiversion"
            java.lang.String r4 = com.bytedance.apm.p501q.C9197n.m18271a(r4)     // Catch:{ Exception -> 0x02e7 }
            r2.append(r4)     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r4 = "_"
            r2.append(r4)     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r4 = android.os.Build.DISPLAY     // Catch:{ Exception -> 0x02e7 }
            r2.append(r4)     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x02e7 }
            goto L_0x0242
        L_0x0209:
            java.lang.String r2 = "ro.letv.release.version"
            java.lang.String r2 = com.bytedance.apm.p501q.C9197n.m18271a(r2)     // Catch:{ Exception -> 0x02e7 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x02e7 }
            r2 = r2 ^ r4
            if (r2 == 0) goto L_0x0235
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r5 = "eui_"
            r2.<init>(r5)     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r5 = "ro.letv.release.version"
            java.lang.String r5 = com.bytedance.apm.p501q.C9197n.m18271a(r5)     // Catch:{ Exception -> 0x02e7 }
            r2.append(r5)     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r5 = "_"
            r2.append(r5)     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r5 = android.os.Build.DISPLAY     // Catch:{ Exception -> 0x02e7 }
            r2.append(r5)     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x02e7 }
            goto L_0x0237
        L_0x0235:
            java.lang.String r2 = ""
        L_0x0237:
            boolean r5 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x02e7 }
            if (r5 != 0) goto L_0x023e
            goto L_0x0242
        L_0x023e:
            com.bytedance.apm.p501q.C9197n.f25167d = r4     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r2 = android.os.Build.DISPLAY     // Catch:{ Exception -> 0x02e7 }
        L_0x0242:
            com.bytedance.apm.p501q.C9197n.f25168e = r2     // Catch:{ Exception -> 0x02e7 }
        L_0x0244:
            r7.put(r1, r2)     // Catch:{ Exception -> 0x02e7 }
            r1 = 0
            java.lang.String r2 = "version_name"
            java.lang.String r2 = r7.optString(r2)     // Catch:{ Exception -> 0x02e7 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x02e7 }
            if (r2 == 0) goto L_0x026f
            android.content.Context r1 = m17736a()     // Catch:{ Exception -> 0x02e7 }
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ Exception -> 0x02e7 }
            android.content.Context r2 = m17736a()     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r2 = r2.getPackageName()     // Catch:{ Exception -> 0x02e7 }
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r3)     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r2 = "version_name"
            java.lang.String r4 = r1.versionName     // Catch:{ Exception -> 0x02e7 }
            r7.put(r2, r4)     // Catch:{ Exception -> 0x02e7 }
        L_0x026f:
            java.lang.String r2 = "app_version"
            java.lang.String r2 = r7.optString(r2)     // Catch:{ Exception -> 0x02e7 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x02e7 }
            if (r2 == 0) goto L_0x0286
            java.lang.String r2 = "app_version"
            java.lang.String r4 = "version_name"
            java.lang.String r4 = r7.optString(r4)     // Catch:{ Exception -> 0x02e7 }
            r7.put(r2, r4)     // Catch:{ Exception -> 0x02e7 }
        L_0x0286:
            java.lang.String r2 = "version_code"
            java.lang.String r2 = r7.optString(r2)     // Catch:{ Exception -> 0x02e7 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x02e7 }
            if (r2 == 0) goto L_0x02af
            if (r1 != 0) goto L_0x02a8
            android.content.Context r1 = m17736a()     // Catch:{ Exception -> 0x02e7 }
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ Exception -> 0x02e7 }
            android.content.Context r2 = m17736a()     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r2 = r2.getPackageName()     // Catch:{ Exception -> 0x02e7 }
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r3)     // Catch:{ Exception -> 0x02e7 }
        L_0x02a8:
            java.lang.String r2 = "version_code"
            int r1 = r1.versionCode     // Catch:{ Exception -> 0x02e7 }
            r7.put(r2, r1)     // Catch:{ Exception -> 0x02e7 }
        L_0x02af:
            java.lang.String r1 = "package"
            java.lang.String r1 = r7.optString(r1)     // Catch:{ Exception -> 0x02e7 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x02e7 }
            if (r1 == 0) goto L_0x02c8
            java.lang.String r1 = "package"
            android.content.Context r2 = m17736a()     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r2 = r2.getPackageName()     // Catch:{ Exception -> 0x02e7 }
            r7.put(r1, r2)     // Catch:{ Exception -> 0x02e7 }
        L_0x02c8:
            java.lang.String r1 = "region"
            boolean r1 = r7.isNull(r1)     // Catch:{ Exception -> 0x02e7 }
            if (r1 == 0) goto L_0x02dd
            java.lang.String r1 = "region"
            java.util.Locale r2 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r2 = r2.getCountry()     // Catch:{ Exception -> 0x02e7 }
            r7.put(r1, r2)     // Catch:{ Exception -> 0x02e7 }
        L_0x02dd:
            java.lang.String r1 = "monitor_version"
            java.lang.String r2 = "5.0.8.5-oversea"
            r7.put(r1, r2)     // Catch:{ Exception -> 0x02e7 }
            goto L_0x02e7
        L_0x02e5:
            r7 = move-exception
            goto L_0x02eb
        L_0x02e7:
            f24425c = r7     // Catch:{ all -> 0x02e5 }
            monitor-exit(r0)
            return
        L_0x02eb:
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.C8976c.m17743a(org.json.JSONObject):void");
    }

    /* renamed from: a */
    public static C13219b m17737a(String str, Map<String, String> map) throws Exception {
        return f24426d.doGet(str, map);
    }

    /* renamed from: a */
    public static boolean m17744a(String str, String str2) {
        if (f24425c == null) {
            return false;
        }
        try {
            f24425c.put(str, str2);
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }
}
