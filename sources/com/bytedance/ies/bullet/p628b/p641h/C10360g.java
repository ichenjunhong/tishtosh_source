package com.bytedance.ies.bullet.p628b.p641h;

import android.net.Uri;
import android.net.Uri.Builder;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.bullet.b.h.g */
public final class C10360g implements C10359f {

    /* renamed from: a */
    public final Uri f27797a;

    /* renamed from: b */
    public final String f27798b;

    /* renamed from: b */
    public final String mo18433b() {
        String uri = new Builder().scheme(this.f27797a.getScheme()).authority(this.f27797a.getAuthority()).path(this.f27797a.getPath()).build().toString();
        C52711k.m112236a((Object) uri, "Uri.Builder()\n          …      .build().toString()");
        return uri;
    }

    /* renamed from: a */
    public final JSONObject mo18402a() {
        boolean z;
        String str = this.f27798b;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('_');
            str = sb.toString();
        }
        JSONObject jSONObject = new JSONObject();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("host");
        jSONObject.put(sb2.toString(), new Builder().scheme(this.f27797a.getScheme()).authority(this.f27797a.getAuthority()).build());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(LeakCanaryFileProvider.f132050j);
        jSONObject.put(sb3.toString(), this.f27797a.getPath());
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str);
        sb4.append("url");
        jSONObject.put(sb4.toString(), new Builder().scheme(this.f27797a.getScheme()).authority(this.f27797a.getAuthority()).path(this.f27797a.getPath()).build());
        return jSONObject;
    }

    public C10360g(Uri uri, String str) {
        C52711k.m112240b(uri, "uri");
        C52711k.m112240b(str, "prefix");
        this.f27797a = uri;
        this.f27798b = str;
    }

    public /* synthetic */ C10360g(Uri uri, String str, int i, C52707g gVar) {
        this(uri, "");
    }
}
