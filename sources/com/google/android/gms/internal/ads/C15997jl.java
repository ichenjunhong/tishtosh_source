package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C14986bt;
import com.google.android.gms.ads.internal.C15002n;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.jl */
public final class C15997jl {

    /* renamed from: a */
    final Context f45083a;

    /* renamed from: b */
    final C16134on f45084b;

    /* renamed from: c */
    final zzbgz f45085c;

    /* renamed from: d */
    final C14986bt f45086d;

    C15997jl(Context context, C16134on onVar, zzbgz zzbgz, C14986bt btVar) {
        this.f45083a = context;
        this.f45084b = onVar;
        this.f45085c = zzbgz;
        this.f45086d = btVar;
    }

    /* renamed from: a */
    public final C15002n mo31115a(String str) {
        C15002n nVar = new C15002n(this.f45083a, new zzyz(), str, this.f45084b, this.f45085c, this.f45086d);
        return nVar;
    }

    /* renamed from: a */
    public final Context mo31114a() {
        return this.f45083a.getApplicationContext();
    }
}
