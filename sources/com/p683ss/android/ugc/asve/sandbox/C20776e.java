package com.p683ss.android.ugc.asve.sandbox;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.p683ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import java.util.List;

/* renamed from: com.ss.android.ugc.asve.sandbox.e */
public interface C20776e extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.e$a */
    public static abstract class C20777a extends Binder implements C20776e {

        /* renamed from: com.ss.android.ugc.asve.sandbox.e$a$a */
        static class C20778a implements C20776e {

            /* renamed from: a */
            private IBinder f56681a;

            public final IBinder asBinder() {
                return this.f56681a;
            }

            /* renamed from: a */
            public final C20776e mo43754a(List<ComposerInfo> list, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxComposerOperation");
                    obtain.writeTypedList(list);
                    obtain.writeInt(i);
                    this.f56681a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return C20777a.m52601a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo43755b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxComposerOperation");
                    this.f56681a.transact(8, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final C20776e mo43748a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxComposerOperation");
                    this.f56681a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return C20777a.m52601a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            C20778a(IBinder iBinder) {
                this.f56681a = iBinder;
            }

            /* renamed from: a */
            public final C20776e mo43749a(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxComposerOperation");
                    obtain.writeInt(i);
                    this.f56681a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return C20777a.m52601a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final C20776e mo43750a(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxComposerOperation");
                    obtain.writeString(str);
                    this.f56681a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return C20777a.m52601a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final C20776e mo43753a(List<String> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxComposerOperation");
                    obtain.writeStringList(list);
                    this.f56681a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return C20777a.m52601a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final C20776e mo43751a(String str, String str2, float f) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxComposerOperation");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeFloat(f);
                    this.f56681a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return C20777a.m52601a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final C20776e mo43752a(String str, String str2, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandBoxComposerOperation");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    this.f56681a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return C20777a.m52601a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20777a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.ISandBoxComposerOperation");
        }

        /* renamed from: a */
        public static C20776e m52601a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.ISandBoxComposerOperation");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C20776e)) {
                return new C20778a(iBinder);
            }
            return (C20776e) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.ISandBoxComposerOperation";
            if (i != 1598968902) {
                IBinder iBinder = null;
                switch (i) {
                    case 1:
                        parcel.enforceInterface(str);
                        C20776e a = mo43750a(parcel.readString());
                        parcel2.writeNoException();
                        if (a != null) {
                            iBinder = a.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 2:
                        parcel.enforceInterface(str);
                        C20776e a2 = mo43749a(parcel.readInt());
                        parcel2.writeNoException();
                        if (a2 != null) {
                            iBinder = a2.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 3:
                        parcel.enforceInterface(str);
                        C20776e a3 = mo43751a(parcel.readString(), parcel.readString(), parcel.readFloat());
                        parcel2.writeNoException();
                        if (a3 != null) {
                            iBinder = a3.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 4:
                        parcel.enforceInterface(str);
                        C20776e a4 = mo43752a(parcel.readString(), parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        if (a4 != null) {
                            iBinder = a4.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 5:
                        parcel.enforceInterface(str);
                        C20776e a5 = mo43754a(parcel.createTypedArrayList(ComposerInfo.CREATOR), parcel.readInt());
                        parcel2.writeNoException();
                        if (a5 != null) {
                            iBinder = a5.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 6:
                        parcel.enforceInterface(str);
                        C20776e a6 = mo43753a((List<String>) parcel.createStringArrayList());
                        parcel2.writeNoException();
                        if (a6 != null) {
                            iBinder = a6.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 7:
                        parcel.enforceInterface(str);
                        C20776e a7 = mo43748a();
                        parcel2.writeNoException();
                        if (a7 != null) {
                            iBinder = a7.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 8:
                        parcel.enforceInterface(str);
                        mo43755b();
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
    C20776e mo43748a() throws RemoteException;

    /* renamed from: a */
    C20776e mo43749a(int i) throws RemoteException;

    /* renamed from: a */
    C20776e mo43750a(String str) throws RemoteException;

    /* renamed from: a */
    C20776e mo43751a(String str, String str2, float f) throws RemoteException;

    /* renamed from: a */
    C20776e mo43752a(String str, String str2, int i) throws RemoteException;

    /* renamed from: a */
    C20776e mo43753a(List<String> list) throws RemoteException;

    /* renamed from: a */
    C20776e mo43754a(List<ComposerInfo> list, int i) throws RemoteException;

    /* renamed from: b */
    void mo43755b() throws RemoteException;
}
