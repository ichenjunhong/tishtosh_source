package com.p683ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.socialbase.downloader.depend.p */
public interface C19859p extends IInterface {

    /* renamed from: com.ss.android.socialbase.downloader.depend.p$a */
    public static abstract class C19860a extends Binder implements C19859p {

        /* renamed from: com.ss.android.socialbase.downloader.depend.p$a$a */
        public static class C19861a implements C19859p {

            /* renamed from: a */
            private IBinder f54569a;

            public final IBinder asBinder() {
                return this.f54569a;
            }

            public C19861a(IBinder iBinder) {
                this.f54569a = iBinder;
            }

            /* renamed from: a */
            public final boolean mo41372a(C19856o oVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler");
                    if (oVar != null) {
                        iBinder = oVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    boolean z = false;
                    this.f54569a.transact(1, obtain, obtain2, 0);
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
        }

        public IBinder asBinder() {
            return this;
        }

        public C19860a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            C19856o oVar;
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler");
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    oVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlCallback");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof C19856o)) {
                        oVar = new C19858a(readStrongBinder);
                    } else {
                        oVar = (C19856o) queryLocalInterface;
                    }
                }
                boolean a = mo41372a(oVar);
                parcel2.writeNoException();
                parcel2.writeInt(a ? 1 : 0);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler");
                return true;
            }
        }
    }

    /* renamed from: a */
    boolean mo41372a(C19856o oVar) throws RemoteException;
}
