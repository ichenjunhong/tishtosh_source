package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.jh */
final class C16799jh extends C16805jn {

    /* renamed from: a */
    private final /* synthetic */ C16796je f47198a;

    private C16799jh(C16796je jeVar) {
        this.f47198a = jeVar;
        super(jeVar, null);
    }

    public final Iterator<Entry<K, V>> iterator() {
        return new C16798jg(this.f47198a, null);
    }

    /* synthetic */ C16799jh(C16796je jeVar, C16797jf jfVar) {
        this(jeVar);
    }
}
