package com.benchmark;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.benchmark.n */
public interface C2662n extends IInterface {

    /* renamed from: com.benchmark.n$a */
    public static abstract class C2663a extends Binder implements C2662n {

        /* renamed from: com.benchmark.n$a$a */
        static class C2664a implements C2662n {

            /* renamed from: a */
            private IBinder f8099a;

            public final IBinder asBinder() {
                return this.f8099a;
            }

            C2664a(IBinder iBinder) {
                this.f8099a = iBinder;
            }

            /* renamed from: a */
            public final void mo7167a(C2659m mVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.benchmark.IProxyManager");
                    if (mVar != null) {
                        iBinder = mVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f8099a.transact(1, obtain, obtain2, 0);
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

        public C2663a() {
            attachInterface(this, "com.benchmark.IProxyManager");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            C2659m mVar;
            String str = "com.benchmark.IProxyManager";
            if (i == 1) {
                parcel.enforceInterface(str);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    mVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.benchmark.IProxyCallback");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof C2659m)) {
                        mVar = new C2661a(readStrongBinder);
                    } else {
                        mVar = (C2659m) queryLocalInterface;
                    }
                }
                mo7167a(mVar);
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
    void mo7167a(C2659m mVar) throws RemoteException;
}
