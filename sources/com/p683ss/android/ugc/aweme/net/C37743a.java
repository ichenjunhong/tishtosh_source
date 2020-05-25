package com.p683ss.android.ugc.aweme.net;

import android.os.Build;
import android.os.Build.VERSION;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.apm.C8936b;
import com.bytedance.ies.ugc.p694a.C11010c;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.net.a */
public class C37743a {

    /* renamed from: a */
    private static volatile String f96169a = m84252d();

    /* renamed from: b */
    private static Map<String, Integer> f96170b = new HashMap();

    /* renamed from: c */
    private static Map<String, Field> f96171c = new HashMap();

    /* renamed from: d */
    private static volatile String f96172d = null;

    /* renamed from: e */
    private static int m84253e() {
        try {
            if (Process.is64Bit()) {
                return 64;
            }
            return 32;
        } catch (Exception | NoSuchMethodError unused) {
            return 0;
        }
    }

    /* renamed from: g */
    private static boolean m84255g() {
        if (VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static String m84244a() {
        if (f96169a == null) {
            synchronized (C37743a.class) {
                if (f96169a == null) {
                    f96169a = m84252d();
                }
            }
        }
        return f96169a;
    }

    /* renamed from: d */
    private static String m84252d() {
        JSONObject f = m84254f();
        String a = m84245a(f);
        if (a != null) {
            C8936b.m17657a("mira_infer_host_abi", f, (JSONObject) null, (JSONObject) null);
            return a;
        }
        String b = m84250b(f);
        C8936b.m17657a("mira_infer_host_abi", f, (JSONObject) null, (JSONObject) null);
        return b;
    }

    /* renamed from: b */
    public static String m84249b() {
        if (f96172d == null) {
            synchronized (C37743a.class) {
                if (f96172d == null) {
                    f96172d = String.valueOf(m84251c().contains("arm64-v8a"));
                }
            }
        }
        return f96172d;
    }

    /* renamed from: f */
    private static JSONObject m84254f() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("primaryCpuAbi", "0");
            jSONObject.put("processMode", "0");
            jSONObject.put("supportedABI0", "0");
            jSONObject.put("matchCpuAbi", "0");
            jSONObject.put("defaultABI0", "0");
            jSONObject.put("defaultABI", "0");
            jSONObject.put("autoError", "0");
            jSONObject.put("manualError", "0");
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    static {
        f96170b.put("armeabi", Integer.valueOf(32));
        f96170b.put("armeabi-v7a", Integer.valueOf(32));
        f96170b.put("arm64-v8a", Integer.valueOf(64));
        f96170b.put("x86", Integer.valueOf(32));
        f96170b.put("x86_64", Integer.valueOf(64));
        f96170b.put("mips", Integer.valueOf(32));
        f96170b.put("mips64", Integer.valueOf(64));
    }

    /* renamed from: c */
    private static String m84251c() {
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
            TextUtils.isEmpty(sb.toString());
            return sb.toString();
        } catch (Exception unused) {
            return "unknown";
        }
    }

    /* renamed from: a */
    private static String m84245a(JSONObject jSONObject) {
        Object obj;
        boolean z;
        if (m84255g()) {
            try {
                Object a = m84243a((T) C11010c.m22280a().getApplicationInfo(), "target object must not be null");
                Field a2 = m84246a(a.getClass(), "primaryCpuAbi");
                int i = 0;
                boolean z2 = true;
                if (a2 != null) {
                    if (a2 != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String str = "The field must not be null";
                    if (z) {
                        if (!a2.isAccessible()) {
                            a2.setAccessible(true);
                        }
                        obj = a2.get(a);
                    } else {
                        throw new IllegalArgumentException(str);
                    }
                } else {
                    obj = null;
                }
                String str2 = (String) obj;
                m84248a(jSONObject, "primaryCpuAbi", str2);
                if (str2 != null) {
                    if (VERSION.SDK_INT < 23) {
                        z2 = false;
                    }
                    if (z2) {
                        i = m84253e();
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(i);
                    m84248a(jSONObject, "processMode", sb.toString());
                    if (i == 0 || ((Integer) f96170b.get(str2)).intValue() == i) {
                        return str2;
                    }
                }
            } catch (Throwable unused) {
                m84248a(jSONObject, "autoError", "1");
            }
        }
        return null;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x001b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0035 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003b A[Catch:{ Throwable -> 0x006f }] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e A[Catch:{ Throwable -> 0x006f }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0050 A[Catch:{ Throwable -> 0x006f }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005a A[Catch:{ Throwable -> 0x006f }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m84250b(org.json.JSONObject r7) {
        /*
            r0 = 0
            r1 = 0
            android.content.Context r2 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()     // Catch:{ NameNotFoundException -> 0x001b }
            android.content.Context r3 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()     // Catch:{ NameNotFoundException -> 0x001b }
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch:{ NameNotFoundException -> 0x001b }
            java.lang.String r2 = r2.getPackageName()     // Catch:{ NameNotFoundException -> 0x001b }
            android.content.pm.PackageInfo r2 = r3.getPackageInfo(r2, r1)     // Catch:{ NameNotFoundException -> 0x001b }
            android.content.pm.ApplicationInfo r2 = r2.applicationInfo     // Catch:{ NameNotFoundException -> 0x001b }
            java.lang.String r2 = r2.sourceDir     // Catch:{ NameNotFoundException -> 0x001b }
            r0 = r2
        L_0x001b:
            java.util.zip.ZipFile r2 = new java.util.zip.ZipFile     // Catch:{ Throwable -> 0x006f }
            java.io.File r3 = new java.io.File     // Catch:{ Throwable -> 0x006f }
            r3.<init>(r0)     // Catch:{ Throwable -> 0x006f }
            r2.<init>(r3)     // Catch:{ Throwable -> 0x006f }
            java.util.Map r0 = m84247a(r2)     // Catch:{ Throwable -> 0x006f }
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ Throwable -> 0x006f }
            java.util.Set r0 = r0.keySet()     // Catch:{ Throwable -> 0x006f }
            r3.<init>(r0)     // Catch:{ Throwable -> 0x006f }
            r2.close()     // Catch:{ IOException -> 0x0035 }
        L_0x0035:
            boolean r0 = m84255g()     // Catch:{ Throwable -> 0x006f }
            if (r0 == 0) goto L_0x003e
            java.lang.String[] r0 = android.os.Build.SUPPORTED_ABIS     // Catch:{ Throwable -> 0x006f }
            goto L_0x004a
        L_0x003e:
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ Throwable -> 0x006f }
            java.lang.String r2 = android.os.Build.CPU_ABI     // Catch:{ Throwable -> 0x006f }
            r0[r1] = r2     // Catch:{ Throwable -> 0x006f }
            java.lang.String r2 = android.os.Build.CPU_ABI2     // Catch:{ Throwable -> 0x006f }
            r4 = 1
            r0[r4] = r2     // Catch:{ Throwable -> 0x006f }
        L_0x004a:
            boolean r2 = r3.isEmpty()     // Catch:{ Throwable -> 0x006f }
            if (r2 == 0) goto L_0x005a
            java.lang.String r2 = "supportedABI0"
            r3 = r0[r1]     // Catch:{ Throwable -> 0x006f }
            m84248a(r7, r2, r3)     // Catch:{ Throwable -> 0x006f }
            r0 = r0[r1]     // Catch:{ Throwable -> 0x006f }
            return r0
        L_0x005a:
            int r2 = r0.length     // Catch:{ Throwable -> 0x006f }
            r4 = 0
        L_0x005c:
            if (r4 >= r2) goto L_0x0076
            r5 = r0[r4]     // Catch:{ Throwable -> 0x006f }
            boolean r6 = r3.contains(r5)     // Catch:{ Throwable -> 0x006f }
            if (r6 == 0) goto L_0x006c
            java.lang.String r0 = "matchCpuAbi"
            m84248a(r7, r0, r5)     // Catch:{ Throwable -> 0x006f }
            return r5
        L_0x006c:
            int r4 = r4 + 1
            goto L_0x005c
        L_0x006f:
            java.lang.String r0 = "manualError"
            java.lang.String r2 = "1"
            m84248a(r7, r0, r2)
        L_0x0076:
            boolean r0 = m84255g()
            if (r0 == 0) goto L_0x008a
            java.lang.String r0 = "defaultABI0"
            java.lang.String[] r2 = android.os.Build.SUPPORTED_ABIS
            r2 = r2[r1]
            m84248a(r7, r0, r2)
            java.lang.String[] r7 = android.os.Build.SUPPORTED_ABIS
            r7 = r7[r1]
            return r7
        L_0x008a:
            java.lang.String r0 = "defaultABI"
            java.lang.String r1 = android.os.Build.CPU_ABI
            m84248a(r7, r0, r1)
            java.lang.String r7 = android.os.Build.CPU_ABI
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.net.C37743a.m84250b(org.json.JSONObject):java.lang.String");
    }

    /* renamed from: a */
    private static Map<String, List<ZipEntry>> m84247a(ZipFile zipFile) {
        HashMap hashMap = new HashMap();
        Enumeration entries = zipFile.entries();
        Pattern compile = Pattern.compile("^lib/[^/]+/lib[^/]+.so$");
        while (entries.hasMoreElements()) {
            ZipEntry zipEntry = (ZipEntry) entries.nextElement();
            if (!zipEntry.isDirectory() && compile.matcher(zipEntry.getName()).matches()) {
                String[] split = zipEntry.getName().split(File.separator);
                if (split != null && split.length >= 2) {
                    String str = split[split.length - 2];
                    if (f96170b.containsKey(str)) {
                        if (hashMap.get(str) == null) {
                            hashMap.put(str, new LinkedList());
                        }
                        ((List) hashMap.get(str)).add(zipEntry);
                    }
                }
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    private static <T> T m84243a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException(str);
    }

    /* renamed from: a */
    private static Field m84246a(Class<?> cls, String str) {
        Field field;
        Class cls2 = (Class) m84243a((T) cls, "The class must not be null");
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append(cls2.toString());
            sb.append("#");
            sb.append(str);
            String sb2 = sb.toString();
            synchronized (f96171c) {
                field = (Field) f96171c.get(sb2);
            }
            if (field != null) {
                if (!field.isAccessible()) {
                    field.setAccessible(true);
                }
                return field;
            }
            while (cls2 != null) {
                try {
                    Field declaredField = cls2.getDeclaredField(str);
                    if (!declaredField.isAccessible()) {
                        declaredField.setAccessible(true);
                    }
                    synchronized (f96171c) {
                        f96171c.put(sb2, declaredField);
                    }
                    return declaredField;
                } catch (NoSuchFieldException unused) {
                    cls2 = cls2.getSuperclass();
                }
            }
            return null;
        }
        throw new IllegalArgumentException("The field name must not be blank");
    }

    /* renamed from: a */
    private static void m84248a(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (JSONException unused) {
        }
    }
}
