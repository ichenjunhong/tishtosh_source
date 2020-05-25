package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.em */
public final class C16658em {

    /* renamed from: a */
    public final C16654ei f46870a;

    /* renamed from: b */
    private final Map<String, C16654ei> f46871b;

    /* renamed from: a */
    public final void mo31972a(String str, C16654ei eiVar) {
        this.f46871b.put(str, eiVar);
    }

    /* renamed from: a */
    public final Map<String, C16654ei> mo31971a() {
        return Collections.unmodifiableMap(this.f46871b);
    }

    public final String toString() {
        String valueOf = String.valueOf(Collections.unmodifiableMap(this.f46871b));
        String valueOf2 = String.valueOf(this.f46870a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32 + String.valueOf(valueOf2).length());
        sb.append("Properties: ");
        sb.append(valueOf);
        sb.append(" pushAfterEvaluate: ");
        sb.append(valueOf2);
        return sb.toString();
    }
}
