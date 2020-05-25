package com.bytedance.ttnet.hostmonitor;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.common.utility.C9431p;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.ttnet.hostmonitor.e */
public final class C13350e {

    /* renamed from: a */
    public final Context f34828a;

    /* renamed from: b */
    public Map<C13348c, C13356g> f34829b;

    /* renamed from: c */
    public String f34830c;

    /* renamed from: d */
    public int f34831d = -1;

    /* renamed from: e */
    public int f34832e = -1;

    /* renamed from: f */
    public int f34833f = -1;

    /* renamed from: g */
    private SharedPreferences f34834g;

    /* renamed from: a */
    public SharedPreferences mo24963a() {
        if (this.f34834g == null) {
            this.f34834g = C35807d.m80935a(this.f34828a, "host_monitor_config", 0);
        }
        return this.f34834g;
    }

    /* renamed from: c */
    public final String mo24966c() {
        if (this.f34830c == null) {
            this.f34830c = mo24963a().getString("broadcastAction", "com.bytedance.ttnet.hostmonitor.status");
        }
        return this.f34830c;
    }

    /* renamed from: d */
    public final int mo24967d() {
        if (this.f34832e <= 0) {
            this.f34832e = mo24963a().getInt("checkInterval", 0);
        }
        return this.f34832e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo24968e() {
        try {
            C13351f.m26926b("HostMonitor", "saving hosts status map");
            mo24963a().edit().putString("host_status", m26918a(this.f34829b).toString()).apply();
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x002a */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<com.bytedance.ttnet.hostmonitor.C13348c, com.bytedance.ttnet.hostmonitor.C13356g> mo24965b() {
        /*
            r3 = this;
            java.util.Map<com.bytedance.ttnet.hostmonitor.c, com.bytedance.ttnet.hostmonitor.g> r0 = r3.f34829b     // Catch:{ Throwable -> 0x004c }
            if (r0 != 0) goto L_0x004c
            android.content.SharedPreferences r0 = r3.mo24963a()     // Catch:{ Throwable -> 0x004c }
            java.lang.String r1 = "host_status"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)     // Catch:{ Throwable -> 0x004c }
            boolean r1 = r0.isEmpty()     // Catch:{ Throwable -> 0x004c }
            if (r1 == 0) goto L_0x001e
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ Throwable -> 0x004c }
            r0.<init>()     // Catch:{ Throwable -> 0x004c }
            r3.f34829b = r0     // Catch:{ Throwable -> 0x004c }
            goto L_0x004c
        L_0x001e:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ Exception -> 0x002a }
            r1.<init>(r0)     // Catch:{ Exception -> 0x002a }
            java.util.Map r1 = m26917a(r1)     // Catch:{ Exception -> 0x002a }
            r3.f34829b = r1     // Catch:{ Exception -> 0x002a }
            goto L_0x004c
        L_0x002a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x004c }
            java.lang.String r2 = "Error while deserializing host status map: "
            r1.<init>(r2)     // Catch:{ Throwable -> 0x004c }
            r1.append(r0)     // Catch:{ Throwable -> 0x004c }
            java.lang.String r0 = ". Ignoring values."
            r1.append(r0)     // Catch:{ Throwable -> 0x004c }
            r1.toString()     // Catch:{ Throwable -> 0x004c }
            com.bytedance.ttnet.hostmonitor.f r0 = com.bytedance.ttnet.hostmonitor.C13351f.C13355c.f34838a     // Catch:{ Throwable -> 0x004c }
            com.bytedance.ttnet.hostmonitor.f$a r0 = r0.f34835a     // Catch:{ Throwable -> 0x004c }
            com.bytedance.ttnet.hostmonitor.f$a r1 = com.bytedance.ttnet.hostmonitor.C13351f.C13353a.ERROR     // Catch:{ Throwable -> 0x004c }
            r0.compareTo(r1)     // Catch:{ Throwable -> 0x004c }
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ Throwable -> 0x004c }
            r0.<init>()     // Catch:{ Throwable -> 0x004c }
            r3.f34829b = r0     // Catch:{ Throwable -> 0x004c }
        L_0x004c:
            java.util.Map<com.bytedance.ttnet.hostmonitor.c, com.bytedance.ttnet.hostmonitor.g> r0 = r3.f34829b
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.hostmonitor.C13350e.mo24965b():java.util.Map");
    }

    public C13350e(Context context) {
        this.f34828a = context.getApplicationContext();
    }

    /* renamed from: a */
    public final boolean mo24964a(C13348c cVar) {
        if (cVar == null) {
            return false;
        }
        try {
            Map b = mo24965b();
            if (b == null) {
                return false;
            }
            C13356g gVar = (C13356g) b.get(cVar);
            if (gVar == null || !gVar.f34839a) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static Map<C13348c, C13356g> m26917a(JSONArray jSONArray) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        if (jSONArray.length() <= 0) {
            return concurrentHashMap;
        }
        try {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                String optString = optJSONObject.optString("host");
                int optInt = optJSONObject.optInt("port");
                boolean optBoolean = optJSONObject.optBoolean("reachable");
                int optInt2 = optJSONObject.optInt("connection_type");
                if (!C9431p.m18664a(optString) && optInt > 0) {
                    C13348c cVar = new C13348c(optString, optInt);
                    C13346a aVar = C13346a.NONE;
                    if (optInt2 == 1) {
                        aVar = C13346a.WIFI;
                    } else if (optInt2 == 2) {
                        aVar = C13346a.MOBILE;
                    }
                    concurrentHashMap.put(cVar, new C13356g(optBoolean, aVar));
                }
            }
        } catch (Throwable unused) {
        }
        return concurrentHashMap;
    }

    /* renamed from: a */
    public static JSONArray m26918a(Map<C13348c, C13356g> map) {
        JSONArray jSONArray = new JSONArray();
        if (map == null || map.isEmpty()) {
            return jSONArray;
        }
        try {
            for (Entry entry : map.entrySet()) {
                if (entry != null) {
                    C13348c cVar = (C13348c) entry.getKey();
                    C13356g gVar = (C13356g) entry.getValue();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("host", cVar.f34826a);
                    jSONObject.put("port", cVar.f34827b);
                    jSONObject.put("reachable", gVar.f34839a);
                    jSONObject.put("connection_type", gVar.f34840b.value);
                    jSONArray.put(jSONObject);
                }
            }
        } catch (Throwable unused) {
        }
        return jSONArray;
    }
}
