package com.google.android.gms.internal.measurement;

import com.google.android.gms.analytics.C15096j;
import com.google.android.gms.analytics.p1031a.C15085a;
import com.google.android.gms.analytics.p1031a.C15086b;
import com.google.android.gms.analytics.p1031a.C15087c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.d */
public final class C16613d extends C15096j<C16613d> {

    /* renamed from: a */
    public final Map<String, List<C15085a>> f46677a = new HashMap();

    /* renamed from: b */
    public C15086b f46678b;

    /* renamed from: c */
    private final List<C15085a> f46679c = new ArrayList();

    /* renamed from: d */
    private final List<C15087c> f46680d = new ArrayList();

    public final String toString() {
        HashMap hashMap = new HashMap();
        if (!this.f46679c.isEmpty()) {
            hashMap.put("products", this.f46679c);
        }
        if (!this.f46680d.isEmpty()) {
            hashMap.put("promotions", this.f46680d);
        }
        if (!this.f46677a.isEmpty()) {
            hashMap.put("impressions", this.f46677a);
        }
        hashMap.put("productAction", this.f46678b);
        return m31258a((Object) hashMap);
    }

    /* renamed from: a */
    public final List<C15085a> mo31914a() {
        return Collections.unmodifiableList(this.f46679c);
    }

    /* renamed from: b */
    public final List<C15087c> mo31915b() {
        return Collections.unmodifiableList(this.f46680d);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo27841a(C15096j jVar) {
        C16613d dVar = (C16613d) jVar;
        dVar.f46679c.addAll(this.f46679c);
        dVar.f46680d.addAll(this.f46680d);
        for (Entry entry : this.f46677a.entrySet()) {
            String str = (String) entry.getKey();
            for (C15085a aVar : (List) entry.getValue()) {
                if (aVar != null) {
                    String str2 = str == null ? "" : str;
                    if (!dVar.f46677a.containsKey(str2)) {
                        dVar.f46677a.put(str2, new ArrayList());
                    }
                    ((List) dVar.f46677a.get(str2)).add(aVar);
                }
            }
        }
        if (this.f46678b != null) {
            dVar.f46678b = this.f46678b;
        }
    }
}
