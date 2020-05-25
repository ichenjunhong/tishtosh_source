package com.p683ss.android.ugc.asve.sandbox.p1251b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.b.h */
public interface C20682h extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.b.h$a */
    public static abstract class C20683a extends Binder implements C20682h {

        /* renamed from: com.ss.android.ugc.asve.sandbox.b.h$a$a */
        public static class C20684a implements C20682h {

            /* renamed from: a */
            private IBinder f56526a;

            public final IBinder asBinder() {
                return this.f56526a;
            }

            public C20684a(IBinder iBinder) {
                this.f56526a = iBinder;
            }

            /* renamed from: a */
            public final void mo43777a(int i, int i2, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.IASSandBoxExternalOnInfoCallback");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    this.f56526a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20683a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.listener.IASSandBoxExternalOnInfoCallback");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.listener.IASSandBoxExternalOnInfoCallback";
            if (i == 1) {
                parcel.enforceInterface(str);
                mo43777a(parcel.readInt(), parcel.readInt(), parcel.readString());
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
    void mo43777a(int i, int i2, String str) throws RemoteException;
}
