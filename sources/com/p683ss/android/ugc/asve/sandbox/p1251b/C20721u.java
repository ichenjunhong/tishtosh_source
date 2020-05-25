package com.p683ss.android.ugc.asve.sandbox.p1251b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.b.u */
public interface C20721u extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.b.u$a */
    public static abstract class C20722a extends Binder implements C20721u {

        /* renamed from: com.ss.android.ugc.asve.sandbox.b.u$a$a */
        public static class C20723a implements C20721u {

            /* renamed from: a */
            private IBinder f56539a;

            public final IBinder asBinder() {
                return this.f56539a;
            }

            /* renamed from: a */
            public final void mo43792a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.IHostDiedCallback");
                    this.f56539a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public C20723a(IBinder iBinder) {
                this.f56539a = iBinder;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20722a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.listener.IHostDiedCallback");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.listener.IHostDiedCallback";
            if (i == 1) {
                parcel.enforceInterface(str);
                mo43792a();
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
    void mo43792a() throws RemoteException;
}
