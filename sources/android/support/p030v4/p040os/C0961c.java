package android.support.p030v4.p040os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: android.support.v4.os.c */
public interface C0961c extends IInterface {

    /* renamed from: android.support.v4.os.c$a */
    public static abstract class C0962a extends Binder implements C0961c {

        /* renamed from: android.support.v4.os.c$a$a */
        static class C0963a implements C0961c {

            /* renamed from: a */
            private IBinder f3116a;

            public final IBinder asBinder() {
                return this.f3116a;
            }

            C0963a(IBinder iBinder) {
                this.f3116a = iBinder;
            }

            /* renamed from: a */
            public final void mo2937a(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.os.IResultReceiver");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f3116a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C0962a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            Bundle bundle;
            if (i == 1) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
                int readInt = parcel.readInt();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                } else {
                    bundle = null;
                }
                mo2937a(readInt, bundle);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo2937a(int i, Bundle bundle) throws RemoteException;
}
