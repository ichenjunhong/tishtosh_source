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
/* renamed from: com.google.android.gms.internal.ads.ij */
public final class C15968ij extends C14993e<C15974ip> {
    /* renamed from: a */
    public final String mo27963a() {
        return "com.google.android.gms.ads.service.HTTP";
    }

    /* renamed from: b */
    public final String mo27964b() {
        return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
    }

    C15968ij(Context context, Looper looper, C15429a aVar, C15430b bVar) {
        super(C16380xq.m39015a(context), looper, 166, aVar, bVar, null);
    }

    /* renamed from: s */
    public final C15974ip mo29433s() throws DeadObjectException {
        return (C15974ip) super.mo28413p();
    }

    /* renamed from: a */
    public final /* synthetic */ IInterface mo27962a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
        if (queryLocalInterface instanceof C15974ip) {
            return (C15974ip) queryLocalInterface;
        }
        return new C15975iq(iBinder);
    }
}
