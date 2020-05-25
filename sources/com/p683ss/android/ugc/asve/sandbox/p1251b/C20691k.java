package com.p683ss.android.ugc.asve.sandbox.p1251b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.b.k */
public interface C20691k extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.b.k$a */
    public static abstract class C20692a extends Binder implements C20691k {

        /* renamed from: com.ss.android.ugc.asve.sandbox.b.k$a$a */
        public static class C20693a implements C20691k {

            /* renamed from: a */
            private IBinder f56529a;

            public final IBinder asBinder() {
                return this.f56529a;
            }

            public C20693a(IBinder iBinder) {
                this.f56529a = iBinder;
            }

            /* renamed from: a */
            public final void mo43781a(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.IASSandBoxStartRecorderCallback");
                    obtain.writeInt(i);
                    this.f56529a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20692a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.listener.IASSandBoxStartRecorderCallback");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.listener.IASSandBoxStartRecorderCallback";
            if (i == 1) {
                parcel.enforceInterface(str);
                mo43781a(parcel.readInt());
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
    void mo43781a(int i) throws RemoteException;
}
