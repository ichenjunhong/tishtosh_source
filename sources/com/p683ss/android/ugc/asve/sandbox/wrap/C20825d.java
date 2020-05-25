package com.p683ss.android.ugc.asve.sandbox.wrap;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.wrap.d */
public interface C20825d extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.wrap.d$a */
    public static abstract class C20826a extends Binder implements C20825d {

        /* renamed from: com.ss.android.ugc.asve.sandbox.wrap.d$a$a */
        public static class C20827a implements C20825d {

            /* renamed from: a */
            private IBinder f56763a;

            public final IBinder asBinder() {
                return this.f56763a;
            }

            /* renamed from: a */
            public final String mo43709a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.wrap.ISandBoxRecoderResManager");
                    this.f56763a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final String mo43711b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.wrap.ISandBoxRecoderResManager");
                    this.f56763a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final String mo43713c() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.wrap.ISandBoxRecoderResManager");
                    this.f56763a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public C20827a(IBinder iBinder) {
                this.f56763a = iBinder;
            }

            /* renamed from: a */
            public final String mo43710a(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.wrap.ISandBoxRecoderResManager");
                    obtain.writeInt(i);
                    this.f56763a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final String mo43712b(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.wrap.ISandBoxRecoderResManager");
                    obtain.writeInt(i);
                    this.f56763a.transact(3, obtain, obtain2, 0);
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

        public C20826a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.wrap.ISandBoxRecoderResManager");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.wrap.ISandBoxRecoderResManager";
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface(str);
                        String a = mo43709a();
                        parcel2.writeNoException();
                        parcel2.writeString(a);
                        return true;
                    case 2:
                        parcel.enforceInterface(str);
                        String a2 = mo43710a(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeString(a2);
                        return true;
                    case 3:
                        parcel.enforceInterface(str);
                        String b = mo43712b(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeString(b);
                        return true;
                    case 4:
                        parcel.enforceInterface(str);
                        String b2 = mo43711b();
                        parcel2.writeNoException();
                        parcel2.writeString(b2);
                        return true;
                    case 5:
                        parcel.enforceInterface(str);
                        String c = mo43713c();
                        parcel2.writeNoException();
                        parcel2.writeString(c);
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
    String mo43709a() throws RemoteException;

    /* renamed from: a */
    String mo43710a(int i) throws RemoteException;

    /* renamed from: b */
    String mo43711b() throws RemoteException;

    /* renamed from: b */
    String mo43712b(int i) throws RemoteException;

    /* renamed from: c */
    String mo43713c() throws RemoteException;
}
