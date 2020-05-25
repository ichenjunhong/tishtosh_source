package com.p683ss.android.message;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.message.c */
public interface C19472c extends IInterface {

    /* renamed from: com.ss.android.message.c$a */
    public static abstract class C19473a extends Binder implements C19472c {

        /* renamed from: com.ss.android.message.c$a$a */
        static class C19474a implements C19472c {

            /* renamed from: a */
            private IBinder f53799a;

            public final IBinder asBinder() {
                return this.f53799a;
            }

            /* renamed from: a */
            public final boolean mo40602a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.message.IPushAppCallback");
                    boolean z = false;
                    this.f53799a.transact(1, obtain, obtain2, 0);
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

            /* renamed from: b */
            public final int mo40603b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.message.IPushAppCallback");
                    this.f53799a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final long mo40604c() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.message.IPushAppCallback");
                    this.f53799a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final String mo40605d() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.message.IPushAppCallback");
                    this.f53799a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public final String mo40606e() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.message.IPushAppCallback");
                    this.f53799a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public final String mo40607f() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.message.IPushAppCallback");
                    this.f53799a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: g */
            public final String mo40608g() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.message.IPushAppCallback");
                    this.f53799a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            C19474a(IBinder iBinder) {
                this.f53799a = iBinder;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C19473a() {
            attachInterface(this, "com.ss.android.message.IPushAppCallback");
        }

        /* renamed from: a */
        public static C19472c m47672a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.message.IPushAppCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C19472c)) {
                return new C19474a(iBinder);
            }
            return (C19472c) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.message.IPushAppCallback";
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface(str);
                        boolean a = mo40602a();
                        parcel2.writeNoException();
                        parcel2.writeInt(a ? 1 : 0);
                        return true;
                    case 2:
                        parcel.enforceInterface(str);
                        int b = mo40603b();
                        parcel2.writeNoException();
                        parcel2.writeInt(b);
                        return true;
                    case 3:
                        parcel.enforceInterface(str);
                        long c = mo40604c();
                        parcel2.writeNoException();
                        parcel2.writeLong(c);
                        return true;
                    case 4:
                        parcel.enforceInterface(str);
                        String d = mo40605d();
                        parcel2.writeNoException();
                        parcel2.writeString(d);
                        return true;
                    case 5:
                        parcel.enforceInterface(str);
                        String e = mo40606e();
                        parcel2.writeNoException();
                        parcel2.writeString(e);
                        return true;
                    case 6:
                        parcel.enforceInterface(str);
                        String f = mo40607f();
                        parcel2.writeNoException();
                        parcel2.writeString(f);
                        return true;
                    case 7:
                        parcel.enforceInterface(str);
                        String g = mo40608g();
                        parcel2.writeNoException();
                        parcel2.writeString(g);
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
    boolean mo40602a() throws RemoteException;

    /* renamed from: b */
    int mo40603b() throws RemoteException;

    /* renamed from: c */
    long mo40604c() throws RemoteException;

    /* renamed from: d */
    String mo40605d() throws RemoteException;

    /* renamed from: e */
    String mo40606e() throws RemoteException;

    /* renamed from: f */
    String mo40607f() throws RemoteException;

    /* renamed from: g */
    String mo40608g() throws RemoteException;
}
