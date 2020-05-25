package com.p683ss.android.ugc.asve.sandbox;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.f */
public interface C20779f extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.f$a */
    public static abstract class C20780a extends Binder implements C20779f {

        /* renamed from: com.ss.android.ugc.asve.sandbox.f$a$a */
        static class C20781a implements C20779f {

            /* renamed from: a */
            private IBinder f56682a;

            public final IBinder asBinder() {
                return this.f56682a;
            }

            C20781a(IBinder iBinder) {
                this.f56682a = iBinder;
            }

            /* renamed from: a */
            public final String mo43740a(String str, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxPathAdaptor");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f56682a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20780a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.ISandBoxPathAdaptor");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.ISandBoxPathAdaptor";
            if (i == 1) {
                parcel.enforceInterface(str);
                String a = mo43740a(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeString(a);
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
    String mo43740a(String str, int i) throws RemoteException;
}
