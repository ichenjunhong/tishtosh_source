package com.p683ss.android.ugc.asve.sandbox.p1251b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.b.q */
public interface C20709q extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.b.q$a */
    public static abstract class C20710a extends Binder implements C20709q {

        /* renamed from: com.ss.android.ugc.asve.sandbox.b.q$a$a */
        public static class C20711a implements C20709q {

            /* renamed from: a */
            private IBinder f56535a;

            public final IBinder asBinder() {
                return this.f56535a;
            }

            public C20711a(IBinder iBinder) {
                this.f56535a = iBinder;
            }

            /* renamed from: a */
            public final void mo43785a(int[] iArr, long[] jArr, float f) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.IEffectAlgorithmCallback");
                    obtain.writeIntArray(iArr);
                    obtain.writeLongArray(jArr);
                    obtain.writeFloat(f);
                    this.f56535a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20710a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.listener.IEffectAlgorithmCallback");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.listener.IEffectAlgorithmCallback";
            if (i == 1) {
                parcel.enforceInterface(str);
                mo43785a(parcel.createIntArray(), parcel.createLongArray(), parcel.readFloat());
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
    void mo43785a(int[] iArr, long[] jArr, float f) throws RemoteException;
}
