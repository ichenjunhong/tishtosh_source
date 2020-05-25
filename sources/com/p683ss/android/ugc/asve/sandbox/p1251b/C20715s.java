package com.p683ss.android.ugc.asve.sandbox.p1251b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.p683ss.android.ugc.asve.sandbox.wrap.ASSimpleFaceInfo;

/* renamed from: com.ss.android.ugc.asve.sandbox.b.s */
public interface C20715s extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.b.s$a */
    public static abstract class C20716a extends Binder implements C20715s {

        /* renamed from: com.ss.android.ugc.asve.sandbox.b.s$a$a */
        public static class C20717a implements C20715s {

            /* renamed from: a */
            private IBinder f56537a;

            public final IBinder asBinder() {
                return this.f56537a;
            }

            public C20717a(IBinder iBinder) {
                this.f56537a = iBinder;
            }

            /* renamed from: a */
            public final void mo43768a(ASSimpleFaceInfo[] aSSimpleFaceInfoArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.IFaceInfoListener");
                    obtain.writeTypedArray(aSSimpleFaceInfoArr, 0);
                    this.f56537a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20716a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.listener.IFaceInfoListener");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "com.ss.android.ugc.asve.sandbox.listener.IFaceInfoListener";
            if (i == 1) {
                parcel.enforceInterface(str);
                mo43768a((ASSimpleFaceInfo[]) parcel.createTypedArray(ASSimpleFaceInfo.CREATOR));
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
    void mo43768a(ASSimpleFaceInfo[] aSSimpleFaceInfoArr) throws RemoteException;
}
