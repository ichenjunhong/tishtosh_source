package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.C14993e;
import com.google.android.gms.common.internal.C15428c.C15429a;
import com.google.android.gms.common.internal.C15428c.C15430b;

@C16299uq
public final class bxn extends C14993e<bxq> {
    /* renamed from: a */
    public final String mo27963a() {
        return "com.google.android.gms.ads.service.CACHE";
    }

    /* renamed from: b */
    public final String mo27964b() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    bxn(Context context, Looper looper, C15429a aVar, C15430b bVar) {
        super(C16380xq.m39015a(context), looper, 123, aVar, bVar, null);
    }

    /* renamed from: s */
    public final bxq mo29433s() throws DeadObjectException {
        return (bxq) super.mo28413p();
    }

    /* renamed from: a */
    public final /* synthetic */ IInterface mo27962a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        if (queryLocalInterface instanceof bxq) {
            return (bxq) queryLocalInterface;
        }
        return new bxr(iBinder);
    }
}
