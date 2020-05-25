package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class btb {

    /* renamed from: a */
    private final Map<String, String> f43829a = new HashMap();

    /* renamed from: b */
    private Map<String, String> f43830b;

    /* renamed from: a */
    public final synchronized Map<String, String> mo30676a() {
        if (this.f43830b == null) {
            this.f43830b = Collections.unmodifiableMap(new HashMap(this.f43829a));
        }
        return this.f43830b;
    }
}
