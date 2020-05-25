package com.p683ss.android.ugc.aweme.p1328af.p1329a;

import android.net.Uri;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2648k.C52760c;

/* renamed from: com.ss.android.ugc.aweme.af.a.l */
public final class C22521l extends C22476a implements C22525o, C22526p {

    /* renamed from: g */
    public static final Map<C52760c<? extends C22530t>, C22483ac<? extends C22530t>> f60659g = new LinkedHashMap();

    /* renamed from: h */
    public static final C22522a f60660h = new C22522a(null);

    /* renamed from: d */
    public C22533v f60661d;

    /* renamed from: e */
    public final C22482ab f60662e;

    /* renamed from: f */
    public final C22484ad f60663f;

    /* renamed from: com.ss.android.ugc.aweme.af.a.l$a */
    public static final class C22522a {
        private C22522a() {
        }

        public /* synthetic */ C22522a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m55648a(C22483ac<? extends C22530t> acVar) {
            C22521l.f60659g.put(acVar.f60588a, acVar);
        }
    }

    /* renamed from: b */
    public final void mo46784b() {
        super.mo46784b();
        m55636a((C22533v) null);
    }

    /* renamed from: c */
    public final String mo46875c() {
        return this.f60663f.mo46818e();
    }

    /* renamed from: d */
    public final boolean mo46876d() {
        return this.f60663f.mo46816c();
    }

    /* renamed from: e */
    public final List<String> mo46877e() {
        return this.f60663f.mo46817d();
    }

    /* renamed from: f */
    public final String mo46878f() {
        return this.f60663f.mo46814a();
    }

    /* renamed from: g */
    public final boolean mo46879g() {
        return this.f60663f.mo46815b();
    }

    static {
        C22522a.m55648a(C22513i.f60641a);
        C22522a.m55648a(C22536y.f60670a);
    }

    /* renamed from: a */
    private void m55636a(C22533v vVar) {
        C22533v vVar2 = this.f60661d;
        if (vVar2 != null) {
            vVar2.mo46784b();
        }
        if (vVar != null) {
            vVar.mo46783a(mo46782a(), this.f60538b);
        }
        this.f60661d = vVar;
    }

    /* renamed from: a */
    public final <T extends C22530t> T mo46870a(Class<T> cls) {
        C52711k.m112240b(cls, "iApi");
        T t = this.f60661d;
        if (t != null) {
            if (!cls.isAssignableFrom(t.getClass())) {
                t = null;
            }
            if (t != null) {
                if (t != null) {
                    return (C22530t) t;
                }
                throw new C52857u("null cannot be cast to non-null type T");
            }
        }
        return null;
    }

    public C22521l(C22482ab abVar, C22484ad adVar) {
        C52711k.m112240b(abVar, "reportor");
        C52711k.m112240b(adVar, "settings");
        this.f60662e = abVar;
        this.f60663f = adVar;
    }

    /* renamed from: a */
    public final void mo46874a(String str, JSONObject jSONObject) {
        C52711k.m112240b(str, "service");
        C52711k.m112240b(jSONObject, "data");
        try {
            this.f60662e.mo46810a(str, jSONObject);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public final void mo46872a(Exception exc, String str, Map<String, String> map) {
        C52711k.m112240b(exc, "e");
        C52711k.m112240b(str, "message");
        C52711k.m112240b(map, "data");
        try {
            this.f60662e.mo46808a(exc, str, map);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public final void mo46871a(Uri uri, View view, Map<String, String> map) {
        boolean z;
        C52711k.m112240b(uri, "uri");
        C52711k.m112240b(map, "customCategories");
        C22509g gVar = new C22509g();
        gVar.mo46847a(C22525o.class, new C22492ah(this));
        gVar.mo46847a(C22533v.class, new C22508f(this.f60661d));
        gVar.mo46847a(View.class, new C22492ah(view));
        gVar.mo46847a(C22526p.class, new C22492ah(this));
        C22533v vVar = null;
        C22530t tVar = null;
        for (Entry value : f60659g.entrySet()) {
            tVar = (C22530t) ((C22483ac) value.getValue()).f60589b.invoke(uri, gVar, map);
            if (tVar != null) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        if (tVar != null) {
            if (tVar instanceof C22533v) {
                vVar = tVar;
            }
            if (vVar != null) {
                if (vVar != null) {
                    m55636a(vVar);
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.hybrid.monitor.IUnitSession");
            }
        }
    }

    /* renamed from: a */
    public final void mo46873a(String str, Integer num, JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            this.f60662e.mo46809a(str, num, jSONObject, jSONObject2, false);
        } catch (Exception unused) {
        }
    }
}
