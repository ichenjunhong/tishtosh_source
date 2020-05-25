package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.location.p */
public final class C16897p implements Creator<zzal> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        ArrayList arrayList = null;
        String str = "";
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 1:
                    arrayList = C15467a.m32170u(parcel, a);
                    break;
                case 2:
                    pendingIntent = (PendingIntent) C15467a.m32145a(parcel, a, PendingIntent.CREATOR);
                    break;
                case 3:
                    str = C15467a.m32163n(parcel, a);
                    break;
                default:
                    C15467a.m32149b(parcel, a);
                    break;
            }
        }
        C15467a.m32173x(parcel, b);
        return new zzal(arrayList, pendingIntent, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzal[i];
    }
}
