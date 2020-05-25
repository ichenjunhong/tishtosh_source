package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C15384g;
import com.google.android.gms.common.internal.C15428c;
import com.google.android.gms.common.internal.C15428c.C15429a;
import com.google.android.gms.common.internal.C15428c.C15430b;

/* renamed from: com.google.android.gms.measurement.internal.q */
public final class C17132q extends C15428c<C17124i> {
    public C17132q(Context context, Looper looper, C15429a aVar, C15430b bVar) {
        super(context, looper, 93, aVar, bVar, null);
    }

    /* renamed from: a */
    public final String mo27963a() {
        return "com.google.android.gms.measurement.START";
    }

    /* renamed from: b */
    public final String mo27964b() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    /* renamed from: e */
    public final int mo27967e() {
        return C15384g.f39685b;
    }

    /* renamed from: a */
    public final /* synthetic */ IInterface mo27962a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        if (queryLocalInterface instanceof C17124i) {
            return (C17124i) queryLocalInterface;
        }
        return new C17126k(iBinder);
    }
}
