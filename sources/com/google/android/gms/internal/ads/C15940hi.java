package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.hi */
final class C15940hi implements C15948hq<Object> {
    C15940hi() {
    }

    /* renamed from: a */
    public final void mo27606a(Object obj, Map<String, String> map) {
        String str = "Received log message: ";
        String valueOf = String.valueOf((String) map.get("string"));
        abv.m32796d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }
}
