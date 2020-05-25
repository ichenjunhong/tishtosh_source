package com.google.android.p1025a.p1026a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.a.a.a */
public interface C14877a extends IInterface {

    /* renamed from: com.google.android.a.a.a$a */
    public static abstract class C14878a extends Binder implements C14877a {

        /* renamed from: com.google.android.a.a.a$a$a */
        public static class C14879a implements C14877a {

            /* renamed from: a */
            private IBinder f38411a;

            public final IBinder asBinder() {
                return this.f38411a;
            }

            public C14879a(IBinder iBinder) {
                this.f38411a = iBinder;
            }

            /* renamed from: a */
            public final Bundle mo27234a(Bundle bundle) throws RemoteException {
                Bundle bundle2;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f38411a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(obtain2);
                    } else {
                        bundle2 = null;
                    }
                    return bundle2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            Bundle bundle;
            if (i == 1) {
                parcel.enforceInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                } else {
                    bundle = null;
                }
                Bundle a = mo27234a(bundle);
                parcel2.writeNoException();
                if (a != null) {
                    parcel2.writeInt(1);
                    a.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                return true;
            }
        }
    }

    /* renamed from: a */
    Bundle mo27234a(Bundle bundle) throws RemoteException;
}
