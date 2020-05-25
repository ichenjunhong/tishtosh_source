package com.p683ss.android.ugc.asve.sandbox.p1251b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.ss.android.ugc.asve.sandbox.b.o */
public interface C20703o extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.b.o$a */
    public static abstract class C20704a extends Binder implements C20703o {

        /* renamed from: com.ss.android.ugc.asve.sandbox.b.o$a$a */
        static class C20705a implements C20703o {

            /* renamed from: a */
            private IBinder f56533a;

            public final IBinder asBinder() {
                return this.f56533a;
            }

            C20705a(IBinder iBinder) {
                this.f56533a = iBinder;
            }

            /* renamed from: a */
            public final void mo43746a(int i, float f, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.ICameraZoomListener");
                    obtain.writeInt(i);
                    obtain.writeFloat(f);
                    obtain.writeInt(z ? 1 : 0);
                    this.f56533a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo43747a(int i, boolean z, boolean z2, float f, int[] iArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.ICameraZoomListener");
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(z2 ? 1 : 0);
                    obtain.writeFloat(f);
                    obtain.writeIntArray(iArr);
                    this.f56533a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20704a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.listener.ICameraZoomListener");
        }

        /* renamed from: a */
        public static C20703o m52043a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.listener.ICameraZoomListener");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C20703o)) {
                return new C20705a(iBinder);
            }
            return (C20703o) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            boolean z;
            boolean z2;
            String str = "com.ss.android.ugc.asve.sandbox.listener.ICameraZoomListener";
            if (i != 1598968902) {
                boolean z3 = false;
                switch (i) {
                    case 1:
                        parcel.enforceInterface(str);
                        int readInt = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (parcel.readInt() != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        mo43747a(readInt, z, z2, parcel.readFloat(), parcel.createIntArray());
                        return true;
                    case 2:
                        parcel.enforceInterface(str);
                        int readInt2 = parcel.readInt();
                        float readFloat = parcel.readFloat();
                        if (parcel.readInt() != 0) {
                            z3 = true;
                        }
                        mo43746a(readInt2, readFloat, z3);
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
    void mo43746a(int i, float f, boolean z) throws RemoteException;

    /* renamed from: a */
    void mo43747a(int i, boolean z, boolean z2, float f, int[] iArr) throws RemoteException;
}
