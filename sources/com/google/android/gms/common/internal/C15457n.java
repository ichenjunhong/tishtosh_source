package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.p1043d.C16480b;
import com.google.android.gms.internal.p1043d.C16481c;

/* renamed from: com.google.android.gms.common.internal.n */
public interface C15457n extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.n$a */
    public static abstract class C15458a extends C16480b implements C15457n {
        public C15458a() {
            super("com.google.android.gms.common.internal.IGmsCallbacks");
        }

        /* renamed from: a */
        public final boolean mo28389a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 1:
                    mo28391a(parcel.readInt(), parcel.readStrongBinder(), (Bundle) C16481c.m39347a(parcel, Bundle.CREATOR));
                    break;
                case 2:
                    mo28390a(parcel.readInt(), (Bundle) C16481c.m39347a(parcel, Bundle.CREATOR));
                    break;
                case 3:
                    mo28392a(parcel.readInt(), parcel.readStrongBinder(), (zzb) C16481c.m39347a(parcel, zzb.CREATOR));
                    break;
                default:
                    return false;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    /* renamed from: a */
    void mo28390a(int i, Bundle bundle) throws RemoteException;

    /* renamed from: a */
    void mo28391a(int i, IBinder iBinder, Bundle bundle) throws RemoteException;

    /* renamed from: a */
    void mo28392a(int i, IBinder iBinder, zzb zzb) throws RemoteException;
}
