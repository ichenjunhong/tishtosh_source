package com.p683ss.android.ugc.asve.sandbox.p1251b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.b.l */
public interface C20694l extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.b.l$a */
    public static abstract class C20695a extends Binder implements C20694l {

        /* renamed from: com.ss.android.ugc.asve.sandbox.b.l$a$a */
        static class C20696a implements C20694l {

            /* renamed from: a */
            private IBinder f56530a;

            public final IBinder asBinder() {
                return this.f56530a;
            }

            C20696a(IBinder iBinder) {
                this.f56530a = iBinder;
            }

            /* renamed from: a */
            public final void mo43770a(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.IASSandboxNativeInitListener");
                    obtain.writeInt(i);
                    this.f56530a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo43771a(int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.IASSandboxNativeInitListener");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f56530a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20695a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.listener.IASSandboxNativeInitListener");
        }

        /* renamed from: a */
        public static C20694l m52034a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.listener.IASSandboxNativeInitListener");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C20694l)) {
                return new C20696a(iBinder);
            }
            return (C20694l) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.listener.IASSandboxNativeInitListener";
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface(str);
                        mo43770a(parcel.readInt());
                        return true;
                    case 2:
                        parcel.enforceInterface(str);
                        mo43771a(parcel.readInt(), parcel.readInt());
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
    void mo43770a(int i) throws RemoteException;

    /* renamed from: a */
    void mo43771a(int i, int i2) throws RemoteException;
}
