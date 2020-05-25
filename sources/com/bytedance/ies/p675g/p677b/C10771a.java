package com.bytedance.ies.p675g.p677b;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.g.b.a */
public abstract class C10771a {

    /* renamed from: a */
    protected Context f28953a;

    /* renamed from: b */
    protected C10799n f28954b;

    /* renamed from: c */
    protected C10788h f28955c;

    /* renamed from: d */
    protected Handler f28956d = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    protected String f28957e;

    /* renamed from: f */
    protected volatile boolean f28958f = false;

    /* renamed from: g */
    C10784g f28959g;

    /* renamed from: h */
    private final Map<String, C10784g> f28960h = new HashMap();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Context mo19500a(C10790j jVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo19502a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo19505a(String str);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo19509b(C10790j jVar);

    protected C10771a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo19508b() {
        this.f28959g.mo19530a();
        for (C10784g a : this.f28960h.values()) {
            a.mo19530a();
        }
        this.f28956d.removeCallbacksAndMessages(null);
        this.f28958f = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo19504a(final C10802q qVar) {
        if (!this.f28958f) {
            this.f28956d.post(new Runnable() {
                public final void run() {
                    if (!C10771a.this.f28958f) {
                        if (C10802q.m21912a(qVar)) {
                            new StringBuilder("By pass invalid call: ").append(qVar);
                            if (qVar != null) {
                                C10771a.this.mo19511b(C10774aa.m21846a((Throwable) new C10808t(qVar.f29014a, "Failed to parse invocation.")), qVar);
                            }
                            return;
                        }
                        C10771a.this.mo19510b(qVar);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public void invokeMethod(final String str) {
        if (!this.f28958f) {
            new StringBuilder("Received call: ").append(str);
            this.f28956d.post(new Runnable() {
                public final void run() {
                    if (!C10771a.this.f28958f) {
                        C10802q qVar = null;
                        try {
                            qVar = C10771a.this.mo19501a(new JSONObject(str));
                        } catch (JSONException unused) {
                        }
                        if (C10802q.m21912a(qVar)) {
                            new StringBuilder("By pass invalid call: ").append(qVar);
                            if (qVar != null) {
                                C10771a.this.mo19511b(C10774aa.m21846a((Throwable) new C10808t(qVar.f29014a, "Failed to parse invocation.")), qVar);
                            }
                            return;
                        }
                        C10771a.this.mo19510b(qVar);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final C10802q mo19501a(JSONObject jSONObject) {
        if (this.f28958f) {
            return null;
        }
        String optString = jSONObject.optString("__callback_id");
        String optString2 = jSONObject.optString("func");
        String a = mo19502a();
        if (a == null) {
            if (this.f28954b != null) {
                this.f28954b.mo19567a(null, null, 3);
            }
            return null;
        }
        try {
            String string = jSONObject.getString("__msg_type");
            String string2 = jSONObject.getString("params");
            String string3 = jSONObject.getString("JSSDK");
            String optString3 = jSONObject.optString("namespace");
            return C10802q.m21911a().mo19570a(string3).mo19572b(string).mo19573c(optString2).mo19574d(string2).mo19575e(optString).mo19576f(optString3).mo19577g(jSONObject.optString("__iframe_url")).mo19571a();
        } catch (JSONException unused) {
            if (this.f28954b != null) {
                this.f28954b.mo19567a(a, optString2, 1);
            }
            return new C10802q(optString, -1);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo19510b(C10802q qVar) {
        C10784g gVar;
        if (!this.f28958f) {
            String a = mo19502a();
            if (a != null) {
                String str = qVar.f29020g;
                if (TextUtils.equals(str, this.f28957e) || TextUtils.isEmpty(str)) {
                    gVar = this.f28959g;
                } else {
                    gVar = (C10784g) this.f28960h.get(str);
                }
                if (gVar == null) {
                    new StringBuilder("Received call with unknown namespace, ").append(qVar);
                    if (this.f28954b != null) {
                        this.f28954b.mo19567a(mo19502a(), qVar.f29017d, 2);
                    }
                    StringBuilder sb = new StringBuilder("Namespace ");
                    sb.append(qVar.f29020g);
                    sb.append(" unknown.");
                    mo19511b(C10774aa.m21846a((Throwable) new C10808t(-4, sb.toString())), qVar);
                    return;
                }
                C10783f fVar = new C10783f();
                fVar.f28973b = a;
                fVar.f28972a = this.f28953a;
                fVar.f28974c = gVar;
                try {
                    C10787a a2 = gVar.mo19529a(qVar, fVar);
                    if (a2 == null) {
                        new StringBuilder("Received call but not registered, ").append(qVar);
                        if (this.f28954b != null) {
                            this.f28954b.mo19567a(mo19502a(), qVar.f29017d, 2);
                        }
                        StringBuilder sb2 = new StringBuilder("Function ");
                        sb2.append(qVar.f29017d);
                        sb2.append(" is not registered.");
                        mo19511b(C10774aa.m21846a((Throwable) new C10808t(-2, sb2.toString())), qVar);
                        return;
                    }
                    if (a2.f28990a) {
                        mo19511b(a2.f28991b, qVar);
                    }
                    if (this.f28954b != null) {
                        this.f28954b.mo19566a(mo19502a(), qVar.f29017d);
                    }
                } catch (Exception e) {
                    new StringBuilder("call finished with error, ").append(qVar);
                    mo19511b(C10774aa.m21846a((Throwable) e), qVar);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo19503a(C10790j jVar, C10813x xVar) {
        this.f28953a = mo19500a(jVar);
        this.f28955c = jVar.f28997d;
        this.f28954b = jVar.f29002i;
        this.f28959g = new C10784g(jVar, this, xVar);
        this.f28957e = jVar.f29004k;
        mo19509b(jVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo19511b(String str, C10802q qVar) {
        if (!this.f28958f) {
            if (TextUtils.isEmpty(qVar.f29019f)) {
                new StringBuilder("By passing js callback due to empty callback: ").append(str);
                return;
            }
            if (!str.startsWith("{") || !str.endsWith("}")) {
                StringBuilder sb = new StringBuilder("Illegal callback data: ");
                sb.append(str);
                C10789i.m21876a(new IllegalArgumentException(sb.toString()));
            }
            new StringBuilder("Invoking js callback: ").append(qVar.f29019f);
            StringBuilder sb2 = new StringBuilder("{\"__msg_type\":\"callback\",\"__callback_id\":\"");
            sb2.append(qVar.f29019f);
            sb2.append("\",\"__params\":");
            sb2.append(str);
            sb2.append("}");
            mo19506a(sb2.toString(), qVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19506a(String str, C10802q qVar) {
        mo19505a(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <T> void mo19507a(String str, T t) {
        if (!this.f28958f) {
            String a = this.f28955c.mo19538a(t);
            new StringBuilder("Sending js event: ").append(str);
            StringBuilder sb = new StringBuilder("{\"__msg_type\":\"event\",\"__event_id\":\"");
            sb.append(str);
            sb.append("\",\"__params\":");
            sb.append(a);
            sb.append("}");
            mo19505a(sb.toString());
        }
    }
}
