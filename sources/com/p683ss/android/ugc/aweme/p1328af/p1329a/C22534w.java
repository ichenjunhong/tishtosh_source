package com.p683ss.android.ugc.aweme.p1328af.p1329a;

import android.net.Uri;
import android.net.Uri.Builder;
import java.util.Map;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.af.a.w */
public final class C22534w extends C22506d {

    /* renamed from: a */
    public final Uri f60664a;

    /* renamed from: b */
    public final String f60665b;

    /* renamed from: b */
    public final String mo46880b() {
        String uri = new Builder().scheme(this.f60664a.getScheme()).authority(this.f60664a.getAuthority()).path(this.f60664a.getPath()).build().toString();
        C52711k.m112236a((Object) uri, "Uri.Builder()\n          …      .build().toString()");
        return uri;
    }

    public final JSONObject getFormatData() {
        JSONObject jSONObject = new JSONObject();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f60665b);
        sb.append("host");
        jSONObject.put(sb.toString(), new Builder().scheme(this.f60664a.getScheme()).authority(this.f60664a.getAuthority()).build());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f60665b);
        sb2.append(LeakCanaryFileProvider.f132050j);
        jSONObject.put(sb2.toString(), this.f60664a.getPath());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f60665b);
        sb3.append("url");
        jSONObject.put(sb3.toString(), new Builder().scheme(this.f60664a.getScheme()).authority(this.f60664a.getAuthority()).path(this.f60664a.getPath()).build());
        C22507e.m55596a(jSONObject, mo46845a());
        return jSONObject;
    }

    private C22534w(Uri uri, String str, Map<String, String> map) {
        C52711k.m112240b(uri, "uri");
        C52711k.m112240b(str, "prefix");
        super(map);
        this.f60664a = uri;
        this.f60665b = str;
    }

    public /* synthetic */ C22534w(Uri uri, String str, Map map, int i, C52707g gVar) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            map = null;
        }
        this(uri, str, map);
    }
}
