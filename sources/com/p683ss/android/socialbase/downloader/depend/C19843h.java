package com.p683ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.socialbase.downloader.depend.h */
public interface C19843h extends IInterface {

    /* renamed from: com.ss.android.socialbase.downloader.depend.h$a */
    public static abstract class C19844a extends Binder implements C19843h {

        /* renamed from: com.ss.android.socialbase.downloader.depend.h$a$a */
        public static class C19845a implements C19843h {

            /* renamed from: a */
            private IBinder f54565a;

            public final IBinder asBinder() {
                return this.f54565a;
            }

            /* renamed from: a */
            public final String mo41350a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
                    this.f54565a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final int[] mo41352b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
                    this.f54565a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createIntArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public C19845a(IBinder iBinder) {
                this.f54565a = iBinder;
            }

            /* renamed from: a */
            public final void mo41351a(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
                    obtain.writeString(str);
                    this.f54565a.transact(1, obtain, obtain2, 0);
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

        public C19844a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
                        mo41351a(parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
                        String a = mo41350a();
                        parcel2.writeNoException();
                        parcel2.writeString(a);
                        return true;
                    case 3:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
                        int[] b = mo41352b();
                        parcel2.writeNoException();
                        parcel2.writeIntArray(b);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend");
                return true;
            }
        }
    }

    /* renamed from: a */
    String mo41350a() throws RemoteException;

    /* renamed from: a */
    void mo41351a(String str) throws RemoteException;

    /* renamed from: b */
    int[] mo41352b() throws RemoteException;
}
