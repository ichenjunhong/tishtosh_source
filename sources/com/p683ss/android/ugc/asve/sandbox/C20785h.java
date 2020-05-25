package com.p683ss.android.ugc.asve.sandbox;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20664b;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20664b.C20665a.C20666a;

/* renamed from: com.ss.android.ugc.asve.sandbox.h */
public interface C20785h extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.h$a */
    public static abstract class C20786a extends Binder implements C20785h {

        /* renamed from: com.ss.android.ugc.asve.sandbox.h$a$a */
        static class C20787a implements C20785h {

            /* renamed from: a */
            private IBinder f56684a;

            public final IBinder asBinder() {
                return this.f56684a;
            }

            /* renamed from: a */
            public final boolean mo43926a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteDuetService");
                    boolean z = false;
                    this.f56684a.transact(5, obtain, obtain2, 0);
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

            C20787a(IBinder iBinder) {
                this.f56684a = iBinder;
            }

            /* renamed from: a */
            public final void mo43925a(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteDuetService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f56684a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo43927b(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteDuetService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f56684a.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final void mo43928c(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteDuetService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f56684a.transact(6, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final void mo43929d(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteDuetService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f56684a.transact(7, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo43923a(C20664b bVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteDuetService");
                    if (bVar != null) {
                        iBinder = bVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f56684a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo43924a(String str, String str2, float f, float f2, float f3, boolean z, boolean z2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxRemoteDuetService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeFloat(f);
                    obtain.writeFloat(f2);
                    obtain.writeFloat(f3);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(z2 ? 1 : 0);
                    this.f56684a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20786a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.ISandBoxRemoteDuetService");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            boolean z;
            boolean z2;
            C20664b bVar;
            String str = "com.ss.android.ugc.asve.sandbox.ISandBoxRemoteDuetService";
            if (i != 1598968902) {
                boolean z3 = false;
                switch (i) {
                    case 1:
                        parcel.enforceInterface(str);
                        String readString = parcel.readString();
                        String readString2 = parcel.readString();
                        float readFloat = parcel.readFloat();
                        float readFloat2 = parcel.readFloat();
                        float readFloat3 = parcel.readFloat();
                        if (parcel.readInt() != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (parcel.readInt() != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        mo43924a(readString, readString2, readFloat, readFloat2, readFloat3, z, z2);
                        return true;
                    case 2:
                        parcel.enforceInterface(str);
                        IBinder readStrongBinder = parcel.readStrongBinder();
                        if (readStrongBinder == null) {
                            bVar = null;
                        } else {
                            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.listener.IASCommonRunableCallback");
                            if (queryLocalInterface == null || !(queryLocalInterface instanceof C20664b)) {
                                bVar = new C20666a(readStrongBinder);
                            } else {
                                bVar = (C20664b) queryLocalInterface;
                            }
                        }
                        mo43923a(bVar);
                        return true;
                    case 3:
                        parcel.enforceInterface(str);
                        if (parcel.readInt() != 0) {
                            z3 = true;
                        }
                        mo43925a(z3);
                        return true;
                    case 4:
                        parcel.enforceInterface(str);
                        if (parcel.readInt() != 0) {
                            z3 = true;
                        }
                        mo43927b(z3);
                        return true;
                    case 5:
                        parcel.enforceInterface(str);
                        boolean a = mo43926a();
                        parcel2.writeNoException();
                        parcel2.writeInt(a ? 1 : 0);
                        return true;
                    case 6:
                        parcel.enforceInterface(str);
                        if (parcel.readInt() != 0) {
                            z3 = true;
                        }
                        mo43928c(z3);
                        return true;
                    case 7:
                        parcel.enforceInterface(str);
                        if (parcel.readInt() != 0) {
                            z3 = true;
                        }
                        mo43929d(z3);
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
    void mo43923a(C20664b bVar) throws RemoteException;

    /* renamed from: a */
    void mo43924a(String str, String str2, float f, float f2, float f3, boolean z, boolean z2) throws RemoteException;

    /* renamed from: a */
    void mo43925a(boolean z) throws RemoteException;

    /* renamed from: a */
    boolean mo43926a() throws RemoteException;

    /* renamed from: b */
    void mo43927b(boolean z) throws RemoteException;

    /* renamed from: c */
    void mo43928c(boolean z) throws RemoteException;

    /* renamed from: d */
    void mo43929d(boolean z) throws RemoteException;
}
