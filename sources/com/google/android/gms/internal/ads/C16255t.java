package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.p1027a.C14882b.C14883a;

/* renamed from: com.google.android.gms.internal.ads.t */
public abstract class C16255t extends bgp implements C16228s {
    public C16255t() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                C15931h a = mo27436a(C14883a.m30535a(parcel.readStrongBinder()), (zzyz) bgq.m35594a(parcel, zzyz.CREATOR), parcel.readString(), C16136op.m38207a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                bgq.m35595a(parcel2, (IInterface) a);
                break;
            case 2:
                C15931h b = mo27440b(C14883a.m30535a(parcel.readStrongBinder()), (zzyz) bgq.m35594a(parcel, zzyz.CREATOR), parcel.readString(), C16136op.m38207a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                bgq.m35595a(parcel2, (IInterface) b);
                break;
            case 3:
                C15795c a2 = mo27432a(C14883a.m30535a(parcel.readStrongBinder()), parcel.readString(), C16136op.m38207a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                bgq.m35595a(parcel2, (IInterface) a2);
                break;
            case 4:
                C16390y a3 = mo27437a(C14883a.m30535a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                bgq.m35595a(parcel2, (IInterface) a3);
                break;
            case 5:
                C15870et a4 = mo27433a(C14883a.m30535a(parcel.readStrongBinder()), C14883a.m30535a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                bgq.m35595a(parcel2, (IInterface) a4);
                break;
            case 6:
                C16391ya a5 = mo27439a(C14883a.m30535a(parcel.readStrongBinder()), C16136op.m38207a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                bgq.m35595a(parcel2, (IInterface) a5);
                break;
            case 7:
                C16232sd b2 = mo27441b(C14883a.m30535a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                bgq.m35595a(parcel2, (IInterface) b2);
                break;
            case 8:
                C16222ru c = mo27443c(C14883a.m30535a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                bgq.m35595a(parcel2, (IInterface) c);
                break;
            case 9:
                C16390y a6 = mo27438a(C14883a.m30535a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                bgq.m35595a(parcel2, (IInterface) a6);
                break;
            case 10:
                C15931h a7 = mo27435a(C14883a.m30535a(parcel.readStrongBinder()), (zzyz) bgq.m35594a(parcel, zzyz.CREATOR), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                bgq.m35595a(parcel2, (IInterface) a7);
                break;
            case 11:
                C15875ey a8 = mo27434a(C14883a.m30535a(parcel.readStrongBinder()), C14883a.m30535a(parcel.readStrongBinder()), C14883a.m30535a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                bgq.m35595a(parcel2, (IInterface) a8);
                break;
            case 12:
                C16429zl b3 = mo27442b(C14883a.m30535a(parcel.readStrongBinder()), parcel.readString(), C16136op.m38207a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                bgq.m35595a(parcel2, (IInterface) b3);
                break;
            default:
                return false;
        }
        return true;
    }
}
