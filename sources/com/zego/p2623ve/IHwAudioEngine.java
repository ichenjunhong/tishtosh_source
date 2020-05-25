package com.zego.p2623ve;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* renamed from: com.zego.ve.IHwAudioEngine */
interface IHwAudioEngine extends IInterface {

    /* renamed from: com.zego.ve.IHwAudioEngine$Stub */
    public static abstract class Stub extends Binder implements IHwAudioEngine {

        /* renamed from: com.zego.ve.IHwAudioEngine$Stub$Proxy */
        static class Proxy implements IHwAudioEngine {
            private IBinder mRemote;

            public IBinder asBinder() {
                return this.mRemote;
            }

            public List getSupportedFeatures() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.multimedia.audioengine.IHwAudioEngine");
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readArrayList(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public boolean isFeatureSupported(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.multimedia.audioengine.IHwAudioEngine");
                    obtain.writeInt(i);
                    boolean z = false;
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void init(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.multimedia.audioengine.IHwAudioEngine");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.mRemote.transact(3, obtain, obtain2, 0);
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

        public Stub() {
            attachInterface(this, "com.huawei.multimedia.audioengine.IHwAudioEngine");
        }

        public static IHwAudioEngine asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.huawei.multimedia.audioengine.IHwAudioEngine");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IHwAudioEngine)) {
                return new Proxy(iBinder);
            }
            return (IHwAudioEngine) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.huawei.multimedia.audioengine.IHwAudioEngine");
                        List supportedFeatures = getSupportedFeatures();
                        parcel2.writeNoException();
                        parcel2.writeList(supportedFeatures);
                        return true;
                    case 2:
                        parcel.enforceInterface("com.huawei.multimedia.audioengine.IHwAudioEngine");
                        boolean isFeatureSupported = isFeatureSupported(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(isFeatureSupported ? 1 : 0);
                        return true;
                    case 3:
                        parcel.enforceInterface("com.huawei.multimedia.audioengine.IHwAudioEngine");
                        init(parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.huawei.multimedia.audioengine.IHwAudioEngine");
                return true;
            }
        }
    }

    List getSupportedFeatures() throws RemoteException;

    void init(String str, String str2) throws RemoteException;

    boolean isFeatureSupported(int i) throws RemoteException;
}
