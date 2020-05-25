package com.p888c.p889a.p890a.p891a.p899g;

import android.webkit.WebView;
import com.p888c.p889a.p890a.p891a.p893b.C13390a;
import com.p888c.p889a.p890a.p891a.p893b.C13396d;
import com.p888c.p889a.p890a.p891a.p893b.C13403k;
import com.p888c.p889a.p890a.p891a.p893b.C13404l;
import com.p888c.p889a.p890a.p891a.p893b.p894a.C13391a;
import com.p888c.p889a.p890a.p891a.p895c.C13411d;
import com.p888c.p889a.p890a.p891a.p895c.C13412e;
import com.p888c.p889a.p890a.p891a.p897e.C13421a;
import com.p888c.p889a.p890a.p891a.p897e.C13422b;
import com.p888c.p889a.p890a.p891a.p897e.C13425d;
import com.p888c.p889a.p890a.p891a.p898f.C13429b;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.c.a.a.a.g.a */
public abstract class C13430a {

    /* renamed from: a */
    public C13390a f34982a;

    /* renamed from: b */
    public C13391a f34983b;

    /* renamed from: c */
    public C13431a f34984c;

    /* renamed from: d */
    public long f34985d;

    /* renamed from: e */
    private C13429b f34986e = new C13429b(null);

    /* renamed from: com.c.a.a.a.g.a$a */
    public enum C13431a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public C13430a() {
        mo25133d();
    }

    /* renamed from: e */
    private boolean m27079e() {
        return this.f34986e.get() != null;
    }

    /* renamed from: a */
    public void mo25124a() {
    }

    /* renamed from: a */
    public final void mo25125a(float f) {
        C13412e.m27034a().mo25113a(mo25132c(), f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo25126a(WebView webView) {
        this.f34986e = new C13429b(webView);
    }

    /* renamed from: a */
    public void mo25127a(C13404l lVar, C13396d dVar) {
        mo25128a(lVar, dVar, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25128a(C13404l lVar, C13396d dVar, JSONObject jSONObject) {
        String d = lVar.mo25101d();
        JSONObject jSONObject2 = new JSONObject();
        C13422b.m27062a(jSONObject2, "environment", "app");
        C13422b.m27062a(jSONObject2, "adSessionType", dVar.f34918f);
        C13422b.m27062a(jSONObject2, "deviceInfo", C13421a.m27056a());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C13422b.m27062a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C13422b.m27062a(jSONObject3, "partnerName", dVar.f34913a.f34930a);
        C13422b.m27062a(jSONObject3, "partnerVersion", dVar.f34913a.f34931b);
        C13422b.m27062a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C13422b.m27062a(jSONObject4, "libraryVersion", "1.3.0-Bytedance");
        C13422b.m27062a(jSONObject4, "appId", C13411d.m27033a().f34962a.getApplicationContext().getPackageName());
        C13422b.m27062a(jSONObject2, "app", jSONObject4);
        if (dVar.f34917e != null) {
            C13422b.m27062a(jSONObject2, "contentUrl", dVar.f34917e);
        }
        if (dVar.f34916d != null) {
            C13422b.m27062a(jSONObject2, "customReferenceData", dVar.f34916d);
        }
        JSONObject jSONObject5 = new JSONObject();
        for (C13403k kVar : dVar.mo25094a()) {
            C13422b.m27062a(jSONObject5, kVar.f34932a, kVar.f34934c);
        }
        C13412e.m27034a().mo25115a(mo25132c(), d, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public final void mo25129a(String str) {
        C13412e.m27034a().mo25114a(mo25132c(), str, (JSONObject) null);
    }

    /* renamed from: a */
    public final void mo25130a(boolean z) {
        if (m27079e()) {
            C13412e.m27034a().mo25118c(mo25132c(), z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: b */
    public void mo25131b() {
        this.f34986e.clear();
    }

    /* renamed from: c */
    public final WebView mo25132c() {
        return (WebView) this.f34986e.get();
    }

    /* renamed from: d */
    public final void mo25133d() {
        this.f34985d = C13425d.m27069a();
        this.f34984c = C13431a.AD_STATE_IDLE;
    }
}
