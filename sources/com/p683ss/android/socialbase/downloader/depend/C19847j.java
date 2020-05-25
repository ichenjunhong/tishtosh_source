package com.p683ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.socialbase.downloader.depend.j */
public interface C19847j extends IInterface {

    /* renamed from: com.ss.android.socialbase.downloader.depend.j$a */
    public static abstract class C19848a extends Binder implements C19847j {

        /* renamed from: com.ss.android.socialbase.downloader.depend.j$a$a */
        static class C19849a implements C19847j {

            /* renamed from: a */
            private IBinder f54566a;

            public final IBinder asBinder() {
                return this.f54566a;
            }

            /* renamed from: a */
            public final void mo41356a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlCallback");
                    this.f54566a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            C19849a(IBinder iBinder) {
                this.f54566a = iBinder;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C19848a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlCallback");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlCallback");
                mo41356a();
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlCallback");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo41356a() throws RemoteException;
}
