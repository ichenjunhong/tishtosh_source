package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.bh */
final class C17015bh implements Callable<List<C17101el>> {

    /* renamed from: a */
    private final /* synthetic */ zzk f48010a;

    /* renamed from: b */
    private final /* synthetic */ String f48011b;

    /* renamed from: c */
    private final /* synthetic */ String f48012c;

    /* renamed from: d */
    private final /* synthetic */ C17008ba f48013d;

    C17015bh(C17008ba baVar, zzk zzk, String str, String str2) {
        this.f48013d = baVar;
        this.f48010a = zzk;
        this.f48011b = str;
        this.f48012c = str2;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.f48013d.f47992a.mo33116o();
        return this.f48013d.f47992a.mo33106d().mo33306a(this.f48010a.f48487a, this.f48011b, this.f48012c);
    }
}
