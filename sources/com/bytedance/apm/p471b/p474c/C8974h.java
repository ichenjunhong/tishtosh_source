package com.bytedance.apm.p471b.p474c;

import com.bytedance.apm.C8936b;
import com.bytedance.apm.p471b.p472a.C8955d;
import com.bytedance.apm.p471b.p473b.C8960b;
import com.bytedance.apm.p471b.p474c.p475a.C8964b;
import com.bytedance.apm.p471b.p474c.p475a.C8966d;
import com.bytedance.apm.p480f.C9018b;
import com.bytedance.apm.p480f.C9028d;
import com.bytedance.apm.p480f.p481a.C9014a;
import com.bytedance.apm.p480f.p482b.C9022d;
import com.bytedance.apm.p485h.C9040b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.b.c.h */
public final class C8974h extends C8961a<C8966d> implements C8955d {
    /* renamed from: a */
    public final String mo16229a() {
        return "android.os.IPowerManager";
    }

    public C8974h() {
        super("power");
    }

    /* renamed from: a */
    public final void mo16262a(C8960b bVar, C9040b bVar2) {
        if (this.f24409a.equals(bVar2.f24665d)) {
            if (bVar2.f24663b) {
                bVar.f24365e += bVar2.f24668g;
                return;
            }
            bVar.f24370j += bVar2.f24668g;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo16244a(double d, double d2) {
        int i;
        if (d >= 240000.0d) {
            i = 17;
        } else {
            i = 0;
        }
        if (d2 >= 5.0d) {
            i |= 18;
        }
        if (i != 0) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("issue_type", i).put("total_hold_time", d).put("total_acquire_count", d2).put("wake_lock_maps", this.f24412d);
                C8936b.m17655a("battery_monitor", jSONObject);
            } catch (JSONException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo16246a(C8964b bVar, long j) {
        C8966d dVar = (C8966d) bVar;
        if (j >= 120000) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("issue_type", 16).put("wake_lock_hold_time", j).put("wake_lock_info", dVar.toString());
                C9018b.m17833a(jSONObject, "battery_trace");
                C9014a.m17825a().mo16336a((C9028d) new C9022d("battery_trace", jSONObject));
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007b, code lost:
        if (r5 != null) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e5, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo16230a(java.lang.Object r4, java.lang.reflect.Method r5, java.lang.Object[] r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r4 = r5.getName()     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            java.lang.String r5 = "acquireWakeLock"
            boolean r5 = r5.equals(r4)     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            r0 = 2
            r1 = 0
            if (r5 == 0) goto L_0x00a1
            r3.mo16250d()     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            com.bytedance.apm.b.a r4 = com.bytedance.apm.p471b.C8949a.m17661a()     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            boolean r4 = r4.f24337b     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            if (r4 == 0) goto L_0x00e9
            int r4 = r6.length     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            r5 = 6
            if (r4 > r5) goto L_0x00e4
            int r4 = r6.length     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            r5 = 4
            if (r4 >= r5) goto L_0x0024
            goto L_0x00e4
        L_0x0024:
            r4 = r6[r1]     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            if (r4 == 0) goto L_0x00e4
            r4 = r6[r1]     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            boolean r4 = r4 instanceof android.os.IBinder     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            if (r4 == 0) goto L_0x00e4
            r4 = r6[r1]     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            int r4 = r4.hashCode()     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            java.util.concurrent.ConcurrentHashMap r5 = r3.f24412d     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            boolean r5 = r5.containsKey(r1)     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            if (r5 != 0) goto L_0x006f
            com.bytedance.apm.b.c.a.d r5 = new com.bytedance.apm.b.c.a.d     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            r5.<init>()     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            r1 = 1
            r2 = r6[r1]     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            if (r2 == 0) goto L_0x00e4
            r2 = r6[r1]     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            boolean r2 = r2 instanceof java.lang.Integer     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            if (r2 == 0) goto L_0x00e4
            r1 = r6[r1]     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            r5.f24402a = r1     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            r1 = r6[r0]     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            if (r1 == 0) goto L_0x00e4
            r1 = r6[r0]     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            boolean r1 = r1 instanceof java.lang.String     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            if (r1 == 0) goto L_0x00e4
            r6 = r6[r0]     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            r5.f24403b = r6     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            r0 = -1
            r5.f24398e = r0     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            goto L_0x007d
        L_0x006f:
            java.util.concurrent.ConcurrentHashMap r5 = r3.f24412d     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            com.bytedance.apm.b.c.a.d r5 = (com.bytedance.apm.p471b.p474c.p475a.C8966d) r5     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            if (r5 == 0) goto L_0x00e9
        L_0x007d:
            java.lang.Thread r6 = java.lang.Thread.currentThread()     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            java.lang.StackTraceElement[] r6 = r6.getStackTrace()     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            r5.f24400g = r6     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            java.lang.Thread r6 = java.lang.Thread.currentThread()     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            java.lang.String r6 = r6.getName()     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            r5.f24399f = r6     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            r5.f24397d = r0     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            java.util.concurrent.ConcurrentHashMap r6 = r3.f24412d     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            r6.put(r4, r5)     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            goto L_0x00e9
        L_0x00a1:
            java.lang.String r5 = "releaseWakeLock"
            boolean r4 = r5.equals(r4)     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            if (r4 == 0) goto L_0x00e4
            r3.mo16251e()     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            com.bytedance.apm.b.a r4 = com.bytedance.apm.p471b.C8949a.m17661a()     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            boolean r4 = r4.f24337b     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            if (r4 == 0) goto L_0x00e4
            int r4 = r6.length     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            if (r4 != r0) goto L_0x00e4
            r4 = r6[r1]     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            if (r4 == 0) goto L_0x00e9
            r4 = r6[r1]     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            boolean r4 = r4 instanceof android.os.IBinder     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            if (r4 == 0) goto L_0x00e9
            r4 = r6[r1]     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            int r4 = r4.hashCode()     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            java.util.concurrent.ConcurrentHashMap r5 = r3.f24412d     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            com.bytedance.apm.b.c.a.d r5 = (com.bytedance.apm.p471b.p474c.p475a.C8966d) r5     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            if (r5 == 0) goto L_0x00e4
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            r5.f24398e = r0     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            java.util.concurrent.ConcurrentHashMap r6 = r3.f24412d     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
            r6.put(r4, r5)     // Catch:{ Exception -> 0x00e9, all -> 0x00e6 }
        L_0x00e4:
            monitor-exit(r3)
            return
        L_0x00e6:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L_0x00e9:
            monitor-exit(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.p471b.p474c.C8974h.mo16230a(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):void");
    }
}
