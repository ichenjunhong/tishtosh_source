package com.p683ss.android.ugc.asve.sandbox.p1251b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.b.j */
public interface C20688j extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.b.j$a */
    public static abstract class C20689a extends Binder implements C20688j {

        /* renamed from: com.ss.android.ugc.asve.sandbox.b.j$a$a */
        public static class C20690a implements C20688j {

            /* renamed from: a */
            private IBinder f56528a;

            public final IBinder asBinder() {
                return this.f56528a;
            }

            public C20690a(IBinder iBinder) {
                this.f56528a = iBinder;
            }

            /* renamed from: a */
            public final void mo43782a(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.IASSandBoxShotScreenCallback");
                    obtain.writeInt(i);
                    this.f56528a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20689a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.listener.IASSandBoxShotScreenCallback");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.listener.IASSandBoxShotScreenCallback";
            if (i == 1) {
                parcel.enforceInterface(str);
                mo43782a(parcel.readInt());
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
    void mo43782a(int i) throws RemoteException;
}
