package com.bytedance.ies.p675g.p677b;

import android.os.Handler;
import android.os.Looper;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.g.b.y */
final class C10819y {

    /* renamed from: a */
    final Collection<String> f29068a;

    /* renamed from: b */
    final C10791k f29069b;

    /* renamed from: c */
    public final Set<C10823a> f29070c = new CopyOnWriteArraySet();

    /* renamed from: d */
    public final String f29071d;

    /* renamed from: e */
    public final Executor f29072e;

    /* renamed from: f */
    public final Handler f29073f = new Handler(Looper.getMainLooper());

    /* renamed from: g */
    private final Map<String, C10813x> f29074g = new ConcurrentHashMap();

    /* renamed from: com.bytedance.ies.g.b.y$a */
    interface C10823a {
        /* renamed from: b */
        void mo19535b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public JSONObject mo19599a() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("aid", this.f29069b.mo19552b());
            jSONObject2.put("app_version", this.f29069b.mo19553c());
            jSONObject2.put("os", 0);
            jSONObject2.put("device_id", this.f29069b.mo19554d());
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("channel", "_jsb_auth");
            jSONObject3.put("local_version", 0);
            jSONArray.put(jSONObject3);
            for (String str : this.f29068a) {
                JSONObject jSONObject4 = new JSONObject();
                StringBuilder sb = new StringBuilder("_jsb_auth.");
                sb.append(str);
                jSONObject4.put("channel", sb.toString());
                jSONObject4.put("local_version", 0);
                jSONArray.put(jSONObject4);
            }
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put(this.f29069b.mo19555e(), jSONArray);
            jSONObject.put("common", jSONObject2);
            jSONObject.put("deployment", jSONObject5);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo19600a(C10823a aVar) {
        this.f29070c.remove(aVar);
    }

    C10819y(C10791k kVar) {
        this.f29069b = kVar;
        this.f29071d = kVar.mo19550a().url;
        this.f29072e = kVar.mo19558h();
        this.f29068a = new LinkedList(kVar.mo19556f());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C10813x mo19598a(String str, JSONObject jSONObject) {
        C10813x xVar = (C10813x) this.f29074g.get(str);
        if (xVar == null) {
            C10813x xVar2 = new C10813x(str, 128, this.f29069b.mo19557g(), this.f29069b.mo19558h(), jSONObject);
            this.f29074g.put(str, xVar2);
            return xVar2;
        } else if (jSONObject == null) {
            return xVar;
        } else {
            xVar.mo19595a(jSONObject);
            return xVar;
        }
    }
}
