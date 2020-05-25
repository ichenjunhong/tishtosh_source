package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.p1027a.C14882b.C14883a;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.z */
public abstract class C16417z extends bgp implements C16390y {
    public C16417z() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        C15986ja jaVar;
        switch (i) {
            case 1:
                mo27714a();
                parcel2.writeNoException();
                break;
            case 2:
                mo27715a(parcel.readFloat());
                parcel2.writeNoException();
                break;
            case 3:
                mo27719a(parcel.readString());
                parcel2.writeNoException();
                break;
            case 4:
                mo27721a(bgq.m35598a(parcel));
                parcel2.writeNoException();
                break;
            case 5:
                mo27716a(C14883a.m30535a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                break;
            case 6:
                mo27720a(parcel.readString(), C14883a.m30535a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 7:
                float b = mo27722b();
                parcel2.writeNoException();
                parcel2.writeFloat(b);
                break;
            case 8:
                boolean c = mo27724c();
                parcel2.writeNoException();
                bgq.m35597a(parcel2, c);
                break;
            case 9:
                String d = mo27725d();
                parcel2.writeNoException();
                parcel2.writeString(d);
                break;
            case 10:
                mo27723b(parcel.readString());
                parcel2.writeNoException();
                break;
            case 11:
                mo27718a(C16136op.m38207a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 12:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    jaVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
                    if (queryLocalInterface instanceof C15986ja) {
                        jaVar = (C15986ja) queryLocalInterface;
                    } else {
                        jaVar = new C15987jb(readStrongBinder);
                    }
                }
                mo27717a(jaVar);
                parcel2.writeNoException();
                break;
            case 13:
                List e = mo27726e();
                parcel2.writeNoException();
                parcel2.writeTypedList(e);
                break;
            default:
                return false;
        }
        return true;
    }
}
