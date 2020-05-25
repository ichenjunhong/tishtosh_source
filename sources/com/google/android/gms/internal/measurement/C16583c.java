package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.android.gms.analytics.C15096j;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.measurement.c */
public final class C16583c extends C15096j<C16583c> {

    /* renamed from: a */
    public String f46596a;

    /* renamed from: b */
    public int f46597b;

    /* renamed from: c */
    public int f46598c;

    /* renamed from: d */
    public int f46599d;

    /* renamed from: e */
    public int f46600e;

    /* renamed from: f */
    public int f46601f;

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("language", this.f46596a);
        hashMap.put("screenColors", Integer.valueOf(this.f46597b));
        hashMap.put("screenWidth", Integer.valueOf(this.f46598c));
        hashMap.put("screenHeight", Integer.valueOf(this.f46599d));
        hashMap.put("viewportWidth", Integer.valueOf(this.f46600e));
        hashMap.put("viewportHeight", Integer.valueOf(this.f46601f));
        return m31258a((Object) hashMap);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo27841a(C15096j jVar) {
        C16583c cVar = (C16583c) jVar;
        if (this.f46597b != 0) {
            cVar.f46597b = this.f46597b;
        }
        if (this.f46598c != 0) {
            cVar.f46598c = this.f46598c;
        }
        if (this.f46599d != 0) {
            cVar.f46599d = this.f46599d;
        }
        if (this.f46600e != 0) {
            cVar.f46600e = this.f46600e;
        }
        if (this.f46601f != 0) {
            cVar.f46601f = this.f46601f;
        }
        if (!TextUtils.isEmpty(this.f46596a)) {
            cVar.f46596a = this.f46596a;
        }
    }
}
