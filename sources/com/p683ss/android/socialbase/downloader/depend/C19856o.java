package com.p683ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* renamed from: com.ss.android.socialbase.downloader.depend.o */
public interface C19856o extends IInterface {

    /* renamed from: com.ss.android.socialbase.downloader.depend.o$a */
    public static abstract class C19857a extends Binder implements C19856o {

        /* renamed from: com.ss.android.socialbase.downloader.depend.o$a$a */
        static class C19858a implements C19856o {

            /* renamed from: a */
            private IBinder f54568a;

            public final IBinder asBinder() {
                return this.f54568a;
            }

            /* renamed from: a */
            public final boolean mo41368a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlCallback");
                    boolean z = false;
                    this.f54568a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            C19858a(IBinder iBinder) {
                this.f54568a = iBinder;
            }

            /* renamed from: a */
            public final void mo41367a(List<String> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlCallback");
                    obtain.writeStringList(list);
                    this.f54568a.transact(1, obtain, obtain2, 0);
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

        public C19857a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlCallback");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlCallback");
                        mo41367a(parcel.createStringArrayList());
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlCallback");
                        boolean a = mo41368a();
                        parcel2.writeNoException();
                        parcel2.writeInt(a ? 1 : 0);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlCallback");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo41367a(List<String> list) throws RemoteException;

    /* renamed from: a */
    boolean mo41368a() throws RemoteException;
}
