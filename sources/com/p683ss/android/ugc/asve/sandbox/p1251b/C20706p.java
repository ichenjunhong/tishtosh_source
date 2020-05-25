package com.p683ss.android.ugc.asve.sandbox.p1251b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.b.p */
public interface C20706p extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.b.p$a */
    public static abstract class C20707a extends Binder implements C20706p {

        /* renamed from: com.ss.android.ugc.asve.sandbox.b.p$a$a */
        public static class C20708a implements C20706p {

            /* renamed from: a */
            private IBinder f56534a;

            public final IBinder asBinder() {
                return this.f56534a;
            }

            public C20708a(IBinder iBinder) {
                this.f56534a = iBinder;
            }

            /* renamed from: a */
            public final void mo43767a(String[] strArr, double[] dArr, boolean[] zArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.ICherEffectParmaCallback");
                    obtain.writeStringArray(strArr);
                    obtain.writeDoubleArray(dArr);
                    obtain.writeBooleanArray(zArr);
                    this.f56534a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20707a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.listener.ICherEffectParmaCallback");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.listener.ICherEffectParmaCallback";
            if (i == 1) {
                parcel.enforceInterface(str);
                mo43767a(parcel.createStringArray(), parcel.createDoubleArray(), parcel.createBooleanArray());
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
    void mo43767a(String[] strArr, double[] dArr, boolean[] zArr) throws RemoteException;
}
