package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C14963ax;

final class adt implements afk<Throwable, T> {

    /* renamed from: a */
    private final /* synthetic */ adx f40332a;

    adt(adr adr, adx adx) {
        this.f40332a = adx;
    }

    /* renamed from: a */
    public final /* synthetic */ aga mo27633a(Object obj) throws Exception {
        Throwable th = (Throwable) obj;
        abv.m32793b("Error occurred while dispatching http response in getter.", th);
        C14963ax.m30834d().mo28588a(th, "HttpGetter.deliverResponse.1");
        return afp.m32820a(this.f40332a.mo28737a());
    }
}
