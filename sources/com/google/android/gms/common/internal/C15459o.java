package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.common.internal.o */
public interface C15459o extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.o$a */
    public static abstract class C15460a extends Binder implements C15459o {

        /* renamed from: com.google.android.gms.common.internal.o$a$a */
        static class C15461a implements C15459o {

            /* renamed from: a */
            private final IBinder f39869a;

            C15461a(IBinder iBinder) {
                this.f39869a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f39869a;
            }

            /* renamed from: a */
            public final void mo28446a(C15457n nVar, GetServiceRequest getServiceRequest) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(nVar != null ? nVar.asBinder() : null);
                    if (getServiceRequest != null) {
                        obtain.writeInt(1);
                        getServiceRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f39869a.transact(46, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            C15457n nVar;
            if (i > 16777215) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            IBinder readStrongBinder = parcel.readStrongBinder();
            GetServiceRequest getServiceRequest = null;
            if (readStrongBinder == null) {
                nVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsCallbacks");
                if (queryLocalInterface instanceof C15457n) {
                    nVar = (C15457n) queryLocalInterface;
                } else {
                    nVar = new C15421al(readStrongBinder);
                }
            }
            if (i == 46) {
                if (parcel.readInt() != 0) {
                    getServiceRequest = (GetServiceRequest) GetServiceRequest.CREATOR.createFromParcel(parcel);
                }
                mo28446a(nVar, getServiceRequest);
                parcel2.writeNoException();
                return true;
            } else if (i == 47) {
                if (parcel.readInt() != 0) {
                    zzr.CREATOR.createFromParcel(parcel);
                }
                throw new UnsupportedOperationException();
            } else {
                parcel.readInt();
                if (i != 4) {
                    parcel.readString();
                }
                if (!(i == 23 || i == 25 || i == 27)) {
                    if (i != 30) {
                        if (i != 34) {
                            if (!(i == 41 || i == 43)) {
                                switch (i) {
                                    case 1:
                                        parcel.readString();
                                        parcel.createStringArray();
                                        parcel.readString();
                                        if (parcel.readInt() != 0) {
                                            Bundle.CREATOR.createFromParcel(parcel);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        break;
                                    default:
                                        switch (i) {
                                            case 5:
                                            case 6:
                                            case 7:
                                            case 8:
                                            case 11:
                                            case 12:
                                            case 13:
                                            case 14:
                                            case 15:
                                            case 16:
                                            case 17:
                                            case 18:
                                                break;
                                            case 9:
                                                parcel.readString();
                                                parcel.createStringArray();
                                                parcel.readString();
                                                parcel.readStrongBinder();
                                                parcel.readString();
                                                if (parcel.readInt() != 0) {
                                                    Bundle.CREATOR.createFromParcel(parcel);
                                                    break;
                                                }
                                                break;
                                            case 10:
                                                parcel.readString();
                                                parcel.createStringArray();
                                                break;
                                            case 19:
                                                parcel.readStrongBinder();
                                                if (parcel.readInt() != 0) {
                                                    Bundle.CREATOR.createFromParcel(parcel);
                                                    break;
                                                }
                                                break;
                                            case 20:
                                                break;
                                            default:
                                                switch (i) {
                                                    case 37:
                                                    case 38:
                                                        break;
                                                }
                                        }
                                }
                            }
                        } else {
                            parcel.readString();
                        }
                        throw new UnsupportedOperationException();
                    }
                    parcel.createStringArray();
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                        Bundle.CREATOR.createFromParcel(parcel);
                    }
                    throw new UnsupportedOperationException();
                }
                if (parcel.readInt() != 0) {
                    Bundle.CREATOR.createFromParcel(parcel);
                }
                throw new UnsupportedOperationException();
            }
        }
    }

    /* renamed from: a */
    void mo28446a(C15457n nVar, GetServiceRequest getServiceRequest) throws RemoteException;
}
