package com.p683ss.android.ugc.asve.sandbox.p1251b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.b.v */
public interface C20724v extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.b.v$a */
    public static abstract class C20725a extends Binder implements C20724v {

        /* renamed from: com.ss.android.ugc.asve.sandbox.b.v$a$a */
        public static class C20726a implements C20724v {

            /* renamed from: a */
            private IBinder f56540a;

            public final IBinder asBinder() {
                return this.f56540a;
            }

            public C20726a(IBinder iBinder) {
                this.f56540a = iBinder;
            }

            /* renamed from: a */
            public final void mo43769a(int i, int i2, int i3, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.IMessageListener");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeString(str);
                    this.f56540a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20725a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.listener.IMessageListener");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.listener.IMessageListener";
            if (i == 1) {
                parcel.enforceInterface(str);
                mo43769a(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString());
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
    void mo43769a(int i, int i2, int i3, String str) throws RemoteException;
}
