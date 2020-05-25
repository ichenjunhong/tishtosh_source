package com.facebook.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.C2240a;
import com.facebook.AccessToken;
import com.facebook.C14533n;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.C13501b;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.n */
public final class C14332n {

    /* renamed from: a */
    public static final AtomicBoolean f37280a = new AtomicBoolean(false);

    /* renamed from: b */
    public static Long f37281b;

    /* renamed from: c */
    private static final String f37282c = C14332n.class.getCanonicalName();

    /* renamed from: d */
    private static final ConcurrentLinkedQueue<C14335a> f37283d = new ConcurrentLinkedQueue<>();

    /* renamed from: e */
    private static final Map<String, JSONObject> f37284e = new ConcurrentHashMap();

    /* renamed from: com.facebook.internal.n$a */
    public interface C14335a {
        /* renamed from: a */
        void mo26537a();
    }

    /* renamed from: b */
    private static void m29393b() {
        m29391a((C14335a) null);
    }

    /* renamed from: a */
    public static void m29390a() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (!f37283d.isEmpty()) {
            final C14335a aVar = (C14335a) f37283d.poll();
            if (aVar != null) {
                handler.post(new Runnable() {
                    public final void run() {
                        aVar.mo26537a();
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public static JSONObject m29388a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("platform", "android");
        bundle.putString("sdk_version", C14533n.m29775i());
        bundle.putString("fields", "gatekeepers");
        GraphRequest a = GraphRequest.m27265a((AccessToken) null, C2240a.m6772a("%s/%s", new Object[]{str, "mobile_sdk_gk"}), (C13501b) null);
        a.f35232n = true;
        a.f35228j = bundle;
        return a.mo25312a().f38084b;
    }

    /* renamed from: a */
    static synchronized void m29391a(C14335a aVar) {
        boolean z;
        synchronized (C14332n.class) {
            if (aVar != null) {
                try {
                    f37283d.add(aVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
            Long l = f37281b;
            if (l == null || System.currentTimeMillis() - l.longValue() >= 3600000) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                m29390a();
                return;
            }
            final Context g = C14533n.m29773g();
            final String k = C14533n.m29777k();
            final String a = C2240a.m6772a("com.facebook.internal.APP_GATEKEEPERS.%s", new Object[]{k});
            if (g != null) {
                JSONObject jSONObject = null;
                String string = C35807d.m80935a(g, "com.facebook.internal.preferences.APP_GATEKEEPERS", 0).getString(a, null);
                if (!C14277aa.m29276a(string)) {
                    try {
                        jSONObject = new JSONObject(string);
                    } catch (JSONException unused) {
                    }
                    if (jSONObject != null) {
                        m29389a(k, jSONObject);
                    }
                }
                Executor e = C14533n.m29771e();
                if (e != null) {
                    if (f37280a.compareAndSet(false, true)) {
                        e.execute(new Runnable() {
                            public final void run() {
                                JSONObject a = C14332n.m29388a(k);
                                if (a != null) {
                                    C14332n.m29389a(k, a);
                                    C35807d.m80935a(g, "com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(a, a.toString()).apply();
                                    C14332n.f37281b = Long.valueOf(System.currentTimeMillis());
                                }
                                C14332n.m29390a();
                                C14332n.f37280a.set(false);
                            }
                        });
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static synchronized JSONObject m29389a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (C14332n.class) {
            if (f37284e.containsKey(str)) {
                jSONObject2 = (JSONObject) f37284e.get(str);
            } else {
                jSONObject2 = new JSONObject();
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("data");
            JSONObject jSONObject3 = null;
            if (optJSONArray != null) {
                jSONObject3 = optJSONArray.optJSONObject(0);
            }
            if (!(jSONObject3 == null || jSONObject3.optJSONArray("gatekeepers") == null)) {
                JSONArray optJSONArray2 = jSONObject3.optJSONArray("gatekeepers");
                for (int i = 0; i < optJSONArray2.length(); i++) {
                    try {
                        JSONObject jSONObject4 = optJSONArray2.getJSONObject(i);
                        jSONObject2.put(jSONObject4.getString("key"), jSONObject4.getBoolean("value"));
                    } catch (JSONException unused) {
                    }
                }
            }
            f37284e.put(str, jSONObject2);
        }
        return jSONObject2;
    }

    /* renamed from: a */
    public static boolean m29392a(String str, String str2, boolean z) {
        m29393b();
        if (str2 == null || !f37284e.containsKey(str2)) {
            return z;
        }
        return ((JSONObject) f37284e.get(str2)).optBoolean(str, z);
    }
}
