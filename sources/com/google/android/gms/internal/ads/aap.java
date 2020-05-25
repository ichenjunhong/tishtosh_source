package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

final /* synthetic */ class aap implements Callable {

    /* renamed from: a */
    private final aad f40075a;

    /* renamed from: b */
    private final Context f40076b;

    aap(aad aad, Context context) {
        this.f40075a = aad;
        this.f40076b = context;
    }

    public final Object call() {
        return (String) this.f40075a.mo28551a("getAppInstanceId", this.f40076b);
    }
}
