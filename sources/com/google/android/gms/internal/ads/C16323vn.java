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
/* renamed from: com.google.android.gms.internal.ads.vn */
public final class C16323vn extends C14993e<C16329vt> {
    /* renamed from: a */
    public final String mo27963a() {
        return "com.google.android.gms.ads.service.START";
    }

    /* renamed from: b */
    public final String mo27964b() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    public C16323vn(Context context, Looper looper, C15429a aVar, C15430b bVar) {
        super(C16380xq.m39015a(context), looper, 8, aVar, bVar, null);
    }

    /* renamed from: s */
    public final C16329vt mo29433s() throws DeadObjectException {
        return (C16329vt) super.mo28413p();
    }

    /* renamed from: a */
    public final /* synthetic */ IInterface mo27962a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        if (queryLocalInterface instanceof C16329vt) {
            return (C16329vt) queryLocalInterface;
        }
        return new C16331vv(iBinder);
    }
}
