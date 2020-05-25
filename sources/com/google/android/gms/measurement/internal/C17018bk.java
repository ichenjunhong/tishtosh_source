package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.bk */
final class C17018bk implements Callable<List<zzo>> {

    /* renamed from: a */
    private final /* synthetic */ String f48022a;

    /* renamed from: b */
    private final /* synthetic */ String f48023b;

    /* renamed from: c */
    private final /* synthetic */ String f48024c;

    /* renamed from: d */
    private final /* synthetic */ C17008ba f48025d;

    C17018bk(C17008ba baVar, String str, String str2, String str3) {
        this.f48025d = baVar;
        this.f48022a = str;
        this.f48023b = str2;
        this.f48024c = str3;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.f48025d.f47992a.mo33116o();
        return this.f48025d.f47992a.mo33106d().mo33318b(this.f48022a, this.f48023b, this.f48024c);
    }
}
