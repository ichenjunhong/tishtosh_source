package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.android.gms.analytics.C15096j;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.measurement.f */
public final class C16672f extends C15096j<C16672f> {

    /* renamed from: a */
    public String f46907a;

    /* renamed from: b */
    public boolean f46908b;

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("description", this.f46907a);
        hashMap.put("fatal", Boolean.valueOf(this.f46908b));
        return m31258a((Object) hashMap);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo27841a(C15096j jVar) {
        C16672f fVar = (C16672f) jVar;
        if (!TextUtils.isEmpty(this.f46907a)) {
            fVar.f46907a = this.f46907a;
        }
        if (this.f46908b) {
            fVar.f46908b = this.f46908b;
        }
    }
}
