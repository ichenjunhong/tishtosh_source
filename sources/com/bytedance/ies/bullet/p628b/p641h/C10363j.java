package com.bytedance.ies.bullet.p628b.p641h;

import android.net.Uri;
import android.net.Uri.Builder;
import com.bytedance.ies.bullet.p628b.p629a.C10240c;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.bullet.b.h.j */
public final class C10363j implements C10359f {

    /* renamed from: e */
    public static final C10364a f27802e = new C10364a(null);

    /* renamed from: a */
    public final C10360g f27803a = new C10360g(this.f27806d, "");

    /* renamed from: b */
    public C10360g f27804b;

    /* renamed from: c */
    public Uri f27805c;

    /* renamed from: d */
    public final Uri f27806d;

    /* renamed from: com.bytedance.ies.bullet.b.h.j$a */
    public static final class C10364a {
        private C10364a() {
        }

        public /* synthetic */ C10364a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final JSONObject mo18402a() {
        JSONObject jSONObject = new JSONObject();
        C10240c.m20716a(jSONObject, this.f27804b.mo18402a());
        C10240c.m20716a(jSONObject, this.f27803a.mo18402a());
        return jSONObject;
    }

    /* renamed from: b */
    public final String mo18433b() {
        String uri = new Builder().scheme(this.f27806d.getScheme()).authority(this.f27806d.getAuthority()).path(this.f27806d.getPath()).build().toString();
        C52711k.m112236a((Object) uri, "Uri.Builder()\n          …      .build().toString()");
        return uri;
    }

    public C10363j(Uri uri, Uri uri2) {
        C52711k.m112240b(uri, "referrerUri");
        C52711k.m112240b(uri2, "pageUri");
        this.f27806d = uri;
        this.f27804b = new C10360g(uri2, "page");
        this.f27805c = uri2;
    }
}
