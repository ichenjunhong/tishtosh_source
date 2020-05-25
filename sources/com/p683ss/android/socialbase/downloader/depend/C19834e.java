package com.p683ss.android.socialbase.downloader.depend;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.socialbase.downloader.depend.e */
public interface C19834e extends IInterface {

    /* renamed from: com.ss.android.socialbase.downloader.depend.e$a */
    public static abstract class C19835a extends Binder implements C19834e {

        /* renamed from: com.ss.android.socialbase.downloader.depend.e$a$a */
        static class C19836a implements C19834e {

            /* renamed from: a */
            private IBinder f54562a;

            public final IBinder asBinder() {
                return this.f54562a;
            }

            C19836a(IBinder iBinder) {
                this.f54562a = iBinder;
            }

            /* renamed from: a */
            public final Uri mo41327a(String str, String str2) throws RemoteException {
                Uri uri;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlFileProvider");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f54562a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        uri = (Uri) Uri.CREATOR.createFromParcel(obtain2);
                    } else {
                        uri = null;
                    }
                    return uri;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C19835a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadAidlFileProvider");
        }

        /* renamed from: a */
        public static C19834e m48501a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlFileProvider");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C19834e)) {
                return new C19836a(iBinder);
            }
            return (C19834e) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlFileProvider");
                Uri a = mo41327a(parcel.readString(), parcel.readString());
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
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadAidlFileProvider");
                return true;
            }
        }
    }

    /* renamed from: a */
    Uri mo41327a(String str, String str2) throws RemoteException;
}
