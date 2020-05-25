package com.p683ss.android.ugc.aweme.p1328af.p1329a;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.af.a.d */
public abstract class C22506d implements C22532u {

    /* renamed from: a */
    private final Map<String, String> f60633a;

    /* renamed from: a */
    public final JSONObject mo46845a() {
        boolean z;
        Map<String, String> map = this.f60633a;
        if (map == null || map.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new JSONObject();
        }
        return new JSONObject(this.f60633a);
    }

    public C22506d(Map<String, String> map) {
        this.f60633a = map;
    }
}
