package com.p683ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.socialbase.downloader.depend.k */
public interface C19850k extends IInterface {

    /* renamed from: com.ss.android.socialbase.downloader.depend.k$a */
    public static abstract class C19851a extends Binder implements C19850k {

        /* renamed from: com.ss.android.socialbase.downloader.depend.k$a$a */
        public static class C19852a implements C19850k {

            /* renamed from: a */
            private IBinder f54567a;

            public final IBinder asBinder() {
                return this.f54567a;
            }

            public C19852a(IBinder iBinder) {
                this.f54567a = iBinder;
            }

            /* renamed from: a */
            public final boolean mo41360a(long j, long j2, C19847j jVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler");
                    obtain.writeLong(j);
                    obtain.writeLong(j2);
                    if (jVar != null) {
                        iBinder = jVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    boolean z = false;
                    this.f54567a.transact(1, obtain, obtain2, 0);
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

        public C19851a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            C19847j jVar;
            C19847j jVar2;
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler");
                long readLong = parcel.readLong();
                long readLong2 = parcel.readLong();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    jVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlCallback");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof C19847j)) {
                        jVar2 = new C19849a(readStrongBinder);
                    } else {
                        jVar2 = (C19847j) queryLocalInterface;
                    }
                    jVar = jVar2;
                }
                boolean a = mo41360a(readLong, readLong2, jVar);
                parcel2.writeNoException();
                parcel2.writeInt(a ? 1 : 0);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler");
                return true;
            }
        }
    }

    /* renamed from: a */
    boolean mo41360a(long j, long j2, C19847j jVar) throws RemoteException;
}
