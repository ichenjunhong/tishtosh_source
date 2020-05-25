package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.android.gms.analytics.C15096j;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.measurement.j */
public final class C16791j extends C15096j<C16791j> {

    /* renamed from: a */
    public String f47180a;

    /* renamed from: b */
    public long f47181b;

    /* renamed from: c */
    public String f47182c;

    /* renamed from: d */
    public String f47183d;

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("variableName", this.f47180a);
        hashMap.put("timeInMillis", Long.valueOf(this.f47181b));
        hashMap.put("category", this.f47182c);
        hashMap.put("label", this.f47183d);
        return m31258a((Object) hashMap);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo27841a(C15096j jVar) {
        C16791j jVar2 = (C16791j) jVar;
        if (!TextUtils.isEmpty(this.f47180a)) {
            jVar2.f47180a = this.f47180a;
        }
        if (this.f47181b != 0) {
            jVar2.f47181b = this.f47181b;
        }
        if (!TextUtils.isEmpty(this.f47182c)) {
            jVar2.f47182c = this.f47182c;
        }
        if (!TextUtils.isEmpty(this.f47183d)) {
            jVar2.f47183d = this.f47183d;
        }
    }
}
