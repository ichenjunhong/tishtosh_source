package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.android.gms.common.internal.C15464q;

/* renamed from: com.google.android.gms.internal.measurement.v */
public final class C16864v {

    /* renamed from: a */
    public final Context f47350a;

    /* renamed from: b */
    public final Context f47351b;

    public C16864v(Context context) {
        C15464q.m32123a(context);
        Context applicationContext = context.getApplicationContext();
        C15464q.m32124a(applicationContext, (Object) "Application context can't be null");
        this.f47350a = applicationContext;
        this.f47351b = applicationContext;
    }
}
