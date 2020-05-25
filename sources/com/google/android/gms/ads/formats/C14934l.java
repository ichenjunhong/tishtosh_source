package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15467a;

/* renamed from: com.google.android.gms.ads.formats.l */
public final class C14934l implements Creator<PublisherAdViewOptions> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new PublisherAdViewOptions[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C15467a.m32148b(parcel);
        IBinder iBinder = null;
        boolean z = false;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < b) {
            int a = C15467a.m32143a(parcel);
            switch (C15467a.m32142a(a)) {
                case 1:
                    z = C15467a.m32152c(parcel, a);
                    break;
                case 2:
                    iBinder = C15467a.m32164o(parcel, a);
                    break;
                case 3:
                    iBinder2 = C15467a.m32164o(parcel, a);
                    break;
                default:
                    C15467a.m32149b(parcel, a);
                    break;
            }
        }
        C15467a.m32173x(parcel, b);
        return new PublisherAdViewOptions(z, iBinder, iBinder2);
    }
}
