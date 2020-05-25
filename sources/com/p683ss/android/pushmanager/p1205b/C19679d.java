package com.p683ss.android.pushmanager.p1205b;

import android.os.Handler;
import android.os.Message;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.p827q.p828a.C12659a;
import com.p683ss.android.pushmanager.p1205b.p1206a.C19675c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.pushmanager.b.d */
public final class C19679d {

    /* renamed from: a */
    private static C9382a f54182a = new C9382a() {
        public final void handleMsg(Message message) {
            if (message != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("status", 108);
                    jSONObject.put("pushType", message.obj);
                } catch (JSONException unused) {
                }
                if (message.what == 1001) {
                    C19678c.m48069a("push_monitor_register_result", jSONObject, null, null);
                    if (C12659a.m25441a()) {
                        StringBuilder sb = new StringBuilder(" 通道");
                        sb.append(message.obj);
                        sb.append("注册timeout");
                        throw new C19675c(sb.toString());
                    }
                }
            }
        }
    };

    /* renamed from: b */
    private static Handler f54183b = new C9381g(C19678c.m48072b(), f54182a);

    /* renamed from: c */
    private static final Map<Integer, Boolean> f54184c = new ConcurrentHashMap(2);

    /* renamed from: c */
    private static void m48080c(int i) {
        f54183b.removeMessages(1001, Integer.valueOf(i));
    }

    /* renamed from: a */
    public static void m48074a(int i) {
        if (C19678c.m48071a()) {
            synchronized (f54184c) {
                if (((Boolean) f54184c.get(Integer.valueOf(i))) == null) {
                    f54184c.put(Integer.valueOf(i), Boolean.valueOf(true));
                    f54183b.sendMessageDelayed(f54183b.obtainMessage(1001, Integer.valueOf(i)), TimeUnit.MINUTES.toMillis(1));
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
        m48080c(r5);
        r0 = new org.json.JSONObject();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r0.put("status", 0);
        r0.put("pushType", r5);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m48079b(int r5) {
        /*
            boolean r0 = com.p683ss.android.pushmanager.p1205b.C19678c.m48071a()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            java.util.Map<java.lang.Integer, java.lang.Boolean> r0 = f54184c
            monitor-enter(r0)
            java.util.Map<java.lang.Integer, java.lang.Boolean> r1 = f54184c     // Catch:{ all -> 0x0049 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0049 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x0049 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x0049 }
            if (r1 == 0) goto L_0x0047
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0049 }
            if (r1 != 0) goto L_0x001f
            goto L_0x0047
        L_0x001f:
            java.util.Map<java.lang.Integer, java.lang.Boolean> r1 = f54184c     // Catch:{ all -> 0x0049 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0049 }
            r3 = 0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x0049 }
            r1.put(r2, r4)     // Catch:{ all -> 0x0049 }
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            m48080c(r5)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "status"
            r0.put(r1, r3)     // Catch:{ JSONException -> 0x0040 }
            java.lang.String r1 = "pushType"
            r0.put(r1, r5)     // Catch:{ JSONException -> 0x0040 }
        L_0x0040:
            java.lang.String r5 = "push_monitor_register_result"
            r1 = 0
            com.p683ss.android.pushmanager.p1205b.C19678c.m48069a(r5, r0, r1, r1)
            return
        L_0x0047:
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            return
        L_0x0049:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.pushmanager.p1205b.C19679d.m48079b(int):void");
    }

    /* renamed from: a */
    public static void m48076a(int i, String str) {
        if (C19678c.m48071a()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("log", str);
            } catch (JSONException unused) {
            }
            m48077a(i, jSONObject);
        }
    }

    /* renamed from: a */
    public static void m48077a(int i, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("status", i);
        } catch (JSONException unused) {
        }
        C19678c.m48069a("push_monitor_update_sender", jSONObject2, null, jSONObject);
    }

    /* renamed from: a */
    public static void m48078a(boolean z, String str) {
        if (C19678c.m48071a() && !z) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("status", 107);
            } catch (JSONException unused) {
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("sender", str);
            } catch (JSONException unused2) {
            }
            C19678c.m48069a("push_monitor_register_result", jSONObject, null, jSONObject2);
            if (C12659a.m25441a()) {
                throw new C19675c("Server下发无可用通道或者注册失败");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
        m48080c(r4);
        r0 = new org.json.JSONObject();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r0.put("pushType", r4);
        r0.put("status", r5);
        r0.put("3rd_code", r6);
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0071 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0072  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m48075a(int r4, int r5, java.lang.String r6, java.lang.String r7) {
        /*
            boolean r0 = com.p683ss.android.pushmanager.p1205b.C19678c.m48071a()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            java.util.Map<java.lang.Integer, java.lang.Boolean> r0 = f54184c
            monitor-enter(r0)
            java.util.Map<java.lang.Integer, java.lang.Boolean> r1 = f54184c     // Catch:{ all -> 0x007a }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x007a }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x007a }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x007a }
            if (r1 == 0) goto L_0x0078
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x007a }
            if (r1 != 0) goto L_0x001f
            goto L_0x0078
        L_0x001f:
            java.util.Map<java.lang.Integer, java.lang.Boolean> r1 = f54184c     // Catch:{ all -> 0x007a }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x007a }
            r3 = 0
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x007a }
            r1.put(r2, r3)     // Catch:{ all -> 0x007a }
            monitor-exit(r0)     // Catch:{ all -> 0x007a }
            m48080c(r4)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "pushType"
            r0.put(r1, r4)     // Catch:{ JSONException -> 0x0045 }
            java.lang.String r1 = "status"
            r0.put(r1, r5)     // Catch:{ JSONException -> 0x0045 }
            java.lang.String r5 = "3rd_code"
            r0.put(r5, r6)     // Catch:{ JSONException -> 0x0045 }
        L_0x0045:
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            java.lang.String r6 = "msg"
            r5.put(r6, r7)     // Catch:{ JSONException -> 0x004f }
        L_0x004f:
            java.lang.String r6 = "push_monitor_register_result"
            r1 = 0
            com.p683ss.android.pushmanager.p1205b.C19678c.m48069a(r6, r0, r1, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = " 通道"
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r4 = "注册失败，原因 : "
            r5.append(r4)
            r5.append(r7)
            java.lang.String r4 = r5.toString()
            boolean r5 = com.bytedance.p827q.p828a.C12659a.m25441a()
            if (r5 != 0) goto L_0x0072
            return
        L_0x0072:
            com.ss.android.pushmanager.b.a.c r5 = new com.ss.android.pushmanager.b.a.c
            r5.<init>(r4)
            throw r5
        L_0x0078:
            monitor-exit(r0)     // Catch:{ all -> 0x007a }
            return
        L_0x007a:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x007a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.pushmanager.p1205b.C19679d.m48075a(int, int, java.lang.String, java.lang.String):void");
    }
}
