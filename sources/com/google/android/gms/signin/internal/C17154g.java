package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C15453l;
import com.google.android.gms.internal.p1042c.C16474a;
import com.google.android.gms.internal.p1042c.C16476c;

/* renamed from: com.google.android.gms.signin.internal.g */
public final class C17154g extends C16474a implements C17153f {
    C17154g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    /* renamed from: a */
    public final void mo33403a(int i) throws RemoteException {
        Parcel a = mo31682a();
        a.writeInt(i);
        mo31683a(7, a);
    }

    /* renamed from: a */
    public final void mo33404a(C15453l lVar, int i, boolean z) throws RemoteException {
        Parcel a = mo31682a();
        C16476c.m39342a(a, (IInterface) lVar);
        a.writeInt(i);
        a.writeInt(z ? 1 : 0);
        mo31683a(9, a);
    }

    /* renamed from: a */
    public final void mo33405a(zah zah, C17151d dVar) throws RemoteException {
        Parcel a = mo31682a();
        if (zah == null) {
            a.writeInt(0);
        } else {
            a.writeInt(1);
            zah.writeToParcel(a, 0);
        }
        C16476c.m39342a(a, (IInterface) dVar);
        mo31683a(12, a);
    }
}
