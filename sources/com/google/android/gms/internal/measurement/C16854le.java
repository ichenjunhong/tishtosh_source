package com.google.android.gms.internal.measurement;

import com.google.android.gms.analytics.C15096j;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.le */
public final class C16854le extends C15096j<C16854le> {

    /* renamed from: a */
    private Map<Integer, String> f47319a = new HashMap(4);

    public final String toString() {
        HashMap hashMap = new HashMap();
        for (Entry entry : this.f47319a.entrySet()) {
            String valueOf = String.valueOf(entry.getKey());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
            sb.append("dimension");
            sb.append(valueOf);
            hashMap.put(sb.toString(), entry.getValue());
        }
        return m31258a((Object) hashMap);
    }

    /* renamed from: a */
    public final Map<Integer, String> mo32483a() {
        return Collections.unmodifiableMap(this.f47319a);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo27841a(C15096j jVar) {
        ((C16854le) jVar).f47319a.putAll(this.f47319a);
    }
}
