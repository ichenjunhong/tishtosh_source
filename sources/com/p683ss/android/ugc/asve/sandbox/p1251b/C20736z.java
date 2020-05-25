package com.p683ss.android.ugc.asve.sandbox.p1251b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.b.z */
public interface C20736z extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.b.z$a */
    public static abstract class C20737a extends Binder implements C20736z {

        /* renamed from: com.ss.android.ugc.asve.sandbox.b.z$a$a */
        static class C20738a implements C20736z {

            /* renamed from: a */
            private IBinder f56544a;

            public final IBinder asBinder() {
                return this.f56544a;
            }

            C20738a(IBinder iBinder) {
                this.f56544a = iBinder;
            }

            /* renamed from: a */
            public final void mo43743a(boolean z, boolean z2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.IVELandMarkDetectListener");
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(z2 ? 1 : 0);
                    this.f56544a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20737a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.listener.IVELandMarkDetectListener");
        }

        /* renamed from: a */
        public static C20736z m52068a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.listener.IVELandMarkDetectListener");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C20736z)) {
                return new C20738a(iBinder);
            }
            return (C20736z) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            boolean z;
            String str = "com.ss.android.ugc.asve.sandbox.listener.IVELandMarkDetectListener";
            if (i == 1) {
                parcel.enforceInterface(str);
                boolean z2 = false;
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                mo43743a(z, z2);
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
    void mo43743a(boolean z, boolean z2) throws RemoteException;
}
