package com.benchmark;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.benchmark.j */
public interface C2654j extends IInterface {

    /* renamed from: com.benchmark.j$a */
    public static abstract class C2655a extends Binder implements C2654j {

        /* renamed from: com.benchmark.j$a$a */
        static class C2656a implements C2654j {

            /* renamed from: a */
            private IBinder f8097a;

            public final IBinder asBinder() {
                return this.f8097a;
            }

            C2656a(IBinder iBinder) {
                this.f8097a = iBinder;
            }

            /* renamed from: a */
            public final void mo7168a(List list, C2651i iVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.benchmark.IBMManager");
                    obtain.writeList(list);
                    if (iVar != null) {
                        iBinder = iVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f8097a.transact(1, obtain, obtain2, 0);
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

        public C2655a() {
            attachInterface(this, "com.benchmark.IBMManager");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            C2651i iVar;
            String str = "com.benchmark.IBMManager";
            if (i == 1) {
                parcel.enforceInterface(str);
                ArrayList readArrayList = parcel.readArrayList(getClass().getClassLoader());
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    iVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.benchmark.IBMCallback");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof C2651i)) {
                        iVar = new C2653a(readStrongBinder);
                    } else {
                        iVar = (C2651i) queryLocalInterface;
                    }
                }
                mo7168a(readArrayList, iVar);
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
    void mo7168a(List list, C2651i iVar) throws RemoteException;
}
