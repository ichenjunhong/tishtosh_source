package com.bytedance.android.p140a.p141a.p147f;

import com.bytedance.p582g.p583a.p592d.C10009j;
import com.bytedance.p582g.p583a.p592d.C10020k;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.a.a.f.a */
public abstract class C2790a {

    /* renamed from: a */
    private static volatile boolean f8374a;

    /* renamed from: b */
    private static volatile int f8375b;

    /* renamed from: a */
    private static C10009j m7934a() {
        if (!f8374a) {
            mo7407b();
        }
        if (f8374a) {
            return C10020k.m20166a("2705");
        }
        return null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:18|19|20|(1:22)|23|(3:25|26|27)|28|29|30|31|32|33) */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a1, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0075 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void mo7407b() {
        /*
            java.lang.Class<com.bytedance.android.a.a.f.a> r0 = com.bytedance.android.p140a.p141a.p147f.C2790a.class
            monitor-enter(r0)
            boolean r1 = f8374a     // Catch:{ all -> 0x00a2 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)
            return
        L_0x0009:
            int r1 = f8375b     // Catch:{ all -> 0x00a2 }
            r2 = 3
            if (r1 < r2) goto L_0x0010
            monitor-exit(r0)
            return
        L_0x0010:
            com.bytedance.android.a.a.e r1 = com.bytedance.android.p140a.p141a.C2786e.m7920d()     // Catch:{ all -> 0x00a2 }
            com.bytedance.android.a.a.g.a r1 = r1.f8356c     // Catch:{ all -> 0x00a2 }
            if (r1 == 0) goto L_0x00a0
            boolean r2 = r1.f8381f     // Catch:{ all -> 0x00a2 }
            if (r2 != 0) goto L_0x001e
            goto L_0x00a0
        L_0x001e:
            r2 = 1
            boolean r1 = r1.f8378c     // Catch:{ Throwable -> 0x0090 }
            if (r1 == 0) goto L_0x004c
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Throwable -> 0x0090 }
            r3 = 2
            r1.<init>(r3)     // Catch:{ Throwable -> 0x0090 }
            java.lang.String r4 = "https://mon.isnssdk.com/monitor/appmonitor/v2/settings"
            r1.add(r4)     // Catch:{ Throwable -> 0x0090 }
            java.lang.String r4 = "https://i.isnssdk.com/monitor/appmonitor/v2/settings"
            r1.add(r4)     // Catch:{ Throwable -> 0x0090 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Throwable -> 0x0090 }
            r4.<init>(r3)     // Catch:{ Throwable -> 0x0090 }
            java.lang.String r3 = "https://mon.isnssdk.com/monitor/collect/"
            r4.add(r3)     // Catch:{ Throwable -> 0x0090 }
            java.lang.String r3 = "https://i.isnssdk.com/monitor/collect/"
            r4.add(r3)     // Catch:{ Throwable -> 0x0090 }
            java.lang.String r3 = "2705"
            com.bytedance.p582g.p583a.p592d.C10020k.m20168a(r3, r1)     // Catch:{ Throwable -> 0x0090 }
            java.lang.String r1 = "2705"
            com.bytedance.p582g.p583a.p592d.C10020k.m20169b(r1, r4)     // Catch:{ Throwable -> 0x0090 }
        L_0x004c:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0090 }
            r1.<init>()     // Catch:{ Throwable -> 0x0090 }
            com.bytedance.android.a.a.e r3 = com.bytedance.android.p140a.p141a.C2786e.m7920d()     // Catch:{ Throwable -> 0x0090 }
            com.bytedance.android.a.a.f r3 = r3.f8361h     // Catch:{ Throwable -> 0x0090 }
            if (r3 == 0) goto L_0x0075
            java.lang.String r3 = "device_id"
            java.lang.String r4 = ""
            r1.putOpt(r3, r4)     // Catch:{ Throwable -> 0x0075 }
            java.lang.String r3 = "channel"
            java.lang.String r4 = ""
            r1.putOpt(r3, r4)     // Catch:{ Throwable -> 0x0075 }
            java.lang.String r3 = "app_version"
            java.lang.String r4 = "1.0.0-rc.12"
            r1.putOpt(r3, r4)     // Catch:{ Throwable -> 0x0075 }
            java.lang.String r3 = "update_version_code"
            java.lang.String r4 = ""
            r1.putOpt(r3, r4)     // Catch:{ Throwable -> 0x0075 }
        L_0x0075:
            com.bytedance.android.a.a.e r3 = com.bytedance.android.p140a.p141a.C2786e.m7920d()     // Catch:{ Throwable -> 0x0090 }
            android.content.Context r3 = r3.f8355b     // Catch:{ Throwable -> 0x0090 }
            java.lang.String r4 = "2705"
            com.bytedance.android.a.a.f.a$1 r5 = new com.bytedance.android.a.a.f.a$1     // Catch:{ Throwable -> 0x0090 }
            r5.<init>()     // Catch:{ Throwable -> 0x0090 }
            com.bytedance.p582g.p583a.p592d.C10020k.m20167a(r3, r4, r1, r5)     // Catch:{ Throwable -> 0x0090 }
            f8374a = r2     // Catch:{ Throwable -> 0x0090 }
            int r1 = f8375b     // Catch:{ all -> 0x00a2 }
            int r1 = r1 + r2
            f8375b = r1     // Catch:{ all -> 0x00a2 }
            monitor-exit(r0)
            return
        L_0x008e:
            r1 = move-exception
            goto L_0x009a
        L_0x0090:
            r1 = 0
            f8374a = r1     // Catch:{ all -> 0x008e }
            int r1 = f8375b     // Catch:{ all -> 0x00a2 }
            int r1 = r1 + r2
            f8375b = r1     // Catch:{ all -> 0x00a2 }
            monitor-exit(r0)
            return
        L_0x009a:
            int r3 = f8375b     // Catch:{ all -> 0x00a2 }
            int r3 = r3 + r2
            f8375b = r3     // Catch:{ all -> 0x00a2 }
            throw r1     // Catch:{ all -> 0x00a2 }
        L_0x00a0:
            monitor-exit(r0)
            return
        L_0x00a2:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.p140a.p141a.p147f.C2790a.mo7407b():void");
    }

    /* renamed from: a */
    protected static JSONObject m7935a(JSONObject jSONObject, long j) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("cost", j);
        } catch (Throwable unused) {
        }
        return jSONObject2;
    }

    /* renamed from: a */
    protected static JSONObject m7936a(JSONObject jSONObject, Throwable th) {
        if (th == null) {
            return jSONObject;
        }
        try {
            jSONObject.put("err", th.getMessage());
            jSONObject.put("err_type", th.getClass().getSimpleName());
            Throwable cause = th.getCause();
            while (cause != null) {
                Throwable cause2 = cause.getCause();
                if (cause2 == null) {
                    break;
                }
                cause = cause2;
            }
            if (cause != null) {
                jSONObject.put("err_inner", cause.getMessage());
                jSONObject.put("err_type_inner", cause.getClass().getSimpleName());
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7393a(String str, int i, JSONObject jSONObject) {
        C10009j a = m7934a();
        if (a != null) {
            a.mo17977a(str, i, (JSONObject) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7395a(String str, long j, JSONObject jSONObject) {
        JSONObject a = m7935a((JSONObject) null, j);
        C10009j a2 = m7934a();
        if (a2 != null) {
            a2.mo17982a(str, a, jSONObject);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7394a(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        C10009j a = m7934a();
        if (a != null) {
            a.mo17978a(str, i, jSONObject, jSONObject2);
        }
    }
}
