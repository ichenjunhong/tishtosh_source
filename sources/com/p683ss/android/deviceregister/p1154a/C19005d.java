package com.p683ss.android.deviceregister.p1154a;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import com.bytedance.common.utility.C9395d;
import com.bytedance.common.utility.C9431p;
import com.p683ss.android.common.C18846a;
import com.p683ss.android.deviceregister.p1155b.C19026b;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.deviceregister.a.d */
public final class C19005d {

    /* renamed from: a */
    public static String f52311a = null;

    /* renamed from: b */
    public static C18846a f52312b = null;

    /* renamed from: c */
    public static String f52313c = null;

    /* renamed from: d */
    public static int f52314d = 0;

    /* renamed from: e */
    public static String f52315e = null;

    /* renamed from: f */
    public static String f52316f = "2.5.5.6";

    /* renamed from: g */
    public static String f52317g;

    /* renamed from: h */
    public static C19026b f52318h;

    /* renamed from: i */
    public static C19004c f52319i;

    /* renamed from: j */
    public static String f52320j;

    /* renamed from: k */
    public static ConcurrentHashMap<String, Object> f52321k;

    /* renamed from: l */
    private static String f52322l;

    /* renamed from: m */
    private static int f52323m;

    /* renamed from: n */
    private static String f52324n;

    /* renamed from: o */
    private static ConcurrentHashMap<String, Object> f52325o = new ConcurrentHashMap<>();

    /* renamed from: p */
    private static boolean f52326p = false;

    /* renamed from: q */
    private static JSONObject f52327q;

    /* renamed from: r */
    private static String f52328r;

    /* renamed from: s */
    private static String f52329s;

    /* renamed from: t */
    private static String f52330t;

    /* renamed from: u */
    private static final Object f52331u = new Object();

    /* renamed from: v */
    private static boolean f52332v = false;

    /* renamed from: a */
    public static String m46178a() {
        return f52315e;
    }

    /* renamed from: b */
    public static int m46186b() {
        return f52314d;
    }

    /* renamed from: d */
    public static String m46189d() {
        return f52311a;
    }

    /* renamed from: e */
    public static String m46190e() {
        return f52322l;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:258:0x071f, code lost:
        if (com.bytedance.common.utility.C9431p.m18664a(f52324n) == false) goto L_0x0721;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x073b, code lost:
        if (r12.equals(f52324n) == false) goto L_0x0721;
     */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x04c4 A[Catch:{ Throwable -> 0x04f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x04cf A[Catch:{ Throwable -> 0x04f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0660 A[Catch:{ Throwable -> 0x06c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x067d A[Catch:{ Throwable -> 0x06c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x0745 A[SYNTHETIC, Splitter:B:272:0x0745] */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x0750  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x0757 A[SYNTHETIC, Splitter:B:280:0x0757] */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x0769 A[SYNTHETIC, Splitter:B:285:0x0769] */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x0779  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x0784 A[Catch:{ Throwable -> 0x0781 }] */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x079c A[Catch:{ Throwable -> 0x0781 }] */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x07ac A[Catch:{ Throwable -> 0x0781 }] */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x07c7 A[Catch:{ Throwable -> 0x0781 }] */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x07d7 A[Catch:{ Throwable -> 0x0781 }] */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x07f2 A[Catch:{ Throwable -> 0x0781 }] */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x07f9 A[Catch:{ Throwable -> 0x0781 }] */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x0800 A[Catch:{ Throwable -> 0x0781 }] */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x0818  */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x083c A[Catch:{ Throwable -> 0x0849 }] */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x0860 A[SYNTHETIC, Splitter:B:343:0x0860] */
    /* JADX WARNING: Removed duplicated region for block: B:381:0x097b  */
    /* JADX WARNING: Removed duplicated region for block: B:387:0x0995  */
    /* JADX WARNING: Removed duplicated region for block: B:399:0x09d3 A[Catch:{ Throwable -> 0x0aa5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:402:0x09fd A[Catch:{ Throwable -> 0x0aa5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x0a51 A[Catch:{ Throwable -> 0x0aa5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:408:0x0a87 A[Catch:{ Throwable -> 0x0aa5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:413:0x0aad A[SYNTHETIC, Splitter:B:413:0x0aad] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m46185a(android.content.Context r21, org.json.JSONObject r22) {
        /*
            r1 = r21
            r2 = r22
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            org.json.JSONObject r4 = f52327q
            r5 = 1
            if (r4 == 0) goto L_0x001c
            java.lang.Object r4 = f52331u
            monitor-enter(r4)
            org.json.JSONObject r1 = f52327q     // Catch:{ all -> 0x0018 }
            m46183a(r1, r2)     // Catch:{ all -> 0x0018 }
            monitor-exit(r4)     // Catch:{ all -> 0x0018 }
            return r5
        L_0x0018:
            r0 = move-exception
            r1 = r0
            monitor-exit(r4)     // Catch:{ all -> 0x0018 }
            throw r1
        L_0x001c:
            long r6 = android.os.SystemClock.uptimeMillis()
            java.util.HashMap r4 = new java.util.HashMap
            r8 = 64
            r4.<init>(r8)
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            long r9 = android.os.SystemClock.uptimeMillis()
            r11 = 0
            java.lang.String r12 = r21.getPackageName()     // Catch:{ Exception -> 0x0abb }
            android.content.pm.PackageManager r13 = r21.getPackageManager()     // Catch:{ Exception -> 0x0087 }
            android.content.Context r14 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()     // Catch:{ Exception -> 0x0087 }
            java.lang.String r14 = r14.getPackageName()     // Catch:{ Exception -> 0x0087 }
            boolean r14 = android.text.TextUtils.equals(r12, r14)     // Catch:{ Exception -> 0x0087 }
            r15 = 128(0x80, float:1.794E-43)
            if (r14 == 0) goto L_0x0056
            android.content.pm.ApplicationInfo r14 = com.p683ss.android.ugc.aweme.lancet.p1151a.C18970b.f52271a     // Catch:{ Exception -> 0x0087 }
            if (r14 != 0) goto L_0x0053
            android.content.pm.ApplicationInfo r13 = r13.getApplicationInfo(r12, r15)     // Catch:{ Exception -> 0x0087 }
            com.p683ss.android.ugc.aweme.lancet.p1151a.C18970b.f52271a = r13     // Catch:{ Exception -> 0x0087 }
        L_0x0053:
            android.content.pm.ApplicationInfo r13 = com.p683ss.android.ugc.aweme.lancet.p1151a.C18970b.f52271a     // Catch:{ Exception -> 0x0087 }
            goto L_0x005a
        L_0x0056:
            android.content.pm.ApplicationInfo r13 = r13.getApplicationInfo(r12, r15)     // Catch:{ Exception -> 0x0087 }
        L_0x005a:
            android.os.Bundle r13 = r13.metaData     // Catch:{ Exception -> 0x0087 }
            java.lang.String r14 = f52311a     // Catch:{ Exception -> 0x0087 }
            if (r14 == 0) goto L_0x0070
            java.lang.String r14 = f52311a     // Catch:{ Exception -> 0x0087 }
            int r14 = r14.length()     // Catch:{ Exception -> 0x0087 }
            if (r14 <= 0) goto L_0x0070
            java.lang.String r14 = "channel"
            java.lang.String r15 = f52311a     // Catch:{ Exception -> 0x0087 }
            r3.put(r14, r15)     // Catch:{ Exception -> 0x0087 }
            goto L_0x007b
        L_0x0070:
            java.lang.String r14 = "channel"
            java.lang.String r15 = "UMENG_CHANNEL"
            java.lang.String r15 = r13.getString(r15)     // Catch:{ Exception -> 0x0087 }
            r3.put(r14, r15)     // Catch:{ Exception -> 0x0087 }
        L_0x007b:
            java.lang.String r14 = "appkey"
            java.lang.String r15 = "UMENG_APPKEY"
            java.lang.String r13 = r13.getString(r15)     // Catch:{ Exception -> 0x0087 }
            r3.put(r14, r13)     // Catch:{ Exception -> 0x0087 }
            goto L_0x008c
        L_0x0087:
            r0 = move-exception
            r13 = r0
            m46181a(r13)     // Catch:{ Exception -> 0x0abb }
        L_0x008c:
            java.lang.String r13 = "channel"
            long r14 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0abb }
            r16 = 0
            long r14 = r14 - r9
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x0abb }
            r4.put(r13, r14)     // Catch:{ Exception -> 0x0abb }
            java.lang.String r13 = "appkey"
            long r14 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0abb }
            r16 = 0
            long r14 = r14 - r9
            java.lang.Long r9 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x0abb }
            r4.put(r13, r9)     // Catch:{ Exception -> 0x0abb }
            long r9 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0abb }
            java.lang.String r13 = f52320j     // Catch:{ Exception -> 0x0abb }
            boolean r13 = android.text.TextUtils.isEmpty(r13)     // Catch:{ Exception -> 0x0abb }
            if (r13 != 0) goto L_0x00f1
            java.lang.String r13 = "package"
            java.lang.String r14 = f52320j     // Catch:{ Exception -> 0x0abb }
            r3.put(r13, r14)     // Catch:{ Exception -> 0x0abb }
            android.os.Bundle r13 = new android.os.Bundle     // Catch:{ Exception -> 0x0abb }
            r13.<init>()     // Catch:{ Exception -> 0x0abb }
            java.lang.String r14 = "real_package_name"
            java.lang.String r15 = r21.getPackageName()     // Catch:{ Exception -> 0x0abb }
            r13.putString(r14, r15)     // Catch:{ Exception -> 0x0abb }
            com.p683ss.android.deviceregister.C19034d.m46316a(r13)     // Catch:{ Exception -> 0x0abb }
            java.lang.String r13 = "package"
            long r14 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0abb }
            r16 = 0
            long r14 = r14 - r9
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x0abb }
            r4.put(r13, r14)     // Catch:{ Exception -> 0x0abb }
            java.lang.String r13 = "real_package_name"
            long r14 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0abb }
            r16 = 0
            long r14 = r14 - r9
            java.lang.Long r9 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x0abb }
            r4.put(r13, r9)     // Catch:{ Exception -> 0x0abb }
            goto L_0x010a
        L_0x00f1:
            java.lang.String r13 = "package"
            java.lang.String r14 = r21.getPackageName()     // Catch:{ Exception -> 0x0abb }
            r3.put(r13, r14)     // Catch:{ Exception -> 0x0abb }
            java.lang.String r13 = "package"
            long r14 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0abb }
            r16 = 0
            long r14 = r14 - r9
            java.lang.Long r9 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x0abb }
            r4.put(r13, r9)     // Catch:{ Exception -> 0x0abb }
        L_0x010a:
            long r9 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0abb }
            com.ss.android.common.a r13 = f52312b     // Catch:{ Exception -> 0x0abb }
            if (r13 == 0) goto L_0x011a
            com.ss.android.common.a r13 = f52312b     // Catch:{ Exception -> 0x0abb }
            java.lang.String r13 = r13.mo20035i()     // Catch:{ Exception -> 0x0abb }
            f52322l = r13     // Catch:{ Exception -> 0x0abb }
        L_0x011a:
            java.lang.String r13 = f52313c     // Catch:{ Exception -> 0x0abb }
            boolean r13 = com.bytedance.common.utility.C9431p.m18664a(r13)     // Catch:{ Exception -> 0x0abb }
            if (r13 != 0) goto L_0x0126
            java.lang.String r13 = f52313c     // Catch:{ Exception -> 0x0abb }
            f52322l = r13     // Catch:{ Exception -> 0x0abb }
        L_0x0126:
            java.lang.String r13 = "app_version"
            java.lang.String r14 = f52322l     // Catch:{ Exception -> 0x0abb }
            r3.put(r13, r14)     // Catch:{ Exception -> 0x0abb }
            java.lang.String r13 = "app_version"
            long r14 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0abb }
            r16 = 0
            long r14 = r14 - r9
            java.lang.Long r9 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x0abb }
            r4.put(r13, r9)     // Catch:{ Exception -> 0x0abb }
            long r9 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0abb }
            com.ss.android.common.a r13 = f52312b     // Catch:{ Exception -> 0x0abb }
            if (r13 == 0) goto L_0x014d
            com.ss.android.common.a r13 = f52312b     // Catch:{ Exception -> 0x0abb }
            int r13 = r13.mo20037k()     // Catch:{ Exception -> 0x0abb }
            f52323m = r13     // Catch:{ Exception -> 0x0abb }
        L_0x014d:
            java.lang.String r13 = "version_code"
            long r14 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0abb }
            r16 = 0
            long r14 = r14 - r9
            java.lang.Long r9 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x0abb }
            r4.put(r13, r9)     // Catch:{ Exception -> 0x0abb }
            long r9 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0abb }
            android.content.pm.PackageManager r13 = r21.getPackageManager()     // Catch:{ Exception -> 0x0abb }
            android.content.pm.PackageInfo r12 = r13.getPackageInfo(r12, r11)     // Catch:{ Exception -> 0x0abb }
            android.content.pm.ApplicationInfo r13 = r12.applicationInfo     // Catch:{ Exception -> 0x0abb }
            if (r13 == 0) goto L_0x018b
            android.content.pm.ApplicationInfo r12 = r12.applicationInfo     // Catch:{ Exception -> 0x0abb }
            int r12 = r12.labelRes     // Catch:{ Exception -> 0x0abb }
            if (r12 <= 0) goto L_0x017c
            java.lang.String r13 = "display_name"
            java.lang.String r12 = r1.getString(r12)     // Catch:{ Exception -> 0x0abb }
            r8.put(r13, r12)     // Catch:{ Exception -> 0x0abb }
        L_0x017c:
            java.lang.String r12 = "display_name"
            long r13 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0abb }
            r15 = 0
            long r13 = r13 - r9
            java.lang.Long r9 = java.lang.Long.valueOf(r13)     // Catch:{ Exception -> 0x0abb }
            r4.put(r12, r9)     // Catch:{ Exception -> 0x0abb }
        L_0x018b:
            com.ss.android.common.a r9 = f52312b     // Catch:{ Exception -> 0x0abb }
            if (r9 == 0) goto L_0x01cf
            long r9 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0abb }
            com.ss.android.common.a r12 = f52312b     // Catch:{ Exception -> 0x0abb }
            int r12 = r12.mo20033g()     // Catch:{ Exception -> 0x0abb }
            if (r12 <= 0) goto L_0x01a0
            java.lang.String r13 = "update_version_code"
            r8.put(r13, r12)     // Catch:{ Exception -> 0x0abb }
        L_0x01a0:
            java.lang.String r12 = "update_version_code"
            long r13 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0abb }
            r15 = 0
            long r13 = r13 - r9
            java.lang.Long r9 = java.lang.Long.valueOf(r13)     // Catch:{ Exception -> 0x0abb }
            r4.put(r12, r9)     // Catch:{ Exception -> 0x0abb }
            com.ss.android.common.a r9 = f52312b     // Catch:{ Exception -> 0x0abb }
            int r9 = r9.mo20031e()     // Catch:{ Exception -> 0x0abb }
            long r12 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0abb }
            if (r9 <= 0) goto L_0x01c0
            java.lang.String r10 = "manifest_version_code"
            r8.put(r10, r9)     // Catch:{ Exception -> 0x0abb }
        L_0x01c0:
            java.lang.String r9 = "manifest_version_code"
            long r14 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0abb }
            r10 = 0
            long r14 = r14 - r12
            java.lang.Long r10 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x0abb }
            r4.put(r9, r10)     // Catch:{ Exception -> 0x0abb }
        L_0x01cf:
            r9 = 4
            java.lang.String[] r10 = new java.lang.String[r9]
            java.lang.String r12 = "channel"
            r10[r11] = r12
            java.lang.String r12 = "appkey"
            r10[r5] = r12
            r12 = 2
            java.lang.String r13 = "package"
            r10[r12] = r13
            r12 = 3
            java.lang.String r13 = "app_version"
            r10[r12] = r13
            int r12 = f52314d     // Catch:{ Exception -> 0x02ab }
            if (r12 != 0) goto L_0x01f4
            com.ss.android.common.a r12 = f52312b     // Catch:{ Exception -> 0x02ab }
            if (r12 == 0) goto L_0x01f4
            com.ss.android.common.a r12 = f52312b     // Catch:{ Exception -> 0x02ab }
            int r12 = r12.mo20028b()     // Catch:{ Exception -> 0x02ab }
            f52314d = r12     // Catch:{ Exception -> 0x02ab }
        L_0x01f4:
            java.lang.String r12 = "aid"
            int r13 = f52314d     // Catch:{ Exception -> 0x02ab }
            r8.put(r12, r13)     // Catch:{ Exception -> 0x02ab }
            r12 = 0
        L_0x01fc:
            if (r12 >= r9) goto L_0x021b
            r13 = r10[r12]     // Catch:{ Exception -> 0x02ab }
            java.lang.Object r14 = r3.get(r13)     // Catch:{ Exception -> 0x02ab }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ Exception -> 0x02ab }
            boolean r15 = com.bytedance.common.utility.C9431p.m18664a(r14)     // Catch:{ Exception -> 0x02ab }
            if (r15 == 0) goto L_0x0215
            java.lang.String r14 = "appkey"
            boolean r13 = r14.equals(r13)     // Catch:{ Exception -> 0x02ab }
            if (r13 != 0) goto L_0x0218
            return r11
        L_0x0215:
            r8.put(r13, r14)     // Catch:{ Exception -> 0x02ab }
        L_0x0218:
            int r12 = r12 + 1
            goto L_0x01fc
        L_0x021b:
            java.lang.String r3 = "version_code"
            int r9 = f52323m     // Catch:{ Exception -> 0x02ab }
            r8.put(r3, r9)     // Catch:{ Exception -> 0x02ab }
            java.lang.String r3 = "sdk_version"
            java.lang.String r9 = f52316f     // Catch:{ Exception -> 0x02ab }
            r8.put(r3, r9)     // Catch:{ Exception -> 0x02ab }
            java.lang.String r3 = "os"
            java.lang.String r9 = "Android"
            r8.put(r3, r9)     // Catch:{ Exception -> 0x02ab }
            long r9 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x02ab }
            java.lang.String r3 = "os_version"
            java.lang.String r12 = android.os.Build.VERSION.RELEASE     // Catch:{ Exception -> 0x02ab }
            r8.put(r3, r12)     // Catch:{ Exception -> 0x02ab }
            java.lang.String r3 = "os_version"
            long r12 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x02ab }
            r14 = 0
            long r12 = r12 - r9
            java.lang.Long r9 = java.lang.Long.valueOf(r12)     // Catch:{ Exception -> 0x02ab }
            r4.put(r3, r9)     // Catch:{ Exception -> 0x02ab }
            long r9 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x02ab }
            java.lang.String r3 = "os_api"
            int r12 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x02ab }
            r8.put(r3, r12)     // Catch:{ Exception -> 0x02ab }
            java.lang.String r3 = "os_api"
            long r12 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x02ab }
            r14 = 0
            long r12 = r12 - r9
            java.lang.Long r9 = java.lang.Long.valueOf(r12)     // Catch:{ Exception -> 0x02ab }
            r4.put(r3, r9)     // Catch:{ Exception -> 0x02ab }
            long r9 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x02ab }
            java.lang.String r3 = "device_model"
            java.lang.String r12 = android.os.Build.MODEL     // Catch:{ Exception -> 0x02ab }
            r8.put(r3, r12)     // Catch:{ Exception -> 0x02ab }
            java.lang.String r3 = "device_model"
            long r12 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x02ab }
            r14 = 0
            long r12 = r12 - r9
            java.lang.Long r9 = java.lang.Long.valueOf(r12)     // Catch:{ Exception -> 0x02ab }
            r4.put(r3, r9)     // Catch:{ Exception -> 0x02ab }
            long r9 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x02ab }
            java.lang.String r3 = "device_brand"
            java.lang.String r12 = android.os.Build.BRAND     // Catch:{ Exception -> 0x02ab }
            r8.put(r3, r12)     // Catch:{ Exception -> 0x02ab }
            java.lang.String r3 = "cpu_abi"
            java.lang.String r12 = android.os.Build.CPU_ABI     // Catch:{ Exception -> 0x02ab }
            r8.put(r3, r12)     // Catch:{ Exception -> 0x02ab }
            java.lang.String r3 = "cpu_abi"
            long r12 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x02ab }
            r14 = 0
            long r12 = r12 - r9
            java.lang.Long r9 = java.lang.Long.valueOf(r12)     // Catch:{ Exception -> 0x02ab }
            r4.put(r3, r9)     // Catch:{ Exception -> 0x02ab }
            java.lang.String r3 = f52315e     // Catch:{ Exception -> 0x02ab }
            if (r3 != 0) goto L_0x02a5
            java.lang.String r3 = ""
        L_0x02a5:
            java.lang.String r9 = "release_build"
            r8.put(r9, r3)     // Catch:{ Exception -> 0x02ab }
            goto L_0x02b0
        L_0x02ab:
            r0 = move-exception
            r3 = r0
            m46181a(r3)
        L_0x02b0:
            long r9 = android.os.SystemClock.uptimeMillis()
            android.content.res.Resources r3 = r21.getResources()     // Catch:{ Exception -> 0x02fd }
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()     // Catch:{ Exception -> 0x02fd }
            int r12 = r3.densityDpi     // Catch:{ Exception -> 0x02fd }
            java.lang.String r13 = "density_dpi"
            r8.put(r13, r12)     // Catch:{ Exception -> 0x02fd }
            r13 = 120(0x78, float:1.68E-43)
            if (r12 == r13) goto L_0x02d8
            r13 = 240(0xf0, float:3.36E-43)
            if (r12 == r13) goto L_0x02d5
            r13 = 320(0x140, float:4.48E-43)
            if (r12 == r13) goto L_0x02d2
            java.lang.String r12 = "mdpi"
            goto L_0x02da
        L_0x02d2:
            java.lang.String r12 = "xhdpi"
            goto L_0x02da
        L_0x02d5:
            java.lang.String r12 = "hdpi"
            goto L_0x02da
        L_0x02d8:
            java.lang.String r12 = "ldpi"
        L_0x02da:
            java.lang.String r13 = "display_density"
            r8.put(r13, r12)     // Catch:{ Exception -> 0x02fd }
            java.lang.String r12 = "resolution"
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02fd }
            r13.<init>()     // Catch:{ Exception -> 0x02fd }
            int r14 = r3.heightPixels     // Catch:{ Exception -> 0x02fd }
            r13.append(r14)     // Catch:{ Exception -> 0x02fd }
            java.lang.String r14 = "x"
            r13.append(r14)     // Catch:{ Exception -> 0x02fd }
            int r3 = r3.widthPixels     // Catch:{ Exception -> 0x02fd }
            r13.append(r3)     // Catch:{ Exception -> 0x02fd }
            java.lang.String r3 = r13.toString()     // Catch:{ Exception -> 0x02fd }
            r8.put(r12, r3)     // Catch:{ Exception -> 0x02fd }
            goto L_0x0302
        L_0x02fd:
            r0 = move-exception
            r3 = r0
            m46181a(r3)
        L_0x0302:
            java.lang.String r3 = "display_density"
            long r12 = android.os.SystemClock.uptimeMillis()
            long r12 = r12 - r9
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r4.put(r3, r12)
            java.lang.String r3 = "resolution"
            long r12 = android.os.SystemClock.uptimeMillis()
            long r12 = r12 - r9
            java.lang.Long r9 = java.lang.Long.valueOf(r12)
            r4.put(r3, r9)
            long r9 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x03bd }
            android.content.res.Resources r3 = r21.getResources()     // Catch:{ Exception -> 0x03bd }
            android.content.res.Configuration r3 = r3.getConfiguration()     // Catch:{ Exception -> 0x03bd }
            java.util.Locale r3 = r3.locale     // Catch:{ Exception -> 0x03bd }
            java.lang.String r3 = r3.getLanguage()     // Catch:{ Exception -> 0x03bd }
            boolean r12 = com.bytedance.common.utility.C9431p.m18664a(r3)     // Catch:{ Exception -> 0x03bd }
            if (r12 != 0) goto L_0x033b
            java.lang.String r12 = "language"
            r8.put(r12, r3)     // Catch:{ Exception -> 0x03bd }
        L_0x033b:
            java.lang.String r3 = "language"
            long r12 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x03bd }
            r14 = 0
            long r12 = r12 - r9
            java.lang.Long r9 = java.lang.Long.valueOf(r12)     // Catch:{ Exception -> 0x03bd }
            r4.put(r3, r9)     // Catch:{ Exception -> 0x03bd }
            long r9 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x03bd }
            java.lang.String r3 = com.p683ss.android.deviceregister.p1158c.C19031b.m46308b(r21)     // Catch:{ Exception -> 0x03bd }
            boolean r12 = com.bytedance.common.utility.C9431p.m18664a(r3)     // Catch:{ Exception -> 0x03bd }
            if (r12 != 0) goto L_0x035f
            java.lang.String r12 = "mc"
            r8.put(r12, r3)     // Catch:{ Exception -> 0x03bd }
            f52324n = r3     // Catch:{ Exception -> 0x03bd }
        L_0x035f:
            java.lang.String r3 = "mc"
            long r12 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x03bd }
            r14 = 0
            long r12 = r12 - r9
            java.lang.Long r9 = java.lang.Long.valueOf(r12)     // Catch:{ Exception -> 0x03bd }
            r4.put(r3, r9)     // Catch:{ Exception -> 0x03bd }
            long r9 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x03bd }
            java.util.TimeZone r3 = java.util.TimeZone.getDefault()     // Catch:{ Exception -> 0x03bd }
            int r3 = r3.getRawOffset()     // Catch:{ Exception -> 0x03bd }
            r12 = 3600000(0x36ee80, float:5.044674E-39)
            int r3 = r3 / r12
            r12 = -12
            if (r3 >= r12) goto L_0x0384
            r3 = -12
        L_0x0384:
            r12 = 12
            if (r3 <= r12) goto L_0x038a
            r3 = 12
        L_0x038a:
            java.lang.String r12 = "timezone"
            r8.put(r12, r3)     // Catch:{ Exception -> 0x03bd }
            java.lang.String r3 = "timezone"
            long r12 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x03bd }
            r14 = 0
            long r12 = r12 - r9
            java.lang.Long r9 = java.lang.Long.valueOf(r12)     // Catch:{ Exception -> 0x03bd }
            r4.put(r3, r9)     // Catch:{ Exception -> 0x03bd }
            long r9 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x03bd }
            java.lang.String r3 = com.bytedance.common.utility.C9425l.m18654e(r21)     // Catch:{ Exception -> 0x03bd }
            if (r3 == 0) goto L_0x03ad
            java.lang.String r12 = "access"
            r8.put(r12, r3)     // Catch:{ Exception -> 0x03bd }
        L_0x03ad:
            java.lang.String r3 = "access"
            long r12 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x03bd }
            r14 = 0
            long r12 = r12 - r9
            java.lang.Long r9 = java.lang.Long.valueOf(r12)     // Catch:{ Exception -> 0x03bd }
            r4.put(r3, r9)     // Catch:{ Exception -> 0x03bd }
            goto L_0x03c2
        L_0x03bd:
            r0 = move-exception
            r3 = r0
            m46181a(r3)
        L_0x03c2:
            long r9 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x03e9 }
            java.lang.String r3 = com.p683ss.android.common.applog.NetUtil.getAliyunUuid()     // Catch:{ Exception -> 0x03e9 }
            boolean r3 = com.bytedance.common.utility.C9431p.m18664a(r3)     // Catch:{ Exception -> 0x03e9 }
            if (r3 != 0) goto L_0x03d9
            java.lang.String r3 = "aliyun_uuid"
            java.lang.String r12 = com.p683ss.android.common.applog.NetUtil.getAliyunUuid()     // Catch:{ Exception -> 0x03e9 }
            r8.put(r3, r12)     // Catch:{ Exception -> 0x03e9 }
        L_0x03d9:
            java.lang.String r3 = "aliyun_uuid"
            long r12 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x03e9 }
            r14 = 0
            long r12 = r12 - r9
            java.lang.Long r9 = java.lang.Long.valueOf(r12)     // Catch:{ Exception -> 0x03e9 }
            r4.put(r3, r9)     // Catch:{ Exception -> 0x03e9 }
            goto L_0x03ee
        L_0x03e9:
            r0 = move-exception
            r3 = r0
            m46181a(r3)
        L_0x03ee:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r3 = f52325o     // Catch:{ Exception -> 0x0424 }
            boolean r3 = r3.isEmpty()     // Catch:{ Exception -> 0x0424 }
            if (r3 != 0) goto L_0x041c
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r3 = f52325o     // Catch:{ Exception -> 0x0424 }
            java.util.Set r3 = r3.entrySet()     // Catch:{ Exception -> 0x0424 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Exception -> 0x0424 }
        L_0x0400:
            boolean r9 = r3.hasNext()     // Catch:{ Exception -> 0x0424 }
            if (r9 == 0) goto L_0x041c
            java.lang.Object r9 = r3.next()     // Catch:{ Exception -> 0x0424 }
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9     // Catch:{ Exception -> 0x0424 }
            if (r9 == 0) goto L_0x0400
            java.lang.Object r10 = r9.getKey()     // Catch:{ Exception -> 0x0424 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x0424 }
            java.lang.Object r9 = r9.getValue()     // Catch:{ Exception -> 0x0424 }
            r8.put(r10, r9)     // Catch:{ Exception -> 0x0424 }
            goto L_0x0400
        L_0x041c:
            java.lang.String r3 = "not_request_sender"
            boolean r9 = f52326p     // Catch:{ Exception -> 0x0424 }
            r8.put(r3, r9)     // Catch:{ Exception -> 0x0424 }
            goto L_0x0429
        L_0x0424:
            r0 = move-exception
            r3 = r0
            m46181a(r3)
        L_0x0429:
            long r9 = android.os.SystemClock.uptimeMillis()
            java.lang.String r3 = "phone"
            java.lang.Object r3 = r1.getSystemService(r3)     // Catch:{ Exception -> 0x0454 }
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3     // Catch:{ Exception -> 0x0454 }
            java.lang.String r12 = r3.getNetworkOperatorName()     // Catch:{ Exception -> 0x0454 }
            java.lang.String r3 = r3.getNetworkOperator()     // Catch:{ Exception -> 0x0454 }
            boolean r13 = com.bytedance.common.utility.C9431p.m18664a(r12)     // Catch:{ Exception -> 0x0454 }
            if (r13 != 0) goto L_0x0448
            java.lang.String r13 = "carrier"
            r8.put(r13, r12)     // Catch:{ Exception -> 0x0454 }
        L_0x0448:
            boolean r12 = com.bytedance.common.utility.C9431p.m18664a(r3)     // Catch:{ Exception -> 0x0454 }
            if (r12 != 0) goto L_0x0459
            java.lang.String r12 = "mcc_mnc"
            r8.put(r12, r3)     // Catch:{ Exception -> 0x0454 }
            goto L_0x0459
        L_0x0454:
            r0 = move-exception
            r3 = r0
            m46181a(r3)
        L_0x0459:
            java.lang.String r3 = "carrier"
            long r12 = android.os.SystemClock.uptimeMillis()
            long r12 = r12 - r9
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r4.put(r3, r12)
            java.lang.String r3 = "mcc_mnc"
            long r12 = android.os.SystemClock.uptimeMillis()
            long r12 = r12 - r9
            java.lang.Long r9 = java.lang.Long.valueOf(r12)
            r4.put(r3, r9)
            long r9 = android.os.SystemClock.uptimeMillis()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            boolean r12 = com.p683ss.android.common.util.C18920g.m46054c()     // Catch:{ Throwable -> 0x04f0 }
            if (r12 == 0) goto L_0x048a
            java.lang.String r12 = "MIUI-"
            r3.append(r12)     // Catch:{ Throwable -> 0x04f0 }
            goto L_0x04d7
        L_0x048a:
            boolean r12 = com.p683ss.android.common.util.C18920g.m46057d()     // Catch:{ Throwable -> 0x04f0 }
            if (r12 == 0) goto L_0x0496
            java.lang.String r12 = "FLYME-"
            r3.append(r12)     // Catch:{ Throwable -> 0x04f0 }
            goto L_0x04d7
        L_0x0496:
            java.lang.String r12 = com.p683ss.android.common.util.C18920g.m46050b()     // Catch:{ Throwable -> 0x04f0 }
            boolean r13 = android.text.TextUtils.isEmpty(r12)     // Catch:{ Throwable -> 0x04f0 }
            if (r13 == 0) goto L_0x04a5
            java.lang.String r13 = com.p683ss.android.common.util.C18920g.m46050b()     // Catch:{ Throwable -> 0x04f0 }
            goto L_0x04a6
        L_0x04a5:
            r13 = r12
        L_0x04a6:
            boolean r14 = android.text.TextUtils.isEmpty(r13)     // Catch:{ Throwable -> 0x04f0 }
            if (r14 != 0) goto L_0x04b9
            java.lang.String r13 = r13.toLowerCase()     // Catch:{ Throwable -> 0x04f0 }
            java.lang.String r14 = "emotionui"
            boolean r13 = r13.startsWith(r14)     // Catch:{ Throwable -> 0x04f0 }
            if (r13 == 0) goto L_0x04b9
            goto L_0x04bf
        L_0x04b9:
            boolean r13 = com.p683ss.android.common.util.C18920g.m46047a()     // Catch:{ Throwable -> 0x04f0 }
            if (r13 == 0) goto L_0x04c1
        L_0x04bf:
            r13 = 1
            goto L_0x04c2
        L_0x04c1:
            r13 = 0
        L_0x04c2:
            if (r13 == 0) goto L_0x04c9
            java.lang.String r13 = "EMUI-"
            r3.append(r13)     // Catch:{ Throwable -> 0x04f0 }
        L_0x04c9:
            boolean r13 = android.text.TextUtils.isEmpty(r12)     // Catch:{ Throwable -> 0x04f0 }
            if (r13 != 0) goto L_0x04d7
            r3.append(r12)     // Catch:{ Throwable -> 0x04f0 }
            java.lang.String r12 = "-"
            r3.append(r12)     // Catch:{ Throwable -> 0x04f0 }
        L_0x04d7:
            java.lang.String r12 = android.os.Build.VERSION.INCREMENTAL     // Catch:{ Throwable -> 0x04f0 }
            r3.append(r12)     // Catch:{ Throwable -> 0x04f0 }
            int r12 = r3.length()     // Catch:{ Throwable -> 0x04f0 }
            if (r12 <= 0) goto L_0x04f5
            java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x04f0 }
            f52329s = r3     // Catch:{ Throwable -> 0x04f0 }
            java.lang.String r3 = "rom"
            java.lang.String r12 = f52329s     // Catch:{ Throwable -> 0x04f0 }
            r8.put(r3, r12)     // Catch:{ Throwable -> 0x04f0 }
            goto L_0x04f5
        L_0x04f0:
            r0 = move-exception
            r3 = r0
            m46181a(r3)
        L_0x04f5:
            java.lang.String r3 = "rom"
            long r12 = android.os.SystemClock.uptimeMillis()
            long r12 = r12 - r9
            java.lang.Long r9 = java.lang.Long.valueOf(r12)
            r4.put(r3, r9)
            long r9 = android.os.SystemClock.uptimeMillis()
            boolean r3 = com.p683ss.android.common.util.C18920g.m46054c()     // Catch:{ Throwable -> 0x06c0 }
            if (r3 == 0) goto L_0x0537
            boolean r3 = com.p683ss.android.common.util.C18920g.m46054c()     // Catch:{ Throwable -> 0x06c0 }
            if (r3 == 0) goto L_0x0533
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x06c0 }
            java.lang.String r12 = "miui_"
            r3.<init>(r12)     // Catch:{ Throwable -> 0x06c0 }
            java.lang.String r12 = "ro.miui.ui.version.name"
            java.lang.String r12 = com.p683ss.android.deviceregister.p1158c.C19033d.m46311a(r12)     // Catch:{ Throwable -> 0x06c0 }
            r3.append(r12)     // Catch:{ Throwable -> 0x06c0 }
            java.lang.String r12 = "_"
            r3.append(r12)     // Catch:{ Throwable -> 0x06c0 }
            java.lang.String r12 = android.os.Build.VERSION.INCREMENTAL     // Catch:{ Throwable -> 0x06c0 }
            r3.append(r12)     // Catch:{ Throwable -> 0x06c0 }
            java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x06c0 }
            goto L_0x06b4
        L_0x0533:
            java.lang.String r3 = ""
            goto L_0x06b4
        L_0x0537:
            boolean r3 = com.p683ss.android.common.util.C18920g.m46057d()     // Catch:{ Throwable -> 0x06c0 }
            if (r3 == 0) goto L_0x0553
            java.lang.String r3 = android.os.Build.DISPLAY     // Catch:{ Throwable -> 0x06c0 }
            if (r3 == 0) goto L_0x054f
            java.lang.String r12 = r3.toLowerCase()     // Catch:{ Throwable -> 0x06c0 }
            java.lang.String r13 = "flyme"
            boolean r12 = r12.contains(r13)     // Catch:{ Throwable -> 0x06c0 }
            if (r12 == 0) goto L_0x054f
            goto L_0x06b4
        L_0x054f:
            java.lang.String r3 = ""
            goto L_0x06b4
        L_0x0553:
            boolean r3 = com.p683ss.android.deviceregister.p1158c.C19032c.m46310a()     // Catch:{ Throwable -> 0x06c0 }
            if (r3 == 0) goto L_0x0583
            boolean r3 = com.p683ss.android.deviceregister.p1158c.C19032c.m46310a()     // Catch:{ Throwable -> 0x06c0 }
            if (r3 == 0) goto L_0x057f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x06c0 }
            java.lang.String r12 = "coloros_"
            r3.<init>(r12)     // Catch:{ Throwable -> 0x06c0 }
            java.lang.String r12 = "ro.build.version.opporom"
            java.lang.String r12 = com.p683ss.android.deviceregister.p1158c.C19033d.m46311a(r12)     // Catch:{ Throwable -> 0x06c0 }
            r3.append(r12)     // Catch:{ Throwable -> 0x06c0 }
            java.lang.String r12 = "_"
            r3.append(r12)     // Catch:{ Throwable -> 0x06c0 }
            java.lang.String r12 = android.os.Build.DISPLAY     // Catch:{ Throwable -> 0x06c0 }
            r3.append(r12)     // Catch:{ Throwable -> 0x06c0 }
            java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x06c0 }
            goto L_0x06b4
        L_0x057f:
            java.lang.String r3 = ""
            goto L_0x06b4
        L_0x0583:
            java.lang.String r3 = com.p683ss.android.common.util.C18920g.m46050b()     // Catch:{ Throwable -> 0x06c0 }
            if (r3 == 0) goto L_0x05ac
            java.lang.String r12 = r3.toLowerCase()     // Catch:{ Throwable -> 0x06c0 }
            java.lang.String r13 = "emotionui"
            boolean r12 = r12.contains(r13)     // Catch:{ Throwable -> 0x06c0 }
            if (r12 == 0) goto L_0x05ac
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x06c0 }
            r12.<init>()     // Catch:{ Throwable -> 0x06c0 }
            r12.append(r3)     // Catch:{ Throwable -> 0x06c0 }
            java.lang.String r3 = "_"
            r12.append(r3)     // Catch:{ Throwable -> 0x06c0 }
            java.lang.String r3 = android.os.Build.DISPLAY     // Catch:{ Throwable -> 0x06c0 }
            r12.append(r3)     // Catch:{ Throwable -> 0x06c0 }
            java.lang.String r3 = r12.toString()     // Catch:{ Throwable -> 0x06c0 }
            goto L_0x05ae
        L_0x05ac:
            java.lang.String r3 = ""
        L_0x05ae:
            boolean r12 = com.bytedance.common.utility.C9431p.m18664a(r3)     // Catch:{ Throwable -> 0x06c0 }
            if (r12 != 0) goto L_0x05b6
            goto L_0x06b4
        L_0x05b6:
            java.lang.String r3 = "ro.vivo.os.build.display.id"
            java.lang.String r3 = com.p683ss.android.deviceregister.p1158c.C19033d.m46311a(r3)     // Catch:{ Throwable -> 0x06c0 }
            boolean r12 = com.bytedance.common.utility.C9431p.m18664a(r3)     // Catch:{ Throwable -> 0x06c0 }
            if (r12 != 0) goto L_0x05d0
            java.lang.String r3 = r3.toLowerCase()     // Catch:{ Throwable -> 0x06c0 }
            java.lang.CharSequence r12 = com.p683ss.android.deviceregister.p1158c.C19032c.f52403b     // Catch:{ Throwable -> 0x06c0 }
            boolean r3 = r3.contains(r12)     // Catch:{ Throwable -> 0x06c0 }
            if (r3 == 0) goto L_0x05d0
            r3 = 1
            goto L_0x05d1
        L_0x05d0:
            r3 = 0
        L_0x05d1:
            if (r3 == 0) goto L_0x05f5
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x06c0 }
            r3.<init>()     // Catch:{ Throwable -> 0x06c0 }
            java.lang.String r12 = "ro.vivo.os.build.display.id"
            java.lang.String r12 = com.p683ss.android.deviceregister.p1158c.C19033d.m46311a(r12)     // Catch:{ Throwable -> 0x06c0 }
            r3.append(r12)     // Catch:{ Throwable -> 0x06c0 }
            java.lang.String r12 = "_"
            r3.append(r12)     // Catch:{ Throwable -> 0x06c0 }
            java.lang.String r12 = "ro.vivo.product.version"
            java.lang.String r12 = com.p683ss.android.deviceregister.p1158c.C19033d.m46311a(r12)     // Catch:{ Throwable -> 0x06c0 }
            r3.append(r12)     // Catch:{ Throwable -> 0x06c0 }
            java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x06c0 }
            goto L_0x06b4
        L_0x05f5:
            java.lang.String r3 = android.os.Build.DISPLAY     // Catch:{ Throwable -> 0x06c0 }
            boolean r3 = com.bytedance.common.utility.C9431p.m18664a(r3)     // Catch:{ Throwable -> 0x06c0 }
            if (r3 != 0) goto L_0x060d
            java.lang.String r3 = android.os.Build.DISPLAY     // Catch:{ Throwable -> 0x06c0 }
            java.lang.String r3 = r3.toLowerCase()     // Catch:{ Throwable -> 0x06c0 }
            java.lang.CharSequence r12 = com.p683ss.android.deviceregister.p1158c.C19032c.f52402a     // Catch:{ Throwable -> 0x06c0 }
            boolean r3 = r3.contains(r12)     // Catch:{ Throwable -> 0x06c0 }
            if (r3 == 0) goto L_0x060d
            r3 = 1
            goto L_0x060e
        L_0x060d:
            r3 = 0
        L_0x060e:
            if (r3 == 0) goto L_0x062e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x06c0 }
            r3.<init>()     // Catch:{ Throwable -> 0x06c0 }
            java.lang.String r12 = android.os.Build.DISPLAY     // Catch:{ Throwable -> 0x06c0 }
            r3.append(r12)     // Catch:{ Throwable -> 0x06c0 }
            java.lang.String r12 = "_"
            r3.append(r12)     // Catch:{ Throwable -> 0x06c0 }
            java.lang.String r12 = "ro.gn.sv.version"
            java.lang.String r12 = com.p683ss.android.deviceregister.p1158c.C19033d.m46311a(r12)     // Catch:{ Throwable -> 0x06c0 }
            r3.append(r12)     // Catch:{ Throwable -> 0x06c0 }
            java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x06c0 }
            goto L_0x06b4
        L_0x062e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x06c0 }
            r3.<init>()     // Catch:{ Throwable -> 0x06c0 }
            java.lang.String r12 = android.os.Build.MANUFACTURER     // Catch:{ Throwable -> 0x06c0 }
            r3.append(r12)     // Catch:{ Throwable -> 0x06c0 }
            java.lang.String r12 = android.os.Build.BRAND     // Catch:{ Throwable -> 0x06c0 }
            r3.append(r12)     // Catch:{ Throwable -> 0x06c0 }
            java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x06c0 }
            boolean r12 = com.bytedance.common.utility.C9431p.m18664a(r3)     // Catch:{ Throwable -> 0x06c0 }
            if (r12 != 0) goto L_0x065d
            java.lang.String r3 = r3.toLowerCase()     // Catch:{ Throwable -> 0x06c0 }
            java.lang.String r12 = "360"
            boolean r12 = r3.contains(r12)     // Catch:{ Throwable -> 0x06c0 }
            if (r12 != 0) goto L_0x065b
            java.lang.String r12 = "qiku"
            boolean r3 = r3.contains(r12)     // Catch:{ Throwable -> 0x06c0 }
            if (r3 == 0) goto L_0x065d
        L_0x065b:
            r3 = 1
            goto L_0x065e
        L_0x065d:
            r3 = 0
        L_0x065e:
            if (r3 == 0) goto L_0x067d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x06c0 }
            r3.<init>()     // Catch:{ Throwable -> 0x06c0 }
            java.lang.String r12 = "ro.build.uiversion"
            java.lang.String r12 = com.p683ss.android.deviceregister.p1158c.C19033d.m46311a(r12)     // Catch:{ Throwable -> 0x06c0 }
            r3.append(r12)     // Catch:{ Throwable -> 0x06c0 }
            java.lang.String r12 = "_"
            r3.append(r12)     // Catch:{ Throwable -> 0x06c0 }
            java.lang.String r12 = android.os.Build.DISPLAY     // Catch:{ Throwable -> 0x06c0 }
            r3.append(r12)     // Catch:{ Throwable -> 0x06c0 }
            java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x06c0 }
            goto L_0x06b4
        L_0x067d:
            java.lang.String r3 = "ro.letv.release.version"
            java.lang.String r3 = com.p683ss.android.deviceregister.p1158c.C19033d.m46311a(r3)     // Catch:{ Throwable -> 0x06c0 }
            boolean r3 = com.bytedance.common.utility.C9431p.m18664a(r3)     // Catch:{ Throwable -> 0x06c0 }
            r3 = r3 ^ r5
            if (r3 == 0) goto L_0x06a9
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x06c0 }
            java.lang.String r12 = "eui_"
            r3.<init>(r12)     // Catch:{ Throwable -> 0x06c0 }
            java.lang.String r12 = "ro.letv.release.version"
            java.lang.String r12 = com.p683ss.android.deviceregister.p1158c.C19033d.m46311a(r12)     // Catch:{ Throwable -> 0x06c0 }
            r3.append(r12)     // Catch:{ Throwable -> 0x06c0 }
            java.lang.String r12 = "_"
            r3.append(r12)     // Catch:{ Throwable -> 0x06c0 }
            java.lang.String r12 = android.os.Build.DISPLAY     // Catch:{ Throwable -> 0x06c0 }
            r3.append(r12)     // Catch:{ Throwable -> 0x06c0 }
            java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x06c0 }
            goto L_0x06ab
        L_0x06a9:
            java.lang.String r3 = ""
        L_0x06ab:
            boolean r12 = com.bytedance.common.utility.C9431p.m18664a(r3)     // Catch:{ Throwable -> 0x06c0 }
            if (r12 != 0) goto L_0x06b2
            goto L_0x06b4
        L_0x06b2:
            java.lang.String r3 = android.os.Build.DISPLAY     // Catch:{ Throwable -> 0x06c0 }
        L_0x06b4:
            boolean r12 = com.bytedance.common.utility.C9431p.m18664a(r3)     // Catch:{ Throwable -> 0x06c0 }
            if (r12 != 0) goto L_0x06c5
            java.lang.String r12 = "rom_version"
            r8.put(r12, r3)     // Catch:{ Throwable -> 0x06c0 }
            goto L_0x06c5
        L_0x06c0:
            r0 = move-exception
            r3 = r0
            m46181a(r3)
        L_0x06c5:
            java.lang.String r3 = "rom_version"
            long r12 = android.os.SystemClock.uptimeMillis()
            long r12 = r12 - r9
            java.lang.Long r9 = java.lang.Long.valueOf(r12)
            r4.put(r3, r9)
            long r9 = android.os.SystemClock.uptimeMillis()
            java.lang.String r3 = m46179a(r21)
            if (r3 == 0) goto L_0x06e4
            java.lang.String r12 = "sig_hash"
            r8.put(r12, r3)     // Catch:{ JSONException -> 0x06e3 }
            goto L_0x06e4
        L_0x06e3:
        L_0x06e4:
            java.lang.String r3 = "sig_hash"
            long r12 = android.os.SystemClock.uptimeMillis()
            long r12 = r12 - r9
            java.lang.Long r9 = java.lang.Long.valueOf(r12)
            r4.put(r3, r9)
            long r9 = android.os.SystemClock.uptimeMillis()
            android.content.SharedPreferences r3 = com.p683ss.android.deviceregister.p1154a.C19002a.m46174a(r21)
            java.lang.String r12 = "mac_addr"
            r13 = 0
            java.lang.String r12 = r3.getString(r12, r13)
            java.lang.String r14 = "google_aid"
            java.lang.String r14 = r3.getString(r14, r13)
            java.lang.String r15 = "app_language"
            java.lang.String r15 = r3.getString(r15, r13)
            java.lang.String r11 = "app_region"
            java.lang.String r11 = r3.getString(r11, r13)
            boolean r16 = com.bytedance.common.utility.C9431p.m18664a(r12)
            if (r16 == 0) goto L_0x0723
            java.lang.String r12 = f52324n
            boolean r12 = com.bytedance.common.utility.C9431p.m18664a(r12)
            if (r12 != 0) goto L_0x073e
        L_0x0721:
            r12 = 1
            goto L_0x073f
        L_0x0723:
            java.lang.String r16 = f52324n
            boolean r16 = com.bytedance.common.utility.C9431p.m18664a(r16)
            if (r16 == 0) goto L_0x0735
            f52324n = r12
            java.lang.String r12 = "mc"
            java.lang.String r13 = f52324n     // Catch:{ JSONException -> 0x073e }
            r8.put(r12, r13)     // Catch:{ JSONException -> 0x073e }
            goto L_0x073e
        L_0x0735:
            java.lang.String r13 = f52324n
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L_0x073e
            goto L_0x0721
        L_0x073e:
            r12 = 0
        L_0x073f:
            boolean r13 = com.p683ss.android.deviceregister.C19034d.m46327f()     // Catch:{ Throwable -> 0x080f }
            if (r13 == 0) goto L_0x0750
            java.lang.String r13 = com.p683ss.android.deviceregister.p1158c.C19031b.m46309c(r21)     // Catch:{ Throwable -> 0x074a }
            goto L_0x0751
        L_0x074a:
            r0 = move-exception
            r2 = r0
            r17 = r6
            goto L_0x0813
        L_0x0750:
            r13 = 0
        L_0x0751:
            boolean r16 = com.bytedance.common.utility.C9431p.m18664a(r13)     // Catch:{ Throwable -> 0x080f }
            if (r16 == 0) goto L_0x075b
            java.lang.String r13 = com.p683ss.android.C18841b.m45928a()     // Catch:{ Throwable -> 0x074a }
        L_0x075b:
            java.lang.String r5 = com.p683ss.android.C18841b.m45929b()     // Catch:{ Throwable -> 0x080f }
            java.lang.String r2 = com.p683ss.android.C18841b.m45930c()     // Catch:{ Throwable -> 0x080f }
            boolean r16 = com.bytedance.common.utility.C9431p.m18664a(r13)     // Catch:{ Throwable -> 0x080f }
            if (r16 != 0) goto L_0x0772
            boolean r16 = r13.equals(r14)     // Catch:{ Throwable -> 0x074a }
            if (r16 != 0) goto L_0x0772
            r14 = r13
            r13 = 1
            goto L_0x0773
        L_0x0772:
            r13 = 0
        L_0x0773:
            boolean r16 = com.bytedance.common.utility.C9431p.m18664a(r14)     // Catch:{ Throwable -> 0x080f }
            if (r16 != 0) goto L_0x0784
            r17 = r6
            java.lang.String r6 = "google_aid"
            r8.put(r6, r14)     // Catch:{ Throwable -> 0x0781 }
            goto L_0x0786
        L_0x0781:
            r0 = move-exception
            goto L_0x0812
        L_0x0784:
            r17 = r6
        L_0x0786:
            java.lang.String r6 = "google_aid"
            long r19 = android.os.SystemClock.uptimeMillis()     // Catch:{ Throwable -> 0x0781 }
            r7 = 0
            long r19 = r19 - r9
            java.lang.Long r7 = java.lang.Long.valueOf(r19)     // Catch:{ Throwable -> 0x0781 }
            r4.put(r6, r7)     // Catch:{ Throwable -> 0x0781 }
            boolean r6 = com.bytedance.common.utility.C9431p.m18664a(r5)     // Catch:{ Throwable -> 0x0781 }
            if (r6 != 0) goto L_0x07a5
            boolean r6 = r5.equals(r15)     // Catch:{ Throwable -> 0x0781 }
            if (r6 != 0) goto L_0x07a5
            r15 = r5
            r5 = 1
            goto L_0x07a6
        L_0x07a5:
            r5 = 0
        L_0x07a6:
            boolean r6 = com.bytedance.common.utility.C9431p.m18664a(r15)     // Catch:{ Throwable -> 0x0781 }
            if (r6 != 0) goto L_0x07b1
            java.lang.String r6 = "app_language"
            r8.put(r6, r15)     // Catch:{ Throwable -> 0x0781 }
        L_0x07b1:
            java.lang.String r6 = "app_language"
            long r19 = android.os.SystemClock.uptimeMillis()     // Catch:{ Throwable -> 0x0781 }
            r7 = 0
            long r19 = r19 - r9
            java.lang.Long r7 = java.lang.Long.valueOf(r19)     // Catch:{ Throwable -> 0x0781 }
            r4.put(r6, r7)     // Catch:{ Throwable -> 0x0781 }
            boolean r6 = com.bytedance.common.utility.C9431p.m18664a(r2)     // Catch:{ Throwable -> 0x0781 }
            if (r6 != 0) goto L_0x07cf
            boolean r6 = r2.equals(r11)     // Catch:{ Throwable -> 0x0781 }
            if (r6 != 0) goto L_0x07cf
            r6 = 1
            goto L_0x07d1
        L_0x07cf:
            r2 = r11
            r6 = 0
        L_0x07d1:
            boolean r7 = com.bytedance.common.utility.C9431p.m18664a(r2)     // Catch:{ Throwable -> 0x0781 }
            if (r7 != 0) goto L_0x07dc
            java.lang.String r7 = "app_region"
            r8.put(r7, r2)     // Catch:{ Throwable -> 0x0781 }
        L_0x07dc:
            java.lang.String r7 = "app_region"
            long r19 = android.os.SystemClock.uptimeMillis()     // Catch:{ Throwable -> 0x0781 }
            r11 = 0
            long r19 = r19 - r9
            java.lang.Long r9 = java.lang.Long.valueOf(r19)     // Catch:{ Throwable -> 0x0781 }
            r4.put(r7, r9)     // Catch:{ Throwable -> 0x0781 }
            android.content.SharedPreferences$Editor r7 = r3.edit()     // Catch:{ Throwable -> 0x0781 }
            if (r13 == 0) goto L_0x07f7
            java.lang.String r9 = "google_aid"
            r7.putString(r9, r14)     // Catch:{ Throwable -> 0x0781 }
        L_0x07f7:
            if (r5 == 0) goto L_0x07fe
            java.lang.String r9 = "app_language"
            r7.putString(r9, r15)     // Catch:{ Throwable -> 0x0781 }
        L_0x07fe:
            if (r6 == 0) goto L_0x0805
            java.lang.String r9 = "app_region"
            r7.putString(r9, r2)     // Catch:{ Throwable -> 0x0781 }
        L_0x0805:
            if (r5 != 0) goto L_0x080b
            if (r6 != 0) goto L_0x080b
            if (r13 == 0) goto L_0x0816
        L_0x080b:
            r7.commit()     // Catch:{ Throwable -> 0x0781 }
            goto L_0x0816
        L_0x080f:
            r0 = move-exception
            r17 = r6
        L_0x0812:
            r2 = r0
        L_0x0813:
            m46181a(r2)
        L_0x0816:
            if (r12 == 0) goto L_0x0826
            android.content.SharedPreferences$Editor r2 = r3.edit()
            java.lang.String r5 = "mac_addr"
            java.lang.String r6 = f52324n
            r2.putString(r5, r6)
            r2.commit()
        L_0x0826:
            long r5 = android.os.SystemClock.uptimeMillis()
            java.lang.String r2 = "app_track"
            java.lang.String r7 = ""
            java.lang.String r2 = r3.getString(r2, r7)
            f52330t = r2
            java.lang.String r2 = f52330t     // Catch:{ Throwable -> 0x0849 }
            boolean r2 = com.bytedance.common.utility.C9431p.m18664a(r2)     // Catch:{ Throwable -> 0x0849 }
            if (r2 != 0) goto L_0x084e
            java.lang.String r2 = "app_track"
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0849 }
            java.lang.String r7 = f52330t     // Catch:{ Throwable -> 0x0849 }
            r3.<init>(r7)     // Catch:{ Throwable -> 0x0849 }
            r8.put(r2, r3)     // Catch:{ Throwable -> 0x0849 }
            goto L_0x084e
        L_0x0849:
            r0 = move-exception
            r2 = r0
            m46181a(r2)
        L_0x084e:
            java.lang.String r2 = "app_track"
            long r9 = android.os.SystemClock.uptimeMillis()
            long r9 = r9 - r5
            java.lang.Long r3 = java.lang.Long.valueOf(r9)
            r4.put(r2, r3)
            com.ss.android.deviceregister.b.b r2 = f52318h
            if (r2 == 0) goto L_0x0971
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x096c }
            com.ss.android.deviceregister.b.b r5 = f52318h     // Catch:{ Exception -> 0x096c }
            java.lang.String r5 = r5.mo38883a()     // Catch:{ Exception -> 0x096c }
            boolean r6 = com.bytedance.common.utility.C9431p.m18664a(r5)     // Catch:{ Exception -> 0x096c }
            if (r6 != 0) goto L_0x0875
            java.lang.String r6 = "device_id"
            r8.put(r6, r5)     // Catch:{ Exception -> 0x096c }
        L_0x0875:
            java.lang.String r5 = "device_id"
            long r6 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x096c }
            r9 = 0
            long r6 = r6 - r2
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x096c }
            r4.put(r5, r2)     // Catch:{ Exception -> 0x096c }
            com.ss.android.deviceregister.b.b r2 = f52318h     // Catch:{ Exception -> 0x096c }
            java.lang.String r2 = r2.mo38885c()     // Catch:{ Exception -> 0x096c }
            boolean r3 = com.bytedance.common.utility.C9431p.m18664a(r2)     // Catch:{ Exception -> 0x096c }
            if (r3 != 0) goto L_0x0895
            java.lang.String r3 = "openudid"
            r8.put(r3, r2)     // Catch:{ Exception -> 0x096c }
        L_0x0895:
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x096c }
            com.ss.android.deviceregister.b.b r5 = f52318h     // Catch:{ Exception -> 0x096c }
            java.lang.String r5 = r5.f52386q     // Catch:{ Exception -> 0x096c }
            boolean r6 = com.bytedance.common.utility.C9431p.m18664a(r5)     // Catch:{ Exception -> 0x096c }
            if (r6 != 0) goto L_0x08a8
            java.lang.String r6 = "install_id"
            r8.put(r6, r5)     // Catch:{ Exception -> 0x096c }
        L_0x08a8:
            java.lang.String r5 = "install_id"
            long r6 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x096c }
            r9 = 0
            long r6 = r6 - r2
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x096c }
            r4.put(r5, r2)     // Catch:{ Exception -> 0x096c }
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x096c }
            com.ss.android.deviceregister.b.b r5 = f52318h     // Catch:{ Exception -> 0x096c }
            com.ss.android.deviceregister.b.a.a r5 = r5.f52379i     // Catch:{ Exception -> 0x096c }
            java.lang.String r5 = r5.mo38859d()     // Catch:{ Exception -> 0x096c }
            boolean r6 = com.bytedance.common.utility.C9431p.m18664a(r5)     // Catch:{ Exception -> 0x096c }
            if (r6 != 0) goto L_0x08ce
            java.lang.String r6 = "udid"
            r8.put(r6, r5)     // Catch:{ Exception -> 0x096c }
        L_0x08ce:
            java.lang.String r5 = "udid"
            long r6 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x096c }
            r9 = 0
            long r6 = r6 - r2
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x096c }
            r4.put(r5, r2)     // Catch:{ Exception -> 0x096c }
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x096c }
            com.ss.android.deviceregister.b.b r5 = f52318h     // Catch:{ Exception -> 0x096c }
            java.lang.String r5 = r5.mo38886d()     // Catch:{ Exception -> 0x096c }
            boolean r6 = com.bytedance.common.utility.C9431p.m18664a(r5)     // Catch:{ Exception -> 0x096c }
            if (r6 != 0) goto L_0x08f2
            java.lang.String r6 = "clientudid"
            r8.put(r6, r5)     // Catch:{ Exception -> 0x096c }
        L_0x08f2:
            java.lang.String r5 = "clientudid"
            long r6 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x096c }
            r9 = 0
            long r6 = r6 - r2
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x096c }
            r4.put(r5, r2)     // Catch:{ Exception -> 0x096c }
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x096c }
            com.ss.android.deviceregister.b.b r5 = f52318h     // Catch:{ Exception -> 0x096c }
            com.ss.android.deviceregister.b.a.a r5 = r5.f52379i     // Catch:{ Exception -> 0x096c }
            java.lang.String r5 = r5.mo38857b()     // Catch:{ Exception -> 0x096c }
            boolean r6 = com.bytedance.common.utility.C9431p.m18664a(r5)     // Catch:{ Exception -> 0x096c }
            if (r6 != 0) goto L_0x0918
            java.lang.String r6 = "serial_number"
            r8.put(r6, r5)     // Catch:{ Exception -> 0x096c }
        L_0x0918:
            java.lang.String r5 = "serial_number"
            long r6 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x096c }
            r9 = 0
            long r6 = r6 - r2
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x096c }
            r4.put(r5, r2)     // Catch:{ Exception -> 0x096c }
            boolean r2 = m46191f()     // Catch:{ Exception -> 0x096c }
            if (r2 == 0) goto L_0x0971
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x096c }
            com.ss.android.deviceregister.b.b r5 = f52318h     // Catch:{ Exception -> 0x096c }
            com.ss.android.deviceregister.b.a.a r5 = r5.f52379i     // Catch:{ Exception -> 0x096c }
            java.lang.String[] r5 = r5.mo38858c()     // Catch:{ Exception -> 0x096c }
            if (r5 == 0) goto L_0x095c
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ Exception -> 0x096c }
            r6.<init>()     // Catch:{ Exception -> 0x096c }
            int r7 = r5.length     // Catch:{ Exception -> 0x096c }
            r9 = 0
        L_0x0942:
            if (r9 >= r7) goto L_0x0957
            r10 = r5[r9]     // Catch:{ Exception -> 0x096c }
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0954 }
            r11.<init>()     // Catch:{ JSONException -> 0x0954 }
            java.lang.String r12 = "sim_serial_number"
            org.json.JSONObject r10 = r11.put(r12, r10)     // Catch:{ JSONException -> 0x0954 }
            r6.put(r10)     // Catch:{ JSONException -> 0x0954 }
        L_0x0954:
            int r9 = r9 + 1
            goto L_0x0942
        L_0x0957:
            java.lang.String r5 = "sim_serial_number"
            r8.put(r5, r6)     // Catch:{ Exception -> 0x096c }
        L_0x095c:
            java.lang.String r5 = "sim_serial_number"
            long r6 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x096c }
            r9 = 0
            long r6 = r6 - r2
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x096c }
            r4.put(r5, r2)     // Catch:{ Exception -> 0x096c }
            goto L_0x0971
        L_0x096c:
            r0 = move-exception
            r2 = r0
            m46181a(r2)
        L_0x0971:
            long r2 = android.os.SystemClock.uptimeMillis()
            boolean r5 = com.p683ss.android.deviceregister.C19034d.m46324c(r21)
            if (r5 == 0) goto L_0x0983
            java.lang.String r5 = "new_user_mode"
            r6 = 1
            r8.put(r5, r6)     // Catch:{ JSONException -> 0x0982 }
            goto L_0x0983
        L_0x0982:
        L_0x0983:
            java.lang.String r5 = "new_user_mode"
            long r6 = android.os.SystemClock.uptimeMillis()
            long r6 = r6 - r2
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            r4.put(r5, r2)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r2 = f52321k
            if (r2 == 0) goto L_0x09c1
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r2 = f52321k
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x099f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x09c1
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r5 = r3.getValue()     // Catch:{ JSONException -> 0x09bf }
            if (r5 == 0) goto L_0x099f
            java.lang.Object r5 = r3.getKey()     // Catch:{ JSONException -> 0x09bf }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ JSONException -> 0x09bf }
            java.lang.Object r3 = r3.getValue()     // Catch:{ JSONException -> 0x09bf }
            r8.put(r5, r3)     // Catch:{ JSONException -> 0x09bf }
            goto L_0x099f
        L_0x09bf:
            goto L_0x099f
        L_0x09c1:
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch:{ Throwable -> 0x0aa5 }
            java.util.Locale r5 = java.util.Locale.getDefault()     // Catch:{ Throwable -> 0x0aa5 }
            java.lang.String r5 = r5.getCountry()     // Catch:{ Throwable -> 0x0aa5 }
            boolean r6 = com.bytedance.common.utility.C9431p.m18664a(r5)     // Catch:{ Throwable -> 0x0aa5 }
            if (r6 != 0) goto L_0x09d8
            java.lang.String r6 = "region"
            r8.put(r6, r5)     // Catch:{ Throwable -> 0x0aa5 }
        L_0x09d8:
            java.lang.String r5 = "region"
            long r6 = android.os.SystemClock.uptimeMillis()     // Catch:{ Throwable -> 0x0aa5 }
            r9 = 0
            long r6 = r6 - r2
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ Throwable -> 0x0aa5 }
            r4.put(r5, r2)     // Catch:{ Throwable -> 0x0aa5 }
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch:{ Throwable -> 0x0aa5 }
            java.util.Calendar r5 = java.util.Calendar.getInstance()     // Catch:{ Throwable -> 0x0aa5 }
            java.util.TimeZone r5 = r5.getTimeZone()     // Catch:{ Throwable -> 0x0aa5 }
            java.lang.String r5 = r5.getID()     // Catch:{ Throwable -> 0x0aa5 }
            boolean r6 = com.bytedance.common.utility.C9431p.m18664a(r5)     // Catch:{ Throwable -> 0x0aa5 }
            if (r6 != 0) goto L_0x0a02
            java.lang.String r6 = "tz_name"
            r8.put(r6, r5)     // Catch:{ Throwable -> 0x0aa5 }
        L_0x0a02:
            java.lang.String r5 = "tz_name"
            long r6 = android.os.SystemClock.uptimeMillis()     // Catch:{ Throwable -> 0x0aa5 }
            r9 = 0
            long r6 = r6 - r2
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ Throwable -> 0x0aa5 }
            r4.put(r5, r2)     // Catch:{ Throwable -> 0x0aa5 }
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch:{ Throwable -> 0x0aa5 }
            java.util.Calendar r5 = java.util.Calendar.getInstance()     // Catch:{ Throwable -> 0x0aa5 }
            java.util.TimeZone r5 = r5.getTimeZone()     // Catch:{ Throwable -> 0x0aa5 }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x0aa5 }
            int r5 = r5.getOffset(r6)     // Catch:{ Throwable -> 0x0aa5 }
            int r5 = r5 / 1000
            java.lang.String r6 = "tz_offset"
            r8.put(r6, r5)     // Catch:{ Throwable -> 0x0aa5 }
            java.lang.String r5 = "tz_offset"
            long r6 = android.os.SystemClock.uptimeMillis()     // Catch:{ Throwable -> 0x0aa5 }
            r9 = 0
            long r6 = r6 - r2
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ Throwable -> 0x0aa5 }
            r4.put(r5, r2)     // Catch:{ Throwable -> 0x0aa5 }
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch:{ Throwable -> 0x0aa5 }
            java.lang.String r5 = "phone"
            java.lang.Object r1 = r1.getSystemService(r5)     // Catch:{ Throwable -> 0x0aa5 }
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1     // Catch:{ Throwable -> 0x0aa5 }
            java.lang.String r1 = r1.getSimCountryIso()     // Catch:{ Throwable -> 0x0aa5 }
            boolean r5 = com.bytedance.common.utility.C9431p.m18664a(r1)     // Catch:{ Throwable -> 0x0aa5 }
            if (r5 != 0) goto L_0x0a56
            java.lang.String r5 = "sim_region"
            r8.put(r5, r1)     // Catch:{ Throwable -> 0x0aa5 }
        L_0x0a56:
            java.lang.String r1 = "sim_region"
            long r5 = android.os.SystemClock.uptimeMillis()     // Catch:{ Throwable -> 0x0aa5 }
            r7 = 0
            long r5 = r5 - r2
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch:{ Throwable -> 0x0aa5 }
            r4.put(r1, r2)     // Catch:{ Throwable -> 0x0aa5 }
            java.lang.String r1 = "header_all"
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch:{ Throwable -> 0x0aa5 }
            r5 = 0
            long r2 = r2 - r17
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ Throwable -> 0x0aa5 }
            r4.put(r1, r2)     // Catch:{ Throwable -> 0x0aa5 }
            com.ss.android.deviceregister.j r1 = com.p683ss.android.deviceregister.C19047j.m46366a()     // Catch:{ Throwable -> 0x0aa5 }
            java.util.concurrent.atomic.AtomicReference<java.util.HashMap<java.lang.String, java.lang.Long>> r1 = r1.f52476d     // Catch:{ Throwable -> 0x0aa5 }
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ Throwable -> 0x0aa5 }
            r2.<init>(r4)     // Catch:{ Throwable -> 0x0aa5 }
            r3 = 0
            boolean r1 = r1.compareAndSet(r3, r2)     // Catch:{ Throwable -> 0x0aa5 }
            if (r1 == 0) goto L_0x0aaa
            com.ss.android.deviceregister.o r1 = com.p683ss.android.deviceregister.C19059m.m46390a()     // Catch:{ Throwable -> 0x0aa5 }
            int r1 = r1.mo38945d()     // Catch:{ Throwable -> 0x0aa5 }
            com.ss.android.deviceregister.k r2 = new com.ss.android.deviceregister.k     // Catch:{ Throwable -> 0x0aa5 }
            r3 = 1
            int r1 = r1 + r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Throwable -> 0x0aa5 }
            r2.<init>(r4, r1)     // Catch:{ Throwable -> 0x0aa5 }
            com.ss.android.deviceregister.o r1 = com.p683ss.android.deviceregister.C19059m.m46390a()     // Catch:{ Throwable -> 0x0aa5 }
            r1.mo38940a(r2)     // Catch:{ Throwable -> 0x0aa5 }
            com.p683ss.android.deviceregister.C19049l.m46380a(r2)     // Catch:{ Throwable -> 0x0aa5 }
            goto L_0x0aaa
        L_0x0aa5:
            r0 = move-exception
            r1 = r0
            m46181a(r1)
        L_0x0aaa:
            java.lang.Object r1 = f52331u
            monitor-enter(r1)
            f52327q = r8     // Catch:{ all -> 0x0ab7 }
            r2 = r22
            m46183a(r8, r2)     // Catch:{ all -> 0x0ab7 }
            monitor-exit(r1)     // Catch:{ all -> 0x0ab7 }
            r1 = 1
            return r1
        L_0x0ab7:
            r0 = move-exception
            r2 = r0
            monitor-exit(r1)     // Catch:{ all -> 0x0ab7 }
            throw r2
        L_0x0abb:
            r0 = move-exception
            r1 = r0
            m46181a(r1)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.deviceregister.p1154a.C19005d.m46185a(android.content.Context, org.json.JSONObject):boolean");
    }

    /* renamed from: f */
    public static boolean m46191f() {
        if (!f52332v) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static int m46188c() {
        if (f52323m <= 0 && f52312b != null) {
            f52323m = f52312b.mo20037k();
        }
        return f52323m;
    }

    /* renamed from: a */
    public static void m46182a(JSONObject jSONObject) {
        if (jSONObject != null && !m46191f()) {
            try {
                jSONObject.remove("sim_serial_number");
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public static String m46187b(Context context) {
        if (C9431p.m18664a(f52317g)) {
            f52317g = C19002a.m46174a(context).getString("user_agent", null);
        }
        return f52317g;
    }

    /* renamed from: a */
    public static String m46179a(Context context) {
        if (C9431p.m18664a(f52328r) && context != null) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
                if (!(packageInfo == null || packageInfo.signatures == null)) {
                    if (packageInfo.signatures.length > 0) {
                        Signature signature = packageInfo.signatures[0];
                        if (signature == null) {
                            return f52328r;
                        }
                        f52328r = C9395d.m18574b(signature.toByteArray());
                    }
                }
                return f52328r;
            } catch (Exception unused) {
            }
        }
        return f52328r;
    }

    /* renamed from: a */
    private static void m46181a(Throwable th) {
        if (f52312b != null) {
            C19004c cVar = f52319i;
            Context d = f52312b.mo20030d();
            if (cVar != null) {
                String stackTraceString = Log.getStackTraceString(th);
                if (!C9431p.m18664a(stackTraceString)) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("stack", stackTraceString);
                    } catch (JSONException unused) {
                    }
                    cVar.onDeviceRegisterEvent(d, "umeng", "device_register", "error", 0, 0, jSONObject);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m46184a(boolean z) {
        f52332v = z;
        if (f52327q != null) {
            synchronized (f52331u) {
                m46182a(f52327q);
            }
        }
    }

    /* renamed from: a */
    public static void m46180a(Context context, String str) {
        try {
            Editor edit = C19002a.m46174a(context).edit();
            edit.putString("app_track", str);
            edit.commit();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static void m46183a(JSONObject jSONObject, JSONObject jSONObject2) {
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            try {
                jSONObject2.put(str, jSONObject.opt(str));
            } catch (JSONException unused) {
            }
        }
    }
}
