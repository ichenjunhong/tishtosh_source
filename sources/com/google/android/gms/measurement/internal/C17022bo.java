package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.bo */
final class C17022bo implements Callable<byte[]> {

    /* renamed from: a */
    private final /* synthetic */ zzag f48034a;

    /* renamed from: b */
    private final /* synthetic */ String f48035b;

    /* renamed from: c */
    private final /* synthetic */ C17008ba f48036c;

    C17022bo(C17008ba baVar, zzag zzag, String str) {
        this.f48036c = baVar;
        this.f48034a = zzag;
        this.f48035b = str;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.f48036c.f47992a.mo33116o();
        C17092ed a = this.f48036c.f47992a;
        C17092ed.m41561a((C17091ec) a.f48235a);
        return a.f48235a.mo33017a(this.f48034a, this.f48035b);
    }
}
