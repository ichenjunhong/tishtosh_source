package com.p683ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.socialbase.downloader.depend.z */
public interface C19875z extends IInterface {

    /* renamed from: com.ss.android.socialbase.downloader.depend.z$a */
    public static abstract class C19876a extends Binder implements C19875z {

        /* renamed from: com.ss.android.socialbase.downloader.depend.z$a$a */
        public static class C19877a implements C19875z {

            /* renamed from: a */
            private IBinder f54572a;

            public final IBinder asBinder() {
                return this.f54572a;
            }

            public C19877a(IBinder iBinder) {
                this.f54572a = iBinder;
            }

            /* renamed from: a */
            public final long mo41396a(int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f54572a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C19876a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator");
                long a = mo41396a(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeLong(a);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator");
                return true;
            }
        }
    }

    /* renamed from: a */
    long mo41396a(int i, int i2) throws RemoteException;
}
