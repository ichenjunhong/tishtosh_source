package com.p683ss.android.ugc.asve.sandbox;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.m */
public interface C20800m extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.m$a */
    public static abstract class C20801a extends Binder implements C20800m {

        /* renamed from: com.ss.android.ugc.asve.sandbox.m$a$a */
        static class C20802a implements C20800m {

            /* renamed from: a */
            private IBinder f56689a;

            public final IBinder asBinder() {
                return this.f56689a;
            }

            C20802a(IBinder iBinder) {
                this.f56689a = iBinder;
            }

            /* renamed from: b */
            public final void mo43731b(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteResourceFinder");
                    obtain.writeLong(j);
                    this.f56689a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final long mo43729a(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteResourceFinder");
                    obtain.writeLong(j);
                    this.f56689a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final String mo43730a(long j, String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteResourceFinder");
                    obtain.writeLong(j);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f56689a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20801a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.ISandBoxRemoteResourceFinder");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.ISandBoxRemoteResourceFinder";
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface(str);
                        long a = mo43729a(parcel.readLong());
                        parcel2.writeNoException();
                        parcel2.writeLong(a);
                        return true;
                    case 2:
                        parcel.enforceInterface(str);
                        mo43731b(parcel.readLong());
                        return true;
                    case 3:
                        parcel.enforceInterface(str);
                        String a2 = mo43730a(parcel.readLong(), parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeString(a2);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString(str);
                return true;
            }
        }
    }

    /* renamed from: a */
    long mo43729a(long j) throws RemoteException;

    /* renamed from: a */
    String mo43730a(long j, String str, String str2) throws RemoteException;

    /* renamed from: b */
    void mo43731b(long j) throws RemoteException;
}
