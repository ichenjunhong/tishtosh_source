package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;
import com.google.android.gms.common.internal.safeparcel.C15467a.C15468a;
import java.util.HashSet;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.c */
public final class C15113c implements Creator<zzr> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzr[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        zzt zzt = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 1:
                    i = C15467a.m32154e(parcel, a);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case 2:
                    zzt = (zzt) C15467a.m32145a(parcel, a, zzt.CREATOR);
                    hashSet.add(Integer.valueOf(2));
                    break;
                case 3:
                    str = C15467a.m32163n(parcel, a);
                    hashSet.add(Integer.valueOf(3));
                    break;
                case 4:
                    str2 = C15467a.m32163n(parcel, a);
                    hashSet.add(Integer.valueOf(4));
                    break;
                case 5:
                    str3 = C15467a.m32163n(parcel, a);
                    hashSet.add(Integer.valueOf(5));
                    break;
                default:
                    C15467a.m32149b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            zzr zzr = new zzr(hashSet, i, zzt, str, str2, str3);
            return zzr;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new C15468a(sb.toString(), parcel);
    }
}
