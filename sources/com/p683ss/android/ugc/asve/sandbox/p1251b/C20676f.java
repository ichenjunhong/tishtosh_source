package com.p683ss.android.ugc.asve.sandbox.p1251b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.b.f */
public interface C20676f extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.b.f$a */
    public static abstract class C20677a extends Binder implements C20676f {

        /* renamed from: com.ss.android.ugc.asve.sandbox.b.f$a$a */
        public static class C20678a implements C20676f {

            /* renamed from: a */
            private IBinder f56524a;

            public final IBinder asBinder() {
                return this.f56524a;
            }

            public C20678a(IBinder iBinder) {
                this.f56524a = iBinder;
            }

            /* renamed from: a */
            public final void mo43766a(int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.IASSandBoxCamerPreviewSizeListener");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f56524a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20677a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.listener.IASSandBoxCamerPreviewSizeListener");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.listener.IASSandBoxCamerPreviewSizeListener";
            if (i == 1) {
                parcel.enforceInterface(str);
                mo43766a(parcel.readInt(), parcel.readInt());
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
    void mo43766a(int i, int i2) throws RemoteException;
}
