package com.bytedance.crash.p554m;

import android.content.Context;
import android.text.TextUtils;
import com.C2240a;
import com.bytedance.crash.C9616k;
import com.bytedance.crash.p555n.C9695g;
import com.bytedance.crash.p555n.C9705m;
import java.io.File;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.m.a */
public final class C9667a {

    /* renamed from: b */
    private static volatile C9667a f26376b;

    /* renamed from: a */
    public volatile Context f26377a;

    /* renamed from: a */
    public static C9667a m19271a() {
        if (f26376b == null) {
            f26376b = new C9667a(C9616k.m19154f());
        }
        return f26376b;
    }

    private C9667a(Context context) {
        this.f26377a = context;
    }

    /* renamed from: a */
    public final void mo17517a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() > 0) {
            try {
                String b = C9668b.m19292b(C9616k.m19147a().mo17446a());
                String a = C9695g.m19349a(C9705m.m19391a(this.f26377a), C2240a.m6772a("ensure_%s.npth", new Object[]{C9616k.m19152d()}), b, jSONObject, true);
                if (C9668b.m19281a(b, jSONObject.toString(), true).mo17529a()) {
                    C9695g.m19358a(a);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public static String m19274b(JSONObject jSONObject, File file) {
        if (jSONObject == null || jSONObject.length() <= 0) {
            return null;
        }
        try {
            return C9695g.m19349a(file, file.getName(), C9668b.m19285a(C9616k.m19147a().mo17446a()), jSONObject, true);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static String m19275c(JSONObject jSONObject, File file) {
        if (jSONObject == null || jSONObject.length() <= 0) {
            return null;
        }
        try {
            return C9695g.m19349a(file, file.getName(), C9668b.m19292b(C9616k.m19147a().mo17446a()), jSONObject, true);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m19273a(org.json.JSONObject r5, java.io.File r6) {
        /*
            r0 = 0
            r1 = 0
            com.bytedance.crash.d r2 = com.bytedance.crash.C9571d.NATIVE     // Catch:{ Throwable -> 0x0057 }
            java.lang.String r3 = com.bytedance.crash.C9567c.C9568a.f26101i     // Catch:{ Throwable -> 0x0057 }
            com.bytedance.crash.g.a r2 = com.bytedance.crash.p547g.C9590b.m19073a(r2, r3, r5)     // Catch:{ Throwable -> 0x0057 }
            java.lang.String r3 = "total_cost"
            long r3 = r5.optLong(r3)     // Catch:{ Throwable -> 0x0057 }
            r2.crashTime(r3)     // Catch:{ Throwable -> 0x0057 }
            com.bytedance.crash.p547g.C9591c.m19083a(r2)     // Catch:{ Throwable -> 0x0057 }
            com.bytedance.crash.g.a r2 = r2.clone()     // Catch:{ Throwable -> 0x0057 }
            java.lang.String r3 = com.bytedance.crash.C9567c.C9568a.f26102j     // Catch:{ Throwable -> 0x0057 }
            com.bytedance.crash.g.a r2 = r2.eventType(r3)     // Catch:{ Throwable -> 0x0057 }
            com.bytedance.crash.k.b r1 = com.bytedance.crash.C9616k.m19156h()     // Catch:{ Throwable -> 0x0055 }
            java.lang.String r1 = r1.f26291d     // Catch:{ Throwable -> 0x0055 }
            java.lang.String r5 = r5.toString()     // Catch:{ Throwable -> 0x0055 }
            com.bytedance.crash.m.j r5 = com.bytedance.crash.p554m.C9668b.m19280a(r1, r5, r6)     // Catch:{ Throwable -> 0x0055 }
            boolean r6 = r5.mo17529a()     // Catch:{ Throwable -> 0x0055 }
            if (r6 == 0) goto L_0x0046
            r6 = 1
            com.bytedance.crash.g.a r0 = r2.state(r0)     // Catch:{ Throwable -> 0x0043 }
            org.json.JSONObject r5 = r5.f26410c     // Catch:{ Throwable -> 0x0043 }
            r0.errorInfo(r5)     // Catch:{ Throwable -> 0x0043 }
            com.bytedance.crash.p547g.C9591c.m19083a(r2)     // Catch:{ Throwable -> 0x0043 }
            r0 = 1
            goto L_0x0067
        L_0x0043:
            r5 = move-exception
            r0 = 1
            goto L_0x0059
        L_0x0046:
            int r6 = r5.f26408a     // Catch:{ Throwable -> 0x0055 }
            com.bytedance.crash.g.a r6 = r2.state(r6)     // Catch:{ Throwable -> 0x0055 }
            java.lang.String r5 = r5.f26409b     // Catch:{ Throwable -> 0x0055 }
            r6.errorInfo(r5)     // Catch:{ Throwable -> 0x0055 }
            com.bytedance.crash.p547g.C9591c.m19083a(r2)     // Catch:{ Throwable -> 0x0055 }
            goto L_0x0067
        L_0x0055:
            r5 = move-exception
            goto L_0x0059
        L_0x0057:
            r5 = move-exception
            r2 = r1
        L_0x0059:
            if (r2 == 0) goto L_0x0067
            r6 = 211(0xd3, float:2.96E-43)
            com.bytedance.crash.g.a r6 = r2.state(r6)
            r6.errorInfo(r5)
            com.bytedance.crash.p547g.C9591c.m19083a(r2)
        L_0x0067:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p554m.C9667a.m19273a(org.json.JSONObject, java.io.File):boolean");
    }

    /* renamed from: a */
    public static boolean m19272a(String str, String str2, String str3, List<String> list) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || list == null || list.size() == 0) {
            return false;
        }
        try {
            return C9668b.m19286a(C9668b.m19283a(), str, str2, str3, list);
        } catch (Throwable unused) {
            return false;
        }
    }
}
