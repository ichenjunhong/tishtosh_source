package com.p683ss.android.ugc.asve.sandbox.p1251b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.b.c */
public interface C20667c extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.b.c$a */
    public static abstract class C20668a extends Binder implements C20667c {

        /* renamed from: com.ss.android.ugc.asve.sandbox.b.c$a$a */
        static class C20669a implements C20667c {

            /* renamed from: a */
            private IBinder f56521a;

            public final IBinder asBinder() {
                return this.f56521a;
            }

            C20669a(IBinder iBinder) {
                this.f56521a = iBinder;
            }

            /* renamed from: a */
            public final void mo43764a(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.IASRemoteCameraStateListener");
                    obtain.writeInt(i);
                    this.f56521a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo43765a(int i, int i2, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.IASRemoteCameraStateListener");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    this.f56521a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20668a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.listener.IASRemoteCameraStateListener");
        }

        /* renamed from: a */
        public static C20667c m52009a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.listener.IASRemoteCameraStateListener");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C20667c)) {
                return new C20669a(iBinder);
            }
            return (C20667c) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.listener.IASRemoteCameraStateListener";
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface(str);
                        mo43764a(parcel.readInt());
                        return true;
                    case 2:
                        parcel.enforceInterface(str);
                        mo43765a(parcel.readInt(), parcel.readInt(), parcel.readString());
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
    void mo43764a(int i) throws RemoteException;

    /* renamed from: a */
    void mo43765a(int i, int i2, String str) throws RemoteException;
}
