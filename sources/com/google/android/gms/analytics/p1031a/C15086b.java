package com.google.android.gms.analytics.p1031a;

import com.google.android.gms.analytics.C15096j;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.analytics.a.b */
public final class C15086b {

    /* renamed from: a */
    private Map<String, String> f38946a;

    /* renamed from: a */
    public final Map<String, String> mo27824a() {
        return new HashMap(this.f38946a);
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        for (Entry entry : this.f38946a.entrySet()) {
            if (((String) entry.getKey()).startsWith("&")) {
                hashMap.put(((String) entry.getKey()).substring(1), (String) entry.getValue());
            } else {
                hashMap.put((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return C15096j.m31260a((Map) hashMap);
    }
}
