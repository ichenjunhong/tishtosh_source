package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.android.gms.analytics.C15096j;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.measurement.i */
public final class C16764i extends C15096j<C16764i> {

    /* renamed from: a */
    public String f47134a;

    /* renamed from: b */
    public String f47135b;

    /* renamed from: c */
    public String f47136c;

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("network", this.f47134a);
        hashMap.put("action", this.f47135b);
        hashMap.put("target", this.f47136c);
        return m31258a((Object) hashMap);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo27841a(C15096j jVar) {
        C16764i iVar = (C16764i) jVar;
        if (!TextUtils.isEmpty(this.f47134a)) {
            iVar.f47134a = this.f47134a;
        }
        if (!TextUtils.isEmpty(this.f47135b)) {
            iVar.f47135b = this.f47135b;
        }
        if (!TextUtils.isEmpty(this.f47136c)) {
            iVar.f47136c = this.f47136c;
        }
    }
}
