package com.p683ss.android.newmedia.p1195a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11007b;
import java.util.Properties;
import org.json.JSONObject;

/* renamed from: com.ss.android.newmedia.a.c */
public class C19540c {

    /* renamed from: c */
    private static C19540c f53913c;

    /* renamed from: a */
    private Properties f53914a = new Properties();

    /* renamed from: b */
    private JSONObject f53915b;

    /* renamed from: c */
    private static String m47823c(Context context) {
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
    public static C19540c m47819a(Context context) {
        if (f53913c == null) {
            synchronized (C19540c.class) {
                if (f53913c == null) {
                    f53913c = new C19540c(context);
                }
            }
        }
        return f53913c;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C19540c(android.content.Context r3) {
        /*
            r2 = this;
            r2.<init>()
            java.util.Properties r0 = new java.util.Properties
            r0.<init>()
            r2.f53914a = r0
            org.json.JSONObject r0 = r2.m47822b(r3)     // Catch:{ Exception -> 0x0010 }
            r2.f53915b = r0     // Catch:{ Exception -> 0x0010 }
        L_0x0010:
            java.util.Properties r0 = r2.f53914a     // Catch:{ Exception -> 0x0020 }
            android.content.res.AssetManager r3 = r3.getAssets()     // Catch:{ Exception -> 0x0020 }
            java.lang.String r1 = "ss.properties"
            java.io.InputStream r3 = r3.open(r1)     // Catch:{ Exception -> 0x0020 }
            r0.load(r3)     // Catch:{ Exception -> 0x0020 }
            return
        L_0x0020:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.newmedia.p1195a.C19540c.<init>(android.content.Context):void");
    }

    /* renamed from: a */
    private Object m47820a(String str) {
        Object obj;
        try {
            if (this.f53915b != null) {
                obj = this.f53915b.get(str);
            } else if (this.f53914a == null || !this.f53914a.containsKey(str)) {
                obj = null;
            } else {
                obj = this.f53914a.get(str);
            }
            return obj;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    private JSONObject m47822b(Context context) {
        try {
            String a = C11007b.m22276a(m47823c(context), 1903654775);
            if (TextUtils.isEmpty(a)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(a);
            if (!m47821a(jSONObject)) {
                return null;
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m47821a(JSONObject jSONObject) {
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
    public final String mo40795a(String str, String str2) {
        Object a = m47820a(str);
        if (!(a instanceof String)) {
            return str2;
        }
        return (String) a;
    }
}
