package com.p683ss.android.ugc.asve.sandbox.p1251b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.b.n */
public interface C20700n extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.b.n$a */
    public static abstract class C20701a extends Binder implements C20700n {

        /* renamed from: com.ss.android.ugc.asve.sandbox.b.n$a$a */
        public static class C20702a implements C20700n {

            /* renamed from: a */
            private IBinder f56532a;

            public final IBinder asBinder() {
                return this.f56532a;
            }

            /* renamed from: a */
            public final void mo43763a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.ICameraPreviewListener");
                    this.f56532a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public C20702a(IBinder iBinder) {
                this.f56532a = iBinder;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20701a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.listener.ICameraPreviewListener");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.listener.ICameraPreviewListener";
            if (i == 1) {
                parcel.enforceInterface(str);
                mo43763a();
                parcel2.writeNoException();
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
    void mo43763a() throws RemoteException;
}
