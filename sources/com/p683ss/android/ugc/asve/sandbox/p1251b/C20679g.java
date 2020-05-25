package com.p683ss.android.ugc.asve.sandbox.p1251b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.p683ss.android.ugc.asve.recorder.RecorderConcatResult;
import com.p683ss.android.ugc.asve.recorder.RecorderConcatResult.C20405a;

/* renamed from: com.ss.android.ugc.asve.sandbox.b.g */
public interface C20679g extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.b.g$a */
    public static abstract class C20680a extends Binder implements C20679g {

        /* renamed from: com.ss.android.ugc.asve.sandbox.b.g$a$a */
        public static class C20681a implements C20679g {

            /* renamed from: a */
            private IBinder f56525a;

            public final IBinder asBinder() {
                return this.f56525a;
            }

            public C20681a(IBinder iBinder) {
                this.f56525a = iBinder;
            }

            /* renamed from: a */
            public final void mo43779a(RecorderConcatResult recorderConcatResult) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.listener.IASSandBoxConcactCallback");
                    if (recorderConcatResult != null) {
                        obtain.writeInt(1);
                        recorderConcatResult.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f56525a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C20680a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.listener.IASSandBoxConcactCallback");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            RecorderConcatResult recorderConcatResult;
            String str = "com.ss.android.ugc.asve.sandbox.listener.IASSandBoxConcactCallback";
            if (i == 1) {
                parcel.enforceInterface(str);
                if (parcel.readInt() != 0) {
                    recorderConcatResult = C20405a.m50613a(parcel);
                } else {
                    recorderConcatResult = null;
                }
                mo43779a(recorderConcatResult);
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
    void mo43779a(RecorderConcatResult recorderConcatResult) throws RemoteException;
}
