package com.p683ss.android.ugc.asve.sandbox.p1251b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.b.d */
public interface C20670d extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.b.d$a */
    public static abstract class C20671a extends Binder implements C20670d {

        /* renamed from: com.ss.android.ugc.asve.sandbox.b.d$a$a */
        static class C20672a implements C20670d {

            /* renamed from: a */
            private IBinder f56522a;

            public final IBinder asBinder() {
                return this.f56522a;
            }

            /* renamed from: a */
            public final boolean mo43775a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.IASRemoteFrameAvailableListener");
                    boolean z = false;
                    this.f56522a.transact(2, obtain, obtain2, 0);
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

            C20672a(IBinder iBinder) {
                this.f56522a = iBinder;
            }

            /* renamed from: a */
            public final void mo43774a(int i, int i2, int i3, int i4, long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.IASRemoteFrameAvailableListener");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeInt(i4);
                    obtain.writeLong(j);
                    this.f56522a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20671a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.listener.IASRemoteFrameAvailableListener");
        }

        /* renamed from: a */
        public static C20670d m52014a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.listener.IASRemoteFrameAvailableListener");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C20670d)) {
                return new C20672a(iBinder);
            }
            return (C20670d) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.listener.IASRemoteFrameAvailableListener";
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface(str);
                        mo43774a(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong());
                        return true;
                    case 2:
                        parcel.enforceInterface(str);
                        boolean a = mo43775a();
                        parcel2.writeNoException();
                        parcel2.writeInt(a ? 1 : 0);
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
    void mo43774a(int i, int i2, int i3, int i4, long j) throws RemoteException;

    /* renamed from: a */
    boolean mo43775a() throws RemoteException;
}
