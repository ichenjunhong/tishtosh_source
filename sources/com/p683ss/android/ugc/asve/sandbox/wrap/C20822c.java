package com.p683ss.android.ugc.asve.sandbox.wrap;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.wrap.c */
public interface C20822c extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.wrap.c$a */
    public static abstract class C20823a extends Binder implements C20822c {

        /* renamed from: com.ss.android.ugc.asve.sandbox.wrap.c$a$a */
        public static class C20824a implements C20822c {

            /* renamed from: a */
            private IBinder f56762a;

            public final IBinder asBinder() {
                return this.f56762a;
            }

            public C20824a(IBinder iBinder) {
                this.f56762a = iBinder;
            }

            /* renamed from: a */
            public final void mo43732a(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.wrap.ISandBoxLogger");
                    obtain.writeString(str);
                    this.f56762a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo43733b(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.wrap.ISandBoxLogger");
                    obtain.writeString(str);
                    this.f56762a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final void mo43734c(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.wrap.ISandBoxLogger");
                    obtain.writeString(str);
                    this.f56762a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final void mo43735d(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.wrap.ISandBoxLogger");
                    obtain.writeString(str);
                    this.f56762a.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20823a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.wrap.ISandBoxLogger");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.wrap.ISandBoxLogger";
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface(str);
                        mo43732a(parcel.readString());
                        return true;
                    case 2:
                        parcel.enforceInterface(str);
                        mo43733b(parcel.readString());
                        return true;
                    case 3:
                        parcel.enforceInterface(str);
                        mo43734c(parcel.readString());
                        return true;
                    case 4:
                        parcel.enforceInterface(str);
                        mo43735d(parcel.readString());
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
    void mo43732a(String str) throws RemoteException;

    /* renamed from: b */
    void mo43733b(String str) throws RemoteException;

    /* renamed from: c */
    void mo43734c(String str) throws RemoteException;

    /* renamed from: d */
    void mo43735d(String str) throws RemoteException;
}
