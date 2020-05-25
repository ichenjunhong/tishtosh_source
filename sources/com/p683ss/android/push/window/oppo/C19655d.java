package com.p683ss.android.push.window.oppo;

import android.content.Context;
import com.bytedance.common.utility.C9431p;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.push.window.oppo.d */
public class C19655d {

    /* renamed from: c */
    private static C19655d f54146c;

    /* renamed from: a */
    public Context f54147a;

    /* renamed from: b */
    public C19644b<Integer, C19656a> f54148b = new C19644b<>(2);

    /* renamed from: com.ss.android.push.window.oppo.d$a */
    public static class C19656a {

        /* renamed from: a */
        public int f54149a;

        /* renamed from: b */
        public int f54150b;

        /* renamed from: c */
        public String f54151c;

        /* renamed from: d */
        public int f54152d;

        /* renamed from: e */
        public String f54153e;

        /* renamed from: a */
        public final JSONObject mo40984a() {
            JSONObject jSONObject = new JSONObject();
            try {
                if (this.f54149a > 0) {
                    if (!C9431p.m18664a(this.f54151c)) {
                        jSONObject.put("id", this.f54149a);
                        jSONObject.put("type", this.f54150b);
                        jSONObject.put("obj", this.f54151c);
                        jSONObject.put("from", this.f54152d);
                        jSONObject.put("extra", this.f54153e);
                        return jSONObject;
                    }
                }
                return jSONObject;
            } catch (Throwable unused) {
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MessageObj{id=");
            sb.append(this.f54149a);
            sb.append(", type=");
            sb.append(this.f54150b);
            sb.append(", obj='");
            sb.append(this.f54151c);
            sb.append('\'');
            sb.append(", from=");
            sb.append(this.f54152d);
            sb.append(", extra='");
            sb.append(this.f54153e);
            sb.append('\'');
            sb.append('}');
            return sb.toString();
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0054 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m48021b() {
        /*
            r6 = this;
            com.ss.android.push.window.oppo.a r0 = com.p683ss.android.push.window.oppo.C19645c.m48009d()     // Catch:{ Throwable -> 0x0063 }
            android.content.Context r1 = r6.f54147a     // Catch:{ Throwable -> 0x0063 }
            java.lang.String r2 = "pop_window_message_cache_list"
            java.lang.String r3 = ""
            java.lang.String r0 = r0.mo40956a(r1, r2, r3)     // Catch:{ Throwable -> 0x0063 }
            boolean r1 = com.bytedance.common.utility.C9431p.m18664a(r0)     // Catch:{ Throwable -> 0x0063 }
            if (r1 == 0) goto L_0x0015
            return
        L_0x0015:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ Throwable -> 0x0063 }
            r1.<init>(r0)     // Catch:{ Throwable -> 0x0063 }
            int r0 = r1.length()     // Catch:{ Throwable -> 0x0063 }
            r2 = 0
        L_0x001f:
            if (r2 >= r0) goto L_0x0062
            org.json.JSONObject r3 = r1.optJSONObject(r2)     // Catch:{ Throwable -> 0x0063 }
            com.ss.android.push.window.oppo.d$a r4 = new com.ss.android.push.window.oppo.d$a     // Catch:{ Throwable -> 0x0063 }
            r4.<init>()     // Catch:{ Throwable -> 0x0063 }
            if (r3 == 0) goto L_0x0054
            java.lang.String r5 = "id"
            int r5 = r3.optInt(r5)     // Catch:{ Throwable -> 0x0054 }
            r4.f54149a = r5     // Catch:{ Throwable -> 0x0054 }
            java.lang.String r5 = "type"
            int r5 = r3.optInt(r5)     // Catch:{ Throwable -> 0x0054 }
            r4.f54150b = r5     // Catch:{ Throwable -> 0x0054 }
            java.lang.String r5 = "obj"
            java.lang.String r5 = r3.optString(r5)     // Catch:{ Throwable -> 0x0054 }
            r4.f54151c = r5     // Catch:{ Throwable -> 0x0054 }
            java.lang.String r5 = "from"
            int r5 = r3.optInt(r5)     // Catch:{ Throwable -> 0x0054 }
            r4.f54152d = r5     // Catch:{ Throwable -> 0x0054 }
            java.lang.String r5 = "extra"
            java.lang.String r3 = r3.optString(r5)     // Catch:{ Throwable -> 0x0054 }
            r4.f54153e = r3     // Catch:{ Throwable -> 0x0054 }
        L_0x0054:
            com.ss.android.push.window.oppo.b<java.lang.Integer, com.ss.android.push.window.oppo.d$a> r3 = r6.f54148b     // Catch:{ Throwable -> 0x0063 }
            int r5 = r4.f54149a     // Catch:{ Throwable -> 0x0063 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Throwable -> 0x0063 }
            r3.mo40960a(r5, r4)     // Catch:{ Throwable -> 0x0063 }
            int r2 = r2 + 1
            goto L_0x001f
        L_0x0062:
            return
        L_0x0063:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.push.window.oppo.C19655d.m48021b():void");
    }

    /* renamed from: a */
    public final void mo40982a() {
        try {
            JSONArray jSONArray = new JSONArray();
            Map b = this.f54148b.mo40962b();
            if (!b.isEmpty()) {
                for (Entry entry : b.entrySet()) {
                    if (entry != null) {
                        jSONArray.put(((C19656a) entry.getValue()).mo40984a());
                    }
                }
            }
            String jSONArray2 = jSONArray.toString();
            HashMap hashMap = new HashMap();
            hashMap.put("pop_window_message_cache_list", jSONArray2);
            C19645c.m48009d().mo40958a(this.f54147a, hashMap);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static C19655d m48020a(Context context) {
        if (f54146c == null) {
            synchronized (C19655d.class) {
                if (f54146c == null) {
                    f54146c = new C19655d(context);
                }
            }
        }
        return f54146c;
    }

    private C19655d(Context context) {
        this.f54147a = context.getApplicationContext();
        this.f54148b = new C19644b<>(C19645c.m48006a(context).f54125l);
        m48021b();
    }

    /* renamed from: a */
    public final void mo40983a(int i, String str, int i2, String str2) {
        if (!C19645c.m48006a(this.f54147a).f54126m) {
            this.f54148b.mo40961a();
        } else if (!C9431p.m18664a(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("id", 0);
                if (optInt > 0 && jSONObject.optInt("pass_through", 1) > 0) {
                    C19656a aVar = new C19656a();
                    aVar.f54149a = optInt;
                    aVar.f54150b = 1;
                    aVar.f54151c = str;
                    aVar.f54152d = i2;
                    aVar.f54153e = str2;
                    this.f54148b.mo40960a(Integer.valueOf(optInt), aVar);
                    mo40982a();
                }
            } catch (Throwable unused) {
            }
        }
    }
}
