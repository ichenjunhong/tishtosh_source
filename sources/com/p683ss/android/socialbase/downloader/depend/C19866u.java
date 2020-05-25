package com.p683ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;

/* renamed from: com.ss.android.socialbase.downloader.depend.u */
public interface C19866u extends IInterface {

    /* renamed from: com.ss.android.socialbase.downloader.depend.u$a */
    public static abstract class C19867a extends Binder implements C19866u {

        /* renamed from: com.ss.android.socialbase.downloader.depend.u$a$a */
        static class C19868a implements C19866u {

            /* renamed from: a */
            private IBinder f54570a;

            public final IBinder asBinder() {
                return this.f54570a;
            }

            /* renamed from: a */
            public final String mo41380a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
                    this.f54570a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            C19868a(IBinder iBinder) {
                this.f54570a = iBinder;
            }

            /* renamed from: a */
            public final boolean mo41382a(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
                    obtain.writeInt(z ? 1 : 0);
                    boolean z2 = false;
                    this.f54570a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z2 = true;
                    }
                    return z2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo41381a(int i, DownloadInfo downloadInfo, String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
                    obtain.writeInt(i);
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f54570a.transact(1, obtain, obtain2, 0);
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

        public C19867a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
        }

        /* renamed from: a */
        public static C19866u m48558a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C19866u)) {
                return new C19868a(iBinder);
            }
            return (C19866u) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            DownloadInfo downloadInfo;
            boolean z;
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
                        int readInt = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            downloadInfo = (DownloadInfo) DownloadInfo.CREATOR.createFromParcel(parcel);
                        } else {
                            downloadInfo = null;
                        }
                        mo41381a(readInt, downloadInfo, parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
                        if (parcel.readInt() != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        boolean a = mo41382a(z);
                        parcel2.writeNoException();
                        parcel2.writeInt(a ? 1 : 0);
                        return true;
                    case 3:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
                        String a2 = mo41380a();
                        parcel2.writeNoException();
                        parcel2.writeString(a2);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener");
                return true;
            }
        }
    }

    /* renamed from: a */
    String mo41380a() throws RemoteException;

    /* renamed from: a */
    void mo41381a(int i, DownloadInfo downloadInfo, String str, String str2) throws RemoteException;

    /* renamed from: a */
    boolean mo41382a(boolean z) throws RemoteException;
}
