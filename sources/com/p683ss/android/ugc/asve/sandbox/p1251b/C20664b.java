package com.p683ss.android.ugc.asve.sandbox.p1251b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.b.b */
public interface C20664b extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.b.b$a */
    public static abstract class C20665a extends Binder implements C20664b {

        /* renamed from: com.ss.android.ugc.asve.sandbox.b.b$a$a */
        public static class C20666a implements C20664b {

            /* renamed from: a */
            private IBinder f56520a;

            public final IBinder asBinder() {
                return this.f56520a;
            }

            /* renamed from: a */
            public final void mo43800a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.IASCommonRunableCallback");
                    this.f56520a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public C20666a(IBinder iBinder) {
                this.f56520a = iBinder;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20665a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.listener.IASCommonRunableCallback");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.listener.IASCommonRunableCallback";
            if (i == 1) {
                parcel.enforceInterface(str);
                mo43800a();
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
    void mo43800a() throws RemoteException;
}
