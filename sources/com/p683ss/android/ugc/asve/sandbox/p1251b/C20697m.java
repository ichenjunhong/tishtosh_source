package com.p683ss.android.ugc.asve.sandbox.p1251b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.b.m */
public interface C20697m extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.b.m$a */
    public static abstract class C20698a extends Binder implements C20697m {

        /* renamed from: com.ss.android.ugc.asve.sandbox.b.m$a$a */
        public static class C20699a implements C20697m {

            /* renamed from: a */
            private IBinder f56531a;

            public final IBinder asBinder() {
                return this.f56531a;
            }

            public C20699a(IBinder iBinder) {
                this.f56531a = iBinder;
            }

            /* renamed from: a */
            public final void mo43778a(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.IASSandboxRunningErrorCallback");
                    obtain.writeInt(i);
                    this.f56531a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20698a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.listener.IASSandboxRunningErrorCallback");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.listener.IASSandboxRunningErrorCallback";
            if (i == 1) {
                parcel.enforceInterface(str);
                mo43778a(parcel.readInt());
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
    void mo43778a(int i) throws RemoteException;
}
