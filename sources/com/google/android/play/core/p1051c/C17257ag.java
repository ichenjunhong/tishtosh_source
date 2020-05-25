package com.google.android.play.core.p1051c;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* renamed from: com.google.android.play.core.c.ag */
public abstract class C17257ag extends C17274aw implements C17255ae {
    public C17257ag() {
        super("com.google.android.play.core.splitinstall.protocol.ISplitInstallServiceCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo33543a(int i, Parcel parcel) throws RemoteException {
        switch (i) {
            case 2:
                mo33533a(parcel.readInt(), (Bundle) C17273av.m42316a(parcel, Bundle.CREATOR));
                break;
            case 3:
                int readInt = parcel.readInt();
                C17273av.m42316a(parcel, Bundle.CREATOR);
                mo33532a(readInt);
                break;
            case 4:
                mo33537b(parcel.readInt(), (Bundle) C17273av.m42316a(parcel, Bundle.CREATOR));
                break;
            case 5:
                mo33539c(parcel.readInt(), (Bundle) C17273av.m42316a(parcel, Bundle.CREATOR));
                break;
            case 6:
                mo33534a((Bundle) C17273av.m42316a(parcel, Bundle.CREATOR));
                break;
            case 7:
                mo33535a((List<Bundle>) parcel.createTypedArrayList(Bundle.CREATOR));
                break;
            case 8:
                mo33538b((Bundle) C17273av.m42316a(parcel, Bundle.CREATOR));
                break;
            case 9:
                mo33540c((Bundle) C17273av.m42316a(parcel, Bundle.CREATOR));
                break;
            case 10:
                C17273av.m42316a(parcel, Bundle.CREATOR);
                mo33531a();
                break;
            case 11:
                C17273av.m42316a(parcel, Bundle.CREATOR);
                mo33536b();
                break;
            case 12:
                mo33541d((Bundle) C17273av.m42316a(parcel, Bundle.CREATOR));
                break;
            case 13:
                mo33542e((Bundle) C17273av.m42316a(parcel, Bundle.CREATOR));
                break;
            default:
                return false;
        }
        return true;
    }
}
