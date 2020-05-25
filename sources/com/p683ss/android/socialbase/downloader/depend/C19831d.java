package com.p683ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.p683ss.android.socialbase.downloader.exception.BaseException;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;

/* renamed from: com.ss.android.socialbase.downloader.depend.d */
public interface C19831d extends IInterface {

    /* renamed from: com.ss.android.socialbase.downloader.depend.d$a */
    public static abstract class C19832a extends Binder implements C19831d {

        /* renamed from: com.ss.android.socialbase.downloader.depend.d$a$a */
        public static class C19833a implements C19831d {

            /* renamed from: a */
            private IBinder f54561a;

            public final IBinder asBinder() {
                return this.f54561a;
            }

            public C19833a(IBinder iBinder) {
                this.f54561a = iBinder;
            }

            /* renamed from: a */
            public final void mo41323a(DownloadInfo downloadInfo, BaseException baseException, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlDepend");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (baseException != null) {
                        obtain.writeInt(1);
                        baseException.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    this.f54561a.transact(1, obtain, obtain2, 0);
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

        public C19832a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadAidlDepend");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            DownloadInfo downloadInfo;
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlDepend");
                BaseException baseException = null;
                if (parcel.readInt() != 0) {
                    downloadInfo = (DownloadInfo) DownloadInfo.CREATOR.createFromParcel(parcel);
                } else {
                    downloadInfo = null;
                }
                if (parcel.readInt() != 0) {
                    baseException = (BaseException) BaseException.CREATOR.createFromParcel(parcel);
                }
                mo41323a(downloadInfo, baseException, parcel.readInt());
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadAidlDepend");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo41323a(DownloadInfo downloadInfo, BaseException baseException, int i) throws RemoteException;
}
