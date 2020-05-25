package com.p683ss.android.ugc.asve.sandbox.wrap;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.wrap.b */
public interface C20819b extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.wrap.b$a */
    public static abstract class C20820a extends Binder implements C20819b {

        /* renamed from: com.ss.android.ugc.asve.sandbox.wrap.b$a$a */
        public static class C20821a implements C20819b {

            /* renamed from: a */
            private IBinder f56761a;

            public final IBinder asBinder() {
                return this.f56761a;
            }

            public C20821a(IBinder iBinder) {
                this.f56761a = iBinder;
            }

            /* renamed from: a */
            public final void mo43739a(String str, String str2, String str3, String str4, String str5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.wrap.ISandBoxApplogPresenter");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeString(str4);
                    obtain.writeString(str5);
                    this.f56761a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20820a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.wrap.ISandBoxApplogPresenter");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.wrap.ISandBoxApplogPresenter";
            if (i == 1) {
                parcel.enforceInterface(str);
                mo43739a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
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
    void mo43739a(String str, String str2, String str3, String str4, String str5) throws RemoteException;
}
