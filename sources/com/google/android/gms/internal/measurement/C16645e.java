package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.android.gms.analytics.C15096j;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.measurement.e */
public final class C16645e extends C15096j<C16645e> {

    /* renamed from: a */
    public String f46779a;

    /* renamed from: b */
    public String f46780b;

    /* renamed from: c */
    public String f46781c;

    /* renamed from: d */
    public long f46782d;

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("category", this.f46779a);
        hashMap.put("action", this.f46780b);
        hashMap.put("label", this.f46781c);
        hashMap.put("value", Long.valueOf(this.f46782d));
        return m31258a((Object) hashMap);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo27841a(C15096j jVar) {
        C16645e eVar = (C16645e) jVar;
        if (!TextUtils.isEmpty(this.f46779a)) {
            eVar.f46779a = this.f46779a;
        }
        if (!TextUtils.isEmpty(this.f46780b)) {
            eVar.f46780b = this.f46780b;
        }
        if (!TextUtils.isEmpty(this.f46781c)) {
            eVar.f46781c = this.f46781c;
        }
        if (this.f46782d != 0) {
            eVar.f46782d = this.f46782d;
        }
    }
}
