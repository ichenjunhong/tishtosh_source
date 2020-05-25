package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;
import com.google.android.gms.common.internal.safeparcel.C15467a.C15468a;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.a */
public final class C15111a implements Creator<zzl> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzl[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        ArrayList arrayList = null;
        zzo zzo = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 1:
                    i = C15467a.m32154e(parcel, a);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case 2:
                    arrayList = C15467a.m32151c(parcel, a, zzr.CREATOR);
                    hashSet.add(Integer.valueOf(2));
                    break;
                case 3:
                    i2 = C15467a.m32154e(parcel, a);
                    hashSet.add(Integer.valueOf(3));
                    break;
                case 4:
                    zzo = (zzo) C15467a.m32145a(parcel, a, zzo.CREATOR);
                    hashSet.add(Integer.valueOf(4));
                    break;
                default:
                    C15467a.m32149b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            zzl zzl = new zzl(hashSet, i, arrayList, i2, zzo);
            return zzl;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new C15468a(sb.toString(), parcel);
    }
}
