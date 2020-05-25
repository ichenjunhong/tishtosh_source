package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.wn */
public final class C16350wn implements C15948hq<Object> {
    /* renamed from: a */
    public final void mo27606a(Object obj, Map<String, String> map) {
        String str = (String) map.get("request_id");
        String str2 = "Invalid request: ";
        String valueOf = String.valueOf((String) map.get("errors"));
        abv.m32798e(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        C16341we.f45791c.mo31088a(str);
    }
}
