package com.p683ss.android.ugc.asve.sandbox.p1251b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.b.w */
public interface C20727w extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.b.w$a */
    public static abstract class C20728a extends Binder implements C20727w {

        /* renamed from: com.ss.android.ugc.asve.sandbox.b.w$a$a */
        public static class C20729a implements C20727w {

            /* renamed from: a */
            private IBinder f56541a;

            public final IBinder asBinder() {
                return this.f56541a;
            }

            public C20729a(IBinder iBinder) {
                this.f56541a = iBinder;
            }

            /* renamed from: a */
            public final void mo43773a(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.IOnARTextCountCallback");
                    obtain.writeInt(i);
                    this.f56541a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20728a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.listener.IOnARTextCountCallback");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.listener.IOnARTextCountCallback";
            if (i == 1) {
                parcel.enforceInterface(str);
                mo43773a(parcel.readInt());
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
    void mo43773a(int i) throws RemoteException;
}
