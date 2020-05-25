package com.p888c.p889a.p890a.p891a.p893b;

import android.webkit.WebView;
import com.p888c.p889a.p890a.p891a.p897e.C13426e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.c.a.a.a.b.d */
public final class C13396d {

    /* renamed from: a */
    public final C13402j f34913a;

    /* renamed from: b */
    public final WebView f34914b;

    /* renamed from: c */
    public final String f34915c;

    /* renamed from: d */
    public final String f34916d;

    /* renamed from: e */
    public final String f34917e;

    /* renamed from: f */
    public final C13397e f34918f;

    /* renamed from: g */
    private final List<C13403k> f34919g = new ArrayList();

    /* renamed from: h */
    private final Map<String, C13403k> f34920h = new HashMap();

    private C13396d(C13402j jVar, WebView webView, String str, List<C13403k> list, String str2, String str3, C13397e eVar) {
        this.f34913a = jVar;
        this.f34914b = null;
        this.f34915c = str;
        this.f34918f = eVar;
        if (list != null) {
            this.f34919g.addAll(list);
            for (C13403k kVar : list) {
                this.f34920h.put(UUID.randomUUID().toString(), kVar);
            }
        }
        this.f34917e = null;
        this.f34916d = str3;
    }

    /* renamed from: a */
    public static C13396d m27006a(C13402j jVar, String str, List<C13403k> list, String str2) {
        C13426e.m27071a((Object) jVar, "Partner is null");
        C13426e.m27071a((Object) str, "OM SDK JS script content is null");
        C13426e.m27071a((Object) list, "VerificationScriptResources is null");
        C13396d dVar = new C13396d(jVar, null, str, list, null, null, C13397e.NATIVE);
        return dVar;
    }

    /* renamed from: a */
    public final List<C13403k> mo25094a() {
        return Collections.unmodifiableList(this.f34919g);
    }

    /* renamed from: b */
    public final Map<String, C13403k> mo25095b() {
        return Collections.unmodifiableMap(this.f34920h);
    }
}
