package com.google.android.gms.measurement.internal;

import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.e */
final class C17088e implements Iterator<String> {

    /* renamed from: a */
    private Iterator<String> f48228a = this.f48229b.f48474a.keySet().iterator();

    /* renamed from: b */
    private final /* synthetic */ zzad f48229b;

    C17088e(zzad zzad) {
        this.f48229b = zzad;
    }

    public final boolean hasNext() {
        return this.f48228a.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }

    public final /* synthetic */ Object next() {
        return (String) this.f48228a.next();
    }
}
