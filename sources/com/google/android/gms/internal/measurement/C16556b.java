package com.google.android.gms.internal.measurement;

import com.google.android.gms.analytics.C15096j;
import com.google.android.gms.common.internal.C15464q;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.b */
public final class C16556b extends C15096j<C16556b> {

    /* renamed from: a */
    private final Map<String, Object> f46502a = new HashMap();

    public final String toString() {
        return m31258a((Object) this.f46502a);
    }

    /* renamed from: a */
    public final void mo31821a(String str, String str2) {
        C15464q.m32125a(str);
        if (str != null && str.startsWith("&")) {
            str = str.substring(1);
        }
        C15464q.m32126a(str, (Object) "Name can not be empty or \"&\"");
        this.f46502a.put(str, str2);
    }

    /* renamed from: a */
    public final Map<String, Object> mo31820a() {
        return Collections.unmodifiableMap(this.f46502a);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo27841a(C15096j jVar) {
        C16556b bVar = (C16556b) jVar;
        C15464q.m32123a(bVar);
        bVar.f46502a.putAll(this.f46502a);
    }
}
