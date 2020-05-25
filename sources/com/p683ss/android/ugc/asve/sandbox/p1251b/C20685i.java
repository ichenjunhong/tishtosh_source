package com.p683ss.android.ugc.asve.sandbox.p1251b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.b.i */
public interface C20685i extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.b.i$a */
    public static abstract class C20686a extends Binder implements C20685i {

        /* renamed from: com.ss.android.ugc.asve.sandbox.b.i$a$a */
        static class C20687a implements C20685i {

            /* renamed from: a */
            private IBinder f56527a;

            public final IBinder asBinder() {
                return this.f56527a;
            }

            C20687a(IBinder iBinder) {
                this.f56527a = iBinder;
            }

            /* renamed from: a */
            public final void mo43780a(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.IASSandBoxIntResultCallback");
                    obtain.writeInt(i);
                    this.f56527a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20686a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.listener.IASSandBoxIntResultCallback");
        }

        /* renamed from: a */
        public static C20685i m52026a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.listener.IASSandBoxIntResultCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C20685i)) {
                return new C20687a(iBinder);
            }
            return (C20685i) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.listener.IASSandBoxIntResultCallback";
            if (i == 1) {
                parcel.enforceInterface(str);
                mo43780a(parcel.readInt());
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(str);
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo43780a(int i) throws RemoteException;
}
