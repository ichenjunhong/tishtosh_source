package com.p683ss.android.ugc.asve.sandbox.p1251b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.b.y */
public interface C20733y extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.b.y$a */
    public static abstract class C20734a extends Binder implements C20733y {

        /* renamed from: com.ss.android.ugc.asve.sandbox.b.y$a$a */
        public static class C20735a implements C20733y {

            /* renamed from: a */
            private IBinder f56543a;

            public final IBinder asBinder() {
                return this.f56543a;
            }

            public C20735a(IBinder iBinder) {
                this.f56543a = iBinder;
            }

            /* renamed from: a */
            public final void mo43783a(long j, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.IStickerRequestCallback");
                    obtain.writeLong(j);
                    obtain.writeInt(z ? 1 : 0);
                    this.f56543a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20734a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.listener.IStickerRequestCallback");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            boolean z;
            String str = "com.ss.android.ugc.asve.sandbox.listener.IStickerRequestCallback";
            if (i == 1) {
                parcel.enforceInterface(str);
                long readLong = parcel.readLong();
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                mo43783a(readLong, z);
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
    void mo43783a(long j, boolean z) throws RemoteException;
}
