package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.bi */
final class C17016bi implements Callable<List<C17101el>> {

    /* renamed from: a */
    private final /* synthetic */ String f48014a;

    /* renamed from: b */
    private final /* synthetic */ String f48015b;

    /* renamed from: c */
    private final /* synthetic */ String f48016c;

    /* renamed from: d */
    private final /* synthetic */ C17008ba f48017d;

    C17016bi(C17008ba baVar, String str, String str2, String str3) {
        this.f48017d = baVar;
        this.f48014a = str;
        this.f48015b = str2;
        this.f48016c = str3;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.f48017d.f47992a.mo33116o();
        return this.f48017d.f47992a.mo33106d().mo33306a(this.f48014a, this.f48015b, this.f48016c);
    }
}
