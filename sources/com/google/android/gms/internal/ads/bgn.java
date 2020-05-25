package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public final class bgn<T> {

    /* renamed from: a */
    private final Map<String, AtomicReference<T>> f42322a = new HashMap();

    /* renamed from: a */
    public final AtomicReference<T> mo30130a(String str) {
        synchronized (this) {
            if (!this.f42322a.containsKey(str)) {
                this.f42322a.put(str, new AtomicReference());
            }
        }
        return (AtomicReference) this.f42322a.get(str);
    }
}
