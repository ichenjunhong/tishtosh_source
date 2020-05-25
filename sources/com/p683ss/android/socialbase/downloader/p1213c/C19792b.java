package com.p683ss.android.socialbase.downloader.p1213c;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* renamed from: com.ss.android.socialbase.downloader.c.b */
public interface C19792b extends IInterface {

    /* renamed from: com.ss.android.socialbase.downloader.c.b$a */
    public static abstract class C19793a extends Binder implements C19792b {

        /* renamed from: com.ss.android.socialbase.downloader.c.b$a$a */
        static class C19794a implements C19792b {

            /* renamed from: a */
            private IBinder f54493a;

            public final IBinder asBinder() {
                return this.f54493a;
            }

            C19794a(IBinder iBinder) {
                this.f54493a = iBinder;
            }

            /* renamed from: a */
            public final void mo41228a(Map map, Map map2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlCacheLoadCompleteCallbackAidl");
                    obtain.writeMap(map);
                    obtain.writeMap(map2);
                    this.f54493a.transact(1, obtain, obtain2, 0);
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

        public C19793a() {
            attachInterface(this, "com.ss.android.socialbase.downloader.db.ISqlCacheLoadCompleteCallbackAidl");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlCacheLoadCompleteCallbackAidl");
                ClassLoader classLoader = getClass().getClassLoader();
                mo41228a(parcel.readHashMap(classLoader), parcel.readHashMap(classLoader));
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.db.ISqlCacheLoadCompleteCallbackAidl");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo41228a(Map map, Map map2) throws RemoteException;
}
