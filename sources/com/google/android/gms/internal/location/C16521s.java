package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.internal.location.s */
public final class C16521s implements Creator<zzbf> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        zzbd zzbd = null;
        IBinder iBinder = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        int i = 1;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 1:
                    i = C15467a.m32154e(parcel, a);
                    break;
                case 2:
                    zzbd = (zzbd) C15467a.m32145a(parcel, a, zzbd.CREATOR);
                    break;
                case 3:
                    iBinder = C15467a.m32164o(parcel, a);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) C15467a.m32145a(parcel, a, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinder2 = C15467a.m32164o(parcel, a);
                    break;
                case 6:
                    iBinder3 = C15467a.m32164o(parcel, a);
                    break;
                default:
                    C15467a.m32149b(parcel, a);
                    break;
            }
        }
        C15467a.m32173x(parcel, b);
        zzbf zzbf = new zzbf(i, zzbd, iBinder, pendingIntent, iBinder2, iBinder3);
        return zzbf;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbf[i];
    }
}
