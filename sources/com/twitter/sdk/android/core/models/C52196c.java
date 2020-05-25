package com.twitter.sdk.android.core.models;

import java.util.Collections;
import java.util.Map;

/* renamed from: com.twitter.sdk.android.core.models.c */
public class C52196c {

    /* renamed from: a */
    private final Map<String, Object> f129923a;

    public C52196c() {
        this(Collections.EMPTY_MAP);
    }

    public C52196c(Map<String, Object> map) {
        this.f129923a = Collections.unmodifiableMap(map);
    }

    /* renamed from: a */
    public final <T> T mo108925a(String str) {
        try {
            return this.f129923a.get(str);
        } catch (ClassCastException unused) {
            return null;
        }
    }
}
