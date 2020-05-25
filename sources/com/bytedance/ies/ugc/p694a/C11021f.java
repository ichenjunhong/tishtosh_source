package com.bytedance.ies.ugc.p694a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import java.util.Properties;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.ugc.a.f */
class C11021f {

    /* renamed from: d */
    private static C11021f f29613d;

    /* renamed from: a */
    private Properties f29614a;

    /* renamed from: b */
    private JSONObject f29615b;

    /* renamed from: c */
    private Context f29616c;

    private C11021f(Context context) {
        this.f29616c = context;
        try {
            this.f29615b = m22318b(context);
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    private static String m22319c(Context context) {
        String str;
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo == null) {
                return null;
            }
            str = applicationInfo.sourceDir;
            return str;
        } catch (Throwable unused) {
            str = null;
        }
    }

    /* renamed from: a */
    public static C11021f m22315a(Context context) {
        if (f29613d == null) {
            synchronized (C11021f.class) {
                if (f29613d == null) {
                    f29613d = new C11021f(context);
                }
            }
        }
        return f29613d;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:9|10|(3:12|13|14)|15|16|(2:20|21)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002b */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Object m22316a(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 0
            org.json.JSONObject r1 = r4.f29615b     // Catch:{ Throwable -> 0x000c }
            if (r1 == 0) goto L_0x000c
            org.json.JSONObject r1 = r4.f29615b     // Catch:{ Throwable -> 0x000c }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ Throwable -> 0x000c }
            r0 = r1
        L_0x000c:
            if (r0 == 0) goto L_0x000f
            return r0
        L_0x000f:
            java.util.Properties r1 = r4.f29614a     // Catch:{ Throwable -> 0x003e }
            if (r1 != 0) goto L_0x002b
            java.util.Properties r1 = new java.util.Properties     // Catch:{ Throwable -> 0x003e }
            r1.<init>()     // Catch:{ Throwable -> 0x003e }
            r4.f29614a = r1     // Catch:{ Throwable -> 0x003e }
            java.util.Properties r1 = r4.f29614a     // Catch:{ Exception -> 0x002b }
            android.content.Context r2 = r4.f29616c     // Catch:{ Exception -> 0x002b }
            android.content.res.AssetManager r2 = r2.getAssets()     // Catch:{ Exception -> 0x002b }
            java.lang.String r3 = "ss.properties"
            java.io.InputStream r2 = r2.open(r3)     // Catch:{ Exception -> 0x002b }
            r1.load(r2)     // Catch:{ Exception -> 0x002b }
        L_0x002b:
            java.util.Properties r1 = r4.f29614a     // Catch:{ Throwable -> 0x003e }
            if (r1 == 0) goto L_0x003e
            java.util.Properties r1 = r4.f29614a     // Catch:{ Throwable -> 0x003e }
            boolean r1 = r1.containsKey(r5)     // Catch:{ Throwable -> 0x003e }
            if (r1 == 0) goto L_0x003e
            java.util.Properties r1 = r4.f29614a     // Catch:{ Throwable -> 0x003e }
            java.lang.Object r5 = r1.get(r5)     // Catch:{ Throwable -> 0x003e }
            r0 = r5
        L_0x003e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.p694a.C11021f.m22316a(java.lang.String):java.lang.Object");
    }

    /* renamed from: b */
    private JSONObject m22318b(Context context) {
        try {
            String a = C11007b.m22276a(m22319c(context), 1903654775);
            if (TextUtils.isEmpty(a)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(a);
            if (!m22317a(jSONObject)) {
                return null;
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m22317a(JSONObject jSONObject) {
        try {
            if (!TextUtils.isEmpty(jSONObject.getString("meta_umeng_channel"))) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final String mo19915a(String str, String str2) {
        Object a = m22316a(str);
        if (!(a instanceof String)) {
            return str2;
        }
        return (String) a;
    }
}
