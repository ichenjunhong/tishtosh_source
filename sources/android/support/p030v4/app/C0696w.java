package android.support.p030v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: android.support.v4.app.w */
public interface C0696w extends IInterface {

    /* renamed from: android.support.v4.app.w$a */
    public static abstract class C0697a extends Binder implements C0696w {

        /* renamed from: android.support.v4.app.w$a$a */
        static class C0698a implements C0696w {

            /* renamed from: a */
            private IBinder f2486a;

            public final IBinder asBinder() {
                return this.f2486a;
            }

            C0698a(IBinder iBinder) {
                this.f2486a = iBinder;
            }

            /* renamed from: a */
            public final void mo2342a(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    this.f2486a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo2343a(String str, int i, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    this.f2486a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo2344a(String str, int i, String str2, Notification notification) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2486a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            Notification notification;
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
                        String readString = parcel.readString();
                        int readInt = parcel.readInt();
                        String readString2 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            notification = (Notification) Notification.CREATOR.createFromParcel(parcel);
                        } else {
                            notification = null;
                        }
                        mo2344a(readString, readInt, readString2, notification);
                        return true;
                    case 2:
                        parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
                        mo2343a(parcel.readString(), parcel.readInt(), parcel.readString());
                        return true;
                    case 3:
                        parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
                        mo2342a(parcel.readString());
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("android.support.v4.app.INotificationSideChannel");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo2342a(String str) throws RemoteException;

    /* renamed from: a */
    void mo2343a(String str, int i, String str2) throws RemoteException;

    /* renamed from: a */
    void mo2344a(String str, int i, String str2, Notification notification) throws RemoteException;
}
