package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.C14993e;
import com.google.android.gms.common.internal.C15428c.C15429a;
import com.google.android.gms.common.internal.C15428c.C15430b;

public final class apa extends C14993e<apd> {
    public apa(Context context, Looper looper, C15429a aVar, C15430b bVar) {
        super(context, looper, 116, aVar, bVar, null);
    }

    /* renamed from: a */
    public final String mo27963a() {
        return "com.google.android.gms.gass.START";
    }

    /* renamed from: b */
    public final String mo27964b() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    /* renamed from: s */
    public final apd mo29433s() throws DeadObjectException {
        return (apd) super.mo28413p();
    }

    /* renamed from: a */
    public final /* synthetic */ IInterface mo27962a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        if (queryLocalInterface instanceof apd) {
            return (apd) queryLocalInterface;
        }
        return new ape(iBinder);
    }
}
