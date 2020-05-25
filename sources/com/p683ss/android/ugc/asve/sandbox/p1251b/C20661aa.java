package com.p683ss.android.ugc.asve.sandbox.p1251b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.b.aa */
public interface C20661aa extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.b.aa$a */
    public static abstract class C20662a extends Binder implements C20661aa {

        /* renamed from: com.ss.android.ugc.asve.sandbox.b.aa$a$a */
        public static class C20663a implements C20661aa {

            /* renamed from: a */
            private IBinder f56519a;

            public final IBinder asBinder() {
                return this.f56519a;
            }

            public C20663a(IBinder iBinder) {
                this.f56519a = iBinder;
            }

            /* renamed from: a */
            public final void mo43744a(int i, float f) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.IVESATZoomListener");
                    obtain.writeInt(i);
                    obtain.writeFloat(f);
                    this.f56519a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20662a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.listener.IVESATZoomListener");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.listener.IVESATZoomListener";
            if (i == 1) {
                parcel.enforceInterface(str);
                mo43744a(parcel.readInt(), parcel.readFloat());
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
    void mo43744a(int i, float f) throws RemoteException;
}
