package com.p683ss.android.ugc.aweme.p1328af.p1329a;

import android.net.Uri;
import android.net.Uri.Builder;
import java.util.Map;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.af.a.x */
public final class C22535x extends C22506d {

    /* renamed from: a */
    public final C22534w f60666a;

    /* renamed from: b */
    public C22534w f60667b;

    /* renamed from: c */
    public Uri f60668c;

    /* renamed from: d */
    public final Uri f60669d;

    public final JSONObject getFormatData() {
        JSONObject jSONObject = new JSONObject();
        C22507e.m55596a(jSONObject, this.f60667b.getFormatData());
        C22507e.m55596a(jSONObject, this.f60666a.getFormatData());
        C22507e.m55596a(jSONObject, mo46845a());
        return jSONObject;
    }

    /* renamed from: b */
    public final String mo46880b() {
        String uri = new Builder().scheme(this.f60666a.f60664a.getScheme()).authority(this.f60666a.f60664a.getAuthority()).path(this.f60666a.f60664a.getPath()).build().toString();
        C52711k.m112236a((Object) uri, "Uri.Builder()\n          …      .build().toString()");
        return uri;
    }

    public C22535x(Uri uri, Uri uri2, Map<String, String> map) {
        C52711k.m112240b(uri, "referrerUri");
        C52711k.m112240b(uri2, "pageUri");
        super(map);
        this.f60669d = uri;
        C22534w wVar = new C22534w(this.f60669d, "referrer_", null, 4, null);
        this.f60666a = wVar;
        C22534w wVar2 = new C22534w(uri2, "page_", null, 4, null);
        this.f60667b = wVar2;
        this.f60668c = uri2;
    }
}
