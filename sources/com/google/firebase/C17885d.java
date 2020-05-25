package com.google.firebase;

import com.google.android.gms.common.internal.C15462p;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.util.C15528s;

/* renamed from: com.google.firebase.d */
public final class C17885d {

    /* renamed from: a */
    public final String f49688a;

    /* renamed from: b */
    public final String f49689b;

    /* renamed from: c */
    public final String f49690c;

    /* renamed from: d */
    public final String f49691d;

    /* renamed from: e */
    public final String f49692e;

    /* renamed from: f */
    public final String f49693f;

    /* renamed from: g */
    public final String f49694g;

    public final int hashCode() {
        return C15462p.m32118a(this.f49689b, this.f49688a, this.f49690c, this.f49691d, this.f49692e, this.f49693f, this.f49694g);
    }

    public final String toString() {
        return C15462p.m32119a((Object) this).mo28449a("applicationId", this.f49689b).mo28449a("apiKey", this.f49688a).mo28449a("databaseUrl", this.f49690c).mo28449a("gcmSenderId", this.f49692e).mo28449a("storageBucket", this.f49693f).mo28449a("projectId", this.f49694g).toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17885d)) {
            return false;
        }
        C17885d dVar = (C17885d) obj;
        if (!C15462p.m32120a(this.f49689b, dVar.f49689b) || !C15462p.m32120a(this.f49688a, dVar.f49688a) || !C15462p.m32120a(this.f49690c, dVar.f49690c) || !C15462p.m32120a(this.f49691d, dVar.f49691d) || !C15462p.m32120a(this.f49692e, dVar.f49692e) || !C15462p.m32120a(this.f49693f, dVar.f49693f) || !C15462p.m32120a(this.f49694g, dVar.f49694g)) {
            return false;
        }
        return true;
    }

    C17885d(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C15464q.m32130a(!C15528s.m32308a(str), (Object) "ApplicationId must be set.");
        this.f49689b = str;
        this.f49688a = str2;
        this.f49690c = str3;
        this.f49691d = str4;
        this.f49692e = str5;
        this.f49693f = str6;
        this.f49694g = str7;
    }
}
