package com.p907f.p908a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.f.a.a */
public interface C13483a extends IInterface {

    /* renamed from: com.f.a.a$a */
    public static abstract class C13484a extends Binder implements C13483a {

        /* renamed from: com.f.a.a$a$a */
        static class C13485a implements C13483a {

            /* renamed from: a */
            private IBinder f35161a;

            /* renamed from: b */
            private String f35162b = "omediatestkey";

            public final IBinder asBinder() {
                return this.f35161a;
            }

            /* renamed from: a */
            public final String mo25268a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.oppo.omedia.IOMediaService");
                    obtain.writeString(this.f35162b);
                    this.f35161a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            C13485a(IBinder iBinder) {
                this.f35161a = iBinder;
            }

            /* renamed from: b */
            public final boolean mo25271b(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.oppo.omedia.IOMediaService");
                    obtain.writeString(this.f35162b);
                    obtain.writeString(str);
                    boolean z = false;
                    this.f35161a.transact(4, obtain, obtain2, 0);
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

            /* renamed from: a */
            public final String mo25269a(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.oppo.omedia.IOMediaService");
                    obtain.writeString(this.f35162b);
                    obtain.writeString(str);
                    this.f35161a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final String mo25270a(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.oppo.omedia.IOMediaService");
                    if (str2 == null) {
                        obtain.writeString("omediatestkey");
                    } else {
                        obtain.writeString(str2);
                    }
                    obtain.writeString(str);
                    this.f35161a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    if (readString != null) {
                        this.f35162b = str2;
                    }
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    /* renamed from: a */
    String mo25268a() throws RemoteException;

    /* renamed from: a */
    String mo25269a(String str) throws RemoteException;

    /* renamed from: a */
    String mo25270a(String str, String str2) throws RemoteException;

    /* renamed from: b */
    boolean mo25271b(String str) throws RemoteException;
}
