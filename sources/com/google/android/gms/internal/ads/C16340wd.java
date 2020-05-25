package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.wd */
public final class C16340wd implements Creator<zzaxx> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaxx[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        Bundle bundle = null;
        zzbgz zzbgz = null;
        ApplicationInfo applicationInfo = null;
        String str = null;
        List list = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 1:
                    bundle = C15467a.m32165p(parcel, a);
                    break;
                case 2:
                    zzbgz = (zzbgz) C15467a.m32145a(parcel, a, zzbgz.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) C15467a.m32145a(parcel, a, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    str = C15467a.m32163n(parcel, a);
                    break;
                case 5:
                    list = C15467a.m32170u(parcel, a);
                    break;
                case 6:
                    packageInfo = (PackageInfo) C15467a.m32145a(parcel, a, PackageInfo.CREATOR);
                    break;
                case 7:
                    str2 = C15467a.m32163n(parcel, a);
                    break;
                case 8:
                    z = C15467a.m32152c(parcel, a);
                    break;
                case 9:
                    str3 = C15467a.m32163n(parcel, a);
                    break;
                default:
                    C15467a.m32149b(parcel, a);
                    break;
            }
        }
        C15467a.m32173x(parcel, b);
        zzaxx zzaxx = new zzaxx(bundle, zzbgz, applicationInfo, str, list, packageInfo, str2, z, str3);
        return zzaxx;
    }
}
