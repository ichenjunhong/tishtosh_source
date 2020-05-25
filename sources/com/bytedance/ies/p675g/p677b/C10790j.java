package com.bytedance.ies.p675g.p677b;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.ies.p675g.p677b.C10791k.C10795c;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: com.bytedance.ies.g.b.j */
public final class C10790j {

    /* renamed from: a */
    public WebView f28994a;

    /* renamed from: b */
    public C10771a f28995b;

    /* renamed from: c */
    public String f28996c = "IESJSBridge";

    /* renamed from: d */
    public C10788h f28997d;

    /* renamed from: e */
    public Context f28998e;

    /* renamed from: f */
    public boolean f28999f;

    /* renamed from: g */
    public boolean f29000g;

    /* renamed from: h */
    public boolean f29001h;

    /* renamed from: i */
    public C10799n f29002i;

    /* renamed from: j */
    public C10800o f29003j;

    /* renamed from: k */
    public String f29004k = "host";

    /* renamed from: l */
    public final Set<String> f29005l = new LinkedHashSet();

    /* renamed from: m */
    public final Set<String> f29006m = new LinkedHashSet();

    /* renamed from: n */
    public boolean f29007n;

    /* renamed from: o */
    public boolean f29008o;

    /* renamed from: p */
    C10795c f29009p;

    C10790j() {
    }

    /* renamed from: b */
    private void m21877b() {
        if ((this.f28994a == null && !this.f29007n && this.f28995b == null) || ((TextUtils.isEmpty(this.f28996c) && this.f28994a != null) || this.f28997d == null)) {
            throw new IllegalArgumentException("Requested arguments aren't set properly when building JsBridge.");
        }
    }

    /* renamed from: a */
    public final C10805r mo19546a() {
        m21877b();
        return new C10805r(this);
    }

    /* renamed from: a */
    public final C10790j mo19539a(Context context) {
        this.f28998e = context;
        return this;
    }

    /* renamed from: b */
    public final C10790j mo19548b(boolean z) {
        this.f28999f = z;
        return this;
    }

    /* renamed from: c */
    public final C10790j mo19549c(boolean z) {
        this.f29000g = true;
        return this;
    }

    /* renamed from: a */
    public final C10790j mo19540a(C10795c cVar) {
        this.f29009p = cVar;
        return this;
    }

    /* renamed from: b */
    public final C10790j mo19547b(Collection<String> collection) {
        this.f29006m.addAll(collection);
        return this;
    }

    /* renamed from: a */
    public final C10790j mo19541a(C10797l lVar) {
        this.f28997d = C10788h.m21872a(lVar);
        return this;
    }

    /* renamed from: a */
    public final C10790j mo19542a(C10799n nVar) {
        this.f29002i = nVar;
        return this;
    }

    C10790j(WebView webView) {
        this.f28994a = webView;
    }

    /* renamed from: a */
    public final C10790j mo19543a(String str) {
        this.f28996c = str;
        return this;
    }

    C10790j(C10790j jVar) {
        this.f28994a = jVar.f28994a;
        this.f28996c = jVar.f28996c;
        this.f28997d = jVar.f28997d;
        this.f28998e = jVar.f28998e;
        this.f28999f = jVar.f28999f;
        this.f29000g = jVar.f29000g;
        this.f29001h = jVar.f29001h;
        this.f29002i = jVar.f29002i;
        this.f29004k = jVar.f29004k;
        this.f29005l.addAll(jVar.f29005l);
        this.f29006m.addAll(jVar.f29006m);
        this.f29007n = jVar.f29007n;
        this.f28995b = jVar.f28995b;
        this.f29003j = jVar.f29003j;
        this.f29008o = jVar.f29008o;
    }

    /* renamed from: a */
    public final C10790j mo19544a(Collection<String> collection) {
        this.f29005l.addAll(collection);
        return this;
    }

    /* renamed from: a */
    public final C10790j mo19545a(boolean z) {
        this.f29001h = true;
        return this;
    }
}
