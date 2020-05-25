package com.p683ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;

/* renamed from: com.ss.android.socialbase.downloader.depend.x */
public interface C19871x extends IInterface {

    /* renamed from: com.ss.android.socialbase.downloader.depend.x$a */
    public static abstract class C19872a extends Binder implements C19871x {

        /* renamed from: com.ss.android.socialbase.downloader.depend.x$a$a */
        static class C19873a implements C19871x {

            /* renamed from: a */
            private IBinder f54571a;

            public final IBinder asBinder() {
                return this.f54571a;
            }

            C19873a(IBinder iBinder) {
                this.f54571a = iBinder;
            }

            /* renamed from: a */
            public final boolean mo41389a(DownloadInfo downloadInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback");
                    boolean z = true;
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f54571a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final boolean mo41390b(DownloadInfo downloadInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback");
                    boolean z = true;
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f54571a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C19872a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback");
        }

        /* renamed from: a */
        public static C19871x m48567a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C19871x)) {
                return new C19873a(iBinder);
            }
            return (C19871x) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                DownloadInfo downloadInfo = null;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback");
                        if (parcel.readInt() != 0) {
                            downloadInfo = (DownloadInfo) DownloadInfo.CREATOR.createFromParcel(parcel);
                        }
                        boolean a = mo41389a(downloadInfo);
                        parcel2.writeNoException();
                        parcel2.writeInt(a ? 1 : 0);
                        return true;
                    case 2:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback");
                        if (parcel.readInt() != 0) {
                            downloadInfo = (DownloadInfo) DownloadInfo.CREATOR.createFromParcel(parcel);
                        }
                        boolean b = mo41390b(downloadInfo);
                        parcel2.writeNoException();
                        parcel2.writeInt(b ? 1 : 0);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback");
                return true;
            }
        }
    }

    /* renamed from: a */
    boolean mo41389a(DownloadInfo downloadInfo) throws RemoteException;

    /* renamed from: b */
    boolean mo41390b(DownloadInfo downloadInfo) throws RemoteException;
}
