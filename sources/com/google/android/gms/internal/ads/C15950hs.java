package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.hs */
final class C15950hs implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C16037ky f45037a;

    /* renamed from: b */
    private final /* synthetic */ Map f45038b;

    /* renamed from: c */
    private final /* synthetic */ C15949hr f45039c;

    C15950hs(C15949hr hrVar, Map map, C16037ky kyVar) {
        this.f45039c = hrVar;
        this.f45038b = map;
        this.f45037a = kyVar;
    }

    public final void run() {
        abv.m32792b("Received Http request.");
        try {
            acd.f40245a.post(new C15951ht(this, this.f45039c.mo31085a(new JSONObject((String) this.f45038b.get("http_request")))));
        } catch (Exception e) {
            abv.m32793b("Error converting request to json.", e);
        }
    }
}
