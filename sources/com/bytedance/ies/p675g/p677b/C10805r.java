package com.bytedance.ies.p675g.p677b;

import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.ies.p675g.p677b.C10779d.C10781b;
import com.bytedance.ies.p675g.p677b.C10791k.C10794b;
import com.bytedance.ies.p675g.p677b.C10805r.C10806a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.g.b.r */
public final class C10805r {

    /* renamed from: a */
    static C10819y f29029a;

    /* renamed from: b */
    public final C10771a f29030b;

    /* renamed from: c */
    public final WebView f29031c;

    /* renamed from: d */
    public C10801p f29032d;

    /* renamed from: e */
    public volatile boolean f29033e = false;

    /* renamed from: f */
    private final C10790j f29034f;

    /* renamed from: g */
    private final List<C10800o> f29035g = new ArrayList();

    /* renamed from: com.bytedance.ies.g.b.r$a */
    public interface C10806a {
        /* renamed from: a */
        void mo19582a();
    }

    /* renamed from: b */
    private void m21926b() {
        if (this.f29033e) {
            C10789i.m21876a(new IllegalStateException("JsBridge2 is already released!!!"));
        }
    }

    /* renamed from: a */
    public final void mo19580a() {
        if (!this.f29033e) {
            this.f29030b.mo19508b();
            this.f29033e = true;
            Iterator it = this.f29035g.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* renamed from: a */
    public static C10790j m21921a(WebView webView) {
        return new C10790j(webView);
    }

    /* renamed from: a */
    public static C10790j m21922a(C10805r rVar) {
        C10790j jVar = new C10790j(rVar.f29034f);
        jVar.f29007n = true;
        jVar.f29001h = false;
        return jVar;
    }

    C10805r(C10790j jVar) {
        this.f29034f = jVar;
        C10813x xVar = null;
        if (jVar.f29001h && f29029a != null) {
            C10819y yVar = f29029a;
            String str = jVar.f29004k;
            if (yVar.f29068a.contains(str) || TextUtils.equals(str, "host")) {
                xVar = yVar.mo19598a(str, null);
            } else {
                StringBuilder sb = new StringBuilder("Namespace: ");
                sb.append(str);
                sb.append(" not registered.");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (jVar.f28994a != null) {
            this.f29030b = new C10775ab();
            this.f29030b.mo19503a(jVar, xVar);
        } else {
            this.f29030b = jVar.f28995b;
            this.f29030b.mo19503a(jVar, xVar);
        }
        this.f29031c = jVar.f28994a;
        this.f29035g.add(jVar.f29003j);
        C10789i.f28993a = jVar.f28999f;
        C10774aa.f28965a = jVar.f29000g;
    }

    /* renamed from: a */
    public static void m21925a(C10791k kVar, C10806a aVar) {
        if (f29029a != null) {
            C10789i.m21876a(new IllegalStateException("enablePermissionCheck should only be called once! "));
            return;
        }
        C10819y yVar = new C10819y(kVar);
        f29029a = yVar;
        yVar.f29069b.mo19551a(yVar.f29071d, null, "application/json", yVar.mo19599a().toString().getBytes(), new C10794b(aVar) {

            /* renamed from: a */
            final /* synthetic */ C10806a f29075a;

            /* renamed from: a */
            public final void mo19563a(Throwable th) {
                new StringBuilder("Fetch configurations failed, url: ").append(C10819y.this.f29071d);
            }

            /* renamed from: a */
            public final void mo19562a(final String str) {
                new StringBuilder("Fetch configurations succeed, url: ").append(C10819y.this.f29071d);
                C10819y.this.f29072e.execute(new Runnable() {
                    public final void run() {
                        C10819y yVar = C10819y.this;
                        String str = str;
                        try {
                            JSONArray jSONArray = new JSONObject(str).getJSONObject("data").getJSONObject("packages").getJSONArray(yVar.f29069b.mo19555e());
                            for (int i = 0; i < jSONArray.length(); i++) {
                                JSONObject jSONObject = jSONArray.getJSONObject(i);
                                String optString = jSONObject.optString("channel");
                                if (TextUtils.equals(optString, "_jsb_auth")) {
                                    yVar.mo19598a("host", jSONObject);
                                } else if (optString.startsWith("_jsb_auth.")) {
                                    yVar.mo19598a(optString.replace("_jsb_auth.", ""), jSONObject);
                                } else {
                                    new StringBuilder("Malformed config: ").append(jSONObject.toString());
                                }
                            }
                        } catch (JSONException unused) {
                            StringBuilder sb = new StringBuilder("Parse configurations failed, url: ");
                            sb.append(yVar.f29071d);
                            sb.append(", response: ");
                            sb.append(str);
                        }
                        C10819y.this.f29073f.post(new Runnable() {
                            public final void run() {
                                if (C108201.this.f29075a != null) {
                                    C108201.this.f29075a.mo19582a();
                                }
                                for (C10823a b : C10819y.this.f29070c) {
                                    b.mo19535b();
                                }
                            }
                        });
                    }
                });
            }

            {
                this.f29075a = r2;
            }
        });
    }

    /* renamed from: a */
    public final C10805r mo19578a(String str, C10781b bVar) {
        return m21923a(str, (String) null, bVar);
    }

    /* renamed from: a */
    public final C10805r mo19579a(String str, C10782e<?, ?> eVar) {
        return m21924a(str, (String) null, eVar);
    }

    /* renamed from: a */
    public final <T> void mo19581a(String str, T t) {
        m21926b();
        this.f29030b.mo19507a(str, t);
    }

    /* renamed from: a */
    private C10805r m21923a(String str, String str2, C10781b bVar) {
        m21926b();
        this.f29030b.f28959g.mo19532a(str, bVar);
        if (this.f29032d != null) {
            this.f29032d.mo19568a(str);
        }
        return this;
    }

    /* renamed from: a */
    private C10805r m21924a(String str, String str2, C10782e<?, ?> eVar) {
        m21926b();
        this.f29030b.f28959g.mo19533a(str, eVar);
        if (this.f29032d != null) {
            this.f29032d.mo19568a(str);
        }
        return this;
    }
}
