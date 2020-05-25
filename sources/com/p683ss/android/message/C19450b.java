package com.p683ss.android.message;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.p683ss.android.message.C19472c.C19473a;

/* renamed from: com.ss.android.message.b */
public interface C19450b extends IInterface {

    /* renamed from: com.ss.android.message.b$a */
    public static abstract class C19451a extends Binder implements C19450b {

        /* renamed from: com.ss.android.message.b$a$a */
        static class C19452a implements C19450b {

            /* renamed from: a */
            private IBinder f53768a;

            public final IBinder asBinder() {
                return this.f53768a;
            }

            C19452a(IBinder iBinder) {
                this.f53768a = iBinder;
            }

            /* renamed from: a */
            public final void mo40482a(C19472c cVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.message.INotifyService");
                    if (cVar != null) {
                        iBinder = cVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f53768a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo40483b(C19472c cVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.message.INotifyService");
                    if (cVar != null) {
                        iBinder = cVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f53768a.transact(2, obtain, obtain2, 0);
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

        public C19451a() {
            attachInterface(this, "com.ss.android.message.INotifyService");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.message.INotifyService";
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface(str);
                        mo40482a(C19473a.m47672a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface(str);
                        mo40483b(C19473a.m47672a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString(str);
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo40482a(C19472c cVar) throws RemoteException;

    /* renamed from: b */
    void mo40483b(C19472c cVar) throws RemoteException;
}
