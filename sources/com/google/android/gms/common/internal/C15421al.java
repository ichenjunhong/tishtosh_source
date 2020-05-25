package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.internal.p1043d.C16479a;
import com.google.android.gms.internal.p1043d.C16481c;

/* renamed from: com.google.android.gms.common.internal.al */
public final class C15421al extends C16479a implements C15457n {
    C15421al(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    /* renamed from: a */
    public final void mo28391a(int i, IBinder iBinder, Bundle bundle) throws RemoteException {
        Parcel c = mo31690c();
        c.writeInt(i);
        c.writeStrongBinder(iBinder);
        C16481c.m39349a(c, (Parcelable) bundle);
        mo31689b(1, c);
    }

    /* renamed from: a */
    public final void mo28390a(int i, Bundle bundle) throws RemoteException {
        Parcel c = mo31690c();
        c.writeInt(i);
        C16481c.m39349a(c, (Parcelable) bundle);
        mo31689b(2, c);
    }

    /* renamed from: a */
    public final void mo28392a(int i, IBinder iBinder, zzb zzb) throws RemoteException {
        Parcel c = mo31690c();
        c.writeInt(i);
        c.writeStrongBinder(iBinder);
        C16481c.m39349a(c, (Parcelable) zzb);
        mo31689b(3, c);
    }
}
