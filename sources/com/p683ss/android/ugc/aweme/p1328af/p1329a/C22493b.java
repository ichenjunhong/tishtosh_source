package com.p683ss.android.ugc.aweme.p1328af.p1329a;

import android.net.Uri;
import android.net.Uri.Builder;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONObject;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.af.a.b */
public final class C22493b implements C22527q {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f60606a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C22493b.class), "uri", "getUri()Landroid/net/Uri;"))};

    /* renamed from: b */
    public final String f60607b;

    /* renamed from: c */
    public final String f60608c;

    /* renamed from: d */
    public final String f60609d;

    /* renamed from: e */
    private final C52668f f60610e = C52732g.m112286a(C52757k.NONE, new C22494a(this));

    /* renamed from: com.ss.android.ugc.aweme.af.a.b$a */
    static final class C22494a extends C52712l implements C52670a<Uri> {

        /* renamed from: a */
        final /* synthetic */ C22493b f60611a;

        C22494a(C22493b bVar) {
            this.f60611a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Uri.parse(this.f60611a.f60607b);
        }
    }

    /* renamed from: a */
    private Uri m55589a() {
        return (Uri) this.f60610e.getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f60609d, (java.lang.Object) r3.f60609d) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.p1328af.p1329a.C22493b
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.af.a.b r3 = (com.p683ss.android.ugc.aweme.p1328af.p1329a.C22493b) r3
            java.lang.String r0 = r2.f60607b
            java.lang.String r1 = r3.f60607b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f60608c
            java.lang.String r1 = r3.f60608c
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f60609d
            java.lang.String r3 = r3.f60609d
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            return r3
        L_0x0029:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1328af.p1329a.C22493b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f60607b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f60608c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f60609d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ApiRequest(url=");
        sb.append(this.f60607b);
        sb.append(", method=");
        sb.append(this.f60608c);
        sb.append(", body=");
        sb.append(this.f60609d);
        sb.append(")");
        return sb.toString();
    }

    public final JSONObject getFormatData() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("host", new Builder().scheme(m55589a().getScheme()).authority(m55589a().getAuthority()).build());
        jSONObject.put(LeakCanaryFileProvider.f132050j, m55589a().getPath());
        jSONObject.put("url", new Builder().scheme(m55589a().getScheme()).authority(m55589a().getAuthority()).path(m55589a().getPath()).build());
        jSONObject.put("method", this.f60608c);
        return jSONObject;
    }

    public C22493b(String str, String str2, String str3) {
        C52711k.m112240b(str, "url");
        C52711k.m112240b(str2, "method");
        C52711k.m112240b(str3, "body");
        this.f60607b = str;
        this.f60608c = str2;
        this.f60609d = str3;
    }
}
