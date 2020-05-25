package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.common.api.r */
public final class C15366r implements Creator<Status> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        int i = 0;
        String str = null;
        PendingIntent pendingIntent = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            int a2 = C15467a.m32142a(a);
            if (a2 != 1000) {
                switch (a2) {
                    case 1:
                        i2 = C15467a.m32154e(parcel, a);
                        break;
                    case 2:
                        str = C15467a.m32163n(parcel, a);
                        break;
                    case 3:
                        pendingIntent = (PendingIntent) C15467a.m32145a(parcel, a, PendingIntent.CREATOR);
                        break;
                    default:
                        C15467a.m32149b(parcel, a);
                        break;
                }
            } else {
                i = C15467a.m32154e(parcel, a);
            }
        }
        C15467a.m32173x(parcel, b);
        return new Status(i, i2, str, pendingIntent);
    }
}
