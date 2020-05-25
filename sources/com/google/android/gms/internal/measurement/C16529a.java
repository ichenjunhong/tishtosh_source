package com.google.android.gms.internal.measurement;

import com.google.android.gms.analytics.C15096j;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.a */
public final class C16529a extends C15096j<C16529a> {

    /* renamed from: a */
    private Map<Integer, Double> f46446a = new HashMap(4);

    public final String toString() {
        HashMap hashMap = new HashMap();
        for (Entry entry : this.f46446a.entrySet()) {
            String valueOf = String.valueOf(entry.getKey());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 6);
            sb.append("metric");
            sb.append(valueOf);
            hashMap.put(sb.toString(), entry.getValue());
        }
        return m31258a((Object) hashMap);
    }

    /* renamed from: a */
    public final Map<Integer, Double> mo31756a() {
        return Collections.unmodifiableMap(this.f46446a);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo27841a(C15096j jVar) {
        ((C16529a) jVar).f46446a.putAll(this.f46446a);
    }
}
