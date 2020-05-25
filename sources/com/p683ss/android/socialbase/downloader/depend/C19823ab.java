package com.p683ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.socialbase.downloader.depend.ab */
public interface C19823ab extends IInterface {

    /* renamed from: com.ss.android.socialbase.downloader.depend.ab$a */
    public static abstract class C19824a extends Binder implements C19823ab {

        /* renamed from: com.ss.android.socialbase.downloader.depend.ab$a$a */
        public static class C19825a implements C19823ab {

            /* renamed from: a */
            private IBinder f54559a;

            public final IBinder asBinder() {
                return this.f54559a;
            }

            public C19825a(IBinder iBinder) {
                this.f54559a = iBinder;
            }

            /* renamed from: a */
            public final void mo41313a(int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.ProcessAidlCallback");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f54559a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C19824a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.ProcessAidlCallback");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.ProcessAidlCallback");
                mo41313a(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.ProcessAidlCallback");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo41313a(int i, int i2) throws RemoteException;
}
