package com.zego.p2623ve;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.zego.ve.IHwAudioKaraokeFeature */
interface IHwAudioKaraokeFeature extends IInterface {

    /* renamed from: com.zego.ve.IHwAudioKaraokeFeature$Stub */
    public static abstract class Stub extends Binder implements IHwAudioKaraokeFeature {

        /* renamed from: com.zego.ve.IHwAudioKaraokeFeature$Stub$Proxy */
        static class Proxy implements IHwAudioKaraokeFeature {
            private IBinder mRemote;

            public IBinder asBinder() {
                return this.mRemote;
            }

            public int getKaraokeLatency() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.multimedia.audioengine.IHwAudioKaraokeFeature");
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean isKaraokeFeatureSupport() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.multimedia.audioengine.IHwAudioKaraokeFeature");
                    boolean z = false;
                    this.mRemote.transact(1, obtain, obtain2, 0);
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

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public int enableKaraokeFeature(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.multimedia.audioengine.IHwAudioKaraokeFeature");
                    obtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void init(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.multimedia.audioengine.IHwAudioKaraokeFeature");
                    obtain.writeString(str);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int setParameter(String str, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.multimedia.audioengine.IHwAudioKaraokeFeature");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
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
            attachInterface(this, "com.huawei.multimedia.audioengine.IHwAudioKaraokeFeature");
        }

        public static IHwAudioKaraokeFeature asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.huawei.multimedia.audioengine.IHwAudioKaraokeFeature");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IHwAudioKaraokeFeature)) {
                return new Proxy(iBinder);
            }
            return (IHwAudioKaraokeFeature) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            boolean z;
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.huawei.multimedia.audioengine.IHwAudioKaraokeFeature");
                        boolean isKaraokeFeatureSupport = isKaraokeFeatureSupport();
                        parcel2.writeNoException();
                        parcel2.writeInt(isKaraokeFeatureSupport ? 1 : 0);
                        return true;
                    case 2:
                        parcel.enforceInterface("com.huawei.multimedia.audioengine.IHwAudioKaraokeFeature");
                        if (parcel.readInt() != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        int enableKaraokeFeature = enableKaraokeFeature(z);
                        parcel2.writeNoException();
                        parcel2.writeInt(enableKaraokeFeature);
                        return true;
                    case 3:
                        parcel.enforceInterface("com.huawei.multimedia.audioengine.IHwAudioKaraokeFeature");
                        int karaokeLatency = getKaraokeLatency();
                        parcel2.writeNoException();
                        parcel2.writeInt(karaokeLatency);
                        return true;
                    case 4:
                        parcel.enforceInterface("com.huawei.multimedia.audioengine.IHwAudioKaraokeFeature");
                        int parameter = setParameter(parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(parameter);
                        return true;
                    case 5:
                        parcel.enforceInterface("com.huawei.multimedia.audioengine.IHwAudioKaraokeFeature");
                        init(parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.huawei.multimedia.audioengine.IHwAudioKaraokeFeature");
                return true;
            }
        }
    }

    int enableKaraokeFeature(boolean z) throws RemoteException;

    int getKaraokeLatency() throws RemoteException;

    void init(String str) throws RemoteException;

    boolean isKaraokeFeatureSupport() throws RemoteException;

    int setParameter(String str, int i) throws RemoteException;
}
