package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;
import com.google.android.gms.common.internal.safeparcel.C15467a.C15468a;
import java.util.HashSet;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.d */
public final class C15114d implements Creator<zzt> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzt[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        HashSet hashSet = new HashSet();
        String str = null;
        byte[] bArr = null;
        PendingIntent pendingIntent = null;
        DeviceMetaData deviceMetaData = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 1:
                    i = C15467a.m32154e(parcel, a);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case 2:
                    str = C15467a.m32163n(parcel, a);
                    hashSet.add(Integer.valueOf(2));
                    break;
                case 3:
                    i2 = C15467a.m32154e(parcel, a);
                    hashSet.add(Integer.valueOf(3));
                    break;
                case 4:
                    bArr = C15467a.m32166q(parcel, a);
                    hashSet.add(Integer.valueOf(4));
                    break;
                case 5:
                    pendingIntent = (PendingIntent) C15467a.m32145a(parcel, a, PendingIntent.CREATOR);
                    hashSet.add(Integer.valueOf(5));
                    break;
                case 6:
                    deviceMetaData = (DeviceMetaData) C15467a.m32145a(parcel, a, DeviceMetaData.CREATOR);
                    hashSet.add(Integer.valueOf(6));
                    break;
                default:
                    C15467a.m32149b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            zzt zzt = new zzt(hashSet, i, str, i2, bArr, pendingIntent, deviceMetaData);
            return zzt;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new C15468a(sb.toString(), parcel);
    }
}
