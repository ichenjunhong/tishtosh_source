package com.p683ss.android.ugc.aweme.account.network;

import com.p683ss.android.common.util.C18922i;
import java.util.Map;
import java.util.Map.Entry;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.network.f */
public final class C22085f {
    /* renamed from: a */
    public static final String m54859a(C18922i iVar, Map<String, String> map) {
        C52711k.m112240b(iVar, "$this$createUrl");
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                iVar.mo38778a((String) entry.getKey(), (String) entry.getValue());
            }
        }
        String a = iVar.mo38774a();
        C52711k.m112236a((Object) a, "build()");
        return a;
    }
}
