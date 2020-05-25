package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.bj */
final class C17017bj implements Callable<List<zzo>> {

    /* renamed from: a */
    private final /* synthetic */ zzk f48018a;

    /* renamed from: b */
    private final /* synthetic */ String f48019b;

    /* renamed from: c */
    private final /* synthetic */ String f48020c;

    /* renamed from: d */
    private final /* synthetic */ C17008ba f48021d;

    C17017bj(C17008ba baVar, zzk zzk, String str, String str2) {
        this.f48021d = baVar;
        this.f48018a = zzk;
        this.f48019b = str;
        this.f48020c = str2;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.f48021d.f47992a.mo33116o();
        return this.f48021d.f47992a.mo33106d().mo33318b(this.f48018a.f48487a, this.f48019b, this.f48020c);
    }
}
