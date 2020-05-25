package com.p683ss.android.ugc.asve.sandbox.wrap;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* renamed from: com.ss.android.ugc.asve.sandbox.wrap.e */
public interface C20828e extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.wrap.e$a */
    public static abstract class C20829a extends Binder implements C20828e {

        /* renamed from: com.ss.android.ugc.asve.sandbox.wrap.e$a$a */
        public static class C20830a implements C20828e {

            /* renamed from: a */
            private IBinder f56764a;

            public final IBinder asBinder() {
                return this.f56764a;
            }

            public C20830a(IBinder iBinder) {
                this.f56764a = iBinder;
            }

            /* renamed from: a */
            public final void mo43736a(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.wrap.ISandBoxRecordMonitor");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f56764a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo43738a(String str, Map map) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.wrap.ISandBoxRecordMonitor");
                    obtain.writeString(str);
                    obtain.writeMap(map);
                    this.f56764a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo43737a(String str, String str2, String str3, String str4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.wrap.ISandBoxRecordMonitor");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeString(str4);
                    this.f56764a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20829a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.wrap.ISandBoxRecordMonitor");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.wrap.ISandBoxRecordMonitor";
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface(str);
                        mo43736a(parcel.readString(), parcel.readString());
                        return true;
                    case 2:
                        parcel.enforceInterface(str);
                        mo43737a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                        return true;
                    case 3:
                        parcel.enforceInterface(str);
                        mo43738a(parcel.readString(), (Map) parcel.readHashMap(getClass().getClassLoader()));
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
    void mo43736a(String str, String str2) throws RemoteException;

    /* renamed from: a */
    void mo43737a(String str, String str2, String str3, String str4) throws RemoteException;

    /* renamed from: a */
    void mo43738a(String str, Map map) throws RemoteException;
}
