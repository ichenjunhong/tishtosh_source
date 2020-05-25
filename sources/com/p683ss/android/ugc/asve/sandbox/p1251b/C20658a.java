package com.p683ss.android.ugc.asve.sandbox.p1251b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.b.a */
public interface C20658a extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.b.a$a */
    public static abstract class C20659a extends Binder implements C20658a {

        /* renamed from: com.ss.android.ugc.asve.sandbox.b.a$a$a */
        public static class C20660a implements C20658a {

            /* renamed from: a */
            private IBinder f56518a;

            public final IBinder asBinder() {
                return this.f56518a;
            }

            public C20660a(IBinder iBinder) {
                this.f56518a = iBinder;
            }

            /* renamed from: a */
            public final void mo43772a(String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.IARTextContentCallback");
                    obtain.writeStringArray(strArr);
                    this.f56518a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20659a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.listener.IARTextContentCallback");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.listener.IARTextContentCallback";
            if (i == 1) {
                parcel.enforceInterface(str);
                mo43772a(parcel.createStringArray());
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
    void mo43772a(String[] strArr) throws RemoteException;
}
