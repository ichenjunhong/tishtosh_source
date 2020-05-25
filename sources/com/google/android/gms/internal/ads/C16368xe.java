package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.xe */
public final class C16368xe {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public WeakHashMap<Context, C16370xg> f45954a = new WeakHashMap<>();

    /* renamed from: a */
    public final Future<C16365xb> mo31465a(Context context) {
        return acb.m32567a((Callable<T>) new C16369xf<T>(this, context));
    }
}
