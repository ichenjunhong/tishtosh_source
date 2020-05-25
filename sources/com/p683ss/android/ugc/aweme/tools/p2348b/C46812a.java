package com.p683ss.android.ugc.aweme.tools.p2348b;

import com.p683ss.android.ugc.aweme.shortvideo.C42437ay;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.b.a */
public final class C46812a {
    /* renamed from: a */
    public static final JSONObject m101655a(Map<String, String> map) {
        C52711k.m112240b(map, "$this$toAndroidJSONObject");
        C42437ay a = C42437ay.m93202a();
        for (Entry entry : map.entrySet()) {
            a.mo86521a((String) entry.getKey(), (String) entry.getValue());
        }
        JSONObject b = a.mo86522b();
        C52711k.m112236a((Object) b, "builder.build()");
        return b;
    }
}
