package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.internal.ads.C16299uq;
import com.google.android.gms.internal.ads.C16438zu;
import com.google.android.gms.internal.ads.C16439zv;
import com.google.android.gms.internal.ads.C16443zz;
import com.google.android.gms.internal.ads.ahl;
import com.google.android.gms.internal.ads.aht;
import com.google.android.gms.internal.ads.akl;
import com.google.android.gms.internal.ads.ald;
import com.google.android.gms.internal.ads.byh;

@C16299uq
/* renamed from: com.google.android.gms.ads.internal.bt */
public final class C14986bt {

    /* renamed from: a */
    public final ald f38689a;

    /* renamed from: b */
    public final ahl f38690b;

    /* renamed from: c */
    public final C16443zz f38691c;

    /* renamed from: d */
    public final byh f38692d;

    private C14986bt(ald ald, ahl ahl, C16443zz zzVar, byh byh) {
        this.f38689a = ald;
        this.f38690b = ahl;
        this.f38691c = zzVar;
        this.f38692d = byh;
    }

    /* renamed from: a */
    public static C14986bt m30940a(Context context) {
        return new C14986bt(new akl(), new aht(), new C16438zu(new C16439zv()), new byh(context));
    }
}
