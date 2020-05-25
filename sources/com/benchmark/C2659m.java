package com.benchmark;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* renamed from: com.benchmark.m */
public interface C2659m extends IInterface {

    /* renamed from: com.benchmark.m$a */
    public static abstract class C2660a extends Binder implements C2659m {

        /* renamed from: com.benchmark.m$a$a */
        static class C2661a implements C2659m {

            /* renamed from: a */
            private IBinder f8098a;

            public final IBinder asBinder() {
                return this.f8098a;
            }

            C2661a(IBinder iBinder) {
                this.f8098a = iBinder;
            }

            /* renamed from: a */
            public final void mo7185a(Map map) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.benchmark.IProxyCallback");
                    obtain.writeMap(map);
                    this.f8098a.transact(1, obtain, obtain2, 0);
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

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.benchmark.IProxyCallback";
            if (i == 1) {
                parcel.enforceInterface(str);
                mo7185a(parcel.readHashMap(getClass().getClassLoader()));
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
    void mo7185a(Map map) throws RemoteException;
}
