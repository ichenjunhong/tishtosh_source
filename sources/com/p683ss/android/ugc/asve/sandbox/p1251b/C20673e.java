package com.p683ss.android.ugc.asve.sandbox.p1251b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.b.e */
public interface C20673e extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.b.e$a */
    public static abstract class C20674a extends Binder implements C20673e {

        /* renamed from: com.ss.android.ugc.asve.sandbox.b.e$a$a */
        public static class C20675a implements C20673e {

            /* renamed from: a */
            private IBinder f56523a;

            public final IBinder asBinder() {
                return this.f56523a;
            }

            public C20675a(IBinder iBinder) {
                this.f56523a = iBinder;
            }

            /* renamed from: a */
            public final void mo43784a(int i, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.IASRemoteResultCallback");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.f56523a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20674a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.listener.IASRemoteResultCallback");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.listener.IASRemoteResultCallback";
            if (i == 1) {
                parcel.enforceInterface(str);
                mo43784a(parcel.readInt(), parcel.readString());
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
    void mo43784a(int i, String str) throws RemoteException;
}
