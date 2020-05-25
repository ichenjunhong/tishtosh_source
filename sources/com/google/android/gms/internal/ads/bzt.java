package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;
import java.util.List;

public final class bzt implements Creator<zzyv> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzyv[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C15467a.m32148b(parcel);
        Bundle bundle = null;
        List list = null;
        String str = null;
        zzacm zzacm = null;
        Location location = null;
        String str2 = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        List list2 = null;
        String str3 = null;
        String str4 = null;
        zzyp zzyp = null;
        String str5 = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        int i4 = 0;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 1:
                    i = C15467a.m32154e(parcel2, a);
                    break;
                case 2:
                    j = C15467a.m32156g(parcel2, a);
                    break;
                case 3:
                    bundle = C15467a.m32165p(parcel2, a);
                    break;
                case 4:
                    i2 = C15467a.m32154e(parcel2, a);
                    break;
                case 5:
                    list = C15467a.m32170u(parcel2, a);
                    break;
                case 6:
                    z = C15467a.m32152c(parcel2, a);
                    break;
                case 7:
                    i3 = C15467a.m32154e(parcel2, a);
                    break;
                case 8:
                    z2 = C15467a.m32152c(parcel2, a);
                    break;
                case 9:
                    str = C15467a.m32163n(parcel2, a);
                    break;
                case 10:
                    zzacm = (zzacm) C15467a.m32145a(parcel2, a, zzacm.CREATOR);
                    break;
                case 11:
                    location = (Location) C15467a.m32145a(parcel2, a, Location.CREATOR);
                    break;
                case 12:
                    str2 = C15467a.m32163n(parcel2, a);
                    break;
                case 13:
                    bundle2 = C15467a.m32165p(parcel2, a);
                    break;
                case 14:
                    bundle3 = C15467a.m32165p(parcel2, a);
                    break;
                case 15:
                    list2 = C15467a.m32170u(parcel2, a);
                    break;
                case 16:
                    str3 = C15467a.m32163n(parcel2, a);
                    break;
                case 17:
                    str4 = C15467a.m32163n(parcel2, a);
                    break;
                case 18:
                    z3 = C15467a.m32152c(parcel2, a);
                    break;
                case 19:
                    zzyp = (zzyp) C15467a.m32145a(parcel2, a, zzyp.CREATOR);
                    break;
                case 20:
                    i4 = C15467a.m32154e(parcel2, a);
                    break;
                case 21:
                    str5 = C15467a.m32163n(parcel2, a);
                    break;
                default:
                    C15467a.m32149b(parcel2, a);
                    break;
            }
        }
        C15467a.m32173x(parcel2, b);
        zzyv zzyv = new zzyv(i, j, bundle, i2, list, z, i3, z2, str, zzacm, location, str2, bundle2, bundle3, list2, str3, str4, z3, zzyp, i4, str5);
        return zzyv;
    }
}
