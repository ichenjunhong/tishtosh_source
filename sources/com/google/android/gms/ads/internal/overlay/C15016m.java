package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.zzar;
import com.google.android.gms.common.internal.safeparcel.C15467a;
import com.google.android.gms.internal.ads.zzbgz;

/* renamed from: com.google.android.gms.ads.internal.overlay.m */
public final class C15016m implements Creator<AdOverlayInfoParcel> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new AdOverlayInfoParcel[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C15467a.m32148b(parcel);
        zzc zzc = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        String str = null;
        String str2 = null;
        IBinder iBinder5 = null;
        String str3 = null;
        zzbgz zzbgz = null;
        String str4 = null;
        zzar zzar = null;
        IBinder iBinder6 = null;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 2:
                    zzc = (zzc) C15467a.m32145a(parcel2, a, zzc.CREATOR);
                    break;
                case 3:
                    iBinder = C15467a.m32164o(parcel2, a);
                    break;
                case 4:
                    iBinder2 = C15467a.m32164o(parcel2, a);
                    break;
                case 5:
                    iBinder3 = C15467a.m32164o(parcel2, a);
                    break;
                case 6:
                    iBinder4 = C15467a.m32164o(parcel2, a);
                    break;
                case 7:
                    str = C15467a.m32163n(parcel2, a);
                    break;
                case 8:
                    z = C15467a.m32152c(parcel2, a);
                    break;
                case 9:
                    str2 = C15467a.m32163n(parcel2, a);
                    break;
                case 10:
                    iBinder5 = C15467a.m32164o(parcel2, a);
                    break;
                case 11:
                    i = C15467a.m32154e(parcel2, a);
                    break;
                case 12:
                    i2 = C15467a.m32154e(parcel2, a);
                    break;
                case 13:
                    str3 = C15467a.m32163n(parcel2, a);
                    break;
                case 14:
                    zzbgz = (zzbgz) C15467a.m32145a(parcel2, a, zzbgz.CREATOR);
                    break;
                case 16:
                    str4 = C15467a.m32163n(parcel2, a);
                    break;
                case 17:
                    zzar = (zzar) C15467a.m32145a(parcel2, a, zzar.CREATOR);
                    break;
                case 18:
                    iBinder6 = C15467a.m32164o(parcel2, a);
                    break;
                default:
                    C15467a.m32149b(parcel2, a);
                    break;
            }
        }
        C15467a.m32173x(parcel2, b);
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(zzc, iBinder, iBinder2, iBinder3, iBinder4, str, z, str2, iBinder5, i, i2, str3, zzbgz, str4, zzar, iBinder6);
        return adOverlayInfoParcel;
    }
}
