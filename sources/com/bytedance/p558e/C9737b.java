package com.bytedance.p558e;

import android.app.Application;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.android.livesdk.chatroom.p325ui.C6162et;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.e.b */
final class C9737b {

    /* renamed from: a */
    SharedPreferences f26509a;

    /* renamed from: b */
    C9745f f26510b;

    /* renamed from: c */
    private final String f26511c;

    /* renamed from: d */
    private JSONObject f26512d;

    /* renamed from: e */
    private final Map<String, Object> f26513e = new ConcurrentHashMap();

    /* renamed from: f */
    private C9748i f26514f;

    /* renamed from: g */
    private C9747h f26515g;

    /* renamed from: h */
    private SharedPreferences f26516h;

    /* renamed from: i */
    private Application f26517i;

    /* renamed from: j */
    private Future f26518j;

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final synchronized void mo17566b() {
        if (this.f26518j != null) {
            this.f26518j.cancel(true);
        }
        this.f26518j = C9750k.m19524a(new Runnable() {
            public final void run() {
                C9737b.this.mo17565a();
            }
        }, 0, 3600000);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final synchronized boolean mo17567c() {
        boolean z;
        if (!this.f26516h.getAll().isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    public final void mo17565a() {
        try {
            JSONObject jSONObject = new JSONObject(this.f26515g.mo17576a(this.f26511c));
            if (jSONObject.has("code")) {
                if (jSONObject.has("data")) {
                    if (jSONObject.optInt("code", -1) == 0) {
                        m19505a(jSONObject.getJSONObject("data"));
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private void m19505a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            try {
                JSONObject jSONObject3 = jSONObject.getJSONObject(str);
                jSONObject2.put(str, jSONObject3.get("val"));
                String string = jSONObject3.getString("vid");
                if (!TextUtils.isEmpty(string)) {
                    hashMap.put(str, string);
                    long j = jSONObject3.getLong(C6162et.f16534a);
                    if (j > 0) {
                        hashMap2.put(string, Long.valueOf(j));
                    }
                }
            } catch (JSONException unused) {
            }
        }
        synchronized (this) {
            this.f26513e.clear();
            this.f26512d = jSONObject2;
            this.f26516h.edit().putString("SP_EXPERIMENT_CACHE", jSONObject2.toString()).apply();
        }
        this.f26510b.mo17574a(hashMap, hashMap2);
    }

    /* renamed from: a */
    private <T> T m19504a(String str, Type type, T t) {
        try {
            if (this.f26513e.containsKey(str) && this.f26513e.get(str).getClass() == type) {
                return this.f26513e.get(str);
            }
            T a = this.f26514f.mo17577a(this.f26512d.optString(str, ""), type);
            if (a == null) {
                this.f26513e.remove(str);
                return t;
            }
            this.f26513e.put(str, a);
            return a;
        } catch (Exception unused) {
            this.f26513e.remove(str);
            return t;
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ac  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized <T> T mo17564a(java.lang.String r2, java.lang.reflect.Type r3, T r4, boolean r5) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.lang.Class<java.lang.Boolean> r4 = java.lang.Boolean.class
            r0 = 0
            if (r3 == r4) goto L_0x0097
            java.lang.Class r4 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x00b3 }
            if (r3 != r4) goto L_0x000c
            goto L_0x0097
        L_0x000c:
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            if (r3 == r4) goto L_0x0084
            java.lang.Class<java.lang.Short> r4 = java.lang.Short.class
            if (r3 == r4) goto L_0x0084
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00b3 }
            if (r3 == r4) goto L_0x0084
            java.lang.Class r4 = java.lang.Short.TYPE     // Catch:{ all -> 0x00b3 }
            if (r3 != r4) goto L_0x001e
            goto L_0x0084
        L_0x001e:
            java.lang.Class<java.lang.Float> r4 = java.lang.Float.class
            if (r3 == r4) goto L_0x0070
            java.lang.Class r4 = java.lang.Float.TYPE     // Catch:{ all -> 0x00b3 }
            if (r3 != r4) goto L_0x0027
            goto L_0x0070
        L_0x0027:
            java.lang.Class<java.lang.Long> r4 = java.lang.Long.class
            if (r3 == r4) goto L_0x005d
            java.lang.Class r4 = java.lang.Long.TYPE     // Catch:{ all -> 0x00b3 }
            if (r3 != r4) goto L_0x0030
            goto L_0x005d
        L_0x0030:
            java.lang.Class<java.lang.Double> r4 = java.lang.Double.class
            if (r3 == r4) goto L_0x0049
            java.lang.Class r4 = java.lang.Double.TYPE     // Catch:{ all -> 0x00b3 }
            if (r3 != r4) goto L_0x0039
            goto L_0x0049
        L_0x0039:
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            if (r3 != r4) goto L_0x0044
            org.json.JSONObject r3 = r1.f26512d     // Catch:{ all -> 0x00b3 }
            java.lang.String r3 = r3.optString(r2, r0)     // Catch:{ all -> 0x00b3 }
            goto L_0x00aa
        L_0x0044:
            java.lang.Object r3 = r1.m19504a(r2, r3, r0)     // Catch:{ all -> 0x00b3 }
            goto L_0x00aa
        L_0x0049:
            org.json.JSONObject r3 = r1.f26512d     // Catch:{ all -> 0x00b3 }
            boolean r3 = r3.has(r2)     // Catch:{ all -> 0x00b3 }
            if (r3 == 0) goto L_0x005b
            org.json.JSONObject r3 = r1.f26512d     // Catch:{ all -> 0x00b3 }
            double r3 = r3.optDouble(r2)     // Catch:{ all -> 0x00b3 }
            java.lang.Double r0 = java.lang.Double.valueOf(r3)     // Catch:{ all -> 0x00b3 }
        L_0x005b:
            r3 = r0
            goto L_0x00aa
        L_0x005d:
            org.json.JSONObject r3 = r1.f26512d     // Catch:{ all -> 0x00b3 }
            boolean r3 = r3.has(r2)     // Catch:{ all -> 0x00b3 }
            if (r3 == 0) goto L_0x005b
            org.json.JSONObject r3 = r1.f26512d     // Catch:{ all -> 0x00b3 }
            long r3 = r3.optLong(r2)     // Catch:{ all -> 0x00b3 }
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x00b3 }
            goto L_0x005b
        L_0x0070:
            org.json.JSONObject r3 = r1.f26512d     // Catch:{ all -> 0x00b3 }
            boolean r3 = r3.has(r2)     // Catch:{ all -> 0x00b3 }
            if (r3 == 0) goto L_0x005b
            org.json.JSONObject r3 = r1.f26512d     // Catch:{ all -> 0x00b3 }
            double r3 = r3.optDouble(r2)     // Catch:{ all -> 0x00b3 }
            float r3 = (float) r3     // Catch:{ all -> 0x00b3 }
            java.lang.Float r0 = java.lang.Float.valueOf(r3)     // Catch:{ all -> 0x00b3 }
            goto L_0x005b
        L_0x0084:
            org.json.JSONObject r3 = r1.f26512d     // Catch:{ all -> 0x00b3 }
            boolean r3 = r3.has(r2)     // Catch:{ all -> 0x00b3 }
            if (r3 == 0) goto L_0x005b
            org.json.JSONObject r3 = r1.f26512d     // Catch:{ all -> 0x00b3 }
            int r3 = r3.optInt(r2)     // Catch:{ all -> 0x00b3 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x00b3 }
            goto L_0x005b
        L_0x0097:
            org.json.JSONObject r3 = r1.f26512d     // Catch:{ all -> 0x00b3 }
            boolean r3 = r3.has(r2)     // Catch:{ all -> 0x00b3 }
            if (r3 == 0) goto L_0x005b
            org.json.JSONObject r3 = r1.f26512d     // Catch:{ all -> 0x00b3 }
            boolean r3 = r3.optBoolean(r2)     // Catch:{ all -> 0x00b3 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x00b3 }
            goto L_0x005b
        L_0x00aa:
            if (r5 == 0) goto L_0x00b1
            com.bytedance.e.f r4 = r1.f26510b     // Catch:{ all -> 0x00b3 }
            r4.mo17572a(r2)     // Catch:{ all -> 0x00b3 }
        L_0x00b1:
            monitor-exit(r1)
            return r3
        L_0x00b3:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p558e.C9737b.mo17564a(java.lang.String, java.lang.reflect.Type, java.lang.Object, boolean):java.lang.Object");
    }

    C9737b(Application application, String str, boolean z, C9748i iVar, C9746g gVar, C9747h hVar) {
        this.f26511c = str;
        this.f26510b = new C9745f(application, gVar);
        this.f26509a = C35807d.m80935a(application, "CLIENT_EXPERIMENT_CACHE_TAG", 0);
        this.f26516h = C35807d.m80935a(application, "SP_EXPERIMENT_CACHE", 0);
        this.f26514f = iVar;
        this.f26515g = hVar;
        this.f26517i = application;
        try {
            this.f26512d = new JSONObject(this.f26516h.getString("SP_EXPERIMENT_CACHE", ""));
        } catch (JSONException unused) {
            this.f26512d = new JSONObject();
        }
        if (z) {
            this.f26518j = C9750k.m19524a(new Runnable() {
                public final void run() {
                    C9737b.this.mo17565a();
                }
            }, 2000, 3600000);
        }
    }
}
