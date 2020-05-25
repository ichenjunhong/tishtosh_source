package com.p683ss.android.ugc.asve.sandbox;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20667c;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20667c.C20668a;

/* renamed from: com.ss.android.ugc.asve.sandbox.o */
public interface C20806o extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.o$a */
    public static abstract class C20807a extends Binder implements C20806o {

        /* renamed from: com.ss.android.ugc.asve.sandbox.o$a$a */
        static class C20808a implements C20806o {

            /* renamed from: a */
            private IBinder f56691a;

            public final IBinder asBinder() {
                return this.f56691a;
            }

            /* renamed from: c */
            public final boolean mo44117c() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.IWideCameraComponent");
                    boolean z = false;
                    this.f56691a.transact(4, obtain, obtain2, 0);
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

            /* renamed from: d */
            public final int mo44119d() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.IWideCameraComponent");
                    this.f56691a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public final int mo44120e() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.IWideCameraComponent");
                    this.f56691a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public final boolean mo44121f() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.IWideCameraComponent");
                    boolean z = false;
                    this.f56691a.transact(12, obtain, obtain2, 0);
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

            /* renamed from: g */
            public final boolean mo44122g() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.IWideCameraComponent");
                    boolean z = false;
                    this.f56691a.transact(14, obtain, obtain2, 0);
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
            public final int mo44115b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.IWideCameraComponent");
                    this.f56691a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final boolean mo44112a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.IWideCameraComponent");
                    boolean z = false;
                    this.f56691a.transact(2, obtain, obtain2, 0);
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

            C20808a(IBinder iBinder) {
                this.f56691a = iBinder;
            }

            /* renamed from: b */
            public final void mo44116b(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.IWideCameraComponent");
                    obtain.writeInt(z ? 1 : 0);
                    this.f56691a.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo44110a(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.IWideCameraComponent");
                    obtain.writeInt(i);
                    this.f56691a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final boolean mo44118c(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.IWideCameraComponent");
                    obtain.writeInt(z ? 1 : 0);
                    boolean z2 = false;
                    this.f56691a.transact(13, obtain, obtain2, 0);
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
            public final void mo44111a(C20667c cVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.IWideCameraComponent");
                    if (cVar != null) {
                        iBinder = cVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f56691a.transact(9, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final boolean mo44113a(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.IWideCameraComponent");
                    obtain.writeInt(z ? 1 : 0);
                    boolean z2 = false;
                    this.f56691a.transact(1, obtain, obtain2, 0);
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
            public final float mo44109a(float f, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.IWideCameraComponent");
                    obtain.writeFloat(f);
                    obtain.writeInt(i);
                    this.f56691a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readFloat();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final float mo44114b(float f, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.IWideCameraComponent");
                    obtain.writeFloat(f);
                    obtain.writeInt(i);
                    this.f56691a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readFloat();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20807a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.IWideCameraComponent");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.IWideCameraComponent";
            if (i != 1598968902) {
                boolean z = false;
                switch (i) {
                    case 1:
                        parcel.enforceInterface(str);
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        boolean a = mo44113a(z);
                        parcel2.writeNoException();
                        parcel2.writeInt(a ? 1 : 0);
                        return true;
                    case 2:
                        parcel.enforceInterface(str);
                        boolean a2 = mo44112a();
                        parcel2.writeNoException();
                        parcel2.writeInt(a2 ? 1 : 0);
                        return true;
                    case 3:
                        parcel.enforceInterface(str);
                        int b = mo44115b();
                        parcel2.writeNoException();
                        parcel2.writeInt(b);
                        return true;
                    case 4:
                        parcel.enforceInterface(str);
                        boolean c = mo44117c();
                        parcel2.writeNoException();
                        parcel2.writeInt(c ? 1 : 0);
                        return true;
                    case 5:
                        parcel.enforceInterface(str);
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        mo44116b(z);
                        return true;
                    case 6:
                        parcel.enforceInterface(str);
                        mo44110a(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        parcel.enforceInterface(str);
                        float a3 = mo44109a(parcel.readFloat(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeFloat(a3);
                        return true;
                    case 8:
                        parcel.enforceInterface(str);
                        float b2 = mo44114b(parcel.readFloat(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeFloat(b2);
                        return true;
                    case 9:
                        parcel.enforceInterface(str);
                        mo44111a(C20668a.m52009a(parcel.readStrongBinder()));
                        return true;
                    case 10:
                        parcel.enforceInterface(str);
                        int d = mo44119d();
                        parcel2.writeNoException();
                        parcel2.writeInt(d);
                        return true;
                    case 11:
                        parcel.enforceInterface(str);
                        int e = mo44120e();
                        parcel2.writeNoException();
                        parcel2.writeInt(e);
                        return true;
                    case 12:
                        parcel.enforceInterface(str);
                        boolean f = mo44121f();
                        parcel2.writeNoException();
                        parcel2.writeInt(f ? 1 : 0);
                        return true;
                    case 13:
                        parcel.enforceInterface(str);
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        boolean c2 = mo44118c(z);
                        parcel2.writeNoException();
                        parcel2.writeInt(c2 ? 1 : 0);
                        return true;
                    case 14:
                        parcel.enforceInterface(str);
                        boolean g = mo44122g();
                        parcel2.writeNoException();
                        parcel2.writeInt(g ? 1 : 0);
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
    float mo44109a(float f, int i) throws RemoteException;

    /* renamed from: a */
    void mo44110a(int i) throws RemoteException;

    /* renamed from: a */
    void mo44111a(C20667c cVar) throws RemoteException;

    /* renamed from: a */
    boolean mo44112a() throws RemoteException;

    /* renamed from: a */
    boolean mo44113a(boolean z) throws RemoteException;

    /* renamed from: b */
    float mo44114b(float f, int i) throws RemoteException;

    /* renamed from: b */
    int mo44115b() throws RemoteException;

    /* renamed from: b */
    void mo44116b(boolean z) throws RemoteException;

    /* renamed from: c */
    boolean mo44117c() throws RemoteException;

    /* renamed from: c */
    boolean mo44118c(boolean z) throws RemoteException;

    /* renamed from: d */
    int mo44119d() throws RemoteException;

    /* renamed from: e */
    int mo44120e() throws RemoteException;

    /* renamed from: f */
    boolean mo44121f() throws RemoteException;

    /* renamed from: g */
    boolean mo44122g() throws RemoteException;
}
