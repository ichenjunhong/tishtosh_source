package android.support.customtabs;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.customtabs.C0381g.C0382a;

/* renamed from: android.support.customtabs.i */
public interface C0387i extends IInterface {

    /* renamed from: android.support.customtabs.i$a */
    public static abstract class C0388a extends Binder implements C0387i {
        public IBinder asBinder() {
            return this;
        }

        public C0388a() {
            attachInterface(this, "android.support.customtabs.IPostMessageService");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                Bundle bundle = null;
                switch (i) {
                    case 2:
                        parcel.enforceInterface("android.support.customtabs.IPostMessageService");
                        C0381g a = C0382a.m939a(parcel.readStrongBinder());
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        mo846a(a, bundle);
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface("android.support.customtabs.IPostMessageService");
                        C0381g a2 = C0382a.m939a(parcel.readStrongBinder());
                        String readString = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        mo847a(a2, readString, bundle);
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("android.support.customtabs.IPostMessageService");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo846a(C0381g gVar, Bundle bundle) throws RemoteException;

    /* renamed from: a */
    void mo847a(C0381g gVar, String str, Bundle bundle) throws RemoteException;
}
