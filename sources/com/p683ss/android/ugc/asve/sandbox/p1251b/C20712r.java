package com.p683ss.android.ugc.asve.sandbox.p1251b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.b.r */
public interface C20712r extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.b.r$a */
    public static abstract class C20713a extends Binder implements C20712r {

        /* renamed from: com.ss.android.ugc.asve.sandbox.b.r$a$a */
        public static class C20714a implements C20712r {

            /* renamed from: a */
            private IBinder f56536a;

            public final IBinder asBinder() {
                return this.f56536a;
            }

            public C20714a(IBinder iBinder) {
                this.f56536a = iBinder;
            }

            /* renamed from: a */
            public final void mo43849a(float[] fArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.IFOVCallback");
                    obtain.writeFloatArray(fArr);
                    this.f56536a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20713a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.listener.IFOVCallback");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.listener.IFOVCallback";
            if (i == 1) {
                parcel.enforceInterface(str);
                mo43849a(parcel.createFloatArray());
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
    void mo43849a(float[] fArr) throws RemoteException;
}
