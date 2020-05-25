package com.p683ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.socialbase.downloader.depend.c */
public interface C19828c extends IInterface {

    /* renamed from: com.ss.android.socialbase.downloader.depend.c$a */
    public static abstract class C19829a extends Binder implements C19828c {

        /* renamed from: com.ss.android.socialbase.downloader.depend.c$a$a */
        public static class C19830a implements C19828c {

            /* renamed from: a */
            private IBinder f54560a;

            public final IBinder asBinder() {
                return this.f54560a;
            }

            public C19830a(IBinder iBinder) {
                this.f54560a = iBinder;
            }

            /* renamed from: a */
            public final int mo41319a(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IChunkCntAidlCalculator");
                    obtain.writeLong(j);
                    this.f54560a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C19829a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IChunkCntAidlCalculator");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IChunkCntAidlCalculator");
                int a = mo41319a(parcel.readLong());
                parcel2.writeNoException();
                parcel2.writeInt(a);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IChunkCntAidlCalculator");
                return true;
            }
        }
    }

    /* renamed from: a */
    int mo41319a(long j) throws RemoteException;
}
