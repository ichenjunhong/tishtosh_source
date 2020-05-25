package com.p683ss.android.ugc.asve.sandbox.p1251b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.b.x */
public interface C20730x extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.b.x$a */
    public static abstract class C20731a extends Binder implements C20730x {

        /* renamed from: com.ss.android.ugc.asve.sandbox.b.x$a$a */
        static class C20732a implements C20730x {

            /* renamed from: a */
            private IBinder f56542a;

            public final IBinder asBinder() {
                return this.f56542a;
            }

            C20732a(IBinder iBinder) {
                this.f56542a = iBinder;
            }

            /* renamed from: a */
            public final void mo43745a(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.ISlamDetectListener");
                    obtain.writeInt(z ? 1 : 0);
                    this.f56542a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20731a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.listener.ISlamDetectListener");
        }

        /* renamed from: a */
        public static C20730x m52063a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.listener.ISlamDetectListener");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C20730x)) {
                return new C20732a(iBinder);
            }
            return (C20730x) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            boolean z;
            String str = "com.ss.android.ugc.asve.sandbox.listener.ISlamDetectListener";
            if (i == 1) {
                parcel.enforceInterface(str);
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                mo43745a(z);
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
    void mo43745a(boolean z) throws RemoteException;
}
